package springmvcDurgesh.controller;

import java.io.IOException;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import springmvcDurgesh.model.Student;
import springmvcDurgesh.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping(value ="/createNewStudent", method=RequestMethod.POST )
	public String createStudent(@ModelAttribute("student") Student student) {
		try {
			 studentService.createStudent(student);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "studentView";
	}
	
	@RequestMapping(value ="/deleteStudent", method=RequestMethod.POST )
	public String deleteStudent(@ModelAttribute("roll") int roll) {
		try {
			studentService.deleteStudent(roll);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "studentdeleteView";
	}
	
	@RequestMapping(value ="/updateStudent", method=RequestMethod.POST )
	public String updateStudent(@ModelAttribute("student") Student student) {
		try {
			studentService.updateStudent(student);
		}catch (Exception e) {
			e.printStackTrace();
		}
		return "studentupdateView";
	}
	@RequestMapping(value = "/showAllStudent", method=RequestMethod.GET)
	public ModelAndView listStudent(ModelAndView model) throws IOException {
		ModelAndView m=new ModelAndView();
		List<Student> listStd = studentService.stdList();
		m.addObject(listStd);
		m.setViewName("showAllStudent");
		System.out.println(listStd);
		return m;
		}

	@RequestMapping(value="/showStudent",method = RequestMethod.GET)
	public ModelAndView getStudentById(@PathParam("roll") int roll) {
		ModelAndView mv=new  ModelAndView();
		Student s=studentService.getStudent(roll);
		mv.addObject(s);
		mv.setViewName("showStudent");
		return mv;

	}
}
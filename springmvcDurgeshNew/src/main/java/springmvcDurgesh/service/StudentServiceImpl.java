package springmvcDurgesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvcDurgesh.dao.StudentDao;
import springmvcDurgesh.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao studentDao;

	@Override
	public void createStudent(Student student) {
		studentDao.createStudent(student);
	}

	@Override
	public void deleteStudent(int roll) {
		studentDao.deleteStudent(roll);

	}

	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);

	}

	@Override
	public List<Student> stdList() {
		return studentDao.showStudent();
	}

	@Override
	public Student getStudent(int roll) {
		return studentDao.getStudent(roll);
	}
	
	
}

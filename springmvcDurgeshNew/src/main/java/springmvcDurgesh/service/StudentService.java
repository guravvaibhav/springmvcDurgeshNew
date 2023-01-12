package springmvcDurgesh.service;

import java.util.List;

import springmvcDurgesh.model.Student;

public interface StudentService {
	public void createStudent(Student student);

	public void deleteStudent(int roll);

	public void updateStudent(Student student);


	public List<Student> stdList();

	public Student getStudent(int roll);
}

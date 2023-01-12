package springmvcDurgesh.dao;

import java.util.List;

import springmvcDurgesh.model.Student;

public interface StudentDao {
	public void createStudent(Student student);

	public void deleteStudent(int roll);

	public void updateStudent(Student student);

	public List<Student> showStudent();

	public Student getStudent(int roll);
}

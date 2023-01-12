package springmvcDurgesh.dao;


import springmvcDurgesh.model.Student;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void createStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(student);
		txn.commit();
	}

	@Override
	public void deleteStudent(int roll) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		Student student = session.get(Student.class, roll);
		session.delete(student);
		txn.commit();
		
	}

	@Override
	public void updateStudent(Student student) {
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		Student std = session.get(Student.class, student.getRoll());
		session.delete(std);
		session.save(student);
		txn.commit();
		
	}

	@Override
	public List<Student> showStudent() {
		HibernateTemplate ht=new HibernateTemplate(sessionFactory);
		List<Student> loadAll = ht.loadAll(Student.class);
		return loadAll;
	}

	@Override
	public Student getStudent(int roll) {
		Session session=sessionFactory.openSession();
		return session.get(Student.class, roll);
	}
}
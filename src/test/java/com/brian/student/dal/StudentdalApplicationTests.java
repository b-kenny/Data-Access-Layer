package com.brian.student.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.brian.student.dal.entities.Student;
import com.brian.student.dal.repos.StudentRepository;

//Below test will update the db in MYSQL

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		
		Student student = new Student();
		
		student.setName("John");
		student.setCourse("Java Web Services");
		student.setFee(30d);
		
		studentRepository.save(student);		
		
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> studentOptional = studentRepository.findById(1l);	
		
		if(studentOptional.isPresent()) {
			Student student = studentOptional.get();
			
			System.out.println(student);
		}else {
			System.out.println("studentOptional is null");
		}
				
	}
	
	@Test
	public void testUpdateStudent() {
		Optional<Student> studentOptional = studentRepository.findById(1l);
		
		if(studentOptional.isPresent()) {
			Student student = studentOptional.get();
			
			student.setFee(40d);
			studentRepository.save(student);
		}else {
			System.out.println("studentOptional is null");
		}		
		
	}

	@Test
	public void testDeleteStudent() {
		Student student = new Student();
		student.setId(1l);
		studentRepository.delete(student);
	}
}

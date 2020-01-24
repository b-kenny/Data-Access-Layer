package com.brian.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.brian.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}

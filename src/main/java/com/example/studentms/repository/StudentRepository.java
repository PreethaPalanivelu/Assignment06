package com.example.studentms.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.studentms.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>
{

}

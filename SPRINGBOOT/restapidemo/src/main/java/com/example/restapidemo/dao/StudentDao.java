package com.example.restapidemo.dao;

import com.example.restapidemo.entity.Student;

import java.util.List;

public interface StudentDao {
public void save(Student student);
public Student findBYId(int id);
public List<Student> findAll();
public Student  updateStudent(Student student);
public Student deleteStudent(int id);

}

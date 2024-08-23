package com.example.restapidemo.service;

import com.example.restapidemo.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;


public interface StudentService {
    public Student findBYId(int id);
    public List<Student> findAll();
    public void save(Student student);
    public Student  updateStudent(Student student);
    public Student deleteStudent(int id);

}

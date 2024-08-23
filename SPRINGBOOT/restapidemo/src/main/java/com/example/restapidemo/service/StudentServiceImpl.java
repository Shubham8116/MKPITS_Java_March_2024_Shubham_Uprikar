package com.example.restapidemo.service;

import com.example.restapidemo.dao.StudentDao;
import com.example.restapidemo.entity.Student;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    StudentDao studentDao;

    public StudentServiceImpl(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Student findBYId(int id) {
        return studentDao.findBYId(id);

    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    @Transactional
    public void save(Student student) {
        studentDao.save(student);
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return studentDao.updateStudent(student);

    }

    @Override
    @Transactional
    public Student deleteStudent(int id) {
       return studentDao.deleteStudent(id);
    }
}

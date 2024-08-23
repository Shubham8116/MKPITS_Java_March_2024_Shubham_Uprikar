package com.example.restapidemo.dao;

import com.example.restapidemo.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {
    private EntityManager entityManager;

    public StudentDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Student student) {
        entityManager.persist(student);

    }

    @Override
    public Student findBYId(int id) {
    return entityManager.find(Student.class,id);

    }

    @Override
    public List<Student> findAll() {
        TypedQuery typedQuery= entityManager.createQuery("from Student ",Student.class);
        return typedQuery.getResultList();
    }


    @Override

    public Student updateStudent(Student student) {
        entityManager.merge(student);
        return  student;
    }

    @Override
    public Student deleteStudent(int id) {
        Student student=entityManager.find(Student.class,id);
         entityManager.remove(student);
         return student;
    }
}

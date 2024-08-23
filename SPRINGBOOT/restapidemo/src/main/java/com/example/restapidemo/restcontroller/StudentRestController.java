package com.example.restapidemo.restcontroller;

import com.example.restapidemo.entity.Student;
import com.example.restapidemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class StudentRestController {
    StudentService studentService;

    @Autowired
    public StudentRestController(StudentService studentService) {
        this.studentService = studentService;
    }

   @GetMapping("/students/{id}")
    public Student findById(@PathVariable("id") int id)
   {
       return studentService.findBYId(id);
   }

   @GetMapping("/students")
    public List<Student> findAll()
   {
       return studentService.findAll();
   }
   @PostMapping("/students")
    public Student createStudent(@RequestBody Student student)
   {
       studentService.save(student);
       return  student;

   }

   @PutMapping("/students")
    public Student updateStudent(@RequestBody Student student)
   {
     return   studentService.updateStudent(student);
   }

   @DeleteMapping("/students/{id}")

       public Student deleteStudent(@PathVariable("id") int id)
   {
        return  studentService.deleteStudent(id);
   }



}

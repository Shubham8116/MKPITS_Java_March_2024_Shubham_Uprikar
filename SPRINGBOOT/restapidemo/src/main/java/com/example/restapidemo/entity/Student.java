package com.example.restapidemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
//@Table(name="student") this is optional, by default it takes class name as table name

//@Table(name="student") this is optional, by default it takes class name as table name
@NoArgsConstructor
@Data
public class Student {
    @Id //for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // it will crate column as id
    private  String firstName; // it will create column name as first_name varchar(45) default null
    private  String lastName;
    private  String email;

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}

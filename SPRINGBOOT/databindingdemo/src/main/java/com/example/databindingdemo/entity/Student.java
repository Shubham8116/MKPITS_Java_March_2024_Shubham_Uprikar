//Student entity to map form data to student data
package com.example.databindingdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Student {
    private String firstname;
    private String lastname;
}

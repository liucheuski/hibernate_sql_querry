package com.example.hibernate_sql_querry.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Developer {
    private int id;
    private String firstName;
    private String lastName;
    private String specialty;
    private int experience;
    private int salary;

    public Developer(String firstName, String lastName, String specialty, int experience, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.specialty = specialty;
        this.experience = experience;
        this.salary = salary;
    }
}
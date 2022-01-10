package com.baseapp;

import com.baseapp.model.Student;
import com.baseapp.service.UniversityServiceImpl;

import java.util.List;

public class MainApplication {

    public static void main(String[] args) {

        UniversityServiceImpl universityService = new UniversityServiceImpl();

        List<Student> students = universityService.getAvailableStudents();

        for (Student student : students) {
            System.out.println(student.getLastname() +
                    " " + student.getFirstname() +
                    " " + student.getAge() + " years old");
        }
    }
}


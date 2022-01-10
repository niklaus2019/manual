package com.baseapp.service;

import com.baseapp.model.Student;
import com.baseapp.repository.StudentRepository;
import com.baseapp.repository.StudentRepositoryImpl;

import java.util.List;

public class UniversityServiceImpl {
    StudentRepository studentRepository = new StudentRepositoryImpl();

    public List<Student> getAvailableStudents() {
        return studentRepository.getStudents();
    }

}

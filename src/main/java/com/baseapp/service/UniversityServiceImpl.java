package com.baseapp.service;

import com.baseapp.model.Student;
import com.baseapp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("universityService")
public class UniversityServiceImpl {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    public UniversityServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public UniversityServiceImpl() {
    }

    public List<Student> getAvailableStudents() {
        return studentRepository.getStudents();
    }

    @Autowired
    public void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }
}

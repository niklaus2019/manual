package com.baseapp;

import com.baseapp.model.Student;
import com.baseapp.service.UniversityServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MainApplication {

    public static void main(String[] args) {

        //UniversityServiceImpl universityService = new UniversityServiceImpl();
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

       UniversityServiceImpl universityService = applicationContext.getBean("universityService", UniversityServiceImpl.class);


        List<Student> students = universityService.getAvailableStudents();

        for (Student student : students) {
            System.out.println(student.getLastname() +
                    " " + student.getFirstname() +
                    " " + student.getAge() + " years old");
        }
    }
}


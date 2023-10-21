package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/students")
public class StudentController {

    @GetMapping
    public  List<Student> getStudents(){
        return List.of(
                new Student(
                        1L,
                        "Mugisha Yves",
                        "mugishayves189000@gmail.com",
                        LocalDate.of(2008, Month.SEPTEMBER,4),
                        16
                )
        );
    }
}

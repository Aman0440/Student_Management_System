package com.SringBoot.RESTAPIs.RestAPIs.controller;

import com.SringBoot.RESTAPIs.RestAPIs.dto.StudentDto;

import com.SringBoot.RESTAPIs.RestAPIs.entity.Studententity;
import com.SringBoot.RESTAPIs.RestAPIs.reposetory.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/student")
    public List<Studententity> getStudent() {
        return studentRepository.findAll();
    }

    @GetMapping("/student/{id}")
    public StudentDto getStudentById(@PathVariable Long id) {
        return new StudentDto(id, "Aman", "amanshaikh9156@gmail.com");
    }
}
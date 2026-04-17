package com.SringBoot.RESTAPIs.RestAPIs.controller;

import com.SringBoot.RESTAPIs.RestAPIs.dto.StudentDto;

import com.SringBoot.RESTAPIs.RestAPIs.entity.Studententity;
import com.SringBoot.RESTAPIs.RestAPIs.reposetory.StudentRepository;
import com.SringBoot.RESTAPIs.RestAPIs.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;



    @GetMapping("/students")
    public List<StudentDto> getAllStudent() {
        return  studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public StudentDto getStudentById(@PathVariable Long id) {
        return studentService.getStudendsById(id);
    }
}
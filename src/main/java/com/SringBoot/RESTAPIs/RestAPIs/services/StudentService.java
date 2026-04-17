package com.SringBoot.RESTAPIs.RestAPIs.services;

import com.SringBoot.RESTAPIs.RestAPIs.dto.StudentDto;
import com.SringBoot.RESTAPIs.RestAPIs.entity.Studententity;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();


    Studententity getStudendsById(Long id);
}

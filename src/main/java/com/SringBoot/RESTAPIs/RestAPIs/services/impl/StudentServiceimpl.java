package com.SringBoot.RESTAPIs.RestAPIs.services.impl;

import com.SringBoot.RESTAPIs.RestAPIs.dto.StudentDto;
import com.SringBoot.RESTAPIs.RestAPIs.entity.Studententity;
import com.SringBoot.RESTAPIs.RestAPIs.reposetory.StudentRepository;
import com.SringBoot.RESTAPIs.RestAPIs.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.security.cert.Extension;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceimpl implements StudentService {

    private final StudentRepository studentRepository;


    @Override
    public List<StudentDto> getAllStudents(){
        List<Studententity> students =studentRepository.findAll();
        Extension student;
        List<StudentDto> studentDtoList= students
                .stream()
                .map( Students -> new StudentDto( Students.getId() , Students.getName(), Students.getEmail()))
                .toList();

//        for(StudentDto student : students){
//            StudentDto studentDtoList = new StudentDto(student.getID(), student.getName(),student.getEmail())
//        }
        return studentDtoList;
    }

    @Override
    public Studententity getStudendsById(Long id) {
       Studententity student =studentRepository.findById(id).orElseThrow(()->new IllegalArgumentException("Student not found with Id :" + id));
        return student;
    }

}

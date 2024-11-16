package com.library.controllers;

import com.library.dtos.CreateStudentRequest;
import com.library.models.Student;
import com.library.services.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/student")
    public void createStudent(@RequestBody @Valid CreateStudentRequest studentRequest){
        studentService.create(studentRequest.to());

    }
    @GetMapping("/student")
    public Student findStudent(@RequestParam("id") int studentId){
        return studentService.find(studentId);
    }
    @DeleteMapping("/student")
    public void deleteStudent(@RequestParam("id") int studentId) {
        studentService.delete(studentId);
    }
//    @PutMapping("/student")
//    public void updateStudent(@RequestBody UpdateStudentRequest studentRequest) {
//        studentService.update(studentRequest.to());
//    }




}

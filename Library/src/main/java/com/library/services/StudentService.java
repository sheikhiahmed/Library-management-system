package com.library.services;

import com.library.models.Student;
import com.library.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    // create student in database.
    public void create(Student student) {
        studentRepository.save(student);
    }
 // if the student is present return or else null.
    public Student find(int studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    public void delete(int studentId) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + studentId));
        studentRepository.delete(student);
    }
    public void update(Student updatedStudent) {
//        Student existingStudent = studentRepository.findById(updatedStudent.getId())
//                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + updatedStudent.getId()));
//
//        existingStudent.setName(updatedStudent.getName());
//        existingStudent.setEmail(updatedStudent.getEmail());
//        existingStudent.setAge(updatedStudent.getAge());
//        // Set other fields as needed...
//
//        studentRepository.save(existingStudent);
    }



}

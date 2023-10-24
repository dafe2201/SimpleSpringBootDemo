package com.studentPortal.demo.service;

import com.studentPortal.demo.entity.Student;
import com.studentPortal.demo.entity.StudentDto;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student createStudent(StudentDto studentDto);

    Student updateStudent(Long id, StudentDto studentDto);
}

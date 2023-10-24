package com.studentPortal.demo.service.impl;

import com.studentPortal.demo.entity.Student;
import com.studentPortal.demo.entity.StudentDto;
import com.studentPortal.demo.repository.StudentRepository;
import com.studentPortal.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student createStudent(StudentDto studentDto) {
        Student student = new Student();

        student.setName(studentDto.getName());
        student.setEmail(studentDto.getEmail());
        student.setDob(studentDto.getDob());

         return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, StudentDto studentDto) {

       Optional<Student> studentToUpdate = studentRepository.findById(id);

       if (studentToUpdate.isPresent()) {
           Student student = studentToUpdate.get();
           studentRepository.save(student);
       }
       return null;
    }


}

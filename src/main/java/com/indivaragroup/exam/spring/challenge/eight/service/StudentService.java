package com.indivaragroup.exam.spring.challenge.eight.service;

import com.indivaragroup.exam.spring.challenge.eight.model.Student;
import com.indivaragroup.exam.spring.challenge.eight.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudent(int id) {
        return studentRepository.findById(id);
    }

    public void printAllStudents() {
        System.out.println("CHALLENGE 8 = ");

        List<Student> allStudents = studentRepository.findAll();

        for (Student student : allStudents) {
            System.out.println(student.getId() + " - " + student.getName());
        }
    }
}

package com.indivaragroup.exam.spring.challenge.eight.repository;

import com.indivaragroup.exam.spring.challenge.eight.model.Student;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    private final List<Student> students = new ArrayList<>();

    public void save(Student student) {
        students.add(student);
    }

    public Student findById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public List<Student> findAll() {
        return students;
    }
}

package com.app.app1.Service;

import com.app.app1.Entity.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Integer id);
    Student updateStudent(Student student, int id);
    void deleteStudent(int id);
}

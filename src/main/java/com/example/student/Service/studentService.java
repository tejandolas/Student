package com.example.student.Service;

import com.example.student.Entity.Student;

import java.util.List;
import java.util.Optional;

public interface studentService {
    //save new student
    void saveStudent(Student student);

    //fetch all students
    List<Student> fetchStudentList();

    //fetch specific student
    Optional<Student> fetchById(Long id);

    //update a specific student id
    void updateById(Student student, Long id);

    //delete student by id
    void deleteStudent(Long id);


}

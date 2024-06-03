package com.example.student.Service;

import com.example.student.Entity.Student;
import com.example.student.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements studentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);

    }

    @Override
    public List<Student> fetchStudentList() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Optional<Student> fetchById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public void updateById(Student student, Long id) {
       studentRepository.save(student);



    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}

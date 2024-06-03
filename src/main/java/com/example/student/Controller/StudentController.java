package com.example.student.Controller;


import com.example.student.Entity.Response;
import com.example.student.Entity.Student;
import com.example.student.Service.StudentServiceImpl;
import com.example.student.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private Response response;

    @PostMapping("/addStudent")
    public Response saveStudent(@RequestBody Student student){
        try {
            studentService.saveStudent(student);
            response.setResult("Successfully added");
            return response;
        }catch (Exception e){
            response.setResult("Not able to add successfully");
            return response;
        }
    }
    @GetMapping("/getAllStudent")
    public List<Student> getStudents(){
        return studentService.fetchStudentList();
    }

    @DeleteMapping("/deletebyId/{id}")
    public Response deleteById(@PathVariable("id") Long studentId){
        try{
            studentService.deleteStudent(studentId);
            response.setResult("Deleted Student with id :"+ studentId);
            return response;
        }
        catch(Exception e){
            response.setResult("Problem deleting record with id: " + studentId);
            return response;
        }
    }
}

package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @PostMapping("/delete")
    public void deleteStudent(@RequestParam int id) {
        studentService.deleteStudentId(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudent() {
        return studentService.allStudents();
    }

}

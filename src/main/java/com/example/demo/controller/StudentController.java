package com.example.demo.controller;

import com.example.demo.dto.AddStudentsRequestDto;
import com.example.demo.dto.AllStudentsResponseDto;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping
    public void saveStudent(@RequestBody AddStudentsRequestDto studentsRequestDto) {
        studentService.saveStudent(studentsRequestDto);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudentId(id);
    }

    @GetMapping
    public List<AllStudentsResponseDto> getAllStudent() {
        return studentService.allStudents();
    }

}

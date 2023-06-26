package com.example.demo.service;

import com.example.demo.dto.AddStudentsRequestDto;
import com.example.demo.dto.AllStudentsResponseDto;
import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    public void saveStudent(AddStudentsRequestDto studentsRequestDto);

    public void deleteStudentId(int id);

    public List<AllStudentsResponseDto> allStudents();
}

package com.example.demo.service;

import com.example.demo.dto.AddStudentsRequestDto;
import com.example.demo.dto.AllStudentsResponseDto;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public void saveStudent(AddStudentsRequestDto studentsRequestDto) {
        Student student = new Student(studentsRequestDto.getName(), studentsRequestDto.getSurname());
        studentRepository.save(student);
    }

    @Override
    public void deleteStudentId(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<AllStudentsResponseDto> allStudents() {
        return studentRepository.findAll().
                stream().
                map(StudentServiceImpl::allStudentsResponseDto)
                .collect(Collectors.toList());
    }

    private static AllStudentsResponseDto allStudentsResponseDto(Student student) {
        AllStudentsResponseDto studentsResponseDto = new AllStudentsResponseDto();
        studentsResponseDto.setId(student.getId());
        studentsResponseDto.setName(student.getName());
        studentsResponseDto.setSurname(studentsResponseDto.getSurname());
        return studentsResponseDto;
    }
}

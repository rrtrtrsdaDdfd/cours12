package com.example.demo.dto;

import com.example.demo.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class AddGroupsRequestDto {

    private String name;
    private List<Student> students;


}

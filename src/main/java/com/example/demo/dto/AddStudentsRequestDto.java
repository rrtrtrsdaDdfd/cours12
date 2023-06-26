package com.example.demo.dto;

import com.example.demo.entity.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class AddStudentsRequestDto {
    private String name;
    private String surname;
    private int group_id;


}

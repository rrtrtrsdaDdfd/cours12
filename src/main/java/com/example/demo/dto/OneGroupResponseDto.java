package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class OneGroupResponseDto {
    private int id;
    private String name;
    private int quantity;

}

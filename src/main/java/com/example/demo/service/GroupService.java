package com.example.demo.service;

import com.example.demo.dto.AddGroupsRequestDto;
import com.example.demo.dto.AllGroupsResponseDto;
import com.example.demo.entity.Group;
import com.example.demo.entity.Student;

import java.util.List;

public interface GroupService {
    void saveGroup(AddGroupsRequestDto groupsRequestDto);

     List<AllGroupsResponseDto> getAllGroup();


}

package com.example.demo.controller;

import com.example.demo.dto.AddGroupsRequestDto;
import com.example.demo.dto.AllGroupsResponseDto;
import com.example.demo.entity.Group;
import com.example.demo.service.GroupService;
import com.example.demo.service.GroupServiceImpl;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/groups")
@RequiredArgsConstructor
public class GroupController {
    private final GroupService groupService;

    @PostMapping
    public void saveGroup(@RequestBody AddGroupsRequestDto groupsRequestDto) {
        groupService.saveGroup(groupsRequestDto);
    }

    @GetMapping
    public List<AllGroupsResponseDto> getAllGroup() {
        return groupService.getAllGroup();
    }

}

package com.example.demo.controller;

import com.example.demo.entity.Group;
import com.example.demo.service.GroupService;
import com.example.demo.service.GroupServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @PostMapping("/add")
    public void saveGroup(@RequestBody Group group) {
        groupService.saveGroup(group);
    }

    @GetMapping("/all")
    public List<Group> getAllGroup() {
        return groupService.getAllGroup();
    }

}

package com.example.demo.service;

import com.example.demo.entity.Group;
import com.example.demo.entity.Student;

import java.util.List;

public interface GroupService {
    public void saveGroup(Group group);

    public List<Group> getAllGroup();
}

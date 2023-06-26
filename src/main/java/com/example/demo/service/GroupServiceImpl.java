package com.example.demo.service;

import com.example.demo.entity.Group;
import com.example.demo.entity.Student;
import com.example.demo.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepository groupRepository;

    public void saveGroup(Group group) {
        groupRepository.save(group);
    }

    @Override
    public List<Group> getAllGroup() {
        return groupRepository.findAll();
    }

}

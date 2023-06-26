package com.example.demo.service;

import com.example.demo.dto.AddGroupsRequestDto;
import com.example.demo.dto.AllGroupsResponseDto;
import com.example.demo.entity.Group;
import com.example.demo.entity.Student;
import com.example.demo.repository.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    public void saveGroup(AddGroupsRequestDto groupsRequestDto) {

        groupRepository.save(addGroup(groupsRequestDto));
    }

    @Override
    public List<AllGroupsResponseDto> getAllGroup() {
        return groupRepository.findAll().
                stream()
                .map(GroupServiceImpl::getAllGroupsResponseDto)
                .collect(Collectors.toList());
    }


    public static AllGroupsResponseDto getAllGroupsResponseDto(Group group) {
        System.out.println(group.getStudents().size());
        AllGroupsResponseDto allGroupsResponseDto = new AllGroupsResponseDto();
        allGroupsResponseDto.setId(group.getId());
        allGroupsResponseDto.setName(group.getName());
        allGroupsResponseDto.setQuantity(group.getStudents().size());
        return allGroupsResponseDto;
    }

    private static Group addGroup(AddGroupsRequestDto groupsRequestDto) {
        Group group = new Group();
        if (groupsRequestDto.getStudents() == null) {
            group.setName(groupsRequestDto.getName());
        } else {
            group.setName(groupsRequestDto.getName());
            group.setStudents(groupsRequestDto.getStudents());

        }
        System.out.println(group.getStudents().size());
        return group;
    }
}

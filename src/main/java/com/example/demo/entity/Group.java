package com.example.demo.entity;

import com.example.demo.entity.Student;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "un_groups")
@Getter
@Setter
@AllArgsConstructor
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "group", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Student> students;

    public Group() {
    }

    public Group(String name, List<Student> students) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public Group(String name) {
        this.name = name;
    }



}

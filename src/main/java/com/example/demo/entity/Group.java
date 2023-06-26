package com.example.demo.entity;

import com.example.demo.entity.Student;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "group1")
@Getter
@Setter
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @OneToMany(mappedBy = "group", cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Student> students;

    public Group() {
    }

    public Group(String name) {
        this.name = name;
    }

    public void addStudents(Student student) {
        if (students == null) {
            students = new ArrayList<Student>();
        }
        students.add(student);
        student.setGroup(this);
    }


}

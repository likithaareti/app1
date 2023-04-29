package com.app.app1.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private int score;
    @Column
    private int age;
    @Column(nullable = false)
    private String name;
}

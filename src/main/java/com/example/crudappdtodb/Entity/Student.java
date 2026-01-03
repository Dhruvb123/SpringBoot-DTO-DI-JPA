package com.example.crudappdtodb.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private double score;

    // DB-only fields (not exposed via DTO)
    private boolean active = true;

    public Long getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public double getScore() { return score; }
    public boolean isActive() { return active; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setScore(double score) { this.score = score; }
    public void setActive(boolean active) { this.active = active; }
}

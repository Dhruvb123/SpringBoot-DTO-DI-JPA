package com.example.crudappdtodb.DTO;

public class StudentDTO {

    private Long id;
    private String name;
    private Integer age;
    private Double score;

    public Long getId() { return id; }
    public String getName() { return name; }
    public Integer getAge() { return age; }
    public Double getScore() { return score; }

    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(Integer age) { this.age = age; }
    public void setScore(Double score) { this.score = score; }
}


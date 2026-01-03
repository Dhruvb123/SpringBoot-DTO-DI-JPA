package com.example.crudappdtodb.Mapper;

import com.example.crudappdtodb.DTO.StudentDTO;
import com.example.crudappdtodb.Entity.Student;

public class StudentMapper {

    public static Student toEntity(StudentDTO dto) {
        Student s = new Student();
        s.setName(dto.getName());
        s.setAge(dto.getAge());
        s.setScore(dto.getScore());
        return s;
    }

    public static StudentDTO toDTO(Student s) {
        StudentDTO dto = new StudentDTO();
        dto.setId(s.getId());
        dto.setName(s.getName());
        dto.setAge(s.getAge());
        dto.setScore(s.getScore());
        return dto;
    }
}

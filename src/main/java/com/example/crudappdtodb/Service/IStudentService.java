package com.example.crudappdtodb.Service;

import com.example.crudappdtodb.DTO.StudentDTO;

import java.util.List;

public interface IStudentService {

    StudentDTO create(StudentDTO dto);

    StudentDTO getById(Long id);

    List<StudentDTO> getAll();

    StudentDTO update(Long id, StudentDTO dto);

    StudentDTO patch(Long id, StudentDTO dto);

    void delete(Long id);
}

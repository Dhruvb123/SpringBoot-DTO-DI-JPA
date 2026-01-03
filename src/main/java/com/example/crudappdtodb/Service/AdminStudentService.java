package com.example.crudappdtodb.Service;

import com.example.crudappdtodb.DTO.StudentDTO;
import com.example.crudappdtodb.Entity.Student;
import com.example.crudappdtodb.Mapper.StudentMapper;
import com.example.crudappdtodb.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Qualifier("admin")
public class AdminStudentService implements IStudentService{
    private final StudentRepository repository;

    public AdminStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public StudentDTO create(StudentDTO dto) {
        Student s = StudentMapper.toEntity(dto);
        return StudentMapper.toDTO(repository.save(s));
    }

    @Override
    public StudentDTO getById(Long id) {
        return repository.findById(id)
                .map(StudentMapper::toDTO)
                .orElseThrow();
    }

    @Override
    public List<StudentDTO> getAll() {
        return repository.findAll().stream()
                .map(StudentMapper::toDTO)
                .toList();
    }

    @Override
    public StudentDTO update(Long id, StudentDTO dto) {
        Student s = repository.findById(id).orElseThrow();
        s.setName(dto.getName());
        s.setAge(dto.getAge());
        s.setScore(dto.getScore());
        return StudentMapper.toDTO(repository.save(s));
    }

    @Override
    public StudentDTO patch(Long id, StudentDTO dto) {
        Student s = repository.findById(id).orElseThrow();

        if (dto.getName() != null) s.setName(dto.getName());
        if (dto.getAge() != null) s.setAge(dto.getAge());
        if (dto.getScore() != null) s.setScore(dto.getScore());

        return StudentMapper.toDTO(repository.save(s));
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}

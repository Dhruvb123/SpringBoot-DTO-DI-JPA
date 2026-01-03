package com.example.crudappdtodb.Service;

import com.example.crudappdtodb.DTO.StudentDTO;
import com.example.crudappdtodb.Mapper.StudentMapper;
import com.example.crudappdtodb.Repository.StudentRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class PublicStudentService implements IStudentService {
    private final StudentRepository repository;

    public PublicStudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public StudentDTO create(StudentDTO dto) {
        throw new UnsupportedOperationException();
    }

    public StudentDTO getById(Long id) {
        return repository.findById(id)
                .map(StudentMapper::toDTO)
                .orElseThrow();
    }

    public List<StudentDTO> getAll() {
        return repository.findAll().stream()
                .map(StudentMapper::toDTO)
                .toList();
    }

    public StudentDTO update(Long id, StudentDTO dto) {
        throw new UnsupportedOperationException();
    }

    public StudentDTO patch(Long id, StudentDTO dto) {
        throw new UnsupportedOperationException();
    }

    public void delete(Long ide) {
        throw new UnsupportedOperationException();
    }
}

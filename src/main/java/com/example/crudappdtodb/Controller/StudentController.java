package com.example.crudappdtodb.Controller;

import com.example.crudappdtodb.DTO.StudentDTO;
import com.example.crudappdtodb.Service.PublicStudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/public/students")
public class StudentController {
    private final PublicStudentService service;

    public StudentController(PublicStudentService service) {
        this.service = service;
    }

    @GetMapping
    public List<StudentDTO> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public StudentDTO getById(@PathVariable Long id) {
        return service.getById(id);
    }
}

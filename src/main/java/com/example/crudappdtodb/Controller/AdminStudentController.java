package com.example.crudappdtodb.Controller;

import com.example.crudappdtodb.DTO.StudentDTO;
import com.example.crudappdtodb.Service.AdminStudentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/students")
public class AdminStudentController {

    private final AdminStudentService service;

    public AdminStudentController(
            @Qualifier("admin") AdminStudentService service) {
        this.service = service;
    }

    @PostMapping
    public StudentDTO create(@RequestBody StudentDTO dto) {
        return service.create(dto);
    }

    @GetMapping
    public List<StudentDTO> getAll() {
        return service.getAll();
    }

    @PutMapping("/{id}")
    public StudentDTO update(@PathVariable Long id, @RequestBody StudentDTO dto) {
        return service.update(id, dto);
    }

    @PatchMapping("/{id}")
    public StudentDTO patch(@PathVariable Long id, @RequestBody StudentDTO dto) {
        return service.patch(id, dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

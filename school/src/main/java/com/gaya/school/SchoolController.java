package com.gaya.school;

import com.gaya.school.model.dto.SchoolWithStudentsDto;
import com.gaya.school.model.core.School;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody School school) {
        service.save(school);
    }

    @GetMapping
    public ResponseEntity<List<School>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/with-students/{schoolId}")
    public ResponseEntity<SchoolWithStudentsDto> findAllWithStudents(@PathVariable Integer schoolId) {
        return ResponseEntity.ok(service.findAllWithStudents(schoolId));
    }
}

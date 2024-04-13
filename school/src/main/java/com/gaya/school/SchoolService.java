package com.gaya.school;

import com.gaya.school.client.StudentClient;
import com.gaya.school.model.dto.SchoolWithStudentsDto;
import com.gaya.school.model.core.School;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    private final SchoolRepository repository;
    private final StudentClient client;

    public void save(School school) {
        repository.save(school);
    }

    public List<School> findAll() {
        return repository.findAll();
    }

    public SchoolWithStudentsDto findAllWithStudents(Integer schoolId) {
        if(repository.findById(schoolId).isEmpty()) return null;

        var school = repository.findById(schoolId).get();

        // find all the students from the student microservice.
        var students = client.findAllBySchoolId(schoolId);

        return SchoolWithStudentsDto.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}

package com.gaya.school.model.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SchoolWithStudentsDto {
    private String name;

    private String email;

    List<StudentDto> students;
}

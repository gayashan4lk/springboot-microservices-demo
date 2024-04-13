package com.gaya.school.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {
    private String firstName;

    private String lastName;

    private String email;

    private Integer schoolId;
}

package com.gaya.school;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String firstName;

    private String lastName;

    private String email;

    private Integer schoolId;
}

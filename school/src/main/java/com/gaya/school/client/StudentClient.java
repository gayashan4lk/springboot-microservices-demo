package com.gaya.school.client;

import com.gaya.school.model.dto.StudentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Student-service", url="${application.config.student-url}")
public interface StudentClient {

    @GetMapping("/school/{schoolId}")
    List<StudentDto> findAllBySchoolId(@PathVariable("schoolId") Integer schoolId);
}

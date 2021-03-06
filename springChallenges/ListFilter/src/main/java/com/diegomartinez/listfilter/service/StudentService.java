package com.diegomartinez.listfilter.service;

import com.diegomartinez.listfilter.dto.StudentDTO;

public interface StudentService {
    StudentDTO addStudent(StudentDTO studentDTO);
    StudentDTO getStudent(Long id);
    String deleteStudent(Long id);
}

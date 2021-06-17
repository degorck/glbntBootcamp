package com.diegomartinez.listfilter.service.impl;

import com.diegomartinez.listfilter.dao.StudentDAO;
import com.diegomartinez.listfilter.dto.StudentDTO;
import com.diegomartinez.listfilter.mapper.StudentMapper;
import com.diegomartinez.listfilter.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentDAO studentDAO;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public StudentDTO addStudent(StudentDTO studentDTO) {
        return studentMapper.StudentToStudentDTO(studentDAO.save(studentMapper.StudentDTOtoStudent(studentDTO)));
    }
}

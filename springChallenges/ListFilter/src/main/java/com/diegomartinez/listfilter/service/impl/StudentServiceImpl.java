package com.diegomartinez.listfilter.service.impl;

import com.diegomartinez.listfilter.dao.StudentDAO;
import com.diegomartinez.listfilter.dto.StudentDTO;
import com.diegomartinez.listfilter.entity.Student;
import com.diegomartinez.listfilter.mapper.StudentMapper;

import static com.diegomartinez.listfilter.utils.Constants.BLANK_SPACE;
import static com.diegomartinez.listfilter.utils.Constants.DELETED;
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

    @Override
    public StudentDTO getStudent(Long id) {
        return studentMapper.StudentToStudentDTO(studentDAO.getById(id));
    }

    @Override
    public String deleteStudent(Long id) {
         studentDAO.deleteById(id);
         return String.valueOf(id).concat(BLANK_SPACE).concat(DELETED);
    }

}


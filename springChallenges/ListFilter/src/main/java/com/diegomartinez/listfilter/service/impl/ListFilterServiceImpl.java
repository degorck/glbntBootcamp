package com.diegomartinez.listfilter.service.impl;

import com.diegomartinez.listfilter.dao.StudentDAO;
import com.diegomartinez.listfilter.dto.FilterDTO;
import com.diegomartinez.listfilter.dto.StudentDTO;
import com.diegomartinez.listfilter.entity.Student;
import com.diegomartinez.listfilter.mapper.StudentMapper;
import com.diegomartinez.listfilter.service.ListFilterService;
import com.diegomartinez.listfilter.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ListFilterServiceImpl implements ListFilterService {
    @Autowired
    StudentDAO studentDAO;

    @Autowired
    StudentMapper studentMapper;

    @Override
    public List<StudentDTO> getList(FilterDTO filterDTO) {
        List<Student> studentList= studentDAO.findAll();
        List<StudentDTO> studentDTOList = new ArrayList<>();
        for (Student student: studentList) {
            studentDTOList.add(studentMapper.StudentToStudentDTO(student));
        }
        List<StudentDTO> filteredList = new ArrayList<>();
        switch (filterDTO.getFilterType()){
            case "name":
                List<StudentDTO> filteredListName = studentDTOList
                        .stream()
                        .filter(S -> S.getName().contains(filterDTO.getValue()))
                        .collect(Collectors.toList());
                filteredList=filteredListName;
                break;
            case "age":
                List<StudentDTO> filteredListAge = studentDTOList
                        .stream()
                        .filter(S -> S.getAge().contains(filterDTO.getValue()))
                        .collect(Collectors.toList());
                filteredList=filteredListAge;
                break;
            case "id":
                List<StudentDTO> filteredListId = studentDTOList
                        .stream()
                        .filter(S -> S.getId() == Long.valueOf(filterDTO.getValue()))
                        .collect(Collectors.toList());
                filteredList=filteredListId;
                break;
        }
        return filteredList;
    }

}

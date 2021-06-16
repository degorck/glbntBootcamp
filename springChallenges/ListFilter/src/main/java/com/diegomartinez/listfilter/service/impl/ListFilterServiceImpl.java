package com.diegomartinez.listfilter.service.impl;

import com.diegomartinez.listfilter.dto.FilterDTO;
import com.diegomartinez.listfilter.dto.StudentDTO;
import com.diegomartinez.listfilter.service.ListFilterService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ListFilterServiceImpl implements ListFilterService {
    @Override
    public List<StudentDTO> getList(FilterDTO filterDTO) {
        List<StudentDTO> studentList = new ArrayList<>();
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setName("Diego");
        studentDTO.setAge("27");
        studentDTO.setId("74502");
        StudentDTO studentDTO1 = new StudentDTO();
        studentDTO1.setName("Jose");
        studentDTO1.setAge("26");
        studentDTO1.setId("76647");
        StudentDTO studentDTO2 = new StudentDTO();
        studentDTO2.setName("Pedro");
        studentDTO2.setAge("32");
        studentDTO2.setId("70403");
        studentList.add(studentDTO);
        studentList.add(studentDTO1);
        studentList.add(studentDTO2);
        List<StudentDTO> filteredList = new ArrayList<>();
        switch (filterDTO.getFilterType()){
            case "name":
                List<StudentDTO> filteredListName = studentList
                        .stream()
                        .filter(S -> S.getName().contains(filterDTO.getValue()))
                        .collect(Collectors.toList());
                filteredList=filteredListName;
                break;
            case "age":
                List<StudentDTO> filteredListAge = studentList
                        .stream()
                        .filter(S -> S.getAge().contains(filterDTO.getValue()))
                        .collect(Collectors.toList());
                filteredList=filteredListAge;
                break;
            case "id":
                List<StudentDTO> filteredListId = studentList
                        .stream()
                        .filter(S -> S.getId().contains(filterDTO.getValue()))
                        .collect(Collectors.toList());
                filteredList=filteredListId;
                break;
        }

        return filteredList;
    }

}

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
       return null;
    }

}

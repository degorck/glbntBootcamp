package com.diegomartinez.listfilter.service;

import com.diegomartinez.listfilter.dto.FilterDTO;
import com.diegomartinez.listfilter.dto.StudentDTO;

import java.util.List;

public interface ListFilterService {
    List<StudentDTO> getList(FilterDTO filterDTO);
}

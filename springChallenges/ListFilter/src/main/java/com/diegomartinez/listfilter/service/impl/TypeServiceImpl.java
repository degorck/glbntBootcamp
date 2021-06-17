package com.diegomartinez.listfilter.service.impl;

import com.diegomartinez.listfilter.dao.TypeDAO;
import com.diegomartinez.listfilter.dto.TypeDTO;
import com.diegomartinez.listfilter.mapper.TypeMapper;
import com.diegomartinez.listfilter.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeDAO typeDAO;

    @Autowired
    TypeMapper typeMapper;

    @Override
    public TypeDTO addType(TypeDTO typeDTO) {
        return typeMapper.TypeToTypeDTO(typeDAO.save(typeMapper.TypeDTOtoType(typeDTO)));
    }
}

package com.diegomartinez.listfilter.mapper;

import com.diegomartinez.listfilter.dto.TypeDTO;
import com.diegomartinez.listfilter.entity.Type;
import org.springframework.stereotype.Component;

@Component
public class TypeMapper {
    public Type TypeDTOtoType(TypeDTO typeDTO){
        Type type = new Type();
        type.setId(typeDTO.getId());
        type.setName(typeDTO.getName());
        return type;
    }

    public TypeDTO TypeToTypeDTO(Type type){
        return TypeDTO.builder()
                .id(type.getId())
                .name(type.getName())
                .build();
    }
}

package com.diegomartinez.listfilter.controller;

import com.diegomartinez.listfilter.dto.ResponseDTO;
import com.diegomartinez.listfilter.dto.TypeDTO;
import com.diegomartinez.listfilter.service.TypeService;
import com.diegomartinez.listfilter.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "types")
public class TypeController {
    @Autowired
    TypeService typeService;

    @PutMapping
    public ResponseEntity<ResponseDTO<TypeDTO>> addType(@RequestBody TypeDTO typeDTO){
        ResponseDTO<TypeDTO> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), typeService.addType(typeDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }

}

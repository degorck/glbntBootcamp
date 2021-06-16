package com.diegomartinez.listfilter.controller;

import com.diegomartinez.listfilter.dto.FilterDTO;
import com.diegomartinez.listfilter.dto.ResponseDTO;
import com.diegomartinez.listfilter.dto.StudentDTO;
import com.diegomartinez.listfilter.service.ListFilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListFilterController {
    @Autowired
    ListFilterService listFilterService;
    @PostMapping(value = "list/filter")
    public ResponseEntity<ResponseDTO<String>> numbersCalc (@RequestBody FilterDTO filter){
        try {
            ResponseDTO<FilterDTO> responseDTO = new ResponseDTO("Ok", listFilterService.getList(filter));
            return new ResponseEntity(responseDTO, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity("Not accepted", HttpStatus.NOT_ACCEPTABLE);
        }

    }
}

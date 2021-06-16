package com.diegomartinez.commanumbers.controller;

import com.diegomartinez.commanumbers.dto.ResponseDTO;
import com.diegomartinez.commanumbers.utils.Constants;
import com.diegomartinez.commanumbers.service.CommaNumbersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class CommaNumbersController {
    @Autowired
    CommaNumbersService commaNumbersService;

    @PostMapping(value = "numbers", consumes = (MediaType.MULTIPART_FORM_DATA_VALUE), produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDTO<String>> numbersCalc (@RequestBody MultipartFile file){
        try{
            ResponseDTO<String> responseDTO = new ResponseDTO (Constants.CALC, commaNumbersService.numbersCalc(file));
            return new ResponseEntity(responseDTO, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity(Constants.WRONG, HttpStatus.NOT_ACCEPTABLE);
        }

    }
}

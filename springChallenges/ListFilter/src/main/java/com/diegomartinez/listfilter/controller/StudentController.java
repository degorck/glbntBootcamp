package com.diegomartinez.listfilter.controller;

import com.diegomartinez.listfilter.dto.ResponseDTO;
import com.diegomartinez.listfilter.dto.StudentDTO;
import com.diegomartinez.listfilter.service.StudentService;
import com.diegomartinez.listfilter.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PutMapping
    public ResponseEntity<ResponseDTO<StudentDTO>> addStudent(@RequestBody StudentDTO studentDTO){
        ResponseDTO<StudentDTO> responseDTO = new ResponseDTO(Constants.ResponseConstant.SUCCESS.getDescription(), studentService.addStudent(studentDTO));
        return new ResponseEntity<>(responseDTO, HttpStatus.OK);
    }
}

package com.diegomartinez.commanumbers.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface CommaNumbersService {
   String numbersCalc(MultipartFile file) throws IOException;
}

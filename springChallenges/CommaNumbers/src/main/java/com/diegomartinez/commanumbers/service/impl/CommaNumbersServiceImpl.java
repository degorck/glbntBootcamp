package com.diegomartinez.commanumbers.service.impl;

import com.diegomartinez.commanumbers.service.CommaNumbersService;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.diegomartinez.commanumbers.utils.Constants.*;

@Service
public class CommaNumbersServiceImpl implements CommaNumbersService {

    @Override
    public String numbersCalc(MultipartFile file) throws IOException {
        String numbersFile =  new String(file.getBytes(), StandardCharsets.UTF_8);
        String [] numbersOutput = numbersFile.split(COMMA);
        List<Double> numberList = new ArrayList<>();
        for (String s : numbersOutput){
            numberList.add(Double.parseDouble(s));
        }

        double min = numberList.stream().max(Comparator.naturalOrder()).get();
        double max = numberList.stream().min(Comparator.naturalOrder()).get();
        double sum = 0;
        for (double d : numberList){
            sum = sum + d;
        }
        double avg = sum/numberList.size();
        String sMin = String.valueOf(min);
        String sMax = String.valueOf(max);
        String sAvg = String.valueOf(avg);
        String sSum = String.valueOf(sum);

        return MAX.concat(sMax).concat(COMMA).concat(BLANK_SPACE).concat(MIN).concat(sMin).concat(COMMA).concat(BLANK_SPACE).concat(AVG).concat(sAvg).concat(COMMA).concat(BLANK_SPACE).concat(SUM).concat(sSum);
    }
}




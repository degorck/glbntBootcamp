package com.diegomartinez.listfilter.dto;

import com.diegomartinez.listfilter.entity.Type;
import lombok.*;


@Getter
@Setter
@Builder

public class StudentDTO {
    private long id;
    private String name;
    private String age;
    private String lastName;
    private String email;
    private long type;
}

package com.diegomartinez.listfilter.dto;

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
    private String type;
}

package com.diegomartinez.listfilter.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="age")
    private String age;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;
}

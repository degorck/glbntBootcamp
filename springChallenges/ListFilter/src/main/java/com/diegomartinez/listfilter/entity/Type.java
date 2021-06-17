package com.diegomartinez.listfilter.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "types")
public class Type {
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private List<Student> student;
}

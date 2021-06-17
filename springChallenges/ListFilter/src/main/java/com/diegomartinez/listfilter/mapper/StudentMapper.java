package com.diegomartinez.listfilter.mapper;

import com.diegomartinez.listfilter.dto.StudentDTO;
import com.diegomartinez.listfilter.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {
    public Student StudentDTOtoStudent(StudentDTO studentDTO){
        Student student = new Student();
        student.setId(studentDTO.getId());
        student.setFirstName(studentDTO.getName());
        student.setLastName(studentDTO.getLastName());
        student.setAge(studentDTO.getAge());
        student.setEmail(studentDTO.getEmail());
        student.setType(studentDTO.getType());
        return student;

    }
    public StudentDTO StudentToStudentDTO(Student student){
        return StudentDTO.builder()
                .id(student.getId())
                .age(student.getAge())
                .name(student.getFirstName())
                .lastName(student.getLastName())
                .email(student.getEmail())
                .type(student.getType())
                .build();
    }
}

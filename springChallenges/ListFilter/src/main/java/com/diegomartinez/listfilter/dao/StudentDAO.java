package com.diegomartinez.listfilter.dao;

import com.diegomartinez.listfilter.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StudentDAO extends JpaRepository<Student, Long> {
    @Query(value = "SELECT s FROM Student s where s.firstName = ?1 OR s.age = ?1 OR s.id = ?1")
    public List<Student> rawStudentList(String filter);
}

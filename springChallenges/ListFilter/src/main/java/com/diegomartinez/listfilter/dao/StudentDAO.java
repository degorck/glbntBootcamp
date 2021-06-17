package com.diegomartinez.listfilter.dao;

import com.diegomartinez.listfilter.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDAO extends JpaRepository<Student, Long> {
}

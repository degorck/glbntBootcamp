package com.diegomartinez.listfilter.dao;

import com.diegomartinez.listfilter.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TypeDAO extends JpaRepository<Type, Long> {
}

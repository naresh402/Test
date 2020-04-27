package com.oasys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {

}

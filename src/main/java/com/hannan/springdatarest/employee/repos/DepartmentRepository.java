package com.hannan.springdatarest.employee.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.hannan.springdatarest.employee.entities.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}

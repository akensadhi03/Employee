package com.rntbci.employee.management.Repository;


import com.rntbci.employee.management.entity.Address;
import com.rntbci.employee.management.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, String> {

	Optional<Department> findById(String departmentId);


}

package com.rntbci.employee.management.Repository;


import com.rntbci.employee.management.entity.Employee;
import com.rntbci.employee.management.entity.Manager;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ManagerRepository extends CrudRepository<Manager, String> {

	Optional<Manager> findById(String managerId);


}

package com.rntbci.employee.management.Service;

import com.rntbci.employee.management.entity.Address;
import com.rntbci.employee.management.entity.Department;

import java.util.List;

public interface DepartmentService {
	// Save operation
	Department saveDepartment(Department department);
	
	// Read operation
    List<Department> fetchDepartmentList();
 
    // Update operation
    Department updateDepartment(Department Department, String departmentId);
    
    // get by id operation
    Department getDepartmentById(String departmentId);
 
    // Delete operation
	void deletDepartmentById(String departmentId);
}



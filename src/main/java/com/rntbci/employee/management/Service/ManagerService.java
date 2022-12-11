package com.rntbci.employee.management.Service;

import com.rntbci.employee.management.entity.Employee;
import com.rntbci.employee.management.entity.Manager;

import java.util.List;

public interface ManagerService {
	// Save operation
	Manager saveManager(Manager manager);
	
	// Read operation
    List<Manager> fetchManagerList();
 
    // Update operation
    Manager updateManager(Manager Manager, String managerId);
    
    // get by id operation
    Manager getManagerById(String managerId);
 
    // Delete operation
	void deletManagerById(String managerId);
}



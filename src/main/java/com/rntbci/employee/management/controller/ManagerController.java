package com.rntbci.employee.management.controller;


import com.rntbci.employee.management.Service.EmployeeService;
import com.rntbci.employee.management.Service.ManagerService;
import com.rntbci.employee.management.entity.Employee;
import com.rntbci.employee.management.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Manager")
public class ManagerController {
	@Autowired private ManagerService managerService;
	
	// Save operation
    @PostMapping(value ="/add")
    public String saveManager(@RequestBody Manager manager)
    {
        managerService.saveManager(manager);
        return "added Successfully";
    }
    
    // Read operation
    @GetMapping(value ="/man")
    public List<Manager> fetchManagerList()
    {
        return managerService.fetchManagerList();
    }
    
    @GetMapping(value ="/man/{manager_id}")
    public Manager findEmployeeById(@PathVariable("manager_id") String managerId)
    {
        return managerService.getManagerById(managerId);
    }
 
    // Update operation
    @PutMapping(value ="/man/{manager_id}")
    public Manager updateManager(@RequestBody Manager manager,@PathVariable("manager_id") String managerId)
    {
        return managerService.updateManager(
        		manager, managerId);
    }
 
    // Delete operation
    @DeleteMapping(value ="/delete/{manager_id}")
    public String deleteEmployeeById(@PathVariable("manager_id") String employeeId)
    {
    	 managerService.deletManagerById(employeeId);
        return "Deleted Successfully";
    }
    
    @GetMapping(value ="/test")
    public String findManagerById()
    {
        return "test";
    }
    

}

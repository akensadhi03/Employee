package com.rntbci.employee.management.controller;


import com.rntbci.employee.management.Service.AddressService;
import com.rntbci.employee.management.Service.DepartmentService;
import com.rntbci.employee.management.entity.Address;
import com.rntbci.employee.management.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Department")
public class DepartmentController {
	@Autowired private DepartmentService departmentService;
	
	// Save operation
    @PostMapping(value ="/add")
    public String saveDepartment(@RequestBody Department department)
    {
        departmentService.saveDepartment(department);
        return "added Successfully";
    }
    
    // Read operation
    @GetMapping(value ="/dep")
    public List<Department> fetchDepartmentList()
    {
        return departmentService.fetchDepartmentList();
    }
    
    @GetMapping(value ="/dep/{department_id}")
    public Department findDepartmentById(@PathVariable("department_id") String departmentId)
    {
        return departmentService.getDepartmentById(departmentId);
    }
 
    // Update operation
    @PutMapping(value ="/dep/{department_id}")
    public Department updateDepartment(@RequestBody Department department,@PathVariable("department_id") String departmentId)
    {
        return departmentService.updateDepartment(
        		department, departmentId);
    }
 
    // Delete operation
    @DeleteMapping(value ="/delete/{department_id}")
    public String deleteDepartmentById(@PathVariable("department_id") String departmentId)
    {
    	 departmentService.deletDepartmentById(departmentId);
        return "Deleted Successfully";
    }
    
    @GetMapping(value ="/test")
    public String findDepartmentById()
    {
        return "test";
    }
    

}

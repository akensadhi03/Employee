package com.rntbci.employee.management.Service;


import com.rntbci.employee.management.Repository.EmployeeRepository;
import com.rntbci.employee.management.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	@Override
	public List<Employee> fetchEmployeeList() {
		return (List<Employee>)
				employeeRepository.findAll();
	}
	@Override
	public Employee updateEmployee(Employee Employee, String employeeId) {
		Employee depDB = employeeRepository.findById(employeeId).get();

	    if (Objects.nonNull(Employee.getEmployeeName()) && !"".equalsIgnoreCase(Employee.getEmployeeName())) {
	        depDB.setEmployeeName(Employee.getEmployeeName());
	    }
	    if (Objects.nonNull(Employee.getDepartmentId()) && !"".equalsIgnoreCase(Employee.getDepartmentId())) {
	        depDB.setDepartmentId(Employee.getDepartmentId());
	    }
	    if (Objects.nonNull(Employee.getAddressId())&& !"".equalsIgnoreCase(Employee.getAddressId())) {
	        depDB.setAddressId(Employee.getAddressId());
	    }
	    return employeeRepository.save(depDB);
	}
	@Override
	public void deletEmployeeById(String employeeId) {
		employeeRepository.deleteById(employeeId);
	}
	@Override
	public Employee getEmployeeById(String employeeId) {
		return employeeRepository.findById(employeeId).get();
	}
}

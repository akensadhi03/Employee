package com.rntbci.employee.management.Service;


import com.rntbci.employee.management.Repository.AddressRepository;
import com.rntbci.employee.management.Repository.DepartmentRepository;
import com.rntbci.employee.management.entity.Address;
import com.rntbci.employee.management.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> fetchDepartmentList() {
		return (List<Department>)
				departmentRepository.findAll();
	}
	@Override
	public Department updateDepartment(Department Department, String departmentId) {
		Department depDB = departmentRepository.findById(departmentId).get();

	    if (Objects.nonNull(Department.getDepartmentName()) && !"".equalsIgnoreCase(Department.getDepartmentName())) {
	        depDB.setDepartmentName(Department.getDepartmentName());
	    }
	    return departmentRepository.save(depDB);
	}
	@Override
	public void deletDepartmentById(String departmentId) {
		departmentRepository.deleteById(departmentId);
	}
	@Override
	public Department getDepartmentById(String departmentId) {
		return departmentRepository.findById(departmentId).get();
	}
}

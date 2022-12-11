package com.rntbci.employee.management.Service;


import com.rntbci.employee.management.Repository.EmployeeRepository;
import com.rntbci.employee.management.Repository.ManagerRepository;
import com.rntbci.employee.management.entity.Employee;
import com.rntbci.employee.management.entity.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class ManagerServiceImpl implements ManagerService {
	@Autowired
	private ManagerRepository managerRepository;
	@Override
	public Manager saveManager(Manager manager) {
		return managerRepository.save(manager);
	}
	@Override
	public List<Manager> fetchManagerList() {
		return (List<Manager>)
				managerRepository.findAll();
	}
	@Override
	public Manager updateManager(Manager Manager, String managerId) {
		Manager depDB = managerRepository.findById(managerId).get();

	    if (Objects.nonNull(Manager.getManagerName()) && !"".equalsIgnoreCase(Manager.getManagerName())) {
	        depDB.setManagerName(Manager.getManagerName());
	    }
	    return managerRepository.save(depDB);
	}
	@Override
	public void deletManagerById(String managerId) {
		managerRepository.deleteById(managerId);
	}
	@Override
	public Manager getManagerById(String managerId) {
		return managerRepository.findById(managerId).get();
	}
}

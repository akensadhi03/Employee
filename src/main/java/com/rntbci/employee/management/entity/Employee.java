package com.rntbci.employee.management.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "employees")
public class Employee {
	@Id
    @Column(name = "employee_id")
	private String employeeId;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "department_id")
    private String departmentId;
    @Column(name = "address_id")
    private String addressId;
}

package com.greatlearning.employeemgmtrestapi.service;

import java.util.List;

import com.greatlearning.employeemgmtrestapi.model.Employee;

public interface EmployeeService {
	
	// INSERT NEW RECORDS
	public void insertRecords(Employee employee);

    // PRINT ALL RECORDS
	public List<Employee> getAllEmployees();
	
	public Employee getEmployeeById(long id);

	public void deleteEmployeeById(long id);

}

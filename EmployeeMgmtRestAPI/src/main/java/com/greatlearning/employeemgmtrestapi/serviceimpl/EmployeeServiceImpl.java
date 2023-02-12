package com.greatlearning.employeemgmtrestapi.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.employeemgmtrestapi.model.Employee;
import com.greatlearning.employeemgmtrestapi.repository.EmployeeRepository;
import com.greatlearning.employeemgmtrestapi.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository emprepo;
	
	@Override
	public void insertRecords(Employee employee) {
		emprepo.save(employee);
		
	}
	
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return emprepo.findAll();
	}
	
	@Override
	public Employee getEmployeeById(long id) {
		return emprepo.findById(id).get();
	}

	@Override
	public void deleteEmployeeById(long id) {
		emprepo.deleteById(id);
	}

}

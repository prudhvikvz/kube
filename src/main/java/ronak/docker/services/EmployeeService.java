package ronak.docker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ronak.docker.entity.Employee;
import ronak.docker.repositories.EmployeeRepository;

@Repository
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employee;
	
	public Employee addEmployee(Employee newEmployee) {
		return employee.save(newEmployee);
	}
	
	public List<Employee> getAllEmployees() {
		return employee.findAll();
	}
	
	public void DeleteEmployee(int employeeId) {
		employee.deleteById(employeeId);
	}
	
	public Employee getEmployee(int employeeId) {
		Optional<Employee> employeeOptional =  employee.findById(employeeId);
		if (employeeOptional.isPresent()) 
			return employeeOptional.get();
		else 
			return null;
	}
	
	public Employee updateEmployee(Employee employeeToUpdate) {
		return employee.save(employeeToUpdate);
	}
	
	
}

package ronak.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ronak.docker.dto.Message;
import ronak.docker.entity.Employee;
import ronak.docker.services.EmployeeService;

@CrossOrigin(origins="*",allowedHeaders="*")
@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService = new EmployeeService();
	
	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@PostMapping(value = "/employee", consumes = "application/json")
	public Employee addUser(@RequestBody Employee employeeToAdd)
	{
		return employeeService.addEmployee(employeeToAdd);
	}
	
	@DeleteMapping(value = "/employee/{employeeId}")
	public Message deleteEmployee(@PathVariable int employeeId) {
		employeeService.DeleteEmployee(employeeId); 
		Message message = new Message();
		message.setMessage("Employee deleted!");
		return message;
	}
	
	@GetMapping(value = "/employee/{employeeId}")
	public Employee getEmployee(@PathVariable int employeeId) {
		return employeeService.getEmployee(employeeId);
	}
	
	@PutMapping(value = "/employee")
	public Employee updateEmployee(@RequestBody Employee employeeToUpdate) {
		return employeeService.updateEmployee(employeeToUpdate);
		
	}
	
}

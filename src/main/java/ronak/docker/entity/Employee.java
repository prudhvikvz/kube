package ronak.docker.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int employeeId;
	@Column(name = "employee_name")
	private String employeeName;
	@Column(name = "employee_gender")
	private String employeeGender;
	@Column(name = "employee_competency_level")
	private String employeeCompetencyLevel;
	@Column(name = "employee_salary")
	private int employeeSalary;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public String getEmployeeCompetencyLevel() {
		return employeeCompetencyLevel;
	}
	public void setEmployeeCompetencyLevel(String employeeCompetencyLevel) {
		this.employeeCompetencyLevel = employeeCompetencyLevel;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	
}

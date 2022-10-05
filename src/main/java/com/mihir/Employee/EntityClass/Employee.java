package com.mihir.Employee.EntityClass;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	private int empId;
	private String empName;
	private String empDepart;
	private double empSalary;
	private String empLocation;
	private String empAdharNo;
	private String empEmail;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, String empDepart, double empSalary, String empLocation,
			String empAdharNo, String empEmail) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDepart = empDepart;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
		this.empAdharNo = empAdharNo;
		this.empEmail = empEmail;
	}

	public String getEmpAdharNo() {
		return empAdharNo;
	}

	public void setEmpAdharNo(String empAdharNo) {
		this.empAdharNo = empAdharNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepart=" + empDepart + ", empSalary="
				+ empSalary + ", empLocation=" + empLocation + ", empAdharNo=" + empAdharNo + ", empEmail=" + empEmail
				+ "]";
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepart() {
		return empDepart;
	}

	public void setEmpDepart(String empDepart) {
		this.empDepart = empDepart;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

}

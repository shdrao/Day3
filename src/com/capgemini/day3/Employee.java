package com.capgemini.day3;

public class Employee {

	private long employeeId;
	private String employeeName;
	private double hra;
	private double pf;
	public static final int PT = 200;
	private double grossSalary;
	private double basicSalary;
	private double medical;
	private double netSalary;

	public Employee(long employeeId, String employeeName, double medical, double basicSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.medical = medical;
		this.basicSalary = basicSalary;
	}

	public double calculateNetSalary() {
		hra = 0.5 * basicSalary;
		pf = 0.12 * basicSalary;
		grossSalary = hra + basicSalary + medical;
		netSalary = grossSalary - pf - PT;
		return netSalary;
	}

	public String displayEmployeeInformation() {
		System.out.println("Employee id:" + employeeId);
		System.out.println("Employee Name:" + employeeName);
		System.out.println("Employee salary:" + netSalary);
		return "Success";
	}

}

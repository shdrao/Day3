package com.capgemini.day3.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day3.Employee;

class EmployeeTest {

	Employee emp;

	@BeforeEach
	void setUp() {
		emp = new Employee(157853, "Sharath D Rao", 0, 9057);
	}

	@Test
	void testsalary() {
		assertEquals(12298.66, emp.calculateNetSalary());
		assertEquals("Success", emp.displayEmployeeInformation());

	}

	@AfterEach
	void tearDown() {
		emp = null;

	}
}

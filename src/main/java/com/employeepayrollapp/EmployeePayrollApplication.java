package com.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
/**
 * main class from where our program execution will start.
 */
@Slf4j
/**
 *  Lombok can also be used to
 *  configure logging in spring boot applications and thus removing the boilerplate code for getting the logger instance.
 */
public class EmployeePayrollApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(EmployeePayrollApplication.class, args);
		/**
		 * Activated logger field
		 */
		log.info("Employee Payroll App Started in {} Environment",context.getEnvironment().getProperty("environment"));
	}
}

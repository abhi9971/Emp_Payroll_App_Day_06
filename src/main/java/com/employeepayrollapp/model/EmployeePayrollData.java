package com.employeepayrollapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import com.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

@Entity
@Table(name = "employee_payroll")
/*
Lombok Data annotation ( @Data ) Generates getters for all fields,
a useful toString method, and hashCode and equals implementations that check all non-transient fields.
Will also generate setters for all non-final fields, as well as a constructor.
 */
public @Data class EmployeePayrollData {

    @Id   // here we use id as a primary key
    @GeneratedValue(strategy = GenerationType.AUTO) //Increment value automatically
    @Column(name = "employee_id")

    private int employeeId;
    private String name;
    private long salary;
    private String gender;

     //default constructor
    public EmployeePayrollData() {

    }
    //Parametrized constructor having parameter EmployeePayrollDTO which is having all field name,salary&gender.
    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.updateEmployeePayrollData(employeePayrollDTO);
    }
    //update data using Dto field
    public void updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        this.name = empPayrollDTO.name;
        this.salary = empPayrollDTO.salary;
        this.gender = empPayrollDTO.gender;

    }
}
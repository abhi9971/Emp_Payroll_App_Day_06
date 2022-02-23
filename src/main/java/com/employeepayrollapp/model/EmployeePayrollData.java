package com.employeepayrollapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import com.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "employee_payroll")
/**
Lombok Data annotation ( @Data ) Generates getters for all fields,
a useful toString method, and hashCode and equals implementations that check all non-transient fields.
Will also generate setters for all non-final fields, as well as a constructor.
 */
public @Data class EmployeePayrollData {

    @Id   /** here we use id as a primary key */
    @GeneratedValue(strategy = GenerationType.AUTO) /** Increment value automatically */
    @Column(name = "employee_id")

    private int employeeId;
    private String firstname;
    private String lastName;
    private long salary;
    private String gender;
    private String profilePic;
    private String department;
    private LocalDate date;
    private String notes;

     /**
     *default constructor
      */
    public EmployeePayrollData() {}


    /**
     * Parametrized constructor having parameter EmployeePayrollDTO which is having all field name,salary&gender.
     */
    public EmployeePayrollData(EmployeePayrollDTO employeePayrollDTO) {
        this.updateEmployeePayrollData(employeePayrollDTO);
    }

    /**
     * update data using Dto field
     */
    public void updateEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        this.firstname = empPayrollDTO.firstName;
        this.lastName=empPayrollDTO.lastName;
        this.salary = empPayrollDTO.salary;
        this.gender = empPayrollDTO.gender;
        this.profilePic=empPayrollDTO.profilePic;
        this.department=empPayrollDTO.department;
        this.date=empPayrollDTO.date;
        this.notes=empPayrollDTO.notes;
    }

}

////hibernate ne query generate ki h use dekhna h console me to iska use kare ni to ye optional h
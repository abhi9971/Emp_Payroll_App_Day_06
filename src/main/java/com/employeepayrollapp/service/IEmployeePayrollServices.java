package com.employeepayrollapp.service;

import com.employeepayrollapp.dto.EmployeePayrollDTO;
import com.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;


public interface IEmployeePayrollServices {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);


}

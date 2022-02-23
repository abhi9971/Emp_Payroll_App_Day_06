package com.employeepayrollapp.service;

import com.employeepayrollapp.dto.EmployeePayrollDTO;
import com.employeepayrollapp.model.EmployeePayrollData;
import java.util.List;

/**
 * Here we create an interface having some methods which we implement in EmployeePayrollService .

 * getEmployeePayrollData:- in this we retrieve all records from database.

 * getEmployeePayrollDataById:-in this we retrieve records from database for particular employee.

 * createEmployeePayrollData:-in this we create data and store that data into our database.

 * updateEmployeePayrollData:-in this method we take id of a particular employee and then passes the info which we have to update and then store in db

 * deleteEmployeePayrollData:-take id of an employee and delete that record from the database.
 */
public interface IEmployeePayrollServices {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO empPayrollDTO);

    void deleteEmployeePayrollData(int empId);


}

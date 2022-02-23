package com.employeepayrollapp.controller;

import com.employeepayrollapp.dto.EmployeePayrollDTO;
import com.employeepayrollapp.dto.ResponseDTO;
import com.employeepayrollapp.model.EmployeePayrollData;
import com.employeepayrollapp.service.EmployeePayrollService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/employeePayroll")
@Slf4j
/**
*Causes lombok to generate a logger field. ... This annotation is valid for classes and enumerations.
*In Java, Logging is an API that provides the ability to trace out the errors of the applications.
*The SLF4J or the Simple Logging Facade for Java is an abstraction layer for various Java logging frameworks,
*like Log4j 2 or Logback. This allows for plugging different logging frameworks at deployment time without the need for code changes.
 */
public class EmployeePayrollController {
    @Autowired
    private EmployeePayrollService employeePayrollService;

    /**
     * Get all data
     * @return list of employee information from DB in JSON format
     */

    @RequestMapping(value = {"","/","/employees"}, method = RequestMethod.GET)
    public ResponseEntity<ResponseDTO> getEmployeePayrollData() {
        List<EmployeePayrollData> empDataList = null;
        empDataList = employeePayrollService.getEmployeePayrollData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", empDataList);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    /**
     * Get records by id
     * @param empId - represents employee id
     * @return employee information with same empId in JSON format
     */

    @GetMapping("/employee/{empId}")
    public ResponseEntity<ResponseDTO> getEmployeePayrollData(@PathVariable("empId") int empId) {
        EmployeePayrollData employeePayrollData = null;
        employeePayrollData = employeePayrollService.getEmployeePayrollDataById(empId);
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", employeePayrollData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    /**
     * create record
     * @apiNote accepts the employee data in JSON format and stores it in DB
     * @param empPayrollDTO - represents object of EmployeePayrollDTO class
     * @return accepted employee information in JSON format
     */

    @PostMapping(path = "/create")
    public ResponseEntity<ResponseDTO> addEmployeePayrollData(@Valid @RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData employeePayrollData = employeePayrollService.createEmployeePayrollData(empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Employee Data ", employeePayrollData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    /**
     * update  record data by id
     * @apiNote accepts the employee data in JSON format and updates the employee having same empId from database
     * @param empId - represents employee id
     * @param empPayrollDTO - represents object of EmployeePayrollDTO class
     * @return	updated employee information in JSON format
     */

    @PutMapping(path = "/update/{empId}", consumes = {"application/json"})
    public ResponseEntity<ResponseDTO> updateEmployeePayrollData(@Valid @PathVariable("empId") int empId, @RequestBody EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData employeePayrollData = employeePayrollService.updateEmployeePayrollData(empId, empPayrollDTO);
        ResponseDTO respDTO = new ResponseDTO("Updated Employee payroll Data for: ", employeePayrollData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    /**
     * delete records from database
     * @apiNote accepts the empId and deletes the data of that employee from DB
     * @param empId - represents employee id
     * @return empId and Acknowledgment message
     */

    @DeleteMapping("/delete/{empId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("empId") int empId) {
        employeePayrollService.deleteEmployeePayrollData(empId);
        ResponseDTO respDTO = new ResponseDTO("Deleted Employee Data ", empId);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }
}









//        log.debug("Employee DTO"+empPayrollDTO.toString());


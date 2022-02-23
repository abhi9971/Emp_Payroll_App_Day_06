package com.employeepayrollapp.repository;

//import java.util.Optional;



import com.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeePayrollRepository extends JpaRepository<EmployeePayrollData, Integer> {}

/**
 * here EmployeePayrollRepository we take all data of our entity which is EmployeePayrollData, and passes id as integer which is our
 * primary key of our model class i.e Employee Payroll data.
 */



























//    @Override
//    <S extends EmployeePayrollData> S save(S s);
//
//    @Override
//    <S extends EmployeePayrollData> Iterable<S> saveAll(Iterable<S> iterable);
//
//    @Override
//    Optional<EmployeePayrollData> findById(Integer integer);
//
//    @Override
//    boolean existsById(Integer integer);
//
//    @Override
//    Iterable<EmployeePayrollData> findAll();
//
//    @Override
//    Iterable<EmployeePayrollData> findAllById(Iterable<Integer> iterable);
//
//    @Override
//    long count();
//
//    @Override
//    void deleteById(Integer integer);
//
//    @Override
//    void delete(EmployeePayrollData employeePayrollData);
//
//    @Override
//    void deleteAllById(Iterable<? extends Integer> iterable);
//
//    @Override
//    void deleteAll(Iterable<? extends EmployeePayrollData> iterable);
//
//    @Override
//    void deleteAll();
//}
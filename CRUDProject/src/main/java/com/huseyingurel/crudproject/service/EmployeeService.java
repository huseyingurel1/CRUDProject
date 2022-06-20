package com.huseyingurel.crudproject.service;

import com.huseyingurel.crudproject.model.Employee;

import java.util.List;


public interface EmployeeService{
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}

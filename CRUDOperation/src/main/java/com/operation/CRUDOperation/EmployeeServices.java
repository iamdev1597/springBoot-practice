package com.operation.CRUDOperation;

import java.util.List;

public interface EmployeeServices {

    String creatEmployee(Employee employee);
    List<Employee> readEmployee();
    boolean deleteEmployee(Long id);
    
}

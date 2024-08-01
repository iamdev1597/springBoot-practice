package com.operation.CRUDOperation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServicesImpl  implements EmployeeServices{
    List<Employee> list = new ArrayList<>();

    @Override
    public String creatEmployee(Employee employee) {
        list.add(employee);
        return "Saved Successfully";
    }

    @Override
    public List<Employee> readEmployee() {
        return list;
    }

    @SuppressWarnings("unlikely-arg-type")
    @Override
    public boolean deleteEmployee(Long id) {
        list.remove(id);
        return true;
    }
    
}

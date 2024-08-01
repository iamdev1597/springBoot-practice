package com.operation.CRUDOperation;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {
    
    EmployeeServices employeeServices = new EmployeeServicesImpl();
    @GetMapping("Emp")
    public List<Employee> getName() {  
        return employeeServices.readEmployee();
    }   

    @PostMapping("SaveEmp")
    public String postName(@RequestBody Employee data) {
        employeeServices.creatEmployee(data);
        return "Saved Successfully";
    }   

    @DeleteMapping("Emp/{id}")
    public String deleteEmp(@PathVariable long id){
        if(employeeServices.deleteEmployee(id))
            return "Deleted Successfully";
        return "Not Found";
    }
}

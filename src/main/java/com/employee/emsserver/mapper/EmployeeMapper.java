package com.employee.emsserver.mapper;

import com.employee.emsserver.dto.EmployeeDTO;
import com.employee.emsserver.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDTO mapToEmployeeDTO(Employee employee) {
        return new EmployeeDTO(
            employee.getId(), employee.getFirstName(), employee.getLastName(), employee.getEmail()
        );
    }
    
    public static Employee mapToEmployee(EmployeeDTO employeeDTO) {
        return new Employee(
            employeeDTO.getId(), employeeDTO.getFirstName(), employeeDTO.getLastName(), employeeDTO.getEmail()
        );
    }
}

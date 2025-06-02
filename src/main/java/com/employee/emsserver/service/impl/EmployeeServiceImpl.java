package com.employee.emsserver.service.impl;

import com.employee.emsserver.dto.EmployeeDTO;
import com.employee.emsserver.entity.Employee;
import com.employee.emsserver.mapper.EmployeeMapper;
import com.employee.emsserver.repository.EmployeeRepository;
import com.employee.emsserver.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
    
    private EmployeeRepository employeeRepository;
    
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        
        Employee employee = EmployeeMapper.mapToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
        
        return EmployeeMapper.mapToEmployeeDTO(savedEmployee);
    }
}

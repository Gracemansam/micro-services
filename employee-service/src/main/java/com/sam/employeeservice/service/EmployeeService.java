package com.sam.employeeservice.service;

import com.sam.employeeservice.dto.APIResponseDto;
import com.sam.employeeservice.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto saveEmployee(EmployeeDto employeeDto);

    APIResponseDto getEmployeeById(Long employeeId);
}

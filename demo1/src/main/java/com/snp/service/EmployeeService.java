package com.snp.service;

import com.snp.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> findAll();
    List<Employee> findByX(String x);
    void insert(Employee employee);
    void delete(int id);

    List<Map<String, Integer>> selectIndentNum();

    void upDate(Employee employee);
}

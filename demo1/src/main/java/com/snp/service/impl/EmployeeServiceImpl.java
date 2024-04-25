package com.snp.service.impl;

import com.snp.dto.Employee;
import com.snp.mapper.EmployeeMapper;
import com.snp.service.EmployeeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Resource
    EmployeeMapper employeeMapper;

    public List<Employee> findAll(){
        return employeeMapper.findAll();
    }

    public Employee findById(int id){
        return employeeMapper.findById(id);
    }

    public List<Employee> findByX(String x){
        return employeeMapper.findByX(x);
    }

    public void insert(Employee employee){
        employeeMapper.insert(employee);
    }

    public void delete(int id){
        employeeMapper.delete(id);
    }
    public List<Map<String, Integer>> selectIndentNum(){
        return employeeMapper.selectIndentNum();
    }

    public void upDate(Employee employee){
        employeeMapper.upDate(employee);
    }
}

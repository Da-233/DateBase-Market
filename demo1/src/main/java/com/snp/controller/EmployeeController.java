package com.snp.controller;

import com.alibaba.fastjson.JSONObject;
import com.snp.common.Result;
import com.snp.dto.Employee;
import com.snp.service.EmployeeService;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("employee")
@RestController
public class EmployeeController {
    @Resource
    EmployeeService employeeService;
    @GetMapping("/findall")
    public Result findall(){
        List<Employee> employees = employeeService.findAll();
        List<Map<String, Integer>> sum = employeeService.selectIndentNum();
        for(Employee employee:employees){
            for (Map<String, Integer> map:sum){
                if(employee.getId() == map.get("employ_id")){
                    employee.setIndentNum(map.get("num"));
                    break;
                }
            }
        }
        System.out.println("findall");
        return new Result("0", "", employees);
    }

    @PostMapping("/update")
    public Result upDate(@RequestBody String str){
        System.out.println(str);
        Employee employee = JSONObject.parseObject(str, Employee.class);
        System.out.println("upDate");
        employeeService.upDate(employee);
        return new Result("0", "true", "");
    }

    @GetMapping("/findbyx")
    public Result findByX(String x){
        System.out.println("findByX");
        List<Employee> employees = employeeService.findByX(x);
        return new Result("0", "true", employees);
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody String str){
        System.out.println(str);
        Employee employee = JSONObject.parseObject(str, Employee.class);
        System.out.println("insert");
        employeeService.insert(employee);
        return new Result("0", "true", "");
    }

    @DeleteMapping("delete")
    public Result delete(String id){
        System.out.println("delete");
        employeeService.delete(Integer.parseInt(id));
        return new Result("0", "true", "");
    }
}

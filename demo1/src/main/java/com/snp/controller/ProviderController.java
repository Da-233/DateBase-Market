package com.snp.controller;

import com.alibaba.fastjson.JSONObject;
import com.snp.common.Result;
import com.snp.dto.Employee;
import com.snp.dto.Provider;
import com.snp.service.EmployeeService;
import com.snp.service.ProviderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/provider")
@RestController
public class ProviderController {
    @Resource
    ProviderService providerService;
    @GetMapping("/findall")
    public Result findall(){
        List<Provider> providers = providerService.findAll();
        System.out.println("findall");
        return new Result("0", "", providers);
    }
    @GetMapping("/findbyx")
    public Result findByX(String x){
        System.out.println("findByX");
        List<Provider> providers = providerService.findByX(x);
        return new Result("0", "true", providers);
    }

    @GetMapping("/findbytypeid")
    public Result findByTypeId(String typeId){
        System.out.println("findByTypeId");
        List<Map<String, Object>> maps = providerService.ff(Integer.parseInt(typeId));
        return new Result("0", "true", maps);
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody String str){
        System.out.println(str);
        Provider provider = JSONObject.parseObject(str, Provider.class);
        System.out.println("insert");
        providerService.insert(provider);
        return new Result("0", "true", "");
    }

    @GetMapping("/selectnum")
    public Result selectNum(String id){
        System.out.println("selectNum");
        BigDecimal bigDecimal = providerService.selectNum(Integer.parseInt(id));
        List<Map<String, Object>> maps = new ArrayList<>();
        Map<String, Object> map = new HashMap<>();
        map.put("provider", id);
        map.put("productMoney", bigDecimal);
        maps.add(map);
        return new Result("0", "true", maps);
    }

    @DeleteMapping("delete")
    public Result delete(String id){
        System.out.println("delete");
        System.out.println(id);
        providerService.delete(Integer.parseInt(id));
        return new Result("0", "true", "");
    }

    @PostMapping("/update")
    public Result upDate(@RequestBody String str){
        System.out.println(str);
        Provider provider = JSONObject.parseObject(str, Provider.class);
        System.out.println("upDate");
        providerService.upDate(provider);
        return new Result("0", "true", "");
    }

}


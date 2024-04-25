package com.snp.controller;

import com.alibaba.fastjson.JSONObject;
import com.snp.common.Result;
import com.snp.dto.Type;
import com.snp.service.TypeService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/type")
@RestController
public class TypeController {
    @Resource
    TypeService typeService;
    @GetMapping("/findall")
    public Result findall(){
        List<Type> providers = typeService.findall();
        System.out.println("findall");
        return new Result("0", "", providers);
    }

    @GetMapping("/findbyx")
    public Result findByX(String x){
        System.out.println("findByX");
        List<Type> types = typeService.findByX(x);
        return new Result("0", "true", types);
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody String str){
        System.out.println(str);
        Type type = JSONObject.parseObject(str, Type.class);
        System.out.println("insert");
        typeService.insert(type);
        return new Result("0", "true", "");
    }

    @DeleteMapping("delete")
    public Result delete(String id){
        System.out.println("delete");
        System.out.println(id);
        typeService.delete(Integer.parseInt(id));
        return new Result("0", "true", "");
    }
}

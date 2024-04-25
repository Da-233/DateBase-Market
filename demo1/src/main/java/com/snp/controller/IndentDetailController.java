package com.snp.controller;

import com.alibaba.fastjson.JSONObject;
import com.snp.common.Result;
import com.snp.dto.IndentDetail;
import com.snp.mapper.IndentMapper;
import com.snp.service.IndentDetailService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/indentdetail")
public class IndentDetailController {
    @Resource
    IndentDetailService indentDetailService;
    @Resource
    IndentMapper indentMapper;
    @GetMapping("/findall")
    public Result findall(){
        List<IndentDetail> indents = indentDetailService.findall();
        System.out.println("findall");
        return new Result("0", "", indents);
    }

    @GetMapping("/findbyid")
    public Result findById(String id){
        System.out.println("findById");
        IndentDetail indentDetail = JSONObject.parseObject(id, IndentDetail.class);
        List<IndentDetail> indents = new ArrayList<>();
        indents.add(indentDetailService.findById(indentDetail));
        return new Result("0", "", indents);
    }

    @GetMapping("/findbyindentid")
    public Result findByIndentId(String id){
        System.out.println("findByIndentId");
        List<IndentDetail> indentDetails = indentDetailService.findByIndentId(Integer.parseInt(id));
        return new Result("0","", indentDetails);
    }
    @PostMapping("/insert")
    public Result insert(@RequestBody String str){
        System.out.println(str);
        IndentDetail indentDetail = JSONObject.parseObject(str, IndentDetail.class);
        System.out.println("insert");
        //indent.setEmployId(2);
        indentDetailService.insert(indentDetail);
        return new Result("0", "true", "");
    }

    @DeleteMapping("/delete")
    public Result delete(String id){
        System.out.println("delete");
        String[] strs = id.split("FF");
        IndentDetail indentDetail = new IndentDetail(Integer.parseInt(strs[0]), Integer.parseInt(strs[1]), 0);
        indentDetailService.delete(indentDetail);
        return new Result("0", "true", "");
    }

    @PostMapping("/start")
    public Result Start(@RequestBody String id){
        indentMapper.updateStart(Integer.parseInt(id));
        return new Result("0", "true", "");
    }

    @PostMapping("/arriv")
    public Result Arriv(@RequestBody String id){
        indentMapper.updateArriv(Integer.parseInt(id));
        return new Result("0", "true", "");
    }

    @PostMapping("/check")
    public Result Check(@RequestBody String id){
        indentMapper.updateCheck(Integer.parseInt(id));
        return new Result("0", "true", "");
    }
}

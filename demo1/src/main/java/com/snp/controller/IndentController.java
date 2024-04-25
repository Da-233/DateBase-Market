package com.snp.controller;

import com.alibaba.fastjson.JSONObject;
import com.snp.common.Result;
import com.snp.dto.Indent;
import com.snp.service.IndentService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RequestMapping("/indent")
@RestController
public class IndentController {
    @Resource
    IndentService indentService;

    @GetMapping("/findall")
    public Result findall() {
        List<Indent> indents = indentService.findall();
        System.out.println("findall");
        return new Result("0", "", indents);
    }

    @GetMapping("/findbyid")
    public Result findById(String id) {
        System.out.println("findById");
        List<Indent> indents = new ArrayList<>();
        indents.add(indentService.findById(Integer.parseInt(id)));
        return new Result("0", "", indents);
    }

    @GetMapping("/findbyx")
    public Result findByX(String x) {
        System.out.println("findByX");
        List<Indent> indents = indentService.findByX(x);
        return new Result("0", "true", indents);
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody String str) {
        Indent indent = JSONObject.parseObject(str, Indent.class);
        System.out.println("insert");
        //indent.setEmployId(2);
        indentService.insert(indent);
        return new Result("0", "true", "");
    }

    @DeleteMapping("delete")
    public Result delete(String id) {
        System.out.println("delete");
        indentService.delete(Integer.parseInt(id));
        return new Result("0", "true", "");
    }

    @GetMapping("findbyclientname")
    public Result findByClientName(String name) {
        System.out.println("根据客户查询订单");
        List<Indent> indents = indentService.selectByClientName(name);
        System.out.println(indents);
        return new Result("0", "true", indents);
    }

    @PostMapping("createindentfromclient")
    public Result creatIndentFromClient(@RequestBody String str) {
        Map map = (Map<String, Object>)JSON.parse(str);
        System.out.println(map.toString());
        indentService.creatIndentFromClient(map);
        return new Result("0", "", "");
    }

}

package com.snp.controller;

import com.alibaba.fastjson.JSONObject;
import com.snp.common.Result;
import com.snp.dto.Product;
import com.snp.dto.Provider;
import com.snp.service.ProductService;
import com.snp.service.ProviderService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/product")
@RestController
public class ProductController {
    @Resource
    ProductService productService;
    @GetMapping("/findall")
    public Result findall(){
        List<Product> products = productService.findall();
        System.out.println("findall");
        return new Result("0", "", products);
    }
    @GetMapping("/findbyx")
    public Result findByX(String x){
        System.out.println("findByX");
        List<Product> products = productService.findByX(x);
        return new Result("0", "true", products);
    }

    @PostMapping("/insert")
    public Result insert(@RequestBody String str){
        System.out.println(str);
        Product product = JSONObject.parseObject(str, Product.class);
        System.out.println("insert");
        productService.insert(product);
        return new Result("0", "true", "");
    }

    @DeleteMapping("delete")
    public Result delete(String id){
        System.out.println("delete");
        System.out.println(id);
        productService.delete(Integer.parseInt(id));
        return new Result("0", "true", "");
    }

    @GetMapping("/findbytypeid")
    public Result findByTypeId( String id){
        System.out.println("findByTypeId");
        System.out.println(id);
        List<Product> products = productService.findByTypeId(Integer.parseInt(id));
        return new Result("0", "true", products);
    }
}

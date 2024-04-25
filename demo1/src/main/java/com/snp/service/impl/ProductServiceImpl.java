package com.snp.service.impl;

import com.snp.dto.Product;
import com.snp.dto.Provider;
import com.snp.mapper.ProductMapper;
import com.snp.mapper.ProviderMapper;
import com.snp.service.ProductService;
import com.snp.service.ProviderService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper productMapper;

    public List<Product> findall(){
        return productMapper.findAll();
    }

    public Product findById(int id){
        return productMapper.findById(id);
    }

    public List<Product> findByX(String x){
        return productMapper.selectByX(x);
    }
    public List<Product> findByTypeId(int id){
        return productMapper.findByTypeId(id);
    }
    public void insert(Product product){
        productMapper.insert(product);
    }

    public void delete(int id){
        productMapper.delete(id);
    }
}

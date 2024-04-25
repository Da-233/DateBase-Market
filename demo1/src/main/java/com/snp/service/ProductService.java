package com.snp.service;

import com.snp.dto.Product;
import com.snp.dto.Type;

import java.util.List;

public interface ProductService {
    List<Product> findall();
    Product findById(int id);
    List<Product> findByX(String x);
    void insert(Product product);
    void delete(int id);

    List<Product> findByTypeId(int id);
}

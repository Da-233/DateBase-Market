package com.snp.service;

import com.snp.dto.Indent;
import com.snp.dto.Type;

import java.util.List;

public interface TypeService {
    List<Type> findall();
    Type findById(int id);
    List<Type> findByX(String x);
    void insert(Type type);
    void delete(int id);
}

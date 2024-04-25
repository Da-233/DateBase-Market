package com.snp.service.impl;

import com.snp.dto.Provider;
import com.snp.dto.Type;
import com.snp.mapper.ProviderMapper;
import com.snp.mapper.TypeMapper;
import com.snp.service.TypeService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Resource
    TypeMapper typeMapper;

    public List<Type> findall(){
        return typeMapper.findAll();
    }

    public Type findById(int id){
        return typeMapper.findById(id);
    }

    public List<Type> findByX(String x){
        return typeMapper.selectByX(x);
    }

    public void insert(Type type){
        typeMapper.insert(type);
    }

    public void delete(int id){
        typeMapper.delete(id);
    }
}

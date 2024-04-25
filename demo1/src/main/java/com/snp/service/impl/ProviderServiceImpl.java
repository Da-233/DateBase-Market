package com.snp.service.impl;

import com.snp.dto.Indent;
import com.snp.dto.Provider;
import com.snp.mapper.IndentMapper;
import com.snp.mapper.ProviderMapper;
import com.snp.service.ProviderService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Resource
    ProviderMapper providerMapper;

    public List<Provider> findAll(){
        return providerMapper.findAll();
    }

    public Provider findById(int id){
        return providerMapper.findById(id);
    }

    public List<Provider> findByX(String x){
        return providerMapper.selectByX(x);
    }

    public void insert(Provider provider){
        providerMapper.insert(provider);
    }

    public void delete(int id){
        providerMapper.delete(id);
    }

    public BigDecimal selectNum(int id){
        return providerMapper.selectNum(id);
    }

    public List<Map<String, Object>> ff(int typeId){
        return providerMapper.ff(typeId);
    }

    public void upDate(Provider provider){
        providerMapper.upDate(provider);
    }
}

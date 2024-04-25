package com.snp.service.impl;

import com.snp.dto.Indent;
import com.snp.dto.IndentDetail;
import com.snp.mapper.IndentDetailMapper;
import com.snp.mapper.IndentMapper;
import com.snp.service.IndentService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Service
public class IndentServiceImpl implements IndentService {
    @Resource
    IndentMapper indentMapper;

    @Resource
    IndentDetailMapper indentDetailMapper;

    public List<Indent> findall(){
        return indentMapper.findAll();
    }

    public Indent findById(int id){
        return indentMapper.findById(id);
    }

    public List<Indent> findByX(String x){
        return indentMapper.selectByX(x);
    }

    public void insert(Indent indent){
        indentMapper.insert(indent);
    }

    public void delete(int id){
        List<IndentDetail> indentDetails = indentDetailMapper.findByIndentId(id);
        for(IndentDetail indentDetail:indentDetails){
            indentDetailMapper.delete(indentDetail);
        }
        indentMapper.delete(id);
    }

    @Override
    public List<Indent> selectByClientName(String name) {
        return indentMapper.selectByClientName(name);
    }

    @Override
    public int selectLastId() {
        return indentMapper.selectLastId();
    }

    public void creatIndentFromClient(Map<String, Object> map){
        LocalDateTime dateTime = LocalDateTime.now();//获取时间
        Random numList = new Random(dateTime.toInstant(ZoneOffset.UTC).toEpochMilli());//创造随机数条件
        Indent indent = new Indent(0, (String) map.get("clientId"), numList.nextInt(6) + 2, dateTime, null, null, null, new BigDecimal(5), (String) map.get("ownName"), (String) map.get("ownAdd"), (String) map.get("ownCity"), (String) map.get("ownRegion"), (String) map.get("ownPost"), (String) map.get("ownCountry"), null, null, "");
        indentMapper.insert(indent);
        IndentDetail indentDetail  = new IndentDetail(indentMapper.selectLastId(), (Integer) map.get("productId"), Integer.parseInt((String) map.get("num")));
        System.out.println(indentDetail);
        indentDetailMapper.insert(indentDetail);
    }
}

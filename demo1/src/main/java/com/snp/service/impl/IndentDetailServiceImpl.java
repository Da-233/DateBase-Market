package com.snp.service.impl;

import com.snp.dto.Employee;
import com.snp.dto.IndentDetail;
import com.snp.mapper.EmployeeMapper;
import com.snp.mapper.IndentDetailMapper;
import com.snp.service.IndentDetailService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndentDetailServiceImpl implements IndentDetailService {
    @Resource
    IndentDetailMapper indentDetailMapper;

    public List<IndentDetail> findall(){
        return indentDetailMapper.findAll();
    }

    public IndentDetail findById(IndentDetail indentDetail){
        return indentDetailMapper.findById(indentDetail);
    }

//    public List<IndentDetail> findByX(String x){
//        return indentDetailMapper.findByX(x);
//    }
    public List<IndentDetail> findByIndentId(int id){
        return indentDetailMapper.findByIndentId(id);
    }
    public void insert(IndentDetail indentDetail){
        indentDetailMapper.insert(indentDetail);
    }

    public void delete(IndentDetail indentDetail){
        indentDetailMapper.delete(indentDetail);
    }
}

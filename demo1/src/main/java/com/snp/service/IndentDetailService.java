package com.snp.service;

import com.snp.dto.IndentDetail;

import java.util.List;

public interface IndentDetailService {
    List<IndentDetail> findall();
    IndentDetail findById(IndentDetail indentDetail);
    //List<IndentDetail> findByX(String x);

    List<IndentDetail> findByIndentId(int id);
    void insert(IndentDetail indentDetail);
    void delete(IndentDetail indentDetail);
}

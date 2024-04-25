package com.snp.service;

import com.snp.dto.Indent;

import java.util.List;
import java.util.Map;

public interface IndentService {
    List<Indent> findall();
    Indent findById(int id);
    List<Indent> findByX(String x);
    void insert(Indent indent);
    void delete(int id);

    List<Indent> selectByClientName(String name);

    int selectLastId();

    void creatIndentFromClient(Map<String, Object> map);
}

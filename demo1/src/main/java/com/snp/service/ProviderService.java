package com.snp.service;

import com.snp.dto.Employee;
import com.snp.dto.Provider;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public interface ProviderService {
    List<Provider> findAll();
    List<Provider> findByX(String x);
    void insert(Provider provider);
    void delete(int id);

    BigDecimal selectNum(int id);

    List<Map<String, Object>> ff(int typeId);

    void upDate(Provider provider);
}

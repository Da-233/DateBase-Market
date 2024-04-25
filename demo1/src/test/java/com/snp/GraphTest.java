package com.snp;

import com.snp.dto.Employee;
import com.snp.dto.IndentDetail;
import com.snp.dto.Provider;
import com.snp.mapper.*;
import com.snp.service.EmployeeService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.snp.utils.ImageUtil.convertBase64StrToImage;

@SpringBootTest
public class GraphTest {
    @Autowired
    IndentMapper indentMapper;

    @Autowired
    IndentDetailMapper indentDetailMapper;
    @Resource
    ProviderMapper providerMapper;
    @Resource
    EmployeeService employeeService;

    @Resource
    EmployeeMapper employeeMapper;
    @Test
    public void Test1() throws IOException {
        Provider provider = providerMapper.findById(1);
        provider.setCity("天津");
        providerMapper.upDate(provider);
    }


}

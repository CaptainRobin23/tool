package com.project.tool.service.impl;

import com.project.tool.dao.CompanyInfoMapper;
import com.project.tool.model.CompanyInfo;
import com.project.tool.service.CompanyInfoService;
import com.project.tool.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: xueqin
 * @Description:
 * @Date: Created in 13:59 2018/7/5
 * @Modified:
 */
@Service
@Component
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    public Result getList() {
        Result result = new Result();
        List<CompanyInfo> companyInfos = companyInfoMapper.selectAll();
        return Result.build(1,"查询成功！",companyInfos);
    }
}

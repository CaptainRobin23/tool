package com.project.tool.service.impl;

import com.project.tool.dao.CompanyInfoMapper;
import com.project.tool.model.CompanyInfo;
import com.project.tool.service.CompanyInfoService;
import com.project.tool.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @Author: xueqin
 * @Description:
 * @Date: Created in 13:59 2018/7/5
 * @Modified:
 */
@Service
public class CompanyInfoServiceImpl implements CompanyInfoService {

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Override
    @Transactional(readOnly = true)
    public Result getList() {
        Result result = new Result();
        List<CompanyInfo> companyInfos = companyInfoMapper.selectAll();
        return Result.build(1,"查询成功！",companyInfos);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public Result saveOrUpdateCompanyInfos(List<CompanyInfo> companyInfos) {
        List<CompanyInfo> addCompanyInfos = new ArrayList<>();
        List<CompanyInfo> updateCompanyInfos = new ArrayList<>();
        companyInfos.forEach(companyInfo -> {
            if (StringUtils.isEmpty(companyInfo.getId())){
                companyInfo.setId(UUID.randomUUID().toString());
                companyInfo.setCreateTime(new Date());
                addCompanyInfos.add(companyInfo);
            }else {
                companyInfo.setUpdateTime(new Date());
                updateCompanyInfos.add(companyInfo);
            }
        });
        StringBuffer msg = new StringBuffer();
        Integer insertNum = 0;
        if (addCompanyInfos != null && addCompanyInfos.size()>0){
            insertNum = companyInfoMapper.batchInsertCompanyInfos(companyInfos);
            msg.append("新增数据").append(insertNum).append("条；").append("\\r\\n");
        }
        Integer updateNum = 0;
        if (updateCompanyInfos != null && updateCompanyInfos.size()>0){
            updateNum = companyInfoMapper.batchUpdateCompanyInfos(updateCompanyInfos);
            msg.append("更新数据").append(updateNum).append("条。");
        }
        return Result.build(1,msg.toString());
    }
}

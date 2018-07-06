package com.project.tool.dao;

import com.project.tool.model.CompanyInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CompanyInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(CompanyInfo record);

    int insertSelective(CompanyInfo record);

    CompanyInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(CompanyInfo record);

    int updateByPrimaryKey(CompanyInfo record);

    List<CompanyInfo> selectAll();

    Integer batchInsertCompanyInfos(List<CompanyInfo> companyInfos);

    Integer batchUpdateCompanyInfos(List<CompanyInfo> updateCompanyInfos);
}
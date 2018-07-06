package com.project.tool.service;

import com.project.tool.model.CompanyInfo;
import com.project.tool.util.Result;

import java.util.List;

/**
 * @Author: xueqin
 * @Description:
 * @Date: Created in 13:58 2018/7/5
 * @Modified:
 */
public interface CompanyInfoService {

    Result getList();

    Result saveOrUpdateCompanyInfos(List<CompanyInfo> companyInfos);
}

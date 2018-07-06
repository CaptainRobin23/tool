package com.project.tool.controller;

import com.project.tool.model.CompanyInfo;
import com.project.tool.service.CompanyInfoService;
import com.project.tool.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: xueqin
 * @Description:
 * @Date: Created in 10:01 2018/7/4
 * @Modified:
 */
@RestController
@RequestMapping("companyInfo")
public class CompanyInfoController {

    @Autowired
    private CompanyInfoService companyInfoService;

    @RequestMapping(value = "getInfo" ,method = RequestMethod.GET)
    public Result getInfo() {
        Result result = null;
        result  = companyInfoService.getList();
        return result;
    }

    @RequestMapping(value = "saveOrUpdateCompanyInfos" ,method = RequestMethod.POST)
    public Result saveOrUpdateCompanyInfos(@RequestBody List<CompanyInfo> companyInfos) {
        Result result = null;
        result  = companyInfoService.saveOrUpdateCompanyInfos(companyInfos);
        return result;
    }


}

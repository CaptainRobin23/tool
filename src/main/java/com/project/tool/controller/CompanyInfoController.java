package com.project.tool.controller;

import com.project.tool.service.CompanyInfoService;
import com.project.tool.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xueqin
 * @Description:
 * @Date: Created in 10:01 2018/7/4
 * @Modified:
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("companyInfo")
public class CompanyInfoController {

    @Autowired
    private CompanyInfoService companyInfoService;

    @RequestMapping("getInfo")
    public Result getInfo() {
        Result result = null;
        result  = companyInfoService.getList();
        return result;
    }
}

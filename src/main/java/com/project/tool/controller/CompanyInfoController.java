package com.project.tool.controller;

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
    /*@RequestMapping("getInfo")
    public CompanyInfo getInfo() {
        CompanyInfo companyInfo = new CompanyInfo();
        companyInfo.setName("test");
        return companyInfo;
    }*/
}

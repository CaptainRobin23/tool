package com.project.tool.dao;

import com.project.tool.model.ContractInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(ContractInfo record);

    int insertSelective(ContractInfo record);

    ContractInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(ContractInfo record);

    int updateByPrimaryKey(ContractInfo record);
}
package com.example.demo.dao;

import com.example.demo.model.BfmOrder;

public interface BfmOrderMapper {
    int deleteByPrimaryKey(Integer bfmOrderId);

    int insert(BfmOrder record);

    int insertSelective(BfmOrder record);

    BfmOrder selectByPrimaryKey(Integer bfmOrderId);

    int updateByPrimaryKeySelective(BfmOrder record);

    int updateByPrimaryKey(BfmOrder record);
}
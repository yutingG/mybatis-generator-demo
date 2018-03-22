package com.example.demo.dao;

import com.example.demo.model.AllOrder;

public interface AllOrderMapper {
    int deleteByPrimaryKey(Integer orderId);

    int insert(AllOrder record);

    int insertSelective(AllOrder record);

    AllOrder selectByPrimaryKey(Integer orderId);

    int updateByPrimaryKeySelective(AllOrder record);

    int updateByPrimaryKey(AllOrder record);
}
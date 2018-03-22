package com.example.demo.dao;

import com.example.demo.model.BfyOrderList;

public interface BfyOrderListMapper {
    int deleteByPrimaryKey(Integer bfyOrderListId);

    int insert(BfyOrderList record);

    int insertSelective(BfyOrderList record);

    BfyOrderList selectByPrimaryKey(Integer bfyOrderListId);

    int updateByPrimaryKeySelective(BfyOrderList record);

    int updateByPrimaryKey(BfyOrderList record);
}
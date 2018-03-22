package com.example.demo.dao;

import com.example.demo.model.BfyOrder;

public interface BfyOrderMapper {
    int deleteByPrimaryKey(Integer bfyOrderId);

    int insert(BfyOrder record);

    int insertSelective(BfyOrder record);

    BfyOrder selectByPrimaryKey(Integer bfyOrderId);

    int updateByPrimaryKeySelective(BfyOrder record);

    int updateByPrimaryKey(BfyOrder record);
}
package com.example.demo.dao;

import com.example.demo.model.ReceiveInfo;

public interface ReceiveInfoMapper {
    int deleteByPrimaryKey(Integer receiveInfoId);

    int insert(ReceiveInfo record);

    int insertSelective(ReceiveInfo record);

    ReceiveInfo selectByPrimaryKey(Integer receiveInfoId);

    int updateByPrimaryKeySelective(ReceiveInfo record);

    int updateByPrimaryKey(ReceiveInfo record);
}
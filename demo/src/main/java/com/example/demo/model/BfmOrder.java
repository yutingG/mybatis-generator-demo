package com.example.demo.model;

import java.util.Date;

public class BfmOrder {
    private Integer bfmOrderId;

    private String bfmOrderDes;

    private String bfmOrderCreator;

    private Date bfmOrderCreateTime;

    private Double bfmOrderMoney;

    private Integer bfmOrderReceiveInfoId;

    private Date bfmOrderTradeTime;

    private String bfmOrderType;

    private String bfmOrderGoods;

    private String bfmOrderShopName;

    private String bfmOrderStatus;

    public Integer getBfmOrderId() {
        return bfmOrderId;
    }

    public void setBfmOrderId(Integer bfmOrderId) {
        this.bfmOrderId = bfmOrderId;
    }

    public String getBfmOrderDes() {
        return bfmOrderDes;
    }

    public void setBfmOrderDes(String bfmOrderDes) {
        this.bfmOrderDes = bfmOrderDes == null ? null : bfmOrderDes.trim();
    }

    public String getBfmOrderCreator() {
        return bfmOrderCreator;
    }

    public void setBfmOrderCreator(String bfmOrderCreator) {
        this.bfmOrderCreator = bfmOrderCreator == null ? null : bfmOrderCreator.trim();
    }

    public Date getBfmOrderCreateTime() {
        return bfmOrderCreateTime;
    }

    public void setBfmOrderCreateTime(Date bfmOrderCreateTime) {
        this.bfmOrderCreateTime = bfmOrderCreateTime;
    }

    public Double getBfmOrderMoney() {
        return bfmOrderMoney;
    }

    public void setBfmOrderMoney(Double bfmOrderMoney) {
        this.bfmOrderMoney = bfmOrderMoney;
    }

    public Integer getBfmOrderReceiveInfoId() {
        return bfmOrderReceiveInfoId;
    }

    public void setBfmOrderReceiveInfoId(Integer bfmOrderReceiveInfoId) {
        this.bfmOrderReceiveInfoId = bfmOrderReceiveInfoId;
    }

    public Date getBfmOrderTradeTime() {
        return bfmOrderTradeTime;
    }

    public void setBfmOrderTradeTime(Date bfmOrderTradeTime) {
        this.bfmOrderTradeTime = bfmOrderTradeTime;
    }

    public String getBfmOrderType() {
        return bfmOrderType;
    }

    public void setBfmOrderType(String bfmOrderType) {
        this.bfmOrderType = bfmOrderType == null ? null : bfmOrderType.trim();
    }

    public String getBfmOrderGoods() {
        return bfmOrderGoods;
    }

    public void setBfmOrderGoods(String bfmOrderGoods) {
        this.bfmOrderGoods = bfmOrderGoods == null ? null : bfmOrderGoods.trim();
    }

    public String getBfmOrderShopName() {
        return bfmOrderShopName;
    }

    public void setBfmOrderShopName(String bfmOrderShopName) {
        this.bfmOrderShopName = bfmOrderShopName == null ? null : bfmOrderShopName.trim();
    }

    public String getBfmOrderStatus() {
        return bfmOrderStatus;
    }

    public void setBfmOrderStatus(String bfmOrderStatus) {
        this.bfmOrderStatus = bfmOrderStatus == null ? null : bfmOrderStatus.trim();
    }
}
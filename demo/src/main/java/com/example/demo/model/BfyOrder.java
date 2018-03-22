package com.example.demo.model;

import java.util.Date;

public class BfyOrder {
    private Integer bfyOrderId;

    private String bfyOrderCreator;

    private Date bfyOrderCreateTime;

    private Double bfyOrderMoney;

    private String bfyOrderAddress;

    private Date bfyOrderTradeTime;

    private String bfyOrderType;

    private String bfyOrderGoods;

    private String bfyOrderShopName;

    private String bfyOrderDes;

    private String bfyOrderStatus;

    private Integer bfyOrderMaxCount;

    private Integer bfyOrderMinCount;

    private Integer bfyOrderCurCount;

    public Integer getBfyOrderId() {
        return bfyOrderId;
    }

    public void setBfyOrderId(Integer bfyOrderId) {
        this.bfyOrderId = bfyOrderId;
    }

    public String getBfyOrderCreator() {
        return bfyOrderCreator;
    }

    public void setBfyOrderCreator(String bfyOrderCreator) {
        this.bfyOrderCreator = bfyOrderCreator == null ? null : bfyOrderCreator.trim();
    }

    public Date getBfyOrderCreateTime() {
        return bfyOrderCreateTime;
    }

    public void setBfyOrderCreateTime(Date bfyOrderCreateTime) {
        this.bfyOrderCreateTime = bfyOrderCreateTime;
    }

    public Double getBfyOrderMoney() {
        return bfyOrderMoney;
    }

    public void setBfyOrderMoney(Double bfyOrderMoney) {
        this.bfyOrderMoney = bfyOrderMoney;
    }

    public String getBfyOrderAddress() {
        return bfyOrderAddress;
    }

    public void setBfyOrderAddress(String bfyOrderAddress) {
        this.bfyOrderAddress = bfyOrderAddress == null ? null : bfyOrderAddress.trim();
    }

    public Date getBfyOrderTradeTime() {
        return bfyOrderTradeTime;
    }

    public void setBfyOrderTradeTime(Date bfyOrderTradeTime) {
        this.bfyOrderTradeTime = bfyOrderTradeTime;
    }

    public String getBfyOrderType() {
        return bfyOrderType;
    }

    public void setBfyOrderType(String bfyOrderType) {
        this.bfyOrderType = bfyOrderType == null ? null : bfyOrderType.trim();
    }

    public String getBfyOrderGoods() {
        return bfyOrderGoods;
    }

    public void setBfyOrderGoods(String bfyOrderGoods) {
        this.bfyOrderGoods = bfyOrderGoods == null ? null : bfyOrderGoods.trim();
    }

    public String getBfyOrderShopName() {
        return bfyOrderShopName;
    }

    public void setBfyOrderShopName(String bfyOrderShopName) {
        this.bfyOrderShopName = bfyOrderShopName == null ? null : bfyOrderShopName.trim();
    }

    public String getBfyOrderDes() {
        return bfyOrderDes;
    }

    public void setBfyOrderDes(String bfyOrderDes) {
        this.bfyOrderDes = bfyOrderDes == null ? null : bfyOrderDes.trim();
    }

    public String getBfyOrderStatus() {
        return bfyOrderStatus;
    }

    public void setBfyOrderStatus(String bfyOrderStatus) {
        this.bfyOrderStatus = bfyOrderStatus == null ? null : bfyOrderStatus.trim();
    }

    public Integer getBfyOrderMaxCount() {
        return bfyOrderMaxCount;
    }

    public void setBfyOrderMaxCount(Integer bfyOrderMaxCount) {
        this.bfyOrderMaxCount = bfyOrderMaxCount;
    }

    public Integer getBfyOrderMinCount() {
        return bfyOrderMinCount;
    }

    public void setBfyOrderMinCount(Integer bfyOrderMinCount) {
        this.bfyOrderMinCount = bfyOrderMinCount;
    }

    public Integer getBfyOrderCurCount() {
        return bfyOrderCurCount;
    }

    public void setBfyOrderCurCount(Integer bfyOrderCurCount) {
        this.bfyOrderCurCount = bfyOrderCurCount;
    }
}
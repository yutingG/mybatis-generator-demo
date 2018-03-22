package com.example.demo.model;

public class BfyOrderList {
    private Integer bfyOrderListId;

    private Integer bfyOrderId;

    private Integer bfyOrderReceiveInfoId;

    private String bfyOrderReceiver;

    private Integer bfyOrderCount;

    private Double bfyOrderMoney;

    public Integer getBfyOrderListId() {
        return bfyOrderListId;
    }

    public void setBfyOrderListId(Integer bfyOrderListId) {
        this.bfyOrderListId = bfyOrderListId;
    }

    public Integer getBfyOrderId() {
        return bfyOrderId;
    }

    public void setBfyOrderId(Integer bfyOrderId) {
        this.bfyOrderId = bfyOrderId;
    }

    public Integer getBfyOrderReceiveInfoId() {
        return bfyOrderReceiveInfoId;
    }

    public void setBfyOrderReceiveInfoId(Integer bfyOrderReceiveInfoId) {
        this.bfyOrderReceiveInfoId = bfyOrderReceiveInfoId;
    }

    public String getBfyOrderReceiver() {
        return bfyOrderReceiver;
    }

    public void setBfyOrderReceiver(String bfyOrderReceiver) {
        this.bfyOrderReceiver = bfyOrderReceiver == null ? null : bfyOrderReceiver.trim();
    }

    public Integer getBfyOrderCount() {
        return bfyOrderCount;
    }

    public void setBfyOrderCount(Integer bfyOrderCount) {
        this.bfyOrderCount = bfyOrderCount;
    }

    public Double getBfyOrderMoney() {
        return bfyOrderMoney;
    }

    public void setBfyOrderMoney(Double bfyOrderMoney) {
        this.bfyOrderMoney = bfyOrderMoney;
    }
}
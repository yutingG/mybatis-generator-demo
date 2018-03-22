package com.example.demo.model;

public class AllOrder {
    private Integer orderId;

    private String orderType;

    private String orderCreator;

    private Integer bfmOrderId;

    private Integer bfyOrderId;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderCreator() {
        return orderCreator;
    }

    public void setOrderCreator(String orderCreator) {
        this.orderCreator = orderCreator == null ? null : orderCreator.trim();
    }

    public Integer getBfmOrderId() {
        return bfmOrderId;
    }

    public void setBfmOrderId(Integer bfmOrderId) {
        this.bfmOrderId = bfmOrderId;
    }

    public Integer getBfyOrderId() {
        return bfyOrderId;
    }

    public void setBfyOrderId(Integer bfyOrderId) {
        this.bfyOrderId = bfyOrderId;
    }
}
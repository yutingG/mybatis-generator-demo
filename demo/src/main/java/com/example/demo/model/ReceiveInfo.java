package com.example.demo.model;

public class ReceiveInfo {
    private Integer receiveInfoId;

    private String receiveName;

    private String receivePhone;

    private String receiveAddress;

    private Integer receiveUserId;

    public Integer getReceiveInfoId() {
        return receiveInfoId;
    }

    public void setReceiveInfoId(Integer receiveInfoId) {
        this.receiveInfoId = receiveInfoId;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public Integer getReceiveUserId() {
        return receiveUserId;
    }

    public void setReceiveUserId(Integer receiveUserId) {
        this.receiveUserId = receiveUserId;
    }
}
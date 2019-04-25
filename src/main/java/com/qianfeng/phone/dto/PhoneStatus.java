package com.qianfeng.phone.dto;


public class PhoneStatus {

  private long phoneStatusId;
  private long clearConditionId;
  private long orderId;
  private long priceId;
  private String phoneStatusName;


  public long getPhoneStatusId() {
    return phoneStatusId;
  }

  public void setPhoneStatusId(long phoneStatusId) {
    this.phoneStatusId = phoneStatusId;
  }


  public long getClearConditionId() {
    return clearConditionId;
  }

  public void setClearConditionId(long clearConditionId) {
    this.clearConditionId = clearConditionId;
  }


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getPriceId() {
    return priceId;
  }

  public void setPriceId(long priceId) {
    this.priceId = priceId;
  }


  public String getPhoneStatusName() {
    return phoneStatusName;
  }

  public void setPhoneStatusName(String phoneStatusName) {
    this.phoneStatusName = phoneStatusName;
  }

}

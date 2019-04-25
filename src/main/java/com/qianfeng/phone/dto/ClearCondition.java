package com.qianfeng.phone.dto;


public class ClearCondition {

  private long clearConditionId;
  private long phoneStatusId;
  private long discountId;
  private String clearConditionName;
  private String clearConditionDescrible;


  public long getClearConditionId() {
    return clearConditionId;
  }

  public void setClearConditionId(long clearConditionId) {
    this.clearConditionId = clearConditionId;
  }


  public long getPhoneStatusId() {
    return phoneStatusId;
  }

  public void setPhoneStatusId(long phoneStatusId) {
    this.phoneStatusId = phoneStatusId;
  }


  public long getDiscountId() {
    return discountId;
  }

  public void setDiscountId(long discountId) {
    this.discountId = discountId;
  }


  public String getClearConditionName() {
    return clearConditionName;
  }

  public void setClearConditionName(String clearConditionName) {
    this.clearConditionName = clearConditionName;
  }


  public String getClearConditionDescrible() {
    return clearConditionDescrible;
  }

  public void setClearConditionDescrible(String clearConditionDescrible) {
    this.clearConditionDescrible = clearConditionDescrible;
  }

}

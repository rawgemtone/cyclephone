package com.qianfeng.phone.dto;


public class Discount {

  private long discountId;
  private long phoneTypeId;
  private long clearConditionId;
  private long discountMoney;


  public long getDiscountId() {
    return discountId;
  }

  public void setDiscountId(long discountId) {
    this.discountId = discountId;
  }


  public long getPhoneTypeId() {
    return phoneTypeId;
  }

  public void setPhoneTypeId(long phoneTypeId) {
    this.phoneTypeId = phoneTypeId;
  }


  public long getClearConditionId() {
    return clearConditionId;
  }

  public void setClearConditionId(long clearConditionId) {
    this.clearConditionId = clearConditionId;
  }


  public long getDiscountMoney() {
    return discountMoney;
  }

  public void setDiscountMoney(long discountMoney) {
    this.discountMoney = discountMoney;
  }

}

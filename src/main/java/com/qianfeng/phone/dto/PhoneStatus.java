package com.qianfeng.phone.dto;


import com.qianfeng.phone.dto.ClearCondition;

import java.util.List;

public class PhoneStatus {

  private long phoneStatusId;
  private long clearConditionId;
  private long pId;
  private long priceId;
  private String phoneStatusName;
  private long phoneTypeId;
  private long phonePage;

  private List<ClearCondition> clearCondition;

  public List<ClearCondition> getClearCondition() {
    return clearCondition;
  }

  public void setClearCondition(List<ClearCondition> clearCondition) {
    this.clearCondition = clearCondition;
  }

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


  public long getPId() {
    return pId;
  }

  public void setPId(long pId) {
    this.pId = pId;
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


  public long getPhoneTypeId() {
    return phoneTypeId;
  }

  public void setPhoneTypeId(long phoneTypeId) {
    this.phoneTypeId = phoneTypeId;
  }


  public long getPhonePage() {
    return phonePage;
  }

  public void setPhonePage(long phonePage) {
    this.phonePage = phonePage;
  }

}

package com.qianfeng.phone.dto;


public class PhoneBrand {

  private long brandId;
  private String brandName;

  @Override
  public String toString() {
    return "PhoneBrand{" +
            "brandId=" + brandId +
            ", brandName='" + brandName + '\'' +
            '}';
  }

  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

}

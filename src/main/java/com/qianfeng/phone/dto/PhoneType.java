package com.qianfeng.phone.dto;


public class PhoneType {

  private String phoneTypeName;
  private long phoneTypeId;
  private long brandId;
  private long discountId;
  private String phoneTypeImg;
  private int phonePrice;
  @Override
  public String toString() {
    return "PhoneType{" +
            "phoneTypeName='" + phoneTypeName + '\'' +
            ", phoneTypeId=" + phoneTypeId +
            ", brandId=" + brandId +
            ", discountId=" + discountId +
            ", phoneTypeImg='" + phoneTypeImg + '\'' +
            '}';
  }

  public int getPhonePrice() {
    return phonePrice;
  }

  public void setPhonePrice(int phonePrice) {
    this.phonePrice = phonePrice;
  }

  public String getPhoneTypeName() {
    return phoneTypeName;
  }

  public void setPhoneTypeName(String phoneTypeName) {
    this.phoneTypeName = phoneTypeName;
  }


  public long getPhoneTypeId() {
    return phoneTypeId;
  }

  public void setPhoneTypeId(long phoneTypeId) {
    this.phoneTypeId = phoneTypeId;
  }


  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }


  public long getDiscountId() {
    return discountId;
  }

  public void setDiscountId(long discountId) {
    this.discountId = discountId;
  }


  public String getPhoneTypeImg() {
    return phoneTypeImg;
  }

  public void setPhoneTypeImg(String phoneTypeImg) {
    this.phoneTypeImg = phoneTypeImg;
  }

}

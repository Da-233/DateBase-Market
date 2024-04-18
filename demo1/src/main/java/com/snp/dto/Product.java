package com.snp.dto;

import java.math.BigDecimal;

public class Product {
    int id;
    String name;
    String unitNum;
    int providerId;
    int typeId;
    BigDecimal price;
    int stockNum;
    int orderNum;
    int purchaseNum;
    int state;
    String remark;

    public Product() {
    }

    public Product(int id, String name, String unitNum, int providerId, int typeId, BigDecimal price, int stockNum, int orderNum, int purchaseNum, int state, String remark) {
        this.id = id;
        this.name = name;
        this.unitNum = unitNum;
        this.providerId = providerId;
        this.typeId = typeId;
        this.price = price;
        this.stockNum = stockNum;
        this.orderNum = orderNum;
        this.purchaseNum = purchaseNum;
        this.state = state;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setStockNum(int stockNum) {
        this.stockNum = stockNum;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(int purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unitNum='" + unitNum + '\'' +
                ", providerId=" + providerId +
                ", typeId=" + typeId +
                ", price=" + price +
                ", stockNum=" + stockNum +
                ", orderNum=" + orderNum +
                ", purchaseNum=" + purchaseNum +
                ", state=" + state +
                ", remark='" + remark + '\'' +
                '}';
    }
}

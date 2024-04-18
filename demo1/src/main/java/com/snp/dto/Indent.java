package com.snp.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Indent {
    int id;
    String clientId;
    int employId;
    LocalDateTime orderDate;
    LocalDateTime startTime;
    LocalDateTime arrivTime;
    LocalDateTime checkTime;
    BigDecimal shipFee;
    String ownName;
    String ownAdd;
    String ownCity;
    String ownRegion;
    String ownPost;
    String ownCountry;
    LocalDateTime lastStateTime;
    String lastState;
    String remark;

    public Indent() {
    }

    public Indent(int id, String clientId, int employId, LocalDateTime orderDate, LocalDateTime startTime, LocalDateTime arrivTime, LocalDateTime checkTime, BigDecimal shipFee, String ownName, String ownAdd, String ownCity, String ownRegion, String ownPost, String ownCountry, LocalDateTime lastStateTime, String lastState, String remark) {
        this.id = id;
        this.clientId = clientId;
        this.employId = employId;
        this.orderDate = orderDate;
        this.startTime = startTime;
        this.arrivTime = arrivTime;
        this.checkTime = checkTime;
        this.shipFee = shipFee;
        this.ownName = ownName;
        this.ownAdd = ownAdd;
        this.ownCity = ownCity;
        this.ownRegion = ownRegion;
        this.ownPost = ownPost;
        this.ownCountry = ownCountry;
        this.lastStateTime = lastStateTime;
        this.lastState = lastState;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public int getEmployId() {
        return employId;
    }

    public void setEmployId(int employId) {
        this.employId = employId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getArrivTime() {
        return arrivTime;
    }

    public void setArrivTime(LocalDateTime arrivTime) {
        this.arrivTime = arrivTime;
    }

    public LocalDateTime getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(LocalDateTime checkTime) {
        this.checkTime = checkTime;
    }

    public BigDecimal getShipFee() {
        return shipFee;
    }

    public void setShipFee(BigDecimal shipFee) {
        this.shipFee = shipFee;
    }

    public String getOwnName() {
        return ownName;
    }

    public void setOwnName(String ownName) {
        this.ownName = ownName;
    }

    public String getOwnAdd() {
        return ownAdd;
    }

    public void setOwnAdd(String ownAdd) {
        this.ownAdd = ownAdd;
    }

    public String getOwnCity() {
        return ownCity;
    }

    public void setOwnCity(String ownCity) {
        this.ownCity = ownCity;
    }

    public String getOwnRegion() {
        return ownRegion;
    }

    public void setOwnRegion(String ownRegion) {
        this.ownRegion = ownRegion;
    }

    public String getOwnPost() {
        return ownPost;
    }

    public void setOwnPost(String ownPost) {
        this.ownPost = ownPost;
    }

    public String getOwnCountry() {
        return ownCountry;
    }

    public void setOwnCountry(String ownCountry) {
        this.ownCountry = ownCountry;
    }

    public LocalDateTime getLastStateTime() {
        return lastStateTime;
    }

    public void setLastStateTime(LocalDateTime lastStateTime) {
        this.lastStateTime = lastStateTime;
    }

    public String getLastState() {
        return lastState;
    }

    public void setLastState(String lastState) {
        this.lastState = lastState;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Indent{" +
                "id=" + id +
                ", clientId='" + clientId + '\'' +
                ", employId=" + employId +
                ", orderDate=" + orderDate +
                ", startTime=" + startTime +
                ", arrivTime=" + arrivTime +
                ", checkTime=" + checkTime +
                ", shipFee=" + shipFee +
                ", ownName='" + ownName + '\'' +
                ", ownAdd='" + ownAdd + '\'' +
                ", ownCity='" + ownCity + '\'' +
                ", ownRegion='" + ownRegion + '\'' +
                ", ownPost='" + ownPost + '\'' +
                ", ownCountry='" + ownCountry + '\'' +
                ", lastStateTime=" + lastStateTime +
                ", lastState='" + lastState + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}

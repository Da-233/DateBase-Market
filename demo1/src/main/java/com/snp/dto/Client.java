package com.snp.dto;

import jdk.jfr.DataAmount;

import java.time.LocalDateTime;
 
public class Client {
    private String id;
    private String firmId;
    private String contactName;
    private String contactJob;
    private String address;
    private String city;
    private String region;
    private String postalCoda;
    private String country;
    private String phoneNum;
    private String email;
    private LocalDateTime regDate;

    public Client() {
    }

    public Client(String id, String firmId, String contactName, String contactJob, String address, String city, String region, String postalCoda, String country, String phoneNum, String email, LocalDateTime regDate) {
        this.id = id;
        this.firmId = firmId;
        this.contactName = contactName;
        this.contactJob = contactJob;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCoda = postalCoda;
        this.country = country;
        this.phoneNum = phoneNum;
        this.email = email;
        this.regDate = regDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirmId() {return firmId;}

    public void setFirmId(String firmId) {
        this.firmId = firmId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactJob() {
        return contactJob;
    }

    public void setContactJob(String contactJob) {
        this.contactJob = contactJob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {return region;}

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCoda() {
        return postalCoda;
    }

    public void setPostalCoda(String postalCoda) {
        this.postalCoda = postalCoda;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDateTime regDate) {
        this.regDate = regDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id='" + id + '\'' +
                ", firmId='" + firmId + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactJob='" + contactJob + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", postalCoda='" + postalCoda + '\'' +
                ", country='" + country + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", regDate=" + regDate +
                '}';
    }

}

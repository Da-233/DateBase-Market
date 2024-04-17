package com.snp.dto;

import java.time.LocalDateTime;
 
public class Client {
    private String name;
    private int id;
    private String firmName;
    private String contactName;
    private String contactJob;
    private String address;
    private String city;
    private String region;
    private String postCode;
    private String country;
    private String phoneNum;
    private String email;
    private LocalDateTime registerDate;

    public Client() {
    }

    public Client(String name, int id, String firmName, String contactName, String contactJob, String address, String city, String region, String postCode, String country, String phoneNum, String email, LocalDateTime registerDate) {
        this.name = name;
        this.id = id;
        this.firmName = firmName;
        this.contactName = contactName;
        this.contactJob = contactJob;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postCode = postCode;
        this.country = country;
        this.phoneNum = phoneNum;
        this.email = email;
        this.registerDate = registerDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirmName() {
        return firmName;
    }

    public void setFirmName(String firmName) {
        this.firmName = firmName;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCoda) {
        this.postCode = postCoda;
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

    public LocalDateTime getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", firmName='" + firmName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactJob='" + contactJob + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", postCoda='" + postCode + '\'' +
                ", country='" + country + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", email='" + email + '\'' +
                ", registerDate=" + registerDate +
                '}';
    }
}

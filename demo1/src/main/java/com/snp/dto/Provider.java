package com.snp.dto;

public class Provider {
    private int id;
    private String firmName;
    private String contactName;
    private String contactJob;
    private String country;
    private String region;
    private String city;
    private String address;
    private String postCode;
    private String phoneNum;
    private String faxNum;
    private String hostpage;

    public Provider() {
    }

    public Provider(int id, String firmName, String contactName, String contactJob, String country, String region, String city, String address, String postCode, String phoneNum, String faxNum, String hostpage) {
        this.id = id;
        this.firmName = firmName;
        this.contactName = contactName;
        this.contactJob = contactJob;
        this.country = country;
        this.region = region;
        this.city = city;
        this.address = address;
        this.postCode = postCode;
        this.phoneNum = phoneNum;
        this.faxNum = faxNum;
        this.hostpage = hostpage;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getFaxNum() {
        return faxNum;
    }

    public void setFaxNum(String faxNum) {
        this.faxNum = faxNum;
    }

    public String getHostpage() {
        return hostpage;
    }

    public void setHostpage(String hostpage) {
        this.hostpage = hostpage;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "id=" + id +
                ", firmName='" + firmName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactJob='" + contactJob + '\'' +
                ", country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", postCode='" + postCode + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", faxNum='" + faxNum + '\'' +
                ", hostpage='" + hostpage + '\'' +
                '}';
    }
}

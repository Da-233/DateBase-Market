package com.snp.dto;

public class Provider {
    private int id;
    private String firm_name;
    private String contactName;
    private String contactJod;
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

    public Provider(int id, String firm_name, String contactName, String contactJod, String country, String region, String city, String address, String postCode, String phoneNum, String faxNum, String hostpage) {
        this.id = id;
        this.firm_name = firm_name;
        this.contactName = contactName;
        this.contactJod = contactJod;
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

    public String getFirm_name() {
        return firm_name;
    }

    public void setFirm_name(String firm_name) {
        this.firm_name = firm_name;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactJod() {
        return contactJod;
    }

    public void setContactJod(String contactJod) {
        this.contactJod = contactJod;
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
                ", firm_name='" + firm_name + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactJod='" + contactJod + '\'' +
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

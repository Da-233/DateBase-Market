package com.snp.dto;

import java.time.LocalDateTime;

public class Employee {
    int id;
    String surname;
    String name;
    String job;
    String honName;
    LocalDateTime birthDate;
    LocalDateTime workDate;
    String phoneNum;
    String innerPhone;
    String country;
    String region;
    String city;
    String address;
    String postCode;
    String graph;
    String email;
    String remark;
    int leader;

    int indentNum;

    public Employee() {
    }

    public Employee(int id, String surname, String name, String job, String honName, LocalDateTime birthDate, LocalDateTime workDate, String phoneNum, String innerPhone, String country, String region, String city, String address, String postCode, String graph, String email, String remark, int leader, int indentNum) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.job = job;
        this.honName = honName;
        this.birthDate = birthDate;
        this.workDate = workDate;
        this.phoneNum = phoneNum;
        this.innerPhone = innerPhone;
        this.country = country;
        this.region = region;
        this.city = city;
        this.address = address;
        this.postCode = postCode;
        this.graph = graph;
        this.email = email;
        this.remark = remark;
        this.leader = leader;
        this.indentNum = indentNum;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHonName() {
        return honName;
    }

    public void setHonName(String honName) {
        this.honName = honName;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public LocalDateTime getWorkDate() {
        return workDate;
    }

    public void setWorkDate(LocalDateTime workDate) {
        this.workDate = workDate;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getInnerPhone() {
        return innerPhone;
    }

    public void setInnerPhone(String innerPhone) {
        this.innerPhone = innerPhone;
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

    public String getGraph() {
        return graph;
    }

    public void setGraph(String graph) {
        this.graph = graph;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getLeader() {
        return leader;
    }

    public void setLeader(int leader) {
        this.leader = leader;
    }

    public int getIndentNum() {
        return indentNum;
    }

    public void setIndentNum(int indentNum) {
        this.indentNum = indentNum;
    }

    @Override
    public String toString() {
        return "Employee{" +
               "id=" + id +
               ", surname='" + surname + '\'' +
               ", name='" + name + '\'' +
               ", job='" + job + '\'' +
               ", honName='" + honName + '\'' +
               ", birthDate=" + birthDate +
               ", workDate=" + workDate +
               ", phoneNum='" + phoneNum + '\'' +
               ", innerPhone='" + innerPhone + '\'' +
               ", country='" + country + '\'' +
               ", region='" + region + '\'' +
               ", city='" + city + '\'' +
               ", address='" + address + '\'' +
               ", postCode='" + postCode + '\'' +
               ", graph='" + graph + '\'' +
               ", email='" + email + '\'' +
               ", remark='" + remark + '\'' +
               ", leader=" + leader +
               ", indentNum=" + indentNum +
               '}';
    }
}

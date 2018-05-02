package com.whut.shuini.entity;

import java.util.Date;

public class TbCom {
    private Integer id;

    private Integer regionid;

    private String name;

    private String address;

    private String postcode;

    private Integer capacity;

    private String status;

    private String phonenumber;

    private Integer yearcapacity;

    private String remark;

    private String invitedperson;

    private String wjtitle;

    private Date startdate;

    private Date enddate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegionid() {
        return regionid;
    }

    public void setRegionid(Integer regionid) {
        this.regionid = regionid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber == null ? null : phonenumber.trim();
    }

    public Integer getYearcapacity() {
        return yearcapacity;
    }

    public void setYearcapacity(Integer yearcapacity) {
        this.yearcapacity = yearcapacity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInvitedperson() {
        return invitedperson;
    }

    public void setInvitedperson(String invitedperson) {
        this.invitedperson = invitedperson == null ? null : invitedperson.trim();
    }

    public String getWjtitle() {
        return wjtitle;
    }

    public void setWjtitle(String wjtitle) {
        this.wjtitle = wjtitle == null ? null : wjtitle.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}
package com.bootdo.promana.domain;

import java.io.Serializable;
import java.util.Date;

public class ProjectDO implements Serializable {
    private static final long serialVersionUID = 1L;

    // 项目编号
    private String id;

    // 项目名称
    private String name;

    // 年份
    private String year;

    // 用户单位
    private String userDept;

    // 项目和参与情况
    private String situation;

    // 报名地点
    private String regiPlace;

    // 报名时间
    private Date regiDate;

    // 开标地点
    private String bidsPlace;

    // 开标时间
    private Date bidsDate;

    // 项目预算
    private Long budget;

    // 采购单位传真
    private String fax;

    // 采购合同1
    private String contract_1;

    // 采购合同2
    private String contract_2;

    // 报名资格特殊要求
    private String regiReq;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getUserDept() {
        return userDept;
    }

    public void setUserDept(String userDept) {
        this.userDept = userDept;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getRegiPlace() {
        return regiPlace;
    }

    public void setRegiPlace(String regiPlace) {
        this.regiPlace = regiPlace;
    }

    public Date getRegiDate() {
        return regiDate;
    }

    public void setRegiDate(Date regiDate) {
        this.regiDate = regiDate;
    }

    public String getBidsPlace() {
        return bidsPlace;
    }

    public void setBidsPlace(String bidsPlace) {
        this.bidsPlace = bidsPlace;
    }

    public Date getBidsDate() {
        return bidsDate;
    }

    public void setBidsDate(Date bidsDate) {
        this.bidsDate = bidsDate;
    }

    public Long getBudget() {
        return budget;
    }

    public void setBudget(Long budget) {
        this.budget = budget;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getContract_1() {
        return contract_1;
    }

    public void setContract_1(String contract_1) {
        this.contract_1 = contract_1;
    }

    public String getContract_2() {
        return contract_2;
    }

    public void setContract_2(String contract_2) {
        this.contract_2 = contract_2;
    }

    public String getRegiReq() {
        return regiReq;
    }

    public void setRegiReq(String regiReq) {
        this.regiReq = regiReq;
    }

    @Override
    public String toString() {
        return "ProjectDO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", year='" + year + '\'' +
                ", userDept='" + userDept + '\'' +
                ", situation='" + situation + '\'' +
                ", regiPlace='" + regiPlace + '\'' +
                ", regiDate=" + regiDate +
                ", bidsPlace='" + bidsPlace + '\'' +
                ", bidsDate=" + bidsDate +
                ", budget=" + budget +
                ", fax='" + fax + '\'' +
                ", contract_1='" + contract_1 + '\'' +
                ", contract_2='" + contract_2 + '\'' +
                ", regiReq='" + regiReq + '\'' +
                '}';
    }
}

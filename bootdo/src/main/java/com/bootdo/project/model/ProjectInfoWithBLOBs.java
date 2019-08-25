package com.bootdo.project.model;

public class ProjectInfoWithBLOBs extends ProjectInfo {
    private String projectNoticeValue;

    private String other;

    public String getProjectNoticeValue() {
        return projectNoticeValue;
    }

    public void setProjectNoticeValue(String projectNoticeValue) {
        this.projectNoticeValue = projectNoticeValue == null ? null : projectNoticeValue.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}
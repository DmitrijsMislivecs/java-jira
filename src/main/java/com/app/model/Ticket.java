package com.app.model;

public class Ticket {
    private long id;
    private String summary;
    private String description;
    private long statusId;
    //private long reporterId;
    private User user;
    private long assignId;
    private long projectId;
    private String type;
    private long sprintId;
    private long labelId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getStatusId() {
        return statusId;
    }

    public void setStatusId(long statusId) {
        this.statusId = statusId;
    }

    //public long getReporterId() {
    //    return reporterId;
    //}

    //public void setReporterId(long reporterId) {
    //    this.reporterId = reporterId;
    //}


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getAssignId() {
        return assignId;
    }

    public void setAssignId(long assignId) {
        this.assignId = assignId;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getSprintId() {
        return sprintId;
    }

    public void setSprintId(long sprintId) {
        this.sprintId = sprintId;
    }

    public long getLabelId() {
        return labelId;
    }

    public void setLabelId(long labelId) {
        this.labelId = labelId;
    }
}

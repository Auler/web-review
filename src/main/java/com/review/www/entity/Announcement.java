package com.review.www.entity;

import java.util.Date;

public class Announcement {
    private String id;

    private String classThreeId;

    private String title;

    private String content;

    private Date startTime;

    private Date endTime;

    private Boolean isDeleted;

    private String creator;

    private Date creationTime;

    private String backupOne;

    private String backupTwo;

    private String backupThree;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getClassThreeId() {
        return classThreeId;
    }

    public void setClassThreeId(String classThreeId) {
        this.classThreeId = classThreeId == null ? null : classThreeId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getBackupOne() {
        return backupOne;
    }

    public void setBackupOne(String backupOne) {
        this.backupOne = backupOne == null ? null : backupOne.trim();
    }

    public String getBackupTwo() {
        return backupTwo;
    }

    public void setBackupTwo(String backupTwo) {
        this.backupTwo = backupTwo == null ? null : backupTwo.trim();
    }

    public String getBackupThree() {
        return backupThree;
    }

    public void setBackupThree(String backupThree) {
        this.backupThree = backupThree == null ? null : backupThree.trim();
    }
}
package com.review.www.entity;

import java.util.Date;

public class Expert {
    private String id;

    private String title;

    private String degree;

    private String avatar;

    private String number;

    private String phone;

    private String name;

    private String password;

    private String email;

    private String disciplineCategory;

    private String post;

    private String school;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getDisciplineCategory() {
        return disciplineCategory;
    }

    public void setDisciplineCategory(String disciplineCategory) {
        this.disciplineCategory = disciplineCategory == null ? null : disciplineCategory.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
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
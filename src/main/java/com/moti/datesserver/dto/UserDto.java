package com.moti.datesserver.dto;

import com.moti.datesserver.enums.Gender;
import com.moti.datesserver.enums.UserType;
import com.moti.datesserver.enums.WhatToSee;

import javax.persistence.Column;

public class UserDto {
    private long id;
    private String userName;
    private UserType userType;
    private String name;
    private String poneNumber;
    private Gender gender;



    private int dateOfBirth;

    private String describeYou;

    private WhatToSee whatToSee;

    private String introductionPurpose;

    public UserDto(long id, String userName, UserType userType, String name, String poneNumber, Gender gender, int dateOfBirth,
                   String describeYou, WhatToSee whatToSee, String introductionPurpose) {
        this.id = id;
        this.userName = userName;
        this.userType = userType;
        this.name = name;
        this.poneNumber = poneNumber;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.describeYou = describeYou;
        this.whatToSee = whatToSee;
        this.introductionPurpose = introductionPurpose;
    }

    public UserDto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPoneNumber() {
        return poneNumber;
    }

    public void setPoneNumber(String poneNumber) {
        this.poneNumber = poneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDescribeYou() {
        return describeYou;
    }

    public void setDescribeYou(String describeYou) {
        this.describeYou = describeYou;
    }

    public WhatToSee getWhatToSee() {
        return whatToSee;
    }

    public void setWhatToSee(WhatToSee whatToSee) {
        this.whatToSee = whatToSee;
    }

    public String getIntroductionPurpose() {
        return introductionPurpose;
    }

    public void setIntroductionPurpose(String introductionPurpose) {
        this.introductionPurpose = introductionPurpose;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userType=" + userType +
                ", poneNumber='" + poneNumber + '\'' +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", describeYou='" + describeYou + '\'' +
                ", whatToSee=" + whatToSee +
                ", introductionPurpose='" + introductionPurpose + '\'' +
                '}';
    }
}

package com.moti.datesserver.entities;

import com.moti.datesserver.enums.Gender;
import com.moti.datesserver.enums.UserType;
import com.moti.datesserver.enums.WhatToSee;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Enumerated(EnumType.STRING)
    @Column(name = "user_type", nullable = false)
    private UserType userType;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "phone_number", nullable = false)
    private String poneNumber;

    @Column(name = "gender", nullable = false)
    private Gender gender;

    @Column(name="name",nullable = false)
    private String name;
    @Column(name="date_of_birth",nullable = false)
    private int dateOfBirth;
    @Column(name="describe_you" ,nullable = false)
    private String describeYou;
    @Column(name="what_to_see" ,nullable = false)
    private WhatToSee whatToSee;
    @Column(name="introduction_purpose",nullable = false)
    private String introductionPurpose;


    public UserEntity(long id, String userName, UserType userType, String password, String poneNumber,
                      Gender gender, String name, int dateOfBirth,
                      String describeYou, WhatToSee whatToSee, String introductionPurpose) {
        this.id = id;
        this.userName = userName;
        this.userType = userType;
        this.password = password;
        this.poneNumber = poneNumber;
        this.gender = gender;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.describeYou = describeYou;
        this.whatToSee = whatToSee;
        this.introductionPurpose = introductionPurpose;
    }

    public UserEntity() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userType=" + userType +
                ", password='" + password + '\'' +
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


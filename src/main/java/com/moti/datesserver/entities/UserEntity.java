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
    @Column(name="first_Name",nullable = false)
    private String firstName;
    @Column(name="last_Name",nullable = false)
    private String lastName;
    @Column(name="date_of_birth",nullable = false)
    private  Date dateOfBirth;
    @Column(name="information_About_Myself" ,nullable = false)
    private String informationAboutMyself;
    @Column(name="i_am_looking_for" ,nullable = false)
    private Gender  lookingFor;
    @Column(name="introduction_purpose",nullable = false)
    private MeetingPurpose introductionPurpose;
//vdvd


    public UserEntity(long id, String userName, UserType userType, String password, String poneNumber, Gender gender, String name, String name1, Date dateOfBirth, String informationAboutMyself, Gender lookingFor, MeetingPurpose introductionPurpose) {
        this.id = id;
        this.userName = userName;
        this.userType = userType;
        this.password = password;
        this.poneNumber = poneNumber;
        this.gender = gender;
        this.name = name;
        this.name = name1;
        this.dateOfBirth = dateOfBirth;
        this.informationAboutMyself = informationAboutMyself;
        this.lookingFor = lookingFor;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getInformationAboutMyself() {
        return informationAboutMyself;
    }

    public void setInformationAboutMyself(String informationAboutMyself) {
        this.informationAboutMyself = informationAboutMyself;
    }

    public Gender getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(Gender lookingFor) {
        this.lookingFor = lookingFor;
    }

    public MeetingPurpose getIntroductionPurpose() {
        return introductionPurpose;
    }

    public void setIntroductionPurpose(MeetingPurpose introductionPurpose) {
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


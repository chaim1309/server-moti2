package com.moti.datesserver.dto;

import com.moti.datesserver.enums.UserType;

public class UserDto {
    private long id;
    private String userName;
    private UserType userType;

    public UserDto(long id, String userName, UserType userType) {
        this.id = id;
        this.userName = userName;
        this.userType = userType;
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

    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userType=" + userType +
                '}';
    }
}

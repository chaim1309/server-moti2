package com.moti.datesserver.dto;

import com.moti.datesserver.enums.UserType;

public class SuccessfulLoginDto {
    private long id;
    private UserType userType;

    public SuccessfulLoginDto(long id, UserType userType) {
        this.id = id;
        this.userType = userType;
    }

    public SuccessfulLoginDto() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }


    @Override
    public String toString() {
        return "SuccesfulLoginDto{" +
                "id=" + id +
                ", userType=" + userType +
                '}';
    }
}

package com.moti.datesserver.entities;

import com.moti.datesserver.enums.UserType;

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

    public UserEntity(long id, String userName, UserType userType, String password) {
        this.id = id;
        this.userName = userName;
        this.userType = userType;
        this.password = password;
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

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userType=" + userType +
                ", password='" + password + '\'' +
                '}';
    }
}


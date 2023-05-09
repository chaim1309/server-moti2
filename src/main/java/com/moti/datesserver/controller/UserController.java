package com.moti.datesserver.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.moti.datesserver.dto.LoginDto;
import com.moti.datesserver.dto.UserDto;
import com.moti.datesserver.entities.UserEntity;
import com.moti.datesserver.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    UserLogic userLogic;

    @Autowired
    public UserController(UserLogic userLogic) {
        this.userLogic = userLogic;
    }

    @PostMapping("/login")
    public String loginVerification(@RequestBody LoginDto loginDto) throws Exception {
        String userTokenData = userLogic.login(loginDto);
        return userTokenData;
    }

    @PostMapping
    public void createUser(@RequestBody UserEntity user) {
        userLogic.createUser(user);

    }


    @PutMapping
    public void updateUser(@RequestBody UserEntity user) {
        userLogic.updateUser(user);


    }

    @GetMapping("{userId}")
    public UserDto getUser(@PathVariable("userId") long id) {

        UserDto user = userLogic.getUser(id);
        return user;
    }

    @DeleteMapping("{userId}")
    public void deleteCoupon(@PathVariable("userId") long id) {
        userLogic.removeUser(id);


    }

    @GetMapping
    public List<UserDto> getUsers(@RequestParam("pageNumber") int pageNumber) {

        List<UserDto> users = userLogic.getUsers(pageNumber);

     return users;
    }
}
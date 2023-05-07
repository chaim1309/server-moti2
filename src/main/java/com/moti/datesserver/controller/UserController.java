package com.moti.datesserver.controller;

import com.moti.datesserver.dto.LoginDto;
import com.moti.datesserver.logic.UserLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

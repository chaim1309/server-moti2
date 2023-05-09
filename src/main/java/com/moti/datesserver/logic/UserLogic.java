package com.moti.datesserver.logic;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.moti.datesserver.dal.IUserDal;
import com.moti.datesserver.dto.LoginDto;
import com.moti.datesserver.dto.SuccessfulLoginDto;
import com.moti.datesserver.dto.UserDto;
import com.moti.datesserver.entities.UserEntity;
import com.moti.datesserver.util.JWTUtils;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserLogic {
    private IUserDal iUserDal;

    public UserLogic(IUserDal iUserDal) {
        this.iUserDal = iUserDal;
    }


    //Login function!
    public String login(LoginDto userLoginDetails) throws Exception {
        SuccessfulLoginDto userData = iUserDal.findLoginUser(userLoginDetails.getUserName(), userLoginDetails.getPassword());
        //Validation - if null - no such
        if (userData == null) {
            throw new Exception("Sorry, this user does not exists");
        }
        String token = JWTUtils.createJWT(userData);
        return token;
    }
    public Long createUser(UserEntity user)  {



        iUserDal.save(user);


        return user.getId();
    }




    public void removeUser(long id) {

        iUserDal.deleteById(id);


    }

    public void updateUser(UserEntity user)  {


        iUserDal.save(user);

    }


    public UserDto getUser(long id) {
        UserDto user;

            user = iUserDal.findUserById(id);

        return user;

    }

    public List<UserDto> getUsers(int pageNumber)  {
        List<UserDto> users;
        Pageable pageable = PageRequest.of(pageNumber - 1,5);

            users = iUserDal.findAll(pageable);

        return users;
    }




}

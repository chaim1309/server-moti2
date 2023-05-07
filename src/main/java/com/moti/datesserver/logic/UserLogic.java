package com.moti.datesserver.logic;

import com.moti.datesserver.dal.IUserDal;
import com.moti.datesserver.dto.LoginDto;
import com.moti.datesserver.dto.SuccessfulLoginDto;
import com.moti.datesserver.util.JWTUtils;
import org.springframework.stereotype.Service;

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

}

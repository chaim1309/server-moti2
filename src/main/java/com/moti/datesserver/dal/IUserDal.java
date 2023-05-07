package com.moti.datesserver.dal;

import com.moti.datesserver.dto.SuccessfulLoginDto;
import com.moti.datesserver.entities.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDal extends CrudRepository<UserEntity, Long> {

    @Query("SELECT NEW com.moti.datesserver.dto.SuccessfulLoginDto(us.id,us.userType)  FROM " +
            "UserEntity us " +
            "WHERE us.userName= :userName AND us.password= :password")
    SuccessfulLoginDto findLoginUser(@Param("userName") String userName, @Param("password") String password);
}

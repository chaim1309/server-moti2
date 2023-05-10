package com.moti.datesserver.dal;

import com.moti.datesserver.dto.SuccessfulLoginDto;
import com.moti.datesserver.dto.UserDto;
import com.moti.datesserver.entities.UserEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDal extends CrudRepository<UserEntity, Long> {

    @Query("SELECT NEW com.moti.datesserver.dto.SuccessfulLoginDto(us.id,us.userType)  FROM " +
            "UserEntity us " +
            "WHERE us.userName= :userName AND us.password= :password")
    SuccessfulLoginDto findLoginUser(@Param("userName") String userName, @Param("password") String password);



    @Query("SELECT new com.moti.datesserver.dto.UserDto(u.id,u.userName ,u.userType,u.name,u.poneNumber,u.gender," +
            "u.dateOfBirth,u.describeYou,u.whatToSee,u.introductionPurpose)  from UserEntity u " +
            " where u.id = :id")
    UserDto findUserById(@Param("id")long id);

    @Query("SELECT new com.moti.datesserver.dto.UserDto(u.id,u.userName ,u.userType,u.name,u.poneNumber,u.gender," +
            "u.dateOfBirth,u.describeYou,u.whatToSee,u.introductionPurpose)  from UserEntity u " +
            " ")
    List<UserDto> findAll(Pageable pageable);


}




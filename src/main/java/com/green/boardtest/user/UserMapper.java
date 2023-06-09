package com.green.boardtest.user;

import com.green.boardtest.user.model.UserInsDto;
import com.green.boardtest.user.model.UserLoginDto;
import com.green.boardtest.user.model.UserLoginVo;
import com.green.boardtest.user.model.UserUpdDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int insUser(UserInsDto dto);
    UserLoginVo selByIdUser(UserLoginDto dto);
}

package com.green.boardtest.user;

import com.green.boardtest.user.model.UserInsDto;
import com.green.boardtest.user.model.UserLoginDto;
import com.green.boardtest.user.model.UserLoginVo;
import com.green.boardtest.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserMapper MAPPER;
    private final CommonUtils UTILS;

    @Autowired
    public UserService(UserMapper MAPPER, CommonUtils UTILS) {
        this.MAPPER = MAPPER;
        this.UTILS = UTILS;
    }

    public int insUser(UserInsDto dto) {

       char gender = Character.toUpperCase(dto.getGender());
       if(!(gender == 'F' || gender == 'M')) {
           return -1;
       }
       dto.setGender(gender);

       String hashPw = UTILS.encodeSha256(dto.getUpw());
       dto.setUpw(hashPw);

       try {
           return MAPPER.insUser(dto);
       } catch (Exception e) {
           e.printStackTrace();
           return 0;
       }
    }

    public int login(UserLoginDto dto) {
        UserLoginVo vo = MAPPER.selByIdUser(dto);
        if(vo == null) { //아이디 없음
            return 2;
        }

        String pw = UTILS.encodeSha256(dto.getUpw());
        if(vo.getUpw().equals(pw)) { // 로그인 성공
            return 1;
        }
        return 3; //비밀번호 다름
        // 나는 김재경이 귀엽지 후후호호
    }








}

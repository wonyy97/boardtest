package com.green.boardtest.user.model;

import lombok.Data;

@Data
public class UserLoginVo {
    private int iuser;
    private String uid;
    private String upw;
    private String nm;
    private char gender;
    private String addr;
    private String mainPic;

}

package com.green.boardtest.user.model;

import lombok.Data;

@Data
public class UserUpdDto {
    private int iuser;
    private String uid;
    private String upw;
    private String nm;
    private String addr;
    private char gender;
    private String mainPic;
}

package com.application.bussiness.test.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * 
 * @description 
 * @author Jeff
 * @date 2022年3月4日
 */
@TableName("user")
public class UserEntity {

    private Integer id;
 
    private String userName;

    private String passWord;

    private String realName;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassWord() {
        return passWord;
    }
 
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
 
    public String getRealName() {
        return realName;
    }
 
    public void setRealName(String realName) {
        this.realName = realName;
    }
 
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", realName='" + realName + '\'' +
                '}';
    }
}
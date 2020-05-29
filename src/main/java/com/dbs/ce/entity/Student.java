package com.dbs.ce.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "学生信息")
public class Student implements Serializable {
    @ApiModelProperty(value = "学号",required = true)
    private String sno;
    @ApiModelProperty(value = "学生姓名",required = true)
    private String sname;
    @ApiModelProperty(value = "学生性别",required = true)
    private String ssex;
    @ApiModelProperty(value = "学生年龄",required = true)
    private int sage;
    @ApiModelProperty(value = "所在学院",required = true)
    private String sdept;
    @ApiModelProperty(value = "昵称",required = true)
    private String nickname;
    @ApiModelProperty(value = "密码",required = true)
    private String password;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", ssex='" + ssex + '\'' +
                ", sage=" + sage +
                ", sdept='" + sdept + '\'' +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

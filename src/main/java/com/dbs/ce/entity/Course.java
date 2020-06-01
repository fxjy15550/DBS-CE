package com.dbs.ce.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value = "课程信息")
public class Course implements Serializable {
    @ApiModelProperty(value = "课程号",required = true)
    private String cno;
    @ApiModelProperty(value = "课程名",required = true)
    private String cname;
    @ApiModelProperty(value = "系名",required = true)
    private String cdept;
    @ApiModelProperty(value = "学分",required = true)
    private int ccredit;
    @ApiModelProperty(value = "课程信息",required = true)
    private String cinfo;
    @ApiModelProperty(value = "授课老师",required = true)
    private String cteacher;
    @ApiModelProperty(value = "上课时间",required = true)
    private String cdate;

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCdept() {
        return cdept;
    }

    public void setCdept(String cdept) {
        this.cdept = cdept;
    }

    public int getCcredit() {
        return ccredit;
    }

    public void setCcredit(int ccredit) {
        this.ccredit = ccredit;
    }

    public String getCinfo() {
        return cinfo;
    }

    public void setCinfo(String cinfo) {
        this.cinfo = cinfo;
    }

    public String getCteacher() {
        return cteacher;
    }

    public void setCteacher(String cteacher) {
        this.cteacher = cteacher;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", cdept='" + cdept + '\'' +
                ", ccredit=" + ccredit +
                ", cinfo='" + cinfo + '\'' +
                ", cteacher='" + cteacher + '\'' +
                ", cdate='" + cdate + '\'' +
                '}';
    }
}

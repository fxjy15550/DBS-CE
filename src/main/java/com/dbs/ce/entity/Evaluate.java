package com.dbs.ce.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

@ApiModel(description = "评价信息")
public class Evaluate {
    @ApiModelProperty(value = "学号", required = true)
    private String sno;
    @ApiModelProperty(value = "系号", required = true)
    private String cno;
    @ApiModelProperty(value = "评价时间", hidden = true)
    private java.sql.Timestamp edate;
    @ApiModelProperty(value = "评价内容", required = true)
    private String econtent;

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public Timestamp getEdate() {
        return edate;
    }

    public void setEdate(Timestamp edate) {
        this.edate = edate;
    }

    public String getEcontent() {
        return econtent;
    }

    public void setEcontent(String econtent) {
        this.econtent = econtent;
    }

    @Override
    public String toString() {
        return "Evaluate{" +
                "sno='" + sno + '\'' +
                ", cno='" + cno + '\'' +
                ", edate='" + edate + '\'' +
                ", econtent='" + econtent + '\'' +
                '}';
    }
}

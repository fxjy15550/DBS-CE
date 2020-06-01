package com.dbs.ce.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.sql.Timestamp;

@ApiModel(description = "评价显示DTO")
public class EvaluateDTO {
    @ApiModelProperty(value = "昵称",required = true)
    private String nickname;
    @ApiModelProperty(value = "评价内容",required = true)
    private String content;
    @ApiModelProperty(value = "评价时间")
    private java.sql.Timestamp date;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "EvaluateDTO{" +
                "nickname='" + nickname + '\'' +
                ", content='" + content + '\'' +
                ", date=" + date +
                '}';
    }
}

package com.dbs.ce.DTO;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "信息更新DTO")
public class UpdateDTO {
    @ApiModelProperty(value = "用户的登录ID", required = true)
    private String userId;
    @ApiModelProperty(value = "验证码", required = true)
    private String verificationCode;
    @ApiModelProperty(value = "用户密码", required = true)
    private String password;
    @ApiModelProperty(value = "用户更新信息", required = true)
    private String updateInfo;

    @Override
    public String toString() {
        return "UpdateDTO{" +
                "userId='" + userId + '\'' +
                ", verificationCode='" + verificationCode + '\'' +
                ", password='" + password + '\'' +
                ", updateInfo='" + updateInfo + '\'' +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUpdateInfo() {
        return updateInfo;
    }

    public void setUpdateInfo(String updateInfo) {
        this.updateInfo = updateInfo;
    }
}

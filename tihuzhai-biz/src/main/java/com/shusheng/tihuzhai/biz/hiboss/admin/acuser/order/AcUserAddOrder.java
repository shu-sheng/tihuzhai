package com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiOrderBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/13 10:32
 */
@ApiModel(description= "添加用户：入参")
public class AcUserAddOrder extends TiHuZhaiOrderBase {
    private static final long serialVersionUID = 8165238186043395639L;

    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "真实姓名")
    private String userRealName;
    @ApiModelProperty(value = "登录密码")
    private String password;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "手机")
    private String mobile;
    @ApiModelProperty(value = "备注")
    private String memo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserRealName() {
        return userRealName;
    }

    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}

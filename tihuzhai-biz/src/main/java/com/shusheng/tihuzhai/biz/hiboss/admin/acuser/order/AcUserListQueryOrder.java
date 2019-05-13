package com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiOrderBase;
import com.shusheng.tihuzhai.biz.base.TiHuZhaiPageOrderBase;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/13 10:32
 */
public class AcUserListQueryOrder extends TiHuZhaiPageOrderBase {
    private static final long serialVersionUID = 8165238186043395639L;

    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "用户状态")
    private String status;
    @ApiModelProperty(value = "开始时间")
    private String startTime;
    @ApiModelProperty(value = "结束时间")
    private String endTime;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}

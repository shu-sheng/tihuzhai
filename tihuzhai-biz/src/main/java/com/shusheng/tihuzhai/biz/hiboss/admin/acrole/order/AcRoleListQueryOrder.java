package com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiPageOrderBase;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 10:49
 */
public class AcRoleListQueryOrder extends TiHuZhaiPageOrderBase {
    private static final long serialVersionUID = -8352385703882937236L;

    @ApiModelProperty(value = "角色类型")
    private String roleType;
    @ApiModelProperty(value = "角色状态")
    private String roleStatus;
    @ApiModelProperty(value = "开始时间")
    private String startTime;
    @ApiModelProperty(value = "结束时间")
    private String endTime;

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
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

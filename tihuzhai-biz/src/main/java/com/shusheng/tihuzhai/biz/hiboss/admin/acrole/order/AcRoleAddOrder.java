package com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiOrderBase;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 10:29
 */
public class AcRoleAddOrder extends TiHuZhaiOrderBase {
    private static final long serialVersionUID = 6826762986802231917L;

    @ApiModelProperty(value = "角色名")
    private String roleName;
    @ApiModelProperty(value = "角色类型")
    private String roleType;
    @ApiModelProperty(value = "备注")
    private String memo;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}

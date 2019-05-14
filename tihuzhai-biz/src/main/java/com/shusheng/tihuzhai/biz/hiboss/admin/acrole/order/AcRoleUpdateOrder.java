package com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiOrderBase;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 10:45
 */
public class AcRoleUpdateOrder extends TiHuZhaiOrderBase {
    private static final long serialVersionUID = -7055191139554888891L;
    @ApiModelProperty(value = "角色ID")
    private Long id;
    @ApiModelProperty(value = "角色名")
    private String roleName;
    @ApiModelProperty(value = "角色类型")
    private String roleType;
    @ApiModelProperty(value = "角色状态")
    private String roleStatus;
    @ApiModelProperty(value = "角色备注")
    private String memo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}

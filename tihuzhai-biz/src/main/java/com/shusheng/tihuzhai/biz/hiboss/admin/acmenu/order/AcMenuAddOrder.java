package com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiOrderBase;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 10:29
 */
public class AcMenuAddOrder extends TiHuZhaiOrderBase {
    private static final long serialVersionUID = 6826762986802231917L;

    @ApiModelProperty(value = "父菜单ID")
    private Long parentId;
    @ApiModelProperty(value = "菜单名称")
    private String menuName;
    @ApiModelProperty(value = "菜单编码")
    private String menuCode;
    @ApiModelProperty(value = "菜单类型")
    private String menuType;
    @ApiModelProperty(value = "菜单顺序")
    private Integer menuOrder;
    @ApiModelProperty(value = "权限URL")
    private String permissionUrl;
    @ApiModelProperty(value = "菜单状态")
    private String status;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public Integer getMenuOrder() {
        return menuOrder;
    }

    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    public String getPermissionUrl() {
        return permissionUrl;
    }

    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

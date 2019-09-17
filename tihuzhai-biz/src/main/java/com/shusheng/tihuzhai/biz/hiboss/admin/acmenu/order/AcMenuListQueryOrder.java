package com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiPageOrderBase;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 10:49
 */
public class AcMenuListQueryOrder extends TiHuZhaiPageOrderBase {
    private static final long serialVersionUID = -8352385703882937236L;

    @ApiModelProperty(value = "菜单名称")
    private String menuName;
    @ApiModelProperty(value = "菜单类型")
    private String menuType;
    @ApiModelProperty(value = "菜单状态")
    private String menuStatus;

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus;
    }
}

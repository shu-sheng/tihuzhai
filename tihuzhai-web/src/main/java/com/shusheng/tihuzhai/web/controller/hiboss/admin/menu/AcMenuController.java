package com.shusheng.tihuzhai.web.controller.hiboss.admin.menu;

import com.shusheng.tihuzhai.biz.base.DataPageResultBase;
import com.shusheng.tihuzhai.biz.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.AcMenuService;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order.AcMenuAddOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order.AcMenuListQueryOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acmenu.order.AcMenuUpdateOrder;
import com.shusheng.tihuzhai.enums.TiHuZhaiResultEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/30 12:30
 */
@Controller
@RequestMapping("/acMenu/")
@Api(description = "管理后台：菜单管理")
public class AcMenuController {

    @Autowired
    private AcMenuService acMenuService;

    @RequestMapping("add.htm")
    @ResponseBody
    @ApiOperation(value = "添加菜单",httpMethod = "POST")
    public Object addAcMenu(AcMenuAddOrder acMenuAddOrder){
        DataResultBase addResult = new DataResultBase();
        try {
            addResult = acMenuService.addAcMenu(acMenuAddOrder);
        } catch (Exception e) {
            e.printStackTrace();
            addResult.setSuccess(false);
            addResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            addResult.setDescription("添加菜单失败");
            return addResult;
        }
        return addResult;
    }

    @RequestMapping("delete.htm")
    @ResponseBody
    @ApiOperation(value = "删除菜单",httpMethod = "POST")
    public Object deleteAcMenu(String id){
        DataResultBase deleteResult = new DataResultBase();
        deleteResult = acMenuService.deleteAcMenu(id);
        return deleteResult;
    }

    @RequestMapping("update.htm")
    @ResponseBody
    @ApiOperation(value = "更新菜单",httpMethod = "POST")
    public Object updateAcMenu(AcMenuUpdateOrder acMenuUpdateOrder){
        DataResultBase updateResult = new DataResultBase();
        updateResult = acMenuService.updateAcMenu(acMenuUpdateOrder);
        return updateResult;
    }

    @RequestMapping("list.htm")
    @ResponseBody
    @ApiOperation(value = "菜单列表",httpMethod = "POST")
    public Object getAcMenuList(AcMenuListQueryOrder acMenuListQueryOrder){
        DataPageResultBase acMenuListResult = new DataPageResultBase();
        acMenuListResult = acMenuService.getAcMenuList(acMenuListQueryOrder);
        return acMenuListResult;
    }

    @RequestMapping("getAcMenuByName.htm")
    @ResponseBody
    @ApiOperation(value = "根据菜单名查询菜单信息",httpMethod = "POST")
    public Object getAcMenuByName(String menuname){
        DataResultBase acMenuResult = new DataResultBase();
        try {
            acMenuResult = acMenuService.getAcMenuByCode(menuname);
        } catch (Exception e) {
            e.printStackTrace();
            acMenuResult.setSuccess(false);
            acMenuResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            acMenuResult.setDescription("根据菜单名查询菜单失败");
            return acMenuResult;
        }
        return acMenuResult;
    }

}

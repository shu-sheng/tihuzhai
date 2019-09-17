package com.shusheng.tihuzhai.web.controller.hiboss.admin.role;

import com.shusheng.tihuzhai.biz.base.DataPageResultBase;
import com.shusheng.tihuzhai.biz.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.AcRoleService;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order.AcRoleAddOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order.AcRoleListQueryOrder;
import com.shusheng.tihuzhai.biz.hiboss.admin.acrole.order.AcRoleUpdateOrder;
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
@RequestMapping("/acRole/")
@Api(description = "管理后台：角色管理")
public class AcRoleController {

    @Autowired
    private AcRoleService acRoleService;

    @RequestMapping("add.htm")
    @ResponseBody
    @ApiOperation(value = "添加角色",httpMethod = "POST")
    public Object addAcRole(AcRoleAddOrder acRoleAddOrder){
        DataResultBase addResult = new DataResultBase();
        try {
            addResult = acRoleService.addAcRole(acRoleAddOrder);
        } catch (Exception e) {
            e.printStackTrace();
            addResult.setSuccess(false);
            addResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            addResult.setDescription("添加角色失败");
            return addResult;
        }
        return addResult;
    }

    @RequestMapping("delete.htm")
    @ResponseBody
    @ApiOperation(value = "删除角色",httpMethod = "POST")
    public Object deleteAcRole(String id){
        DataResultBase deleteResult = new DataResultBase();
        deleteResult = acRoleService.deleteAcRole(id);
        return deleteResult;
    }

    @RequestMapping("update.htm")
    @ResponseBody
    @ApiOperation(value = "更新角色",httpMethod = "POST")
    public Object updateAcRole(AcRoleUpdateOrder acRoleUpdateOrder){
        DataResultBase updateResult = new DataResultBase();
        updateResult = acRoleService.updateAcRole(acRoleUpdateOrder);
        return updateResult;
    }

    @RequestMapping("list.htm")
    @ResponseBody
    @ApiOperation(value = "角色列表",httpMethod = "POST")
    public Object getAcRoleList(AcRoleListQueryOrder acRoleListQueryOrder){
        DataPageResultBase acRoleListResult = new DataPageResultBase();
        acRoleListResult = acRoleService.getAcRoleList(acRoleListQueryOrder);
        return acRoleListResult;
    }

    @RequestMapping("getAcRoleByName.htm")
    @ResponseBody
    @ApiOperation(value = "根据角色名查询角色信息",httpMethod = "POST")
    public Object getAcRoleByName(String rolename){
        DataResultBase acRoleResult = new DataResultBase();
        try {
            acRoleResult = acRoleService.getAcRoleByName(rolename);
        } catch (Exception e) {
            e.printStackTrace();
            acRoleResult.setSuccess(false);
            acRoleResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            acRoleResult.setDescription("根据角色名查询角色失败");
            return acRoleResult;
        }
        return acRoleResult;
    }

}

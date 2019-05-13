package com.shusheng.tihuzhai.web.controller.hiboss.admin.user;

import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order.AcUserListQueryOrder;
import com.shusheng.tihuzhai.biz.hiboss.base.DataResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.AcUserService;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.info.AcUserInfo;
import com.shusheng.tihuzhai.enums.TiHuZhaiResultEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.InvocationTargetException;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/30 12:30
 */
@Controller
@RequestMapping("/acUser/")
@Api(description = "管理后台：用户：添加用户")
public class AcUserController {

    @Autowired
    private AcUserService acUserService;

    @RequestMapping("add.htm")
    @ResponseBody
    @ApiOperation(value = "添加用户",httpMethod = "POST")
    public Object addAcUser(AcUserInfo acUserInfo){
        DataResultBase addResult = new DataResultBase();
        try {
            addResult = acUserService.addAcUser(acUserInfo);
        } catch (Exception e) {
            e.printStackTrace();
            addResult.setSuccess(false);
            addResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            addResult.setDescription("添加用户失败");
            return addResult;
        }
        return addResult;
    }

    @RequestMapping("delete.htm")
    @ResponseBody
    @ApiOperation(value = "删除用户",httpMethod = "POST")
    public Object deleteAcUser(Long id){
        DataResultBase deleteResult = new DataResultBase();
        deleteResult = acUserService.deleteAcUser(id);
        return deleteResult;
    }

    @RequestMapping("update.htm")
    @ResponseBody
    @ApiOperation(value = "更新用户",httpMethod = "POST")
    public Object updateAcUser(AcUserInfo acUserInfo){
        DataResultBase updateResult = new DataResultBase();
        updateResult = acUserService.updateAcUser(acUserInfo);
        return updateResult;
    }

    @RequestMapping("list.htm")
    @ResponseBody
    @ApiOperation(value = "用户列表",httpMethod = "POST")
    public Object getAcUserList(AcUserListQueryOrder acUserListQueryOrder){
        DataResultBase acUserListResult = new DataResultBase();
        acUserListResult = acUserService.getAcUserList(acUserListQueryOrder);
        return acUserListResult;
    }

    @RequestMapping("getAcUserByName.htm")
    @ResponseBody
    @ApiOperation(value = "根据用户名查询用户信息",httpMethod = "POST")
    public Object getAcUserByName(String username){
        DataResultBase acUserResult = new DataResultBase();
        try {
            acUserResult = acUserService.getAcUserByName(username);
        } catch (Exception e) {
            e.printStackTrace();
            acUserResult.setSuccess(false);
            acUserResult.setStatus(TiHuZhaiResultEnum.EXECUTE_FAILURE);
            acUserResult.setDescription("根据用户名查询用户失败");
            return acUserResult;
        }
        return acUserResult;
    }

}

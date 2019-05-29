package com.shusheng.tihuzhai.biz.hiboss.login.result;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiResultBase;
import com.shusheng.tihuzhai.biz.hiboss.admin.acuser.info.AcUserInfo;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/4/29 14:09
 */
public class LoginResult extends TiHuZhaiResultBase {
    private static final long serialVersionUID = 3595489138632849115L;

    private AcUserInfo acUserInfo;

    private boolean isExist;

    public AcUserInfo getAcUserInfo() {
        return acUserInfo;
    }

    public void setAcUserInfo(AcUserInfo acUserInfo) {
        this.acUserInfo = acUserInfo;
    }

    public boolean isExist() {
        return isExist;
    }

    public void setExist(boolean exist) {
        isExist = exist;
    }
}

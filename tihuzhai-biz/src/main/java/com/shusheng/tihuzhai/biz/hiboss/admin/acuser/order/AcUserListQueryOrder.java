package com.shusheng.tihuzhai.biz.hiboss.admin.acuser.order;

import com.shusheng.tihuzhai.biz.base.TiHuZhaiOrderBase;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/13 10:32
 */
public class AcUserListQueryOrder extends TiHuZhaiOrderBase {
    private static final long serialVersionUID = 8165238186043395639L;

    /**页码*/
    private Integer pageNumber;
    /**每页数据条数*/
    private Integer pageSize;
    /**用户名*/
    private String userName;
    /**用户状态*/
    private String status;
    /**开始时间*/
    private String startTime;
    /**结束时间*/
    private String endTime;

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

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

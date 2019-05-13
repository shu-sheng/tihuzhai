package com.shusheng.tihuzhai.biz.base;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 0:59
 */
public class TiHuZhaiPageOrderBase extends TiHuZhaiOrderBase{
    private static final long serialVersionUID = 3965063504582157161L;
    @ApiModelProperty(value = "页码")
    private Integer pageNumber = 1;
    @ApiModelProperty(value = "每页数据条数")
    private Integer pageSize = 10;

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
}

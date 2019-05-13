package com.shusheng.tihuzhai.biz.base;

/**
 * @author shusheng
 * @description
 * @Email eric_wu_peng@126.com
 * @date 2019/5/14 0:55
 */
public class TiHuZhaiPageResultBase extends TiHuZhaiResultBase{
    private static final long serialVersionUID = -6791340862830589754L;
    /** 页码 */
    private Integer pageNumber = 1;
    /** 每页条数 */
    private Integer pageSize = 10;
    /** 数据总条数 */
    private Long totalCount;

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

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}

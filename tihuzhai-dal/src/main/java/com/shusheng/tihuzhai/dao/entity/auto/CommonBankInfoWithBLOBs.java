package com.shusheng.tihuzhai.dao.entity.auto;

public class CommonBankInfoWithBLOBs extends CommonBankInfo {
    private String referer;

    private String memo;

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer == null ? null : referer.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}
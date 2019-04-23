package com.shusheng.tihuzhai.dao.entity.auto;

public class SysDateSeqKey {
    private String name;

    private String seqDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSeqDate() {
        return seqDate;
    }

    public void setSeqDate(String seqDate) {
        this.seqDate = seqDate == null ? null : seqDate.trim();
    }
}
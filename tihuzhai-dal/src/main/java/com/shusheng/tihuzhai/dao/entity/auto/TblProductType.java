package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.Date;

public class TblProductType {
    private Long ptId;

    private String ptCode;

    private String ptTypeName;

    private Long ptParentId;

    private Long priority;

    private Long ptSeq;

    private Long productCount;

    private Long ptCodeLn;

    private String isBackProduct;

    private String isBackMoney;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private String ptAddColumns;

    private String ptNote;

    private String ptTag;

    private String ptKeywords;

    public Long getPtId() {
        return ptId;
    }

    public void setPtId(Long ptId) {
        this.ptId = ptId;
    }

    public String getPtCode() {
        return ptCode;
    }

    public void setPtCode(String ptCode) {
        this.ptCode = ptCode == null ? null : ptCode.trim();
    }

    public String getPtTypeName() {
        return ptTypeName;
    }

    public void setPtTypeName(String ptTypeName) {
        this.ptTypeName = ptTypeName == null ? null : ptTypeName.trim();
    }

    public Long getPtParentId() {
        return ptParentId;
    }

    public void setPtParentId(Long ptParentId) {
        this.ptParentId = ptParentId;
    }

    public Long getPriority() {
        return priority;
    }

    public void setPriority(Long priority) {
        this.priority = priority;
    }

    public Long getPtSeq() {
        return ptSeq;
    }

    public void setPtSeq(Long ptSeq) {
        this.ptSeq = ptSeq;
    }

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public Long getPtCodeLn() {
        return ptCodeLn;
    }

    public void setPtCodeLn(Long ptCodeLn) {
        this.ptCodeLn = ptCodeLn;
    }

    public String getIsBackProduct() {
        return isBackProduct;
    }

    public void setIsBackProduct(String isBackProduct) {
        this.isBackProduct = isBackProduct == null ? null : isBackProduct.trim();
    }

    public String getIsBackMoney() {
        return isBackMoney;
    }

    public void setIsBackMoney(String isBackMoney) {
        this.isBackMoney = isBackMoney == null ? null : isBackMoney.trim();
    }

    public Date getRawAddTime() {
        return rawAddTime;
    }

    public void setRawAddTime(Date rawAddTime) {
        this.rawAddTime = rawAddTime;
    }

    public Date getRawUpdateTime() {
        return rawUpdateTime;
    }

    public void setRawUpdateTime(Date rawUpdateTime) {
        this.rawUpdateTime = rawUpdateTime;
    }

    public String getPtAddColumns() {
        return ptAddColumns;
    }

    public void setPtAddColumns(String ptAddColumns) {
        this.ptAddColumns = ptAddColumns == null ? null : ptAddColumns.trim();
    }

    public String getPtNote() {
        return ptNote;
    }

    public void setPtNote(String ptNote) {
        this.ptNote = ptNote == null ? null : ptNote.trim();
    }

    public String getPtTag() {
        return ptTag;
    }

    public void setPtTag(String ptTag) {
        this.ptTag = ptTag == null ? null : ptTag.trim();
    }

    public String getPtKeywords() {
        return ptKeywords;
    }

    public void setPtKeywords(String ptKeywords) {
        this.ptKeywords = ptKeywords == null ? null : ptKeywords.trim();
    }
}
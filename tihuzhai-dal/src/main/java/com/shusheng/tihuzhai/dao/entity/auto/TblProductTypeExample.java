package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblProductTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblProductTypeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andPtIdIsNull() {
            addCriterion("pt_id is null");
            return (Criteria) this;
        }

        public Criteria andPtIdIsNotNull() {
            addCriterion("pt_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtIdEqualTo(Long value) {
            addCriterion("pt_id =", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotEqualTo(Long value) {
            addCriterion("pt_id <>", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThan(Long value) {
            addCriterion("pt_id >", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pt_id >=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThan(Long value) {
            addCriterion("pt_id <", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdLessThanOrEqualTo(Long value) {
            addCriterion("pt_id <=", value, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdIn(List<Long> values) {
            addCriterion("pt_id in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotIn(List<Long> values) {
            addCriterion("pt_id not in", values, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdBetween(Long value1, Long value2) {
            addCriterion("pt_id between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtIdNotBetween(Long value1, Long value2) {
            addCriterion("pt_id not between", value1, value2, "ptId");
            return (Criteria) this;
        }

        public Criteria andPtCodeIsNull() {
            addCriterion("pt_code is null");
            return (Criteria) this;
        }

        public Criteria andPtCodeIsNotNull() {
            addCriterion("pt_code is not null");
            return (Criteria) this;
        }

        public Criteria andPtCodeEqualTo(String value) {
            addCriterion("pt_code =", value, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeNotEqualTo(String value) {
            addCriterion("pt_code <>", value, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeGreaterThan(String value) {
            addCriterion("pt_code >", value, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pt_code >=", value, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeLessThan(String value) {
            addCriterion("pt_code <", value, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeLessThanOrEqualTo(String value) {
            addCriterion("pt_code <=", value, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeLike(String value) {
            addCriterion("pt_code like", value, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeNotLike(String value) {
            addCriterion("pt_code not like", value, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeIn(List<String> values) {
            addCriterion("pt_code in", values, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeNotIn(List<String> values) {
            addCriterion("pt_code not in", values, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeBetween(String value1, String value2) {
            addCriterion("pt_code between", value1, value2, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtCodeNotBetween(String value1, String value2) {
            addCriterion("pt_code not between", value1, value2, "ptCode");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameIsNull() {
            addCriterion("pt_type_name is null");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameIsNotNull() {
            addCriterion("pt_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameEqualTo(String value) {
            addCriterion("pt_type_name =", value, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameNotEqualTo(String value) {
            addCriterion("pt_type_name <>", value, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameGreaterThan(String value) {
            addCriterion("pt_type_name >", value, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("pt_type_name >=", value, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameLessThan(String value) {
            addCriterion("pt_type_name <", value, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameLessThanOrEqualTo(String value) {
            addCriterion("pt_type_name <=", value, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameLike(String value) {
            addCriterion("pt_type_name like", value, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameNotLike(String value) {
            addCriterion("pt_type_name not like", value, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameIn(List<String> values) {
            addCriterion("pt_type_name in", values, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameNotIn(List<String> values) {
            addCriterion("pt_type_name not in", values, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameBetween(String value1, String value2) {
            addCriterion("pt_type_name between", value1, value2, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtTypeNameNotBetween(String value1, String value2) {
            addCriterion("pt_type_name not between", value1, value2, "ptTypeName");
            return (Criteria) this;
        }

        public Criteria andPtParentIdIsNull() {
            addCriterion("pt_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andPtParentIdIsNotNull() {
            addCriterion("pt_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andPtParentIdEqualTo(Long value) {
            addCriterion("pt_parent_id =", value, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPtParentIdNotEqualTo(Long value) {
            addCriterion("pt_parent_id <>", value, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPtParentIdGreaterThan(Long value) {
            addCriterion("pt_parent_id >", value, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPtParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("pt_parent_id >=", value, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPtParentIdLessThan(Long value) {
            addCriterion("pt_parent_id <", value, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPtParentIdLessThanOrEqualTo(Long value) {
            addCriterion("pt_parent_id <=", value, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPtParentIdIn(List<Long> values) {
            addCriterion("pt_parent_id in", values, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPtParentIdNotIn(List<Long> values) {
            addCriterion("pt_parent_id not in", values, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPtParentIdBetween(Long value1, Long value2) {
            addCriterion("pt_parent_id between", value1, value2, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPtParentIdNotBetween(Long value1, Long value2) {
            addCriterion("pt_parent_id not between", value1, value2, "ptParentId");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Long value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Long value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Long value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Long value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Long value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Long> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Long> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Long value1, Long value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Long value1, Long value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPtSeqIsNull() {
            addCriterion("pt_seq is null");
            return (Criteria) this;
        }

        public Criteria andPtSeqIsNotNull() {
            addCriterion("pt_seq is not null");
            return (Criteria) this;
        }

        public Criteria andPtSeqEqualTo(Long value) {
            addCriterion("pt_seq =", value, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andPtSeqNotEqualTo(Long value) {
            addCriterion("pt_seq <>", value, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andPtSeqGreaterThan(Long value) {
            addCriterion("pt_seq >", value, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andPtSeqGreaterThanOrEqualTo(Long value) {
            addCriterion("pt_seq >=", value, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andPtSeqLessThan(Long value) {
            addCriterion("pt_seq <", value, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andPtSeqLessThanOrEqualTo(Long value) {
            addCriterion("pt_seq <=", value, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andPtSeqIn(List<Long> values) {
            addCriterion("pt_seq in", values, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andPtSeqNotIn(List<Long> values) {
            addCriterion("pt_seq not in", values, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andPtSeqBetween(Long value1, Long value2) {
            addCriterion("pt_seq between", value1, value2, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andPtSeqNotBetween(Long value1, Long value2) {
            addCriterion("pt_seq not between", value1, value2, "ptSeq");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(Long value) {
            addCriterion("product_count =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(Long value) {
            addCriterion("product_count <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(Long value) {
            addCriterion("product_count >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(Long value) {
            addCriterion("product_count >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(Long value) {
            addCriterion("product_count <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(Long value) {
            addCriterion("product_count <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<Long> values) {
            addCriterion("product_count in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<Long> values) {
            addCriterion("product_count not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(Long value1, Long value2) {
            addCriterion("product_count between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(Long value1, Long value2) {
            addCriterion("product_count not between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnIsNull() {
            addCriterion("pt_code_ln is null");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnIsNotNull() {
            addCriterion("pt_code_ln is not null");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnEqualTo(Long value) {
            addCriterion("pt_code_ln =", value, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnNotEqualTo(Long value) {
            addCriterion("pt_code_ln <>", value, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnGreaterThan(Long value) {
            addCriterion("pt_code_ln >", value, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnGreaterThanOrEqualTo(Long value) {
            addCriterion("pt_code_ln >=", value, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnLessThan(Long value) {
            addCriterion("pt_code_ln <", value, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnLessThanOrEqualTo(Long value) {
            addCriterion("pt_code_ln <=", value, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnIn(List<Long> values) {
            addCriterion("pt_code_ln in", values, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnNotIn(List<Long> values) {
            addCriterion("pt_code_ln not in", values, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnBetween(Long value1, Long value2) {
            addCriterion("pt_code_ln between", value1, value2, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andPtCodeLnNotBetween(Long value1, Long value2) {
            addCriterion("pt_code_ln not between", value1, value2, "ptCodeLn");
            return (Criteria) this;
        }

        public Criteria andIsBackProductIsNull() {
            addCriterion("is_back_product is null");
            return (Criteria) this;
        }

        public Criteria andIsBackProductIsNotNull() {
            addCriterion("is_back_product is not null");
            return (Criteria) this;
        }

        public Criteria andIsBackProductEqualTo(String value) {
            addCriterion("is_back_product =", value, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductNotEqualTo(String value) {
            addCriterion("is_back_product <>", value, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductGreaterThan(String value) {
            addCriterion("is_back_product >", value, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductGreaterThanOrEqualTo(String value) {
            addCriterion("is_back_product >=", value, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductLessThan(String value) {
            addCriterion("is_back_product <", value, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductLessThanOrEqualTo(String value) {
            addCriterion("is_back_product <=", value, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductLike(String value) {
            addCriterion("is_back_product like", value, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductNotLike(String value) {
            addCriterion("is_back_product not like", value, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductIn(List<String> values) {
            addCriterion("is_back_product in", values, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductNotIn(List<String> values) {
            addCriterion("is_back_product not in", values, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductBetween(String value1, String value2) {
            addCriterion("is_back_product between", value1, value2, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackProductNotBetween(String value1, String value2) {
            addCriterion("is_back_product not between", value1, value2, "isBackProduct");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyIsNull() {
            addCriterion("is_back_money is null");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyIsNotNull() {
            addCriterion("is_back_money is not null");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyEqualTo(String value) {
            addCriterion("is_back_money =", value, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyNotEqualTo(String value) {
            addCriterion("is_back_money <>", value, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyGreaterThan(String value) {
            addCriterion("is_back_money >", value, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyGreaterThanOrEqualTo(String value) {
            addCriterion("is_back_money >=", value, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyLessThan(String value) {
            addCriterion("is_back_money <", value, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyLessThanOrEqualTo(String value) {
            addCriterion("is_back_money <=", value, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyLike(String value) {
            addCriterion("is_back_money like", value, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyNotLike(String value) {
            addCriterion("is_back_money not like", value, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyIn(List<String> values) {
            addCriterion("is_back_money in", values, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyNotIn(List<String> values) {
            addCriterion("is_back_money not in", values, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyBetween(String value1, String value2) {
            addCriterion("is_back_money between", value1, value2, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andIsBackMoneyNotBetween(String value1, String value2) {
            addCriterion("is_back_money not between", value1, value2, "isBackMoney");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNull() {
            addCriterion("raw_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIsNotNull() {
            addCriterion("raw_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeEqualTo(Date value) {
            addCriterion("raw_add_time =", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotEqualTo(Date value) {
            addCriterion("raw_add_time <>", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThan(Date value) {
            addCriterion("raw_add_time >", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_add_time >=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThan(Date value) {
            addCriterion("raw_add_time <", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_add_time <=", value, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeIn(List<Date> values) {
            addCriterion("raw_add_time in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotIn(List<Date> values) {
            addCriterion("raw_add_time not in", values, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeBetween(Date value1, Date value2) {
            addCriterion("raw_add_time between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_add_time not between", value1, value2, "rawAddTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNull() {
            addCriterion("raw_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIsNotNull() {
            addCriterion("raw_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeEqualTo(Date value) {
            addCriterion("raw_update_time =", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotEqualTo(Date value) {
            addCriterion("raw_update_time <>", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThan(Date value) {
            addCriterion("raw_update_time >", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("raw_update_time >=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThan(Date value) {
            addCriterion("raw_update_time <", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("raw_update_time <=", value, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeIn(List<Date> values) {
            addCriterion("raw_update_time in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotIn(List<Date> values) {
            addCriterion("raw_update_time not in", values, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("raw_update_time between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRawUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("raw_update_time not between", value1, value2, "rawUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsIsNull() {
            addCriterion("pt_add_columns is null");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsIsNotNull() {
            addCriterion("pt_add_columns is not null");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsEqualTo(String value) {
            addCriterion("pt_add_columns =", value, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsNotEqualTo(String value) {
            addCriterion("pt_add_columns <>", value, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsGreaterThan(String value) {
            addCriterion("pt_add_columns >", value, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsGreaterThanOrEqualTo(String value) {
            addCriterion("pt_add_columns >=", value, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsLessThan(String value) {
            addCriterion("pt_add_columns <", value, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsLessThanOrEqualTo(String value) {
            addCriterion("pt_add_columns <=", value, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsLike(String value) {
            addCriterion("pt_add_columns like", value, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsNotLike(String value) {
            addCriterion("pt_add_columns not like", value, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsIn(List<String> values) {
            addCriterion("pt_add_columns in", values, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsNotIn(List<String> values) {
            addCriterion("pt_add_columns not in", values, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsBetween(String value1, String value2) {
            addCriterion("pt_add_columns between", value1, value2, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtAddColumnsNotBetween(String value1, String value2) {
            addCriterion("pt_add_columns not between", value1, value2, "ptAddColumns");
            return (Criteria) this;
        }

        public Criteria andPtNoteIsNull() {
            addCriterion("pt_note is null");
            return (Criteria) this;
        }

        public Criteria andPtNoteIsNotNull() {
            addCriterion("pt_note is not null");
            return (Criteria) this;
        }

        public Criteria andPtNoteEqualTo(String value) {
            addCriterion("pt_note =", value, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteNotEqualTo(String value) {
            addCriterion("pt_note <>", value, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteGreaterThan(String value) {
            addCriterion("pt_note >", value, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteGreaterThanOrEqualTo(String value) {
            addCriterion("pt_note >=", value, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteLessThan(String value) {
            addCriterion("pt_note <", value, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteLessThanOrEqualTo(String value) {
            addCriterion("pt_note <=", value, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteLike(String value) {
            addCriterion("pt_note like", value, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteNotLike(String value) {
            addCriterion("pt_note not like", value, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteIn(List<String> values) {
            addCriterion("pt_note in", values, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteNotIn(List<String> values) {
            addCriterion("pt_note not in", values, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteBetween(String value1, String value2) {
            addCriterion("pt_note between", value1, value2, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtNoteNotBetween(String value1, String value2) {
            addCriterion("pt_note not between", value1, value2, "ptNote");
            return (Criteria) this;
        }

        public Criteria andPtTagIsNull() {
            addCriterion("pt_tag is null");
            return (Criteria) this;
        }

        public Criteria andPtTagIsNotNull() {
            addCriterion("pt_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPtTagEqualTo(String value) {
            addCriterion("pt_tag =", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagNotEqualTo(String value) {
            addCriterion("pt_tag <>", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagGreaterThan(String value) {
            addCriterion("pt_tag >", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagGreaterThanOrEqualTo(String value) {
            addCriterion("pt_tag >=", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagLessThan(String value) {
            addCriterion("pt_tag <", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagLessThanOrEqualTo(String value) {
            addCriterion("pt_tag <=", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagLike(String value) {
            addCriterion("pt_tag like", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagNotLike(String value) {
            addCriterion("pt_tag not like", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagIn(List<String> values) {
            addCriterion("pt_tag in", values, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagNotIn(List<String> values) {
            addCriterion("pt_tag not in", values, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagBetween(String value1, String value2) {
            addCriterion("pt_tag between", value1, value2, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagNotBetween(String value1, String value2) {
            addCriterion("pt_tag not between", value1, value2, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsIsNull() {
            addCriterion("pt_keyWords is null");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsIsNotNull() {
            addCriterion("pt_keyWords is not null");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsEqualTo(String value) {
            addCriterion("pt_keyWords =", value, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsNotEqualTo(String value) {
            addCriterion("pt_keyWords <>", value, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsGreaterThan(String value) {
            addCriterion("pt_keyWords >", value, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("pt_keyWords >=", value, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsLessThan(String value) {
            addCriterion("pt_keyWords <", value, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsLessThanOrEqualTo(String value) {
            addCriterion("pt_keyWords <=", value, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsLike(String value) {
            addCriterion("pt_keyWords like", value, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsNotLike(String value) {
            addCriterion("pt_keyWords not like", value, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsIn(List<String> values) {
            addCriterion("pt_keyWords in", values, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsNotIn(List<String> values) {
            addCriterion("pt_keyWords not in", values, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsBetween(String value1, String value2) {
            addCriterion("pt_keyWords between", value1, value2, "ptKeywords");
            return (Criteria) this;
        }

        public Criteria andPtKeywordsNotBetween(String value1, String value2) {
            addCriterion("pt_keyWords not between", value1, value2, "ptKeywords");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
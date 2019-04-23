package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PersonalInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonalInfoExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdIsNull() {
            addCriterion("user_base_id is null");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdIsNotNull() {
            addCriterion("user_base_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdEqualTo(String value) {
            addCriterion("user_base_id =", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdNotEqualTo(String value) {
            addCriterion("user_base_id <>", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdGreaterThan(String value) {
            addCriterion("user_base_id >", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_base_id >=", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdLessThan(String value) {
            addCriterion("user_base_id <", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdLessThanOrEqualTo(String value) {
            addCriterion("user_base_id <=", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdLike(String value) {
            addCriterion("user_base_id like", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdNotLike(String value) {
            addCriterion("user_base_id not like", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdIn(List<String> values) {
            addCriterion("user_base_id in", values, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdNotIn(List<String> values) {
            addCriterion("user_base_id not in", values, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdBetween(String value1, String value2) {
            addCriterion("user_base_id between", value1, value2, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdNotBetween(String value1, String value2) {
            addCriterion("user_base_id not between", value1, value2, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andRealNameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameEqualTo(String value) {
            addCriterion("real_name =", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThan(String value) {
            addCriterion("real_name >", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThan(String value) {
            addCriterion("real_name <", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameLike(String value) {
            addCriterion("real_name like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotLike(String value) {
            addCriterion("real_name not like", value, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameIn(List<String> values) {
            addCriterion("real_name in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andRealNameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "realName");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNull() {
            addCriterion("cert_no is null");
            return (Criteria) this;
        }

        public Criteria andCertNoIsNotNull() {
            addCriterion("cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andCertNoEqualTo(String value) {
            addCriterion("cert_no =", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotEqualTo(String value) {
            addCriterion("cert_no <>", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThan(String value) {
            addCriterion("cert_no >", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("cert_no >=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThan(String value) {
            addCriterion("cert_no <", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLessThanOrEqualTo(String value) {
            addCriterion("cert_no <=", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoLike(String value) {
            addCriterion("cert_no like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotLike(String value) {
            addCriterion("cert_no not like", value, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoIn(List<String> values) {
            addCriterion("cert_no in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotIn(List<String> values) {
            addCriterion("cert_no not in", values, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoBetween(String value1, String value2) {
            addCriterion("cert_no between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andCertNoNotBetween(String value1, String value2) {
            addCriterion("cert_no not between", value1, value2, "certNo");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodIsNull() {
            addCriterion("business_period is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodIsNotNull() {
            addCriterion("business_period is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEqualTo(String value) {
            addCriterion("business_period =", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotEqualTo(String value) {
            addCriterion("business_period <>", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodGreaterThan(String value) {
            addCriterion("business_period >", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("business_period >=", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodLessThan(String value) {
            addCriterion("business_period <", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodLessThanOrEqualTo(String value) {
            addCriterion("business_period <=", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodLike(String value) {
            addCriterion("business_period like", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotLike(String value) {
            addCriterion("business_period not like", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodIn(List<String> values) {
            addCriterion("business_period in", values, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotIn(List<String> values) {
            addCriterion("business_period not in", values, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodBetween(String value1, String value2) {
            addCriterion("business_period between", value1, value2, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotBetween(String value1, String value2) {
            addCriterion("business_period not between", value1, value2, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathIsNull() {
            addCriterion("cert_front_path is null");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathIsNotNull() {
            addCriterion("cert_front_path is not null");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathEqualTo(String value) {
            addCriterion("cert_front_path =", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathNotEqualTo(String value) {
            addCriterion("cert_front_path <>", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathGreaterThan(String value) {
            addCriterion("cert_front_path >", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathGreaterThanOrEqualTo(String value) {
            addCriterion("cert_front_path >=", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathLessThan(String value) {
            addCriterion("cert_front_path <", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathLessThanOrEqualTo(String value) {
            addCriterion("cert_front_path <=", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathLike(String value) {
            addCriterion("cert_front_path like", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathNotLike(String value) {
            addCriterion("cert_front_path not like", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathIn(List<String> values) {
            addCriterion("cert_front_path in", values, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathNotIn(List<String> values) {
            addCriterion("cert_front_path not in", values, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathBetween(String value1, String value2) {
            addCriterion("cert_front_path between", value1, value2, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathNotBetween(String value1, String value2) {
            addCriterion("cert_front_path not between", value1, value2, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathIsNull() {
            addCriterion("cert_back_path is null");
            return (Criteria) this;
        }

        public Criteria andCertBackPathIsNotNull() {
            addCriterion("cert_back_path is not null");
            return (Criteria) this;
        }

        public Criteria andCertBackPathEqualTo(String value) {
            addCriterion("cert_back_path =", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathNotEqualTo(String value) {
            addCriterion("cert_back_path <>", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathGreaterThan(String value) {
            addCriterion("cert_back_path >", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathGreaterThanOrEqualTo(String value) {
            addCriterion("cert_back_path >=", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathLessThan(String value) {
            addCriterion("cert_back_path <", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathLessThanOrEqualTo(String value) {
            addCriterion("cert_back_path <=", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathLike(String value) {
            addCriterion("cert_back_path like", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathNotLike(String value) {
            addCriterion("cert_back_path not like", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathIn(List<String> values) {
            addCriterion("cert_back_path in", values, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathNotIn(List<String> values) {
            addCriterion("cert_back_path not in", values, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathBetween(String value1, String value2) {
            addCriterion("cert_back_path between", value1, value2, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathNotBetween(String value1, String value2) {
            addCriterion("cert_back_path not between", value1, value2, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameIsNull() {
            addCriterion("bank_open_name is null");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameIsNotNull() {
            addCriterion("bank_open_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameEqualTo(String value) {
            addCriterion("bank_open_name =", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameNotEqualTo(String value) {
            addCriterion("bank_open_name <>", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameGreaterThan(String value) {
            addCriterion("bank_open_name >", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_open_name >=", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameLessThan(String value) {
            addCriterion("bank_open_name <", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameLessThanOrEqualTo(String value) {
            addCriterion("bank_open_name <=", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameLike(String value) {
            addCriterion("bank_open_name like", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameNotLike(String value) {
            addCriterion("bank_open_name not like", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameIn(List<String> values) {
            addCriterion("bank_open_name in", values, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameNotIn(List<String> values) {
            addCriterion("bank_open_name not in", values, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameBetween(String value1, String value2) {
            addCriterion("bank_open_name between", value1, value2, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameNotBetween(String value1, String value2) {
            addCriterion("bank_open_name not between", value1, value2, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("bank_card_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("bank_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("bank_card_no =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("bank_card_no <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("bank_card_no >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_no >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("bank_card_no <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_no <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("bank_card_no like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("bank_card_no not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("bank_card_no in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("bank_card_no not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("bank_card_no between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("bank_card_no not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNull() {
            addCriterion("bank_type is null");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNotNull() {
            addCriterion("bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankTypeEqualTo(String value) {
            addCriterion("bank_type =", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotEqualTo(String value) {
            addCriterion("bank_type <>", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThan(String value) {
            addCriterion("bank_type >", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_type >=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThan(String value) {
            addCriterion("bank_type <", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThanOrEqualTo(String value) {
            addCriterion("bank_type <=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLike(String value) {
            addCriterion("bank_type like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotLike(String value) {
            addCriterion("bank_type not like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIn(List<String> values) {
            addCriterion("bank_type in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotIn(List<String> values) {
            addCriterion("bank_type not in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeBetween(String value1, String value2) {
            addCriterion("bank_type between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotBetween(String value1, String value2) {
            addCriterion("bank_type not between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankKeyIsNull() {
            addCriterion("bank_key is null");
            return (Criteria) this;
        }

        public Criteria andBankKeyIsNotNull() {
            addCriterion("bank_key is not null");
            return (Criteria) this;
        }

        public Criteria andBankKeyEqualTo(String value) {
            addCriterion("bank_key =", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyNotEqualTo(String value) {
            addCriterion("bank_key <>", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyGreaterThan(String value) {
            addCriterion("bank_key >", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyGreaterThanOrEqualTo(String value) {
            addCriterion("bank_key >=", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyLessThan(String value) {
            addCriterion("bank_key <", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyLessThanOrEqualTo(String value) {
            addCriterion("bank_key <=", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyLike(String value) {
            addCriterion("bank_key like", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyNotLike(String value) {
            addCriterion("bank_key not like", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyIn(List<String> values) {
            addCriterion("bank_key in", values, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyNotIn(List<String> values) {
            addCriterion("bank_key not in", values, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyBetween(String value1, String value2) {
            addCriterion("bank_key between", value1, value2, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyNotBetween(String value1, String value2) {
            addCriterion("bank_key not between", value1, value2, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNull() {
            addCriterion("bank_province is null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNotNull() {
            addCriterion("bank_province is not null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceEqualTo(String value) {
            addCriterion("bank_province =", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotEqualTo(String value) {
            addCriterion("bank_province <>", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThan(String value) {
            addCriterion("bank_province >", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("bank_province >=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThan(String value) {
            addCriterion("bank_province <", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThanOrEqualTo(String value) {
            addCriterion("bank_province <=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLike(String value) {
            addCriterion("bank_province like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotLike(String value) {
            addCriterion("bank_province not like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIn(List<String> values) {
            addCriterion("bank_province in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotIn(List<String> values) {
            addCriterion("bank_province not in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceBetween(String value1, String value2) {
            addCriterion("bank_province between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotBetween(String value1, String value2) {
            addCriterion("bank_province not between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNull() {
            addCriterion("bank_city is null");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNotNull() {
            addCriterion("bank_city is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityEqualTo(String value) {
            addCriterion("bank_city =", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotEqualTo(String value) {
            addCriterion("bank_city <>", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThan(String value) {
            addCriterion("bank_city >", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThanOrEqualTo(String value) {
            addCriterion("bank_city >=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThan(String value) {
            addCriterion("bank_city <", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThanOrEqualTo(String value) {
            addCriterion("bank_city <=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLike(String value) {
            addCriterion("bank_city like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotLike(String value) {
            addCriterion("bank_city not like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityIn(List<String> values) {
            addCriterion("bank_city in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotIn(List<String> values) {
            addCriterion("bank_city not in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityBetween(String value1, String value2) {
            addCriterion("bank_city between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotBetween(String value1, String value2) {
            addCriterion("bank_city not between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNull() {
            addCriterion("bank_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNotNull() {
            addCriterion("bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("bank_address =", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("bank_address <>", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("bank_address >", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_address >=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThan(String value) {
            addCriterion("bank_address <", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_address <=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLike(String value) {
            addCriterion("bank_address like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotLike(String value) {
            addCriterion("bank_address not like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("bank_address in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("bank_address not in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("bank_address between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("bank_address not between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(Integer value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(Integer value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(Integer value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(Integer value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(Integer value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(Integer value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<Integer> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<Integer> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(Integer value1, Integer value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(Integer value1, Integer value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andRefereesIsNull() {
            addCriterion("referees is null");
            return (Criteria) this;
        }

        public Criteria andRefereesIsNotNull() {
            addCriterion("referees is not null");
            return (Criteria) this;
        }

        public Criteria andRefereesEqualTo(String value) {
            addCriterion("referees =", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesNotEqualTo(String value) {
            addCriterion("referees <>", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesGreaterThan(String value) {
            addCriterion("referees >", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesGreaterThanOrEqualTo(String value) {
            addCriterion("referees >=", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesLessThan(String value) {
            addCriterion("referees <", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesLessThanOrEqualTo(String value) {
            addCriterion("referees <=", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesLike(String value) {
            addCriterion("referees like", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesNotLike(String value) {
            addCriterion("referees not like", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesIn(List<String> values) {
            addCriterion("referees in", values, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesNotIn(List<String> values) {
            addCriterion("referees not in", values, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesBetween(String value1, String value2) {
            addCriterion("referees between", value1, value2, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesNotBetween(String value1, String value2) {
            addCriterion("referees not between", value1, value2, "referees");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNull() {
            addCriterion("customer_source is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIsNotNull() {
            addCriterion("customer_source is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceEqualTo(String value) {
            addCriterion("customer_source =", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotEqualTo(String value) {
            addCriterion("customer_source <>", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThan(String value) {
            addCriterion("customer_source >", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceGreaterThanOrEqualTo(String value) {
            addCriterion("customer_source >=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThan(String value) {
            addCriterion("customer_source <", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLessThanOrEqualTo(String value) {
            addCriterion("customer_source <=", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceLike(String value) {
            addCriterion("customer_source like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotLike(String value) {
            addCriterion("customer_source not like", value, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceIn(List<String> values) {
            addCriterion("customer_source in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotIn(List<String> values) {
            addCriterion("customer_source not in", values, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceBetween(String value1, String value2) {
            addCriterion("customer_source between", value1, value2, "customerSource");
            return (Criteria) this;
        }

        public Criteria andCustomerSourceNotBetween(String value1, String value2) {
            addCriterion("customer_source not between", value1, value2, "customerSource");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNull() {
            addCriterion("graduated_school is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNotNull() {
            addCriterion("graduated_school is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolEqualTo(String value) {
            addCriterion("graduated_school =", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotEqualTo(String value) {
            addCriterion("graduated_school <>", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThan(String value) {
            addCriterion("graduated_school >", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("graduated_school >=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThan(String value) {
            addCriterion("graduated_school <", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThanOrEqualTo(String value) {
            addCriterion("graduated_school <=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLike(String value) {
            addCriterion("graduated_school like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotLike(String value) {
            addCriterion("graduated_school not like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIn(List<String> values) {
            addCriterion("graduated_school in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotIn(List<String> values) {
            addCriterion("graduated_school not in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolBetween(String value1, String value2) {
            addCriterion("graduated_school between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotBetween(String value1, String value2) {
            addCriterion("graduated_school not between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerIsNull() {
            addCriterion("academic_career is null");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerIsNotNull() {
            addCriterion("academic_career is not null");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerEqualTo(String value) {
            addCriterion("academic_career =", value, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerNotEqualTo(String value) {
            addCriterion("academic_career <>", value, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerGreaterThan(String value) {
            addCriterion("academic_career >", value, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerGreaterThanOrEqualTo(String value) {
            addCriterion("academic_career >=", value, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerLessThan(String value) {
            addCriterion("academic_career <", value, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerLessThanOrEqualTo(String value) {
            addCriterion("academic_career <=", value, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerLike(String value) {
            addCriterion("academic_career like", value, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerNotLike(String value) {
            addCriterion("academic_career not like", value, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerIn(List<String> values) {
            addCriterion("academic_career in", values, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerNotIn(List<String> values) {
            addCriterion("academic_career not in", values, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerBetween(String value1, String value2) {
            addCriterion("academic_career between", value1, value2, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andAcademicCareerNotBetween(String value1, String value2) {
            addCriterion("academic_career not between", value1, value2, "academicCareer");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsIsNull() {
            addCriterion("language_skills is null");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsIsNotNull() {
            addCriterion("language_skills is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsEqualTo(String value) {
            addCriterion("language_skills =", value, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsNotEqualTo(String value) {
            addCriterion("language_skills <>", value, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsGreaterThan(String value) {
            addCriterion("language_skills >", value, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsGreaterThanOrEqualTo(String value) {
            addCriterion("language_skills >=", value, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsLessThan(String value) {
            addCriterion("language_skills <", value, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsLessThanOrEqualTo(String value) {
            addCriterion("language_skills <=", value, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsLike(String value) {
            addCriterion("language_skills like", value, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsNotLike(String value) {
            addCriterion("language_skills not like", value, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsIn(List<String> values) {
            addCriterion("language_skills in", values, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsNotIn(List<String> values) {
            addCriterion("language_skills not in", values, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsBetween(String value1, String value2) {
            addCriterion("language_skills between", value1, value2, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andLanguageSkillsNotBetween(String value1, String value2) {
            addCriterion("language_skills not between", value1, value2, "languageSkills");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andMottoIsNull() {
            addCriterion("motto is null");
            return (Criteria) this;
        }

        public Criteria andMottoIsNotNull() {
            addCriterion("motto is not null");
            return (Criteria) this;
        }

        public Criteria andMottoEqualTo(String value) {
            addCriterion("motto =", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotEqualTo(String value) {
            addCriterion("motto <>", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThan(String value) {
            addCriterion("motto >", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoGreaterThanOrEqualTo(String value) {
            addCriterion("motto >=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThan(String value) {
            addCriterion("motto <", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLessThanOrEqualTo(String value) {
            addCriterion("motto <=", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoLike(String value) {
            addCriterion("motto like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotLike(String value) {
            addCriterion("motto not like", value, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoIn(List<String> values) {
            addCriterion("motto in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotIn(List<String> values) {
            addCriterion("motto not in", values, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoBetween(String value1, String value2) {
            addCriterion("motto between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andMottoNotBetween(String value1, String value2) {
            addCriterion("motto not between", value1, value2, "motto");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelIsNull() {
            addCriterion("mandarin_level is null");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelIsNotNull() {
            addCriterion("mandarin_level is not null");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelEqualTo(String value) {
            addCriterion("mandarin_level =", value, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelNotEqualTo(String value) {
            addCriterion("mandarin_level <>", value, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelGreaterThan(String value) {
            addCriterion("mandarin_level >", value, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelGreaterThanOrEqualTo(String value) {
            addCriterion("mandarin_level >=", value, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelLessThan(String value) {
            addCriterion("mandarin_level <", value, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelLessThanOrEqualTo(String value) {
            addCriterion("mandarin_level <=", value, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelLike(String value) {
            addCriterion("mandarin_level like", value, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelNotLike(String value) {
            addCriterion("mandarin_level not like", value, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelIn(List<String> values) {
            addCriterion("mandarin_level in", values, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelNotIn(List<String> values) {
            addCriterion("mandarin_level not in", values, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelBetween(String value1, String value2) {
            addCriterion("mandarin_level between", value1, value2, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinLevelNotBetween(String value1, String value2) {
            addCriterion("mandarin_level not between", value1, value2, "mandarinLevel");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlIsNull() {
            addCriterion("mandarin_qualification_url is null");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlIsNotNull() {
            addCriterion("mandarin_qualification_url is not null");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlEqualTo(String value) {
            addCriterion("mandarin_qualification_url =", value, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlNotEqualTo(String value) {
            addCriterion("mandarin_qualification_url <>", value, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlGreaterThan(String value) {
            addCriterion("mandarin_qualification_url >", value, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlGreaterThanOrEqualTo(String value) {
            addCriterion("mandarin_qualification_url >=", value, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlLessThan(String value) {
            addCriterion("mandarin_qualification_url <", value, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlLessThanOrEqualTo(String value) {
            addCriterion("mandarin_qualification_url <=", value, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlLike(String value) {
            addCriterion("mandarin_qualification_url like", value, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlNotLike(String value) {
            addCriterion("mandarin_qualification_url not like", value, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlIn(List<String> values) {
            addCriterion("mandarin_qualification_url in", values, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlNotIn(List<String> values) {
            addCriterion("mandarin_qualification_url not in", values, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlBetween(String value1, String value2) {
            addCriterion("mandarin_qualification_url between", value1, value2, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andMandarinQualificationUrlNotBetween(String value1, String value2) {
            addCriterion("mandarin_qualification_url not between", value1, value2, "mandarinQualificationUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlIsNull() {
            addCriterion("record_url is null");
            return (Criteria) this;
        }

        public Criteria andRecordUrlIsNotNull() {
            addCriterion("record_url is not null");
            return (Criteria) this;
        }

        public Criteria andRecordUrlEqualTo(String value) {
            addCriterion("record_url =", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotEqualTo(String value) {
            addCriterion("record_url <>", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlGreaterThan(String value) {
            addCriterion("record_url >", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlGreaterThanOrEqualTo(String value) {
            addCriterion("record_url >=", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlLessThan(String value) {
            addCriterion("record_url <", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlLessThanOrEqualTo(String value) {
            addCriterion("record_url <=", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlLike(String value) {
            addCriterion("record_url like", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotLike(String value) {
            addCriterion("record_url not like", value, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlIn(List<String> values) {
            addCriterion("record_url in", values, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotIn(List<String> values) {
            addCriterion("record_url not in", values, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlBetween(String value1, String value2) {
            addCriterion("record_url between", value1, value2, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andRecordUrlNotBetween(String value1, String value2) {
            addCriterion("record_url not between", value1, value2, "recordUrl");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceIsNull() {
            addCriterion("teaching_experience is null");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceIsNotNull() {
            addCriterion("teaching_experience is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceEqualTo(String value) {
            addCriterion("teaching_experience =", value, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceNotEqualTo(String value) {
            addCriterion("teaching_experience <>", value, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceGreaterThan(String value) {
            addCriterion("teaching_experience >", value, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_experience >=", value, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceLessThan(String value) {
            addCriterion("teaching_experience <", value, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceLessThanOrEqualTo(String value) {
            addCriterion("teaching_experience <=", value, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceLike(String value) {
            addCriterion("teaching_experience like", value, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceNotLike(String value) {
            addCriterion("teaching_experience not like", value, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceIn(List<String> values) {
            addCriterion("teaching_experience in", values, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceNotIn(List<String> values) {
            addCriterion("teaching_experience not in", values, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceBetween(String value1, String value2) {
            addCriterion("teaching_experience between", value1, value2, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andTeachingExperienceNotBetween(String value1, String value2) {
            addCriterion("teaching_experience not between", value1, value2, "teachingExperience");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlIsNull() {
            addCriterion("other_materials_url is null");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlIsNotNull() {
            addCriterion("other_materials_url is not null");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlEqualTo(String value) {
            addCriterion("other_materials_url =", value, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlNotEqualTo(String value) {
            addCriterion("other_materials_url <>", value, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlGreaterThan(String value) {
            addCriterion("other_materials_url >", value, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("other_materials_url >=", value, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlLessThan(String value) {
            addCriterion("other_materials_url <", value, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlLessThanOrEqualTo(String value) {
            addCriterion("other_materials_url <=", value, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlLike(String value) {
            addCriterion("other_materials_url like", value, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlNotLike(String value) {
            addCriterion("other_materials_url not like", value, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlIn(List<String> values) {
            addCriterion("other_materials_url in", values, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlNotIn(List<String> values) {
            addCriterion("other_materials_url not in", values, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlBetween(String value1, String value2) {
            addCriterion("other_materials_url between", value1, value2, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andOtherMaterialsUrlNotBetween(String value1, String value2) {
            addCriterion("other_materials_url not between", value1, value2, "otherMaterialsUrl");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
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
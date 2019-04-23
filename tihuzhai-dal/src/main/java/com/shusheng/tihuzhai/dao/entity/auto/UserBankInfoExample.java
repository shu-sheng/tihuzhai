package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBankInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBankInfoExample() {
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

        public Criteria andIsDefaultIsNull() {
            addCriterion("is_default is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("is_default is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("is_default =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("is_default <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("is_default >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("is_default >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("is_default <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("is_default <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("is_default like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("is_default not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("is_default in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("is_default not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("is_default between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("is_default not between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andBankOrderIsNull() {
            addCriterion("bank_order is null");
            return (Criteria) this;
        }

        public Criteria andBankOrderIsNotNull() {
            addCriterion("bank_order is not null");
            return (Criteria) this;
        }

        public Criteria andBankOrderEqualTo(Integer value) {
            addCriterion("bank_order =", value, "bankOrder");
            return (Criteria) this;
        }

        public Criteria andBankOrderNotEqualTo(Integer value) {
            addCriterion("bank_order <>", value, "bankOrder");
            return (Criteria) this;
        }

        public Criteria andBankOrderGreaterThan(Integer value) {
            addCriterion("bank_order >", value, "bankOrder");
            return (Criteria) this;
        }

        public Criteria andBankOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_order >=", value, "bankOrder");
            return (Criteria) this;
        }

        public Criteria andBankOrderLessThan(Integer value) {
            addCriterion("bank_order <", value, "bankOrder");
            return (Criteria) this;
        }

        public Criteria andBankOrderLessThanOrEqualTo(Integer value) {
            addCriterion("bank_order <=", value, "bankOrder");
            return (Criteria) this;
        }

        public Criteria andBankOrderIn(List<Integer> values) {
            addCriterion("bank_order in", values, "bankOrder");
            return (Criteria) this;
        }

        public Criteria andBankOrderNotIn(List<Integer> values) {
            addCriterion("bank_order not in", values, "bankOrder");
            return (Criteria) this;
        }

        public Criteria andBankOrderBetween(Integer value1, Integer value2) {
            addCriterion("bank_order between", value1, value2, "bankOrder");
            return (Criteria) this;
        }

        public Criteria andBankOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_order not between", value1, value2, "bankOrder");
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

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(String value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(String value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(String value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(String value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(String value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(String value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLike(String value) {
            addCriterion("is_del like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotLike(String value) {
            addCriterion("is_del not like", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<String> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<String> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(String value1, String value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(String value1, String value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andPactnoIsNull() {
            addCriterion("pactNo is null");
            return (Criteria) this;
        }

        public Criteria andPactnoIsNotNull() {
            addCriterion("pactNo is not null");
            return (Criteria) this;
        }

        public Criteria andPactnoEqualTo(String value) {
            addCriterion("pactNo =", value, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoNotEqualTo(String value) {
            addCriterion("pactNo <>", value, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoGreaterThan(String value) {
            addCriterion("pactNo >", value, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoGreaterThanOrEqualTo(String value) {
            addCriterion("pactNo >=", value, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoLessThan(String value) {
            addCriterion("pactNo <", value, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoLessThanOrEqualTo(String value) {
            addCriterion("pactNo <=", value, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoLike(String value) {
            addCriterion("pactNo like", value, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoNotLike(String value) {
            addCriterion("pactNo not like", value, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoIn(List<String> values) {
            addCriterion("pactNo in", values, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoNotIn(List<String> values) {
            addCriterion("pactNo not in", values, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoBetween(String value1, String value2) {
            addCriterion("pactNo between", value1, value2, "pactno");
            return (Criteria) this;
        }

        public Criteria andPactnoNotBetween(String value1, String value2) {
            addCriterion("pactNo not between", value1, value2, "pactno");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNull() {
            addCriterion("bank_account_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIsNotNull() {
            addCriterion("bank_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameEqualTo(String value) {
            addCriterion("bank_account_name =", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotEqualTo(String value) {
            addCriterion("bank_account_name <>", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThan(String value) {
            addCriterion("bank_account_name >", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_name >=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThan(String value) {
            addCriterion("bank_account_name <", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_account_name <=", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameLike(String value) {
            addCriterion("bank_account_name like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotLike(String value) {
            addCriterion("bank_account_name not like", value, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameIn(List<String> values) {
            addCriterion("bank_account_name in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotIn(List<String> values) {
            addCriterion("bank_account_name not in", values, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameBetween(String value1, String value2) {
            addCriterion("bank_account_name between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andBankAccountNameNotBetween(String value1, String value2) {
            addCriterion("bank_account_name not between", value1, value2, "bankAccountName");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeIsNull() {
            addCriterion("card_use_type is null");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeIsNotNull() {
            addCriterion("card_use_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeEqualTo(String value) {
            addCriterion("card_use_type =", value, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeNotEqualTo(String value) {
            addCriterion("card_use_type <>", value, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeGreaterThan(String value) {
            addCriterion("card_use_type >", value, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_use_type >=", value, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeLessThan(String value) {
            addCriterion("card_use_type <", value, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeLessThanOrEqualTo(String value) {
            addCriterion("card_use_type <=", value, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeLike(String value) {
            addCriterion("card_use_type like", value, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeNotLike(String value) {
            addCriterion("card_use_type not like", value, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeIn(List<String> values) {
            addCriterion("card_use_type in", values, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeNotIn(List<String> values) {
            addCriterion("card_use_type not in", values, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeBetween(String value1, String value2) {
            addCriterion("card_use_type between", value1, value2, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andCardUseTypeNotBetween(String value1, String value2) {
            addCriterion("card_use_type not between", value1, value2, "cardUseType");
            return (Criteria) this;
        }

        public Criteria andPublicTagIsNull() {
            addCriterion("public_tag is null");
            return (Criteria) this;
        }

        public Criteria andPublicTagIsNotNull() {
            addCriterion("public_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPublicTagEqualTo(String value) {
            addCriterion("public_tag =", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagNotEqualTo(String value) {
            addCriterion("public_tag <>", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagGreaterThan(String value) {
            addCriterion("public_tag >", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagGreaterThanOrEqualTo(String value) {
            addCriterion("public_tag >=", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagLessThan(String value) {
            addCriterion("public_tag <", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagLessThanOrEqualTo(String value) {
            addCriterion("public_tag <=", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagLike(String value) {
            addCriterion("public_tag like", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagNotLike(String value) {
            addCriterion("public_tag not like", value, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagIn(List<String> values) {
            addCriterion("public_tag in", values, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagNotIn(List<String> values) {
            addCriterion("public_tag not in", values, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagBetween(String value1, String value2) {
            addCriterion("public_tag between", value1, value2, "publicTag");
            return (Criteria) this;
        }

        public Criteria andPublicTagNotBetween(String value1, String value2) {
            addCriterion("public_tag not between", value1, value2, "publicTag");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIsNull() {
            addCriterion("approve_status is null");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIsNotNull() {
            addCriterion("approve_status is not null");
            return (Criteria) this;
        }

        public Criteria andApproveStatusEqualTo(String value) {
            addCriterion("approve_status =", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotEqualTo(String value) {
            addCriterion("approve_status <>", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusGreaterThan(String value) {
            addCriterion("approve_status >", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusGreaterThanOrEqualTo(String value) {
            addCriterion("approve_status >=", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLessThan(String value) {
            addCriterion("approve_status <", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLessThanOrEqualTo(String value) {
            addCriterion("approve_status <=", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusLike(String value) {
            addCriterion("approve_status like", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotLike(String value) {
            addCriterion("approve_status not like", value, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusIn(List<String> values) {
            addCriterion("approve_status in", values, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotIn(List<String> values) {
            addCriterion("approve_status not in", values, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusBetween(String value1, String value2) {
            addCriterion("approve_status between", value1, value2, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andApproveStatusNotBetween(String value1, String value2) {
            addCriterion("approve_status not between", value1, value2, "approveStatus");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlIsNull() {
            addCriterion("certification_img_url is null");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlIsNotNull() {
            addCriterion("certification_img_url is not null");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlEqualTo(String value) {
            addCriterion("certification_img_url =", value, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlNotEqualTo(String value) {
            addCriterion("certification_img_url <>", value, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlGreaterThan(String value) {
            addCriterion("certification_img_url >", value, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("certification_img_url >=", value, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlLessThan(String value) {
            addCriterion("certification_img_url <", value, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlLessThanOrEqualTo(String value) {
            addCriterion("certification_img_url <=", value, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlLike(String value) {
            addCriterion("certification_img_url like", value, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlNotLike(String value) {
            addCriterion("certification_img_url not like", value, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlIn(List<String> values) {
            addCriterion("certification_img_url in", values, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlNotIn(List<String> values) {
            addCriterion("certification_img_url not in", values, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlBetween(String value1, String value2) {
            addCriterion("certification_img_url between", value1, value2, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andCertificationImgUrlNotBetween(String value1, String value2) {
            addCriterion("certification_img_url not between", value1, value2, "certificationImgUrl");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsIsNull() {
            addCriterion("dismissed_suggestions is null");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsIsNotNull() {
            addCriterion("dismissed_suggestions is not null");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsEqualTo(String value) {
            addCriterion("dismissed_suggestions =", value, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsNotEqualTo(String value) {
            addCriterion("dismissed_suggestions <>", value, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsGreaterThan(String value) {
            addCriterion("dismissed_suggestions >", value, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsGreaterThanOrEqualTo(String value) {
            addCriterion("dismissed_suggestions >=", value, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsLessThan(String value) {
            addCriterion("dismissed_suggestions <", value, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsLessThanOrEqualTo(String value) {
            addCriterion("dismissed_suggestions <=", value, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsLike(String value) {
            addCriterion("dismissed_suggestions like", value, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsNotLike(String value) {
            addCriterion("dismissed_suggestions not like", value, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsIn(List<String> values) {
            addCriterion("dismissed_suggestions in", values, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsNotIn(List<String> values) {
            addCriterion("dismissed_suggestions not in", values, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsBetween(String value1, String value2) {
            addCriterion("dismissed_suggestions between", value1, value2, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andDismissedSuggestionsNotBetween(String value1, String value2) {
            addCriterion("dismissed_suggestions not between", value1, value2, "dismissedSuggestions");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
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
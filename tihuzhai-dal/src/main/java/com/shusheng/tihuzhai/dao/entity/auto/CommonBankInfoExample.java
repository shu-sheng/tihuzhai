package com.shusheng.tihuzhai.dao.entity.auto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CommonBankInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonBankInfoExample() {
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

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(Integer value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(Integer value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(Integer value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(Integer value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(Integer value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<Integer> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<Integer> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(Integer value1, Integer value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoIsNull() {
            addCriterion("e3rdpayno is null");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoIsNotNull() {
            addCriterion("e3rdpayno is not null");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoEqualTo(String value) {
            addCriterion("e3rdpayno =", value, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoNotEqualTo(String value) {
            addCriterion("e3rdpayno <>", value, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoGreaterThan(String value) {
            addCriterion("e3rdpayno >", value, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoGreaterThanOrEqualTo(String value) {
            addCriterion("e3rdpayno >=", value, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoLessThan(String value) {
            addCriterion("e3rdpayno <", value, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoLessThanOrEqualTo(String value) {
            addCriterion("e3rdpayno <=", value, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoLike(String value) {
            addCriterion("e3rdpayno like", value, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoNotLike(String value) {
            addCriterion("e3rdpayno not like", value, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoIn(List<String> values) {
            addCriterion("e3rdpayno in", values, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoNotIn(List<String> values) {
            addCriterion("e3rdpayno not in", values, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoBetween(String value1, String value2) {
            addCriterion("e3rdpayno between", value1, value2, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andE3rdpaynoNotBetween(String value1, String value2) {
            addCriterion("e3rdpayno not between", value1, value2, "e3rdpayno");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andOrderModeIsNull() {
            addCriterion("order_mode is null");
            return (Criteria) this;
        }

        public Criteria andOrderModeIsNotNull() {
            addCriterion("order_mode is not null");
            return (Criteria) this;
        }

        public Criteria andOrderModeEqualTo(Boolean value) {
            addCriterion("order_mode =", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeNotEqualTo(Boolean value) {
            addCriterion("order_mode <>", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeGreaterThan(Boolean value) {
            addCriterion("order_mode >", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_mode >=", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeLessThan(Boolean value) {
            addCriterion("order_mode <", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeLessThanOrEqualTo(Boolean value) {
            addCriterion("order_mode <=", value, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeIn(List<Boolean> values) {
            addCriterion("order_mode in", values, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeNotIn(List<Boolean> values) {
            addCriterion("order_mode not in", values, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeBetween(Boolean value1, Boolean value2) {
            addCriterion("order_mode between", value1, value2, "orderMode");
            return (Criteria) this;
        }

        public Criteria andOrderModeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_mode not between", value1, value2, "orderMode");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeIsNull() {
            addCriterion("support_card_type is null");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeIsNotNull() {
            addCriterion("support_card_type is not null");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeEqualTo(Boolean value) {
            addCriterion("support_card_type =", value, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeNotEqualTo(Boolean value) {
            addCriterion("support_card_type <>", value, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeGreaterThan(Boolean value) {
            addCriterion("support_card_type >", value, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("support_card_type >=", value, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeLessThan(Boolean value) {
            addCriterion("support_card_type <", value, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("support_card_type <=", value, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeIn(List<Boolean> values) {
            addCriterion("support_card_type in", values, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeNotIn(List<Boolean> values) {
            addCriterion("support_card_type not in", values, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("support_card_type between", value1, value2, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andSupportCardTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("support_card_type not between", value1, value2, "supportCardType");
            return (Criteria) this;
        }

        public Criteria andPayLimitIsNull() {
            addCriterion("pay_limit is null");
            return (Criteria) this;
        }

        public Criteria andPayLimitIsNotNull() {
            addCriterion("pay_limit is not null");
            return (Criteria) this;
        }

        public Criteria andPayLimitEqualTo(BigDecimal value) {
            addCriterion("pay_limit =", value, "payLimit");
            return (Criteria) this;
        }

        public Criteria andPayLimitNotEqualTo(BigDecimal value) {
            addCriterion("pay_limit <>", value, "payLimit");
            return (Criteria) this;
        }

        public Criteria andPayLimitGreaterThan(BigDecimal value) {
            addCriterion("pay_limit >", value, "payLimit");
            return (Criteria) this;
        }

        public Criteria andPayLimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_limit >=", value, "payLimit");
            return (Criteria) this;
        }

        public Criteria andPayLimitLessThan(BigDecimal value) {
            addCriterion("pay_limit <", value, "payLimit");
            return (Criteria) this;
        }

        public Criteria andPayLimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pay_limit <=", value, "payLimit");
            return (Criteria) this;
        }

        public Criteria andPayLimitIn(List<BigDecimal> values) {
            addCriterion("pay_limit in", values, "payLimit");
            return (Criteria) this;
        }

        public Criteria andPayLimitNotIn(List<BigDecimal> values) {
            addCriterion("pay_limit not in", values, "payLimit");
            return (Criteria) this;
        }

        public Criteria andPayLimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_limit between", value1, value2, "payLimit");
            return (Criteria) this;
        }

        public Criteria andPayLimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pay_limit not between", value1, value2, "payLimit");
            return (Criteria) this;
        }

        public Criteria andServeFeeIsNull() {
            addCriterion("serve_fee is null");
            return (Criteria) this;
        }

        public Criteria andServeFeeIsNotNull() {
            addCriterion("serve_fee is not null");
            return (Criteria) this;
        }

        public Criteria andServeFeeEqualTo(Boolean value) {
            addCriterion("serve_fee =", value, "serveFee");
            return (Criteria) this;
        }

        public Criteria andServeFeeNotEqualTo(Boolean value) {
            addCriterion("serve_fee <>", value, "serveFee");
            return (Criteria) this;
        }

        public Criteria andServeFeeGreaterThan(Boolean value) {
            addCriterion("serve_fee >", value, "serveFee");
            return (Criteria) this;
        }

        public Criteria andServeFeeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("serve_fee >=", value, "serveFee");
            return (Criteria) this;
        }

        public Criteria andServeFeeLessThan(Boolean value) {
            addCriterion("serve_fee <", value, "serveFee");
            return (Criteria) this;
        }

        public Criteria andServeFeeLessThanOrEqualTo(Boolean value) {
            addCriterion("serve_fee <=", value, "serveFee");
            return (Criteria) this;
        }

        public Criteria andServeFeeIn(List<Boolean> values) {
            addCriterion("serve_fee in", values, "serveFee");
            return (Criteria) this;
        }

        public Criteria andServeFeeNotIn(List<Boolean> values) {
            addCriterion("serve_fee not in", values, "serveFee");
            return (Criteria) this;
        }

        public Criteria andServeFeeBetween(Boolean value1, Boolean value2) {
            addCriterion("serve_fee between", value1, value2, "serveFee");
            return (Criteria) this;
        }

        public Criteria andServeFeeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("serve_fee not between", value1, value2, "serveFee");
            return (Criteria) this;
        }

        public Criteria andFeeRateIsNull() {
            addCriterion("fee_rate is null");
            return (Criteria) this;
        }

        public Criteria andFeeRateIsNotNull() {
            addCriterion("fee_rate is not null");
            return (Criteria) this;
        }

        public Criteria andFeeRateEqualTo(BigDecimal value) {
            addCriterion("fee_rate =", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotEqualTo(BigDecimal value) {
            addCriterion("fee_rate <>", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThan(BigDecimal value) {
            addCriterion("fee_rate >", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_rate >=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThan(BigDecimal value) {
            addCriterion("fee_rate <", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_rate <=", value, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateIn(List<BigDecimal> values) {
            addCriterion("fee_rate in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotIn(List<BigDecimal> values) {
            addCriterion("fee_rate not in", values, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_rate between", value1, value2, "feeRate");
            return (Criteria) this;
        }

        public Criteria andFeeRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_rate not between", value1, value2, "feeRate");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNull() {
            addCriterion("risk_level is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIsNotNull() {
            addCriterion("risk_level is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelEqualTo(Boolean value) {
            addCriterion("risk_level =", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotEqualTo(Boolean value) {
            addCriterion("risk_level <>", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThan(Boolean value) {
            addCriterion("risk_level >", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("risk_level >=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThan(Boolean value) {
            addCriterion("risk_level <", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("risk_level <=", value, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelIn(List<Boolean> values) {
            addCriterion("risk_level in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotIn(List<Boolean> values) {
            addCriterion("risk_level not in", values, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("risk_level between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andRiskLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("risk_level not between", value1, value2, "riskLevel");
            return (Criteria) this;
        }

        public Criteria andNotifyModeIsNull() {
            addCriterion("notify_mode is null");
            return (Criteria) this;
        }

        public Criteria andNotifyModeIsNotNull() {
            addCriterion("notify_mode is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyModeEqualTo(Boolean value) {
            addCriterion("notify_mode =", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeNotEqualTo(Boolean value) {
            addCriterion("notify_mode <>", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeGreaterThan(Boolean value) {
            addCriterion("notify_mode >", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("notify_mode >=", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeLessThan(Boolean value) {
            addCriterion("notify_mode <", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeLessThanOrEqualTo(Boolean value) {
            addCriterion("notify_mode <=", value, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeIn(List<Boolean> values) {
            addCriterion("notify_mode in", values, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeNotIn(List<Boolean> values) {
            addCriterion("notify_mode not in", values, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeBetween(Boolean value1, Boolean value2) {
            addCriterion("notify_mode between", value1, value2, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyModeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("notify_mode not between", value1, value2, "notifyMode");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeIsNull() {
            addCriterion("notify_scope is null");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeIsNotNull() {
            addCriterion("notify_scope is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeEqualTo(Boolean value) {
            addCriterion("notify_scope =", value, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeNotEqualTo(Boolean value) {
            addCriterion("notify_scope <>", value, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeGreaterThan(Boolean value) {
            addCriterion("notify_scope >", value, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("notify_scope >=", value, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeLessThan(Boolean value) {
            addCriterion("notify_scope <", value, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeLessThanOrEqualTo(Boolean value) {
            addCriterion("notify_scope <=", value, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeIn(List<Boolean> values) {
            addCriterion("notify_scope in", values, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeNotIn(List<Boolean> values) {
            addCriterion("notify_scope not in", values, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeBetween(Boolean value1, Boolean value2) {
            addCriterion("notify_scope between", value1, value2, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andNotifyScopeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("notify_scope not between", value1, value2, "notifyScope");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfIsNull() {
            addCriterion("is_safeinf is null");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfIsNotNull() {
            addCriterion("is_safeinf is not null");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfEqualTo(Boolean value) {
            addCriterion("is_safeinf =", value, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfNotEqualTo(Boolean value) {
            addCriterion("is_safeinf <>", value, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfGreaterThan(Boolean value) {
            addCriterion("is_safeinf >", value, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_safeinf >=", value, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfLessThan(Boolean value) {
            addCriterion("is_safeinf <", value, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfLessThanOrEqualTo(Boolean value) {
            addCriterion("is_safeinf <=", value, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfIn(List<Boolean> values) {
            addCriterion("is_safeinf in", values, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfNotIn(List<Boolean> values) {
            addCriterion("is_safeinf not in", values, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfBetween(Boolean value1, Boolean value2) {
            addCriterion("is_safeinf between", value1, value2, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andIsSafeinfNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_safeinf not between", value1, value2, "isSafeinf");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlIsNull() {
            addCriterion("bank_test_request_url is null");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlIsNotNull() {
            addCriterion("bank_test_request_url is not null");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlEqualTo(String value) {
            addCriterion("bank_test_request_url =", value, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlNotEqualTo(String value) {
            addCriterion("bank_test_request_url <>", value, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlGreaterThan(String value) {
            addCriterion("bank_test_request_url >", value, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bank_test_request_url >=", value, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlLessThan(String value) {
            addCriterion("bank_test_request_url <", value, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("bank_test_request_url <=", value, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlLike(String value) {
            addCriterion("bank_test_request_url like", value, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlNotLike(String value) {
            addCriterion("bank_test_request_url not like", value, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlIn(List<String> values) {
            addCriterion("bank_test_request_url in", values, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlNotIn(List<String> values) {
            addCriterion("bank_test_request_url not in", values, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlBetween(String value1, String value2) {
            addCriterion("bank_test_request_url between", value1, value2, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankTestRequestUrlNotBetween(String value1, String value2) {
            addCriterion("bank_test_request_url not between", value1, value2, "bankTestRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlIsNull() {
            addCriterion("bank_request_url is null");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlIsNotNull() {
            addCriterion("bank_request_url is not null");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlEqualTo(String value) {
            addCriterion("bank_request_url =", value, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlNotEqualTo(String value) {
            addCriterion("bank_request_url <>", value, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlGreaterThan(String value) {
            addCriterion("bank_request_url >", value, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlGreaterThanOrEqualTo(String value) {
            addCriterion("bank_request_url >=", value, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlLessThan(String value) {
            addCriterion("bank_request_url <", value, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlLessThanOrEqualTo(String value) {
            addCriterion("bank_request_url <=", value, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlLike(String value) {
            addCriterion("bank_request_url like", value, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlNotLike(String value) {
            addCriterion("bank_request_url not like", value, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlIn(List<String> values) {
            addCriterion("bank_request_url in", values, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlNotIn(List<String> values) {
            addCriterion("bank_request_url not in", values, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlBetween(String value1, String value2) {
            addCriterion("bank_request_url between", value1, value2, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankRequestUrlNotBetween(String value1, String value2) {
            addCriterion("bank_request_url not between", value1, value2, "bankRequestUrl");
            return (Criteria) this;
        }

        public Criteria andBankLogoIsNull() {
            addCriterion("bank_logo is null");
            return (Criteria) this;
        }

        public Criteria andBankLogoIsNotNull() {
            addCriterion("bank_logo is not null");
            return (Criteria) this;
        }

        public Criteria andBankLogoEqualTo(String value) {
            addCriterion("bank_logo =", value, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoNotEqualTo(String value) {
            addCriterion("bank_logo <>", value, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoGreaterThan(String value) {
            addCriterion("bank_logo >", value, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_logo >=", value, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoLessThan(String value) {
            addCriterion("bank_logo <", value, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoLessThanOrEqualTo(String value) {
            addCriterion("bank_logo <=", value, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoLike(String value) {
            addCriterion("bank_logo like", value, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoNotLike(String value) {
            addCriterion("bank_logo not like", value, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoIn(List<String> values) {
            addCriterion("bank_logo in", values, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoNotIn(List<String> values) {
            addCriterion("bank_logo not in", values, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoBetween(String value1, String value2) {
            addCriterion("bank_logo between", value1, value2, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andBankLogoNotBetween(String value1, String value2) {
            addCriterion("bank_logo not between", value1, value2, "bankLogo");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Boolean value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Boolean value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Boolean value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Boolean value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Boolean> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Boolean> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("is_show is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("is_show is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(Boolean value) {
            addCriterion("is_show =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(Boolean value) {
            addCriterion("is_show <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(Boolean value) {
            addCriterion("is_show >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_show >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(Boolean value) {
            addCriterion("is_show <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(Boolean value) {
            addCriterion("is_show <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<Boolean> values) {
            addCriterion("is_show in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<Boolean> values) {
            addCriterion("is_show not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_show not between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Boolean value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Boolean value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Boolean value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Boolean value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Boolean value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Boolean> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Boolean> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Boolean value1, Boolean value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCardPurposeIsNull() {
            addCriterion("CARD_PURPOSE is null");
            return (Criteria) this;
        }

        public Criteria andCardPurposeIsNotNull() {
            addCriterion("CARD_PURPOSE is not null");
            return (Criteria) this;
        }

        public Criteria andCardPurposeEqualTo(String value) {
            addCriterion("CARD_PURPOSE =", value, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeNotEqualTo(String value) {
            addCriterion("CARD_PURPOSE <>", value, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeGreaterThan(String value) {
            addCriterion("CARD_PURPOSE >", value, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_PURPOSE >=", value, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeLessThan(String value) {
            addCriterion("CARD_PURPOSE <", value, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeLessThanOrEqualTo(String value) {
            addCriterion("CARD_PURPOSE <=", value, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeLike(String value) {
            addCriterion("CARD_PURPOSE like", value, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeNotLike(String value) {
            addCriterion("CARD_PURPOSE not like", value, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeIn(List<String> values) {
            addCriterion("CARD_PURPOSE in", values, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeNotIn(List<String> values) {
            addCriterion("CARD_PURPOSE not in", values, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeBetween(String value1, String value2) {
            addCriterion("CARD_PURPOSE between", value1, value2, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardPurposeNotBetween(String value1, String value2) {
            addCriterion("CARD_PURPOSE not between", value1, value2, "cardPurpose");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnIsNull() {
            addCriterion("CARD_UNION_YN is null");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnIsNotNull() {
            addCriterion("CARD_UNION_YN is not null");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnEqualTo(String value) {
            addCriterion("CARD_UNION_YN =", value, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnNotEqualTo(String value) {
            addCriterion("CARD_UNION_YN <>", value, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnGreaterThan(String value) {
            addCriterion("CARD_UNION_YN >", value, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_UNION_YN >=", value, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnLessThan(String value) {
            addCriterion("CARD_UNION_YN <", value, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnLessThanOrEqualTo(String value) {
            addCriterion("CARD_UNION_YN <=", value, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnLike(String value) {
            addCriterion("CARD_UNION_YN like", value, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnNotLike(String value) {
            addCriterion("CARD_UNION_YN not like", value, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnIn(List<String> values) {
            addCriterion("CARD_UNION_YN in", values, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnNotIn(List<String> values) {
            addCriterion("CARD_UNION_YN not in", values, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnBetween(String value1, String value2) {
            addCriterion("CARD_UNION_YN between", value1, value2, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andCardUnionYnNotBetween(String value1, String value2) {
            addCriterion("CARD_UNION_YN not between", value1, value2, "cardUnionYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnIsNull() {
            addCriterion("INTER_BANK_TRANSFER_YN is null");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnIsNotNull() {
            addCriterion("INTER_BANK_TRANSFER_YN is not null");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnEqualTo(String value) {
            addCriterion("INTER_BANK_TRANSFER_YN =", value, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnNotEqualTo(String value) {
            addCriterion("INTER_BANK_TRANSFER_YN <>", value, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnGreaterThan(String value) {
            addCriterion("INTER_BANK_TRANSFER_YN >", value, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnGreaterThanOrEqualTo(String value) {
            addCriterion("INTER_BANK_TRANSFER_YN >=", value, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnLessThan(String value) {
            addCriterion("INTER_BANK_TRANSFER_YN <", value, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnLessThanOrEqualTo(String value) {
            addCriterion("INTER_BANK_TRANSFER_YN <=", value, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnLike(String value) {
            addCriterion("INTER_BANK_TRANSFER_YN like", value, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnNotLike(String value) {
            addCriterion("INTER_BANK_TRANSFER_YN not like", value, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnIn(List<String> values) {
            addCriterion("INTER_BANK_TRANSFER_YN in", values, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnNotIn(List<String> values) {
            addCriterion("INTER_BANK_TRANSFER_YN not in", values, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnBetween(String value1, String value2) {
            addCriterion("INTER_BANK_TRANSFER_YN between", value1, value2, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andInterBankTransferYnNotBetween(String value1, String value2) {
            addCriterion("INTER_BANK_TRANSFER_YN not between", value1, value2, "interBankTransferYn");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagIsNull() {
            addCriterion("PUBLIC_PRIVATE_TAG is null");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagIsNotNull() {
            addCriterion("PUBLIC_PRIVATE_TAG is not null");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagEqualTo(String value) {
            addCriterion("PUBLIC_PRIVATE_TAG =", value, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagNotEqualTo(String value) {
            addCriterion("PUBLIC_PRIVATE_TAG <>", value, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagGreaterThan(String value) {
            addCriterion("PUBLIC_PRIVATE_TAG >", value, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagGreaterThanOrEqualTo(String value) {
            addCriterion("PUBLIC_PRIVATE_TAG >=", value, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagLessThan(String value) {
            addCriterion("PUBLIC_PRIVATE_TAG <", value, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagLessThanOrEqualTo(String value) {
            addCriterion("PUBLIC_PRIVATE_TAG <=", value, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagLike(String value) {
            addCriterion("PUBLIC_PRIVATE_TAG like", value, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagNotLike(String value) {
            addCriterion("PUBLIC_PRIVATE_TAG not like", value, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagIn(List<String> values) {
            addCriterion("PUBLIC_PRIVATE_TAG in", values, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagNotIn(List<String> values) {
            addCriterion("PUBLIC_PRIVATE_TAG not in", values, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagBetween(String value1, String value2) {
            addCriterion("PUBLIC_PRIVATE_TAG between", value1, value2, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andPublicPrivateTagNotBetween(String value1, String value2) {
            addCriterion("PUBLIC_PRIVATE_TAG not between", value1, value2, "publicPrivateTag");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnIsNull() {
            addCriterion("SUPPORT_WITHHOLDING_YN is null");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnIsNotNull() {
            addCriterion("SUPPORT_WITHHOLDING_YN is not null");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnEqualTo(String value) {
            addCriterion("SUPPORT_WITHHOLDING_YN =", value, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnNotEqualTo(String value) {
            addCriterion("SUPPORT_WITHHOLDING_YN <>", value, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnGreaterThan(String value) {
            addCriterion("SUPPORT_WITHHOLDING_YN >", value, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPORT_WITHHOLDING_YN >=", value, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnLessThan(String value) {
            addCriterion("SUPPORT_WITHHOLDING_YN <", value, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnLessThanOrEqualTo(String value) {
            addCriterion("SUPPORT_WITHHOLDING_YN <=", value, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnLike(String value) {
            addCriterion("SUPPORT_WITHHOLDING_YN like", value, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnNotLike(String value) {
            addCriterion("SUPPORT_WITHHOLDING_YN not like", value, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnIn(List<String> values) {
            addCriterion("SUPPORT_WITHHOLDING_YN in", values, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnNotIn(List<String> values) {
            addCriterion("SUPPORT_WITHHOLDING_YN not in", values, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnBetween(String value1, String value2) {
            addCriterion("SUPPORT_WITHHOLDING_YN between", value1, value2, "supportWithholdingYn");
            return (Criteria) this;
        }

        public Criteria andSupportWithholdingYnNotBetween(String value1, String value2) {
            addCriterion("SUPPORT_WITHHOLDING_YN not between", value1, value2, "supportWithholdingYn");
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
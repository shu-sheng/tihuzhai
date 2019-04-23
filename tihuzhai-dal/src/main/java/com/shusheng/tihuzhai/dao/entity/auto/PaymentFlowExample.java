package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentFlowExample() {
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

        public Criteria andPaymentFlowIdIsNull() {
            addCriterion("payment_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdIsNotNull() {
            addCriterion("payment_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdEqualTo(String value) {
            addCriterion("payment_flow_id =", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdNotEqualTo(String value) {
            addCriterion("payment_flow_id <>", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdGreaterThan(String value) {
            addCriterion("payment_flow_id >", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_flow_id >=", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdLessThan(String value) {
            addCriterion("payment_flow_id <", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdLessThanOrEqualTo(String value) {
            addCriterion("payment_flow_id <=", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdLike(String value) {
            addCriterion("payment_flow_id like", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdNotLike(String value) {
            addCriterion("payment_flow_id not like", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdIn(List<String> values) {
            addCriterion("payment_flow_id in", values, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdNotIn(List<String> values) {
            addCriterion("payment_flow_id not in", values, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdBetween(String value1, String value2) {
            addCriterion("payment_flow_id between", value1, value2, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdNotBetween(String value1, String value2) {
            addCriterion("payment_flow_id not between", value1, value2, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNull() {
            addCriterion("payment_amount is null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIsNotNull() {
            addCriterion("payment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountEqualTo(Long value) {
            addCriterion("payment_amount =", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotEqualTo(Long value) {
            addCriterion("payment_amount <>", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThan(Long value) {
            addCriterion("payment_amount >", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("payment_amount >=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThan(Long value) {
            addCriterion("payment_amount <", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountLessThanOrEqualTo(Long value) {
            addCriterion("payment_amount <=", value, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountIn(List<Long> values) {
            addCriterion("payment_amount in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotIn(List<Long> values) {
            addCriterion("payment_amount not in", values, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountBetween(Long value1, Long value2) {
            addCriterion("payment_amount between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andPaymentAmountNotBetween(Long value1, Long value2) {
            addCriterion("payment_amount not between", value1, value2, "paymentAmount");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
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

        public Criteria andPaymentDateIsNull() {
            addCriterion("payment_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(Date value) {
            addCriterion("payment_date =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(Date value) {
            addCriterion("payment_date <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(Date value) {
            addCriterion("payment_date >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_date >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(Date value) {
            addCriterion("payment_date <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("payment_date <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<Date> values) {
            addCriterion("payment_date in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<Date> values) {
            addCriterion("payment_date not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(Date value1, Date value2) {
            addCriterion("payment_date between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("payment_date not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateIsNull() {
            addCriterion("payment_success_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateIsNotNull() {
            addCriterion("payment_success_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateEqualTo(Date value) {
            addCriterion("payment_success_date =", value, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateNotEqualTo(Date value) {
            addCriterion("payment_success_date <>", value, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateGreaterThan(Date value) {
            addCriterion("payment_success_date >", value, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_success_date >=", value, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateLessThan(Date value) {
            addCriterion("payment_success_date <", value, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateLessThanOrEqualTo(Date value) {
            addCriterion("payment_success_date <=", value, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateIn(List<Date> values) {
            addCriterion("payment_success_date in", values, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateNotIn(List<Date> values) {
            addCriterion("payment_success_date not in", values, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateBetween(Date value1, Date value2) {
            addCriterion("payment_success_date between", value1, value2, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentSuccessDateNotBetween(Date value1, Date value2) {
            addCriterion("payment_success_date not between", value1, value2, "paymentSuccessDate");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("payment_type like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("payment_type not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIsNull() {
            addCriterion("payment_mode is null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIsNotNull() {
            addCriterion("payment_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeEqualTo(String value) {
            addCriterion("payment_mode =", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotEqualTo(String value) {
            addCriterion("payment_mode <>", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThan(String value) {
            addCriterion("payment_mode >", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThanOrEqualTo(String value) {
            addCriterion("payment_mode >=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThan(String value) {
            addCriterion("payment_mode <", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThanOrEqualTo(String value) {
            addCriterion("payment_mode <=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLike(String value) {
            addCriterion("payment_mode like", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotLike(String value) {
            addCriterion("payment_mode not like", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIn(List<String> values) {
            addCriterion("payment_mode in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotIn(List<String> values) {
            addCriterion("payment_mode not in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBetween(String value1, String value2) {
            addCriterion("payment_mode between", value1, value2, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotBetween(String value1, String value2) {
            addCriterion("payment_mode not between", value1, value2, "paymentMode");
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

        public Criteria andOrderIdsIsNull() {
            addCriterion("order_ids is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdsIsNotNull() {
            addCriterion("order_ids is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdsEqualTo(String value) {
            addCriterion("order_ids =", value, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsNotEqualTo(String value) {
            addCriterion("order_ids <>", value, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsGreaterThan(String value) {
            addCriterion("order_ids >", value, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsGreaterThanOrEqualTo(String value) {
            addCriterion("order_ids >=", value, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsLessThan(String value) {
            addCriterion("order_ids <", value, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsLessThanOrEqualTo(String value) {
            addCriterion("order_ids <=", value, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsLike(String value) {
            addCriterion("order_ids like", value, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsNotLike(String value) {
            addCriterion("order_ids not like", value, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsIn(List<String> values) {
            addCriterion("order_ids in", values, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsNotIn(List<String> values) {
            addCriterion("order_ids not in", values, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsBetween(String value1, String value2) {
            addCriterion("order_ids between", value1, value2, "orderIds");
            return (Criteria) this;
        }

        public Criteria andOrderIdsNotBetween(String value1, String value2) {
            addCriterion("order_ids not between", value1, value2, "orderIds");
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

        public Criteria andRedPayIsNull() {
            addCriterion("red_pay is null");
            return (Criteria) this;
        }

        public Criteria andRedPayIsNotNull() {
            addCriterion("red_pay is not null");
            return (Criteria) this;
        }

        public Criteria andRedPayEqualTo(Long value) {
            addCriterion("red_pay =", value, "redPay");
            return (Criteria) this;
        }

        public Criteria andRedPayNotEqualTo(Long value) {
            addCriterion("red_pay <>", value, "redPay");
            return (Criteria) this;
        }

        public Criteria andRedPayGreaterThan(Long value) {
            addCriterion("red_pay >", value, "redPay");
            return (Criteria) this;
        }

        public Criteria andRedPayGreaterThanOrEqualTo(Long value) {
            addCriterion("red_pay >=", value, "redPay");
            return (Criteria) this;
        }

        public Criteria andRedPayLessThan(Long value) {
            addCriterion("red_pay <", value, "redPay");
            return (Criteria) this;
        }

        public Criteria andRedPayLessThanOrEqualTo(Long value) {
            addCriterion("red_pay <=", value, "redPay");
            return (Criteria) this;
        }

        public Criteria andRedPayIn(List<Long> values) {
            addCriterion("red_pay in", values, "redPay");
            return (Criteria) this;
        }

        public Criteria andRedPayNotIn(List<Long> values) {
            addCriterion("red_pay not in", values, "redPay");
            return (Criteria) this;
        }

        public Criteria andRedPayBetween(Long value1, Long value2) {
            addCriterion("red_pay between", value1, value2, "redPay");
            return (Criteria) this;
        }

        public Criteria andRedPayNotBetween(Long value1, Long value2) {
            addCriterion("red_pay not between", value1, value2, "redPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayIsNull() {
            addCriterion("integral_pay is null");
            return (Criteria) this;
        }

        public Criteria andIntegralPayIsNotNull() {
            addCriterion("integral_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralPayEqualTo(Long value) {
            addCriterion("integral_pay =", value, "integralPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayNotEqualTo(Long value) {
            addCriterion("integral_pay <>", value, "integralPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayGreaterThan(Long value) {
            addCriterion("integral_pay >", value, "integralPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayGreaterThanOrEqualTo(Long value) {
            addCriterion("integral_pay >=", value, "integralPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayLessThan(Long value) {
            addCriterion("integral_pay <", value, "integralPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayLessThanOrEqualTo(Long value) {
            addCriterion("integral_pay <=", value, "integralPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayIn(List<Long> values) {
            addCriterion("integral_pay in", values, "integralPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayNotIn(List<Long> values) {
            addCriterion("integral_pay not in", values, "integralPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayBetween(Long value1, Long value2) {
            addCriterion("integral_pay between", value1, value2, "integralPay");
            return (Criteria) this;
        }

        public Criteria andIntegralPayNotBetween(Long value1, Long value2) {
            addCriterion("integral_pay not between", value1, value2, "integralPay");
            return (Criteria) this;
        }

        public Criteria andTicketAmountIsNull() {
            addCriterion("ticket_amount is null");
            return (Criteria) this;
        }

        public Criteria andTicketAmountIsNotNull() {
            addCriterion("ticket_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTicketAmountEqualTo(Long value) {
            addCriterion("ticket_amount =", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountNotEqualTo(Long value) {
            addCriterion("ticket_amount <>", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountGreaterThan(Long value) {
            addCriterion("ticket_amount >", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("ticket_amount >=", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountLessThan(Long value) {
            addCriterion("ticket_amount <", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountLessThanOrEqualTo(Long value) {
            addCriterion("ticket_amount <=", value, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountIn(List<Long> values) {
            addCriterion("ticket_amount in", values, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountNotIn(List<Long> values) {
            addCriterion("ticket_amount not in", values, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountBetween(Long value1, Long value2) {
            addCriterion("ticket_amount between", value1, value2, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andTicketAmountNotBetween(Long value1, Long value2) {
            addCriterion("ticket_amount not between", value1, value2, "ticketAmount");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(String value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(String value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(String value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(String value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLike(String value) {
            addCriterion("refund_status like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotLike(String value) {
            addCriterion("refund_status not like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<String> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<String> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(String value1, String value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(String value1, String value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNull() {
            addCriterion("refund_amount is null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIsNotNull() {
            addCriterion("refund_amount is not null");
            return (Criteria) this;
        }

        public Criteria andRefundAmountEqualTo(Long value) {
            addCriterion("refund_amount =", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotEqualTo(Long value) {
            addCriterion("refund_amount <>", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThan(Long value) {
            addCriterion("refund_amount >", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("refund_amount >=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThan(Long value) {
            addCriterion("refund_amount <", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountLessThanOrEqualTo(Long value) {
            addCriterion("refund_amount <=", value, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountIn(List<Long> values) {
            addCriterion("refund_amount in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotIn(List<Long> values) {
            addCriterion("refund_amount not in", values, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountBetween(Long value1, Long value2) {
            addCriterion("refund_amount between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andRefundAmountNotBetween(Long value1, Long value2) {
            addCriterion("refund_amount not between", value1, value2, "refundAmount");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNull() {
            addCriterion("ticket_id is null");
            return (Criteria) this;
        }

        public Criteria andTicketIdIsNotNull() {
            addCriterion("ticket_id is not null");
            return (Criteria) this;
        }

        public Criteria andTicketIdEqualTo(Long value) {
            addCriterion("ticket_id =", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotEqualTo(Long value) {
            addCriterion("ticket_id <>", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThan(Long value) {
            addCriterion("ticket_id >", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ticket_id >=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThan(Long value) {
            addCriterion("ticket_id <", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdLessThanOrEqualTo(Long value) {
            addCriterion("ticket_id <=", value, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdIn(List<Long> values) {
            addCriterion("ticket_id in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotIn(List<Long> values) {
            addCriterion("ticket_id not in", values, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdBetween(Long value1, Long value2) {
            addCriterion("ticket_id between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTicketIdNotBetween(Long value1, Long value2) {
            addCriterion("ticket_id not between", value1, value2, "ticketId");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andExtOrderIsNull() {
            addCriterion("ext_order is null");
            return (Criteria) this;
        }

        public Criteria andExtOrderIsNotNull() {
            addCriterion("ext_order is not null");
            return (Criteria) this;
        }

        public Criteria andExtOrderEqualTo(String value) {
            addCriterion("ext_order =", value, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderNotEqualTo(String value) {
            addCriterion("ext_order <>", value, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderGreaterThan(String value) {
            addCriterion("ext_order >", value, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderGreaterThanOrEqualTo(String value) {
            addCriterion("ext_order >=", value, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderLessThan(String value) {
            addCriterion("ext_order <", value, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderLessThanOrEqualTo(String value) {
            addCriterion("ext_order <=", value, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderLike(String value) {
            addCriterion("ext_order like", value, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderNotLike(String value) {
            addCriterion("ext_order not like", value, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderIn(List<String> values) {
            addCriterion("ext_order in", values, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderNotIn(List<String> values) {
            addCriterion("ext_order not in", values, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderBetween(String value1, String value2) {
            addCriterion("ext_order between", value1, value2, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrderNotBetween(String value1, String value2) {
            addCriterion("ext_order not between", value1, value2, "extOrder");
            return (Criteria) this;
        }

        public Criteria andExtOrder1IsNull() {
            addCriterion("ext_order1 is null");
            return (Criteria) this;
        }

        public Criteria andExtOrder1IsNotNull() {
            addCriterion("ext_order1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtOrder1EqualTo(String value) {
            addCriterion("ext_order1 =", value, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1NotEqualTo(String value) {
            addCriterion("ext_order1 <>", value, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1GreaterThan(String value) {
            addCriterion("ext_order1 >", value, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1GreaterThanOrEqualTo(String value) {
            addCriterion("ext_order1 >=", value, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1LessThan(String value) {
            addCriterion("ext_order1 <", value, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1LessThanOrEqualTo(String value) {
            addCriterion("ext_order1 <=", value, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1Like(String value) {
            addCriterion("ext_order1 like", value, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1NotLike(String value) {
            addCriterion("ext_order1 not like", value, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1In(List<String> values) {
            addCriterion("ext_order1 in", values, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1NotIn(List<String> values) {
            addCriterion("ext_order1 not in", values, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1Between(String value1, String value2) {
            addCriterion("ext_order1 between", value1, value2, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andExtOrder1NotBetween(String value1, String value2) {
            addCriterion("ext_order1 not between", value1, value2, "extOrder1");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNull() {
            addCriterion("settle_amount is null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIsNotNull() {
            addCriterion("settle_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSettleAmountEqualTo(Long value) {
            addCriterion("settle_amount =", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotEqualTo(Long value) {
            addCriterion("settle_amount <>", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThan(Long value) {
            addCriterion("settle_amount >", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("settle_amount >=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThan(Long value) {
            addCriterion("settle_amount <", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountLessThanOrEqualTo(Long value) {
            addCriterion("settle_amount <=", value, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountIn(List<Long> values) {
            addCriterion("settle_amount in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotIn(List<Long> values) {
            addCriterion("settle_amount not in", values, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountBetween(Long value1, Long value2) {
            addCriterion("settle_amount between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleAmountNotBetween(Long value1, Long value2) {
            addCriterion("settle_amount not between", value1, value2, "settleAmount");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNull() {
            addCriterion("settle_status is null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIsNotNull() {
            addCriterion("settle_status is not null");
            return (Criteria) this;
        }

        public Criteria andSettleStatusEqualTo(String value) {
            addCriterion("settle_status =", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotEqualTo(String value) {
            addCriterion("settle_status <>", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThan(String value) {
            addCriterion("settle_status >", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("settle_status >=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThan(String value) {
            addCriterion("settle_status <", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLessThanOrEqualTo(String value) {
            addCriterion("settle_status <=", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusLike(String value) {
            addCriterion("settle_status like", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotLike(String value) {
            addCriterion("settle_status not like", value, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusIn(List<String> values) {
            addCriterion("settle_status in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotIn(List<String> values) {
            addCriterion("settle_status not in", values, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusBetween(String value1, String value2) {
            addCriterion("settle_status between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andSettleStatusNotBetween(String value1, String value2) {
            addCriterion("settle_status not between", value1, value2, "settleStatus");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("card_type like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("card_type not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeIsNull() {
            addCriterion("personal_corporate_type is null");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeIsNotNull() {
            addCriterion("personal_corporate_type is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeEqualTo(String value) {
            addCriterion("personal_corporate_type =", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeNotEqualTo(String value) {
            addCriterion("personal_corporate_type <>", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeGreaterThan(String value) {
            addCriterion("personal_corporate_type >", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("personal_corporate_type >=", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeLessThan(String value) {
            addCriterion("personal_corporate_type <", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeLessThanOrEqualTo(String value) {
            addCriterion("personal_corporate_type <=", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeLike(String value) {
            addCriterion("personal_corporate_type like", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeNotLike(String value) {
            addCriterion("personal_corporate_type not like", value, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeIn(List<String> values) {
            addCriterion("personal_corporate_type in", values, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeNotIn(List<String> values) {
            addCriterion("personal_corporate_type not in", values, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeBetween(String value1, String value2) {
            addCriterion("personal_corporate_type between", value1, value2, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andPersonalCorporateTypeNotBetween(String value1, String value2) {
            addCriterion("personal_corporate_type not between", value1, value2, "personalCorporateType");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountIsNull() {
            addCriterion("merchant_charge_amount is null");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountIsNotNull() {
            addCriterion("merchant_charge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountEqualTo(Long value) {
            addCriterion("merchant_charge_amount =", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountNotEqualTo(Long value) {
            addCriterion("merchant_charge_amount <>", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountGreaterThan(Long value) {
            addCriterion("merchant_charge_amount >", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("merchant_charge_amount >=", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountLessThan(Long value) {
            addCriterion("merchant_charge_amount <", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("merchant_charge_amount <=", value, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountIn(List<Long> values) {
            addCriterion("merchant_charge_amount in", values, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountNotIn(List<Long> values) {
            addCriterion("merchant_charge_amount not in", values, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountBetween(Long value1, Long value2) {
            addCriterion("merchant_charge_amount between", value1, value2, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andMerchantChargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("merchant_charge_amount not between", value1, value2, "merchantChargeAmount");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInIsNull() {
            addCriterion("trade_amount_in is null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInIsNotNull() {
            addCriterion("trade_amount_in is not null");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInEqualTo(Long value) {
            addCriterion("trade_amount_in =", value, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInNotEqualTo(Long value) {
            addCriterion("trade_amount_in <>", value, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInGreaterThan(Long value) {
            addCriterion("trade_amount_in >", value, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInGreaterThanOrEqualTo(Long value) {
            addCriterion("trade_amount_in >=", value, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInLessThan(Long value) {
            addCriterion("trade_amount_in <", value, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInLessThanOrEqualTo(Long value) {
            addCriterion("trade_amount_in <=", value, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInIn(List<Long> values) {
            addCriterion("trade_amount_in in", values, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInNotIn(List<Long> values) {
            addCriterion("trade_amount_in not in", values, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInBetween(Long value1, Long value2) {
            addCriterion("trade_amount_in between", value1, value2, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andTradeAmountInNotBetween(Long value1, Long value2) {
            addCriterion("trade_amount_in not between", value1, value2, "tradeAmountIn");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableIsNull() {
            addCriterion("account_receivable is null");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableIsNotNull() {
            addCriterion("account_receivable is not null");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableEqualTo(Long value) {
            addCriterion("account_receivable =", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableNotEqualTo(Long value) {
            addCriterion("account_receivable <>", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableGreaterThan(Long value) {
            addCriterion("account_receivable >", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableGreaterThanOrEqualTo(Long value) {
            addCriterion("account_receivable >=", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableLessThan(Long value) {
            addCriterion("account_receivable <", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableLessThanOrEqualTo(Long value) {
            addCriterion("account_receivable <=", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableIn(List<Long> values) {
            addCriterion("account_receivable in", values, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableNotIn(List<Long> values) {
            addCriterion("account_receivable not in", values, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableBetween(Long value1, Long value2) {
            addCriterion("account_receivable between", value1, value2, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableNotBetween(Long value1, Long value2) {
            addCriterion("account_receivable not between", value1, value2, "accountReceivable");
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
package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToCardFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ToCardFlowExample() {
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

        public Criteria andFlowIdIsNull() {
            addCriterion("flow_id is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(Long value) {
            addCriterion("flow_id =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(Long value) {
            addCriterion("flow_id <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(Long value) {
            addCriterion("flow_id >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("flow_id >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(Long value) {
            addCriterion("flow_id <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(Long value) {
            addCriterion("flow_id <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<Long> values) {
            addCriterion("flow_id in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<Long> values) {
            addCriterion("flow_id not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(Long value1, Long value2) {
            addCriterion("flow_id between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(Long value1, Long value2) {
            addCriterion("flow_id not between", value1, value2, "flowId");
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

        public Criteria andYjfAccountIdIsNull() {
            addCriterion("yjf_account_id is null");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdIsNotNull() {
            addCriterion("yjf_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdEqualTo(String value) {
            addCriterion("yjf_account_id =", value, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdNotEqualTo(String value) {
            addCriterion("yjf_account_id <>", value, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdGreaterThan(String value) {
            addCriterion("yjf_account_id >", value, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("yjf_account_id >=", value, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdLessThan(String value) {
            addCriterion("yjf_account_id <", value, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdLessThanOrEqualTo(String value) {
            addCriterion("yjf_account_id <=", value, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdLike(String value) {
            addCriterion("yjf_account_id like", value, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdNotLike(String value) {
            addCriterion("yjf_account_id not like", value, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdIn(List<String> values) {
            addCriterion("yjf_account_id in", values, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdNotIn(List<String> values) {
            addCriterion("yjf_account_id not in", values, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdBetween(String value1, String value2) {
            addCriterion("yjf_account_id between", value1, value2, "yjfAccountId");
            return (Criteria) this;
        }

        public Criteria andYjfAccountIdNotBetween(String value1, String value2) {
            addCriterion("yjf_account_id not between", value1, value2, "yjfAccountId");
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

        public Criteria andUserRealNameIsNull() {
            addCriterion("user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNotNull() {
            addCriterion("user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameEqualTo(String value) {
            addCriterion("user_real_name =", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotEqualTo(String value) {
            addCriterion("user_real_name <>", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThan(String value) {
            addCriterion("user_real_name >", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_name >=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThan(String value) {
            addCriterion("user_real_name <", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("user_real_name <=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLike(String value) {
            addCriterion("user_real_name like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotLike(String value) {
            addCriterion("user_real_name not like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIn(List<String> values) {
            addCriterion("user_real_name in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotIn(List<String> values) {
            addCriterion("user_real_name not in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameBetween(String value1, String value2) {
            addCriterion("user_real_name between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotBetween(String value1, String value2) {
            addCriterion("user_real_name not between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIsNull() {
            addCriterion("out_user_id is null");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIsNotNull() {
            addCriterion("out_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutUserIdEqualTo(Long value) {
            addCriterion("out_user_id =", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotEqualTo(Long value) {
            addCriterion("out_user_id <>", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdGreaterThan(Long value) {
            addCriterion("out_user_id >", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("out_user_id >=", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdLessThan(Long value) {
            addCriterion("out_user_id <", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdLessThanOrEqualTo(Long value) {
            addCriterion("out_user_id <=", value, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdIn(List<Long> values) {
            addCriterion("out_user_id in", values, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotIn(List<Long> values) {
            addCriterion("out_user_id not in", values, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdBetween(Long value1, Long value2) {
            addCriterion("out_user_id between", value1, value2, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutUserIdNotBetween(Long value1, Long value2) {
            addCriterion("out_user_id not between", value1, value2, "outUserId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdIsNull() {
            addCriterion("out_yjf_account_id is null");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdIsNotNull() {
            addCriterion("out_yjf_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdEqualTo(String value) {
            addCriterion("out_yjf_account_id =", value, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdNotEqualTo(String value) {
            addCriterion("out_yjf_account_id <>", value, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdGreaterThan(String value) {
            addCriterion("out_yjf_account_id >", value, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("out_yjf_account_id >=", value, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdLessThan(String value) {
            addCriterion("out_yjf_account_id <", value, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdLessThanOrEqualTo(String value) {
            addCriterion("out_yjf_account_id <=", value, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdLike(String value) {
            addCriterion("out_yjf_account_id like", value, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdNotLike(String value) {
            addCriterion("out_yjf_account_id not like", value, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdIn(List<String> values) {
            addCriterion("out_yjf_account_id in", values, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdNotIn(List<String> values) {
            addCriterion("out_yjf_account_id not in", values, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdBetween(String value1, String value2) {
            addCriterion("out_yjf_account_id between", value1, value2, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutYjfAccountIdNotBetween(String value1, String value2) {
            addCriterion("out_yjf_account_id not between", value1, value2, "outYjfAccountId");
            return (Criteria) this;
        }

        public Criteria andOutUserNameIsNull() {
            addCriterion("out_user_name is null");
            return (Criteria) this;
        }

        public Criteria andOutUserNameIsNotNull() {
            addCriterion("out_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutUserNameEqualTo(String value) {
            addCriterion("out_user_name =", value, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameNotEqualTo(String value) {
            addCriterion("out_user_name <>", value, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameGreaterThan(String value) {
            addCriterion("out_user_name >", value, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("out_user_name >=", value, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameLessThan(String value) {
            addCriterion("out_user_name <", value, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameLessThanOrEqualTo(String value) {
            addCriterion("out_user_name <=", value, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameLike(String value) {
            addCriterion("out_user_name like", value, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameNotLike(String value) {
            addCriterion("out_user_name not like", value, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameIn(List<String> values) {
            addCriterion("out_user_name in", values, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameNotIn(List<String> values) {
            addCriterion("out_user_name not in", values, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameBetween(String value1, String value2) {
            addCriterion("out_user_name between", value1, value2, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserNameNotBetween(String value1, String value2) {
            addCriterion("out_user_name not between", value1, value2, "outUserName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameIsNull() {
            addCriterion("out_user_real_name is null");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameIsNotNull() {
            addCriterion("out_user_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameEqualTo(String value) {
            addCriterion("out_user_real_name =", value, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameNotEqualTo(String value) {
            addCriterion("out_user_real_name <>", value, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameGreaterThan(String value) {
            addCriterion("out_user_real_name >", value, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("out_user_real_name >=", value, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameLessThan(String value) {
            addCriterion("out_user_real_name <", value, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("out_user_real_name <=", value, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameLike(String value) {
            addCriterion("out_user_real_name like", value, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameNotLike(String value) {
            addCriterion("out_user_real_name not like", value, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameIn(List<String> values) {
            addCriterion("out_user_real_name in", values, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameNotIn(List<String> values) {
            addCriterion("out_user_real_name not in", values, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameBetween(String value1, String value2) {
            addCriterion("out_user_real_name between", value1, value2, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutUserRealNameNotBetween(String value1, String value2) {
            addCriterion("out_user_real_name not between", value1, value2, "outUserRealName");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIsNull() {
            addCriterion("out_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIsNotNull() {
            addCriterion("out_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoEqualTo(String value) {
            addCriterion("out_biz_no =", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotEqualTo(String value) {
            addCriterion("out_biz_no <>", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThan(String value) {
            addCriterion("out_biz_no >", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_biz_no >=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThan(String value) {
            addCriterion("out_biz_no <", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThanOrEqualTo(String value) {
            addCriterion("out_biz_no <=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLike(String value) {
            addCriterion("out_biz_no like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotLike(String value) {
            addCriterion("out_biz_no not like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIn(List<String> values) {
            addCriterion("out_biz_no in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotIn(List<String> values) {
            addCriterion("out_biz_no not in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoBetween(String value1, String value2) {
            addCriterion("out_biz_no between", value1, value2, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotBetween(String value1, String value2) {
            addCriterion("out_biz_no not between", value1, value2, "outBizNo");
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

        public Criteria andBankAccountNoIsNull() {
            addCriterion("bank_account_no is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIsNotNull() {
            addCriterion("bank_account_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoEqualTo(String value) {
            addCriterion("bank_account_no =", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotEqualTo(String value) {
            addCriterion("bank_account_no <>", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThan(String value) {
            addCriterion("bank_account_no >", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account_no >=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThan(String value) {
            addCriterion("bank_account_no <", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLessThanOrEqualTo(String value) {
            addCriterion("bank_account_no <=", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoLike(String value) {
            addCriterion("bank_account_no like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotLike(String value) {
            addCriterion("bank_account_no not like", value, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoIn(List<String> values) {
            addCriterion("bank_account_no in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotIn(List<String> values) {
            addCriterion("bank_account_no not in", values, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoBetween(String value1, String value2) {
            addCriterion("bank_account_no between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAccountNoNotBetween(String value1, String value2) {
            addCriterion("bank_account_no not between", value1, value2, "bankAccountNo");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameIsNull() {
            addCriterion("bank_acount_name is null");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameIsNotNull() {
            addCriterion("bank_acount_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameEqualTo(String value) {
            addCriterion("bank_acount_name =", value, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameNotEqualTo(String value) {
            addCriterion("bank_acount_name <>", value, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameGreaterThan(String value) {
            addCriterion("bank_acount_name >", value, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_acount_name >=", value, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameLessThan(String value) {
            addCriterion("bank_acount_name <", value, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameLessThanOrEqualTo(String value) {
            addCriterion("bank_acount_name <=", value, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameLike(String value) {
            addCriterion("bank_acount_name like", value, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameNotLike(String value) {
            addCriterion("bank_acount_name not like", value, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameIn(List<String> values) {
            addCriterion("bank_acount_name in", values, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameNotIn(List<String> values) {
            addCriterion("bank_acount_name not in", values, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameBetween(String value1, String value2) {
            addCriterion("bank_acount_name between", value1, value2, "bankAcountName");
            return (Criteria) this;
        }

        public Criteria andBankAcountNameNotBetween(String value1, String value2) {
            addCriterion("bank_acount_name not between", value1, value2, "bankAcountName");
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

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(Long value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(Long value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(Long value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(Long value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(Long value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<Long> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<Long> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(Long value1, Long value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(Long value1, Long value2) {
            addCriterion("amount not between", value1, value2, "amount");
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

        public Criteria andPayTypeIsNull() {
            addCriterion("pay_type is null");
            return (Criteria) this;
        }

        public Criteria andPayTypeIsNotNull() {
            addCriterion("pay_type is not null");
            return (Criteria) this;
        }

        public Criteria andPayTypeEqualTo(String value) {
            addCriterion("pay_type =", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotEqualTo(String value) {
            addCriterion("pay_type <>", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThan(String value) {
            addCriterion("pay_type >", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_type >=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThan(String value) {
            addCriterion("pay_type <", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLessThanOrEqualTo(String value) {
            addCriterion("pay_type <=", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeLike(String value) {
            addCriterion("pay_type like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotLike(String value) {
            addCriterion("pay_type not like", value, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeIn(List<String> values) {
            addCriterion("pay_type in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotIn(List<String> values) {
            addCriterion("pay_type not in", values, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeBetween(String value1, String value2) {
            addCriterion("pay_type between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andPayTypeNotBetween(String value1, String value2) {
            addCriterion("pay_type not between", value1, value2, "payType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeIsNull() {
            addCriterion("in_out_type is null");
            return (Criteria) this;
        }

        public Criteria andInOutTypeIsNotNull() {
            addCriterion("in_out_type is not null");
            return (Criteria) this;
        }

        public Criteria andInOutTypeEqualTo(String value) {
            addCriterion("in_out_type =", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeNotEqualTo(String value) {
            addCriterion("in_out_type <>", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeGreaterThan(String value) {
            addCriterion("in_out_type >", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeGreaterThanOrEqualTo(String value) {
            addCriterion("in_out_type >=", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeLessThan(String value) {
            addCriterion("in_out_type <", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeLessThanOrEqualTo(String value) {
            addCriterion("in_out_type <=", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeLike(String value) {
            addCriterion("in_out_type like", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeNotLike(String value) {
            addCriterion("in_out_type not like", value, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeIn(List<String> values) {
            addCriterion("in_out_type in", values, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeNotIn(List<String> values) {
            addCriterion("in_out_type not in", values, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeBetween(String value1, String value2) {
            addCriterion("in_out_type between", value1, value2, "inOutType");
            return (Criteria) this;
        }

        public Criteria andInOutTypeNotBetween(String value1, String value2) {
            addCriterion("in_out_type not between", value1, value2, "inOutType");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
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

        public Criteria andToCardTimeIsNull() {
            addCriterion("to_card_time is null");
            return (Criteria) this;
        }

        public Criteria andToCardTimeIsNotNull() {
            addCriterion("to_card_time is not null");
            return (Criteria) this;
        }

        public Criteria andToCardTimeEqualTo(Date value) {
            addCriterion("to_card_time =", value, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andToCardTimeNotEqualTo(Date value) {
            addCriterion("to_card_time <>", value, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andToCardTimeGreaterThan(Date value) {
            addCriterion("to_card_time >", value, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andToCardTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("to_card_time >=", value, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andToCardTimeLessThan(Date value) {
            addCriterion("to_card_time <", value, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andToCardTimeLessThanOrEqualTo(Date value) {
            addCriterion("to_card_time <=", value, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andToCardTimeIn(List<Date> values) {
            addCriterion("to_card_time in", values, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andToCardTimeNotIn(List<Date> values) {
            addCriterion("to_card_time not in", values, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andToCardTimeBetween(Date value1, Date value2) {
            addCriterion("to_card_time between", value1, value2, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andToCardTimeNotBetween(Date value1, Date value2) {
            addCriterion("to_card_time not between", value1, value2, "toCardTime");
            return (Criteria) this;
        }

        public Criteria andRem1IsNull() {
            addCriterion("rem1 is null");
            return (Criteria) this;
        }

        public Criteria andRem1IsNotNull() {
            addCriterion("rem1 is not null");
            return (Criteria) this;
        }

        public Criteria andRem1EqualTo(String value) {
            addCriterion("rem1 =", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1NotEqualTo(String value) {
            addCriterion("rem1 <>", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1GreaterThan(String value) {
            addCriterion("rem1 >", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1GreaterThanOrEqualTo(String value) {
            addCriterion("rem1 >=", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1LessThan(String value) {
            addCriterion("rem1 <", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1LessThanOrEqualTo(String value) {
            addCriterion("rem1 <=", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1Like(String value) {
            addCriterion("rem1 like", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1NotLike(String value) {
            addCriterion("rem1 not like", value, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1In(List<String> values) {
            addCriterion("rem1 in", values, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1NotIn(List<String> values) {
            addCriterion("rem1 not in", values, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1Between(String value1, String value2) {
            addCriterion("rem1 between", value1, value2, "rem1");
            return (Criteria) this;
        }

        public Criteria andRem1NotBetween(String value1, String value2) {
            addCriterion("rem1 not between", value1, value2, "rem1");
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
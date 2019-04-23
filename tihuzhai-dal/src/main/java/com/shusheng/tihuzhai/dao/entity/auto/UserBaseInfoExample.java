package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserBaseInfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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

        public Criteria andLogPasswordIsNull() {
            addCriterion("log_password is null");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIsNotNull() {
            addCriterion("log_password is not null");
            return (Criteria) this;
        }

        public Criteria andLogPasswordEqualTo(String value) {
            addCriterion("log_password =", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotEqualTo(String value) {
            addCriterion("log_password <>", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordGreaterThan(String value) {
            addCriterion("log_password >", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("log_password >=", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLessThan(String value) {
            addCriterion("log_password <", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLessThanOrEqualTo(String value) {
            addCriterion("log_password <=", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordLike(String value) {
            addCriterion("log_password like", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotLike(String value) {
            addCriterion("log_password not like", value, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordIn(List<String> values) {
            addCriterion("log_password in", values, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotIn(List<String> values) {
            addCriterion("log_password not in", values, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordBetween(String value1, String value2) {
            addCriterion("log_password between", value1, value2, "logPassword");
            return (Criteria) this;
        }

        public Criteria andLogPasswordNotBetween(String value1, String value2) {
            addCriterion("log_password not between", value1, value2, "logPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("pay_password is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("pay_password is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("pay_password =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("pay_password <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("pay_password >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pay_password >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("pay_password <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("pay_password <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("pay_password like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("pay_password not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("pay_password in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("pay_password not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("pay_password between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("pay_password not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(String value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(String value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(String value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(String value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(String value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(String value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLike(String value) {
            addCriterion("account_id like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotLike(String value) {
            addCriterion("account_id not like", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<String> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<String> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(String value1, String value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(String value1, String value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
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

        public Criteria andMobileBindingIsNull() {
            addCriterion("mobile_binding is null");
            return (Criteria) this;
        }

        public Criteria andMobileBindingIsNotNull() {
            addCriterion("mobile_binding is not null");
            return (Criteria) this;
        }

        public Criteria andMobileBindingEqualTo(String value) {
            addCriterion("mobile_binding =", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingNotEqualTo(String value) {
            addCriterion("mobile_binding <>", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingGreaterThan(String value) {
            addCriterion("mobile_binding >", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_binding >=", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingLessThan(String value) {
            addCriterion("mobile_binding <", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingLessThanOrEqualTo(String value) {
            addCriterion("mobile_binding <=", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingLike(String value) {
            addCriterion("mobile_binding like", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingNotLike(String value) {
            addCriterion("mobile_binding not like", value, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingIn(List<String> values) {
            addCriterion("mobile_binding in", values, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingNotIn(List<String> values) {
            addCriterion("mobile_binding not in", values, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingBetween(String value1, String value2) {
            addCriterion("mobile_binding between", value1, value2, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMobileBindingNotBetween(String value1, String value2) {
            addCriterion("mobile_binding not between", value1, value2, "mobileBinding");
            return (Criteria) this;
        }

        public Criteria andMailIsNull() {
            addCriterion("mail is null");
            return (Criteria) this;
        }

        public Criteria andMailIsNotNull() {
            addCriterion("mail is not null");
            return (Criteria) this;
        }

        public Criteria andMailEqualTo(String value) {
            addCriterion("mail =", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotEqualTo(String value) {
            addCriterion("mail <>", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThan(String value) {
            addCriterion("mail >", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailGreaterThanOrEqualTo(String value) {
            addCriterion("mail >=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThan(String value) {
            addCriterion("mail <", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLessThanOrEqualTo(String value) {
            addCriterion("mail <=", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailLike(String value) {
            addCriterion("mail like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotLike(String value) {
            addCriterion("mail not like", value, "mail");
            return (Criteria) this;
        }

        public Criteria andMailIn(List<String> values) {
            addCriterion("mail in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotIn(List<String> values) {
            addCriterion("mail not in", values, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBetween(String value1, String value2) {
            addCriterion("mail between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailNotBetween(String value1, String value2) {
            addCriterion("mail not between", value1, value2, "mail");
            return (Criteria) this;
        }

        public Criteria andMailBindingIsNull() {
            addCriterion("mail_binding is null");
            return (Criteria) this;
        }

        public Criteria andMailBindingIsNotNull() {
            addCriterion("mail_binding is not null");
            return (Criteria) this;
        }

        public Criteria andMailBindingEqualTo(String value) {
            addCriterion("mail_binding =", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingNotEqualTo(String value) {
            addCriterion("mail_binding <>", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingGreaterThan(String value) {
            addCriterion("mail_binding >", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingGreaterThanOrEqualTo(String value) {
            addCriterion("mail_binding >=", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingLessThan(String value) {
            addCriterion("mail_binding <", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingLessThanOrEqualTo(String value) {
            addCriterion("mail_binding <=", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingLike(String value) {
            addCriterion("mail_binding like", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingNotLike(String value) {
            addCriterion("mail_binding not like", value, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingIn(List<String> values) {
            addCriterion("mail_binding in", values, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingNotIn(List<String> values) {
            addCriterion("mail_binding not in", values, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingBetween(String value1, String value2) {
            addCriterion("mail_binding between", value1, value2, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andMailBindingNotBetween(String value1, String value2) {
            addCriterion("mail_binding not between", value1, value2, "mailBinding");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
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

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIsNull() {
            addCriterion("row_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIsNotNull() {
            addCriterion("row_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeEqualTo(Date value) {
            addCriterion("row_add_time =", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotEqualTo(Date value) {
            addCriterion("row_add_time <>", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeGreaterThan(Date value) {
            addCriterion("row_add_time >", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("row_add_time >=", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeLessThan(Date value) {
            addCriterion("row_add_time <", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("row_add_time <=", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIn(List<Date> values) {
            addCriterion("row_add_time in", values, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotIn(List<Date> values) {
            addCriterion("row_add_time not in", values, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeBetween(Date value1, Date value2) {
            addCriterion("row_add_time between", value1, value2, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("row_add_time not between", value1, value2, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIsNull() {
            addCriterion("row_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIsNotNull() {
            addCriterion("row_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeEqualTo(Date value) {
            addCriterion("row_update_time =", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotEqualTo(Date value) {
            addCriterion("row_update_time <>", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeGreaterThan(Date value) {
            addCriterion("row_update_time >", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("row_update_time >=", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeLessThan(Date value) {
            addCriterion("row_update_time <", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("row_update_time <=", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIn(List<Date> values) {
            addCriterion("row_update_time in", values, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotIn(List<Date> values) {
            addCriterion("row_update_time not in", values, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("row_update_time between", value1, value2, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("row_update_time not between", value1, value2, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andIdentityNameIsNull() {
            addCriterion("identity_name is null");
            return (Criteria) this;
        }

        public Criteria andIdentityNameIsNotNull() {
            addCriterion("identity_name is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityNameEqualTo(String value) {
            addCriterion("identity_name =", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotEqualTo(String value) {
            addCriterion("identity_name <>", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameGreaterThan(String value) {
            addCriterion("identity_name >", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameGreaterThanOrEqualTo(String value) {
            addCriterion("identity_name >=", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameLessThan(String value) {
            addCriterion("identity_name <", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameLessThanOrEqualTo(String value) {
            addCriterion("identity_name <=", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameLike(String value) {
            addCriterion("identity_name like", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotLike(String value) {
            addCriterion("identity_name not like", value, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameIn(List<String> values) {
            addCriterion("identity_name in", values, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotIn(List<String> values) {
            addCriterion("identity_name not in", values, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameBetween(String value1, String value2) {
            addCriterion("identity_name between", value1, value2, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityNameNotBetween(String value1, String value2) {
            addCriterion("identity_name not between", value1, value2, "identityName");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoIsNull() {
            addCriterion("identity_start_no is null");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoIsNotNull() {
            addCriterion("identity_start_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoEqualTo(String value) {
            addCriterion("identity_start_no =", value, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoNotEqualTo(String value) {
            addCriterion("identity_start_no <>", value, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoGreaterThan(String value) {
            addCriterion("identity_start_no >", value, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoGreaterThanOrEqualTo(String value) {
            addCriterion("identity_start_no >=", value, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoLessThan(String value) {
            addCriterion("identity_start_no <", value, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoLessThanOrEqualTo(String value) {
            addCriterion("identity_start_no <=", value, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoLike(String value) {
            addCriterion("identity_start_no like", value, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoNotLike(String value) {
            addCriterion("identity_start_no not like", value, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoIn(List<String> values) {
            addCriterion("identity_start_no in", values, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoNotIn(List<String> values) {
            addCriterion("identity_start_no not in", values, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoBetween(String value1, String value2) {
            addCriterion("identity_start_no between", value1, value2, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityStartNoNotBetween(String value1, String value2) {
            addCriterion("identity_start_no not between", value1, value2, "identityStartNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoIsNull() {
            addCriterion("identity_end_no is null");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoIsNotNull() {
            addCriterion("identity_end_no is not null");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoEqualTo(String value) {
            addCriterion("identity_end_no =", value, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoNotEqualTo(String value) {
            addCriterion("identity_end_no <>", value, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoGreaterThan(String value) {
            addCriterion("identity_end_no >", value, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoGreaterThanOrEqualTo(String value) {
            addCriterion("identity_end_no >=", value, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoLessThan(String value) {
            addCriterion("identity_end_no <", value, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoLessThanOrEqualTo(String value) {
            addCriterion("identity_end_no <=", value, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoLike(String value) {
            addCriterion("identity_end_no like", value, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoNotLike(String value) {
            addCriterion("identity_end_no not like", value, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoIn(List<String> values) {
            addCriterion("identity_end_no in", values, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoNotIn(List<String> values) {
            addCriterion("identity_end_no not in", values, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoBetween(String value1, String value2) {
            addCriterion("identity_end_no between", value1, value2, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andIdentityEndNoNotBetween(String value1, String value2) {
            addCriterion("identity_end_no not between", value1, value2, "identityEndNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoIsNull() {
            addCriterion("ex_identity_no is null");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoIsNotNull() {
            addCriterion("ex_identity_no is not null");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoEqualTo(String value) {
            addCriterion("ex_identity_no =", value, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoNotEqualTo(String value) {
            addCriterion("ex_identity_no <>", value, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoGreaterThan(String value) {
            addCriterion("ex_identity_no >", value, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoGreaterThanOrEqualTo(String value) {
            addCriterion("ex_identity_no >=", value, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoLessThan(String value) {
            addCriterion("ex_identity_no <", value, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoLessThanOrEqualTo(String value) {
            addCriterion("ex_identity_no <=", value, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoLike(String value) {
            addCriterion("ex_identity_no like", value, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoNotLike(String value) {
            addCriterion("ex_identity_no not like", value, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoIn(List<String> values) {
            addCriterion("ex_identity_no in", values, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoNotIn(List<String> values) {
            addCriterion("ex_identity_no not in", values, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoBetween(String value1, String value2) {
            addCriterion("ex_identity_no between", value1, value2, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andExIdentityNoNotBetween(String value1, String value2) {
            addCriterion("ex_identity_no not between", value1, value2, "exIdentityNo");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationIsNull() {
            addCriterion("real_name_authentication is null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationIsNotNull() {
            addCriterion("real_name_authentication is not null");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationEqualTo(String value) {
            addCriterion("real_name_authentication =", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationNotEqualTo(String value) {
            addCriterion("real_name_authentication <>", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationGreaterThan(String value) {
            addCriterion("real_name_authentication >", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationGreaterThanOrEqualTo(String value) {
            addCriterion("real_name_authentication >=", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationLessThan(String value) {
            addCriterion("real_name_authentication <", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationLessThanOrEqualTo(String value) {
            addCriterion("real_name_authentication <=", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationLike(String value) {
            addCriterion("real_name_authentication like", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationNotLike(String value) {
            addCriterion("real_name_authentication not like", value, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationIn(List<String> values) {
            addCriterion("real_name_authentication in", values, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationNotIn(List<String> values) {
            addCriterion("real_name_authentication not in", values, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationBetween(String value1, String value2) {
            addCriterion("real_name_authentication between", value1, value2, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andRealNameAuthenticationNotBetween(String value1, String value2) {
            addCriterion("real_name_authentication not between", value1, value2, "realNameAuthentication");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountIsNull() {
            addCriterion("pwd_error_count is null");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountIsNotNull() {
            addCriterion("pwd_error_count is not null");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountEqualTo(Integer value) {
            addCriterion("pwd_error_count =", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountNotEqualTo(Integer value) {
            addCriterion("pwd_error_count <>", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountGreaterThan(Integer value) {
            addCriterion("pwd_error_count >", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pwd_error_count >=", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountLessThan(Integer value) {
            addCriterion("pwd_error_count <", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountLessThanOrEqualTo(Integer value) {
            addCriterion("pwd_error_count <=", value, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountIn(List<Integer> values) {
            addCriterion("pwd_error_count in", values, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountNotIn(List<Integer> values) {
            addCriterion("pwd_error_count not in", values, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountBetween(Integer value1, Integer value2) {
            addCriterion("pwd_error_count between", value1, value2, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andPwdErrorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("pwd_error_count not between", value1, value2, "pwdErrorCount");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeIsNull() {
            addCriterion("change_lock_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeIsNotNull() {
            addCriterion("change_lock_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeEqualTo(Date value) {
            addCriterion("change_lock_time =", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeNotEqualTo(Date value) {
            addCriterion("change_lock_time <>", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeGreaterThan(Date value) {
            addCriterion("change_lock_time >", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("change_lock_time >=", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeLessThan(Date value) {
            addCriterion("change_lock_time <", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeLessThanOrEqualTo(Date value) {
            addCriterion("change_lock_time <=", value, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeIn(List<Date> values) {
            addCriterion("change_lock_time in", values, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeNotIn(List<Date> values) {
            addCriterion("change_lock_time not in", values, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeBetween(Date value1, Date value2) {
            addCriterion("change_lock_time between", value1, value2, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andChangeLockTimeNotBetween(Date value1, Date value2) {
            addCriterion("change_lock_time not between", value1, value2, "changeLockTime");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNull() {
            addCriterion("user_level is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIsNotNull() {
            addCriterion("user_level is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelEqualTo(String value) {
            addCriterion("user_level =", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotEqualTo(String value) {
            addCriterion("user_level <>", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThan(String value) {
            addCriterion("user_level >", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelGreaterThanOrEqualTo(String value) {
            addCriterion("user_level >=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThan(String value) {
            addCriterion("user_level <", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLessThanOrEqualTo(String value) {
            addCriterion("user_level <=", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelLike(String value) {
            addCriterion("user_level like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotLike(String value) {
            addCriterion("user_level not like", value, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelIn(List<String> values) {
            addCriterion("user_level in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotIn(List<String> values) {
            addCriterion("user_level not in", values, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelBetween(String value1, String value2) {
            addCriterion("user_level between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelNotBetween(String value1, String value2) {
            addCriterion("user_level not between", value1, value2, "userLevel");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginIsNull() {
            addCriterion("user_level_validity_begin is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginIsNotNull() {
            addCriterion("user_level_validity_begin is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginEqualTo(Date value) {
            addCriterionForJDBCDate("user_level_validity_begin =", value, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_level_validity_begin <>", value, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginGreaterThan(Date value) {
            addCriterionForJDBCDate("user_level_validity_begin >", value, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_level_validity_begin >=", value, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginLessThan(Date value) {
            addCriterionForJDBCDate("user_level_validity_begin <", value, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_level_validity_begin <=", value, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginIn(List<Date> values) {
            addCriterionForJDBCDate("user_level_validity_begin in", values, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_level_validity_begin not in", values, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_level_validity_begin between", value1, value2, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityBeginNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_level_validity_begin not between", value1, value2, "userLevelValidityBegin");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndIsNull() {
            addCriterion("user_level_validity_end is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndIsNotNull() {
            addCriterion("user_level_validity_end is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndEqualTo(Date value) {
            addCriterionForJDBCDate("user_level_validity_end =", value, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("user_level_validity_end <>", value, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndGreaterThan(Date value) {
            addCriterionForJDBCDate("user_level_validity_end >", value, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_level_validity_end >=", value, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndLessThan(Date value) {
            addCriterionForJDBCDate("user_level_validity_end <", value, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("user_level_validity_end <=", value, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndIn(List<Date> values) {
            addCriterionForJDBCDate("user_level_validity_end in", values, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("user_level_validity_end not in", values, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_level_validity_end between", value1, value2, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserLevelValidityEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("user_level_validity_end not between", value1, value2, "userLevelValidityEnd");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusIsNull() {
            addCriterion("user_real_status is null");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusIsNotNull() {
            addCriterion("user_real_status is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusEqualTo(String value) {
            addCriterion("user_real_status =", value, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusNotEqualTo(String value) {
            addCriterion("user_real_status <>", value, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusGreaterThan(String value) {
            addCriterion("user_real_status >", value, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusGreaterThanOrEqualTo(String value) {
            addCriterion("user_real_status >=", value, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusLessThan(String value) {
            addCriterion("user_real_status <", value, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusLessThanOrEqualTo(String value) {
            addCriterion("user_real_status <=", value, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusLike(String value) {
            addCriterion("user_real_status like", value, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusNotLike(String value) {
            addCriterion("user_real_status not like", value, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusIn(List<String> values) {
            addCriterion("user_real_status in", values, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusNotIn(List<String> values) {
            addCriterion("user_real_status not in", values, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusBetween(String value1, String value2) {
            addCriterion("user_real_status between", value1, value2, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andUserRealStatusNotBetween(String value1, String value2) {
            addCriterion("user_real_status not between", value1, value2, "userRealStatus");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelIsNull() {
            addCriterion("certify_level is null");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelIsNotNull() {
            addCriterion("certify_level is not null");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelEqualTo(Integer value) {
            addCriterion("certify_level =", value, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelNotEqualTo(Integer value) {
            addCriterion("certify_level <>", value, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelGreaterThan(Integer value) {
            addCriterion("certify_level >", value, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("certify_level >=", value, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelLessThan(Integer value) {
            addCriterion("certify_level <", value, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelLessThanOrEqualTo(Integer value) {
            addCriterion("certify_level <=", value, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelIn(List<Integer> values) {
            addCriterion("certify_level in", values, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelNotIn(List<Integer> values) {
            addCriterion("certify_level not in", values, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelBetween(Integer value1, Integer value2) {
            addCriterion("certify_level between", value1, value2, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andCertifyLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("certify_level not between", value1, value2, "certifyLevel");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNull() {
            addCriterion("user_province is null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIsNotNull() {
            addCriterion("user_province is not null");
            return (Criteria) this;
        }

        public Criteria andUserProvinceEqualTo(String value) {
            addCriterion("user_province =", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotEqualTo(String value) {
            addCriterion("user_province <>", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThan(String value) {
            addCriterion("user_province >", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("user_province >=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThan(String value) {
            addCriterion("user_province <", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLessThanOrEqualTo(String value) {
            addCriterion("user_province <=", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceLike(String value) {
            addCriterion("user_province like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotLike(String value) {
            addCriterion("user_province not like", value, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceIn(List<String> values) {
            addCriterion("user_province in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotIn(List<String> values) {
            addCriterion("user_province not in", values, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceBetween(String value1, String value2) {
            addCriterion("user_province between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserProvinceNotBetween(String value1, String value2) {
            addCriterion("user_province not between", value1, value2, "userProvince");
            return (Criteria) this;
        }

        public Criteria andUserCountyIsNull() {
            addCriterion("user_county is null");
            return (Criteria) this;
        }

        public Criteria andUserCountyIsNotNull() {
            addCriterion("user_county is not null");
            return (Criteria) this;
        }

        public Criteria andUserCountyEqualTo(String value) {
            addCriterion("user_county =", value, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyNotEqualTo(String value) {
            addCriterion("user_county <>", value, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyGreaterThan(String value) {
            addCriterion("user_county >", value, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyGreaterThanOrEqualTo(String value) {
            addCriterion("user_county >=", value, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyLessThan(String value) {
            addCriterion("user_county <", value, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyLessThanOrEqualTo(String value) {
            addCriterion("user_county <=", value, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyLike(String value) {
            addCriterion("user_county like", value, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyNotLike(String value) {
            addCriterion("user_county not like", value, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyIn(List<String> values) {
            addCriterion("user_county in", values, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyNotIn(List<String> values) {
            addCriterion("user_county not in", values, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyBetween(String value1, String value2) {
            addCriterion("user_county between", value1, value2, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCountyNotBetween(String value1, String value2) {
            addCriterion("user_county not between", value1, value2, "userCounty");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNull() {
            addCriterion("user_city is null");
            return (Criteria) this;
        }

        public Criteria andUserCityIsNotNull() {
            addCriterion("user_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserCityEqualTo(String value) {
            addCriterion("user_city =", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotEqualTo(String value) {
            addCriterion("user_city <>", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThan(String value) {
            addCriterion("user_city >", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_city >=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThan(String value) {
            addCriterion("user_city <", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLessThanOrEqualTo(String value) {
            addCriterion("user_city <=", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityLike(String value) {
            addCriterion("user_city like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotLike(String value) {
            addCriterion("user_city not like", value, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityIn(List<String> values) {
            addCriterion("user_city in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotIn(List<String> values) {
            addCriterion("user_city not in", values, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityBetween(String value1, String value2) {
            addCriterion("user_city between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andUserCityNotBetween(String value1, String value2) {
            addCriterion("user_city not between", value1, value2, "userCity");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNull() {
            addCriterion("fixed_phone is null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIsNotNull() {
            addCriterion("fixed_phone is not null");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneEqualTo(String value) {
            addCriterion("fixed_phone =", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotEqualTo(String value) {
            addCriterion("fixed_phone <>", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThan(String value) {
            addCriterion("fixed_phone >", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("fixed_phone >=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThan(String value) {
            addCriterion("fixed_phone <", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLessThanOrEqualTo(String value) {
            addCriterion("fixed_phone <=", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneLike(String value) {
            addCriterion("fixed_phone like", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotLike(String value) {
            addCriterion("fixed_phone not like", value, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneIn(List<String> values) {
            addCriterion("fixed_phone in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotIn(List<String> values) {
            addCriterion("fixed_phone not in", values, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneBetween(String value1, String value2) {
            addCriterion("fixed_phone between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andFixedPhoneNotBetween(String value1, String value2) {
            addCriterion("fixed_phone not between", value1, value2, "fixedPhone");
            return (Criteria) this;
        }

        public Criteria andZipIsNull() {
            addCriterion("zip is null");
            return (Criteria) this;
        }

        public Criteria andZipIsNotNull() {
            addCriterion("zip is not null");
            return (Criteria) this;
        }

        public Criteria andZipEqualTo(String value) {
            addCriterion("zip =", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotEqualTo(String value) {
            addCriterion("zip <>", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThan(String value) {
            addCriterion("zip >", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipGreaterThanOrEqualTo(String value) {
            addCriterion("zip >=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThan(String value) {
            addCriterion("zip <", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLessThanOrEqualTo(String value) {
            addCriterion("zip <=", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipLike(String value) {
            addCriterion("zip like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotLike(String value) {
            addCriterion("zip not like", value, "zip");
            return (Criteria) this;
        }

        public Criteria andZipIn(List<String> values) {
            addCriterion("zip in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotIn(List<String> values) {
            addCriterion("zip not in", values, "zip");
            return (Criteria) this;
        }

        public Criteria andZipBetween(String value1, String value2) {
            addCriterion("zip between", value1, value2, "zip");
            return (Criteria) this;
        }

        public Criteria andZipNotBetween(String value1, String value2) {
            addCriterion("zip not between", value1, value2, "zip");
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

        public Criteria andQqIsNull() {
            addCriterion("qq is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("qq is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("qq =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("qq <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("qq >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("qq >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("qq <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("qq <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("qq like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("qq not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("qq in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("qq not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("qq between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("qq not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andBelongToIsNull() {
            addCriterion("belong_to is null");
            return (Criteria) this;
        }

        public Criteria andBelongToIsNotNull() {
            addCriterion("belong_to is not null");
            return (Criteria) this;
        }

        public Criteria andBelongToEqualTo(Long value) {
            addCriterion("belong_to =", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotEqualTo(Long value) {
            addCriterion("belong_to <>", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToGreaterThan(Long value) {
            addCriterion("belong_to >", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToGreaterThanOrEqualTo(Long value) {
            addCriterion("belong_to >=", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToLessThan(Long value) {
            addCriterion("belong_to <", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToLessThanOrEqualTo(Long value) {
            addCriterion("belong_to <=", value, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToIn(List<Long> values) {
            addCriterion("belong_to in", values, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotIn(List<Long> values) {
            addCriterion("belong_to not in", values, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToBetween(Long value1, Long value2) {
            addCriterion("belong_to between", value1, value2, "belongTo");
            return (Criteria) this;
        }

        public Criteria andBelongToNotBetween(Long value1, Long value2) {
            addCriterion("belong_to not between", value1, value2, "belongTo");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeIsNull() {
            addCriterion("user_custom_type is null");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeIsNotNull() {
            addCriterion("user_custom_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeEqualTo(String value) {
            addCriterion("user_custom_type =", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeNotEqualTo(String value) {
            addCriterion("user_custom_type <>", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeGreaterThan(String value) {
            addCriterion("user_custom_type >", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_custom_type >=", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeLessThan(String value) {
            addCriterion("user_custom_type <", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeLessThanOrEqualTo(String value) {
            addCriterion("user_custom_type <=", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeLike(String value) {
            addCriterion("user_custom_type like", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeNotLike(String value) {
            addCriterion("user_custom_type not like", value, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeIn(List<String> values) {
            addCriterion("user_custom_type in", values, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeNotIn(List<String> values) {
            addCriterion("user_custom_type not in", values, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeBetween(String value1, String value2) {
            addCriterion("user_custom_type between", value1, value2, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomTypeNotBetween(String value1, String value2) {
            addCriterion("user_custom_type not between", value1, value2, "userCustomType");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1IsNull() {
            addCriterion("user_custom_type1 is null");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1IsNotNull() {
            addCriterion("user_custom_type1 is not null");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1EqualTo(String value) {
            addCriterion("user_custom_type1 =", value, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1NotEqualTo(String value) {
            addCriterion("user_custom_type1 <>", value, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1GreaterThan(String value) {
            addCriterion("user_custom_type1 >", value, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1GreaterThanOrEqualTo(String value) {
            addCriterion("user_custom_type1 >=", value, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1LessThan(String value) {
            addCriterion("user_custom_type1 <", value, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1LessThanOrEqualTo(String value) {
            addCriterion("user_custom_type1 <=", value, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1Like(String value) {
            addCriterion("user_custom_type1 like", value, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1NotLike(String value) {
            addCriterion("user_custom_type1 not like", value, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1In(List<String> values) {
            addCriterion("user_custom_type1 in", values, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1NotIn(List<String> values) {
            addCriterion("user_custom_type1 not in", values, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1Between(String value1, String value2) {
            addCriterion("user_custom_type1 between", value1, value2, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType1NotBetween(String value1, String value2) {
            addCriterion("user_custom_type1 not between", value1, value2, "userCustomType1");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2IsNull() {
            addCriterion("user_custom_type2 is null");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2IsNotNull() {
            addCriterion("user_custom_type2 is not null");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2EqualTo(String value) {
            addCriterion("user_custom_type2 =", value, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2NotEqualTo(String value) {
            addCriterion("user_custom_type2 <>", value, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2GreaterThan(String value) {
            addCriterion("user_custom_type2 >", value, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2GreaterThanOrEqualTo(String value) {
            addCriterion("user_custom_type2 >=", value, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2LessThan(String value) {
            addCriterion("user_custom_type2 <", value, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2LessThanOrEqualTo(String value) {
            addCriterion("user_custom_type2 <=", value, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2Like(String value) {
            addCriterion("user_custom_type2 like", value, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2NotLike(String value) {
            addCriterion("user_custom_type2 not like", value, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2In(List<String> values) {
            addCriterion("user_custom_type2 in", values, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2NotIn(List<String> values) {
            addCriterion("user_custom_type2 not in", values, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2Between(String value1, String value2) {
            addCriterion("user_custom_type2 between", value1, value2, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andUserCustomType2NotBetween(String value1, String value2) {
            addCriterion("user_custom_type2 not between", value1, value2, "userCustomType2");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNull() {
            addCriterion("enterprise_type is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIsNotNull() {
            addCriterion("enterprise_type is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeEqualTo(String value) {
            addCriterion("enterprise_type =", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotEqualTo(String value) {
            addCriterion("enterprise_type <>", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThan(String value) {
            addCriterion("enterprise_type >", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_type >=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThan(String value) {
            addCriterion("enterprise_type <", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLessThanOrEqualTo(String value) {
            addCriterion("enterprise_type <=", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeLike(String value) {
            addCriterion("enterprise_type like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotLike(String value) {
            addCriterion("enterprise_type not like", value, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeIn(List<String> values) {
            addCriterion("enterprise_type in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotIn(List<String> values) {
            addCriterion("enterprise_type not in", values, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeBetween(String value1, String value2) {
            addCriterion("enterprise_type between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andEnterpriseTypeNotBetween(String value1, String value2) {
            addCriterion("enterprise_type not between", value1, value2, "enterpriseType");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromIsNull() {
            addCriterion("user_register_from is null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromIsNotNull() {
            addCriterion("user_register_from is not null");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromEqualTo(String value) {
            addCriterion("user_register_from =", value, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromNotEqualTo(String value) {
            addCriterion("user_register_from <>", value, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromGreaterThan(String value) {
            addCriterion("user_register_from >", value, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromGreaterThanOrEqualTo(String value) {
            addCriterion("user_register_from >=", value, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromLessThan(String value) {
            addCriterion("user_register_from <", value, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromLessThanOrEqualTo(String value) {
            addCriterion("user_register_from <=", value, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromLike(String value) {
            addCriterion("user_register_from like", value, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromNotLike(String value) {
            addCriterion("user_register_from not like", value, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromIn(List<String> values) {
            addCriterion("user_register_from in", values, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromNotIn(List<String> values) {
            addCriterion("user_register_from not in", values, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromBetween(String value1, String value2) {
            addCriterion("user_register_from between", value1, value2, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andUserRegisterFromNotBetween(String value1, String value2) {
            addCriterion("user_register_from not between", value1, value2, "userRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromIsNull() {
            addCriterion("app_register_from is null");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromIsNotNull() {
            addCriterion("app_register_from is not null");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromEqualTo(String value) {
            addCriterion("app_register_from =", value, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromNotEqualTo(String value) {
            addCriterion("app_register_from <>", value, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromGreaterThan(String value) {
            addCriterion("app_register_from >", value, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromGreaterThanOrEqualTo(String value) {
            addCriterion("app_register_from >=", value, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromLessThan(String value) {
            addCriterion("app_register_from <", value, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromLessThanOrEqualTo(String value) {
            addCriterion("app_register_from <=", value, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromLike(String value) {
            addCriterion("app_register_from like", value, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromNotLike(String value) {
            addCriterion("app_register_from not like", value, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromIn(List<String> values) {
            addCriterion("app_register_from in", values, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromNotIn(List<String> values) {
            addCriterion("app_register_from not in", values, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromBetween(String value1, String value2) {
            addCriterion("app_register_from between", value1, value2, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andAppRegisterFromNotBetween(String value1, String value2) {
            addCriterion("app_register_from not between", value1, value2, "appRegisterFrom");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIsNull() {
            addCriterion("link_code is null");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIsNotNull() {
            addCriterion("link_code is not null");
            return (Criteria) this;
        }

        public Criteria andLinkCodeEqualTo(String value) {
            addCriterion("link_code =", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotEqualTo(String value) {
            addCriterion("link_code <>", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeGreaterThan(String value) {
            addCriterion("link_code >", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeGreaterThanOrEqualTo(String value) {
            addCriterion("link_code >=", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLessThan(String value) {
            addCriterion("link_code <", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLessThanOrEqualTo(String value) {
            addCriterion("link_code <=", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeLike(String value) {
            addCriterion("link_code like", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotLike(String value) {
            addCriterion("link_code not like", value, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeIn(List<String> values) {
            addCriterion("link_code in", values, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotIn(List<String> values) {
            addCriterion("link_code not in", values, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeBetween(String value1, String value2) {
            addCriterion("link_code between", value1, value2, "linkCode");
            return (Criteria) this;
        }

        public Criteria andLinkCodeNotBetween(String value1, String value2) {
            addCriterion("link_code not between", value1, value2, "linkCode");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyIsNull() {
            addCriterion("is_generation_buy is null");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyIsNotNull() {
            addCriterion("is_generation_buy is not null");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyEqualTo(String value) {
            addCriterion("is_generation_buy =", value, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyNotEqualTo(String value) {
            addCriterion("is_generation_buy <>", value, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyGreaterThan(String value) {
            addCriterion("is_generation_buy >", value, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyGreaterThanOrEqualTo(String value) {
            addCriterion("is_generation_buy >=", value, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyLessThan(String value) {
            addCriterion("is_generation_buy <", value, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyLessThanOrEqualTo(String value) {
            addCriterion("is_generation_buy <=", value, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyLike(String value) {
            addCriterion("is_generation_buy like", value, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyNotLike(String value) {
            addCriterion("is_generation_buy not like", value, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyIn(List<String> values) {
            addCriterion("is_generation_buy in", values, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyNotIn(List<String> values) {
            addCriterion("is_generation_buy not in", values, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyBetween(String value1, String value2) {
            addCriterion("is_generation_buy between", value1, value2, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andIsGenerationBuyNotBetween(String value1, String value2) {
            addCriterion("is_generation_buy not between", value1, value2, "isGenerationBuy");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIsNull() {
            addCriterion("praise_count is null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIsNotNull() {
            addCriterion("praise_count is not null");
            return (Criteria) this;
        }

        public Criteria andPraiseCountEqualTo(Long value) {
            addCriterion("praise_count =", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotEqualTo(Long value) {
            addCriterion("praise_count <>", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThan(Long value) {
            addCriterion("praise_count >", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountGreaterThanOrEqualTo(Long value) {
            addCriterion("praise_count >=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThan(Long value) {
            addCriterion("praise_count <", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountLessThanOrEqualTo(Long value) {
            addCriterion("praise_count <=", value, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountIn(List<Long> values) {
            addCriterion("praise_count in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotIn(List<Long> values) {
            addCriterion("praise_count not in", values, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountBetween(Long value1, Long value2) {
            addCriterion("praise_count between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andPraiseCountNotBetween(Long value1, Long value2) {
            addCriterion("praise_count not between", value1, value2, "praiseCount");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusIsNull() {
            addCriterion("qr_code_push_status is null");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusIsNotNull() {
            addCriterion("qr_code_push_status is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusEqualTo(String value) {
            addCriterion("qr_code_push_status =", value, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusNotEqualTo(String value) {
            addCriterion("qr_code_push_status <>", value, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusGreaterThan(String value) {
            addCriterion("qr_code_push_status >", value, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code_push_status >=", value, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusLessThan(String value) {
            addCriterion("qr_code_push_status <", value, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusLessThanOrEqualTo(String value) {
            addCriterion("qr_code_push_status <=", value, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusLike(String value) {
            addCriterion("qr_code_push_status like", value, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusNotLike(String value) {
            addCriterion("qr_code_push_status not like", value, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusIn(List<String> values) {
            addCriterion("qr_code_push_status in", values, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusNotIn(List<String> values) {
            addCriterion("qr_code_push_status not in", values, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusBetween(String value1, String value2) {
            addCriterion("qr_code_push_status between", value1, value2, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodePushStatusNotBetween(String value1, String value2) {
            addCriterion("qr_code_push_status not between", value1, value2, "qrCodePushStatus");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdIsNull() {
            addCriterion("company_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdIsNotNull() {
            addCriterion("company_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdEqualTo(Long value) {
            addCriterion("company_customer_id =", value, "companyCustomerId");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdNotEqualTo(Long value) {
            addCriterion("company_customer_id <>", value, "companyCustomerId");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdGreaterThan(Long value) {
            addCriterion("company_customer_id >", value, "companyCustomerId");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_customer_id >=", value, "companyCustomerId");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdLessThan(Long value) {
            addCriterion("company_customer_id <", value, "companyCustomerId");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("company_customer_id <=", value, "companyCustomerId");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdIn(List<Long> values) {
            addCriterion("company_customer_id in", values, "companyCustomerId");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdNotIn(List<Long> values) {
            addCriterion("company_customer_id not in", values, "companyCustomerId");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdBetween(Long value1, Long value2) {
            addCriterion("company_customer_id between", value1, value2, "companyCustomerId");
            return (Criteria) this;
        }

        public Criteria andCompanyCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("company_customer_id not between", value1, value2, "companyCustomerId");
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
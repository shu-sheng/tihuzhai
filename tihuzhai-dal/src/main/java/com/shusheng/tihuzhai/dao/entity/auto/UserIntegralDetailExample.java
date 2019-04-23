package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserIntegralDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserIntegralDetailExample() {
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

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(String value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(String value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(String value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(String value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(String value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLike(String value) {
            addCriterion("direction like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotLike(String value) {
            addCriterion("direction not like", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<String> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<String> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(String value1, String value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(String value1, String value2) {
            addCriterion("direction not between", value1, value2, "direction");
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

        public Criteria andChangetypeIsNull() {
            addCriterion("changeType is null");
            return (Criteria) this;
        }

        public Criteria andChangetypeIsNotNull() {
            addCriterion("changeType is not null");
            return (Criteria) this;
        }

        public Criteria andChangetypeEqualTo(String value) {
            addCriterion("changeType =", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotEqualTo(String value) {
            addCriterion("changeType <>", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeGreaterThan(String value) {
            addCriterion("changeType >", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeGreaterThanOrEqualTo(String value) {
            addCriterion("changeType >=", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLessThan(String value) {
            addCriterion("changeType <", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLessThanOrEqualTo(String value) {
            addCriterion("changeType <=", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeLike(String value) {
            addCriterion("changeType like", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotLike(String value) {
            addCriterion("changeType not like", value, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeIn(List<String> values) {
            addCriterion("changeType in", values, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotIn(List<String> values) {
            addCriterion("changeType not in", values, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeBetween(String value1, String value2) {
            addCriterion("changeType between", value1, value2, "changetype");
            return (Criteria) this;
        }

        public Criteria andChangetypeNotBetween(String value1, String value2) {
            addCriterion("changeType not between", value1, value2, "changetype");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdIsNull() {
            addCriterion("relation_user_id is null");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdIsNotNull() {
            addCriterion("relation_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdEqualTo(Long value) {
            addCriterion("relation_user_id =", value, "relationUserId");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdNotEqualTo(Long value) {
            addCriterion("relation_user_id <>", value, "relationUserId");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdGreaterThan(Long value) {
            addCriterion("relation_user_id >", value, "relationUserId");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("relation_user_id >=", value, "relationUserId");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdLessThan(Long value) {
            addCriterion("relation_user_id <", value, "relationUserId");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdLessThanOrEqualTo(Long value) {
            addCriterion("relation_user_id <=", value, "relationUserId");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdIn(List<Long> values) {
            addCriterion("relation_user_id in", values, "relationUserId");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdNotIn(List<Long> values) {
            addCriterion("relation_user_id not in", values, "relationUserId");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdBetween(Long value1, Long value2) {
            addCriterion("relation_user_id between", value1, value2, "relationUserId");
            return (Criteria) this;
        }

        public Criteria andRelationUserIdNotBetween(Long value1, Long value2) {
            addCriterion("relation_user_id not between", value1, value2, "relationUserId");
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

        public Criteria andIntegralBalanceIsNull() {
            addCriterion("integral_balance is null");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceIsNotNull() {
            addCriterion("integral_balance is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceEqualTo(Long value) {
            addCriterion("integral_balance =", value, "integralBalance");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceNotEqualTo(Long value) {
            addCriterion("integral_balance <>", value, "integralBalance");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceGreaterThan(Long value) {
            addCriterion("integral_balance >", value, "integralBalance");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("integral_balance >=", value, "integralBalance");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceLessThan(Long value) {
            addCriterion("integral_balance <", value, "integralBalance");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceLessThanOrEqualTo(Long value) {
            addCriterion("integral_balance <=", value, "integralBalance");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceIn(List<Long> values) {
            addCriterion("integral_balance in", values, "integralBalance");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceNotIn(List<Long> values) {
            addCriterion("integral_balance not in", values, "integralBalance");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceBetween(Long value1, Long value2) {
            addCriterion("integral_balance between", value1, value2, "integralBalance");
            return (Criteria) this;
        }

        public Criteria andIntegralBalanceNotBetween(Long value1, Long value2) {
            addCriterion("integral_balance not between", value1, value2, "integralBalance");
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
package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class UserPointsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPointsExample() {
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

        public Criteria andUserPointsIdIsNull() {
            addCriterion("user_points_id is null");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdIsNotNull() {
            addCriterion("user_points_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdEqualTo(Long value) {
            addCriterion("user_points_id =", value, "userPointsId");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdNotEqualTo(Long value) {
            addCriterion("user_points_id <>", value, "userPointsId");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdGreaterThan(Long value) {
            addCriterion("user_points_id >", value, "userPointsId");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_points_id >=", value, "userPointsId");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdLessThan(Long value) {
            addCriterion("user_points_id <", value, "userPointsId");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdLessThanOrEqualTo(Long value) {
            addCriterion("user_points_id <=", value, "userPointsId");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdIn(List<Long> values) {
            addCriterion("user_points_id in", values, "userPointsId");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdNotIn(List<Long> values) {
            addCriterion("user_points_id not in", values, "userPointsId");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdBetween(Long value1, Long value2) {
            addCriterion("user_points_id between", value1, value2, "userPointsId");
            return (Criteria) this;
        }

        public Criteria andUserPointsIdNotBetween(Long value1, Long value2) {
            addCriterion("user_points_id not between", value1, value2, "userPointsId");
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

        public Criteria andPointsTotalIsNull() {
            addCriterion("points_total is null");
            return (Criteria) this;
        }

        public Criteria andPointsTotalIsNotNull() {
            addCriterion("points_total is not null");
            return (Criteria) this;
        }

        public Criteria andPointsTotalEqualTo(Long value) {
            addCriterion("points_total =", value, "pointsTotal");
            return (Criteria) this;
        }

        public Criteria andPointsTotalNotEqualTo(Long value) {
            addCriterion("points_total <>", value, "pointsTotal");
            return (Criteria) this;
        }

        public Criteria andPointsTotalGreaterThan(Long value) {
            addCriterion("points_total >", value, "pointsTotal");
            return (Criteria) this;
        }

        public Criteria andPointsTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("points_total >=", value, "pointsTotal");
            return (Criteria) this;
        }

        public Criteria andPointsTotalLessThan(Long value) {
            addCriterion("points_total <", value, "pointsTotal");
            return (Criteria) this;
        }

        public Criteria andPointsTotalLessThanOrEqualTo(Long value) {
            addCriterion("points_total <=", value, "pointsTotal");
            return (Criteria) this;
        }

        public Criteria andPointsTotalIn(List<Long> values) {
            addCriterion("points_total in", values, "pointsTotal");
            return (Criteria) this;
        }

        public Criteria andPointsTotalNotIn(List<Long> values) {
            addCriterion("points_total not in", values, "pointsTotal");
            return (Criteria) this;
        }

        public Criteria andPointsTotalBetween(Long value1, Long value2) {
            addCriterion("points_total between", value1, value2, "pointsTotal");
            return (Criteria) this;
        }

        public Criteria andPointsTotalNotBetween(Long value1, Long value2) {
            addCriterion("points_total not between", value1, value2, "pointsTotal");
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
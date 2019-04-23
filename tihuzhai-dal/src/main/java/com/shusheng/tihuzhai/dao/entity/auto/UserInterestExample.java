package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserInterestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserInterestExample() {
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

        public Criteria andUserInterestIdIsNull() {
            addCriterion("user_interest_id is null");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdIsNotNull() {
            addCriterion("user_interest_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdEqualTo(Long value) {
            addCriterion("user_interest_id =", value, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdNotEqualTo(Long value) {
            addCriterion("user_interest_id <>", value, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdGreaterThan(Long value) {
            addCriterion("user_interest_id >", value, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_interest_id >=", value, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdLessThan(Long value) {
            addCriterion("user_interest_id <", value, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdLessThanOrEqualTo(Long value) {
            addCriterion("user_interest_id <=", value, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdIn(List<Long> values) {
            addCriterion("user_interest_id in", values, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdNotIn(List<Long> values) {
            addCriterion("user_interest_id not in", values, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdBetween(Long value1, Long value2) {
            addCriterion("user_interest_id between", value1, value2, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestIdNotBetween(Long value1, Long value2) {
            addCriterion("user_interest_id not between", value1, value2, "userInterestId");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeIsNull() {
            addCriterion("user_interest_type is null");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeIsNotNull() {
            addCriterion("user_interest_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeEqualTo(String value) {
            addCriterion("user_interest_type =", value, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeNotEqualTo(String value) {
            addCriterion("user_interest_type <>", value, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeGreaterThan(String value) {
            addCriterion("user_interest_type >", value, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeGreaterThanOrEqualTo(String value) {
            addCriterion("user_interest_type >=", value, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeLessThan(String value) {
            addCriterion("user_interest_type <", value, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeLessThanOrEqualTo(String value) {
            addCriterion("user_interest_type <=", value, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeLike(String value) {
            addCriterion("user_interest_type like", value, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeNotLike(String value) {
            addCriterion("user_interest_type not like", value, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeIn(List<String> values) {
            addCriterion("user_interest_type in", values, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeNotIn(List<String> values) {
            addCriterion("user_interest_type not in", values, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeBetween(String value1, String value2) {
            addCriterion("user_interest_type between", value1, value2, "userInterestType");
            return (Criteria) this;
        }

        public Criteria andUserInterestTypeNotBetween(String value1, String value2) {
            addCriterion("user_interest_type not between", value1, value2, "userInterestType");
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

        public Criteria andRelationValue1IsNull() {
            addCriterion("relation_value1 is null");
            return (Criteria) this;
        }

        public Criteria andRelationValue1IsNotNull() {
            addCriterion("relation_value1 is not null");
            return (Criteria) this;
        }

        public Criteria andRelationValue1EqualTo(String value) {
            addCriterion("relation_value1 =", value, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1NotEqualTo(String value) {
            addCriterion("relation_value1 <>", value, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1GreaterThan(String value) {
            addCriterion("relation_value1 >", value, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1GreaterThanOrEqualTo(String value) {
            addCriterion("relation_value1 >=", value, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1LessThan(String value) {
            addCriterion("relation_value1 <", value, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1LessThanOrEqualTo(String value) {
            addCriterion("relation_value1 <=", value, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1Like(String value) {
            addCriterion("relation_value1 like", value, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1NotLike(String value) {
            addCriterion("relation_value1 not like", value, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1In(List<String> values) {
            addCriterion("relation_value1 in", values, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1NotIn(List<String> values) {
            addCriterion("relation_value1 not in", values, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1Between(String value1, String value2) {
            addCriterion("relation_value1 between", value1, value2, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue1NotBetween(String value1, String value2) {
            addCriterion("relation_value1 not between", value1, value2, "relationValue1");
            return (Criteria) this;
        }

        public Criteria andRelationValue2IsNull() {
            addCriterion("relation_value2 is null");
            return (Criteria) this;
        }

        public Criteria andRelationValue2IsNotNull() {
            addCriterion("relation_value2 is not null");
            return (Criteria) this;
        }

        public Criteria andRelationValue2EqualTo(String value) {
            addCriterion("relation_value2 =", value, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2NotEqualTo(String value) {
            addCriterion("relation_value2 <>", value, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2GreaterThan(String value) {
            addCriterion("relation_value2 >", value, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2GreaterThanOrEqualTo(String value) {
            addCriterion("relation_value2 >=", value, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2LessThan(String value) {
            addCriterion("relation_value2 <", value, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2LessThanOrEqualTo(String value) {
            addCriterion("relation_value2 <=", value, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2Like(String value) {
            addCriterion("relation_value2 like", value, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2NotLike(String value) {
            addCriterion("relation_value2 not like", value, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2In(List<String> values) {
            addCriterion("relation_value2 in", values, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2NotIn(List<String> values) {
            addCriterion("relation_value2 not in", values, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2Between(String value1, String value2) {
            addCriterion("relation_value2 between", value1, value2, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue2NotBetween(String value1, String value2) {
            addCriterion("relation_value2 not between", value1, value2, "relationValue2");
            return (Criteria) this;
        }

        public Criteria andRelationValue3IsNull() {
            addCriterion("relation_value3 is null");
            return (Criteria) this;
        }

        public Criteria andRelationValue3IsNotNull() {
            addCriterion("relation_value3 is not null");
            return (Criteria) this;
        }

        public Criteria andRelationValue3EqualTo(String value) {
            addCriterion("relation_value3 =", value, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3NotEqualTo(String value) {
            addCriterion("relation_value3 <>", value, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3GreaterThan(String value) {
            addCriterion("relation_value3 >", value, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3GreaterThanOrEqualTo(String value) {
            addCriterion("relation_value3 >=", value, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3LessThan(String value) {
            addCriterion("relation_value3 <", value, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3LessThanOrEqualTo(String value) {
            addCriterion("relation_value3 <=", value, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3Like(String value) {
            addCriterion("relation_value3 like", value, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3NotLike(String value) {
            addCriterion("relation_value3 not like", value, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3In(List<String> values) {
            addCriterion("relation_value3 in", values, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3NotIn(List<String> values) {
            addCriterion("relation_value3 not in", values, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3Between(String value1, String value2) {
            addCriterion("relation_value3 between", value1, value2, "relationValue3");
            return (Criteria) this;
        }

        public Criteria andRelationValue3NotBetween(String value1, String value2) {
            addCriterion("relation_value3 not between", value1, value2, "relationValue3");
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
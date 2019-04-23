package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PrizeRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrizeRuleExample() {
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

        public Criteria andPrizeRuleIdIsNull() {
            addCriterion("prize_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdIsNotNull() {
            addCriterion("prize_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdEqualTo(Long value) {
            addCriterion("prize_rule_id =", value, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdNotEqualTo(Long value) {
            addCriterion("prize_rule_id <>", value, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdGreaterThan(Long value) {
            addCriterion("prize_rule_id >", value, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prize_rule_id >=", value, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdLessThan(Long value) {
            addCriterion("prize_rule_id <", value, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("prize_rule_id <=", value, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdIn(List<Long> values) {
            addCriterion("prize_rule_id in", values, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdNotIn(List<Long> values) {
            addCriterion("prize_rule_id not in", values, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdBetween(Long value1, Long value2) {
            addCriterion("prize_rule_id between", value1, value2, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("prize_rule_id not between", value1, value2, "prizeRuleId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameIsNull() {
            addCriterion("prize_rule_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameIsNotNull() {
            addCriterion("prize_rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameEqualTo(String value) {
            addCriterion("prize_rule_name =", value, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameNotEqualTo(String value) {
            addCriterion("prize_rule_name <>", value, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameGreaterThan(String value) {
            addCriterion("prize_rule_name >", value, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_rule_name >=", value, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameLessThan(String value) {
            addCriterion("prize_rule_name <", value, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameLessThanOrEqualTo(String value) {
            addCriterion("prize_rule_name <=", value, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameLike(String value) {
            addCriterion("prize_rule_name like", value, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameNotLike(String value) {
            addCriterion("prize_rule_name not like", value, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameIn(List<String> values) {
            addCriterion("prize_rule_name in", values, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameNotIn(List<String> values) {
            addCriterion("prize_rule_name not in", values, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameBetween(String value1, String value2) {
            addCriterion("prize_rule_name between", value1, value2, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleNameNotBetween(String value1, String value2) {
            addCriterion("prize_rule_name not between", value1, value2, "prizeRuleName");
            return (Criteria) this;
        }

        public Criteria andWinningRateIsNull() {
            addCriterion("winning_rate is null");
            return (Criteria) this;
        }

        public Criteria andWinningRateIsNotNull() {
            addCriterion("winning_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWinningRateEqualTo(Double value) {
            addCriterion("winning_rate =", value, "winningRate");
            return (Criteria) this;
        }

        public Criteria andWinningRateNotEqualTo(Double value) {
            addCriterion("winning_rate <>", value, "winningRate");
            return (Criteria) this;
        }

        public Criteria andWinningRateGreaterThan(Double value) {
            addCriterion("winning_rate >", value, "winningRate");
            return (Criteria) this;
        }

        public Criteria andWinningRateGreaterThanOrEqualTo(Double value) {
            addCriterion("winning_rate >=", value, "winningRate");
            return (Criteria) this;
        }

        public Criteria andWinningRateLessThan(Double value) {
            addCriterion("winning_rate <", value, "winningRate");
            return (Criteria) this;
        }

        public Criteria andWinningRateLessThanOrEqualTo(Double value) {
            addCriterion("winning_rate <=", value, "winningRate");
            return (Criteria) this;
        }

        public Criteria andWinningRateIn(List<Double> values) {
            addCriterion("winning_rate in", values, "winningRate");
            return (Criteria) this;
        }

        public Criteria andWinningRateNotIn(List<Double> values) {
            addCriterion("winning_rate not in", values, "winningRate");
            return (Criteria) this;
        }

        public Criteria andWinningRateBetween(Double value1, Double value2) {
            addCriterion("winning_rate between", value1, value2, "winningRate");
            return (Criteria) this;
        }

        public Criteria andWinningRateNotBetween(Double value1, Double value2) {
            addCriterion("winning_rate not between", value1, value2, "winningRate");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIsNull() {
            addCriterion("prize_num is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIsNotNull() {
            addCriterion("prize_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumEqualTo(Long value) {
            addCriterion("prize_num =", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotEqualTo(Long value) {
            addCriterion("prize_num <>", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThan(Long value) {
            addCriterion("prize_num >", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThanOrEqualTo(Long value) {
            addCriterion("prize_num >=", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThan(Long value) {
            addCriterion("prize_num <", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThanOrEqualTo(Long value) {
            addCriterion("prize_num <=", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIn(List<Long> values) {
            addCriterion("prize_num in", values, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotIn(List<Long> values) {
            addCriterion("prize_num not in", values, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumBetween(Long value1, Long value2) {
            addCriterion("prize_num between", value1, value2, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotBetween(Long value1, Long value2) {
            addCriterion("prize_num not between", value1, value2, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumIsNull() {
            addCriterion("not_winning_num is null");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumIsNotNull() {
            addCriterion("not_winning_num is not null");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumEqualTo(Long value) {
            addCriterion("not_winning_num =", value, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumNotEqualTo(Long value) {
            addCriterion("not_winning_num <>", value, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumGreaterThan(Long value) {
            addCriterion("not_winning_num >", value, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumGreaterThanOrEqualTo(Long value) {
            addCriterion("not_winning_num >=", value, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumLessThan(Long value) {
            addCriterion("not_winning_num <", value, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumLessThanOrEqualTo(Long value) {
            addCriterion("not_winning_num <=", value, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumIn(List<Long> values) {
            addCriterion("not_winning_num in", values, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumNotIn(List<Long> values) {
            addCriterion("not_winning_num not in", values, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumBetween(Long value1, Long value2) {
            addCriterion("not_winning_num between", value1, value2, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andNotWinningNumNotBetween(Long value1, Long value2) {
            addCriterion("not_winning_num not between", value1, value2, "notWinningNum");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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
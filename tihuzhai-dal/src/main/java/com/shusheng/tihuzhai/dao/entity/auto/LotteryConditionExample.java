package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryConditionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryConditionExample() {
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

        public Criteria andLotteryConditionIdIsNull() {
            addCriterion("lottery_condition_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdIsNotNull() {
            addCriterion("lottery_condition_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdEqualTo(Long value) {
            addCriterion("lottery_condition_id =", value, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdNotEqualTo(Long value) {
            addCriterion("lottery_condition_id <>", value, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdGreaterThan(Long value) {
            addCriterion("lottery_condition_id >", value, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lottery_condition_id >=", value, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdLessThan(Long value) {
            addCriterion("lottery_condition_id <", value, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdLessThanOrEqualTo(Long value) {
            addCriterion("lottery_condition_id <=", value, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdIn(List<Long> values) {
            addCriterion("lottery_condition_id in", values, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdNotIn(List<Long> values) {
            addCriterion("lottery_condition_id not in", values, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdBetween(Long value1, Long value2) {
            addCriterion("lottery_condition_id between", value1, value2, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionIdNotBetween(Long value1, Long value2) {
            addCriterion("lottery_condition_id not between", value1, value2, "lotteryConditionId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNull() {
            addCriterion("lottery_id is null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIsNotNull() {
            addCriterion("lottery_id is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryIdEqualTo(Long value) {
            addCriterion("lottery_id =", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotEqualTo(Long value) {
            addCriterion("lottery_id <>", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThan(Long value) {
            addCriterion("lottery_id >", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("lottery_id >=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThan(Long value) {
            addCriterion("lottery_id <", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdLessThanOrEqualTo(Long value) {
            addCriterion("lottery_id <=", value, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdIn(List<Long> values) {
            addCriterion("lottery_id in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotIn(List<Long> values) {
            addCriterion("lottery_id not in", values, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdBetween(Long value1, Long value2) {
            addCriterion("lottery_id between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andLotteryIdNotBetween(Long value1, Long value2) {
            addCriterion("lottery_id not between", value1, value2, "lotteryId");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNull() {
            addCriterion("seq_num is null");
            return (Criteria) this;
        }

        public Criteria andSeqNumIsNotNull() {
            addCriterion("seq_num is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNumEqualTo(Long value) {
            addCriterion("seq_num =", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotEqualTo(Long value) {
            addCriterion("seq_num <>", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThan(Long value) {
            addCriterion("seq_num >", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumGreaterThanOrEqualTo(Long value) {
            addCriterion("seq_num >=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThan(Long value) {
            addCriterion("seq_num <", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumLessThanOrEqualTo(Long value) {
            addCriterion("seq_num <=", value, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumIn(List<Long> values) {
            addCriterion("seq_num in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotIn(List<Long> values) {
            addCriterion("seq_num not in", values, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumBetween(Long value1, Long value2) {
            addCriterion("seq_num between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andSeqNumNotBetween(Long value1, Long value2) {
            addCriterion("seq_num not between", value1, value2, "seqNum");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeIsNull() {
            addCriterion("lottery_condition_type is null");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeIsNotNull() {
            addCriterion("lottery_condition_type is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeEqualTo(String value) {
            addCriterion("lottery_condition_type =", value, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeNotEqualTo(String value) {
            addCriterion("lottery_condition_type <>", value, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeGreaterThan(String value) {
            addCriterion("lottery_condition_type >", value, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_condition_type >=", value, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeLessThan(String value) {
            addCriterion("lottery_condition_type <", value, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeLessThanOrEqualTo(String value) {
            addCriterion("lottery_condition_type <=", value, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeLike(String value) {
            addCriterion("lottery_condition_type like", value, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeNotLike(String value) {
            addCriterion("lottery_condition_type not like", value, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeIn(List<String> values) {
            addCriterion("lottery_condition_type in", values, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeNotIn(List<String> values) {
            addCriterion("lottery_condition_type not in", values, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeBetween(String value1, String value2) {
            addCriterion("lottery_condition_type between", value1, value2, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andLotteryConditionTypeNotBetween(String value1, String value2) {
            addCriterion("lottery_condition_type not between", value1, value2, "lotteryConditionType");
            return (Criteria) this;
        }

        public Criteria andConditionValueIsNull() {
            addCriterion("condition_value is null");
            return (Criteria) this;
        }

        public Criteria andConditionValueIsNotNull() {
            addCriterion("condition_value is not null");
            return (Criteria) this;
        }

        public Criteria andConditionValueEqualTo(String value) {
            addCriterion("condition_value =", value, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueNotEqualTo(String value) {
            addCriterion("condition_value <>", value, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueGreaterThan(String value) {
            addCriterion("condition_value >", value, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueGreaterThanOrEqualTo(String value) {
            addCriterion("condition_value >=", value, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueLessThan(String value) {
            addCriterion("condition_value <", value, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueLessThanOrEqualTo(String value) {
            addCriterion("condition_value <=", value, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueLike(String value) {
            addCriterion("condition_value like", value, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueNotLike(String value) {
            addCriterion("condition_value not like", value, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueIn(List<String> values) {
            addCriterion("condition_value in", values, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueNotIn(List<String> values) {
            addCriterion("condition_value not in", values, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueBetween(String value1, String value2) {
            addCriterion("condition_value between", value1, value2, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andConditionValueNotBetween(String value1, String value2) {
            addCriterion("condition_value not between", value1, value2, "conditionValue");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeIsNull() {
            addCriterion("lottery_times_type is null");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeIsNotNull() {
            addCriterion("lottery_times_type is not null");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeEqualTo(String value) {
            addCriterion("lottery_times_type =", value, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeNotEqualTo(String value) {
            addCriterion("lottery_times_type <>", value, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeGreaterThan(String value) {
            addCriterion("lottery_times_type >", value, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeGreaterThanOrEqualTo(String value) {
            addCriterion("lottery_times_type >=", value, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeLessThan(String value) {
            addCriterion("lottery_times_type <", value, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeLessThanOrEqualTo(String value) {
            addCriterion("lottery_times_type <=", value, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeLike(String value) {
            addCriterion("lottery_times_type like", value, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeNotLike(String value) {
            addCriterion("lottery_times_type not like", value, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeIn(List<String> values) {
            addCriterion("lottery_times_type in", values, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeNotIn(List<String> values) {
            addCriterion("lottery_times_type not in", values, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeBetween(String value1, String value2) {
            addCriterion("lottery_times_type between", value1, value2, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andLotteryTimesTypeNotBetween(String value1, String value2) {
            addCriterion("lottery_times_type not between", value1, value2, "lotteryTimesType");
            return (Criteria) this;
        }

        public Criteria andStartPeriodIsNull() {
            addCriterion("start_period is null");
            return (Criteria) this;
        }

        public Criteria andStartPeriodIsNotNull() {
            addCriterion("start_period is not null");
            return (Criteria) this;
        }

        public Criteria andStartPeriodEqualTo(Integer value) {
            addCriterion("start_period =", value, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andStartPeriodNotEqualTo(Integer value) {
            addCriterion("start_period <>", value, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andStartPeriodGreaterThan(Integer value) {
            addCriterion("start_period >", value, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andStartPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_period >=", value, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andStartPeriodLessThan(Integer value) {
            addCriterion("start_period <", value, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andStartPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("start_period <=", value, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andStartPeriodIn(List<Integer> values) {
            addCriterion("start_period in", values, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andStartPeriodNotIn(List<Integer> values) {
            addCriterion("start_period not in", values, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andStartPeriodBetween(Integer value1, Integer value2) {
            addCriterion("start_period between", value1, value2, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andStartPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("start_period not between", value1, value2, "startPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodIsNull() {
            addCriterion("end_period is null");
            return (Criteria) this;
        }

        public Criteria andEndPeriodIsNotNull() {
            addCriterion("end_period is not null");
            return (Criteria) this;
        }

        public Criteria andEndPeriodEqualTo(Integer value) {
            addCriterion("end_period =", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodNotEqualTo(Integer value) {
            addCriterion("end_period <>", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodGreaterThan(Integer value) {
            addCriterion("end_period >", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_period >=", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodLessThan(Integer value) {
            addCriterion("end_period <", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodLessThanOrEqualTo(Integer value) {
            addCriterion("end_period <=", value, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodIn(List<Integer> values) {
            addCriterion("end_period in", values, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodNotIn(List<Integer> values) {
            addCriterion("end_period not in", values, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodBetween(Integer value1, Integer value2) {
            addCriterion("end_period between", value1, value2, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andEndPeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("end_period not between", value1, value2, "endPeriod");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Long value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Long value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Long value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Long value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Long value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Long> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Long> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Long value1, Long value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Long value1, Long value2) {
            addCriterion("time not between", value1, value2, "time");
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
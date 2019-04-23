package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryActivityExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andLotterTypeIsNull() {
            addCriterion("lotter_type is null");
            return (Criteria) this;
        }

        public Criteria andLotterTypeIsNotNull() {
            addCriterion("lotter_type is not null");
            return (Criteria) this;
        }

        public Criteria andLotterTypeEqualTo(String value) {
            addCriterion("lotter_type =", value, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeNotEqualTo(String value) {
            addCriterion("lotter_type <>", value, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeGreaterThan(String value) {
            addCriterion("lotter_type >", value, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeGreaterThanOrEqualTo(String value) {
            addCriterion("lotter_type >=", value, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeLessThan(String value) {
            addCriterion("lotter_type <", value, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeLessThanOrEqualTo(String value) {
            addCriterion("lotter_type <=", value, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeLike(String value) {
            addCriterion("lotter_type like", value, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeNotLike(String value) {
            addCriterion("lotter_type not like", value, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeIn(List<String> values) {
            addCriterion("lotter_type in", values, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeNotIn(List<String> values) {
            addCriterion("lotter_type not in", values, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeBetween(String value1, String value2) {
            addCriterion("lotter_type between", value1, value2, "lotterType");
            return (Criteria) this;
        }

        public Criteria andLotterTypeNotBetween(String value1, String value2) {
            addCriterion("lotter_type not between", value1, value2, "lotterType");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateIsNull() {
            addCriterion("condition_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateIsNotNull() {
            addCriterion("condition_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateEqualTo(Date value) {
            addCriterion("condition_begin_date =", value, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateNotEqualTo(Date value) {
            addCriterion("condition_begin_date <>", value, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateGreaterThan(Date value) {
            addCriterion("condition_begin_date >", value, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterion("condition_begin_date >=", value, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateLessThan(Date value) {
            addCriterion("condition_begin_date <", value, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateLessThanOrEqualTo(Date value) {
            addCriterion("condition_begin_date <=", value, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateIn(List<Date> values) {
            addCriterion("condition_begin_date in", values, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateNotIn(List<Date> values) {
            addCriterion("condition_begin_date not in", values, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateBetween(Date value1, Date value2) {
            addCriterion("condition_begin_date between", value1, value2, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionBeginDateNotBetween(Date value1, Date value2) {
            addCriterion("condition_begin_date not between", value1, value2, "conditionBeginDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateIsNull() {
            addCriterion("condition_end_date is null");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateIsNotNull() {
            addCriterion("condition_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateEqualTo(Date value) {
            addCriterion("condition_end_date =", value, "conditionEndDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateNotEqualTo(Date value) {
            addCriterion("condition_end_date <>", value, "conditionEndDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateGreaterThan(Date value) {
            addCriterion("condition_end_date >", value, "conditionEndDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("condition_end_date >=", value, "conditionEndDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateLessThan(Date value) {
            addCriterion("condition_end_date <", value, "conditionEndDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateLessThanOrEqualTo(Date value) {
            addCriterion("condition_end_date <=", value, "conditionEndDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateIn(List<Date> values) {
            addCriterion("condition_end_date in", values, "conditionEndDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateNotIn(List<Date> values) {
            addCriterion("condition_end_date not in", values, "conditionEndDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateBetween(Date value1, Date value2) {
            addCriterion("condition_end_date between", value1, value2, "conditionEndDate");
            return (Criteria) this;
        }

        public Criteria andConditionEndDateNotBetween(Date value1, Date value2) {
            addCriterion("condition_end_date not between", value1, value2, "conditionEndDate");
            return (Criteria) this;
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

        public Criteria andPeopleNumIsNull() {
            addCriterion("people_num is null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIsNotNull() {
            addCriterion("people_num is not null");
            return (Criteria) this;
        }

        public Criteria andPeopleNumEqualTo(Long value) {
            addCriterion("people_num =", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotEqualTo(Long value) {
            addCriterion("people_num <>", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThan(Long value) {
            addCriterion("people_num >", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumGreaterThanOrEqualTo(Long value) {
            addCriterion("people_num >=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThan(Long value) {
            addCriterion("people_num <", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumLessThanOrEqualTo(Long value) {
            addCriterion("people_num <=", value, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumIn(List<Long> values) {
            addCriterion("people_num in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotIn(List<Long> values) {
            addCriterion("people_num not in", values, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumBetween(Long value1, Long value2) {
            addCriterion("people_num between", value1, value2, "peopleNum");
            return (Criteria) this;
        }

        public Criteria andPeopleNumNotBetween(Long value1, Long value2) {
            addCriterion("people_num not between", value1, value2, "peopleNum");
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
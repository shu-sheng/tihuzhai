package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonDistrictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonDistrictExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNbNoIsNull() {
            addCriterion("nb_no is null");
            return (Criteria) this;
        }

        public Criteria andNbNoIsNotNull() {
            addCriterion("nb_no is not null");
            return (Criteria) this;
        }

        public Criteria andNbNoEqualTo(String value) {
            addCriterion("nb_no =", value, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoNotEqualTo(String value) {
            addCriterion("nb_no <>", value, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoGreaterThan(String value) {
            addCriterion("nb_no >", value, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoGreaterThanOrEqualTo(String value) {
            addCriterion("nb_no >=", value, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoLessThan(String value) {
            addCriterion("nb_no <", value, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoLessThanOrEqualTo(String value) {
            addCriterion("nb_no <=", value, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoLike(String value) {
            addCriterion("nb_no like", value, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoNotLike(String value) {
            addCriterion("nb_no not like", value, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoIn(List<String> values) {
            addCriterion("nb_no in", values, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoNotIn(List<String> values) {
            addCriterion("nb_no not in", values, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoBetween(String value1, String value2) {
            addCriterion("nb_no between", value1, value2, "nbNo");
            return (Criteria) this;
        }

        public Criteria andNbNoNotBetween(String value1, String value2) {
            addCriterion("nb_no not between", value1, value2, "nbNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoIsNull() {
            addCriterion("father_no is null");
            return (Criteria) this;
        }

        public Criteria andFatherNoIsNotNull() {
            addCriterion("father_no is not null");
            return (Criteria) this;
        }

        public Criteria andFatherNoEqualTo(String value) {
            addCriterion("father_no =", value, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoNotEqualTo(String value) {
            addCriterion("father_no <>", value, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoGreaterThan(String value) {
            addCriterion("father_no >", value, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoGreaterThanOrEqualTo(String value) {
            addCriterion("father_no >=", value, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoLessThan(String value) {
            addCriterion("father_no <", value, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoLessThanOrEqualTo(String value) {
            addCriterion("father_no <=", value, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoLike(String value) {
            addCriterion("father_no like", value, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoNotLike(String value) {
            addCriterion("father_no not like", value, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoIn(List<String> values) {
            addCriterion("father_no in", values, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoNotIn(List<String> values) {
            addCriterion("father_no not in", values, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoBetween(String value1, String value2) {
            addCriterion("father_no between", value1, value2, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andFatherNoNotBetween(String value1, String value2) {
            addCriterion("father_no not between", value1, value2, "fatherNo");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNull() {
            addCriterion("area_name is null");
            return (Criteria) this;
        }

        public Criteria andAreaNameIsNotNull() {
            addCriterion("area_name is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("area_name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotEqualTo(String value) {
            addCriterion("area_name <>", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThan(String value) {
            addCriterion("area_name >", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("area_name >=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThan(String value) {
            addCriterion("area_name <", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLessThanOrEqualTo(String value) {
            addCriterion("area_name <=", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("area_name like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotLike(String value) {
            addCriterion("area_name not like", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameIn(List<String> values) {
            addCriterion("area_name in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotIn(List<String> values) {
            addCriterion("area_name not in", values, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameBetween(String value1, String value2) {
            addCriterion("area_name between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameNotBetween(String value1, String value2) {
            addCriterion("area_name not between", value1, value2, "areaName");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNull() {
            addCriterion("short_name is null");
            return (Criteria) this;
        }

        public Criteria andShortNameIsNotNull() {
            addCriterion("short_name is not null");
            return (Criteria) this;
        }

        public Criteria andShortNameEqualTo(String value) {
            addCriterion("short_name =", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotEqualTo(String value) {
            addCriterion("short_name <>", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThan(String value) {
            addCriterion("short_name >", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("short_name >=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThan(String value) {
            addCriterion("short_name <", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLessThanOrEqualTo(String value) {
            addCriterion("short_name <=", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameLike(String value) {
            addCriterion("short_name like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotLike(String value) {
            addCriterion("short_name not like", value, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameIn(List<String> values) {
            addCriterion("short_name in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotIn(List<String> values) {
            addCriterion("short_name not in", values, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameBetween(String value1, String value2) {
            addCriterion("short_name between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andShortNameNotBetween(String value1, String value2) {
            addCriterion("short_name not between", value1, value2, "shortName");
            return (Criteria) this;
        }

        public Criteria andAreaPyIsNull() {
            addCriterion("area_py is null");
            return (Criteria) this;
        }

        public Criteria andAreaPyIsNotNull() {
            addCriterion("area_py is not null");
            return (Criteria) this;
        }

        public Criteria andAreaPyEqualTo(String value) {
            addCriterion("area_py =", value, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyNotEqualTo(String value) {
            addCriterion("area_py <>", value, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyGreaterThan(String value) {
            addCriterion("area_py >", value, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyGreaterThanOrEqualTo(String value) {
            addCriterion("area_py >=", value, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyLessThan(String value) {
            addCriterion("area_py <", value, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyLessThanOrEqualTo(String value) {
            addCriterion("area_py <=", value, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyLike(String value) {
            addCriterion("area_py like", value, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyNotLike(String value) {
            addCriterion("area_py not like", value, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyIn(List<String> values) {
            addCriterion("area_py in", values, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyNotIn(List<String> values) {
            addCriterion("area_py not in", values, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyBetween(String value1, String value2) {
            addCriterion("area_py between", value1, value2, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaPyNotBetween(String value1, String value2) {
            addCriterion("area_py not between", value1, value2, "areaPy");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaIsNull() {
            addCriterion("area_nagda is null");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaIsNotNull() {
            addCriterion("area_nagda is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaEqualTo(String value) {
            addCriterion("area_nagda =", value, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaNotEqualTo(String value) {
            addCriterion("area_nagda <>", value, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaGreaterThan(String value) {
            addCriterion("area_nagda >", value, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaGreaterThanOrEqualTo(String value) {
            addCriterion("area_nagda >=", value, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaLessThan(String value) {
            addCriterion("area_nagda <", value, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaLessThanOrEqualTo(String value) {
            addCriterion("area_nagda <=", value, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaLike(String value) {
            addCriterion("area_nagda like", value, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaNotLike(String value) {
            addCriterion("area_nagda not like", value, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaIn(List<String> values) {
            addCriterion("area_nagda in", values, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaNotIn(List<String> values) {
            addCriterion("area_nagda not in", values, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaBetween(String value1, String value2) {
            addCriterion("area_nagda between", value1, value2, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andAreaNagdaNotBetween(String value1, String value2) {
            addCriterion("area_nagda not between", value1, value2, "areaNagda");
            return (Criteria) this;
        }

        public Criteria andCnapsIsNull() {
            addCriterion("cnaps is null");
            return (Criteria) this;
        }

        public Criteria andCnapsIsNotNull() {
            addCriterion("cnaps is not null");
            return (Criteria) this;
        }

        public Criteria andCnapsEqualTo(String value) {
            addCriterion("cnaps =", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotEqualTo(String value) {
            addCriterion("cnaps <>", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsGreaterThan(String value) {
            addCriterion("cnaps >", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsGreaterThanOrEqualTo(String value) {
            addCriterion("cnaps >=", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsLessThan(String value) {
            addCriterion("cnaps <", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsLessThanOrEqualTo(String value) {
            addCriterion("cnaps <=", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsLike(String value) {
            addCriterion("cnaps like", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotLike(String value) {
            addCriterion("cnaps not like", value, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsIn(List<String> values) {
            addCriterion("cnaps in", values, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotIn(List<String> values) {
            addCriterion("cnaps not in", values, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsBetween(String value1, String value2) {
            addCriterion("cnaps between", value1, value2, "cnaps");
            return (Criteria) this;
        }

        public Criteria andCnapsNotBetween(String value1, String value2) {
            addCriterion("cnaps not between", value1, value2, "cnaps");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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
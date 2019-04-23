package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommonBranchInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommonBranchInfoExample() {
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

        public Criteria andBankLasalleIsNull() {
            addCriterion("bank_lasalle is null");
            return (Criteria) this;
        }

        public Criteria andBankLasalleIsNotNull() {
            addCriterion("bank_lasalle is not null");
            return (Criteria) this;
        }

        public Criteria andBankLasalleEqualTo(String value) {
            addCriterion("bank_lasalle =", value, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleNotEqualTo(String value) {
            addCriterion("bank_lasalle <>", value, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleGreaterThan(String value) {
            addCriterion("bank_lasalle >", value, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleGreaterThanOrEqualTo(String value) {
            addCriterion("bank_lasalle >=", value, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleLessThan(String value) {
            addCriterion("bank_lasalle <", value, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleLessThanOrEqualTo(String value) {
            addCriterion("bank_lasalle <=", value, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleLike(String value) {
            addCriterion("bank_lasalle like", value, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleNotLike(String value) {
            addCriterion("bank_lasalle not like", value, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleIn(List<String> values) {
            addCriterion("bank_lasalle in", values, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleNotIn(List<String> values) {
            addCriterion("bank_lasalle not in", values, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleBetween(String value1, String value2) {
            addCriterion("bank_lasalle between", value1, value2, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBankLasalleNotBetween(String value1, String value2) {
            addCriterion("bank_lasalle not between", value1, value2, "bankLasalle");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNull() {
            addCriterion("branch_name is null");
            return (Criteria) this;
        }

        public Criteria andBranchNameIsNotNull() {
            addCriterion("branch_name is not null");
            return (Criteria) this;
        }

        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("branch_name =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotEqualTo(String value) {
            addCriterion("branch_name <>", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThan(String value) {
            addCriterion("branch_name >", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameGreaterThanOrEqualTo(String value) {
            addCriterion("branch_name >=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThan(String value) {
            addCriterion("branch_name <", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLessThanOrEqualTo(String value) {
            addCriterion("branch_name <=", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLike(String value) {
            addCriterion("branch_name like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotLike(String value) {
            addCriterion("branch_name not like", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameIn(List<String> values) {
            addCriterion("branch_name in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotIn(List<String> values) {
            addCriterion("branch_name not in", values, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameBetween(String value1, String value2) {
            addCriterion("branch_name between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameNotBetween(String value1, String value2) {
            addCriterion("branch_name not between", value1, value2, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoIsNull() {
            addCriterion("branch_district_no is null");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoIsNotNull() {
            addCriterion("branch_district_no is not null");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoEqualTo(String value) {
            addCriterion("branch_district_no =", value, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoNotEqualTo(String value) {
            addCriterion("branch_district_no <>", value, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoGreaterThan(String value) {
            addCriterion("branch_district_no >", value, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoGreaterThanOrEqualTo(String value) {
            addCriterion("branch_district_no >=", value, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoLessThan(String value) {
            addCriterion("branch_district_no <", value, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoLessThanOrEqualTo(String value) {
            addCriterion("branch_district_no <=", value, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoLike(String value) {
            addCriterion("branch_district_no like", value, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoNotLike(String value) {
            addCriterion("branch_district_no not like", value, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoIn(List<String> values) {
            addCriterion("branch_district_no in", values, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoNotIn(List<String> values) {
            addCriterion("branch_district_no not in", values, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoBetween(String value1, String value2) {
            addCriterion("branch_district_no between", value1, value2, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBranchDistrictNoNotBetween(String value1, String value2) {
            addCriterion("branch_district_no not between", value1, value2, "branchDistrictNo");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("bank_id is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("bank_id is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("bank_id =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("bank_id <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("bank_id >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("bank_id >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("bank_id <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("bank_id <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("bank_id like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("bank_id not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("bank_id in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("bank_id not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("bank_id between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("bank_id not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagIsNull() {
            addCriterion("branch_bank_flag is null");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagIsNotNull() {
            addCriterion("branch_bank_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagEqualTo(String value) {
            addCriterion("branch_bank_flag =", value, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagNotEqualTo(String value) {
            addCriterion("branch_bank_flag <>", value, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagGreaterThan(String value) {
            addCriterion("branch_bank_flag >", value, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagGreaterThanOrEqualTo(String value) {
            addCriterion("branch_bank_flag >=", value, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagLessThan(String value) {
            addCriterion("branch_bank_flag <", value, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagLessThanOrEqualTo(String value) {
            addCriterion("branch_bank_flag <=", value, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagLike(String value) {
            addCriterion("branch_bank_flag like", value, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagNotLike(String value) {
            addCriterion("branch_bank_flag not like", value, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagIn(List<String> values) {
            addCriterion("branch_bank_flag in", values, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagNotIn(List<String> values) {
            addCriterion("branch_bank_flag not in", values, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagBetween(String value1, String value2) {
            addCriterion("branch_bank_flag between", value1, value2, "branchBankFlag");
            return (Criteria) this;
        }

        public Criteria andBranchBankFlagNotBetween(String value1, String value2) {
            addCriterion("branch_bank_flag not between", value1, value2, "branchBankFlag");
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

        public Criteria andBankAdressIsNull() {
            addCriterion("bank_adress is null");
            return (Criteria) this;
        }

        public Criteria andBankAdressIsNotNull() {
            addCriterion("bank_adress is not null");
            return (Criteria) this;
        }

        public Criteria andBankAdressEqualTo(String value) {
            addCriterion("bank_adress =", value, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressNotEqualTo(String value) {
            addCriterion("bank_adress <>", value, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressGreaterThan(String value) {
            addCriterion("bank_adress >", value, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_adress >=", value, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressLessThan(String value) {
            addCriterion("bank_adress <", value, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressLessThanOrEqualTo(String value) {
            addCriterion("bank_adress <=", value, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressLike(String value) {
            addCriterion("bank_adress like", value, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressNotLike(String value) {
            addCriterion("bank_adress not like", value, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressIn(List<String> values) {
            addCriterion("bank_adress in", values, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressNotIn(List<String> values) {
            addCriterion("bank_adress not in", values, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressBetween(String value1, String value2) {
            addCriterion("bank_adress between", value1, value2, "bankAdress");
            return (Criteria) this;
        }

        public Criteria andBankAdressNotBetween(String value1, String value2) {
            addCriterion("bank_adress not between", value1, value2, "bankAdress");
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
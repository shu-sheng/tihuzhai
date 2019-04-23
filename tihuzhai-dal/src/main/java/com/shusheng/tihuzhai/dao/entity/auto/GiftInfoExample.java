package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GiftInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GiftInfoExample() {
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

        public Criteria andTblBaseIdIsNull() {
            addCriterion("tbl_base_id is null");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdIsNotNull() {
            addCriterion("tbl_base_id is not null");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdEqualTo(Long value) {
            addCriterion("tbl_base_id =", value, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdNotEqualTo(Long value) {
            addCriterion("tbl_base_id <>", value, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdGreaterThan(Long value) {
            addCriterion("tbl_base_id >", value, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("tbl_base_id >=", value, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdLessThan(Long value) {
            addCriterion("tbl_base_id <", value, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdLessThanOrEqualTo(Long value) {
            addCriterion("tbl_base_id <=", value, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdIn(List<Long> values) {
            addCriterion("tbl_base_id in", values, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdNotIn(List<Long> values) {
            addCriterion("tbl_base_id not in", values, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdBetween(Long value1, Long value2) {
            addCriterion("tbl_base_id between", value1, value2, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andTblBaseIdNotBetween(Long value1, Long value2) {
            addCriterion("tbl_base_id not between", value1, value2, "tblBaseId");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNull() {
            addCriterion("gift_name is null");
            return (Criteria) this;
        }

        public Criteria andGiftNameIsNotNull() {
            addCriterion("gift_name is not null");
            return (Criteria) this;
        }

        public Criteria andGiftNameEqualTo(String value) {
            addCriterion("gift_name =", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotEqualTo(String value) {
            addCriterion("gift_name <>", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThan(String value) {
            addCriterion("gift_name >", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameGreaterThanOrEqualTo(String value) {
            addCriterion("gift_name >=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThan(String value) {
            addCriterion("gift_name <", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLessThanOrEqualTo(String value) {
            addCriterion("gift_name <=", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameLike(String value) {
            addCriterion("gift_name like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotLike(String value) {
            addCriterion("gift_name not like", value, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameIn(List<String> values) {
            addCriterion("gift_name in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotIn(List<String> values) {
            addCriterion("gift_name not in", values, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameBetween(String value1, String value2) {
            addCriterion("gift_name between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftNameNotBetween(String value1, String value2) {
            addCriterion("gift_name not between", value1, value2, "giftName");
            return (Criteria) this;
        }

        public Criteria andGiftCodeIsNull() {
            addCriterion("gift_code is null");
            return (Criteria) this;
        }

        public Criteria andGiftCodeIsNotNull() {
            addCriterion("gift_code is not null");
            return (Criteria) this;
        }

        public Criteria andGiftCodeEqualTo(String value) {
            addCriterion("gift_code =", value, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeNotEqualTo(String value) {
            addCriterion("gift_code <>", value, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeGreaterThan(String value) {
            addCriterion("gift_code >", value, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeGreaterThanOrEqualTo(String value) {
            addCriterion("gift_code >=", value, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeLessThan(String value) {
            addCriterion("gift_code <", value, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeLessThanOrEqualTo(String value) {
            addCriterion("gift_code <=", value, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeLike(String value) {
            addCriterion("gift_code like", value, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeNotLike(String value) {
            addCriterion("gift_code not like", value, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeIn(List<String> values) {
            addCriterion("gift_code in", values, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeNotIn(List<String> values) {
            addCriterion("gift_code not in", values, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeBetween(String value1, String value2) {
            addCriterion("gift_code between", value1, value2, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftCodeNotBetween(String value1, String value2) {
            addCriterion("gift_code not between", value1, value2, "giftCode");
            return (Criteria) this;
        }

        public Criteria andGiftTypeIsNull() {
            addCriterion("gift_type is null");
            return (Criteria) this;
        }

        public Criteria andGiftTypeIsNotNull() {
            addCriterion("gift_type is not null");
            return (Criteria) this;
        }

        public Criteria andGiftTypeEqualTo(String value) {
            addCriterion("gift_type =", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeNotEqualTo(String value) {
            addCriterion("gift_type <>", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeGreaterThan(String value) {
            addCriterion("gift_type >", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeGreaterThanOrEqualTo(String value) {
            addCriterion("gift_type >=", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeLessThan(String value) {
            addCriterion("gift_type <", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeLessThanOrEqualTo(String value) {
            addCriterion("gift_type <=", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeLike(String value) {
            addCriterion("gift_type like", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeNotLike(String value) {
            addCriterion("gift_type not like", value, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeIn(List<String> values) {
            addCriterion("gift_type in", values, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeNotIn(List<String> values) {
            addCriterion("gift_type not in", values, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeBetween(String value1, String value2) {
            addCriterion("gift_type between", value1, value2, "giftType");
            return (Criteria) this;
        }

        public Criteria andGiftTypeNotBetween(String value1, String value2) {
            addCriterion("gift_type not between", value1, value2, "giftType");
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

        public Criteria andGiftStatusIsNull() {
            addCriterion("gift_status is null");
            return (Criteria) this;
        }

        public Criteria andGiftStatusIsNotNull() {
            addCriterion("gift_status is not null");
            return (Criteria) this;
        }

        public Criteria andGiftStatusEqualTo(Byte value) {
            addCriterion("gift_status =", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotEqualTo(Byte value) {
            addCriterion("gift_status <>", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusGreaterThan(Byte value) {
            addCriterion("gift_status >", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("gift_status >=", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusLessThan(Byte value) {
            addCriterion("gift_status <", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusLessThanOrEqualTo(Byte value) {
            addCriterion("gift_status <=", value, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusIn(List<Byte> values) {
            addCriterion("gift_status in", values, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotIn(List<Byte> values) {
            addCriterion("gift_status not in", values, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusBetween(Byte value1, Byte value2) {
            addCriterion("gift_status between", value1, value2, "giftStatus");
            return (Criteria) this;
        }

        public Criteria andGiftStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("gift_status not between", value1, value2, "giftStatus");
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
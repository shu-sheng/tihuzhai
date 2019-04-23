package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class HiSharedImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiSharedImgExample() {
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

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCounttyNameIsNull() {
            addCriterion("countty_name is null");
            return (Criteria) this;
        }

        public Criteria andCounttyNameIsNotNull() {
            addCriterion("countty_name is not null");
            return (Criteria) this;
        }

        public Criteria andCounttyNameEqualTo(String value) {
            addCriterion("countty_name =", value, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameNotEqualTo(String value) {
            addCriterion("countty_name <>", value, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameGreaterThan(String value) {
            addCriterion("countty_name >", value, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameGreaterThanOrEqualTo(String value) {
            addCriterion("countty_name >=", value, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameLessThan(String value) {
            addCriterion("countty_name <", value, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameLessThanOrEqualTo(String value) {
            addCriterion("countty_name <=", value, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameLike(String value) {
            addCriterion("countty_name like", value, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameNotLike(String value) {
            addCriterion("countty_name not like", value, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameIn(List<String> values) {
            addCriterion("countty_name in", values, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameNotIn(List<String> values) {
            addCriterion("countty_name not in", values, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameBetween(String value1, String value2) {
            addCriterion("countty_name between", value1, value2, "counttyName");
            return (Criteria) this;
        }

        public Criteria andCounttyNameNotBetween(String value1, String value2) {
            addCriterion("countty_name not between", value1, value2, "counttyName");
            return (Criteria) this;
        }

        public Criteria andSharedTypeIsNull() {
            addCriterion("shared_type is null");
            return (Criteria) this;
        }

        public Criteria andSharedTypeIsNotNull() {
            addCriterion("shared_type is not null");
            return (Criteria) this;
        }

        public Criteria andSharedTypeEqualTo(String value) {
            addCriterion("shared_type =", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeNotEqualTo(String value) {
            addCriterion("shared_type <>", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeGreaterThan(String value) {
            addCriterion("shared_type >", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeGreaterThanOrEqualTo(String value) {
            addCriterion("shared_type >=", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeLessThan(String value) {
            addCriterion("shared_type <", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeLessThanOrEqualTo(String value) {
            addCriterion("shared_type <=", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeLike(String value) {
            addCriterion("shared_type like", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeNotLike(String value) {
            addCriterion("shared_type not like", value, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeIn(List<String> values) {
            addCriterion("shared_type in", values, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeNotIn(List<String> values) {
            addCriterion("shared_type not in", values, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeBetween(String value1, String value2) {
            addCriterion("shared_type between", value1, value2, "sharedType");
            return (Criteria) this;
        }

        public Criteria andSharedTypeNotBetween(String value1, String value2) {
            addCriterion("shared_type not between", value1, value2, "sharedType");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlEqualTo(String value) {
            addCriterion("img_url =", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThan(String value) {
            addCriterion("img_url >", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThan(String value) {
            addCriterion("img_url <", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlLike(String value) {
            addCriterion("img_url like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotLike(String value) {
            addCriterion("img_url not like", value, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlIn(List<String> values) {
            addCriterion("img_url in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "imgUrl");
            return (Criteria) this;
        }

        public Criteria andImgUrlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "imgUrl");
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
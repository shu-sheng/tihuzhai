package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiUserUnlockedMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiUserUnlockedMaterialExample() {
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

        public Criteria andMaterialIdIsNull() {
            addCriterion("material_id is null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIsNotNull() {
            addCriterion("material_id is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialIdEqualTo(Long value) {
            addCriterion("material_id =", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotEqualTo(Long value) {
            addCriterion("material_id <>", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThan(Long value) {
            addCriterion("material_id >", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdGreaterThanOrEqualTo(Long value) {
            addCriterion("material_id >=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThan(Long value) {
            addCriterion("material_id <", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdLessThanOrEqualTo(Long value) {
            addCriterion("material_id <=", value, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdIn(List<Long> values) {
            addCriterion("material_id in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotIn(List<Long> values) {
            addCriterion("material_id not in", values, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdBetween(Long value1, Long value2) {
            addCriterion("material_id between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialIdNotBetween(Long value1, Long value2) {
            addCriterion("material_id not between", value1, value2, "materialId");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNull() {
            addCriterion("material_no is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIsNotNull() {
            addCriterion("material_no is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNoEqualTo(String value) {
            addCriterion("material_no =", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotEqualTo(String value) {
            addCriterion("material_no <>", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThan(String value) {
            addCriterion("material_no >", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoGreaterThanOrEqualTo(String value) {
            addCriterion("material_no >=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThan(String value) {
            addCriterion("material_no <", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLessThanOrEqualTo(String value) {
            addCriterion("material_no <=", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoLike(String value) {
            addCriterion("material_no like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotLike(String value) {
            addCriterion("material_no not like", value, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoIn(List<String> values) {
            addCriterion("material_no in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotIn(List<String> values) {
            addCriterion("material_no not in", values, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoBetween(String value1, String value2) {
            addCriterion("material_no between", value1, value2, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNoNotBetween(String value1, String value2) {
            addCriterion("material_no not between", value1, value2, "materialNo");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNull() {
            addCriterion("material_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIsNotNull() {
            addCriterion("material_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialNameEqualTo(String value) {
            addCriterion("material_name =", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotEqualTo(String value) {
            addCriterion("material_name <>", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThan(String value) {
            addCriterion("material_name >", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_name >=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThan(String value) {
            addCriterion("material_name <", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("material_name <=", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameLike(String value) {
            addCriterion("material_name like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotLike(String value) {
            addCriterion("material_name not like", value, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameIn(List<String> values) {
            addCriterion("material_name in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotIn(List<String> values) {
            addCriterion("material_name not in", values, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameBetween(String value1, String value2) {
            addCriterion("material_name between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialNameNotBetween(String value1, String value2) {
            addCriterion("material_name not between", value1, value2, "materialName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeIsNull() {
            addCriterion("material_type_code is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeIsNotNull() {
            addCriterion("material_type_code is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeEqualTo(String value) {
            addCriterion("material_type_code =", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeNotEqualTo(String value) {
            addCriterion("material_type_code <>", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeGreaterThan(String value) {
            addCriterion("material_type_code >", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("material_type_code >=", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeLessThan(String value) {
            addCriterion("material_type_code <", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("material_type_code <=", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeLike(String value) {
            addCriterion("material_type_code like", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeNotLike(String value) {
            addCriterion("material_type_code not like", value, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeIn(List<String> values) {
            addCriterion("material_type_code in", values, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeNotIn(List<String> values) {
            addCriterion("material_type_code not in", values, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeBetween(String value1, String value2) {
            addCriterion("material_type_code between", value1, value2, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeCodeNotBetween(String value1, String value2) {
            addCriterion("material_type_code not between", value1, value2, "materialTypeCode");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameIsNull() {
            addCriterion("material_type_name is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameIsNotNull() {
            addCriterion("material_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameEqualTo(String value) {
            addCriterion("material_type_name =", value, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameNotEqualTo(String value) {
            addCriterion("material_type_name <>", value, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameGreaterThan(String value) {
            addCriterion("material_type_name >", value, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("material_type_name >=", value, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameLessThan(String value) {
            addCriterion("material_type_name <", value, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameLessThanOrEqualTo(String value) {
            addCriterion("material_type_name <=", value, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameLike(String value) {
            addCriterion("material_type_name like", value, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameNotLike(String value) {
            addCriterion("material_type_name not like", value, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameIn(List<String> values) {
            addCriterion("material_type_name in", values, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameNotIn(List<String> values) {
            addCriterion("material_type_name not in", values, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameBetween(String value1, String value2) {
            addCriterion("material_type_name between", value1, value2, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNameNotBetween(String value1, String value2) {
            addCriterion("material_type_name not between", value1, value2, "materialTypeName");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeIsNull() {
            addCriterion("unlock_type is null");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeIsNotNull() {
            addCriterion("unlock_type is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeEqualTo(String value) {
            addCriterion("unlock_type =", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeNotEqualTo(String value) {
            addCriterion("unlock_type <>", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeGreaterThan(String value) {
            addCriterion("unlock_type >", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("unlock_type >=", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeLessThan(String value) {
            addCriterion("unlock_type <", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeLessThanOrEqualTo(String value) {
            addCriterion("unlock_type <=", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeLike(String value) {
            addCriterion("unlock_type like", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeNotLike(String value) {
            addCriterion("unlock_type not like", value, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeIn(List<String> values) {
            addCriterion("unlock_type in", values, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeNotIn(List<String> values) {
            addCriterion("unlock_type not in", values, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeBetween(String value1, String value2) {
            addCriterion("unlock_type between", value1, value2, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockTypeNotBetween(String value1, String value2) {
            addCriterion("unlock_type not between", value1, value2, "unlockType");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceIsNull() {
            addCriterion("unlock_price is null");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceIsNotNull() {
            addCriterion("unlock_price is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceEqualTo(String value) {
            addCriterion("unlock_price =", value, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceNotEqualTo(String value) {
            addCriterion("unlock_price <>", value, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceGreaterThan(String value) {
            addCriterion("unlock_price >", value, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceGreaterThanOrEqualTo(String value) {
            addCriterion("unlock_price >=", value, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceLessThan(String value) {
            addCriterion("unlock_price <", value, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceLessThanOrEqualTo(String value) {
            addCriterion("unlock_price <=", value, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceLike(String value) {
            addCriterion("unlock_price like", value, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceNotLike(String value) {
            addCriterion("unlock_price not like", value, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceIn(List<String> values) {
            addCriterion("unlock_price in", values, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceNotIn(List<String> values) {
            addCriterion("unlock_price not in", values, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceBetween(String value1, String value2) {
            addCriterion("unlock_price between", value1, value2, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockPriceNotBetween(String value1, String value2) {
            addCriterion("unlock_price not between", value1, value2, "unlockPrice");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeIsNull() {
            addCriterion("unlock_time is null");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeIsNotNull() {
            addCriterion("unlock_time is not null");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeEqualTo(Date value) {
            addCriterion("unlock_time =", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeNotEqualTo(Date value) {
            addCriterion("unlock_time <>", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeGreaterThan(Date value) {
            addCriterion("unlock_time >", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("unlock_time >=", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeLessThan(Date value) {
            addCriterion("unlock_time <", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeLessThanOrEqualTo(Date value) {
            addCriterion("unlock_time <=", value, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeIn(List<Date> values) {
            addCriterion("unlock_time in", values, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeNotIn(List<Date> values) {
            addCriterion("unlock_time not in", values, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeBetween(Date value1, Date value2) {
            addCriterion("unlock_time between", value1, value2, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andUnlockTimeNotBetween(Date value1, Date value2) {
            addCriterion("unlock_time not between", value1, value2, "unlockTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeIsNull() {
            addCriterion("exp_time is null");
            return (Criteria) this;
        }

        public Criteria andExpTimeIsNotNull() {
            addCriterion("exp_time is not null");
            return (Criteria) this;
        }

        public Criteria andExpTimeEqualTo(Date value) {
            addCriterion("exp_time =", value, "expTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeNotEqualTo(Date value) {
            addCriterion("exp_time <>", value, "expTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeGreaterThan(Date value) {
            addCriterion("exp_time >", value, "expTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("exp_time >=", value, "expTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeLessThan(Date value) {
            addCriterion("exp_time <", value, "expTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeLessThanOrEqualTo(Date value) {
            addCriterion("exp_time <=", value, "expTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeIn(List<Date> values) {
            addCriterion("exp_time in", values, "expTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeNotIn(List<Date> values) {
            addCriterion("exp_time not in", values, "expTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeBetween(Date value1, Date value2) {
            addCriterion("exp_time between", value1, value2, "expTime");
            return (Criteria) this;
        }

        public Criteria andExpTimeNotBetween(Date value1, Date value2) {
            addCriterion("exp_time not between", value1, value2, "expTime");
            return (Criteria) this;
        }

        public Criteria andTopIsNull() {
            addCriterion("top is null");
            return (Criteria) this;
        }

        public Criteria andTopIsNotNull() {
            addCriterion("top is not null");
            return (Criteria) this;
        }

        public Criteria andTopEqualTo(String value) {
            addCriterion("top =", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotEqualTo(String value) {
            addCriterion("top <>", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThan(String value) {
            addCriterion("top >", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThanOrEqualTo(String value) {
            addCriterion("top >=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThan(String value) {
            addCriterion("top <", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThanOrEqualTo(String value) {
            addCriterion("top <=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLike(String value) {
            addCriterion("top like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotLike(String value) {
            addCriterion("top not like", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopIn(List<String> values) {
            addCriterion("top in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotIn(List<String> values) {
            addCriterion("top not in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopBetween(String value1, String value2) {
            addCriterion("top between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotBetween(String value1, String value2) {
            addCriterion("top not between", value1, value2, "top");
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

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIsNull() {
            addCriterion("row_add_time is null");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIsNotNull() {
            addCriterion("row_add_time is not null");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeEqualTo(Date value) {
            addCriterion("row_add_time =", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotEqualTo(Date value) {
            addCriterion("row_add_time <>", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeGreaterThan(Date value) {
            addCriterion("row_add_time >", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("row_add_time >=", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeLessThan(Date value) {
            addCriterion("row_add_time <", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("row_add_time <=", value, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeIn(List<Date> values) {
            addCriterion("row_add_time in", values, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotIn(List<Date> values) {
            addCriterion("row_add_time not in", values, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeBetween(Date value1, Date value2) {
            addCriterion("row_add_time between", value1, value2, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("row_add_time not between", value1, value2, "rowAddTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIsNull() {
            addCriterion("row_update_time is null");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIsNotNull() {
            addCriterion("row_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeEqualTo(Date value) {
            addCriterion("row_update_time =", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotEqualTo(Date value) {
            addCriterion("row_update_time <>", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeGreaterThan(Date value) {
            addCriterion("row_update_time >", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("row_update_time >=", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeLessThan(Date value) {
            addCriterion("row_update_time <", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("row_update_time <=", value, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeIn(List<Date> values) {
            addCriterion("row_update_time in", values, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotIn(List<Date> values) {
            addCriterion("row_update_time not in", values, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("row_update_time between", value1, value2, "rowUpdateTime");
            return (Criteria) this;
        }

        public Criteria andRowUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("row_update_time not between", value1, value2, "rowUpdateTime");
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
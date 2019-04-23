package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiTeachingMaterialExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiTeachingMaterialExample() {
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

        public Criteria andTeachingMaterialNoIsNull() {
            addCriterion("teaching_material_no is null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoIsNotNull() {
            addCriterion("teaching_material_no is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoEqualTo(String value) {
            addCriterion("teaching_material_no =", value, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoNotEqualTo(String value) {
            addCriterion("teaching_material_no <>", value, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoGreaterThan(String value) {
            addCriterion("teaching_material_no >", value, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_material_no >=", value, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoLessThan(String value) {
            addCriterion("teaching_material_no <", value, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoLessThanOrEqualTo(String value) {
            addCriterion("teaching_material_no <=", value, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoLike(String value) {
            addCriterion("teaching_material_no like", value, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoNotLike(String value) {
            addCriterion("teaching_material_no not like", value, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoIn(List<String> values) {
            addCriterion("teaching_material_no in", values, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoNotIn(List<String> values) {
            addCriterion("teaching_material_no not in", values, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoBetween(String value1, String value2) {
            addCriterion("teaching_material_no between", value1, value2, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNoNotBetween(String value1, String value2) {
            addCriterion("teaching_material_no not between", value1, value2, "teachingMaterialNo");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameIsNull() {
            addCriterion("teaching_material_name is null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameIsNotNull() {
            addCriterion("teaching_material_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameEqualTo(String value) {
            addCriterion("teaching_material_name =", value, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameNotEqualTo(String value) {
            addCriterion("teaching_material_name <>", value, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameGreaterThan(String value) {
            addCriterion("teaching_material_name >", value, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_material_name >=", value, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameLessThan(String value) {
            addCriterion("teaching_material_name <", value, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameLessThanOrEqualTo(String value) {
            addCriterion("teaching_material_name <=", value, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameLike(String value) {
            addCriterion("teaching_material_name like", value, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameNotLike(String value) {
            addCriterion("teaching_material_name not like", value, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameIn(List<String> values) {
            addCriterion("teaching_material_name in", values, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameNotIn(List<String> values) {
            addCriterion("teaching_material_name not in", values, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameBetween(String value1, String value2) {
            addCriterion("teaching_material_name between", value1, value2, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialNameNotBetween(String value1, String value2) {
            addCriterion("teaching_material_name not between", value1, value2, "teachingMaterialName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdIsNull() {
            addCriterion("teaching_material_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdIsNotNull() {
            addCriterion("teaching_material_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdEqualTo(Long value) {
            addCriterion("teaching_material_type_id =", value, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdNotEqualTo(Long value) {
            addCriterion("teaching_material_type_id <>", value, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdGreaterThan(Long value) {
            addCriterion("teaching_material_type_id >", value, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("teaching_material_type_id >=", value, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdLessThan(Long value) {
            addCriterion("teaching_material_type_id <", value, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("teaching_material_type_id <=", value, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdIn(List<Long> values) {
            addCriterion("teaching_material_type_id in", values, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdNotIn(List<Long> values) {
            addCriterion("teaching_material_type_id not in", values, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdBetween(Long value1, Long value2) {
            addCriterion("teaching_material_type_id between", value1, value2, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("teaching_material_type_id not between", value1, value2, "teachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameIsNull() {
            addCriterion("teaching_material_type_name is null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameIsNotNull() {
            addCriterion("teaching_material_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameEqualTo(String value) {
            addCriterion("teaching_material_type_name =", value, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameNotEqualTo(String value) {
            addCriterion("teaching_material_type_name <>", value, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameGreaterThan(String value) {
            addCriterion("teaching_material_type_name >", value, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_material_type_name >=", value, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameLessThan(String value) {
            addCriterion("teaching_material_type_name <", value, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameLessThanOrEqualTo(String value) {
            addCriterion("teaching_material_type_name <=", value, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameLike(String value) {
            addCriterion("teaching_material_type_name like", value, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameNotLike(String value) {
            addCriterion("teaching_material_type_name not like", value, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameIn(List<String> values) {
            addCriterion("teaching_material_type_name in", values, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameNotIn(List<String> values) {
            addCriterion("teaching_material_type_name not in", values, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameBetween(String value1, String value2) {
            addCriterion("teaching_material_type_name between", value1, value2, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialTypeNameNotBetween(String value1, String value2) {
            addCriterion("teaching_material_type_name not between", value1, value2, "teachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSellPriceIsNull() {
            addCriterion("sell_price is null");
            return (Criteria) this;
        }

        public Criteria andSellPriceIsNotNull() {
            addCriterion("sell_price is not null");
            return (Criteria) this;
        }

        public Criteria andSellPriceEqualTo(String value) {
            addCriterion("sell_price =", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceNotEqualTo(String value) {
            addCriterion("sell_price <>", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceGreaterThan(String value) {
            addCriterion("sell_price >", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceGreaterThanOrEqualTo(String value) {
            addCriterion("sell_price >=", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceLessThan(String value) {
            addCriterion("sell_price <", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceLessThanOrEqualTo(String value) {
            addCriterion("sell_price <=", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceLike(String value) {
            addCriterion("sell_price like", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceNotLike(String value) {
            addCriterion("sell_price not like", value, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceIn(List<String> values) {
            addCriterion("sell_price in", values, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceNotIn(List<String> values) {
            addCriterion("sell_price not in", values, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceBetween(String value1, String value2) {
            addCriterion("sell_price between", value1, value2, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andSellPriceNotBetween(String value1, String value2) {
            addCriterion("sell_price not between", value1, value2, "sellPrice");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconIsNull() {
            addCriterion("teaching_material_icon is null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconIsNotNull() {
            addCriterion("teaching_material_icon is not null");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconEqualTo(String value) {
            addCriterion("teaching_material_icon =", value, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconNotEqualTo(String value) {
            addCriterion("teaching_material_icon <>", value, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconGreaterThan(String value) {
            addCriterion("teaching_material_icon >", value, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconGreaterThanOrEqualTo(String value) {
            addCriterion("teaching_material_icon >=", value, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconLessThan(String value) {
            addCriterion("teaching_material_icon <", value, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconLessThanOrEqualTo(String value) {
            addCriterion("teaching_material_icon <=", value, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconLike(String value) {
            addCriterion("teaching_material_icon like", value, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconNotLike(String value) {
            addCriterion("teaching_material_icon not like", value, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconIn(List<String> values) {
            addCriterion("teaching_material_icon in", values, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconNotIn(List<String> values) {
            addCriterion("teaching_material_icon not in", values, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconBetween(String value1, String value2) {
            addCriterion("teaching_material_icon between", value1, value2, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andTeachingMaterialIconNotBetween(String value1, String value2) {
            addCriterion("teaching_material_icon not between", value1, value2, "teachingMaterialIcon");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNull() {
            addCriterion("is_recommend is null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIsNotNull() {
            addCriterion("is_recommend is not null");
            return (Criteria) this;
        }

        public Criteria andIsRecommendEqualTo(String value) {
            addCriterion("is_recommend =", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotEqualTo(String value) {
            addCriterion("is_recommend <>", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThan(String value) {
            addCriterion("is_recommend >", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendGreaterThanOrEqualTo(String value) {
            addCriterion("is_recommend >=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThan(String value) {
            addCriterion("is_recommend <", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLessThanOrEqualTo(String value) {
            addCriterion("is_recommend <=", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendLike(String value) {
            addCriterion("is_recommend like", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotLike(String value) {
            addCriterion("is_recommend not like", value, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendIn(List<String> values) {
            addCriterion("is_recommend in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotIn(List<String> values) {
            addCriterion("is_recommend not in", values, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendBetween(String value1, String value2) {
            addCriterion("is_recommend between", value1, value2, "isRecommend");
            return (Criteria) this;
        }

        public Criteria andIsRecommendNotBetween(String value1, String value2) {
            addCriterion("is_recommend not between", value1, value2, "isRecommend");
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
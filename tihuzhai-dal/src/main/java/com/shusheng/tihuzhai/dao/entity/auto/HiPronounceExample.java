package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiPronounceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiPronounceExample() {
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

        public Criteria andFirstTeachingMaterialTypeIdIsNull() {
            addCriterion("first_teaching_material_type_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdIsNotNull() {
            addCriterion("first_teaching_material_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdEqualTo(Long value) {
            addCriterion("first_teaching_material_type_id =", value, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdNotEqualTo(Long value) {
            addCriterion("first_teaching_material_type_id <>", value, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdGreaterThan(Long value) {
            addCriterion("first_teaching_material_type_id >", value, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("first_teaching_material_type_id >=", value, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdLessThan(Long value) {
            addCriterion("first_teaching_material_type_id <", value, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("first_teaching_material_type_id <=", value, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdIn(List<Long> values) {
            addCriterion("first_teaching_material_type_id in", values, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdNotIn(List<Long> values) {
            addCriterion("first_teaching_material_type_id not in", values, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdBetween(Long value1, Long value2) {
            addCriterion("first_teaching_material_type_id between", value1, value2, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("first_teaching_material_type_id not between", value1, value2, "firstTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameIsNull() {
            addCriterion("first_teaching_material_type_name is null");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameIsNotNull() {
            addCriterion("first_teaching_material_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameEqualTo(String value) {
            addCriterion("first_teaching_material_type_name =", value, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameNotEqualTo(String value) {
            addCriterion("first_teaching_material_type_name <>", value, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameGreaterThan(String value) {
            addCriterion("first_teaching_material_type_name >", value, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("first_teaching_material_type_name >=", value, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameLessThan(String value) {
            addCriterion("first_teaching_material_type_name <", value, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameLessThanOrEqualTo(String value) {
            addCriterion("first_teaching_material_type_name <=", value, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameLike(String value) {
            addCriterion("first_teaching_material_type_name like", value, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameNotLike(String value) {
            addCriterion("first_teaching_material_type_name not like", value, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameIn(List<String> values) {
            addCriterion("first_teaching_material_type_name in", values, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameNotIn(List<String> values) {
            addCriterion("first_teaching_material_type_name not in", values, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameBetween(String value1, String value2) {
            addCriterion("first_teaching_material_type_name between", value1, value2, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andFirstTeachingMaterialTypeNameNotBetween(String value1, String value2) {
            addCriterion("first_teaching_material_type_name not between", value1, value2, "firstTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdIsNull() {
            addCriterion("second_teaching_material_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdIsNotNull() {
            addCriterion("second_teaching_material_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdEqualTo(Long value) {
            addCriterion("second_teaching_material_type_id =", value, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdNotEqualTo(Long value) {
            addCriterion("second_teaching_material_type_id <>", value, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdGreaterThan(Long value) {
            addCriterion("second_teaching_material_type_id >", value, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("second_teaching_material_type_id >=", value, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdLessThan(Long value) {
            addCriterion("second_teaching_material_type_id <", value, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("second_teaching_material_type_id <=", value, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdIn(List<Long> values) {
            addCriterion("second_teaching_material_type_id in", values, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdNotIn(List<Long> values) {
            addCriterion("second_teaching_material_type_id not in", values, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdBetween(Long value1, Long value2) {
            addCriterion("second_teaching_material_type_id between", value1, value2, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("second_teaching_material_type_id not between", value1, value2, "secondTeachingMaterialTypeId");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameIsNull() {
            addCriterion("second_teaching_material_type_name is null");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameIsNotNull() {
            addCriterion("second_teaching_material_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameEqualTo(String value) {
            addCriterion("second_teaching_material_type_name =", value, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameNotEqualTo(String value) {
            addCriterion("second_teaching_material_type_name <>", value, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameGreaterThan(String value) {
            addCriterion("second_teaching_material_type_name >", value, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("second_teaching_material_type_name >=", value, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameLessThan(String value) {
            addCriterion("second_teaching_material_type_name <", value, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameLessThanOrEqualTo(String value) {
            addCriterion("second_teaching_material_type_name <=", value, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameLike(String value) {
            addCriterion("second_teaching_material_type_name like", value, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameNotLike(String value) {
            addCriterion("second_teaching_material_type_name not like", value, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameIn(List<String> values) {
            addCriterion("second_teaching_material_type_name in", values, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameNotIn(List<String> values) {
            addCriterion("second_teaching_material_type_name not in", values, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameBetween(String value1, String value2) {
            addCriterion("second_teaching_material_type_name between", value1, value2, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andSecondTeachingMaterialTypeNameNotBetween(String value1, String value2) {
            addCriterion("second_teaching_material_type_name not between", value1, value2, "secondTeachingMaterialTypeName");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNull() {
            addCriterion("page_no is null");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNotNull() {
            addCriterion("page_no is not null");
            return (Criteria) this;
        }

        public Criteria andPageNoEqualTo(Integer value) {
            addCriterion("page_no =", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotEqualTo(Integer value) {
            addCriterion("page_no <>", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThan(Integer value) {
            addCriterion("page_no >", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_no >=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThan(Integer value) {
            addCriterion("page_no <", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThanOrEqualTo(Integer value) {
            addCriterion("page_no <=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoIn(List<Integer> values) {
            addCriterion("page_no in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotIn(List<Integer> values) {
            addCriterion("page_no not in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoBetween(Integer value1, Integer value2) {
            addCriterion("page_no between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotBetween(Integer value1, Integer value2) {
            addCriterion("page_no not between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
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
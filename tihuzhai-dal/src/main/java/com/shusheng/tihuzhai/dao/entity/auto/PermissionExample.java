package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PermissionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PermissionExample() {
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

        public Criteria andPermissionIdIsNull() {
            addCriterion("permission_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIsNotNull() {
            addCriterion("permission_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionIdEqualTo(Integer value) {
            addCriterion("permission_id =", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotEqualTo(Integer value) {
            addCriterion("permission_id <>", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThan(Integer value) {
            addCriterion("permission_id >", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_id >=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThan(Integer value) {
            addCriterion("permission_id <", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdLessThanOrEqualTo(Integer value) {
            addCriterion("permission_id <=", value, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdIn(List<Integer> values) {
            addCriterion("permission_id in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotIn(List<Integer> values) {
            addCriterion("permission_id not in", values, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdBetween(Integer value1, Integer value2) {
            addCriterion("permission_id between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_id not between", value1, value2, "permissionId");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIsNull() {
            addCriterion("permission_code is null");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIsNotNull() {
            addCriterion("permission_code is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeEqualTo(String value) {
            addCriterion("permission_code =", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotEqualTo(String value) {
            addCriterion("permission_code <>", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeGreaterThan(String value) {
            addCriterion("permission_code >", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("permission_code >=", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLessThan(String value) {
            addCriterion("permission_code <", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLessThanOrEqualTo(String value) {
            addCriterion("permission_code <=", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeLike(String value) {
            addCriterion("permission_code like", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotLike(String value) {
            addCriterion("permission_code not like", value, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeIn(List<String> values) {
            addCriterion("permission_code in", values, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotIn(List<String> values) {
            addCriterion("permission_code not in", values, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeBetween(String value1, String value2) {
            addCriterion("permission_code between", value1, value2, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionCodeNotBetween(String value1, String value2) {
            addCriterion("permission_code not between", value1, value2, "permissionCode");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNull() {
            addCriterion("permission_name is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIsNotNull() {
            addCriterion("permission_name is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNameEqualTo(String value) {
            addCriterion("permission_name =", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotEqualTo(String value) {
            addCriterion("permission_name <>", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThan(String value) {
            addCriterion("permission_name >", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameGreaterThanOrEqualTo(String value) {
            addCriterion("permission_name >=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThan(String value) {
            addCriterion("permission_name <", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLessThanOrEqualTo(String value) {
            addCriterion("permission_name <=", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameLike(String value) {
            addCriterion("permission_name like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotLike(String value) {
            addCriterion("permission_name not like", value, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameIn(List<String> values) {
            addCriterion("permission_name in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotIn(List<String> values) {
            addCriterion("permission_name not in", values, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameBetween(String value1, String value2) {
            addCriterion("permission_name between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionNameNotBetween(String value1, String value2) {
            addCriterion("permission_name not between", value1, value2, "permissionName");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNull() {
            addCriterion("permission_type is null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIsNotNull() {
            addCriterion("permission_type is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeEqualTo(String value) {
            addCriterion("permission_type =", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotEqualTo(String value) {
            addCriterion("permission_type <>", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThan(String value) {
            addCriterion("permission_type >", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("permission_type >=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThan(String value) {
            addCriterion("permission_type <", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLessThanOrEqualTo(String value) {
            addCriterion("permission_type <=", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeLike(String value) {
            addCriterion("permission_type like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotLike(String value) {
            addCriterion("permission_type not like", value, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeIn(List<String> values) {
            addCriterion("permission_type in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotIn(List<String> values) {
            addCriterion("permission_type not in", values, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeBetween(String value1, String value2) {
            addCriterion("permission_type between", value1, value2, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionTypeNotBetween(String value1, String value2) {
            addCriterion("permission_type not between", value1, value2, "permissionType");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateIsNull() {
            addCriterion("permission_operate is null");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateIsNotNull() {
            addCriterion("permission_operate is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateEqualTo(String value) {
            addCriterion("permission_operate =", value, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateNotEqualTo(String value) {
            addCriterion("permission_operate <>", value, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateGreaterThan(String value) {
            addCriterion("permission_operate >", value, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateGreaterThanOrEqualTo(String value) {
            addCriterion("permission_operate >=", value, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateLessThan(String value) {
            addCriterion("permission_operate <", value, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateLessThanOrEqualTo(String value) {
            addCriterion("permission_operate <=", value, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateLike(String value) {
            addCriterion("permission_operate like", value, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateNotLike(String value) {
            addCriterion("permission_operate not like", value, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateIn(List<String> values) {
            addCriterion("permission_operate in", values, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateNotIn(List<String> values) {
            addCriterion("permission_operate not in", values, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateBetween(String value1, String value2) {
            addCriterion("permission_operate between", value1, value2, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionOperateNotBetween(String value1, String value2) {
            addCriterion("permission_operate not between", value1, value2, "permissionOperate");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackIsNull() {
            addCriterion("permission_callback is null");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackIsNotNull() {
            addCriterion("permission_callback is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackEqualTo(String value) {
            addCriterion("permission_callback =", value, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackNotEqualTo(String value) {
            addCriterion("permission_callback <>", value, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackGreaterThan(String value) {
            addCriterion("permission_callback >", value, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackGreaterThanOrEqualTo(String value) {
            addCriterion("permission_callback >=", value, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackLessThan(String value) {
            addCriterion("permission_callback <", value, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackLessThanOrEqualTo(String value) {
            addCriterion("permission_callback <=", value, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackLike(String value) {
            addCriterion("permission_callback like", value, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackNotLike(String value) {
            addCriterion("permission_callback not like", value, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackIn(List<String> values) {
            addCriterion("permission_callback in", values, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackNotIn(List<String> values) {
            addCriterion("permission_callback not in", values, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackBetween(String value1, String value2) {
            addCriterion("permission_callback between", value1, value2, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionCallbackNotBetween(String value1, String value2) {
            addCriterion("permission_callback not between", value1, value2, "permissionCallback");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteIsNull() {
            addCriterion("permission_note is null");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteIsNotNull() {
            addCriterion("permission_note is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteEqualTo(String value) {
            addCriterion("permission_note =", value, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteNotEqualTo(String value) {
            addCriterion("permission_note <>", value, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteGreaterThan(String value) {
            addCriterion("permission_note >", value, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteGreaterThanOrEqualTo(String value) {
            addCriterion("permission_note >=", value, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteLessThan(String value) {
            addCriterion("permission_note <", value, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteLessThanOrEqualTo(String value) {
            addCriterion("permission_note <=", value, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteLike(String value) {
            addCriterion("permission_note like", value, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteNotLike(String value) {
            addCriterion("permission_note not like", value, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteIn(List<String> values) {
            addCriterion("permission_note in", values, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteNotIn(List<String> values) {
            addCriterion("permission_note not in", values, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteBetween(String value1, String value2) {
            addCriterion("permission_note between", value1, value2, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionNoteNotBetween(String value1, String value2) {
            addCriterion("permission_note not between", value1, value2, "permissionNote");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdIsNull() {
            addCriterion("permission_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdIsNotNull() {
            addCriterion("permission_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdEqualTo(Integer value) {
            addCriterion("permission_parent_id =", value, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdNotEqualTo(Integer value) {
            addCriterion("permission_parent_id <>", value, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdGreaterThan(Integer value) {
            addCriterion("permission_parent_id >", value, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("permission_parent_id >=", value, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdLessThan(Integer value) {
            addCriterion("permission_parent_id <", value, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("permission_parent_id <=", value, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdIn(List<Integer> values) {
            addCriterion("permission_parent_id in", values, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdNotIn(List<Integer> values) {
            addCriterion("permission_parent_id not in", values, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdBetween(Integer value1, Integer value2) {
            addCriterion("permission_parent_id between", value1, value2, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andPermissionParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("permission_parent_id not between", value1, value2, "permissionParentId");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andIsMenuIsNull() {
            addCriterion("is_menu is null");
            return (Criteria) this;
        }

        public Criteria andIsMenuIsNotNull() {
            addCriterion("is_menu is not null");
            return (Criteria) this;
        }

        public Criteria andIsMenuEqualTo(String value) {
            addCriterion("is_menu =", value, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuNotEqualTo(String value) {
            addCriterion("is_menu <>", value, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuGreaterThan(String value) {
            addCriterion("is_menu >", value, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuGreaterThanOrEqualTo(String value) {
            addCriterion("is_menu >=", value, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuLessThan(String value) {
            addCriterion("is_menu <", value, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuLessThanOrEqualTo(String value) {
            addCriterion("is_menu <=", value, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuLike(String value) {
            addCriterion("is_menu like", value, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuNotLike(String value) {
            addCriterion("is_menu not like", value, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuIn(List<String> values) {
            addCriterion("is_menu in", values, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuNotIn(List<String> values) {
            addCriterion("is_menu not in", values, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuBetween(String value1, String value2) {
            addCriterion("is_menu between", value1, value2, "isMenu");
            return (Criteria) this;
        }

        public Criteria andIsMenuNotBetween(String value1, String value2) {
            addCriterion("is_menu not between", value1, value2, "isMenu");
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

        public Criteria andIconUrl1IsNull() {
            addCriterion("icon_url1 is null");
            return (Criteria) this;
        }

        public Criteria andIconUrl1IsNotNull() {
            addCriterion("icon_url1 is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrl1EqualTo(String value) {
            addCriterion("icon_url1 =", value, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1NotEqualTo(String value) {
            addCriterion("icon_url1 <>", value, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1GreaterThan(String value) {
            addCriterion("icon_url1 >", value, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1GreaterThanOrEqualTo(String value) {
            addCriterion("icon_url1 >=", value, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1LessThan(String value) {
            addCriterion("icon_url1 <", value, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1LessThanOrEqualTo(String value) {
            addCriterion("icon_url1 <=", value, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1Like(String value) {
            addCriterion("icon_url1 like", value, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1NotLike(String value) {
            addCriterion("icon_url1 not like", value, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1In(List<String> values) {
            addCriterion("icon_url1 in", values, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1NotIn(List<String> values) {
            addCriterion("icon_url1 not in", values, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1Between(String value1, String value2) {
            addCriterion("icon_url1 between", value1, value2, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl1NotBetween(String value1, String value2) {
            addCriterion("icon_url1 not between", value1, value2, "iconUrl1");
            return (Criteria) this;
        }

        public Criteria andIconUrl2IsNull() {
            addCriterion("icon_url2 is null");
            return (Criteria) this;
        }

        public Criteria andIconUrl2IsNotNull() {
            addCriterion("icon_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrl2EqualTo(String value) {
            addCriterion("icon_url2 =", value, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2NotEqualTo(String value) {
            addCriterion("icon_url2 <>", value, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2GreaterThan(String value) {
            addCriterion("icon_url2 >", value, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("icon_url2 >=", value, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2LessThan(String value) {
            addCriterion("icon_url2 <", value, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2LessThanOrEqualTo(String value) {
            addCriterion("icon_url2 <=", value, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2Like(String value) {
            addCriterion("icon_url2 like", value, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2NotLike(String value) {
            addCriterion("icon_url2 not like", value, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2In(List<String> values) {
            addCriterion("icon_url2 in", values, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2NotIn(List<String> values) {
            addCriterion("icon_url2 not in", values, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2Between(String value1, String value2) {
            addCriterion("icon_url2 between", value1, value2, "iconUrl2");
            return (Criteria) this;
        }

        public Criteria andIconUrl2NotBetween(String value1, String value2) {
            addCriterion("icon_url2 not between", value1, value2, "iconUrl2");
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
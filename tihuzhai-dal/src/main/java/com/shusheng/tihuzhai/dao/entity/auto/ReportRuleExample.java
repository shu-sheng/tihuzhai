package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.List;

public class ReportRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportRuleExample() {
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

        public Criteria andReportIdIsNull() {
            addCriterion("report_id is null");
            return (Criteria) this;
        }

        public Criteria andReportIdIsNotNull() {
            addCriterion("report_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportIdEqualTo(Long value) {
            addCriterion("report_id =", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotEqualTo(Long value) {
            addCriterion("report_id <>", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThan(Long value) {
            addCriterion("report_id >", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdGreaterThanOrEqualTo(Long value) {
            addCriterion("report_id >=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThan(Long value) {
            addCriterion("report_id <", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdLessThanOrEqualTo(Long value) {
            addCriterion("report_id <=", value, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdIn(List<Long> values) {
            addCriterion("report_id in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotIn(List<Long> values) {
            addCriterion("report_id not in", values, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdBetween(Long value1, Long value2) {
            addCriterion("report_id between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportIdNotBetween(Long value1, Long value2) {
            addCriterion("report_id not between", value1, value2, "reportId");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNull() {
            addCriterion("report_name is null");
            return (Criteria) this;
        }

        public Criteria andReportNameIsNotNull() {
            addCriterion("report_name is not null");
            return (Criteria) this;
        }

        public Criteria andReportNameEqualTo(String value) {
            addCriterion("report_name =", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotEqualTo(String value) {
            addCriterion("report_name <>", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThan(String value) {
            addCriterion("report_name >", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameGreaterThanOrEqualTo(String value) {
            addCriterion("report_name >=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThan(String value) {
            addCriterion("report_name <", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLessThanOrEqualTo(String value) {
            addCriterion("report_name <=", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameLike(String value) {
            addCriterion("report_name like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotLike(String value) {
            addCriterion("report_name not like", value, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameIn(List<String> values) {
            addCriterion("report_name in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotIn(List<String> values) {
            addCriterion("report_name not in", values, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameBetween(String value1, String value2) {
            addCriterion("report_name between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andReportNameNotBetween(String value1, String value2) {
            addCriterion("report_name not between", value1, value2, "reportName");
            return (Criteria) this;
        }

        public Criteria andSqlStrIsNull() {
            addCriterion("sql_str is null");
            return (Criteria) this;
        }

        public Criteria andSqlStrIsNotNull() {
            addCriterion("sql_str is not null");
            return (Criteria) this;
        }

        public Criteria andSqlStrEqualTo(String value) {
            addCriterion("sql_str =", value, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrNotEqualTo(String value) {
            addCriterion("sql_str <>", value, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrGreaterThan(String value) {
            addCriterion("sql_str >", value, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrGreaterThanOrEqualTo(String value) {
            addCriterion("sql_str >=", value, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrLessThan(String value) {
            addCriterion("sql_str <", value, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrLessThanOrEqualTo(String value) {
            addCriterion("sql_str <=", value, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrLike(String value) {
            addCriterion("sql_str like", value, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrNotLike(String value) {
            addCriterion("sql_str not like", value, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrIn(List<String> values) {
            addCriterion("sql_str in", values, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrNotIn(List<String> values) {
            addCriterion("sql_str not in", values, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrBetween(String value1, String value2) {
            addCriterion("sql_str between", value1, value2, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andSqlStrNotBetween(String value1, String value2) {
            addCriterion("sql_str not between", value1, value2, "sqlStr");
            return (Criteria) this;
        }

        public Criteria andAccessRolesIsNull() {
            addCriterion("access_roles is null");
            return (Criteria) this;
        }

        public Criteria andAccessRolesIsNotNull() {
            addCriterion("access_roles is not null");
            return (Criteria) this;
        }

        public Criteria andAccessRolesEqualTo(String value) {
            addCriterion("access_roles =", value, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesNotEqualTo(String value) {
            addCriterion("access_roles <>", value, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesGreaterThan(String value) {
            addCriterion("access_roles >", value, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesGreaterThanOrEqualTo(String value) {
            addCriterion("access_roles >=", value, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesLessThan(String value) {
            addCriterion("access_roles <", value, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesLessThanOrEqualTo(String value) {
            addCriterion("access_roles <=", value, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesLike(String value) {
            addCriterion("access_roles like", value, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesNotLike(String value) {
            addCriterion("access_roles not like", value, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesIn(List<String> values) {
            addCriterion("access_roles in", values, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesNotIn(List<String> values) {
            addCriterion("access_roles not in", values, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesBetween(String value1, String value2) {
            addCriterion("access_roles between", value1, value2, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andAccessRolesNotBetween(String value1, String value2) {
            addCriterion("access_roles not between", value1, value2, "accessRoles");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andFilter1NameIsNull() {
            addCriterion("filter1_name is null");
            return (Criteria) this;
        }

        public Criteria andFilter1NameIsNotNull() {
            addCriterion("filter1_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilter1NameEqualTo(String value) {
            addCriterion("filter1_name =", value, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameNotEqualTo(String value) {
            addCriterion("filter1_name <>", value, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameGreaterThan(String value) {
            addCriterion("filter1_name >", value, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameGreaterThanOrEqualTo(String value) {
            addCriterion("filter1_name >=", value, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameLessThan(String value) {
            addCriterion("filter1_name <", value, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameLessThanOrEqualTo(String value) {
            addCriterion("filter1_name <=", value, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameLike(String value) {
            addCriterion("filter1_name like", value, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameNotLike(String value) {
            addCriterion("filter1_name not like", value, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameIn(List<String> values) {
            addCriterion("filter1_name in", values, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameNotIn(List<String> values) {
            addCriterion("filter1_name not in", values, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameBetween(String value1, String value2) {
            addCriterion("filter1_name between", value1, value2, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1NameNotBetween(String value1, String value2) {
            addCriterion("filter1_name not between", value1, value2, "filter1Name");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeIsNull() {
            addCriterion("filter1_type is null");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeIsNotNull() {
            addCriterion("filter1_type is not null");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeEqualTo(String value) {
            addCriterion("filter1_type =", value, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeNotEqualTo(String value) {
            addCriterion("filter1_type <>", value, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeGreaterThan(String value) {
            addCriterion("filter1_type >", value, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeGreaterThanOrEqualTo(String value) {
            addCriterion("filter1_type >=", value, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeLessThan(String value) {
            addCriterion("filter1_type <", value, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeLessThanOrEqualTo(String value) {
            addCriterion("filter1_type <=", value, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeLike(String value) {
            addCriterion("filter1_type like", value, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeNotLike(String value) {
            addCriterion("filter1_type not like", value, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeIn(List<String> values) {
            addCriterion("filter1_type in", values, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeNotIn(List<String> values) {
            addCriterion("filter1_type not in", values, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeBetween(String value1, String value2) {
            addCriterion("filter1_type between", value1, value2, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1TypeNotBetween(String value1, String value2) {
            addCriterion("filter1_type not between", value1, value2, "filter1Type");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlIsNull() {
            addCriterion("filter1_sql is null");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlIsNotNull() {
            addCriterion("filter1_sql is not null");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlEqualTo(String value) {
            addCriterion("filter1_sql =", value, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlNotEqualTo(String value) {
            addCriterion("filter1_sql <>", value, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlGreaterThan(String value) {
            addCriterion("filter1_sql >", value, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlGreaterThanOrEqualTo(String value) {
            addCriterion("filter1_sql >=", value, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlLessThan(String value) {
            addCriterion("filter1_sql <", value, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlLessThanOrEqualTo(String value) {
            addCriterion("filter1_sql <=", value, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlLike(String value) {
            addCriterion("filter1_sql like", value, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlNotLike(String value) {
            addCriterion("filter1_sql not like", value, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlIn(List<String> values) {
            addCriterion("filter1_sql in", values, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlNotIn(List<String> values) {
            addCriterion("filter1_sql not in", values, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlBetween(String value1, String value2) {
            addCriterion("filter1_sql between", value1, value2, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1SqlNotBetween(String value1, String value2) {
            addCriterion("filter1_sql not between", value1, value2, "filter1Sql");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsIsNull() {
            addCriterion("filter1_options is null");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsIsNotNull() {
            addCriterion("filter1_options is not null");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsEqualTo(String value) {
            addCriterion("filter1_options =", value, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsNotEqualTo(String value) {
            addCriterion("filter1_options <>", value, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsGreaterThan(String value) {
            addCriterion("filter1_options >", value, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsGreaterThanOrEqualTo(String value) {
            addCriterion("filter1_options >=", value, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsLessThan(String value) {
            addCriterion("filter1_options <", value, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsLessThanOrEqualTo(String value) {
            addCriterion("filter1_options <=", value, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsLike(String value) {
            addCriterion("filter1_options like", value, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsNotLike(String value) {
            addCriterion("filter1_options not like", value, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsIn(List<String> values) {
            addCriterion("filter1_options in", values, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsNotIn(List<String> values) {
            addCriterion("filter1_options not in", values, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsBetween(String value1, String value2) {
            addCriterion("filter1_options between", value1, value2, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter1OptionsNotBetween(String value1, String value2) {
            addCriterion("filter1_options not between", value1, value2, "filter1Options");
            return (Criteria) this;
        }

        public Criteria andFilter2NameIsNull() {
            addCriterion("filter2_name is null");
            return (Criteria) this;
        }

        public Criteria andFilter2NameIsNotNull() {
            addCriterion("filter2_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilter2NameEqualTo(String value) {
            addCriterion("filter2_name =", value, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameNotEqualTo(String value) {
            addCriterion("filter2_name <>", value, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameGreaterThan(String value) {
            addCriterion("filter2_name >", value, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameGreaterThanOrEqualTo(String value) {
            addCriterion("filter2_name >=", value, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameLessThan(String value) {
            addCriterion("filter2_name <", value, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameLessThanOrEqualTo(String value) {
            addCriterion("filter2_name <=", value, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameLike(String value) {
            addCriterion("filter2_name like", value, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameNotLike(String value) {
            addCriterion("filter2_name not like", value, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameIn(List<String> values) {
            addCriterion("filter2_name in", values, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameNotIn(List<String> values) {
            addCriterion("filter2_name not in", values, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameBetween(String value1, String value2) {
            addCriterion("filter2_name between", value1, value2, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2NameNotBetween(String value1, String value2) {
            addCriterion("filter2_name not between", value1, value2, "filter2Name");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeIsNull() {
            addCriterion("filter2_type is null");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeIsNotNull() {
            addCriterion("filter2_type is not null");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeEqualTo(String value) {
            addCriterion("filter2_type =", value, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeNotEqualTo(String value) {
            addCriterion("filter2_type <>", value, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeGreaterThan(String value) {
            addCriterion("filter2_type >", value, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeGreaterThanOrEqualTo(String value) {
            addCriterion("filter2_type >=", value, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeLessThan(String value) {
            addCriterion("filter2_type <", value, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeLessThanOrEqualTo(String value) {
            addCriterion("filter2_type <=", value, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeLike(String value) {
            addCriterion("filter2_type like", value, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeNotLike(String value) {
            addCriterion("filter2_type not like", value, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeIn(List<String> values) {
            addCriterion("filter2_type in", values, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeNotIn(List<String> values) {
            addCriterion("filter2_type not in", values, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeBetween(String value1, String value2) {
            addCriterion("filter2_type between", value1, value2, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2TypeNotBetween(String value1, String value2) {
            addCriterion("filter2_type not between", value1, value2, "filter2Type");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlIsNull() {
            addCriterion("filter2_sql is null");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlIsNotNull() {
            addCriterion("filter2_sql is not null");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlEqualTo(String value) {
            addCriterion("filter2_sql =", value, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlNotEqualTo(String value) {
            addCriterion("filter2_sql <>", value, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlGreaterThan(String value) {
            addCriterion("filter2_sql >", value, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlGreaterThanOrEqualTo(String value) {
            addCriterion("filter2_sql >=", value, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlLessThan(String value) {
            addCriterion("filter2_sql <", value, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlLessThanOrEqualTo(String value) {
            addCriterion("filter2_sql <=", value, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlLike(String value) {
            addCriterion("filter2_sql like", value, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlNotLike(String value) {
            addCriterion("filter2_sql not like", value, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlIn(List<String> values) {
            addCriterion("filter2_sql in", values, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlNotIn(List<String> values) {
            addCriterion("filter2_sql not in", values, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlBetween(String value1, String value2) {
            addCriterion("filter2_sql between", value1, value2, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2SqlNotBetween(String value1, String value2) {
            addCriterion("filter2_sql not between", value1, value2, "filter2Sql");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsIsNull() {
            addCriterion("filter2_options is null");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsIsNotNull() {
            addCriterion("filter2_options is not null");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsEqualTo(String value) {
            addCriterion("filter2_options =", value, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsNotEqualTo(String value) {
            addCriterion("filter2_options <>", value, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsGreaterThan(String value) {
            addCriterion("filter2_options >", value, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsGreaterThanOrEqualTo(String value) {
            addCriterion("filter2_options >=", value, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsLessThan(String value) {
            addCriterion("filter2_options <", value, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsLessThanOrEqualTo(String value) {
            addCriterion("filter2_options <=", value, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsLike(String value) {
            addCriterion("filter2_options like", value, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsNotLike(String value) {
            addCriterion("filter2_options not like", value, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsIn(List<String> values) {
            addCriterion("filter2_options in", values, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsNotIn(List<String> values) {
            addCriterion("filter2_options not in", values, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsBetween(String value1, String value2) {
            addCriterion("filter2_options between", value1, value2, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter2OptionsNotBetween(String value1, String value2) {
            addCriterion("filter2_options not between", value1, value2, "filter2Options");
            return (Criteria) this;
        }

        public Criteria andFilter3NameIsNull() {
            addCriterion("filter3_name is null");
            return (Criteria) this;
        }

        public Criteria andFilter3NameIsNotNull() {
            addCriterion("filter3_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilter3NameEqualTo(String value) {
            addCriterion("filter3_name =", value, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameNotEqualTo(String value) {
            addCriterion("filter3_name <>", value, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameGreaterThan(String value) {
            addCriterion("filter3_name >", value, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameGreaterThanOrEqualTo(String value) {
            addCriterion("filter3_name >=", value, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameLessThan(String value) {
            addCriterion("filter3_name <", value, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameLessThanOrEqualTo(String value) {
            addCriterion("filter3_name <=", value, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameLike(String value) {
            addCriterion("filter3_name like", value, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameNotLike(String value) {
            addCriterion("filter3_name not like", value, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameIn(List<String> values) {
            addCriterion("filter3_name in", values, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameNotIn(List<String> values) {
            addCriterion("filter3_name not in", values, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameBetween(String value1, String value2) {
            addCriterion("filter3_name between", value1, value2, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3NameNotBetween(String value1, String value2) {
            addCriterion("filter3_name not between", value1, value2, "filter3Name");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeIsNull() {
            addCriterion("filter3_type is null");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeIsNotNull() {
            addCriterion("filter3_type is not null");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeEqualTo(String value) {
            addCriterion("filter3_type =", value, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeNotEqualTo(String value) {
            addCriterion("filter3_type <>", value, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeGreaterThan(String value) {
            addCriterion("filter3_type >", value, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeGreaterThanOrEqualTo(String value) {
            addCriterion("filter3_type >=", value, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeLessThan(String value) {
            addCriterion("filter3_type <", value, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeLessThanOrEqualTo(String value) {
            addCriterion("filter3_type <=", value, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeLike(String value) {
            addCriterion("filter3_type like", value, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeNotLike(String value) {
            addCriterion("filter3_type not like", value, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeIn(List<String> values) {
            addCriterion("filter3_type in", values, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeNotIn(List<String> values) {
            addCriterion("filter3_type not in", values, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeBetween(String value1, String value2) {
            addCriterion("filter3_type between", value1, value2, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3TypeNotBetween(String value1, String value2) {
            addCriterion("filter3_type not between", value1, value2, "filter3Type");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlIsNull() {
            addCriterion("filter3_sql is null");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlIsNotNull() {
            addCriterion("filter3_sql is not null");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlEqualTo(String value) {
            addCriterion("filter3_sql =", value, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlNotEqualTo(String value) {
            addCriterion("filter3_sql <>", value, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlGreaterThan(String value) {
            addCriterion("filter3_sql >", value, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlGreaterThanOrEqualTo(String value) {
            addCriterion("filter3_sql >=", value, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlLessThan(String value) {
            addCriterion("filter3_sql <", value, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlLessThanOrEqualTo(String value) {
            addCriterion("filter3_sql <=", value, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlLike(String value) {
            addCriterion("filter3_sql like", value, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlNotLike(String value) {
            addCriterion("filter3_sql not like", value, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlIn(List<String> values) {
            addCriterion("filter3_sql in", values, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlNotIn(List<String> values) {
            addCriterion("filter3_sql not in", values, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlBetween(String value1, String value2) {
            addCriterion("filter3_sql between", value1, value2, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3SqlNotBetween(String value1, String value2) {
            addCriterion("filter3_sql not between", value1, value2, "filter3Sql");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsIsNull() {
            addCriterion("filter3_options is null");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsIsNotNull() {
            addCriterion("filter3_options is not null");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsEqualTo(String value) {
            addCriterion("filter3_options =", value, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsNotEqualTo(String value) {
            addCriterion("filter3_options <>", value, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsGreaterThan(String value) {
            addCriterion("filter3_options >", value, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsGreaterThanOrEqualTo(String value) {
            addCriterion("filter3_options >=", value, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsLessThan(String value) {
            addCriterion("filter3_options <", value, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsLessThanOrEqualTo(String value) {
            addCriterion("filter3_options <=", value, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsLike(String value) {
            addCriterion("filter3_options like", value, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsNotLike(String value) {
            addCriterion("filter3_options not like", value, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsIn(List<String> values) {
            addCriterion("filter3_options in", values, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsNotIn(List<String> values) {
            addCriterion("filter3_options not in", values, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsBetween(String value1, String value2) {
            addCriterion("filter3_options between", value1, value2, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter3OptionsNotBetween(String value1, String value2) {
            addCriterion("filter3_options not between", value1, value2, "filter3Options");
            return (Criteria) this;
        }

        public Criteria andFilter4NameIsNull() {
            addCriterion("filter4_name is null");
            return (Criteria) this;
        }

        public Criteria andFilter4NameIsNotNull() {
            addCriterion("filter4_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilter4NameEqualTo(String value) {
            addCriterion("filter4_name =", value, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameNotEqualTo(String value) {
            addCriterion("filter4_name <>", value, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameGreaterThan(String value) {
            addCriterion("filter4_name >", value, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameGreaterThanOrEqualTo(String value) {
            addCriterion("filter4_name >=", value, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameLessThan(String value) {
            addCriterion("filter4_name <", value, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameLessThanOrEqualTo(String value) {
            addCriterion("filter4_name <=", value, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameLike(String value) {
            addCriterion("filter4_name like", value, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameNotLike(String value) {
            addCriterion("filter4_name not like", value, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameIn(List<String> values) {
            addCriterion("filter4_name in", values, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameNotIn(List<String> values) {
            addCriterion("filter4_name not in", values, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameBetween(String value1, String value2) {
            addCriterion("filter4_name between", value1, value2, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4NameNotBetween(String value1, String value2) {
            addCriterion("filter4_name not between", value1, value2, "filter4Name");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeIsNull() {
            addCriterion("filter4_type is null");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeIsNotNull() {
            addCriterion("filter4_type is not null");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeEqualTo(String value) {
            addCriterion("filter4_type =", value, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeNotEqualTo(String value) {
            addCriterion("filter4_type <>", value, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeGreaterThan(String value) {
            addCriterion("filter4_type >", value, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeGreaterThanOrEqualTo(String value) {
            addCriterion("filter4_type >=", value, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeLessThan(String value) {
            addCriterion("filter4_type <", value, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeLessThanOrEqualTo(String value) {
            addCriterion("filter4_type <=", value, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeLike(String value) {
            addCriterion("filter4_type like", value, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeNotLike(String value) {
            addCriterion("filter4_type not like", value, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeIn(List<String> values) {
            addCriterion("filter4_type in", values, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeNotIn(List<String> values) {
            addCriterion("filter4_type not in", values, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeBetween(String value1, String value2) {
            addCriterion("filter4_type between", value1, value2, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4TypeNotBetween(String value1, String value2) {
            addCriterion("filter4_type not between", value1, value2, "filter4Type");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlIsNull() {
            addCriterion("filter4_sql is null");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlIsNotNull() {
            addCriterion("filter4_sql is not null");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlEqualTo(String value) {
            addCriterion("filter4_sql =", value, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlNotEqualTo(String value) {
            addCriterion("filter4_sql <>", value, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlGreaterThan(String value) {
            addCriterion("filter4_sql >", value, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlGreaterThanOrEqualTo(String value) {
            addCriterion("filter4_sql >=", value, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlLessThan(String value) {
            addCriterion("filter4_sql <", value, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlLessThanOrEqualTo(String value) {
            addCriterion("filter4_sql <=", value, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlLike(String value) {
            addCriterion("filter4_sql like", value, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlNotLike(String value) {
            addCriterion("filter4_sql not like", value, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlIn(List<String> values) {
            addCriterion("filter4_sql in", values, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlNotIn(List<String> values) {
            addCriterion("filter4_sql not in", values, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlBetween(String value1, String value2) {
            addCriterion("filter4_sql between", value1, value2, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4SqlNotBetween(String value1, String value2) {
            addCriterion("filter4_sql not between", value1, value2, "filter4Sql");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsIsNull() {
            addCriterion("filter4_options is null");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsIsNotNull() {
            addCriterion("filter4_options is not null");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsEqualTo(String value) {
            addCriterion("filter4_options =", value, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsNotEqualTo(String value) {
            addCriterion("filter4_options <>", value, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsGreaterThan(String value) {
            addCriterion("filter4_options >", value, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsGreaterThanOrEqualTo(String value) {
            addCriterion("filter4_options >=", value, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsLessThan(String value) {
            addCriterion("filter4_options <", value, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsLessThanOrEqualTo(String value) {
            addCriterion("filter4_options <=", value, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsLike(String value) {
            addCriterion("filter4_options like", value, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsNotLike(String value) {
            addCriterion("filter4_options not like", value, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsIn(List<String> values) {
            addCriterion("filter4_options in", values, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsNotIn(List<String> values) {
            addCriterion("filter4_options not in", values, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsBetween(String value1, String value2) {
            addCriterion("filter4_options between", value1, value2, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter4OptionsNotBetween(String value1, String value2) {
            addCriterion("filter4_options not between", value1, value2, "filter4Options");
            return (Criteria) this;
        }

        public Criteria andFilter5NameIsNull() {
            addCriterion("filter5_name is null");
            return (Criteria) this;
        }

        public Criteria andFilter5NameIsNotNull() {
            addCriterion("filter5_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilter5NameEqualTo(String value) {
            addCriterion("filter5_name =", value, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameNotEqualTo(String value) {
            addCriterion("filter5_name <>", value, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameGreaterThan(String value) {
            addCriterion("filter5_name >", value, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameGreaterThanOrEqualTo(String value) {
            addCriterion("filter5_name >=", value, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameLessThan(String value) {
            addCriterion("filter5_name <", value, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameLessThanOrEqualTo(String value) {
            addCriterion("filter5_name <=", value, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameLike(String value) {
            addCriterion("filter5_name like", value, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameNotLike(String value) {
            addCriterion("filter5_name not like", value, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameIn(List<String> values) {
            addCriterion("filter5_name in", values, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameNotIn(List<String> values) {
            addCriterion("filter5_name not in", values, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameBetween(String value1, String value2) {
            addCriterion("filter5_name between", value1, value2, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5NameNotBetween(String value1, String value2) {
            addCriterion("filter5_name not between", value1, value2, "filter5Name");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeIsNull() {
            addCriterion("filter5_type is null");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeIsNotNull() {
            addCriterion("filter5_type is not null");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeEqualTo(String value) {
            addCriterion("filter5_type =", value, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeNotEqualTo(String value) {
            addCriterion("filter5_type <>", value, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeGreaterThan(String value) {
            addCriterion("filter5_type >", value, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeGreaterThanOrEqualTo(String value) {
            addCriterion("filter5_type >=", value, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeLessThan(String value) {
            addCriterion("filter5_type <", value, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeLessThanOrEqualTo(String value) {
            addCriterion("filter5_type <=", value, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeLike(String value) {
            addCriterion("filter5_type like", value, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeNotLike(String value) {
            addCriterion("filter5_type not like", value, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeIn(List<String> values) {
            addCriterion("filter5_type in", values, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeNotIn(List<String> values) {
            addCriterion("filter5_type not in", values, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeBetween(String value1, String value2) {
            addCriterion("filter5_type between", value1, value2, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5TypeNotBetween(String value1, String value2) {
            addCriterion("filter5_type not between", value1, value2, "filter5Type");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlIsNull() {
            addCriterion("filter5_sql is null");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlIsNotNull() {
            addCriterion("filter5_sql is not null");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlEqualTo(String value) {
            addCriterion("filter5_sql =", value, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlNotEqualTo(String value) {
            addCriterion("filter5_sql <>", value, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlGreaterThan(String value) {
            addCriterion("filter5_sql >", value, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlGreaterThanOrEqualTo(String value) {
            addCriterion("filter5_sql >=", value, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlLessThan(String value) {
            addCriterion("filter5_sql <", value, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlLessThanOrEqualTo(String value) {
            addCriterion("filter5_sql <=", value, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlLike(String value) {
            addCriterion("filter5_sql like", value, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlNotLike(String value) {
            addCriterion("filter5_sql not like", value, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlIn(List<String> values) {
            addCriterion("filter5_sql in", values, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlNotIn(List<String> values) {
            addCriterion("filter5_sql not in", values, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlBetween(String value1, String value2) {
            addCriterion("filter5_sql between", value1, value2, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5SqlNotBetween(String value1, String value2) {
            addCriterion("filter5_sql not between", value1, value2, "filter5Sql");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsIsNull() {
            addCriterion("filter5_options is null");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsIsNotNull() {
            addCriterion("filter5_options is not null");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsEqualTo(String value) {
            addCriterion("filter5_options =", value, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsNotEqualTo(String value) {
            addCriterion("filter5_options <>", value, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsGreaterThan(String value) {
            addCriterion("filter5_options >", value, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsGreaterThanOrEqualTo(String value) {
            addCriterion("filter5_options >=", value, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsLessThan(String value) {
            addCriterion("filter5_options <", value, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsLessThanOrEqualTo(String value) {
            addCriterion("filter5_options <=", value, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsLike(String value) {
            addCriterion("filter5_options like", value, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsNotLike(String value) {
            addCriterion("filter5_options not like", value, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsIn(List<String> values) {
            addCriterion("filter5_options in", values, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsNotIn(List<String> values) {
            addCriterion("filter5_options not in", values, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsBetween(String value1, String value2) {
            addCriterion("filter5_options between", value1, value2, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter5OptionsNotBetween(String value1, String value2) {
            addCriterion("filter5_options not between", value1, value2, "filter5Options");
            return (Criteria) this;
        }

        public Criteria andFilter6NameIsNull() {
            addCriterion("filter6_name is null");
            return (Criteria) this;
        }

        public Criteria andFilter6NameIsNotNull() {
            addCriterion("filter6_name is not null");
            return (Criteria) this;
        }

        public Criteria andFilter6NameEqualTo(String value) {
            addCriterion("filter6_name =", value, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameNotEqualTo(String value) {
            addCriterion("filter6_name <>", value, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameGreaterThan(String value) {
            addCriterion("filter6_name >", value, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameGreaterThanOrEqualTo(String value) {
            addCriterion("filter6_name >=", value, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameLessThan(String value) {
            addCriterion("filter6_name <", value, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameLessThanOrEqualTo(String value) {
            addCriterion("filter6_name <=", value, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameLike(String value) {
            addCriterion("filter6_name like", value, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameNotLike(String value) {
            addCriterion("filter6_name not like", value, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameIn(List<String> values) {
            addCriterion("filter6_name in", values, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameNotIn(List<String> values) {
            addCriterion("filter6_name not in", values, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameBetween(String value1, String value2) {
            addCriterion("filter6_name between", value1, value2, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6NameNotBetween(String value1, String value2) {
            addCriterion("filter6_name not between", value1, value2, "filter6Name");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeIsNull() {
            addCriterion("filter6_type is null");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeIsNotNull() {
            addCriterion("filter6_type is not null");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeEqualTo(String value) {
            addCriterion("filter6_type =", value, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeNotEqualTo(String value) {
            addCriterion("filter6_type <>", value, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeGreaterThan(String value) {
            addCriterion("filter6_type >", value, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeGreaterThanOrEqualTo(String value) {
            addCriterion("filter6_type >=", value, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeLessThan(String value) {
            addCriterion("filter6_type <", value, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeLessThanOrEqualTo(String value) {
            addCriterion("filter6_type <=", value, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeLike(String value) {
            addCriterion("filter6_type like", value, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeNotLike(String value) {
            addCriterion("filter6_type not like", value, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeIn(List<String> values) {
            addCriterion("filter6_type in", values, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeNotIn(List<String> values) {
            addCriterion("filter6_type not in", values, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeBetween(String value1, String value2) {
            addCriterion("filter6_type between", value1, value2, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6TypeNotBetween(String value1, String value2) {
            addCriterion("filter6_type not between", value1, value2, "filter6Type");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlIsNull() {
            addCriterion("filter6_sql is null");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlIsNotNull() {
            addCriterion("filter6_sql is not null");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlEqualTo(String value) {
            addCriterion("filter6_sql =", value, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlNotEqualTo(String value) {
            addCriterion("filter6_sql <>", value, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlGreaterThan(String value) {
            addCriterion("filter6_sql >", value, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlGreaterThanOrEqualTo(String value) {
            addCriterion("filter6_sql >=", value, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlLessThan(String value) {
            addCriterion("filter6_sql <", value, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlLessThanOrEqualTo(String value) {
            addCriterion("filter6_sql <=", value, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlLike(String value) {
            addCriterion("filter6_sql like", value, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlNotLike(String value) {
            addCriterion("filter6_sql not like", value, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlIn(List<String> values) {
            addCriterion("filter6_sql in", values, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlNotIn(List<String> values) {
            addCriterion("filter6_sql not in", values, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlBetween(String value1, String value2) {
            addCriterion("filter6_sql between", value1, value2, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6SqlNotBetween(String value1, String value2) {
            addCriterion("filter6_sql not between", value1, value2, "filter6Sql");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsIsNull() {
            addCriterion("filter6_options is null");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsIsNotNull() {
            addCriterion("filter6_options is not null");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsEqualTo(String value) {
            addCriterion("filter6_options =", value, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsNotEqualTo(String value) {
            addCriterion("filter6_options <>", value, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsGreaterThan(String value) {
            addCriterion("filter6_options >", value, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsGreaterThanOrEqualTo(String value) {
            addCriterion("filter6_options >=", value, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsLessThan(String value) {
            addCriterion("filter6_options <", value, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsLessThanOrEqualTo(String value) {
            addCriterion("filter6_options <=", value, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsLike(String value) {
            addCriterion("filter6_options like", value, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsNotLike(String value) {
            addCriterion("filter6_options not like", value, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsIn(List<String> values) {
            addCriterion("filter6_options in", values, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsNotIn(List<String> values) {
            addCriterion("filter6_options not in", values, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsBetween(String value1, String value2) {
            addCriterion("filter6_options between", value1, value2, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andFilter6OptionsNotBetween(String value1, String value2) {
            addCriterion("filter6_options not between", value1, value2, "filter6Options");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNull() {
            addCriterion("sort_order is null");
            return (Criteria) this;
        }

        public Criteria andSortOrderIsNotNull() {
            addCriterion("sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andSortOrderEqualTo(Integer value) {
            addCriterion("sort_order =", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotEqualTo(Integer value) {
            addCriterion("sort_order <>", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThan(Integer value) {
            addCriterion("sort_order >", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_order >=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThan(Integer value) {
            addCriterion("sort_order <", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("sort_order <=", value, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderIn(List<Integer> values) {
            addCriterion("sort_order in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotIn(List<Integer> values) {
            addCriterion("sort_order not in", values, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("sort_order between", value1, value2, "sortOrder");
            return (Criteria) this;
        }

        public Criteria andSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_order not between", value1, value2, "sortOrder");
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
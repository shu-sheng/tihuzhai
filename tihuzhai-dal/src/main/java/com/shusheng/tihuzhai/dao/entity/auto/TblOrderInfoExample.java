package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblOrderInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblOrderInfoExample() {
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

        public Criteria andBuyCreditDetailIdIsNull() {
            addCriterion("buy_credit_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdIsNotNull() {
            addCriterion("buy_credit_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdEqualTo(Long value) {
            addCriterion("buy_credit_detail_id =", value, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdNotEqualTo(Long value) {
            addCriterion("buy_credit_detail_id <>", value, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdGreaterThan(Long value) {
            addCriterion("buy_credit_detail_id >", value, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("buy_credit_detail_id >=", value, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdLessThan(Long value) {
            addCriterion("buy_credit_detail_id <", value, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("buy_credit_detail_id <=", value, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdIn(List<Long> values) {
            addCriterion("buy_credit_detail_id in", values, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdNotIn(List<Long> values) {
            addCriterion("buy_credit_detail_id not in", values, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdBetween(Long value1, Long value2) {
            addCriterion("buy_credit_detail_id between", value1, value2, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andBuyCreditDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("buy_credit_detail_id not between", value1, value2, "buyCreditDetailId");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNull() {
            addCriterion("credit_status is null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIsNotNull() {
            addCriterion("credit_status is not null");
            return (Criteria) this;
        }

        public Criteria andCreditStatusEqualTo(String value) {
            addCriterion("credit_status =", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotEqualTo(String value) {
            addCriterion("credit_status <>", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThan(String value) {
            addCriterion("credit_status >", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("credit_status >=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThan(String value) {
            addCriterion("credit_status <", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLessThanOrEqualTo(String value) {
            addCriterion("credit_status <=", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusLike(String value) {
            addCriterion("credit_status like", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotLike(String value) {
            addCriterion("credit_status not like", value, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusIn(List<String> values) {
            addCriterion("credit_status in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotIn(List<String> values) {
            addCriterion("credit_status not in", values, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusBetween(String value1, String value2) {
            addCriterion("credit_status between", value1, value2, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andCreditStatusNotBetween(String value1, String value2) {
            addCriterion("credit_status not between", value1, value2, "creditStatus");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("province like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("province not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("city like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("city not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCountyIsNull() {
            addCriterion("county is null");
            return (Criteria) this;
        }

        public Criteria andCountyIsNotNull() {
            addCriterion("county is not null");
            return (Criteria) this;
        }

        public Criteria andCountyEqualTo(String value) {
            addCriterion("county =", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotEqualTo(String value) {
            addCriterion("county <>", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThan(String value) {
            addCriterion("county >", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyGreaterThanOrEqualTo(String value) {
            addCriterion("county >=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThan(String value) {
            addCriterion("county <", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLessThanOrEqualTo(String value) {
            addCriterion("county <=", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyLike(String value) {
            addCriterion("county like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotLike(String value) {
            addCriterion("county not like", value, "county");
            return (Criteria) this;
        }

        public Criteria andCountyIn(List<String> values) {
            addCriterion("county in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotIn(List<String> values) {
            addCriterion("county not in", values, "county");
            return (Criteria) this;
        }

        public Criteria andCountyBetween(String value1, String value2) {
            addCriterion("county between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andCountyNotBetween(String value1, String value2) {
            addCriterion("county not between", value1, value2, "county");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNull() {
            addCriterion("detail_address is null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIsNotNull() {
            addCriterion("detail_address is not null");
            return (Criteria) this;
        }

        public Criteria andDetailAddressEqualTo(String value) {
            addCriterion("detail_address =", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotEqualTo(String value) {
            addCriterion("detail_address <>", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThan(String value) {
            addCriterion("detail_address >", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressGreaterThanOrEqualTo(String value) {
            addCriterion("detail_address >=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThan(String value) {
            addCriterion("detail_address <", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLessThanOrEqualTo(String value) {
            addCriterion("detail_address <=", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressLike(String value) {
            addCriterion("detail_address like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotLike(String value) {
            addCriterion("detail_address not like", value, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressIn(List<String> values) {
            addCriterion("detail_address in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotIn(List<String> values) {
            addCriterion("detail_address not in", values, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressBetween(String value1, String value2) {
            addCriterion("detail_address between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDetailAddressNotBetween(String value1, String value2) {
            addCriterion("detail_address not between", value1, value2, "detailAddress");
            return (Criteria) this;
        }

        public Criteria andDrawerNameIsNull() {
            addCriterion("drawer_name is null");
            return (Criteria) this;
        }

        public Criteria andDrawerNameIsNotNull() {
            addCriterion("drawer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDrawerNameEqualTo(String value) {
            addCriterion("drawer_name =", value, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameNotEqualTo(String value) {
            addCriterion("drawer_name <>", value, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameGreaterThan(String value) {
            addCriterion("drawer_name >", value, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameGreaterThanOrEqualTo(String value) {
            addCriterion("drawer_name >=", value, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameLessThan(String value) {
            addCriterion("drawer_name <", value, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameLessThanOrEqualTo(String value) {
            addCriterion("drawer_name <=", value, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameLike(String value) {
            addCriterion("drawer_name like", value, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameNotLike(String value) {
            addCriterion("drawer_name not like", value, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameIn(List<String> values) {
            addCriterion("drawer_name in", values, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameNotIn(List<String> values) {
            addCriterion("drawer_name not in", values, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameBetween(String value1, String value2) {
            addCriterion("drawer_name between", value1, value2, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNameNotBetween(String value1, String value2) {
            addCriterion("drawer_name not between", value1, value2, "drawerName");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberIsNull() {
            addCriterion("drawer_number is null");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberIsNotNull() {
            addCriterion("drawer_number is not null");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberEqualTo(String value) {
            addCriterion("drawer_number =", value, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberNotEqualTo(String value) {
            addCriterion("drawer_number <>", value, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberGreaterThan(String value) {
            addCriterion("drawer_number >", value, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberGreaterThanOrEqualTo(String value) {
            addCriterion("drawer_number >=", value, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberLessThan(String value) {
            addCriterion("drawer_number <", value, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberLessThanOrEqualTo(String value) {
            addCriterion("drawer_number <=", value, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberLike(String value) {
            addCriterion("drawer_number like", value, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberNotLike(String value) {
            addCriterion("drawer_number not like", value, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberIn(List<String> values) {
            addCriterion("drawer_number in", values, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberNotIn(List<String> values) {
            addCriterion("drawer_number not in", values, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberBetween(String value1, String value2) {
            addCriterion("drawer_number between", value1, value2, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerNumberNotBetween(String value1, String value2) {
            addCriterion("drawer_number not between", value1, value2, "drawerNumber");
            return (Criteria) this;
        }

        public Criteria andDrawerTelIsNull() {
            addCriterion("drawer_tel is null");
            return (Criteria) this;
        }

        public Criteria andDrawerTelIsNotNull() {
            addCriterion("drawer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andDrawerTelEqualTo(String value) {
            addCriterion("drawer_tel =", value, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelNotEqualTo(String value) {
            addCriterion("drawer_tel <>", value, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelGreaterThan(String value) {
            addCriterion("drawer_tel >", value, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelGreaterThanOrEqualTo(String value) {
            addCriterion("drawer_tel >=", value, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelLessThan(String value) {
            addCriterion("drawer_tel <", value, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelLessThanOrEqualTo(String value) {
            addCriterion("drawer_tel <=", value, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelLike(String value) {
            addCriterion("drawer_tel like", value, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelNotLike(String value) {
            addCriterion("drawer_tel not like", value, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelIn(List<String> values) {
            addCriterion("drawer_tel in", values, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelNotIn(List<String> values) {
            addCriterion("drawer_tel not in", values, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelBetween(String value1, String value2) {
            addCriterion("drawer_tel between", value1, value2, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andDrawerTelNotBetween(String value1, String value2) {
            addCriterion("drawer_tel not between", value1, value2, "drawerTel");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("zip_code is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("zip_code is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("zip_code =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("zip_code <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("zip_code >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("zip_code >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("zip_code <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("zip_code <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("zip_code like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("zip_code not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("zip_code in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("zip_code not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("zip_code between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("zip_code not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oIsNull() {
            addCriterion("sale_type_o2o is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oIsNotNull() {
            addCriterion("sale_type_o2o is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oEqualTo(String value) {
            addCriterion("sale_type_o2o =", value, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oNotEqualTo(String value) {
            addCriterion("sale_type_o2o <>", value, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oGreaterThan(String value) {
            addCriterion("sale_type_o2o >", value, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oGreaterThanOrEqualTo(String value) {
            addCriterion("sale_type_o2o >=", value, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oLessThan(String value) {
            addCriterion("sale_type_o2o <", value, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oLessThanOrEqualTo(String value) {
            addCriterion("sale_type_o2o <=", value, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oLike(String value) {
            addCriterion("sale_type_o2o like", value, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oNotLike(String value) {
            addCriterion("sale_type_o2o not like", value, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oIn(List<String> values) {
            addCriterion("sale_type_o2o in", values, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oNotIn(List<String> values) {
            addCriterion("sale_type_o2o not in", values, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oBetween(String value1, String value2) {
            addCriterion("sale_type_o2o between", value1, value2, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeO2oNotBetween(String value1, String value2) {
            addCriterion("sale_type_o2o not between", value1, value2, "saleTypeO2o");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cIsNull() {
            addCriterion("sale_type_b2c is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cIsNotNull() {
            addCriterion("sale_type_b2c is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cEqualTo(String value) {
            addCriterion("sale_type_b2c =", value, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cNotEqualTo(String value) {
            addCriterion("sale_type_b2c <>", value, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cGreaterThan(String value) {
            addCriterion("sale_type_b2c >", value, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cGreaterThanOrEqualTo(String value) {
            addCriterion("sale_type_b2c >=", value, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cLessThan(String value) {
            addCriterion("sale_type_b2c <", value, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cLessThanOrEqualTo(String value) {
            addCriterion("sale_type_b2c <=", value, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cLike(String value) {
            addCriterion("sale_type_b2c like", value, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cNotLike(String value) {
            addCriterion("sale_type_b2c not like", value, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cIn(List<String> values) {
            addCriterion("sale_type_b2c in", values, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cNotIn(List<String> values) {
            addCriterion("sale_type_b2c not in", values, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cBetween(String value1, String value2) {
            addCriterion("sale_type_b2c between", value1, value2, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andSaleTypeB2cNotBetween(String value1, String value2) {
            addCriterion("sale_type_b2c not between", value1, value2, "saleTypeB2c");
            return (Criteria) this;
        }

        public Criteria andFacadeIsNull() {
            addCriterion("facade is null");
            return (Criteria) this;
        }

        public Criteria andFacadeIsNotNull() {
            addCriterion("facade is not null");
            return (Criteria) this;
        }

        public Criteria andFacadeEqualTo(String value) {
            addCriterion("facade =", value, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeNotEqualTo(String value) {
            addCriterion("facade <>", value, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeGreaterThan(String value) {
            addCriterion("facade >", value, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeGreaterThanOrEqualTo(String value) {
            addCriterion("facade >=", value, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeLessThan(String value) {
            addCriterion("facade <", value, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeLessThanOrEqualTo(String value) {
            addCriterion("facade <=", value, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeLike(String value) {
            addCriterion("facade like", value, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeNotLike(String value) {
            addCriterion("facade not like", value, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeIn(List<String> values) {
            addCriterion("facade in", values, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeNotIn(List<String> values) {
            addCriterion("facade not in", values, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeBetween(String value1, String value2) {
            addCriterion("facade between", value1, value2, "facade");
            return (Criteria) this;
        }

        public Criteria andFacadeNotBetween(String value1, String value2) {
            addCriterion("facade not between", value1, value2, "facade");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainIsNull() {
            addCriterion("special_explain is null");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainIsNotNull() {
            addCriterion("special_explain is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainEqualTo(String value) {
            addCriterion("special_explain =", value, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainNotEqualTo(String value) {
            addCriterion("special_explain <>", value, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainGreaterThan(String value) {
            addCriterion("special_explain >", value, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainGreaterThanOrEqualTo(String value) {
            addCriterion("special_explain >=", value, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainLessThan(String value) {
            addCriterion("special_explain <", value, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainLessThanOrEqualTo(String value) {
            addCriterion("special_explain <=", value, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainLike(String value) {
            addCriterion("special_explain like", value, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainNotLike(String value) {
            addCriterion("special_explain not like", value, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainIn(List<String> values) {
            addCriterion("special_explain in", values, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainNotIn(List<String> values) {
            addCriterion("special_explain not in", values, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainBetween(String value1, String value2) {
            addCriterion("special_explain between", value1, value2, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andSpecialExplainNotBetween(String value1, String value2) {
            addCriterion("special_explain not between", value1, value2, "specialExplain");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNull() {
            addCriterion("payment_method is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIsNotNull() {
            addCriterion("payment_method is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodEqualTo(String value) {
            addCriterion("payment_method =", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotEqualTo(String value) {
            addCriterion("payment_method <>", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThan(String value) {
            addCriterion("payment_method >", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("payment_method >=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThan(String value) {
            addCriterion("payment_method <", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLessThanOrEqualTo(String value) {
            addCriterion("payment_method <=", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodLike(String value) {
            addCriterion("payment_method like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotLike(String value) {
            addCriterion("payment_method not like", value, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIn(List<String> values) {
            addCriterion("payment_method in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotIn(List<String> values) {
            addCriterion("payment_method not in", values, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodBetween(String value1, String value2) {
            addCriterion("payment_method between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodNotBetween(String value1, String value2) {
            addCriterion("payment_method not between", value1, value2, "paymentMethod");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(String value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(String value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(String value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(String value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLike(String value) {
            addCriterion("order_status like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotLike(String value) {
            addCriterion("order_status not like", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<String> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<String> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(String value1, String value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(String value1, String value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andBuyerNicknameIsNull() {
            addCriterion("buyer_nickname is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameIsNotNull() {
            addCriterion("buyer_nickname is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameEqualTo(String value) {
            addCriterion("buyer_nickname =", value, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameNotEqualTo(String value) {
            addCriterion("buyer_nickname <>", value, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameGreaterThan(String value) {
            addCriterion("buyer_nickname >", value, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_nickname >=", value, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameLessThan(String value) {
            addCriterion("buyer_nickname <", value, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameLessThanOrEqualTo(String value) {
            addCriterion("buyer_nickname <=", value, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameLike(String value) {
            addCriterion("buyer_nickname like", value, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameNotLike(String value) {
            addCriterion("buyer_nickname not like", value, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameIn(List<String> values) {
            addCriterion("buyer_nickname in", values, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameNotIn(List<String> values) {
            addCriterion("buyer_nickname not in", values, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameBetween(String value1, String value2) {
            addCriterion("buyer_nickname between", value1, value2, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andBuyerNicknameNotBetween(String value1, String value2) {
            addCriterion("buyer_nickname not between", value1, value2, "buyerNickname");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNull() {
            addCriterion("operator_id is null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIsNotNull() {
            addCriterion("operator_id is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorIdEqualTo(Long value) {
            addCriterion("operator_id =", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotEqualTo(Long value) {
            addCriterion("operator_id <>", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThan(Long value) {
            addCriterion("operator_id >", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("operator_id >=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThan(Long value) {
            addCriterion("operator_id <", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdLessThanOrEqualTo(Long value) {
            addCriterion("operator_id <=", value, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdIn(List<Long> values) {
            addCriterion("operator_id in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotIn(List<Long> values) {
            addCriterion("operator_id not in", values, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdBetween(Long value1, Long value2) {
            addCriterion("operator_id between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorIdNotBetween(Long value1, Long value2) {
            addCriterion("operator_id not between", value1, value2, "operatorId");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNull() {
            addCriterion("operator_time is null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIsNotNull() {
            addCriterion("operator_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeEqualTo(Date value) {
            addCriterion("operator_time =", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotEqualTo(Date value) {
            addCriterion("operator_time <>", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThan(Date value) {
            addCriterion("operator_time >", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operator_time >=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThan(Date value) {
            addCriterion("operator_time <", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeLessThanOrEqualTo(Date value) {
            addCriterion("operator_time <=", value, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeIn(List<Date> values) {
            addCriterion("operator_time in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotIn(List<Date> values) {
            addCriterion("operator_time not in", values, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeBetween(Date value1, Date value2) {
            addCriterion("operator_time between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andOperatorTimeNotBetween(Date value1, Date value2) {
            addCriterion("operator_time not between", value1, value2, "operatorTime");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNull() {
            addCriterion("area_code is null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIsNotNull() {
            addCriterion("area_code is not null");
            return (Criteria) this;
        }

        public Criteria andAreaCodeEqualTo(String value) {
            addCriterion("area_code =", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotEqualTo(String value) {
            addCriterion("area_code <>", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThan(String value) {
            addCriterion("area_code >", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("area_code >=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThan(String value) {
            addCriterion("area_code <", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("area_code <=", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeLike(String value) {
            addCriterion("area_code like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotLike(String value) {
            addCriterion("area_code not like", value, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeIn(List<String> values) {
            addCriterion("area_code in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotIn(List<String> values) {
            addCriterion("area_code not in", values, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeBetween(String value1, String value2) {
            addCriterion("area_code between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andAreaCodeNotBetween(String value1, String value2) {
            addCriterion("area_code not between", value1, value2, "areaCode");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNull() {
            addCriterion("supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIsNotNull() {
            addCriterion("supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierIdEqualTo(Long value) {
            addCriterion("supplier_id =", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotEqualTo(Long value) {
            addCriterion("supplier_id <>", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThan(Long value) {
            addCriterion("supplier_id >", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supplier_id >=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThan(Long value) {
            addCriterion("supplier_id <", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("supplier_id <=", value, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdIn(List<Long> values) {
            addCriterion("supplier_id in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotIn(List<Long> values) {
            addCriterion("supplier_id not in", values, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdBetween(Long value1, Long value2) {
            addCriterion("supplier_id between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("supplier_id not between", value1, value2, "supplierId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdIsNull() {
            addCriterion("sale_platform_id is null");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdIsNotNull() {
            addCriterion("sale_platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdEqualTo(Long value) {
            addCriterion("sale_platform_id =", value, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdNotEqualTo(Long value) {
            addCriterion("sale_platform_id <>", value, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdGreaterThan(Long value) {
            addCriterion("sale_platform_id >", value, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sale_platform_id >=", value, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdLessThan(Long value) {
            addCriterion("sale_platform_id <", value, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdLessThanOrEqualTo(Long value) {
            addCriterion("sale_platform_id <=", value, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdIn(List<Long> values) {
            addCriterion("sale_platform_id in", values, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdNotIn(List<Long> values) {
            addCriterion("sale_platform_id not in", values, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdBetween(Long value1, Long value2) {
            addCriterion("sale_platform_id between", value1, value2, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andSalePlatformIdNotBetween(Long value1, Long value2) {
            addCriterion("sale_platform_id not between", value1, value2, "salePlatformId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdIsNull() {
            addCriterion("resorts_business_id is null");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdIsNotNull() {
            addCriterion("resorts_business_id is not null");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdEqualTo(Long value) {
            addCriterion("resorts_business_id =", value, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdNotEqualTo(Long value) {
            addCriterion("resorts_business_id <>", value, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdGreaterThan(Long value) {
            addCriterion("resorts_business_id >", value, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdGreaterThanOrEqualTo(Long value) {
            addCriterion("resorts_business_id >=", value, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdLessThan(Long value) {
            addCriterion("resorts_business_id <", value, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdLessThanOrEqualTo(Long value) {
            addCriterion("resorts_business_id <=", value, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdIn(List<Long> values) {
            addCriterion("resorts_business_id in", values, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdNotIn(List<Long> values) {
            addCriterion("resorts_business_id not in", values, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdBetween(Long value1, Long value2) {
            addCriterion("resorts_business_id between", value1, value2, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessIdNotBetween(Long value1, Long value2) {
            addCriterion("resorts_business_id not between", value1, value2, "resortsBusinessId");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameIsNull() {
            addCriterion("resorts_business_name is null");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameIsNotNull() {
            addCriterion("resorts_business_name is not null");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameEqualTo(String value) {
            addCriterion("resorts_business_name =", value, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameNotEqualTo(String value) {
            addCriterion("resorts_business_name <>", value, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameGreaterThan(String value) {
            addCriterion("resorts_business_name >", value, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("resorts_business_name >=", value, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameLessThan(String value) {
            addCriterion("resorts_business_name <", value, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("resorts_business_name <=", value, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameLike(String value) {
            addCriterion("resorts_business_name like", value, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameNotLike(String value) {
            addCriterion("resorts_business_name not like", value, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameIn(List<String> values) {
            addCriterion("resorts_business_name in", values, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameNotIn(List<String> values) {
            addCriterion("resorts_business_name not in", values, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameBetween(String value1, String value2) {
            addCriterion("resorts_business_name between", value1, value2, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessNameNotBetween(String value1, String value2) {
            addCriterion("resorts_business_name not between", value1, value2, "resortsBusinessName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameIsNull() {
            addCriterion("resorts_business_real_name is null");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameIsNotNull() {
            addCriterion("resorts_business_real_name is not null");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameEqualTo(String value) {
            addCriterion("resorts_business_real_name =", value, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameNotEqualTo(String value) {
            addCriterion("resorts_business_real_name <>", value, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameGreaterThan(String value) {
            addCriterion("resorts_business_real_name >", value, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("resorts_business_real_name >=", value, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameLessThan(String value) {
            addCriterion("resorts_business_real_name <", value, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameLessThanOrEqualTo(String value) {
            addCriterion("resorts_business_real_name <=", value, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameLike(String value) {
            addCriterion("resorts_business_real_name like", value, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameNotLike(String value) {
            addCriterion("resorts_business_real_name not like", value, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameIn(List<String> values) {
            addCriterion("resorts_business_real_name in", values, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameNotIn(List<String> values) {
            addCriterion("resorts_business_real_name not in", values, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameBetween(String value1, String value2) {
            addCriterion("resorts_business_real_name between", value1, value2, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andResortsBusinessRealNameNotBetween(String value1, String value2) {
            addCriterion("resorts_business_real_name not between", value1, value2, "resortsBusinessRealName");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNull() {
            addCriterion("post_fee is null");
            return (Criteria) this;
        }

        public Criteria andPostFeeIsNotNull() {
            addCriterion("post_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPostFeeEqualTo(Long value) {
            addCriterion("post_fee =", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotEqualTo(Long value) {
            addCriterion("post_fee <>", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThan(Long value) {
            addCriterion("post_fee >", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("post_fee >=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThan(Long value) {
            addCriterion("post_fee <", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeLessThanOrEqualTo(Long value) {
            addCriterion("post_fee <=", value, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeIn(List<Long> values) {
            addCriterion("post_fee in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotIn(List<Long> values) {
            addCriterion("post_fee not in", values, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeBetween(Long value1, Long value2) {
            addCriterion("post_fee between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostFeeNotBetween(Long value1, Long value2) {
            addCriterion("post_fee not between", value1, value2, "postFee");
            return (Criteria) this;
        }

        public Criteria andPostTypeIsNull() {
            addCriterion("post_type is null");
            return (Criteria) this;
        }

        public Criteria andPostTypeIsNotNull() {
            addCriterion("post_type is not null");
            return (Criteria) this;
        }

        public Criteria andPostTypeEqualTo(String value) {
            addCriterion("post_type =", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotEqualTo(String value) {
            addCriterion("post_type <>", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeGreaterThan(String value) {
            addCriterion("post_type >", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeGreaterThanOrEqualTo(String value) {
            addCriterion("post_type >=", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLessThan(String value) {
            addCriterion("post_type <", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLessThanOrEqualTo(String value) {
            addCriterion("post_type <=", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeLike(String value) {
            addCriterion("post_type like", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotLike(String value) {
            addCriterion("post_type not like", value, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeIn(List<String> values) {
            addCriterion("post_type in", values, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotIn(List<String> values) {
            addCriterion("post_type not in", values, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeBetween(String value1, String value2) {
            addCriterion("post_type between", value1, value2, "postType");
            return (Criteria) this;
        }

        public Criteria andPostTypeNotBetween(String value1, String value2) {
            addCriterion("post_type not between", value1, value2, "postType");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Long value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Long value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Long value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Long value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Long> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Long> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Long value1, Long value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andIsPayedIsNull() {
            addCriterion("is_payed is null");
            return (Criteria) this;
        }

        public Criteria andIsPayedIsNotNull() {
            addCriterion("is_payed is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayedEqualTo(String value) {
            addCriterion("is_payed =", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotEqualTo(String value) {
            addCriterion("is_payed <>", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedGreaterThan(String value) {
            addCriterion("is_payed >", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedGreaterThanOrEqualTo(String value) {
            addCriterion("is_payed >=", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedLessThan(String value) {
            addCriterion("is_payed <", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedLessThanOrEqualTo(String value) {
            addCriterion("is_payed <=", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedLike(String value) {
            addCriterion("is_payed like", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotLike(String value) {
            addCriterion("is_payed not like", value, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedIn(List<String> values) {
            addCriterion("is_payed in", values, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotIn(List<String> values) {
            addCriterion("is_payed not in", values, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedBetween(String value1, String value2) {
            addCriterion("is_payed between", value1, value2, "isPayed");
            return (Criteria) this;
        }

        public Criteria andIsPayedNotBetween(String value1, String value2) {
            addCriterion("is_payed not between", value1, value2, "isPayed");
            return (Criteria) this;
        }

        public Criteria andPayedTimeIsNull() {
            addCriterion("payed_time is null");
            return (Criteria) this;
        }

        public Criteria andPayedTimeIsNotNull() {
            addCriterion("payed_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayedTimeEqualTo(Date value) {
            addCriterion("payed_time =", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeNotEqualTo(Date value) {
            addCriterion("payed_time <>", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeGreaterThan(Date value) {
            addCriterion("payed_time >", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("payed_time >=", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeLessThan(Date value) {
            addCriterion("payed_time <", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeLessThanOrEqualTo(Date value) {
            addCriterion("payed_time <=", value, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeIn(List<Date> values) {
            addCriterion("payed_time in", values, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeNotIn(List<Date> values) {
            addCriterion("payed_time not in", values, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeBetween(Date value1, Date value2) {
            addCriterion("payed_time between", value1, value2, "payedTime");
            return (Criteria) this;
        }

        public Criteria andPayedTimeNotBetween(Date value1, Date value2) {
            addCriterion("payed_time not between", value1, value2, "payedTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeIsNull() {
            addCriterion("confirm_receipt_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeIsNotNull() {
            addCriterion("confirm_receipt_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeEqualTo(Date value) {
            addCriterion("confirm_receipt_time =", value, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeNotEqualTo(Date value) {
            addCriterion("confirm_receipt_time <>", value, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeGreaterThan(Date value) {
            addCriterion("confirm_receipt_time >", value, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_receipt_time >=", value, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeLessThan(Date value) {
            addCriterion("confirm_receipt_time <", value, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_receipt_time <=", value, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeIn(List<Date> values) {
            addCriterion("confirm_receipt_time in", values, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeNotIn(List<Date> values) {
            addCriterion("confirm_receipt_time not in", values, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_receipt_time between", value1, value2, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andConfirmReceiptTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_receipt_time not between", value1, value2, "confirmReceiptTime");
            return (Criteria) this;
        }

        public Criteria andTakeWaysIsNull() {
            addCriterion("take_ways is null");
            return (Criteria) this;
        }

        public Criteria andTakeWaysIsNotNull() {
            addCriterion("take_ways is not null");
            return (Criteria) this;
        }

        public Criteria andTakeWaysEqualTo(String value) {
            addCriterion("take_ways =", value, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysNotEqualTo(String value) {
            addCriterion("take_ways <>", value, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysGreaterThan(String value) {
            addCriterion("take_ways >", value, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysGreaterThanOrEqualTo(String value) {
            addCriterion("take_ways >=", value, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysLessThan(String value) {
            addCriterion("take_ways <", value, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysLessThanOrEqualTo(String value) {
            addCriterion("take_ways <=", value, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysLike(String value) {
            addCriterion("take_ways like", value, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysNotLike(String value) {
            addCriterion("take_ways not like", value, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysIn(List<String> values) {
            addCriterion("take_ways in", values, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysNotIn(List<String> values) {
            addCriterion("take_ways not in", values, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysBetween(String value1, String value2) {
            addCriterion("take_ways between", value1, value2, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakeWaysNotBetween(String value1, String value2) {
            addCriterion("take_ways not between", value1, value2, "takeWays");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdIsNull() {
            addCriterion("takegoods_id is null");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdIsNotNull() {
            addCriterion("takegoods_id is not null");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdEqualTo(Long value) {
            addCriterion("takegoods_id =", value, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdNotEqualTo(Long value) {
            addCriterion("takegoods_id <>", value, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdGreaterThan(Long value) {
            addCriterion("takegoods_id >", value, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("takegoods_id >=", value, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdLessThan(Long value) {
            addCriterion("takegoods_id <", value, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("takegoods_id <=", value, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdIn(List<Long> values) {
            addCriterion("takegoods_id in", values, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdNotIn(List<Long> values) {
            addCriterion("takegoods_id not in", values, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdBetween(Long value1, Long value2) {
            addCriterion("takegoods_id between", value1, value2, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andTakegoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("takegoods_id not between", value1, value2, "takegoodsId");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusIsNull() {
            addCriterion("workflow_status is null");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusIsNotNull() {
            addCriterion("workflow_status is not null");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusEqualTo(String value) {
            addCriterion("workflow_status =", value, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusNotEqualTo(String value) {
            addCriterion("workflow_status <>", value, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusGreaterThan(String value) {
            addCriterion("workflow_status >", value, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusGreaterThanOrEqualTo(String value) {
            addCriterion("workflow_status >=", value, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusLessThan(String value) {
            addCriterion("workflow_status <", value, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusLessThanOrEqualTo(String value) {
            addCriterion("workflow_status <=", value, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusLike(String value) {
            addCriterion("workflow_status like", value, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusNotLike(String value) {
            addCriterion("workflow_status not like", value, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusIn(List<String> values) {
            addCriterion("workflow_status in", values, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusNotIn(List<String> values) {
            addCriterion("workflow_status not in", values, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusBetween(String value1, String value2) {
            addCriterion("workflow_status between", value1, value2, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andWorkflowStatusNotBetween(String value1, String value2) {
            addCriterion("workflow_status not between", value1, value2, "workflowStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNull() {
            addCriterion("refund_status is null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIsNotNull() {
            addCriterion("refund_status is not null");
            return (Criteria) this;
        }

        public Criteria andRefundStatusEqualTo(String value) {
            addCriterion("refund_status =", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotEqualTo(String value) {
            addCriterion("refund_status <>", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThan(String value) {
            addCriterion("refund_status >", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusGreaterThanOrEqualTo(String value) {
            addCriterion("refund_status >=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThan(String value) {
            addCriterion("refund_status <", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLessThanOrEqualTo(String value) {
            addCriterion("refund_status <=", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusLike(String value) {
            addCriterion("refund_status like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotLike(String value) {
            addCriterion("refund_status not like", value, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusIn(List<String> values) {
            addCriterion("refund_status in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotIn(List<String> values) {
            addCriterion("refund_status not in", values, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusBetween(String value1, String value2) {
            addCriterion("refund_status between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andRefundStatusNotBetween(String value1, String value2) {
            addCriterion("refund_status not between", value1, value2, "refundStatus");
            return (Criteria) this;
        }

        public Criteria andSellerMemoIsNull() {
            addCriterion("seller_memo is null");
            return (Criteria) this;
        }

        public Criteria andSellerMemoIsNotNull() {
            addCriterion("seller_memo is not null");
            return (Criteria) this;
        }

        public Criteria andSellerMemoEqualTo(String value) {
            addCriterion("seller_memo =", value, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoNotEqualTo(String value) {
            addCriterion("seller_memo <>", value, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoGreaterThan(String value) {
            addCriterion("seller_memo >", value, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoGreaterThanOrEqualTo(String value) {
            addCriterion("seller_memo >=", value, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoLessThan(String value) {
            addCriterion("seller_memo <", value, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoLessThanOrEqualTo(String value) {
            addCriterion("seller_memo <=", value, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoLike(String value) {
            addCriterion("seller_memo like", value, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoNotLike(String value) {
            addCriterion("seller_memo not like", value, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoIn(List<String> values) {
            addCriterion("seller_memo in", values, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoNotIn(List<String> values) {
            addCriterion("seller_memo not in", values, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoBetween(String value1, String value2) {
            addCriterion("seller_memo between", value1, value2, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerMemoNotBetween(String value1, String value2) {
            addCriterion("seller_memo not between", value1, value2, "sellerMemo");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteIsNull() {
            addCriterion("seller_delete is null");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteIsNotNull() {
            addCriterion("seller_delete is not null");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteEqualTo(String value) {
            addCriterion("seller_delete =", value, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteNotEqualTo(String value) {
            addCriterion("seller_delete <>", value, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteGreaterThan(String value) {
            addCriterion("seller_delete >", value, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("seller_delete >=", value, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteLessThan(String value) {
            addCriterion("seller_delete <", value, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteLessThanOrEqualTo(String value) {
            addCriterion("seller_delete <=", value, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteLike(String value) {
            addCriterion("seller_delete like", value, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteNotLike(String value) {
            addCriterion("seller_delete not like", value, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteIn(List<String> values) {
            addCriterion("seller_delete in", values, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteNotIn(List<String> values) {
            addCriterion("seller_delete not in", values, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteBetween(String value1, String value2) {
            addCriterion("seller_delete between", value1, value2, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andSellerDeleteNotBetween(String value1, String value2) {
            addCriterion("seller_delete not between", value1, value2, "sellerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteIsNull() {
            addCriterion("buyer_delete is null");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteIsNotNull() {
            addCriterion("buyer_delete is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteEqualTo(String value) {
            addCriterion("buyer_delete =", value, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteNotEqualTo(String value) {
            addCriterion("buyer_delete <>", value, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteGreaterThan(String value) {
            addCriterion("buyer_delete >", value, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_delete >=", value, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteLessThan(String value) {
            addCriterion("buyer_delete <", value, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteLessThanOrEqualTo(String value) {
            addCriterion("buyer_delete <=", value, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteLike(String value) {
            addCriterion("buyer_delete like", value, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteNotLike(String value) {
            addCriterion("buyer_delete not like", value, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteIn(List<String> values) {
            addCriterion("buyer_delete in", values, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteNotIn(List<String> values) {
            addCriterion("buyer_delete not in", values, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteBetween(String value1, String value2) {
            addCriterion("buyer_delete between", value1, value2, "buyerDelete");
            return (Criteria) this;
        }

        public Criteria andBuyerDeleteNotBetween(String value1, String value2) {
            addCriterion("buyer_delete not between", value1, value2, "buyerDelete");
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

        public Criteria andGroupPurchaseEndTimeIsNull() {
            addCriterion("group_purchase_end_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeIsNotNull() {
            addCriterion("group_purchase_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeEqualTo(Date value) {
            addCriterion("group_purchase_end_time =", value, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeNotEqualTo(Date value) {
            addCriterion("group_purchase_end_time <>", value, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeGreaterThan(Date value) {
            addCriterion("group_purchase_end_time >", value, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("group_purchase_end_time >=", value, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeLessThan(Date value) {
            addCriterion("group_purchase_end_time <", value, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("group_purchase_end_time <=", value, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeIn(List<Date> values) {
            addCriterion("group_purchase_end_time in", values, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeNotIn(List<Date> values) {
            addCriterion("group_purchase_end_time not in", values, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeBetween(Date value1, Date value2) {
            addCriterion("group_purchase_end_time between", value1, value2, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("group_purchase_end_time not between", value1, value2, "groupPurchaseEndTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeIsNull() {
            addCriterion("group_purchase_begin_time is null");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeIsNotNull() {
            addCriterion("group_purchase_begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeEqualTo(Date value) {
            addCriterion("group_purchase_begin_time =", value, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeNotEqualTo(Date value) {
            addCriterion("group_purchase_begin_time <>", value, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeGreaterThan(Date value) {
            addCriterion("group_purchase_begin_time >", value, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("group_purchase_begin_time >=", value, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeLessThan(Date value) {
            addCriterion("group_purchase_begin_time <", value, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("group_purchase_begin_time <=", value, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeIn(List<Date> values) {
            addCriterion("group_purchase_begin_time in", values, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeNotIn(List<Date> values) {
            addCriterion("group_purchase_begin_time not in", values, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeBetween(Date value1, Date value2) {
            addCriterion("group_purchase_begin_time between", value1, value2, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andGroupPurchaseBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("group_purchase_begin_time not between", value1, value2, "groupPurchaseBeginTime");
            return (Criteria) this;
        }

        public Criteria andDelStatusIsNull() {
            addCriterion("del_status is null");
            return (Criteria) this;
        }

        public Criteria andDelStatusIsNotNull() {
            addCriterion("del_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelStatusEqualTo(String value) {
            addCriterion("del_status =", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotEqualTo(String value) {
            addCriterion("del_status <>", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThan(String value) {
            addCriterion("del_status >", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusGreaterThanOrEqualTo(String value) {
            addCriterion("del_status >=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThan(String value) {
            addCriterion("del_status <", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLessThanOrEqualTo(String value) {
            addCriterion("del_status <=", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusLike(String value) {
            addCriterion("del_status like", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotLike(String value) {
            addCriterion("del_status not like", value, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusIn(List<String> values) {
            addCriterion("del_status in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotIn(List<String> values) {
            addCriterion("del_status not in", values, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusBetween(String value1, String value2) {
            addCriterion("del_status between", value1, value2, "delStatus");
            return (Criteria) this;
        }

        public Criteria andDelStatusNotBetween(String value1, String value2) {
            addCriterion("del_status not between", value1, value2, "delStatus");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNull() {
            addCriterion("qr_code is null");
            return (Criteria) this;
        }

        public Criteria andQrCodeIsNotNull() {
            addCriterion("qr_code is not null");
            return (Criteria) this;
        }

        public Criteria andQrCodeEqualTo(String value) {
            addCriterion("qr_code =", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotEqualTo(String value) {
            addCriterion("qr_code <>", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThan(String value) {
            addCriterion("qr_code >", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qr_code >=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThan(String value) {
            addCriterion("qr_code <", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLessThanOrEqualTo(String value) {
            addCriterion("qr_code <=", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeLike(String value) {
            addCriterion("qr_code like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotLike(String value) {
            addCriterion("qr_code not like", value, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeIn(List<String> values) {
            addCriterion("qr_code in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotIn(List<String> values) {
            addCriterion("qr_code not in", values, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeBetween(String value1, String value2) {
            addCriterion("qr_code between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andQrCodeNotBetween(String value1, String value2) {
            addCriterion("qr_code not between", value1, value2, "qrCode");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNull() {
            addCriterion("send_status is null");
            return (Criteria) this;
        }

        public Criteria andSendStatusIsNotNull() {
            addCriterion("send_status is not null");
            return (Criteria) this;
        }

        public Criteria andSendStatusEqualTo(String value) {
            addCriterion("send_status =", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotEqualTo(String value) {
            addCriterion("send_status <>", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThan(String value) {
            addCriterion("send_status >", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusGreaterThanOrEqualTo(String value) {
            addCriterion("send_status >=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThan(String value) {
            addCriterion("send_status <", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLessThanOrEqualTo(String value) {
            addCriterion("send_status <=", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusLike(String value) {
            addCriterion("send_status like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotLike(String value) {
            addCriterion("send_status not like", value, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusIn(List<String> values) {
            addCriterion("send_status in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotIn(List<String> values) {
            addCriterion("send_status not in", values, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusBetween(String value1, String value2) {
            addCriterion("send_status between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andSendStatusNotBetween(String value1, String value2) {
            addCriterion("send_status not between", value1, value2, "sendStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusIsNull() {
            addCriterion("validation_status is null");
            return (Criteria) this;
        }

        public Criteria andValidationStatusIsNotNull() {
            addCriterion("validation_status is not null");
            return (Criteria) this;
        }

        public Criteria andValidationStatusEqualTo(String value) {
            addCriterion("validation_status =", value, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusNotEqualTo(String value) {
            addCriterion("validation_status <>", value, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusGreaterThan(String value) {
            addCriterion("validation_status >", value, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusGreaterThanOrEqualTo(String value) {
            addCriterion("validation_status >=", value, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusLessThan(String value) {
            addCriterion("validation_status <", value, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusLessThanOrEqualTo(String value) {
            addCriterion("validation_status <=", value, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusLike(String value) {
            addCriterion("validation_status like", value, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusNotLike(String value) {
            addCriterion("validation_status not like", value, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusIn(List<String> values) {
            addCriterion("validation_status in", values, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusNotIn(List<String> values) {
            addCriterion("validation_status not in", values, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusBetween(String value1, String value2) {
            addCriterion("validation_status between", value1, value2, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andValidationStatusNotBetween(String value1, String value2) {
            addCriterion("validation_status not between", value1, value2, "validationStatus");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeIsNull() {
            addCriterion("validation_time is null");
            return (Criteria) this;
        }

        public Criteria andValidationTimeIsNotNull() {
            addCriterion("validation_time is not null");
            return (Criteria) this;
        }

        public Criteria andValidationTimeEqualTo(Date value) {
            addCriterion("validation_time =", value, "validationTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeNotEqualTo(Date value) {
            addCriterion("validation_time <>", value, "validationTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeGreaterThan(Date value) {
            addCriterion("validation_time >", value, "validationTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("validation_time >=", value, "validationTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeLessThan(Date value) {
            addCriterion("validation_time <", value, "validationTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeLessThanOrEqualTo(Date value) {
            addCriterion("validation_time <=", value, "validationTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeIn(List<Date> values) {
            addCriterion("validation_time in", values, "validationTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeNotIn(List<Date> values) {
            addCriterion("validation_time not in", values, "validationTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeBetween(Date value1, Date value2) {
            addCriterion("validation_time between", value1, value2, "validationTime");
            return (Criteria) this;
        }

        public Criteria andValidationTimeNotBetween(Date value1, Date value2) {
            addCriterion("validation_time not between", value1, value2, "validationTime");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNull() {
            addCriterion("order_no is null");
            return (Criteria) this;
        }

        public Criteria andOrderNoIsNotNull() {
            addCriterion("order_no is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNoEqualTo(String value) {
            addCriterion("order_no =", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotEqualTo(String value) {
            addCriterion("order_no <>", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThan(String value) {
            addCriterion("order_no >", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("order_no >=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThan(String value) {
            addCriterion("order_no <", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLessThanOrEqualTo(String value) {
            addCriterion("order_no <=", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoLike(String value) {
            addCriterion("order_no like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotLike(String value) {
            addCriterion("order_no not like", value, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoIn(List<String> values) {
            addCriterion("order_no in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotIn(List<String> values) {
            addCriterion("order_no not in", values, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoBetween(String value1, String value2) {
            addCriterion("order_no between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andOrderNoNotBetween(String value1, String value2) {
            addCriterion("order_no not between", value1, value2, "orderNo");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdIsNull() {
            addCriterion("payment_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdIsNotNull() {
            addCriterion("payment_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdEqualTo(String value) {
            addCriterion("payment_flow_id =", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdNotEqualTo(String value) {
            addCriterion("payment_flow_id <>", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdGreaterThan(String value) {
            addCriterion("payment_flow_id >", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdGreaterThanOrEqualTo(String value) {
            addCriterion("payment_flow_id >=", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdLessThan(String value) {
            addCriterion("payment_flow_id <", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdLessThanOrEqualTo(String value) {
            addCriterion("payment_flow_id <=", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdLike(String value) {
            addCriterion("payment_flow_id like", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdNotLike(String value) {
            addCriterion("payment_flow_id not like", value, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdIn(List<String> values) {
            addCriterion("payment_flow_id in", values, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdNotIn(List<String> values) {
            addCriterion("payment_flow_id not in", values, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdBetween(String value1, String value2) {
            addCriterion("payment_flow_id between", value1, value2, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andPaymentFlowIdNotBetween(String value1, String value2) {
            addCriterion("payment_flow_id not between", value1, value2, "paymentFlowId");
            return (Criteria) this;
        }

        public Criteria andGainMoneyIsNull() {
            addCriterion("gain_money is null");
            return (Criteria) this;
        }

        public Criteria andGainMoneyIsNotNull() {
            addCriterion("gain_money is not null");
            return (Criteria) this;
        }

        public Criteria andGainMoneyEqualTo(Long value) {
            addCriterion("gain_money =", value, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGainMoneyNotEqualTo(Long value) {
            addCriterion("gain_money <>", value, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGainMoneyGreaterThan(Long value) {
            addCriterion("gain_money >", value, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGainMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("gain_money >=", value, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGainMoneyLessThan(Long value) {
            addCriterion("gain_money <", value, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGainMoneyLessThanOrEqualTo(Long value) {
            addCriterion("gain_money <=", value, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGainMoneyIn(List<Long> values) {
            addCriterion("gain_money in", values, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGainMoneyNotIn(List<Long> values) {
            addCriterion("gain_money not in", values, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGainMoneyBetween(Long value1, Long value2) {
            addCriterion("gain_money between", value1, value2, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGainMoneyNotBetween(Long value1, Long value2) {
            addCriterion("gain_money not between", value1, value2, "gainMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNull() {
            addCriterion("gift_money is null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIsNotNull() {
            addCriterion("gift_money is not null");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyEqualTo(Long value) {
            addCriterion("gift_money =", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotEqualTo(Long value) {
            addCriterion("gift_money <>", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThan(Long value) {
            addCriterion("gift_money >", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("gift_money >=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThan(Long value) {
            addCriterion("gift_money <", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyLessThanOrEqualTo(Long value) {
            addCriterion("gift_money <=", value, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyIn(List<Long> values) {
            addCriterion("gift_money in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotIn(List<Long> values) {
            addCriterion("gift_money not in", values, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyBetween(Long value1, Long value2) {
            addCriterion("gift_money between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andGiftMoneyNotBetween(Long value1, Long value2) {
            addCriterion("gift_money not between", value1, value2, "giftMoney");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNull() {
            addCriterion("user_point is null");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNotNull() {
            addCriterion("user_point is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointEqualTo(Long value) {
            addCriterion("user_point =", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotEqualTo(Long value) {
            addCriterion("user_point <>", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThan(Long value) {
            addCriterion("user_point >", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThanOrEqualTo(Long value) {
            addCriterion("user_point >=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThan(Long value) {
            addCriterion("user_point <", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThanOrEqualTo(Long value) {
            addCriterion("user_point <=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointIn(List<Long> values) {
            addCriterion("user_point in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotIn(List<Long> values) {
            addCriterion("user_point not in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointBetween(Long value1, Long value2) {
            addCriterion("user_point between", value1, value2, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotBetween(Long value1, Long value2) {
            addCriterion("user_point not between", value1, value2, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountIsNull() {
            addCriterion("user_point_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountIsNotNull() {
            addCriterion("user_point_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountEqualTo(Long value) {
            addCriterion("user_point_amount =", value, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountNotEqualTo(Long value) {
            addCriterion("user_point_amount <>", value, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountGreaterThan(Long value) {
            addCriterion("user_point_amount >", value, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_point_amount >=", value, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountLessThan(Long value) {
            addCriterion("user_point_amount <", value, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountLessThanOrEqualTo(Long value) {
            addCriterion("user_point_amount <=", value, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountIn(List<Long> values) {
            addCriterion("user_point_amount in", values, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountNotIn(List<Long> values) {
            addCriterion("user_point_amount not in", values, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountBetween(Long value1, Long value2) {
            addCriterion("user_point_amount between", value1, value2, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andUserPointAmountNotBetween(Long value1, Long value2) {
            addCriterion("user_point_amount not between", value1, value2, "userPointAmount");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNull() {
            addCriterion("batch_No is null");
            return (Criteria) this;
        }

        public Criteria andBatchNoIsNotNull() {
            addCriterion("batch_No is not null");
            return (Criteria) this;
        }

        public Criteria andBatchNoEqualTo(Long value) {
            addCriterion("batch_No =", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotEqualTo(Long value) {
            addCriterion("batch_No <>", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThan(Long value) {
            addCriterion("batch_No >", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoGreaterThanOrEqualTo(Long value) {
            addCriterion("batch_No >=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThan(Long value) {
            addCriterion("batch_No <", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoLessThanOrEqualTo(Long value) {
            addCriterion("batch_No <=", value, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoIn(List<Long> values) {
            addCriterion("batch_No in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotIn(List<Long> values) {
            addCriterion("batch_No not in", values, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoBetween(Long value1, Long value2) {
            addCriterion("batch_No between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andBatchNoNotBetween(Long value1, Long value2) {
            addCriterion("batch_No not between", value1, value2, "batchNo");
            return (Criteria) this;
        }

        public Criteria andPaymentWayIsNull() {
            addCriterion("payment_way is null");
            return (Criteria) this;
        }

        public Criteria andPaymentWayIsNotNull() {
            addCriterion("payment_way is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentWayEqualTo(String value) {
            addCriterion("payment_way =", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotEqualTo(String value) {
            addCriterion("payment_way <>", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayGreaterThan(String value) {
            addCriterion("payment_way >", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayGreaterThanOrEqualTo(String value) {
            addCriterion("payment_way >=", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayLessThan(String value) {
            addCriterion("payment_way <", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayLessThanOrEqualTo(String value) {
            addCriterion("payment_way <=", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayLike(String value) {
            addCriterion("payment_way like", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotLike(String value) {
            addCriterion("payment_way not like", value, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayIn(List<String> values) {
            addCriterion("payment_way in", values, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotIn(List<String> values) {
            addCriterion("payment_way not in", values, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayBetween(String value1, String value2) {
            addCriterion("payment_way between", value1, value2, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andPaymentWayNotBetween(String value1, String value2) {
            addCriterion("payment_way not between", value1, value2, "paymentWay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayIsNull() {
            addCriterion("add_up_pay is null");
            return (Criteria) this;
        }

        public Criteria andAddUpPayIsNotNull() {
            addCriterion("add_up_pay is not null");
            return (Criteria) this;
        }

        public Criteria andAddUpPayEqualTo(Long value) {
            addCriterion("add_up_pay =", value, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayNotEqualTo(Long value) {
            addCriterion("add_up_pay <>", value, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayGreaterThan(Long value) {
            addCriterion("add_up_pay >", value, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayGreaterThanOrEqualTo(Long value) {
            addCriterion("add_up_pay >=", value, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayLessThan(Long value) {
            addCriterion("add_up_pay <", value, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayLessThanOrEqualTo(Long value) {
            addCriterion("add_up_pay <=", value, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayIn(List<Long> values) {
            addCriterion("add_up_pay in", values, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayNotIn(List<Long> values) {
            addCriterion("add_up_pay not in", values, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayBetween(Long value1, Long value2) {
            addCriterion("add_up_pay between", value1, value2, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andAddUpPayNotBetween(Long value1, Long value2) {
            addCriterion("add_up_pay not between", value1, value2, "addUpPay");
            return (Criteria) this;
        }

        public Criteria andDownPaymentIsNull() {
            addCriterion("down_payment is null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentIsNotNull() {
            addCriterion("down_payment is not null");
            return (Criteria) this;
        }

        public Criteria andDownPaymentEqualTo(Long value) {
            addCriterion("down_payment =", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentNotEqualTo(Long value) {
            addCriterion("down_payment <>", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentGreaterThan(Long value) {
            addCriterion("down_payment >", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentGreaterThanOrEqualTo(Long value) {
            addCriterion("down_payment >=", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentLessThan(Long value) {
            addCriterion("down_payment <", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentLessThanOrEqualTo(Long value) {
            addCriterion("down_payment <=", value, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentIn(List<Long> values) {
            addCriterion("down_payment in", values, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentNotIn(List<Long> values) {
            addCriterion("down_payment not in", values, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentBetween(Long value1, Long value2) {
            addCriterion("down_payment between", value1, value2, "downPayment");
            return (Criteria) this;
        }

        public Criteria andDownPaymentNotBetween(Long value1, Long value2) {
            addCriterion("down_payment not between", value1, value2, "downPayment");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountIsNull() {
            addCriterion("brokerage_amount is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountIsNotNull() {
            addCriterion("brokerage_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountEqualTo(Long value) {
            addCriterion("brokerage_amount =", value, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountNotEqualTo(Long value) {
            addCriterion("brokerage_amount <>", value, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountGreaterThan(Long value) {
            addCriterion("brokerage_amount >", value, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("brokerage_amount >=", value, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountLessThan(Long value) {
            addCriterion("brokerage_amount <", value, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountLessThanOrEqualTo(Long value) {
            addCriterion("brokerage_amount <=", value, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountIn(List<Long> values) {
            addCriterion("brokerage_amount in", values, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountNotIn(List<Long> values) {
            addCriterion("brokerage_amount not in", values, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountBetween(Long value1, Long value2) {
            addCriterion("brokerage_amount between", value1, value2, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andBrokerageAmountNotBetween(Long value1, Long value2) {
            addCriterion("brokerage_amount not between", value1, value2, "brokerageAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountIsNull() {
            addCriterion("first_pay_amount is null");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountIsNotNull() {
            addCriterion("first_pay_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountEqualTo(Float value) {
            addCriterion("first_pay_amount =", value, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountNotEqualTo(Float value) {
            addCriterion("first_pay_amount <>", value, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountGreaterThan(Float value) {
            addCriterion("first_pay_amount >", value, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountGreaterThanOrEqualTo(Float value) {
            addCriterion("first_pay_amount >=", value, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountLessThan(Float value) {
            addCriterion("first_pay_amount <", value, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountLessThanOrEqualTo(Float value) {
            addCriterion("first_pay_amount <=", value, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountIn(List<Float> values) {
            addCriterion("first_pay_amount in", values, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountNotIn(List<Float> values) {
            addCriterion("first_pay_amount not in", values, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountBetween(Float value1, Float value2) {
            addCriterion("first_pay_amount between", value1, value2, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andFirstPayAmountNotBetween(Float value1, Float value2) {
            addCriterion("first_pay_amount not between", value1, value2, "firstPayAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountIsNull() {
            addCriterion("invoice_tax_amount is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountIsNotNull() {
            addCriterion("invoice_tax_amount is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountEqualTo(Long value) {
            addCriterion("invoice_tax_amount =", value, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountNotEqualTo(Long value) {
            addCriterion("invoice_tax_amount <>", value, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountGreaterThan(Long value) {
            addCriterion("invoice_tax_amount >", value, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("invoice_tax_amount >=", value, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountLessThan(Long value) {
            addCriterion("invoice_tax_amount <", value, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountLessThanOrEqualTo(Long value) {
            addCriterion("invoice_tax_amount <=", value, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountIn(List<Long> values) {
            addCriterion("invoice_tax_amount in", values, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountNotIn(List<Long> values) {
            addCriterion("invoice_tax_amount not in", values, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountBetween(Long value1, Long value2) {
            addCriterion("invoice_tax_amount between", value1, value2, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAmountNotBetween(Long value1, Long value2) {
            addCriterion("invoice_tax_amount not between", value1, value2, "invoiceTaxAmount");
            return (Criteria) this;
        }

        public Criteria andPayCountIsNull() {
            addCriterion("pay_count is null");
            return (Criteria) this;
        }

        public Criteria andPayCountIsNotNull() {
            addCriterion("pay_count is not null");
            return (Criteria) this;
        }

        public Criteria andPayCountEqualTo(Long value) {
            addCriterion("pay_count =", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountNotEqualTo(Long value) {
            addCriterion("pay_count <>", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountGreaterThan(Long value) {
            addCriterion("pay_count >", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_count >=", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountLessThan(Long value) {
            addCriterion("pay_count <", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountLessThanOrEqualTo(Long value) {
            addCriterion("pay_count <=", value, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountIn(List<Long> values) {
            addCriterion("pay_count in", values, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountNotIn(List<Long> values) {
            addCriterion("pay_count not in", values, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountBetween(Long value1, Long value2) {
            addCriterion("pay_count between", value1, value2, "payCount");
            return (Criteria) this;
        }

        public Criteria andPayCountNotBetween(Long value1, Long value2) {
            addCriterion("pay_count not between", value1, value2, "payCount");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingIsNull() {
            addCriterion("is_invoicing is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingIsNotNull() {
            addCriterion("is_invoicing is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingEqualTo(String value) {
            addCriterion("is_invoicing =", value, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingNotEqualTo(String value) {
            addCriterion("is_invoicing <>", value, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingGreaterThan(String value) {
            addCriterion("is_invoicing >", value, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingGreaterThanOrEqualTo(String value) {
            addCriterion("is_invoicing >=", value, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingLessThan(String value) {
            addCriterion("is_invoicing <", value, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingLessThanOrEqualTo(String value) {
            addCriterion("is_invoicing <=", value, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingLike(String value) {
            addCriterion("is_invoicing like", value, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingNotLike(String value) {
            addCriterion("is_invoicing not like", value, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingIn(List<String> values) {
            addCriterion("is_invoicing in", values, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingNotIn(List<String> values) {
            addCriterion("is_invoicing not in", values, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingBetween(String value1, String value2) {
            addCriterion("is_invoicing between", value1, value2, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsInvoicingNotBetween(String value1, String value2) {
            addCriterion("is_invoicing not between", value1, value2, "isInvoicing");
            return (Criteria) this;
        }

        public Criteria andIsBuyIsNull() {
            addCriterion("is_buy is null");
            return (Criteria) this;
        }

        public Criteria andIsBuyIsNotNull() {
            addCriterion("is_buy is not null");
            return (Criteria) this;
        }

        public Criteria andIsBuyEqualTo(String value) {
            addCriterion("is_buy =", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotEqualTo(String value) {
            addCriterion("is_buy <>", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyGreaterThan(String value) {
            addCriterion("is_buy >", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyGreaterThanOrEqualTo(String value) {
            addCriterion("is_buy >=", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyLessThan(String value) {
            addCriterion("is_buy <", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyLessThanOrEqualTo(String value) {
            addCriterion("is_buy <=", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyLike(String value) {
            addCriterion("is_buy like", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotLike(String value) {
            addCriterion("is_buy not like", value, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyIn(List<String> values) {
            addCriterion("is_buy in", values, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotIn(List<String> values) {
            addCriterion("is_buy not in", values, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyBetween(String value1, String value2) {
            addCriterion("is_buy between", value1, value2, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsBuyNotBetween(String value1, String value2) {
            addCriterion("is_buy not between", value1, value2, "isBuy");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersIsNull() {
            addCriterion("is_special_orders is null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersIsNotNull() {
            addCriterion("is_special_orders is not null");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersEqualTo(String value) {
            addCriterion("is_special_orders =", value, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersNotEqualTo(String value) {
            addCriterion("is_special_orders <>", value, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersGreaterThan(String value) {
            addCriterion("is_special_orders >", value, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersGreaterThanOrEqualTo(String value) {
            addCriterion("is_special_orders >=", value, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersLessThan(String value) {
            addCriterion("is_special_orders <", value, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersLessThanOrEqualTo(String value) {
            addCriterion("is_special_orders <=", value, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersLike(String value) {
            addCriterion("is_special_orders like", value, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersNotLike(String value) {
            addCriterion("is_special_orders not like", value, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersIn(List<String> values) {
            addCriterion("is_special_orders in", values, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersNotIn(List<String> values) {
            addCriterion("is_special_orders not in", values, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersBetween(String value1, String value2) {
            addCriterion("is_special_orders between", value1, value2, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andIsSpecialOrdersNotBetween(String value1, String value2) {
            addCriterion("is_special_orders not between", value1, value2, "isSpecialOrders");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlIsNull() {
            addCriterion("special_orders_url is null");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlIsNotNull() {
            addCriterion("special_orders_url is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlEqualTo(String value) {
            addCriterion("special_orders_url =", value, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlNotEqualTo(String value) {
            addCriterion("special_orders_url <>", value, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlGreaterThan(String value) {
            addCriterion("special_orders_url >", value, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlGreaterThanOrEqualTo(String value) {
            addCriterion("special_orders_url >=", value, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlLessThan(String value) {
            addCriterion("special_orders_url <", value, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlLessThanOrEqualTo(String value) {
            addCriterion("special_orders_url <=", value, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlLike(String value) {
            addCriterion("special_orders_url like", value, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlNotLike(String value) {
            addCriterion("special_orders_url not like", value, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlIn(List<String> values) {
            addCriterion("special_orders_url in", values, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlNotIn(List<String> values) {
            addCriterion("special_orders_url not in", values, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlBetween(String value1, String value2) {
            addCriterion("special_orders_url between", value1, value2, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andSpecialOrdersUrlNotBetween(String value1, String value2) {
            addCriterion("special_orders_url not between", value1, value2, "specialOrdersUrl");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsIsNull() {
            addCriterion("is_point_logistics is null");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsIsNotNull() {
            addCriterion("is_point_logistics is not null");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsEqualTo(String value) {
            addCriterion("is_point_logistics =", value, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsNotEqualTo(String value) {
            addCriterion("is_point_logistics <>", value, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsGreaterThan(String value) {
            addCriterion("is_point_logistics >", value, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsGreaterThanOrEqualTo(String value) {
            addCriterion("is_point_logistics >=", value, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsLessThan(String value) {
            addCriterion("is_point_logistics <", value, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsLessThanOrEqualTo(String value) {
            addCriterion("is_point_logistics <=", value, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsLike(String value) {
            addCriterion("is_point_logistics like", value, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsNotLike(String value) {
            addCriterion("is_point_logistics not like", value, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsIn(List<String> values) {
            addCriterion("is_point_logistics in", values, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsNotIn(List<String> values) {
            addCriterion("is_point_logistics not in", values, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsBetween(String value1, String value2) {
            addCriterion("is_point_logistics between", value1, value2, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andIsPointLogisticsNotBetween(String value1, String value2) {
            addCriterion("is_point_logistics not between", value1, value2, "isPointLogistics");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIsNull() {
            addCriterion("logistics_company_name is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIsNotNull() {
            addCriterion("logistics_company_name is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameEqualTo(String value) {
            addCriterion("logistics_company_name =", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotEqualTo(String value) {
            addCriterion("logistics_company_name <>", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameGreaterThan(String value) {
            addCriterion("logistics_company_name >", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company_name >=", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLessThan(String value) {
            addCriterion("logistics_company_name <", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("logistics_company_name <=", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameLike(String value) {
            addCriterion("logistics_company_name like", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotLike(String value) {
            addCriterion("logistics_company_name not like", value, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameIn(List<String> values) {
            addCriterion("logistics_company_name in", values, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotIn(List<String> values) {
            addCriterion("logistics_company_name not in", values, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameBetween(String value1, String value2) {
            addCriterion("logistics_company_name between", value1, value2, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNameNotBetween(String value1, String value2) {
            addCriterion("logistics_company_name not between", value1, value2, "logisticsCompanyName");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Long value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Long value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Long value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Long value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Long value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Long> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Long> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Long value1, Long value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Long value1, Long value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNull() {
            addCriterion("sale_type is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(String value) {
            addCriterion("sale_type =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(String value) {
            addCriterion("sale_type <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(String value) {
            addCriterion("sale_type >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sale_type >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(String value) {
            addCriterion("sale_type <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(String value) {
            addCriterion("sale_type <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLike(String value) {
            addCriterion("sale_type like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotLike(String value) {
            addCriterion("sale_type not like", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<String> values) {
            addCriterion("sale_type in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<String> values) {
            addCriterion("sale_type not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(String value1, String value2) {
            addCriterion("sale_type between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(String value1, String value2) {
            addCriterion("sale_type not between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andIsNoticeIsNull() {
            addCriterion("is_notice is null");
            return (Criteria) this;
        }

        public Criteria andIsNoticeIsNotNull() {
            addCriterion("is_notice is not null");
            return (Criteria) this;
        }

        public Criteria andIsNoticeEqualTo(String value) {
            addCriterion("is_notice =", value, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeNotEqualTo(String value) {
            addCriterion("is_notice <>", value, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeGreaterThan(String value) {
            addCriterion("is_notice >", value, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("is_notice >=", value, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeLessThan(String value) {
            addCriterion("is_notice <", value, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeLessThanOrEqualTo(String value) {
            addCriterion("is_notice <=", value, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeLike(String value) {
            addCriterion("is_notice like", value, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeNotLike(String value) {
            addCriterion("is_notice not like", value, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeIn(List<String> values) {
            addCriterion("is_notice in", values, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeNotIn(List<String> values) {
            addCriterion("is_notice not in", values, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeBetween(String value1, String value2) {
            addCriterion("is_notice between", value1, value2, "isNotice");
            return (Criteria) this;
        }

        public Criteria andIsNoticeNotBetween(String value1, String value2) {
            addCriterion("is_notice not between", value1, value2, "isNotice");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNull() {
            addCriterion("delivery_time is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIsNotNull() {
            addCriterion("delivery_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeEqualTo(Date value) {
            addCriterion("delivery_time =", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotEqualTo(Date value) {
            addCriterion("delivery_time <>", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThan(Date value) {
            addCriterion("delivery_time >", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delivery_time >=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThan(Date value) {
            addCriterion("delivery_time <", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeLessThanOrEqualTo(Date value) {
            addCriterion("delivery_time <=", value, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeIn(List<Date> values) {
            addCriterion("delivery_time in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotIn(List<Date> values) {
            addCriterion("delivery_time not in", values, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeBetween(Date value1, Date value2) {
            addCriterion("delivery_time between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeNotBetween(Date value1, Date value2) {
            addCriterion("delivery_time not between", value1, value2, "deliveryTime");
            return (Criteria) this;
        }

        public Criteria andTraceCodeIsNull() {
            addCriterion("trace_code is null");
            return (Criteria) this;
        }

        public Criteria andTraceCodeIsNotNull() {
            addCriterion("trace_code is not null");
            return (Criteria) this;
        }

        public Criteria andTraceCodeEqualTo(String value) {
            addCriterion("trace_code =", value, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeNotEqualTo(String value) {
            addCriterion("trace_code <>", value, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeGreaterThan(String value) {
            addCriterion("trace_code >", value, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("trace_code >=", value, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeLessThan(String value) {
            addCriterion("trace_code <", value, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeLessThanOrEqualTo(String value) {
            addCriterion("trace_code <=", value, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeLike(String value) {
            addCriterion("trace_code like", value, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeNotLike(String value) {
            addCriterion("trace_code not like", value, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeIn(List<String> values) {
            addCriterion("trace_code in", values, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeNotIn(List<String> values) {
            addCriterion("trace_code not in", values, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeBetween(String value1, String value2) {
            addCriterion("trace_code between", value1, value2, "traceCode");
            return (Criteria) this;
        }

        public Criteria andTraceCodeNotBetween(String value1, String value2) {
            addCriterion("trace_code not between", value1, value2, "traceCode");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdIsNull() {
            addCriterion("source_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdIsNotNull() {
            addCriterion("source_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdEqualTo(Long value) {
            addCriterion("source_order_id =", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotEqualTo(Long value) {
            addCriterion("source_order_id <>", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdGreaterThan(Long value) {
            addCriterion("source_order_id >", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_order_id >=", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdLessThan(Long value) {
            addCriterion("source_order_id <", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("source_order_id <=", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdIn(List<Long> values) {
            addCriterion("source_order_id in", values, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotIn(List<Long> values) {
            addCriterion("source_order_id not in", values, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdBetween(Long value1, Long value2) {
            addCriterion("source_order_id between", value1, value2, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("source_order_id not between", value1, value2, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdIsNull() {
            addCriterion("source_supplier_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdIsNotNull() {
            addCriterion("source_supplier_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdEqualTo(Long value) {
            addCriterion("source_supplier_id =", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdNotEqualTo(Long value) {
            addCriterion("source_supplier_id <>", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdGreaterThan(Long value) {
            addCriterion("source_supplier_id >", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("source_supplier_id >=", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdLessThan(Long value) {
            addCriterion("source_supplier_id <", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("source_supplier_id <=", value, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdIn(List<Long> values) {
            addCriterion("source_supplier_id in", values, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdNotIn(List<Long> values) {
            addCriterion("source_supplier_id not in", values, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdBetween(Long value1, Long value2) {
            addCriterion("source_supplier_id between", value1, value2, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andSourceSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("source_supplier_id not between", value1, value2, "sourceSupplierId");
            return (Criteria) this;
        }

        public Criteria andIsFreezingIsNull() {
            addCriterion("is_freezing is null");
            return (Criteria) this;
        }

        public Criteria andIsFreezingIsNotNull() {
            addCriterion("is_freezing is not null");
            return (Criteria) this;
        }

        public Criteria andIsFreezingEqualTo(String value) {
            addCriterion("is_freezing =", value, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingNotEqualTo(String value) {
            addCriterion("is_freezing <>", value, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingGreaterThan(String value) {
            addCriterion("is_freezing >", value, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingGreaterThanOrEqualTo(String value) {
            addCriterion("is_freezing >=", value, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingLessThan(String value) {
            addCriterion("is_freezing <", value, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingLessThanOrEqualTo(String value) {
            addCriterion("is_freezing <=", value, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingLike(String value) {
            addCriterion("is_freezing like", value, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingNotLike(String value) {
            addCriterion("is_freezing not like", value, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingIn(List<String> values) {
            addCriterion("is_freezing in", values, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingNotIn(List<String> values) {
            addCriterion("is_freezing not in", values, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingBetween(String value1, String value2) {
            addCriterion("is_freezing between", value1, value2, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andIsFreezingNotBetween(String value1, String value2) {
            addCriterion("is_freezing not between", value1, value2, "isFreezing");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountIsNull() {
            addCriterion("source_order_amount is null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountIsNotNull() {
            addCriterion("source_order_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountEqualTo(Long value) {
            addCriterion("source_order_amount =", value, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountNotEqualTo(Long value) {
            addCriterion("source_order_amount <>", value, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountGreaterThan(Long value) {
            addCriterion("source_order_amount >", value, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("source_order_amount >=", value, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountLessThan(Long value) {
            addCriterion("source_order_amount <", value, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountLessThanOrEqualTo(Long value) {
            addCriterion("source_order_amount <=", value, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountIn(List<Long> values) {
            addCriterion("source_order_amount in", values, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountNotIn(List<Long> values) {
            addCriterion("source_order_amount not in", values, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountBetween(Long value1, Long value2) {
            addCriterion("source_order_amount between", value1, value2, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andSourceOrderAmountNotBetween(Long value1, Long value2) {
            addCriterion("source_order_amount not between", value1, value2, "sourceOrderAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountIsNull() {
            addCriterion("platform_service_amount is null");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountIsNotNull() {
            addCriterion("platform_service_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountEqualTo(Long value) {
            addCriterion("platform_service_amount =", value, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountNotEqualTo(Long value) {
            addCriterion("platform_service_amount <>", value, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountGreaterThan(Long value) {
            addCriterion("platform_service_amount >", value, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("platform_service_amount >=", value, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountLessThan(Long value) {
            addCriterion("platform_service_amount <", value, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountLessThanOrEqualTo(Long value) {
            addCriterion("platform_service_amount <=", value, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountIn(List<Long> values) {
            addCriterion("platform_service_amount in", values, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountNotIn(List<Long> values) {
            addCriterion("platform_service_amount not in", values, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountBetween(Long value1, Long value2) {
            addCriterion("platform_service_amount between", value1, value2, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformServiceAmountNotBetween(Long value1, Long value2) {
            addCriterion("platform_service_amount not between", value1, value2, "platformServiceAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountIsNull() {
            addCriterion("pay_commission_amount is null");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountIsNotNull() {
            addCriterion("pay_commission_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountEqualTo(Long value) {
            addCriterion("pay_commission_amount =", value, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountNotEqualTo(Long value) {
            addCriterion("pay_commission_amount <>", value, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountGreaterThan(Long value) {
            addCriterion("pay_commission_amount >", value, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_commission_amount >=", value, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountLessThan(Long value) {
            addCriterion("pay_commission_amount <", value, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountLessThanOrEqualTo(Long value) {
            addCriterion("pay_commission_amount <=", value, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountIn(List<Long> values) {
            addCriterion("pay_commission_amount in", values, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountNotIn(List<Long> values) {
            addCriterion("pay_commission_amount not in", values, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountBetween(Long value1, Long value2) {
            addCriterion("pay_commission_amount between", value1, value2, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andPayCommissionAmountNotBetween(Long value1, Long value2) {
            addCriterion("pay_commission_amount not between", value1, value2, "payCommissionAmount");
            return (Criteria) this;
        }

        public Criteria andBuyWaysIsNull() {
            addCriterion("buy_ways is null");
            return (Criteria) this;
        }

        public Criteria andBuyWaysIsNotNull() {
            addCriterion("buy_ways is not null");
            return (Criteria) this;
        }

        public Criteria andBuyWaysEqualTo(String value) {
            addCriterion("buy_ways =", value, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysNotEqualTo(String value) {
            addCriterion("buy_ways <>", value, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysGreaterThan(String value) {
            addCriterion("buy_ways >", value, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysGreaterThanOrEqualTo(String value) {
            addCriterion("buy_ways >=", value, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysLessThan(String value) {
            addCriterion("buy_ways <", value, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysLessThanOrEqualTo(String value) {
            addCriterion("buy_ways <=", value, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysLike(String value) {
            addCriterion("buy_ways like", value, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysNotLike(String value) {
            addCriterion("buy_ways not like", value, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysIn(List<String> values) {
            addCriterion("buy_ways in", values, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysNotIn(List<String> values) {
            addCriterion("buy_ways not in", values, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysBetween(String value1, String value2) {
            addCriterion("buy_ways between", value1, value2, "buyWays");
            return (Criteria) this;
        }

        public Criteria andBuyWaysNotBetween(String value1, String value2) {
            addCriterion("buy_ways not between", value1, value2, "buyWays");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountIsNull() {
            addCriterion("credit_payed_amount is null");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountIsNotNull() {
            addCriterion("credit_payed_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountEqualTo(Long value) {
            addCriterion("credit_payed_amount =", value, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountNotEqualTo(Long value) {
            addCriterion("credit_payed_amount <>", value, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountGreaterThan(Long value) {
            addCriterion("credit_payed_amount >", value, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_payed_amount >=", value, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountLessThan(Long value) {
            addCriterion("credit_payed_amount <", value, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountLessThanOrEqualTo(Long value) {
            addCriterion("credit_payed_amount <=", value, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountIn(List<Long> values) {
            addCriterion("credit_payed_amount in", values, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountNotIn(List<Long> values) {
            addCriterion("credit_payed_amount not in", values, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountBetween(Long value1, Long value2) {
            addCriterion("credit_payed_amount between", value1, value2, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andCreditPayedAmountNotBetween(Long value1, Long value2) {
            addCriterion("credit_payed_amount not between", value1, value2, "creditPayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountIsNull() {
            addCriterion("balance_payed_amount is null");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountIsNotNull() {
            addCriterion("balance_payed_amount is not null");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountEqualTo(Long value) {
            addCriterion("balance_payed_amount =", value, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountNotEqualTo(Long value) {
            addCriterion("balance_payed_amount <>", value, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountGreaterThan(Long value) {
            addCriterion("balance_payed_amount >", value, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("balance_payed_amount >=", value, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountLessThan(Long value) {
            addCriterion("balance_payed_amount <", value, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountLessThanOrEqualTo(Long value) {
            addCriterion("balance_payed_amount <=", value, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountIn(List<Long> values) {
            addCriterion("balance_payed_amount in", values, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountNotIn(List<Long> values) {
            addCriterion("balance_payed_amount not in", values, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountBetween(Long value1, Long value2) {
            addCriterion("balance_payed_amount between", value1, value2, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andBalancePayedAmountNotBetween(Long value1, Long value2) {
            addCriterion("balance_payed_amount not between", value1, value2, "balancePayedAmount");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdIsNull() {
            addCriterion("salesman_user_id is null");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdIsNotNull() {
            addCriterion("salesman_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdEqualTo(Long value) {
            addCriterion("salesman_user_id =", value, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdNotEqualTo(Long value) {
            addCriterion("salesman_user_id <>", value, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdGreaterThan(Long value) {
            addCriterion("salesman_user_id >", value, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("salesman_user_id >=", value, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdLessThan(Long value) {
            addCriterion("salesman_user_id <", value, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdLessThanOrEqualTo(Long value) {
            addCriterion("salesman_user_id <=", value, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdIn(List<Long> values) {
            addCriterion("salesman_user_id in", values, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdNotIn(List<Long> values) {
            addCriterion("salesman_user_id not in", values, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdBetween(Long value1, Long value2) {
            addCriterion("salesman_user_id between", value1, value2, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andSalesmanUserIdNotBetween(Long value1, Long value2) {
            addCriterion("salesman_user_id not between", value1, value2, "salesmanUserId");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesIsNull() {
            addCriterion("remainder_receivables is null");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesIsNotNull() {
            addCriterion("remainder_receivables is not null");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesEqualTo(Long value) {
            addCriterion("remainder_receivables =", value, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesNotEqualTo(Long value) {
            addCriterion("remainder_receivables <>", value, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesGreaterThan(Long value) {
            addCriterion("remainder_receivables >", value, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesGreaterThanOrEqualTo(Long value) {
            addCriterion("remainder_receivables >=", value, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesLessThan(Long value) {
            addCriterion("remainder_receivables <", value, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesLessThanOrEqualTo(Long value) {
            addCriterion("remainder_receivables <=", value, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesIn(List<Long> values) {
            addCriterion("remainder_receivables in", values, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesNotIn(List<Long> values) {
            addCriterion("remainder_receivables not in", values, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesBetween(Long value1, Long value2) {
            addCriterion("remainder_receivables between", value1, value2, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRemainderReceivablesNotBetween(Long value1, Long value2) {
            addCriterion("remainder_receivables not between", value1, value2, "remainderReceivables");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyIsNull() {
            addCriterion("retracted_money is null");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyIsNotNull() {
            addCriterion("retracted_money is not null");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyEqualTo(Long value) {
            addCriterion("retracted_money =", value, "retractedMoney");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyNotEqualTo(Long value) {
            addCriterion("retracted_money <>", value, "retractedMoney");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyGreaterThan(Long value) {
            addCriterion("retracted_money >", value, "retractedMoney");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("retracted_money >=", value, "retractedMoney");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyLessThan(Long value) {
            addCriterion("retracted_money <", value, "retractedMoney");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyLessThanOrEqualTo(Long value) {
            addCriterion("retracted_money <=", value, "retractedMoney");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyIn(List<Long> values) {
            addCriterion("retracted_money in", values, "retractedMoney");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyNotIn(List<Long> values) {
            addCriterion("retracted_money not in", values, "retractedMoney");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyBetween(Long value1, Long value2) {
            addCriterion("retracted_money between", value1, value2, "retractedMoney");
            return (Criteria) this;
        }

        public Criteria andRetractedMoneyNotBetween(Long value1, Long value2) {
            addCriterion("retracted_money not between", value1, value2, "retractedMoney");
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
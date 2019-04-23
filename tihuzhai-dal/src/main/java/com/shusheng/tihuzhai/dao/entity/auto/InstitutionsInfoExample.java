package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstitutionsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstitutionsInfoExample() {
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

        public Criteria andUserBaseIdIsNull() {
            addCriterion("user_base_id is null");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdIsNotNull() {
            addCriterion("user_base_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdEqualTo(String value) {
            addCriterion("user_base_id =", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdNotEqualTo(String value) {
            addCriterion("user_base_id <>", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdGreaterThan(String value) {
            addCriterion("user_base_id >", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_base_id >=", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdLessThan(String value) {
            addCriterion("user_base_id <", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdLessThanOrEqualTo(String value) {
            addCriterion("user_base_id <=", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdLike(String value) {
            addCriterion("user_base_id like", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdNotLike(String value) {
            addCriterion("user_base_id not like", value, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdIn(List<String> values) {
            addCriterion("user_base_id in", values, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdNotIn(List<String> values) {
            addCriterion("user_base_id not in", values, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdBetween(String value1, String value2) {
            addCriterion("user_base_id between", value1, value2, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andUserBaseIdNotBetween(String value1, String value2) {
            addCriterion("user_base_id not between", value1, value2, "userBaseId");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNull() {
            addCriterion("enterprise_name is null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIsNotNull() {
            addCriterion("enterprise_name is not null");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameEqualTo(String value) {
            addCriterion("enterprise_name =", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotEqualTo(String value) {
            addCriterion("enterprise_name <>", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThan(String value) {
            addCriterion("enterprise_name >", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameGreaterThanOrEqualTo(String value) {
            addCriterion("enterprise_name >=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThan(String value) {
            addCriterion("enterprise_name <", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLessThanOrEqualTo(String value) {
            addCriterion("enterprise_name <=", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameLike(String value) {
            addCriterion("enterprise_name like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotLike(String value) {
            addCriterion("enterprise_name not like", value, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameIn(List<String> values) {
            addCriterion("enterprise_name in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotIn(List<String> values) {
            addCriterion("enterprise_name not in", values, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameBetween(String value1, String value2) {
            addCriterion("enterprise_name between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andEnterpriseNameNotBetween(String value1, String value2) {
            addCriterion("enterprise_name not between", value1, value2, "enterpriseName");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNull() {
            addCriterion("organization_code is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIsNotNull() {
            addCriterion("organization_code is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeEqualTo(String value) {
            addCriterion("organization_code =", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotEqualTo(String value) {
            addCriterion("organization_code <>", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThan(String value) {
            addCriterion("organization_code >", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeGreaterThanOrEqualTo(String value) {
            addCriterion("organization_code >=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThan(String value) {
            addCriterion("organization_code <", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLessThanOrEqualTo(String value) {
            addCriterion("organization_code <=", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeLike(String value) {
            addCriterion("organization_code like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotLike(String value) {
            addCriterion("organization_code not like", value, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeIn(List<String> values) {
            addCriterion("organization_code in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotIn(List<String> values) {
            addCriterion("organization_code not in", values, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeBetween(String value1, String value2) {
            addCriterion("organization_code between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andOrganizationCodeNotBetween(String value1, String value2) {
            addCriterion("organization_code not between", value1, value2, "organizationCode");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoIsNull() {
            addCriterion("tax_registration_no is null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoIsNotNull() {
            addCriterion("tax_registration_no is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoEqualTo(String value) {
            addCriterion("tax_registration_no =", value, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoNotEqualTo(String value) {
            addCriterion("tax_registration_no <>", value, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoGreaterThan(String value) {
            addCriterion("tax_registration_no >", value, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoGreaterThanOrEqualTo(String value) {
            addCriterion("tax_registration_no >=", value, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoLessThan(String value) {
            addCriterion("tax_registration_no <", value, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoLessThanOrEqualTo(String value) {
            addCriterion("tax_registration_no <=", value, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoLike(String value) {
            addCriterion("tax_registration_no like", value, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoNotLike(String value) {
            addCriterion("tax_registration_no not like", value, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoIn(List<String> values) {
            addCriterion("tax_registration_no in", values, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoNotIn(List<String> values) {
            addCriterion("tax_registration_no not in", values, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoBetween(String value1, String value2) {
            addCriterion("tax_registration_no between", value1, value2, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andTaxRegistrationNoNotBetween(String value1, String value2) {
            addCriterion("tax_registration_no not between", value1, value2, "taxRegistrationNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIsNull() {
            addCriterion("business_license_no is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIsNotNull() {
            addCriterion("business_license_no is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoEqualTo(String value) {
            addCriterion("business_license_no =", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotEqualTo(String value) {
            addCriterion("business_license_no <>", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoGreaterThan(String value) {
            addCriterion("business_license_no >", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_no >=", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLessThan(String value) {
            addCriterion("business_license_no <", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("business_license_no <=", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoLike(String value) {
            addCriterion("business_license_no like", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotLike(String value) {
            addCriterion("business_license_no not like", value, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoIn(List<String> values) {
            addCriterion("business_license_no in", values, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotIn(List<String> values) {
            addCriterion("business_license_no not in", values, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoBetween(String value1, String value2) {
            addCriterion("business_license_no between", value1, value2, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseNoNotBetween(String value1, String value2) {
            addCriterion("business_license_no not between", value1, value2, "businessLicenseNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceIsNull() {
            addCriterion("business_license_province is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceIsNotNull() {
            addCriterion("business_license_province is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceEqualTo(String value) {
            addCriterion("business_license_province =", value, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceNotEqualTo(String value) {
            addCriterion("business_license_province <>", value, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceGreaterThan(String value) {
            addCriterion("business_license_province >", value, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_province >=", value, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceLessThan(String value) {
            addCriterion("business_license_province <", value, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceLessThanOrEqualTo(String value) {
            addCriterion("business_license_province <=", value, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceLike(String value) {
            addCriterion("business_license_province like", value, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceNotLike(String value) {
            addCriterion("business_license_province not like", value, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceIn(List<String> values) {
            addCriterion("business_license_province in", values, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceNotIn(List<String> values) {
            addCriterion("business_license_province not in", values, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceBetween(String value1, String value2) {
            addCriterion("business_license_province between", value1, value2, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseProvinceNotBetween(String value1, String value2) {
            addCriterion("business_license_province not between", value1, value2, "businessLicenseProvince");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityIsNull() {
            addCriterion("business_license_city is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityIsNotNull() {
            addCriterion("business_license_city is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityEqualTo(String value) {
            addCriterion("business_license_city =", value, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityNotEqualTo(String value) {
            addCriterion("business_license_city <>", value, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityGreaterThan(String value) {
            addCriterion("business_license_city >", value, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_city >=", value, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityLessThan(String value) {
            addCriterion("business_license_city <", value, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityLessThanOrEqualTo(String value) {
            addCriterion("business_license_city <=", value, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityLike(String value) {
            addCriterion("business_license_city like", value, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityNotLike(String value) {
            addCriterion("business_license_city not like", value, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityIn(List<String> values) {
            addCriterion("business_license_city in", values, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityNotIn(List<String> values) {
            addCriterion("business_license_city not in", values, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityBetween(String value1, String value2) {
            addCriterion("business_license_city between", value1, value2, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCityNotBetween(String value1, String value2) {
            addCriterion("business_license_city not between", value1, value2, "businessLicenseCity");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(String value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(String value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(String value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(String value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(String value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(String value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLike(String value) {
            addCriterion("district like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotLike(String value) {
            addCriterion("district not like", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<String> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<String> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(String value1, String value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(String value1, String value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andTownIsNull() {
            addCriterion("town is null");
            return (Criteria) this;
        }

        public Criteria andTownIsNotNull() {
            addCriterion("town is not null");
            return (Criteria) this;
        }

        public Criteria andTownEqualTo(String value) {
            addCriterion("town =", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotEqualTo(String value) {
            addCriterion("town <>", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThan(String value) {
            addCriterion("town >", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownGreaterThanOrEqualTo(String value) {
            addCriterion("town >=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThan(String value) {
            addCriterion("town <", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLessThanOrEqualTo(String value) {
            addCriterion("town <=", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownLike(String value) {
            addCriterion("town like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotLike(String value) {
            addCriterion("town not like", value, "town");
            return (Criteria) this;
        }

        public Criteria andTownIn(List<String> values) {
            addCriterion("town in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotIn(List<String> values) {
            addCriterion("town not in", values, "town");
            return (Criteria) this;
        }

        public Criteria andTownBetween(String value1, String value2) {
            addCriterion("town between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andTownNotBetween(String value1, String value2) {
            addCriterion("town not between", value1, value2, "town");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressIsNull() {
            addCriterion("commonly_used_address is null");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressIsNotNull() {
            addCriterion("commonly_used_address is not null");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressEqualTo(String value) {
            addCriterion("commonly_used_address =", value, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressNotEqualTo(String value) {
            addCriterion("commonly_used_address <>", value, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressGreaterThan(String value) {
            addCriterion("commonly_used_address >", value, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("commonly_used_address >=", value, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressLessThan(String value) {
            addCriterion("commonly_used_address <", value, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressLessThanOrEqualTo(String value) {
            addCriterion("commonly_used_address <=", value, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressLike(String value) {
            addCriterion("commonly_used_address like", value, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressNotLike(String value) {
            addCriterion("commonly_used_address not like", value, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressIn(List<String> values) {
            addCriterion("commonly_used_address in", values, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressNotIn(List<String> values) {
            addCriterion("commonly_used_address not in", values, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressBetween(String value1, String value2) {
            addCriterion("commonly_used_address between", value1, value2, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andCommonlyUsedAddressNotBetween(String value1, String value2) {
            addCriterion("commonly_used_address not between", value1, value2, "commonlyUsedAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodIsNull() {
            addCriterion("business_period is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodIsNotNull() {
            addCriterion("business_period is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodEqualTo(String value) {
            addCriterion("business_period =", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotEqualTo(String value) {
            addCriterion("business_period <>", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodGreaterThan(String value) {
            addCriterion("business_period >", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("business_period >=", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodLessThan(String value) {
            addCriterion("business_period <", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodLessThanOrEqualTo(String value) {
            addCriterion("business_period <=", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodLike(String value) {
            addCriterion("business_period like", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotLike(String value) {
            addCriterion("business_period not like", value, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodIn(List<String> values) {
            addCriterion("business_period in", values, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotIn(List<String> values) {
            addCriterion("business_period not in", values, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodBetween(String value1, String value2) {
            addCriterion("business_period between", value1, value2, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andBusinessPeriodNotBetween(String value1, String value2) {
            addCriterion("business_period not between", value1, value2, "businessPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameIsNull() {
            addCriterion("legal_representative_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameIsNotNull() {
            addCriterion("legal_representative_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameEqualTo(String value) {
            addCriterion("legal_representative_name =", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameNotEqualTo(String value) {
            addCriterion("legal_representative_name <>", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameGreaterThan(String value) {
            addCriterion("legal_representative_name >", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_name >=", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameLessThan(String value) {
            addCriterion("legal_representative_name <", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_name <=", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameLike(String value) {
            addCriterion("legal_representative_name like", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameNotLike(String value) {
            addCriterion("legal_representative_name not like", value, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameIn(List<String> values) {
            addCriterion("legal_representative_name in", values, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameNotIn(List<String> values) {
            addCriterion("legal_representative_name not in", values, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameBetween(String value1, String value2) {
            addCriterion("legal_representative_name between", value1, value2, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeNameNotBetween(String value1, String value2) {
            addCriterion("legal_representative_name not between", value1, value2, "legalRepresentativeName");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoIsNull() {
            addCriterion("legal_representative_card_no is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoIsNotNull() {
            addCriterion("legal_representative_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoEqualTo(String value) {
            addCriterion("legal_representative_card_no =", value, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoNotEqualTo(String value) {
            addCriterion("legal_representative_card_no <>", value, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoGreaterThan(String value) {
            addCriterion("legal_representative_card_no >", value, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_card_no >=", value, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoLessThan(String value) {
            addCriterion("legal_representative_card_no <", value, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_card_no <=", value, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoLike(String value) {
            addCriterion("legal_representative_card_no like", value, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoNotLike(String value) {
            addCriterion("legal_representative_card_no not like", value, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoIn(List<String> values) {
            addCriterion("legal_representative_card_no in", values, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoNotIn(List<String> values) {
            addCriterion("legal_representative_card_no not in", values, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoBetween(String value1, String value2) {
            addCriterion("legal_representative_card_no between", value1, value2, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardNoNotBetween(String value1, String value2) {
            addCriterion("legal_representative_card_no not between", value1, value2, "legalRepresentativeCardNo");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathIsNull() {
            addCriterion("business_license_path is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathIsNotNull() {
            addCriterion("business_license_path is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathEqualTo(String value) {
            addCriterion("business_license_path =", value, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathNotEqualTo(String value) {
            addCriterion("business_license_path <>", value, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathGreaterThan(String value) {
            addCriterion("business_license_path >", value, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_path >=", value, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathLessThan(String value) {
            addCriterion("business_license_path <", value, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathLessThanOrEqualTo(String value) {
            addCriterion("business_license_path <=", value, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathLike(String value) {
            addCriterion("business_license_path like", value, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathNotLike(String value) {
            addCriterion("business_license_path not like", value, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathIn(List<String> values) {
            addCriterion("business_license_path in", values, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathNotIn(List<String> values) {
            addCriterion("business_license_path not in", values, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathBetween(String value1, String value2) {
            addCriterion("business_license_path between", value1, value2, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicensePathNotBetween(String value1, String value2) {
            addCriterion("business_license_path not between", value1, value2, "businessLicensePath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathIsNull() {
            addCriterion("business_license_cachet_path is null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathIsNotNull() {
            addCriterion("business_license_cachet_path is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathEqualTo(String value) {
            addCriterion("business_license_cachet_path =", value, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathNotEqualTo(String value) {
            addCriterion("business_license_cachet_path <>", value, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathGreaterThan(String value) {
            addCriterion("business_license_cachet_path >", value, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathGreaterThanOrEqualTo(String value) {
            addCriterion("business_license_cachet_path >=", value, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathLessThan(String value) {
            addCriterion("business_license_cachet_path <", value, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathLessThanOrEqualTo(String value) {
            addCriterion("business_license_cachet_path <=", value, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathLike(String value) {
            addCriterion("business_license_cachet_path like", value, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathNotLike(String value) {
            addCriterion("business_license_cachet_path not like", value, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathIn(List<String> values) {
            addCriterion("business_license_cachet_path in", values, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathNotIn(List<String> values) {
            addCriterion("business_license_cachet_path not in", values, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathBetween(String value1, String value2) {
            addCriterion("business_license_cachet_path between", value1, value2, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andBusinessLicenseCachetPathNotBetween(String value1, String value2) {
            addCriterion("business_license_cachet_path not between", value1, value2, "businessLicenseCachetPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathIsNull() {
            addCriterion("cert_front_path is null");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathIsNotNull() {
            addCriterion("cert_front_path is not null");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathEqualTo(String value) {
            addCriterion("cert_front_path =", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathNotEqualTo(String value) {
            addCriterion("cert_front_path <>", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathGreaterThan(String value) {
            addCriterion("cert_front_path >", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathGreaterThanOrEqualTo(String value) {
            addCriterion("cert_front_path >=", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathLessThan(String value) {
            addCriterion("cert_front_path <", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathLessThanOrEqualTo(String value) {
            addCriterion("cert_front_path <=", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathLike(String value) {
            addCriterion("cert_front_path like", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathNotLike(String value) {
            addCriterion("cert_front_path not like", value, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathIn(List<String> values) {
            addCriterion("cert_front_path in", values, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathNotIn(List<String> values) {
            addCriterion("cert_front_path not in", values, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathBetween(String value1, String value2) {
            addCriterion("cert_front_path between", value1, value2, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertFrontPathNotBetween(String value1, String value2) {
            addCriterion("cert_front_path not between", value1, value2, "certFrontPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathIsNull() {
            addCriterion("cert_back_path is null");
            return (Criteria) this;
        }

        public Criteria andCertBackPathIsNotNull() {
            addCriterion("cert_back_path is not null");
            return (Criteria) this;
        }

        public Criteria andCertBackPathEqualTo(String value) {
            addCriterion("cert_back_path =", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathNotEqualTo(String value) {
            addCriterion("cert_back_path <>", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathGreaterThan(String value) {
            addCriterion("cert_back_path >", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathGreaterThanOrEqualTo(String value) {
            addCriterion("cert_back_path >=", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathLessThan(String value) {
            addCriterion("cert_back_path <", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathLessThanOrEqualTo(String value) {
            addCriterion("cert_back_path <=", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathLike(String value) {
            addCriterion("cert_back_path like", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathNotLike(String value) {
            addCriterion("cert_back_path not like", value, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathIn(List<String> values) {
            addCriterion("cert_back_path in", values, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathNotIn(List<String> values) {
            addCriterion("cert_back_path not in", values, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathBetween(String value1, String value2) {
            addCriterion("cert_back_path between", value1, value2, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andCertBackPathNotBetween(String value1, String value2) {
            addCriterion("cert_back_path not between", value1, value2, "certBackPath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathIsNull() {
            addCriterion("food_distribution_license_path is null");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathIsNotNull() {
            addCriterion("food_distribution_license_path is not null");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathEqualTo(String value) {
            addCriterion("food_distribution_license_path =", value, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathNotEqualTo(String value) {
            addCriterion("food_distribution_license_path <>", value, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathGreaterThan(String value) {
            addCriterion("food_distribution_license_path >", value, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathGreaterThanOrEqualTo(String value) {
            addCriterion("food_distribution_license_path >=", value, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathLessThan(String value) {
            addCriterion("food_distribution_license_path <", value, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathLessThanOrEqualTo(String value) {
            addCriterion("food_distribution_license_path <=", value, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathLike(String value) {
            addCriterion("food_distribution_license_path like", value, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathNotLike(String value) {
            addCriterion("food_distribution_license_path not like", value, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathIn(List<String> values) {
            addCriterion("food_distribution_license_path in", values, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathNotIn(List<String> values) {
            addCriterion("food_distribution_license_path not in", values, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathBetween(String value1, String value2) {
            addCriterion("food_distribution_license_path between", value1, value2, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andFoodDistributionLicensePathNotBetween(String value1, String value2) {
            addCriterion("food_distribution_license_path not between", value1, value2, "foodDistributionLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathIsNull() {
            addCriterion("opening_license_path is null");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathIsNotNull() {
            addCriterion("opening_license_path is not null");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathEqualTo(String value) {
            addCriterion("opening_license_path =", value, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathNotEqualTo(String value) {
            addCriterion("opening_license_path <>", value, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathGreaterThan(String value) {
            addCriterion("opening_license_path >", value, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathGreaterThanOrEqualTo(String value) {
            addCriterion("opening_license_path >=", value, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathLessThan(String value) {
            addCriterion("opening_license_path <", value, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathLessThanOrEqualTo(String value) {
            addCriterion("opening_license_path <=", value, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathLike(String value) {
            addCriterion("opening_license_path like", value, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathNotLike(String value) {
            addCriterion("opening_license_path not like", value, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathIn(List<String> values) {
            addCriterion("opening_license_path in", values, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathNotIn(List<String> values) {
            addCriterion("opening_license_path not in", values, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathBetween(String value1, String value2) {
            addCriterion("opening_license_path between", value1, value2, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andOpeningLicensePathNotBetween(String value1, String value2) {
            addCriterion("opening_license_path not between", value1, value2, "openingLicensePath");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameIsNull() {
            addCriterion("bank_open_name is null");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameIsNotNull() {
            addCriterion("bank_open_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameEqualTo(String value) {
            addCriterion("bank_open_name =", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameNotEqualTo(String value) {
            addCriterion("bank_open_name <>", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameGreaterThan(String value) {
            addCriterion("bank_open_name >", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_open_name >=", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameLessThan(String value) {
            addCriterion("bank_open_name <", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameLessThanOrEqualTo(String value) {
            addCriterion("bank_open_name <=", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameLike(String value) {
            addCriterion("bank_open_name like", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameNotLike(String value) {
            addCriterion("bank_open_name not like", value, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameIn(List<String> values) {
            addCriterion("bank_open_name in", values, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameNotIn(List<String> values) {
            addCriterion("bank_open_name not in", values, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameBetween(String value1, String value2) {
            addCriterion("bank_open_name between", value1, value2, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankOpenNameNotBetween(String value1, String value2) {
            addCriterion("bank_open_name not between", value1, value2, "bankOpenName");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("bank_card_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("bank_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("bank_card_no =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("bank_card_no <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("bank_card_no >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_no >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("bank_card_no <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_no <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("bank_card_no like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("bank_card_no not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("bank_card_no in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("bank_card_no not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("bank_card_no between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("bank_card_no not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNull() {
            addCriterion("bank_type is null");
            return (Criteria) this;
        }

        public Criteria andBankTypeIsNotNull() {
            addCriterion("bank_type is not null");
            return (Criteria) this;
        }

        public Criteria andBankTypeEqualTo(String value) {
            addCriterion("bank_type =", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotEqualTo(String value) {
            addCriterion("bank_type <>", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThan(String value) {
            addCriterion("bank_type >", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("bank_type >=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThan(String value) {
            addCriterion("bank_type <", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLessThanOrEqualTo(String value) {
            addCriterion("bank_type <=", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeLike(String value) {
            addCriterion("bank_type like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotLike(String value) {
            addCriterion("bank_type not like", value, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeIn(List<String> values) {
            addCriterion("bank_type in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotIn(List<String> values) {
            addCriterion("bank_type not in", values, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeBetween(String value1, String value2) {
            addCriterion("bank_type between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankTypeNotBetween(String value1, String value2) {
            addCriterion("bank_type not between", value1, value2, "bankType");
            return (Criteria) this;
        }

        public Criteria andBankKeyIsNull() {
            addCriterion("bank_key is null");
            return (Criteria) this;
        }

        public Criteria andBankKeyIsNotNull() {
            addCriterion("bank_key is not null");
            return (Criteria) this;
        }

        public Criteria andBankKeyEqualTo(String value) {
            addCriterion("bank_key =", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyNotEqualTo(String value) {
            addCriterion("bank_key <>", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyGreaterThan(String value) {
            addCriterion("bank_key >", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyGreaterThanOrEqualTo(String value) {
            addCriterion("bank_key >=", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyLessThan(String value) {
            addCriterion("bank_key <", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyLessThanOrEqualTo(String value) {
            addCriterion("bank_key <=", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyLike(String value) {
            addCriterion("bank_key like", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyNotLike(String value) {
            addCriterion("bank_key not like", value, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyIn(List<String> values) {
            addCriterion("bank_key in", values, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyNotIn(List<String> values) {
            addCriterion("bank_key not in", values, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyBetween(String value1, String value2) {
            addCriterion("bank_key between", value1, value2, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankKeyNotBetween(String value1, String value2) {
            addCriterion("bank_key not between", value1, value2, "bankKey");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNull() {
            addCriterion("bank_province is null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIsNotNull() {
            addCriterion("bank_province is not null");
            return (Criteria) this;
        }

        public Criteria andBankProvinceEqualTo(String value) {
            addCriterion("bank_province =", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotEqualTo(String value) {
            addCriterion("bank_province <>", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThan(String value) {
            addCriterion("bank_province >", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("bank_province >=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThan(String value) {
            addCriterion("bank_province <", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLessThanOrEqualTo(String value) {
            addCriterion("bank_province <=", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceLike(String value) {
            addCriterion("bank_province like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotLike(String value) {
            addCriterion("bank_province not like", value, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceIn(List<String> values) {
            addCriterion("bank_province in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotIn(List<String> values) {
            addCriterion("bank_province not in", values, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceBetween(String value1, String value2) {
            addCriterion("bank_province between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankProvinceNotBetween(String value1, String value2) {
            addCriterion("bank_province not between", value1, value2, "bankProvince");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNull() {
            addCriterion("bank_city is null");
            return (Criteria) this;
        }

        public Criteria andBankCityIsNotNull() {
            addCriterion("bank_city is not null");
            return (Criteria) this;
        }

        public Criteria andBankCityEqualTo(String value) {
            addCriterion("bank_city =", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotEqualTo(String value) {
            addCriterion("bank_city <>", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThan(String value) {
            addCriterion("bank_city >", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityGreaterThanOrEqualTo(String value) {
            addCriterion("bank_city >=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThan(String value) {
            addCriterion("bank_city <", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLessThanOrEqualTo(String value) {
            addCriterion("bank_city <=", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityLike(String value) {
            addCriterion("bank_city like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotLike(String value) {
            addCriterion("bank_city not like", value, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityIn(List<String> values) {
            addCriterion("bank_city in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotIn(List<String> values) {
            addCriterion("bank_city not in", values, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityBetween(String value1, String value2) {
            addCriterion("bank_city between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankCityNotBetween(String value1, String value2) {
            addCriterion("bank_city not between", value1, value2, "bankCity");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNull() {
            addCriterion("bank_address is null");
            return (Criteria) this;
        }

        public Criteria andBankAddressIsNotNull() {
            addCriterion("bank_address is not null");
            return (Criteria) this;
        }

        public Criteria andBankAddressEqualTo(String value) {
            addCriterion("bank_address =", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotEqualTo(String value) {
            addCriterion("bank_address <>", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThan(String value) {
            addCriterion("bank_address >", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressGreaterThanOrEqualTo(String value) {
            addCriterion("bank_address >=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThan(String value) {
            addCriterion("bank_address <", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLessThanOrEqualTo(String value) {
            addCriterion("bank_address <=", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressLike(String value) {
            addCriterion("bank_address like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotLike(String value) {
            addCriterion("bank_address not like", value, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressIn(List<String> values) {
            addCriterion("bank_address in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotIn(List<String> values) {
            addCriterion("bank_address not in", values, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressBetween(String value1, String value2) {
            addCriterion("bank_address between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andBankAddressNotBetween(String value1, String value2) {
            addCriterion("bank_address not between", value1, value2, "bankAddress");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeIsNull() {
            addCriterion("institutions_in_code is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeIsNotNull() {
            addCriterion("institutions_in_code is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeEqualTo(String value) {
            addCriterion("institutions_in_code =", value, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeNotEqualTo(String value) {
            addCriterion("institutions_in_code <>", value, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeGreaterThan(String value) {
            addCriterion("institutions_in_code >", value, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeGreaterThanOrEqualTo(String value) {
            addCriterion("institutions_in_code >=", value, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeLessThan(String value) {
            addCriterion("institutions_in_code <", value, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeLessThanOrEqualTo(String value) {
            addCriterion("institutions_in_code <=", value, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeLike(String value) {
            addCriterion("institutions_in_code like", value, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeNotLike(String value) {
            addCriterion("institutions_in_code not like", value, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeIn(List<String> values) {
            addCriterion("institutions_in_code in", values, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeNotIn(List<String> values) {
            addCriterion("institutions_in_code not in", values, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeBetween(String value1, String value2) {
            addCriterion("institutions_in_code between", value1, value2, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsInCodeNotBetween(String value1, String value2) {
            addCriterion("institutions_in_code not between", value1, value2, "institutionsInCode");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyIsNull() {
            addCriterion("institutions_them_roughly is null");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyIsNotNull() {
            addCriterion("institutions_them_roughly is not null");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyEqualTo(String value) {
            addCriterion("institutions_them_roughly =", value, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyNotEqualTo(String value) {
            addCriterion("institutions_them_roughly <>", value, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyGreaterThan(String value) {
            addCriterion("institutions_them_roughly >", value, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyGreaterThanOrEqualTo(String value) {
            addCriterion("institutions_them_roughly >=", value, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyLessThan(String value) {
            addCriterion("institutions_them_roughly <", value, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyLessThanOrEqualTo(String value) {
            addCriterion("institutions_them_roughly <=", value, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyLike(String value) {
            addCriterion("institutions_them_roughly like", value, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyNotLike(String value) {
            addCriterion("institutions_them_roughly not like", value, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyIn(List<String> values) {
            addCriterion("institutions_them_roughly in", values, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyNotIn(List<String> values) {
            addCriterion("institutions_them_roughly not in", values, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyBetween(String value1, String value2) {
            addCriterion("institutions_them_roughly between", value1, value2, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andInstitutionsThemRoughlyNotBetween(String value1, String value2) {
            addCriterion("institutions_them_roughly not between", value1, value2, "institutionsThemRoughly");
            return (Criteria) this;
        }

        public Criteria andRefereesIsNull() {
            addCriterion("referees is null");
            return (Criteria) this;
        }

        public Criteria andRefereesIsNotNull() {
            addCriterion("referees is not null");
            return (Criteria) this;
        }

        public Criteria andRefereesEqualTo(String value) {
            addCriterion("referees =", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesNotEqualTo(String value) {
            addCriterion("referees <>", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesGreaterThan(String value) {
            addCriterion("referees >", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesGreaterThanOrEqualTo(String value) {
            addCriterion("referees >=", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesLessThan(String value) {
            addCriterion("referees <", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesLessThanOrEqualTo(String value) {
            addCriterion("referees <=", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesLike(String value) {
            addCriterion("referees like", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesNotLike(String value) {
            addCriterion("referees not like", value, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesIn(List<String> values) {
            addCriterion("referees in", values, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesNotIn(List<String> values) {
            addCriterion("referees not in", values, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesBetween(String value1, String value2) {
            addCriterion("referees between", value1, value2, "referees");
            return (Criteria) this;
        }

        public Criteria andRefereesNotBetween(String value1, String value2) {
            addCriterion("referees not between", value1, value2, "referees");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNull() {
            addCriterion("contact_name is null");
            return (Criteria) this;
        }

        public Criteria andContactNameIsNotNull() {
            addCriterion("contact_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactNameEqualTo(String value) {
            addCriterion("contact_name =", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotEqualTo(String value) {
            addCriterion("contact_name <>", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThan(String value) {
            addCriterion("contact_name >", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_name >=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThan(String value) {
            addCriterion("contact_name <", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLessThanOrEqualTo(String value) {
            addCriterion("contact_name <=", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameLike(String value) {
            addCriterion("contact_name like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotLike(String value) {
            addCriterion("contact_name not like", value, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameIn(List<String> values) {
            addCriterion("contact_name in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotIn(List<String> values) {
            addCriterion("contact_name not in", values, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameBetween(String value1, String value2) {
            addCriterion("contact_name between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andContactNameNotBetween(String value1, String value2) {
            addCriterion("contact_name not between", value1, value2, "contactName");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNull() {
            addCriterion("company_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIsNotNull() {
            addCriterion("company_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneEqualTo(String value) {
            addCriterion("company_phone =", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotEqualTo(String value) {
            addCriterion("company_phone <>", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThan(String value) {
            addCriterion("company_phone >", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("company_phone >=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThan(String value) {
            addCriterion("company_phone <", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLessThanOrEqualTo(String value) {
            addCriterion("company_phone <=", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneLike(String value) {
            addCriterion("company_phone like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotLike(String value) {
            addCriterion("company_phone not like", value, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneIn(List<String> values) {
            addCriterion("company_phone in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotIn(List<String> values) {
            addCriterion("company_phone not in", values, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneBetween(String value1, String value2) {
            addCriterion("company_phone between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andCompanyPhoneNotBetween(String value1, String value2) {
            addCriterion("company_phone not between", value1, value2, "companyPhone");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodIsNull() {
            addCriterion("legal_representative_card_period is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodIsNotNull() {
            addCriterion("legal_representative_card_period is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodEqualTo(String value) {
            addCriterion("legal_representative_card_period =", value, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodNotEqualTo(String value) {
            addCriterion("legal_representative_card_period <>", value, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodGreaterThan(String value) {
            addCriterion("legal_representative_card_period >", value, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("legal_representative_card_period >=", value, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodLessThan(String value) {
            addCriterion("legal_representative_card_period <", value, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodLessThanOrEqualTo(String value) {
            addCriterion("legal_representative_card_period <=", value, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodLike(String value) {
            addCriterion("legal_representative_card_period like", value, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodNotLike(String value) {
            addCriterion("legal_representative_card_period not like", value, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodIn(List<String> values) {
            addCriterion("legal_representative_card_period in", values, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodNotIn(List<String> values) {
            addCriterion("legal_representative_card_period not in", values, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodBetween(String value1, String value2) {
            addCriterion("legal_representative_card_period between", value1, value2, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andLegalRepresentativeCardPeriodNotBetween(String value1, String value2) {
            addCriterion("legal_representative_card_period not between", value1, value2, "legalRepresentativeCardPeriod");
            return (Criteria) this;
        }

        public Criteria andContactCertNoIsNull() {
            addCriterion("contact_cert_no is null");
            return (Criteria) this;
        }

        public Criteria andContactCertNoIsNotNull() {
            addCriterion("contact_cert_no is not null");
            return (Criteria) this;
        }

        public Criteria andContactCertNoEqualTo(String value) {
            addCriterion("contact_cert_no =", value, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoNotEqualTo(String value) {
            addCriterion("contact_cert_no <>", value, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoGreaterThan(String value) {
            addCriterion("contact_cert_no >", value, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoGreaterThanOrEqualTo(String value) {
            addCriterion("contact_cert_no >=", value, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoLessThan(String value) {
            addCriterion("contact_cert_no <", value, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoLessThanOrEqualTo(String value) {
            addCriterion("contact_cert_no <=", value, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoLike(String value) {
            addCriterion("contact_cert_no like", value, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoNotLike(String value) {
            addCriterion("contact_cert_no not like", value, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoIn(List<String> values) {
            addCriterion("contact_cert_no in", values, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoNotIn(List<String> values) {
            addCriterion("contact_cert_no not in", values, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoBetween(String value1, String value2) {
            addCriterion("contact_cert_no between", value1, value2, "contactCertNo");
            return (Criteria) this;
        }

        public Criteria andContactCertNoNotBetween(String value1, String value2) {
            addCriterion("contact_cert_no not between", value1, value2, "contactCertNo");
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
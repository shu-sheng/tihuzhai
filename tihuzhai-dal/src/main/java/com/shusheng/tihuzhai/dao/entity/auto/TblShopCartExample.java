package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblShopCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblShopCartExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andPicPathIsNull() {
            addCriterion("pic_path is null");
            return (Criteria) this;
        }

        public Criteria andPicPathIsNotNull() {
            addCriterion("pic_path is not null");
            return (Criteria) this;
        }

        public Criteria andPicPathEqualTo(String value) {
            addCriterion("pic_path =", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotEqualTo(String value) {
            addCriterion("pic_path <>", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathGreaterThan(String value) {
            addCriterion("pic_path >", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathGreaterThanOrEqualTo(String value) {
            addCriterion("pic_path >=", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathLessThan(String value) {
            addCriterion("pic_path <", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathLessThanOrEqualTo(String value) {
            addCriterion("pic_path <=", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathLike(String value) {
            addCriterion("pic_path like", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotLike(String value) {
            addCriterion("pic_path not like", value, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathIn(List<String> values) {
            addCriterion("pic_path in", values, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotIn(List<String> values) {
            addCriterion("pic_path not in", values, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathBetween(String value1, String value2) {
            addCriterion("pic_path between", value1, value2, "picPath");
            return (Criteria) this;
        }

        public Criteria andPicPathNotBetween(String value1, String value2) {
            addCriterion("pic_path not between", value1, value2, "picPath");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNull() {
            addCriterion("quantity is null");
            return (Criteria) this;
        }

        public Criteria andQuantityIsNotNull() {
            addCriterion("quantity is not null");
            return (Criteria) this;
        }

        public Criteria andQuantityEqualTo(Long value) {
            addCriterion("quantity =", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotEqualTo(Long value) {
            addCriterion("quantity <>", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThan(Long value) {
            addCriterion("quantity >", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityGreaterThanOrEqualTo(Long value) {
            addCriterion("quantity >=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThan(Long value) {
            addCriterion("quantity <", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityLessThanOrEqualTo(Long value) {
            addCriterion("quantity <=", value, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityIn(List<Long> values) {
            addCriterion("quantity in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotIn(List<Long> values) {
            addCriterion("quantity not in", values, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityBetween(Long value1, Long value2) {
            addCriterion("quantity between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andQuantityNotBetween(Long value1, Long value2) {
            addCriterion("quantity not between", value1, value2, "quantity");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Long value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Long value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Long value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Long value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Long value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Long> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Long> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Long value1, Long value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Long value1, Long value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("is_delete like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("is_delete not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andPutinDateIsNull() {
            addCriterion("putin_date is null");
            return (Criteria) this;
        }

        public Criteria andPutinDateIsNotNull() {
            addCriterion("putin_date is not null");
            return (Criteria) this;
        }

        public Criteria andPutinDateEqualTo(Date value) {
            addCriterion("putin_date =", value, "putinDate");
            return (Criteria) this;
        }

        public Criteria andPutinDateNotEqualTo(Date value) {
            addCriterion("putin_date <>", value, "putinDate");
            return (Criteria) this;
        }

        public Criteria andPutinDateGreaterThan(Date value) {
            addCriterion("putin_date >", value, "putinDate");
            return (Criteria) this;
        }

        public Criteria andPutinDateGreaterThanOrEqualTo(Date value) {
            addCriterion("putin_date >=", value, "putinDate");
            return (Criteria) this;
        }

        public Criteria andPutinDateLessThan(Date value) {
            addCriterion("putin_date <", value, "putinDate");
            return (Criteria) this;
        }

        public Criteria andPutinDateLessThanOrEqualTo(Date value) {
            addCriterion("putin_date <=", value, "putinDate");
            return (Criteria) this;
        }

        public Criteria andPutinDateIn(List<Date> values) {
            addCriterion("putin_date in", values, "putinDate");
            return (Criteria) this;
        }

        public Criteria andPutinDateNotIn(List<Date> values) {
            addCriterion("putin_date not in", values, "putinDate");
            return (Criteria) this;
        }

        public Criteria andPutinDateBetween(Date value1, Date value2) {
            addCriterion("putin_date between", value1, value2, "putinDate");
            return (Criteria) this;
        }

        public Criteria andPutinDateNotBetween(Date value1, Date value2) {
            addCriterion("putin_date not between", value1, value2, "putinDate");
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

        public Criteria andProductUnitIsNull() {
            addCriterion("product_unit is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIsNotNull() {
            addCriterion("product_unit is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitEqualTo(String value) {
            addCriterion("product_unit =", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotEqualTo(String value) {
            addCriterion("product_unit <>", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThan(String value) {
            addCriterion("product_unit >", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitGreaterThanOrEqualTo(String value) {
            addCriterion("product_unit >=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThan(String value) {
            addCriterion("product_unit <", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLessThanOrEqualTo(String value) {
            addCriterion("product_unit <=", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitLike(String value) {
            addCriterion("product_unit like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotLike(String value) {
            addCriterion("product_unit not like", value, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitIn(List<String> values) {
            addCriterion("product_unit in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotIn(List<String> values) {
            addCriterion("product_unit not in", values, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitBetween(String value1, String value2) {
            addCriterion("product_unit between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andProductUnitNotBetween(String value1, String value2) {
            addCriterion("product_unit not between", value1, value2, "productUnit");
            return (Criteria) this;
        }

        public Criteria andIsBargainIsNull() {
            addCriterion("is_bargain is null");
            return (Criteria) this;
        }

        public Criteria andIsBargainIsNotNull() {
            addCriterion("is_bargain is not null");
            return (Criteria) this;
        }

        public Criteria andIsBargainEqualTo(String value) {
            addCriterion("is_bargain =", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainNotEqualTo(String value) {
            addCriterion("is_bargain <>", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainGreaterThan(String value) {
            addCriterion("is_bargain >", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainGreaterThanOrEqualTo(String value) {
            addCriterion("is_bargain >=", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainLessThan(String value) {
            addCriterion("is_bargain <", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainLessThanOrEqualTo(String value) {
            addCriterion("is_bargain <=", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainLike(String value) {
            addCriterion("is_bargain like", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainNotLike(String value) {
            addCriterion("is_bargain not like", value, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainIn(List<String> values) {
            addCriterion("is_bargain in", values, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainNotIn(List<String> values) {
            addCriterion("is_bargain not in", values, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainBetween(String value1, String value2) {
            addCriterion("is_bargain between", value1, value2, "isBargain");
            return (Criteria) this;
        }

        public Criteria andIsBargainNotBetween(String value1, String value2) {
            addCriterion("is_bargain not between", value1, value2, "isBargain");
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

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNikenameIsNull() {
            addCriterion("user_nikename is null");
            return (Criteria) this;
        }

        public Criteria andUserNikenameIsNotNull() {
            addCriterion("user_nikename is not null");
            return (Criteria) this;
        }

        public Criteria andUserNikenameEqualTo(String value) {
            addCriterion("user_nikename =", value, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameNotEqualTo(String value) {
            addCriterion("user_nikename <>", value, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameGreaterThan(String value) {
            addCriterion("user_nikename >", value, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameGreaterThanOrEqualTo(String value) {
            addCriterion("user_nikename >=", value, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameLessThan(String value) {
            addCriterion("user_nikename <", value, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameLessThanOrEqualTo(String value) {
            addCriterion("user_nikename <=", value, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameLike(String value) {
            addCriterion("user_nikename like", value, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameNotLike(String value) {
            addCriterion("user_nikename not like", value, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameIn(List<String> values) {
            addCriterion("user_nikename in", values, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameNotIn(List<String> values) {
            addCriterion("user_nikename not in", values, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameBetween(String value1, String value2) {
            addCriterion("user_nikename between", value1, value2, "userNikename");
            return (Criteria) this;
        }

        public Criteria andUserNikenameNotBetween(String value1, String value2) {
            addCriterion("user_nikename not between", value1, value2, "userNikename");
            return (Criteria) this;
        }

        public Criteria andPtTagIsNull() {
            addCriterion("pt_tag is null");
            return (Criteria) this;
        }

        public Criteria andPtTagIsNotNull() {
            addCriterion("pt_tag is not null");
            return (Criteria) this;
        }

        public Criteria andPtTagEqualTo(String value) {
            addCriterion("pt_tag =", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagNotEqualTo(String value) {
            addCriterion("pt_tag <>", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagGreaterThan(String value) {
            addCriterion("pt_tag >", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagGreaterThanOrEqualTo(String value) {
            addCriterion("pt_tag >=", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagLessThan(String value) {
            addCriterion("pt_tag <", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagLessThanOrEqualTo(String value) {
            addCriterion("pt_tag <=", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagLike(String value) {
            addCriterion("pt_tag like", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagNotLike(String value) {
            addCriterion("pt_tag not like", value, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagIn(List<String> values) {
            addCriterion("pt_tag in", values, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagNotIn(List<String> values) {
            addCriterion("pt_tag not in", values, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagBetween(String value1, String value2) {
            addCriterion("pt_tag between", value1, value2, "ptTag");
            return (Criteria) this;
        }

        public Criteria andPtTagNotBetween(String value1, String value2) {
            addCriterion("pt_tag not between", value1, value2, "ptTag");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeIsNull() {
            addCriterion("product_sale_type is null");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeIsNotNull() {
            addCriterion("product_sale_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeEqualTo(String value) {
            addCriterion("product_sale_type =", value, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeNotEqualTo(String value) {
            addCriterion("product_sale_type <>", value, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeGreaterThan(String value) {
            addCriterion("product_sale_type >", value, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_sale_type >=", value, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeLessThan(String value) {
            addCriterion("product_sale_type <", value, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeLessThanOrEqualTo(String value) {
            addCriterion("product_sale_type <=", value, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeLike(String value) {
            addCriterion("product_sale_type like", value, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeNotLike(String value) {
            addCriterion("product_sale_type not like", value, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeIn(List<String> values) {
            addCriterion("product_sale_type in", values, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeNotIn(List<String> values) {
            addCriterion("product_sale_type not in", values, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeBetween(String value1, String value2) {
            addCriterion("product_sale_type between", value1, value2, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andProductSaleTypeNotBetween(String value1, String value2) {
            addCriterion("product_sale_type not between", value1, value2, "productSaleType");
            return (Criteria) this;
        }

        public Criteria andMarketUnitIsNull() {
            addCriterion("market_unit is null");
            return (Criteria) this;
        }

        public Criteria andMarketUnitIsNotNull() {
            addCriterion("market_unit is not null");
            return (Criteria) this;
        }

        public Criteria andMarketUnitEqualTo(String value) {
            addCriterion("market_unit =", value, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitNotEqualTo(String value) {
            addCriterion("market_unit <>", value, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitGreaterThan(String value) {
            addCriterion("market_unit >", value, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitGreaterThanOrEqualTo(String value) {
            addCriterion("market_unit >=", value, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitLessThan(String value) {
            addCriterion("market_unit <", value, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitLessThanOrEqualTo(String value) {
            addCriterion("market_unit <=", value, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitLike(String value) {
            addCriterion("market_unit like", value, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitNotLike(String value) {
            addCriterion("market_unit not like", value, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitIn(List<String> values) {
            addCriterion("market_unit in", values, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitNotIn(List<String> values) {
            addCriterion("market_unit not in", values, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitBetween(String value1, String value2) {
            addCriterion("market_unit between", value1, value2, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andMarketUnitNotBetween(String value1, String value2) {
            addCriterion("market_unit not between", value1, value2, "marketUnit");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleIsNull() {
            addCriterion("product_market_scale is null");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleIsNotNull() {
            addCriterion("product_market_scale is not null");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleEqualTo(Long value) {
            addCriterion("product_market_scale =", value, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleNotEqualTo(Long value) {
            addCriterion("product_market_scale <>", value, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleGreaterThan(Long value) {
            addCriterion("product_market_scale >", value, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleGreaterThanOrEqualTo(Long value) {
            addCriterion("product_market_scale >=", value, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleLessThan(Long value) {
            addCriterion("product_market_scale <", value, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleLessThanOrEqualTo(Long value) {
            addCriterion("product_market_scale <=", value, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleIn(List<Long> values) {
            addCriterion("product_market_scale in", values, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleNotIn(List<Long> values) {
            addCriterion("product_market_scale not in", values, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleBetween(Long value1, Long value2) {
            addCriterion("product_market_scale between", value1, value2, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductMarketScaleNotBetween(Long value1, Long value2) {
            addCriterion("product_market_scale not between", value1, value2, "productMarketScale");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdIsNull() {
            addCriterion("product_unit_id is null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdIsNotNull() {
            addCriterion("product_unit_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdEqualTo(Long value) {
            addCriterion("product_unit_id =", value, "productUnitId");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdNotEqualTo(Long value) {
            addCriterion("product_unit_id <>", value, "productUnitId");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdGreaterThan(Long value) {
            addCriterion("product_unit_id >", value, "productUnitId");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_unit_id >=", value, "productUnitId");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdLessThan(Long value) {
            addCriterion("product_unit_id <", value, "productUnitId");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdLessThanOrEqualTo(Long value) {
            addCriterion("product_unit_id <=", value, "productUnitId");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdIn(List<Long> values) {
            addCriterion("product_unit_id in", values, "productUnitId");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdNotIn(List<Long> values) {
            addCriterion("product_unit_id not in", values, "productUnitId");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdBetween(Long value1, Long value2) {
            addCriterion("product_unit_id between", value1, value2, "productUnitId");
            return (Criteria) this;
        }

        public Criteria andProductUnitIdNotBetween(Long value1, Long value2) {
            addCriterion("product_unit_id not between", value1, value2, "productUnitId");
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
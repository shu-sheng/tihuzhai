package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblOrderItemsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblOrderItemsExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdIsNull() {
            addCriterion("item_product_id is null");
            return (Criteria) this;
        }

        public Criteria andItemProductIdIsNotNull() {
            addCriterion("item_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemProductIdEqualTo(Long value) {
            addCriterion("item_product_id =", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdNotEqualTo(Long value) {
            addCriterion("item_product_id <>", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdGreaterThan(Long value) {
            addCriterion("item_product_id >", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("item_product_id >=", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdLessThan(Long value) {
            addCriterion("item_product_id <", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdLessThanOrEqualTo(Long value) {
            addCriterion("item_product_id <=", value, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdIn(List<Long> values) {
            addCriterion("item_product_id in", values, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdNotIn(List<Long> values) {
            addCriterion("item_product_id not in", values, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdBetween(Long value1, Long value2) {
            addCriterion("item_product_id between", value1, value2, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductIdNotBetween(Long value1, Long value2) {
            addCriterion("item_product_id not between", value1, value2, "itemProductId");
            return (Criteria) this;
        }

        public Criteria andItemProductNameIsNull() {
            addCriterion("item_product_name is null");
            return (Criteria) this;
        }

        public Criteria andItemProductNameIsNotNull() {
            addCriterion("item_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemProductNameEqualTo(String value) {
            addCriterion("item_product_name =", value, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameNotEqualTo(String value) {
            addCriterion("item_product_name <>", value, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameGreaterThan(String value) {
            addCriterion("item_product_name >", value, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_product_name >=", value, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameLessThan(String value) {
            addCriterion("item_product_name <", value, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameLessThanOrEqualTo(String value) {
            addCriterion("item_product_name <=", value, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameLike(String value) {
            addCriterion("item_product_name like", value, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameNotLike(String value) {
            addCriterion("item_product_name not like", value, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameIn(List<String> values) {
            addCriterion("item_product_name in", values, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameNotIn(List<String> values) {
            addCriterion("item_product_name not in", values, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameBetween(String value1, String value2) {
            addCriterion("item_product_name between", value1, value2, "itemProductName");
            return (Criteria) this;
        }

        public Criteria andItemProductNameNotBetween(String value1, String value2) {
            addCriterion("item_product_name not between", value1, value2, "itemProductName");
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

        public Criteria andProPriceIsNull() {
            addCriterion("pro_price is null");
            return (Criteria) this;
        }

        public Criteria andProPriceIsNotNull() {
            addCriterion("pro_price is not null");
            return (Criteria) this;
        }

        public Criteria andProPriceEqualTo(Long value) {
            addCriterion("pro_price =", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotEqualTo(Long value) {
            addCriterion("pro_price <>", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThan(Long value) {
            addCriterion("pro_price >", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("pro_price >=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThan(Long value) {
            addCriterion("pro_price <", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceLessThanOrEqualTo(Long value) {
            addCriterion("pro_price <=", value, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceIn(List<Long> values) {
            addCriterion("pro_price in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotIn(List<Long> values) {
            addCriterion("pro_price not in", values, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceBetween(Long value1, Long value2) {
            addCriterion("pro_price between", value1, value2, "proPrice");
            return (Criteria) this;
        }

        public Criteria andProPriceNotBetween(Long value1, Long value2) {
            addCriterion("pro_price not between", value1, value2, "proPrice");
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

        public Criteria andPostFreeIsNull() {
            addCriterion("post_free is null");
            return (Criteria) this;
        }

        public Criteria andPostFreeIsNotNull() {
            addCriterion("post_free is not null");
            return (Criteria) this;
        }

        public Criteria andPostFreeEqualTo(Long value) {
            addCriterion("post_free =", value, "postFree");
            return (Criteria) this;
        }

        public Criteria andPostFreeNotEqualTo(Long value) {
            addCriterion("post_free <>", value, "postFree");
            return (Criteria) this;
        }

        public Criteria andPostFreeGreaterThan(Long value) {
            addCriterion("post_free >", value, "postFree");
            return (Criteria) this;
        }

        public Criteria andPostFreeGreaterThanOrEqualTo(Long value) {
            addCriterion("post_free >=", value, "postFree");
            return (Criteria) this;
        }

        public Criteria andPostFreeLessThan(Long value) {
            addCriterion("post_free <", value, "postFree");
            return (Criteria) this;
        }

        public Criteria andPostFreeLessThanOrEqualTo(Long value) {
            addCriterion("post_free <=", value, "postFree");
            return (Criteria) this;
        }

        public Criteria andPostFreeIn(List<Long> values) {
            addCriterion("post_free in", values, "postFree");
            return (Criteria) this;
        }

        public Criteria andPostFreeNotIn(List<Long> values) {
            addCriterion("post_free not in", values, "postFree");
            return (Criteria) this;
        }

        public Criteria andPostFreeBetween(Long value1, Long value2) {
            addCriterion("post_free between", value1, value2, "postFree");
            return (Criteria) this;
        }

        public Criteria andPostFreeNotBetween(Long value1, Long value2) {
            addCriterion("post_free not between", value1, value2, "postFree");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
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

        public Criteria andNoShipmentAmountIsNull() {
            addCriterion("no_shipment_amount is null");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountIsNotNull() {
            addCriterion("no_shipment_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountEqualTo(Long value) {
            addCriterion("no_shipment_amount =", value, "noShipmentAmount");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountNotEqualTo(Long value) {
            addCriterion("no_shipment_amount <>", value, "noShipmentAmount");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountGreaterThan(Long value) {
            addCriterion("no_shipment_amount >", value, "noShipmentAmount");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("no_shipment_amount >=", value, "noShipmentAmount");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountLessThan(Long value) {
            addCriterion("no_shipment_amount <", value, "noShipmentAmount");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountLessThanOrEqualTo(Long value) {
            addCriterion("no_shipment_amount <=", value, "noShipmentAmount");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountIn(List<Long> values) {
            addCriterion("no_shipment_amount in", values, "noShipmentAmount");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountNotIn(List<Long> values) {
            addCriterion("no_shipment_amount not in", values, "noShipmentAmount");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountBetween(Long value1, Long value2) {
            addCriterion("no_shipment_amount between", value1, value2, "noShipmentAmount");
            return (Criteria) this;
        }

        public Criteria andNoShipmentAmountNotBetween(Long value1, Long value2) {
            addCriterion("no_shipment_amount not between", value1, value2, "noShipmentAmount");
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
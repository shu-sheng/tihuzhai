package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserAccountDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserAccountDataExample() {
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

        public Criteria andUserIntegralIsNull() {
            addCriterion("user_integral is null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIsNotNull() {
            addCriterion("user_integral is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralEqualTo(Long value) {
            addCriterion("user_integral =", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotEqualTo(Long value) {
            addCriterion("user_integral <>", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThan(Long value) {
            addCriterion("user_integral >", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGreaterThanOrEqualTo(Long value) {
            addCriterion("user_integral >=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThan(Long value) {
            addCriterion("user_integral <", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralLessThanOrEqualTo(Long value) {
            addCriterion("user_integral <=", value, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralIn(List<Long> values) {
            addCriterion("user_integral in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotIn(List<Long> values) {
            addCriterion("user_integral not in", values, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralBetween(Long value1, Long value2) {
            addCriterion("user_integral between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralNotBetween(Long value1, Long value2) {
            addCriterion("user_integral not between", value1, value2, "userIntegral");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalIsNull() {
            addCriterion("user_integral_grand_total is null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalIsNotNull() {
            addCriterion("user_integral_grand_total is not null");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalEqualTo(Long value) {
            addCriterion("user_integral_grand_total =", value, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalNotEqualTo(Long value) {
            addCriterion("user_integral_grand_total <>", value, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalGreaterThan(Long value) {
            addCriterion("user_integral_grand_total >", value, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("user_integral_grand_total >=", value, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalLessThan(Long value) {
            addCriterion("user_integral_grand_total <", value, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalLessThanOrEqualTo(Long value) {
            addCriterion("user_integral_grand_total <=", value, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalIn(List<Long> values) {
            addCriterion("user_integral_grand_total in", values, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalNotIn(List<Long> values) {
            addCriterion("user_integral_grand_total not in", values, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalBetween(Long value1, Long value2) {
            addCriterion("user_integral_grand_total between", value1, value2, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserIntegralGrandTotalNotBetween(Long value1, Long value2) {
            addCriterion("user_integral_grand_total not between", value1, value2, "userIntegralGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountIsNull() {
            addCriterion("user_coupon_count is null");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountIsNotNull() {
            addCriterion("user_coupon_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountEqualTo(Long value) {
            addCriterion("user_coupon_count =", value, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountNotEqualTo(Long value) {
            addCriterion("user_coupon_count <>", value, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGreaterThan(Long value) {
            addCriterion("user_coupon_count >", value, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_coupon_count >=", value, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountLessThan(Long value) {
            addCriterion("user_coupon_count <", value, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountLessThanOrEqualTo(Long value) {
            addCriterion("user_coupon_count <=", value, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountIn(List<Long> values) {
            addCriterion("user_coupon_count in", values, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountNotIn(List<Long> values) {
            addCriterion("user_coupon_count not in", values, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountBetween(Long value1, Long value2) {
            addCriterion("user_coupon_count between", value1, value2, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountNotBetween(Long value1, Long value2) {
            addCriterion("user_coupon_count not between", value1, value2, "userCouponCount");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalIsNull() {
            addCriterion("user_coupon_count_grand_total is null");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalIsNotNull() {
            addCriterion("user_coupon_count_grand_total is not null");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalEqualTo(Long value) {
            addCriterion("user_coupon_count_grand_total =", value, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalNotEqualTo(Long value) {
            addCriterion("user_coupon_count_grand_total <>", value, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalGreaterThan(Long value) {
            addCriterion("user_coupon_count_grand_total >", value, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("user_coupon_count_grand_total >=", value, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalLessThan(Long value) {
            addCriterion("user_coupon_count_grand_total <", value, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalLessThanOrEqualTo(Long value) {
            addCriterion("user_coupon_count_grand_total <=", value, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalIn(List<Long> values) {
            addCriterion("user_coupon_count_grand_total in", values, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalNotIn(List<Long> values) {
            addCriterion("user_coupon_count_grand_total not in", values, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalBetween(Long value1, Long value2) {
            addCriterion("user_coupon_count_grand_total between", value1, value2, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponCountGrandTotalNotBetween(Long value1, Long value2) {
            addCriterion("user_coupon_count_grand_total not between", value1, value2, "userCouponCountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountIsNull() {
            addCriterion("user_coupon_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountIsNotNull() {
            addCriterion("user_coupon_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountEqualTo(Long value) {
            addCriterion("user_coupon_amount =", value, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountNotEqualTo(Long value) {
            addCriterion("user_coupon_amount <>", value, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGreaterThan(Long value) {
            addCriterion("user_coupon_amount >", value, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_coupon_amount >=", value, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountLessThan(Long value) {
            addCriterion("user_coupon_amount <", value, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountLessThanOrEqualTo(Long value) {
            addCriterion("user_coupon_amount <=", value, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountIn(List<Long> values) {
            addCriterion("user_coupon_amount in", values, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountNotIn(List<Long> values) {
            addCriterion("user_coupon_amount not in", values, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountBetween(Long value1, Long value2) {
            addCriterion("user_coupon_amount between", value1, value2, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountNotBetween(Long value1, Long value2) {
            addCriterion("user_coupon_amount not between", value1, value2, "userCouponAmount");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalIsNull() {
            addCriterion("user_coupon_amount_grand_total is null");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalIsNotNull() {
            addCriterion("user_coupon_amount_grand_total is not null");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalEqualTo(Long value) {
            addCriterion("user_coupon_amount_grand_total =", value, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalNotEqualTo(Long value) {
            addCriterion("user_coupon_amount_grand_total <>", value, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalGreaterThan(Long value) {
            addCriterion("user_coupon_amount_grand_total >", value, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("user_coupon_amount_grand_total >=", value, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalLessThan(Long value) {
            addCriterion("user_coupon_amount_grand_total <", value, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalLessThanOrEqualTo(Long value) {
            addCriterion("user_coupon_amount_grand_total <=", value, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalIn(List<Long> values) {
            addCriterion("user_coupon_amount_grand_total in", values, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalNotIn(List<Long> values) {
            addCriterion("user_coupon_amount_grand_total not in", values, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalBetween(Long value1, Long value2) {
            addCriterion("user_coupon_amount_grand_total between", value1, value2, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserCouponAmountGrandTotalNotBetween(Long value1, Long value2) {
            addCriterion("user_coupon_amount_grand_total not between", value1, value2, "userCouponAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountIsNull() {
            addCriterion("user_gift_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountIsNotNull() {
            addCriterion("user_gift_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountEqualTo(Long value) {
            addCriterion("user_gift_amount =", value, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountNotEqualTo(Long value) {
            addCriterion("user_gift_amount <>", value, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGreaterThan(Long value) {
            addCriterion("user_gift_amount >", value, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount >=", value, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountLessThan(Long value) {
            addCriterion("user_gift_amount <", value, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountLessThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount <=", value, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountIn(List<Long> values) {
            addCriterion("user_gift_amount in", values, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountNotIn(List<Long> values) {
            addCriterion("user_gift_amount not in", values, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount between", value1, value2, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountNotBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount not between", value1, value2, "userGiftAmount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalIsNull() {
            addCriterion("user_gift_amount_grand_total is null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalIsNotNull() {
            addCriterion("user_gift_amount_grand_total is not null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalEqualTo(Long value) {
            addCriterion("user_gift_amount_grand_total =", value, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalNotEqualTo(Long value) {
            addCriterion("user_gift_amount_grand_total <>", value, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalGreaterThan(Long value) {
            addCriterion("user_gift_amount_grand_total >", value, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_grand_total >=", value, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalLessThan(Long value) {
            addCriterion("user_gift_amount_grand_total <", value, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalLessThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_grand_total <=", value, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalIn(List<Long> values) {
            addCriterion("user_gift_amount_grand_total in", values, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalNotIn(List<Long> values) {
            addCriterion("user_gift_amount_grand_total not in", values, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_grand_total between", value1, value2, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandTotalNotBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_grand_total not between", value1, value2, "userGiftAmountGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountIsNull() {
            addCriterion("user_gift_amount_count is null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountIsNotNull() {
            addCriterion("user_gift_amount_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountEqualTo(Long value) {
            addCriterion("user_gift_amount_count =", value, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountNotEqualTo(Long value) {
            addCriterion("user_gift_amount_count <>", value, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountGreaterThan(Long value) {
            addCriterion("user_gift_amount_count >", value, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_count >=", value, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountLessThan(Long value) {
            addCriterion("user_gift_amount_count <", value, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountLessThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_count <=", value, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountIn(List<Long> values) {
            addCriterion("user_gift_amount_count in", values, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountNotIn(List<Long> values) {
            addCriterion("user_gift_amount_count not in", values, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_count between", value1, value2, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCountNotBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_count not between", value1, value2, "userGiftAmountCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountIsNull() {
            addCriterion("user_gift_amount_grand_count is null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountIsNotNull() {
            addCriterion("user_gift_amount_grand_count is not null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountEqualTo(Long value) {
            addCriterion("user_gift_amount_grand_count =", value, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountNotEqualTo(Long value) {
            addCriterion("user_gift_amount_grand_count <>", value, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountGreaterThan(Long value) {
            addCriterion("user_gift_amount_grand_count >", value, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_grand_count >=", value, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountLessThan(Long value) {
            addCriterion("user_gift_amount_grand_count <", value, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountLessThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_grand_count <=", value, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountIn(List<Long> values) {
            addCriterion("user_gift_amount_grand_count in", values, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountNotIn(List<Long> values) {
            addCriterion("user_gift_amount_grand_count not in", values, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_grand_count between", value1, value2, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountGrandCountNotBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_grand_count not between", value1, value2, "userGiftAmountGrandCount");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashIsNull() {
            addCriterion("user_gift_amount_cash is null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashIsNotNull() {
            addCriterion("user_gift_amount_cash is not null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashEqualTo(Long value) {
            addCriterion("user_gift_amount_cash =", value, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashNotEqualTo(Long value) {
            addCriterion("user_gift_amount_cash <>", value, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGreaterThan(Long value) {
            addCriterion("user_gift_amount_cash >", value, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGreaterThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_cash >=", value, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashLessThan(Long value) {
            addCriterion("user_gift_amount_cash <", value, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashLessThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_cash <=", value, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashIn(List<Long> values) {
            addCriterion("user_gift_amount_cash in", values, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashNotIn(List<Long> values) {
            addCriterion("user_gift_amount_cash not in", values, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_cash between", value1, value2, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashNotBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_cash not between", value1, value2, "userGiftAmountCash");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalIsNull() {
            addCriterion("user_gift_amount_cash_grand_total is null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalIsNotNull() {
            addCriterion("user_gift_amount_cash_grand_total is not null");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalEqualTo(Long value) {
            addCriterion("user_gift_amount_cash_grand_total =", value, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalNotEqualTo(Long value) {
            addCriterion("user_gift_amount_cash_grand_total <>", value, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalGreaterThan(Long value) {
            addCriterion("user_gift_amount_cash_grand_total >", value, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalGreaterThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_cash_grand_total >=", value, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalLessThan(Long value) {
            addCriterion("user_gift_amount_cash_grand_total <", value, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalLessThanOrEqualTo(Long value) {
            addCriterion("user_gift_amount_cash_grand_total <=", value, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalIn(List<Long> values) {
            addCriterion("user_gift_amount_cash_grand_total in", values, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalNotIn(List<Long> values) {
            addCriterion("user_gift_amount_cash_grand_total not in", values, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_cash_grand_total between", value1, value2, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGiftAmountCashGrandTotalNotBetween(Long value1, Long value2) {
            addCriterion("user_gift_amount_cash_grand_total not between", value1, value2, "userGiftAmountCashGrandTotal");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueIsNull() {
            addCriterion("user_growth_value is null");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueIsNotNull() {
            addCriterion("user_growth_value is not null");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueEqualTo(Long value) {
            addCriterion("user_growth_value =", value, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueNotEqualTo(Long value) {
            addCriterion("user_growth_value <>", value, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueGreaterThan(Long value) {
            addCriterion("user_growth_value >", value, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueGreaterThanOrEqualTo(Long value) {
            addCriterion("user_growth_value >=", value, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueLessThan(Long value) {
            addCriterion("user_growth_value <", value, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueLessThanOrEqualTo(Long value) {
            addCriterion("user_growth_value <=", value, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueIn(List<Long> values) {
            addCriterion("user_growth_value in", values, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueNotIn(List<Long> values) {
            addCriterion("user_growth_value not in", values, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueBetween(Long value1, Long value2) {
            addCriterion("user_growth_value between", value1, value2, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserGrowthValueNotBetween(Long value1, Long value2) {
            addCriterion("user_growth_value not between", value1, value2, "userGrowthValue");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIsNull() {
            addCriterion("user_balance is null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIsNotNull() {
            addCriterion("user_balance is not null");
            return (Criteria) this;
        }

        public Criteria andUserBalanceEqualTo(Long value) {
            addCriterion("user_balance =", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotEqualTo(Long value) {
            addCriterion("user_balance <>", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThan(Long value) {
            addCriterion("user_balance >", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("user_balance >=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThan(Long value) {
            addCriterion("user_balance <", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceLessThanOrEqualTo(Long value) {
            addCriterion("user_balance <=", value, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceIn(List<Long> values) {
            addCriterion("user_balance in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotIn(List<Long> values) {
            addCriterion("user_balance not in", values, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceBetween(Long value1, Long value2) {
            addCriterion("user_balance between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserBalanceNotBetween(Long value1, Long value2) {
            addCriterion("user_balance not between", value1, value2, "userBalance");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountIsNull() {
            addCriterion("user_trade_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountIsNotNull() {
            addCriterion("user_trade_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountEqualTo(Long value) {
            addCriterion("user_trade_amount =", value, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountNotEqualTo(Long value) {
            addCriterion("user_trade_amount <>", value, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountGreaterThan(Long value) {
            addCriterion("user_trade_amount >", value, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_trade_amount >=", value, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountLessThan(Long value) {
            addCriterion("user_trade_amount <", value, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountLessThanOrEqualTo(Long value) {
            addCriterion("user_trade_amount <=", value, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountIn(List<Long> values) {
            addCriterion("user_trade_amount in", values, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountNotIn(List<Long> values) {
            addCriterion("user_trade_amount not in", values, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountBetween(Long value1, Long value2) {
            addCriterion("user_trade_amount between", value1, value2, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeAmountNotBetween(Long value1, Long value2) {
            addCriterion("user_trade_amount not between", value1, value2, "userTradeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountIsNull() {
            addCriterion("user_recharge_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountIsNotNull() {
            addCriterion("user_recharge_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountEqualTo(Long value) {
            addCriterion("user_recharge_amount =", value, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountNotEqualTo(Long value) {
            addCriterion("user_recharge_amount <>", value, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountGreaterThan(Long value) {
            addCriterion("user_recharge_amount >", value, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_recharge_amount >=", value, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountLessThan(Long value) {
            addCriterion("user_recharge_amount <", value, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountLessThanOrEqualTo(Long value) {
            addCriterion("user_recharge_amount <=", value, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountIn(List<Long> values) {
            addCriterion("user_recharge_amount in", values, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountNotIn(List<Long> values) {
            addCriterion("user_recharge_amount not in", values, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountBetween(Long value1, Long value2) {
            addCriterion("user_recharge_amount between", value1, value2, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserRechargeAmountNotBetween(Long value1, Long value2) {
            addCriterion("user_recharge_amount not between", value1, value2, "userRechargeAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountIsNull() {
            addCriterion("user_withdraw_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountIsNotNull() {
            addCriterion("user_withdraw_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountEqualTo(Long value) {
            addCriterion("user_withdraw_amount =", value, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountNotEqualTo(Long value) {
            addCriterion("user_withdraw_amount <>", value, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountGreaterThan(Long value) {
            addCriterion("user_withdraw_amount >", value, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_withdraw_amount >=", value, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountLessThan(Long value) {
            addCriterion("user_withdraw_amount <", value, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountLessThanOrEqualTo(Long value) {
            addCriterion("user_withdraw_amount <=", value, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountIn(List<Long> values) {
            addCriterion("user_withdraw_amount in", values, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountNotIn(List<Long> values) {
            addCriterion("user_withdraw_amount not in", values, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountBetween(Long value1, Long value2) {
            addCriterion("user_withdraw_amount between", value1, value2, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserWithdrawAmountNotBetween(Long value1, Long value2) {
            addCriterion("user_withdraw_amount not between", value1, value2, "userWithdrawAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountIsNull() {
            addCriterion("user_freeze_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountIsNotNull() {
            addCriterion("user_freeze_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountEqualTo(Long value) {
            addCriterion("user_freeze_amount =", value, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountNotEqualTo(Long value) {
            addCriterion("user_freeze_amount <>", value, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountGreaterThan(Long value) {
            addCriterion("user_freeze_amount >", value, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_freeze_amount >=", value, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountLessThan(Long value) {
            addCriterion("user_freeze_amount <", value, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountLessThanOrEqualTo(Long value) {
            addCriterion("user_freeze_amount <=", value, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountIn(List<Long> values) {
            addCriterion("user_freeze_amount in", values, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountNotIn(List<Long> values) {
            addCriterion("user_freeze_amount not in", values, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountBetween(Long value1, Long value2) {
            addCriterion("user_freeze_amount between", value1, value2, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserFreezeAmountNotBetween(Long value1, Long value2) {
            addCriterion("user_freeze_amount not between", value1, value2, "userFreezeAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountIsNull() {
            addCriterion("user_payed_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountIsNotNull() {
            addCriterion("user_payed_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountEqualTo(Long value) {
            addCriterion("user_payed_amount =", value, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountNotEqualTo(Long value) {
            addCriterion("user_payed_amount <>", value, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountGreaterThan(Long value) {
            addCriterion("user_payed_amount >", value, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("user_payed_amount >=", value, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountLessThan(Long value) {
            addCriterion("user_payed_amount <", value, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountLessThanOrEqualTo(Long value) {
            addCriterion("user_payed_amount <=", value, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountIn(List<Long> values) {
            addCriterion("user_payed_amount in", values, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountNotIn(List<Long> values) {
            addCriterion("user_payed_amount not in", values, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountBetween(Long value1, Long value2) {
            addCriterion("user_payed_amount between", value1, value2, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserPayedAmountNotBetween(Long value1, Long value2) {
            addCriterion("user_payed_amount not between", value1, value2, "userPayedAmount");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayIsNull() {
            addCriterion("user_trade_day is null");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayIsNotNull() {
            addCriterion("user_trade_day is not null");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayEqualTo(Long value) {
            addCriterion("user_trade_day =", value, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayNotEqualTo(Long value) {
            addCriterion("user_trade_day <>", value, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayGreaterThan(Long value) {
            addCriterion("user_trade_day >", value, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayGreaterThanOrEqualTo(Long value) {
            addCriterion("user_trade_day >=", value, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayLessThan(Long value) {
            addCriterion("user_trade_day <", value, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayLessThanOrEqualTo(Long value) {
            addCriterion("user_trade_day <=", value, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayIn(List<Long> values) {
            addCriterion("user_trade_day in", values, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayNotIn(List<Long> values) {
            addCriterion("user_trade_day not in", values, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayBetween(Long value1, Long value2) {
            addCriterion("user_trade_day between", value1, value2, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andUserTradeDayNotBetween(Long value1, Long value2) {
            addCriterion("user_trade_day not between", value1, value2, "userTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayIsNull() {
            addCriterion("last_trade_day is null");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayIsNotNull() {
            addCriterion("last_trade_day is not null");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayEqualTo(String value) {
            addCriterion("last_trade_day =", value, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayNotEqualTo(String value) {
            addCriterion("last_trade_day <>", value, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayGreaterThan(String value) {
            addCriterion("last_trade_day >", value, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayGreaterThanOrEqualTo(String value) {
            addCriterion("last_trade_day >=", value, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayLessThan(String value) {
            addCriterion("last_trade_day <", value, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayLessThanOrEqualTo(String value) {
            addCriterion("last_trade_day <=", value, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayLike(String value) {
            addCriterion("last_trade_day like", value, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayNotLike(String value) {
            addCriterion("last_trade_day not like", value, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayIn(List<String> values) {
            addCriterion("last_trade_day in", values, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayNotIn(List<String> values) {
            addCriterion("last_trade_day not in", values, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayBetween(String value1, String value2) {
            addCriterion("last_trade_day between", value1, value2, "lastTradeDay");
            return (Criteria) this;
        }

        public Criteria andLastTradeDayNotBetween(String value1, String value2) {
            addCriterion("last_trade_day not between", value1, value2, "lastTradeDay");
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
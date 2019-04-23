package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserPointsDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserPointsDetailExample() {
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

        public Criteria andPointsDetailIdIsNull() {
            addCriterion("points_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdIsNotNull() {
            addCriterion("points_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdEqualTo(Long value) {
            addCriterion("points_detail_id =", value, "pointsDetailId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdNotEqualTo(Long value) {
            addCriterion("points_detail_id <>", value, "pointsDetailId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdGreaterThan(Long value) {
            addCriterion("points_detail_id >", value, "pointsDetailId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("points_detail_id >=", value, "pointsDetailId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdLessThan(Long value) {
            addCriterion("points_detail_id <", value, "pointsDetailId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("points_detail_id <=", value, "pointsDetailId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdIn(List<Long> values) {
            addCriterion("points_detail_id in", values, "pointsDetailId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdNotIn(List<Long> values) {
            addCriterion("points_detail_id not in", values, "pointsDetailId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdBetween(Long value1, Long value2) {
            addCriterion("points_detail_id between", value1, value2, "pointsDetailId");
            return (Criteria) this;
        }

        public Criteria andPointsDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("points_detail_id not between", value1, value2, "pointsDetailId");
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

        public Criteria andValueTypeIsNull() {
            addCriterion("value_type is null");
            return (Criteria) this;
        }

        public Criteria andValueTypeIsNotNull() {
            addCriterion("value_type is not null");
            return (Criteria) this;
        }

        public Criteria andValueTypeEqualTo(String value) {
            addCriterion("value_type =", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotEqualTo(String value) {
            addCriterion("value_type <>", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeGreaterThan(String value) {
            addCriterion("value_type >", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeGreaterThanOrEqualTo(String value) {
            addCriterion("value_type >=", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLessThan(String value) {
            addCriterion("value_type <", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLessThanOrEqualTo(String value) {
            addCriterion("value_type <=", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeLike(String value) {
            addCriterion("value_type like", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotLike(String value) {
            addCriterion("value_type not like", value, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeIn(List<String> values) {
            addCriterion("value_type in", values, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotIn(List<String> values) {
            addCriterion("value_type not in", values, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeBetween(String value1, String value2) {
            addCriterion("value_type between", value1, value2, "valueType");
            return (Criteria) this;
        }

        public Criteria andValueTypeNotBetween(String value1, String value2) {
            addCriterion("value_type not between", value1, value2, "valueType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeIsNull() {
            addCriterion("points_type is null");
            return (Criteria) this;
        }

        public Criteria andPointsTypeIsNotNull() {
            addCriterion("points_type is not null");
            return (Criteria) this;
        }

        public Criteria andPointsTypeEqualTo(String value) {
            addCriterion("points_type =", value, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeNotEqualTo(String value) {
            addCriterion("points_type <>", value, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeGreaterThan(String value) {
            addCriterion("points_type >", value, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("points_type >=", value, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeLessThan(String value) {
            addCriterion("points_type <", value, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeLessThanOrEqualTo(String value) {
            addCriterion("points_type <=", value, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeLike(String value) {
            addCriterion("points_type like", value, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeNotLike(String value) {
            addCriterion("points_type not like", value, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeIn(List<String> values) {
            addCriterion("points_type in", values, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeNotIn(List<String> values) {
            addCriterion("points_type not in", values, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeBetween(String value1, String value2) {
            addCriterion("points_type between", value1, value2, "pointsType");
            return (Criteria) this;
        }

        public Criteria andPointsTypeNotBetween(String value1, String value2) {
            addCriterion("points_type not between", value1, value2, "pointsType");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNull() {
            addCriterion("goods is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNotNull() {
            addCriterion("goods is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEqualTo(String value) {
            addCriterion("goods =", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotEqualTo(String value) {
            addCriterion("goods <>", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThan(String value) {
            addCriterion("goods >", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("goods >=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThan(String value) {
            addCriterion("goods <", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThanOrEqualTo(String value) {
            addCriterion("goods <=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLike(String value) {
            addCriterion("goods like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotLike(String value) {
            addCriterion("goods not like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsIn(List<String> values) {
            addCriterion("goods in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotIn(List<String> values) {
            addCriterion("goods not in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsBetween(String value1, String value2) {
            addCriterion("goods between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotBetween(String value1, String value2) {
            addCriterion("goods not between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andPointValueIsNull() {
            addCriterion("point_value is null");
            return (Criteria) this;
        }

        public Criteria andPointValueIsNotNull() {
            addCriterion("point_value is not null");
            return (Criteria) this;
        }

        public Criteria andPointValueEqualTo(Long value) {
            addCriterion("point_value =", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueNotEqualTo(Long value) {
            addCriterion("point_value <>", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueGreaterThan(Long value) {
            addCriterion("point_value >", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueGreaterThanOrEqualTo(Long value) {
            addCriterion("point_value >=", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueLessThan(Long value) {
            addCriterion("point_value <", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueLessThanOrEqualTo(Long value) {
            addCriterion("point_value <=", value, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueIn(List<Long> values) {
            addCriterion("point_value in", values, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueNotIn(List<Long> values) {
            addCriterion("point_value not in", values, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueBetween(Long value1, Long value2) {
            addCriterion("point_value between", value1, value2, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointValueNotBetween(Long value1, Long value2) {
            addCriterion("point_value not between", value1, value2, "pointValue");
            return (Criteria) this;
        }

        public Criteria andPointBalanceIsNull() {
            addCriterion("point_balance is null");
            return (Criteria) this;
        }

        public Criteria andPointBalanceIsNotNull() {
            addCriterion("point_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPointBalanceEqualTo(Long value) {
            addCriterion("point_balance =", value, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andPointBalanceNotEqualTo(Long value) {
            addCriterion("point_balance <>", value, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andPointBalanceGreaterThan(Long value) {
            addCriterion("point_balance >", value, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andPointBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("point_balance >=", value, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andPointBalanceLessThan(Long value) {
            addCriterion("point_balance <", value, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andPointBalanceLessThanOrEqualTo(Long value) {
            addCriterion("point_balance <=", value, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andPointBalanceIn(List<Long> values) {
            addCriterion("point_balance in", values, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andPointBalanceNotIn(List<Long> values) {
            addCriterion("point_balance not in", values, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andPointBalanceBetween(Long value1, Long value2) {
            addCriterion("point_balance between", value1, value2, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andPointBalanceNotBetween(Long value1, Long value2) {
            addCriterion("point_balance not between", value1, value2, "pointBalance");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueIsNull() {
            addCriterion("consumer_point_value is null");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueIsNotNull() {
            addCriterion("consumer_point_value is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueEqualTo(Long value) {
            addCriterion("consumer_point_value =", value, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueNotEqualTo(Long value) {
            addCriterion("consumer_point_value <>", value, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueGreaterThan(Long value) {
            addCriterion("consumer_point_value >", value, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueGreaterThanOrEqualTo(Long value) {
            addCriterion("consumer_point_value >=", value, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueLessThan(Long value) {
            addCriterion("consumer_point_value <", value, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueLessThanOrEqualTo(Long value) {
            addCriterion("consumer_point_value <=", value, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueIn(List<Long> values) {
            addCriterion("consumer_point_value in", values, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueNotIn(List<Long> values) {
            addCriterion("consumer_point_value not in", values, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueBetween(Long value1, Long value2) {
            addCriterion("consumer_point_value between", value1, value2, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andConsumerPointValueNotBetween(Long value1, Long value2) {
            addCriterion("consumer_point_value not between", value1, value2, "consumerPointValue");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdIsNull() {
            addCriterion("points_rule_id is null");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdIsNotNull() {
            addCriterion("points_rule_id is not null");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdEqualTo(Long value) {
            addCriterion("points_rule_id =", value, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdNotEqualTo(Long value) {
            addCriterion("points_rule_id <>", value, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdGreaterThan(Long value) {
            addCriterion("points_rule_id >", value, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("points_rule_id >=", value, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdLessThan(Long value) {
            addCriterion("points_rule_id <", value, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdLessThanOrEqualTo(Long value) {
            addCriterion("points_rule_id <=", value, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdIn(List<Long> values) {
            addCriterion("points_rule_id in", values, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdNotIn(List<Long> values) {
            addCriterion("points_rule_id not in", values, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdBetween(Long value1, Long value2) {
            addCriterion("points_rule_id between", value1, value2, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andPointsRuleIdNotBetween(Long value1, Long value2) {
            addCriterion("points_rule_id not between", value1, value2, "pointsRuleId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andDef1IsNull() {
            addCriterion("def1 is null");
            return (Criteria) this;
        }

        public Criteria andDef1IsNotNull() {
            addCriterion("def1 is not null");
            return (Criteria) this;
        }

        public Criteria andDef1EqualTo(String value) {
            addCriterion("def1 =", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotEqualTo(String value) {
            addCriterion("def1 <>", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThan(String value) {
            addCriterion("def1 >", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1GreaterThanOrEqualTo(String value) {
            addCriterion("def1 >=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThan(String value) {
            addCriterion("def1 <", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1LessThanOrEqualTo(String value) {
            addCriterion("def1 <=", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Like(String value) {
            addCriterion("def1 like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotLike(String value) {
            addCriterion("def1 not like", value, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1In(List<String> values) {
            addCriterion("def1 in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotIn(List<String> values) {
            addCriterion("def1 not in", values, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1Between(String value1, String value2) {
            addCriterion("def1 between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef1NotBetween(String value1, String value2) {
            addCriterion("def1 not between", value1, value2, "def1");
            return (Criteria) this;
        }

        public Criteria andDef2IsNull() {
            addCriterion("def2 is null");
            return (Criteria) this;
        }

        public Criteria andDef2IsNotNull() {
            addCriterion("def2 is not null");
            return (Criteria) this;
        }

        public Criteria andDef2EqualTo(String value) {
            addCriterion("def2 =", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotEqualTo(String value) {
            addCriterion("def2 <>", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThan(String value) {
            addCriterion("def2 >", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2GreaterThanOrEqualTo(String value) {
            addCriterion("def2 >=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThan(String value) {
            addCriterion("def2 <", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2LessThanOrEqualTo(String value) {
            addCriterion("def2 <=", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Like(String value) {
            addCriterion("def2 like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotLike(String value) {
            addCriterion("def2 not like", value, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2In(List<String> values) {
            addCriterion("def2 in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotIn(List<String> values) {
            addCriterion("def2 not in", values, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2Between(String value1, String value2) {
            addCriterion("def2 between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef2NotBetween(String value1, String value2) {
            addCriterion("def2 not between", value1, value2, "def2");
            return (Criteria) this;
        }

        public Criteria andDef3IsNull() {
            addCriterion("def3 is null");
            return (Criteria) this;
        }

        public Criteria andDef3IsNotNull() {
            addCriterion("def3 is not null");
            return (Criteria) this;
        }

        public Criteria andDef3EqualTo(String value) {
            addCriterion("def3 =", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotEqualTo(String value) {
            addCriterion("def3 <>", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThan(String value) {
            addCriterion("def3 >", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3GreaterThanOrEqualTo(String value) {
            addCriterion("def3 >=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThan(String value) {
            addCriterion("def3 <", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3LessThanOrEqualTo(String value) {
            addCriterion("def3 <=", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Like(String value) {
            addCriterion("def3 like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotLike(String value) {
            addCriterion("def3 not like", value, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3In(List<String> values) {
            addCriterion("def3 in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotIn(List<String> values) {
            addCriterion("def3 not in", values, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3Between(String value1, String value2) {
            addCriterion("def3 between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andDef3NotBetween(String value1, String value2) {
            addCriterion("def3 not between", value1, value2, "def3");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIsNull() {
            addCriterion("out_biz_no is null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIsNotNull() {
            addCriterion("out_biz_no is not null");
            return (Criteria) this;
        }

        public Criteria andOutBizNoEqualTo(String value) {
            addCriterion("out_biz_no =", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotEqualTo(String value) {
            addCriterion("out_biz_no <>", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThan(String value) {
            addCriterion("out_biz_no >", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoGreaterThanOrEqualTo(String value) {
            addCriterion("out_biz_no >=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThan(String value) {
            addCriterion("out_biz_no <", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLessThanOrEqualTo(String value) {
            addCriterion("out_biz_no <=", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoLike(String value) {
            addCriterion("out_biz_no like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotLike(String value) {
            addCriterion("out_biz_no not like", value, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoIn(List<String> values) {
            addCriterion("out_biz_no in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotIn(List<String> values) {
            addCriterion("out_biz_no not in", values, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoBetween(String value1, String value2) {
            addCriterion("out_biz_no between", value1, value2, "outBizNo");
            return (Criteria) this;
        }

        public Criteria andOutBizNoNotBetween(String value1, String value2) {
            addCriterion("out_biz_no not between", value1, value2, "outBizNo");
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
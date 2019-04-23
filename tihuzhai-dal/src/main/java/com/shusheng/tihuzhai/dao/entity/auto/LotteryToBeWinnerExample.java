package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LotteryToBeWinnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LotteryToBeWinnerExample() {
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

        public Criteria andToBeWinnerIdIsNull() {
            addCriterion("to_be_winner_id is null");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdIsNotNull() {
            addCriterion("to_be_winner_id is not null");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdEqualTo(Long value) {
            addCriterion("to_be_winner_id =", value, "toBeWinnerId");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdNotEqualTo(Long value) {
            addCriterion("to_be_winner_id <>", value, "toBeWinnerId");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdGreaterThan(Long value) {
            addCriterion("to_be_winner_id >", value, "toBeWinnerId");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("to_be_winner_id >=", value, "toBeWinnerId");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdLessThan(Long value) {
            addCriterion("to_be_winner_id <", value, "toBeWinnerId");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdLessThanOrEqualTo(Long value) {
            addCriterion("to_be_winner_id <=", value, "toBeWinnerId");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdIn(List<Long> values) {
            addCriterion("to_be_winner_id in", values, "toBeWinnerId");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdNotIn(List<Long> values) {
            addCriterion("to_be_winner_id not in", values, "toBeWinnerId");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdBetween(Long value1, Long value2) {
            addCriterion("to_be_winner_id between", value1, value2, "toBeWinnerId");
            return (Criteria) this;
        }

        public Criteria andToBeWinnerIdNotBetween(Long value1, Long value2) {
            addCriterion("to_be_winner_id not between", value1, value2, "toBeWinnerId");
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

        public Criteria andInstanceIdIsNull() {
            addCriterion("instance_id is null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIsNotNull() {
            addCriterion("instance_id is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdEqualTo(Long value) {
            addCriterion("instance_id =", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotEqualTo(Long value) {
            addCriterion("instance_id <>", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThan(Long value) {
            addCriterion("instance_id >", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("instance_id >=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThan(Long value) {
            addCriterion("instance_id <", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThanOrEqualTo(Long value) {
            addCriterion("instance_id <=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIn(List<Long> values) {
            addCriterion("instance_id in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotIn(List<Long> values) {
            addCriterion("instance_id not in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdBetween(Long value1, Long value2) {
            addCriterion("instance_id between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotBetween(Long value1, Long value2) {
            addCriterion("instance_id not between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberIsNull() {
            addCriterion("winner_number is null");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberIsNotNull() {
            addCriterion("winner_number is not null");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberEqualTo(Long value) {
            addCriterion("winner_number =", value, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberNotEqualTo(Long value) {
            addCriterion("winner_number <>", value, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberGreaterThan(Long value) {
            addCriterion("winner_number >", value, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("winner_number >=", value, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberLessThan(Long value) {
            addCriterion("winner_number <", value, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberLessThanOrEqualTo(Long value) {
            addCriterion("winner_number <=", value, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberIn(List<Long> values) {
            addCriterion("winner_number in", values, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberNotIn(List<Long> values) {
            addCriterion("winner_number not in", values, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberBetween(Long value1, Long value2) {
            addCriterion("winner_number between", value1, value2, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andWinnerNumberNotBetween(Long value1, Long value2) {
            addCriterion("winner_number not between", value1, value2, "winnerNumber");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdIsNull() {
            addCriterion("prize_rule_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdIsNotNull() {
            addCriterion("prize_rule_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdEqualTo(Long value) {
            addCriterion("prize_rule_detail_id =", value, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdNotEqualTo(Long value) {
            addCriterion("prize_rule_detail_id <>", value, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdGreaterThan(Long value) {
            addCriterion("prize_rule_detail_id >", value, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("prize_rule_detail_id >=", value, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdLessThan(Long value) {
            addCriterion("prize_rule_detail_id <", value, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("prize_rule_detail_id <=", value, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdIn(List<Long> values) {
            addCriterion("prize_rule_detail_id in", values, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdNotIn(List<Long> values) {
            addCriterion("prize_rule_detail_id not in", values, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdBetween(Long value1, Long value2) {
            addCriterion("prize_rule_detail_id between", value1, value2, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andPrizeRuleDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("prize_rule_detail_id not between", value1, value2, "prizeRuleDetailId");
            return (Criteria) this;
        }

        public Criteria andAwardsIsNull() {
            addCriterion("awards is null");
            return (Criteria) this;
        }

        public Criteria andAwardsIsNotNull() {
            addCriterion("awards is not null");
            return (Criteria) this;
        }

        public Criteria andAwardsEqualTo(String value) {
            addCriterion("awards =", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsNotEqualTo(String value) {
            addCriterion("awards <>", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsGreaterThan(String value) {
            addCriterion("awards >", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsGreaterThanOrEqualTo(String value) {
            addCriterion("awards >=", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsLessThan(String value) {
            addCriterion("awards <", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsLessThanOrEqualTo(String value) {
            addCriterion("awards <=", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsLike(String value) {
            addCriterion("awards like", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsNotLike(String value) {
            addCriterion("awards not like", value, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsIn(List<String> values) {
            addCriterion("awards in", values, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsNotIn(List<String> values) {
            addCriterion("awards not in", values, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsBetween(String value1, String value2) {
            addCriterion("awards between", value1, value2, "awards");
            return (Criteria) this;
        }

        public Criteria andAwardsNotBetween(String value1, String value2) {
            addCriterion("awards not between", value1, value2, "awards");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("prize_name like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("prize_name not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNull() {
            addCriterion("prize_type is null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNotNull() {
            addCriterion("prize_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeEqualTo(String value) {
            addCriterion("prize_type =", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotEqualTo(String value) {
            addCriterion("prize_type <>", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThan(String value) {
            addCriterion("prize_type >", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("prize_type >=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThan(String value) {
            addCriterion("prize_type <", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThanOrEqualTo(String value) {
            addCriterion("prize_type <=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLike(String value) {
            addCriterion("prize_type like", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotLike(String value) {
            addCriterion("prize_type not like", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIn(List<String> values) {
            addCriterion("prize_type in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotIn(List<String> values) {
            addCriterion("prize_type not in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeBetween(String value1, String value2) {
            addCriterion("prize_type between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotBetween(String value1, String value2) {
            addCriterion("prize_type not between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIsNull() {
            addCriterion("prize_num is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIsNotNull() {
            addCriterion("prize_num is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNumEqualTo(Long value) {
            addCriterion("prize_num =", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotEqualTo(Long value) {
            addCriterion("prize_num <>", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThan(Long value) {
            addCriterion("prize_num >", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumGreaterThanOrEqualTo(Long value) {
            addCriterion("prize_num >=", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThan(Long value) {
            addCriterion("prize_num <", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumLessThanOrEqualTo(Long value) {
            addCriterion("prize_num <=", value, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumIn(List<Long> values) {
            addCriterion("prize_num in", values, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotIn(List<Long> values) {
            addCriterion("prize_num not in", values, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumBetween(Long value1, Long value2) {
            addCriterion("prize_num between", value1, value2, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeNumNotBetween(Long value1, Long value2) {
            addCriterion("prize_num not between", value1, value2, "prizeNum");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIsNull() {
            addCriterion("prize_amount is null");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIsNotNull() {
            addCriterion("prize_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountEqualTo(Long value) {
            addCriterion("prize_amount =", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotEqualTo(Long value) {
            addCriterion("prize_amount <>", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountGreaterThan(Long value) {
            addCriterion("prize_amount >", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("prize_amount >=", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountLessThan(Long value) {
            addCriterion("prize_amount <", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountLessThanOrEqualTo(Long value) {
            addCriterion("prize_amount <=", value, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountIn(List<Long> values) {
            addCriterion("prize_amount in", values, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotIn(List<Long> values) {
            addCriterion("prize_amount not in", values, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountBetween(Long value1, Long value2) {
            addCriterion("prize_amount between", value1, value2, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeAmountNotBetween(Long value1, Long value2) {
            addCriterion("prize_amount not between", value1, value2, "prizeAmount");
            return (Criteria) this;
        }

        public Criteria andPrizeImageIsNull() {
            addCriterion("prize_image is null");
            return (Criteria) this;
        }

        public Criteria andPrizeImageIsNotNull() {
            addCriterion("prize_image is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeImageEqualTo(String value) {
            addCriterion("prize_image =", value, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageNotEqualTo(String value) {
            addCriterion("prize_image <>", value, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageGreaterThan(String value) {
            addCriterion("prize_image >", value, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageGreaterThanOrEqualTo(String value) {
            addCriterion("prize_image >=", value, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageLessThan(String value) {
            addCriterion("prize_image <", value, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageLessThanOrEqualTo(String value) {
            addCriterion("prize_image <=", value, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageLike(String value) {
            addCriterion("prize_image like", value, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageNotLike(String value) {
            addCriterion("prize_image not like", value, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageIn(List<String> values) {
            addCriterion("prize_image in", values, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageNotIn(List<String> values) {
            addCriterion("prize_image not in", values, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageBetween(String value1, String value2) {
            addCriterion("prize_image between", value1, value2, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andPrizeImageNotBetween(String value1, String value2) {
            addCriterion("prize_image not between", value1, value2, "prizeImage");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andWinnerStatusIsNull() {
            addCriterion("winner_status is null");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusIsNotNull() {
            addCriterion("winner_status is not null");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusEqualTo(String value) {
            addCriterion("winner_status =", value, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusNotEqualTo(String value) {
            addCriterion("winner_status <>", value, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusGreaterThan(String value) {
            addCriterion("winner_status >", value, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("winner_status >=", value, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusLessThan(String value) {
            addCriterion("winner_status <", value, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusLessThanOrEqualTo(String value) {
            addCriterion("winner_status <=", value, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusLike(String value) {
            addCriterion("winner_status like", value, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusNotLike(String value) {
            addCriterion("winner_status not like", value, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusIn(List<String> values) {
            addCriterion("winner_status in", values, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusNotIn(List<String> values) {
            addCriterion("winner_status not in", values, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusBetween(String value1, String value2) {
            addCriterion("winner_status between", value1, value2, "winnerStatus");
            return (Criteria) this;
        }

        public Criteria andWinnerStatusNotBetween(String value1, String value2) {
            addCriterion("winner_status not between", value1, value2, "winnerStatus");
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
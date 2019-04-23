package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiTestingAnswerOneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiTestingAnswerOneExample() {
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

        public Criteria andTestingQuestionIdIsNull() {
            addCriterion("testing_question_id is null");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdIsNotNull() {
            addCriterion("testing_question_id is not null");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdEqualTo(Long value) {
            addCriterion("testing_question_id =", value, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdNotEqualTo(Long value) {
            addCriterion("testing_question_id <>", value, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdGreaterThan(Long value) {
            addCriterion("testing_question_id >", value, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("testing_question_id >=", value, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdLessThan(Long value) {
            addCriterion("testing_question_id <", value, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdLessThanOrEqualTo(Long value) {
            addCriterion("testing_question_id <=", value, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdIn(List<Long> values) {
            addCriterion("testing_question_id in", values, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdNotIn(List<Long> values) {
            addCriterion("testing_question_id not in", values, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdBetween(Long value1, Long value2) {
            addCriterion("testing_question_id between", value1, value2, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andTestingQuestionIdNotBetween(Long value1, Long value2) {
            addCriterion("testing_question_id not between", value1, value2, "testingQuestionId");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneIsNull() {
            addCriterion("answer_text_one is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneIsNotNull() {
            addCriterion("answer_text_one is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneEqualTo(String value) {
            addCriterion("answer_text_one =", value, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneNotEqualTo(String value) {
            addCriterion("answer_text_one <>", value, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneGreaterThan(String value) {
            addCriterion("answer_text_one >", value, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneGreaterThanOrEqualTo(String value) {
            addCriterion("answer_text_one >=", value, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneLessThan(String value) {
            addCriterion("answer_text_one <", value, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneLessThanOrEqualTo(String value) {
            addCriterion("answer_text_one <=", value, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneLike(String value) {
            addCriterion("answer_text_one like", value, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneNotLike(String value) {
            addCriterion("answer_text_one not like", value, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneIn(List<String> values) {
            addCriterion("answer_text_one in", values, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneNotIn(List<String> values) {
            addCriterion("answer_text_one not in", values, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneBetween(String value1, String value2) {
            addCriterion("answer_text_one between", value1, value2, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextOneNotBetween(String value1, String value2) {
            addCriterion("answer_text_one not between", value1, value2, "answerTextOne");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoIsNull() {
            addCriterion("answer_text_two is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoIsNotNull() {
            addCriterion("answer_text_two is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoEqualTo(String value) {
            addCriterion("answer_text_two =", value, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoNotEqualTo(String value) {
            addCriterion("answer_text_two <>", value, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoGreaterThan(String value) {
            addCriterion("answer_text_two >", value, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoGreaterThanOrEqualTo(String value) {
            addCriterion("answer_text_two >=", value, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoLessThan(String value) {
            addCriterion("answer_text_two <", value, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoLessThanOrEqualTo(String value) {
            addCriterion("answer_text_two <=", value, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoLike(String value) {
            addCriterion("answer_text_two like", value, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoNotLike(String value) {
            addCriterion("answer_text_two not like", value, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoIn(List<String> values) {
            addCriterion("answer_text_two in", values, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoNotIn(List<String> values) {
            addCriterion("answer_text_two not in", values, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoBetween(String value1, String value2) {
            addCriterion("answer_text_two between", value1, value2, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextTwoNotBetween(String value1, String value2) {
            addCriterion("answer_text_two not between", value1, value2, "answerTextTwo");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeIsNull() {
            addCriterion("answer_text_three is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeIsNotNull() {
            addCriterion("answer_text_three is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeEqualTo(String value) {
            addCriterion("answer_text_three =", value, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeNotEqualTo(String value) {
            addCriterion("answer_text_three <>", value, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeGreaterThan(String value) {
            addCriterion("answer_text_three >", value, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeGreaterThanOrEqualTo(String value) {
            addCriterion("answer_text_three >=", value, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeLessThan(String value) {
            addCriterion("answer_text_three <", value, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeLessThanOrEqualTo(String value) {
            addCriterion("answer_text_three <=", value, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeLike(String value) {
            addCriterion("answer_text_three like", value, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeNotLike(String value) {
            addCriterion("answer_text_three not like", value, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeIn(List<String> values) {
            addCriterion("answer_text_three in", values, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeNotIn(List<String> values) {
            addCriterion("answer_text_three not in", values, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeBetween(String value1, String value2) {
            addCriterion("answer_text_three between", value1, value2, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextThreeNotBetween(String value1, String value2) {
            addCriterion("answer_text_three not between", value1, value2, "answerTextThree");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourIsNull() {
            addCriterion("answer_text_four is null");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourIsNotNull() {
            addCriterion("answer_text_four is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourEqualTo(String value) {
            addCriterion("answer_text_four =", value, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourNotEqualTo(String value) {
            addCriterion("answer_text_four <>", value, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourGreaterThan(String value) {
            addCriterion("answer_text_four >", value, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourGreaterThanOrEqualTo(String value) {
            addCriterion("answer_text_four >=", value, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourLessThan(String value) {
            addCriterion("answer_text_four <", value, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourLessThanOrEqualTo(String value) {
            addCriterion("answer_text_four <=", value, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourLike(String value) {
            addCriterion("answer_text_four like", value, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourNotLike(String value) {
            addCriterion("answer_text_four not like", value, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourIn(List<String> values) {
            addCriterion("answer_text_four in", values, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourNotIn(List<String> values) {
            addCriterion("answer_text_four not in", values, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourBetween(String value1, String value2) {
            addCriterion("answer_text_four between", value1, value2, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andAnswerTextFourNotBetween(String value1, String value2) {
            addCriterion("answer_text_four not between", value1, value2, "answerTextFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneIsNull() {
            addCriterion("img_url_one is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneIsNotNull() {
            addCriterion("img_url_one is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneEqualTo(String value) {
            addCriterion("img_url_one =", value, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneNotEqualTo(String value) {
            addCriterion("img_url_one <>", value, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneGreaterThan(String value) {
            addCriterion("img_url_one >", value, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneGreaterThanOrEqualTo(String value) {
            addCriterion("img_url_one >=", value, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneLessThan(String value) {
            addCriterion("img_url_one <", value, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneLessThanOrEqualTo(String value) {
            addCriterion("img_url_one <=", value, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneLike(String value) {
            addCriterion("img_url_one like", value, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneNotLike(String value) {
            addCriterion("img_url_one not like", value, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneIn(List<String> values) {
            addCriterion("img_url_one in", values, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneNotIn(List<String> values) {
            addCriterion("img_url_one not in", values, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneBetween(String value1, String value2) {
            addCriterion("img_url_one between", value1, value2, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlOneNotBetween(String value1, String value2) {
            addCriterion("img_url_one not between", value1, value2, "imgUrlOne");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoIsNull() {
            addCriterion("img_url_two is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoIsNotNull() {
            addCriterion("img_url_two is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoEqualTo(String value) {
            addCriterion("img_url_two =", value, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoNotEqualTo(String value) {
            addCriterion("img_url_two <>", value, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoGreaterThan(String value) {
            addCriterion("img_url_two >", value, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoGreaterThanOrEqualTo(String value) {
            addCriterion("img_url_two >=", value, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoLessThan(String value) {
            addCriterion("img_url_two <", value, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoLessThanOrEqualTo(String value) {
            addCriterion("img_url_two <=", value, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoLike(String value) {
            addCriterion("img_url_two like", value, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoNotLike(String value) {
            addCriterion("img_url_two not like", value, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoIn(List<String> values) {
            addCriterion("img_url_two in", values, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoNotIn(List<String> values) {
            addCriterion("img_url_two not in", values, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoBetween(String value1, String value2) {
            addCriterion("img_url_two between", value1, value2, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlTwoNotBetween(String value1, String value2) {
            addCriterion("img_url_two not between", value1, value2, "imgUrlTwo");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeIsNull() {
            addCriterion("img_url_three is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeIsNotNull() {
            addCriterion("img_url_three is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeEqualTo(String value) {
            addCriterion("img_url_three =", value, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeNotEqualTo(String value) {
            addCriterion("img_url_three <>", value, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeGreaterThan(String value) {
            addCriterion("img_url_three >", value, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeGreaterThanOrEqualTo(String value) {
            addCriterion("img_url_three >=", value, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeLessThan(String value) {
            addCriterion("img_url_three <", value, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeLessThanOrEqualTo(String value) {
            addCriterion("img_url_three <=", value, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeLike(String value) {
            addCriterion("img_url_three like", value, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeNotLike(String value) {
            addCriterion("img_url_three not like", value, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeIn(List<String> values) {
            addCriterion("img_url_three in", values, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeNotIn(List<String> values) {
            addCriterion("img_url_three not in", values, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeBetween(String value1, String value2) {
            addCriterion("img_url_three between", value1, value2, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlThreeNotBetween(String value1, String value2) {
            addCriterion("img_url_three not between", value1, value2, "imgUrlThree");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourIsNull() {
            addCriterion("img_url_four is null");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourIsNotNull() {
            addCriterion("img_url_four is not null");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourEqualTo(String value) {
            addCriterion("img_url_four =", value, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourNotEqualTo(String value) {
            addCriterion("img_url_four <>", value, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourGreaterThan(String value) {
            addCriterion("img_url_four >", value, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourGreaterThanOrEqualTo(String value) {
            addCriterion("img_url_four >=", value, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourLessThan(String value) {
            addCriterion("img_url_four <", value, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourLessThanOrEqualTo(String value) {
            addCriterion("img_url_four <=", value, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourLike(String value) {
            addCriterion("img_url_four like", value, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourNotLike(String value) {
            addCriterion("img_url_four not like", value, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourIn(List<String> values) {
            addCriterion("img_url_four in", values, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourNotIn(List<String> values) {
            addCriterion("img_url_four not in", values, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourBetween(String value1, String value2) {
            addCriterion("img_url_four between", value1, value2, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andImgUrlFourNotBetween(String value1, String value2) {
            addCriterion("img_url_four not between", value1, value2, "imgUrlFour");
            return (Criteria) this;
        }

        public Criteria andVoiceOneIsNull() {
            addCriterion("voice_one is null");
            return (Criteria) this;
        }

        public Criteria andVoiceOneIsNotNull() {
            addCriterion("voice_one is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceOneEqualTo(String value) {
            addCriterion("voice_one =", value, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneNotEqualTo(String value) {
            addCriterion("voice_one <>", value, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneGreaterThan(String value) {
            addCriterion("voice_one >", value, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneGreaterThanOrEqualTo(String value) {
            addCriterion("voice_one >=", value, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneLessThan(String value) {
            addCriterion("voice_one <", value, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneLessThanOrEqualTo(String value) {
            addCriterion("voice_one <=", value, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneLike(String value) {
            addCriterion("voice_one like", value, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneNotLike(String value) {
            addCriterion("voice_one not like", value, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneIn(List<String> values) {
            addCriterion("voice_one in", values, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneNotIn(List<String> values) {
            addCriterion("voice_one not in", values, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneBetween(String value1, String value2) {
            addCriterion("voice_one between", value1, value2, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceOneNotBetween(String value1, String value2) {
            addCriterion("voice_one not between", value1, value2, "voiceOne");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoIsNull() {
            addCriterion("voice_two is null");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoIsNotNull() {
            addCriterion("voice_two is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoEqualTo(String value) {
            addCriterion("voice_two =", value, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoNotEqualTo(String value) {
            addCriterion("voice_two <>", value, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoGreaterThan(String value) {
            addCriterion("voice_two >", value, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoGreaterThanOrEqualTo(String value) {
            addCriterion("voice_two >=", value, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoLessThan(String value) {
            addCriterion("voice_two <", value, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoLessThanOrEqualTo(String value) {
            addCriterion("voice_two <=", value, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoLike(String value) {
            addCriterion("voice_two like", value, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoNotLike(String value) {
            addCriterion("voice_two not like", value, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoIn(List<String> values) {
            addCriterion("voice_two in", values, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoNotIn(List<String> values) {
            addCriterion("voice_two not in", values, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoBetween(String value1, String value2) {
            addCriterion("voice_two between", value1, value2, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceTwoNotBetween(String value1, String value2) {
            addCriterion("voice_two not between", value1, value2, "voiceTwo");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeIsNull() {
            addCriterion("voice_three is null");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeIsNotNull() {
            addCriterion("voice_three is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeEqualTo(String value) {
            addCriterion("voice_three =", value, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeNotEqualTo(String value) {
            addCriterion("voice_three <>", value, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeGreaterThan(String value) {
            addCriterion("voice_three >", value, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeGreaterThanOrEqualTo(String value) {
            addCriterion("voice_three >=", value, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeLessThan(String value) {
            addCriterion("voice_three <", value, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeLessThanOrEqualTo(String value) {
            addCriterion("voice_three <=", value, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeLike(String value) {
            addCriterion("voice_three like", value, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeNotLike(String value) {
            addCriterion("voice_three not like", value, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeIn(List<String> values) {
            addCriterion("voice_three in", values, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeNotIn(List<String> values) {
            addCriterion("voice_three not in", values, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeBetween(String value1, String value2) {
            addCriterion("voice_three between", value1, value2, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceThreeNotBetween(String value1, String value2) {
            addCriterion("voice_three not between", value1, value2, "voiceThree");
            return (Criteria) this;
        }

        public Criteria andVoiceFourIsNull() {
            addCriterion("voice_four is null");
            return (Criteria) this;
        }

        public Criteria andVoiceFourIsNotNull() {
            addCriterion("voice_four is not null");
            return (Criteria) this;
        }

        public Criteria andVoiceFourEqualTo(String value) {
            addCriterion("voice_four =", value, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourNotEqualTo(String value) {
            addCriterion("voice_four <>", value, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourGreaterThan(String value) {
            addCriterion("voice_four >", value, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourGreaterThanOrEqualTo(String value) {
            addCriterion("voice_four >=", value, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourLessThan(String value) {
            addCriterion("voice_four <", value, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourLessThanOrEqualTo(String value) {
            addCriterion("voice_four <=", value, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourLike(String value) {
            addCriterion("voice_four like", value, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourNotLike(String value) {
            addCriterion("voice_four not like", value, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourIn(List<String> values) {
            addCriterion("voice_four in", values, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourNotIn(List<String> values) {
            addCriterion("voice_four not in", values, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourBetween(String value1, String value2) {
            addCriterion("voice_four between", value1, value2, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andVoiceFourNotBetween(String value1, String value2) {
            addCriterion("voice_four not between", value1, value2, "voiceFour");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerIsNull() {
            addCriterion("is_correct_answer is null");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerIsNotNull() {
            addCriterion("is_correct_answer is not null");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerEqualTo(String value) {
            addCriterion("is_correct_answer =", value, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerNotEqualTo(String value) {
            addCriterion("is_correct_answer <>", value, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerGreaterThan(String value) {
            addCriterion("is_correct_answer >", value, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerGreaterThanOrEqualTo(String value) {
            addCriterion("is_correct_answer >=", value, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerLessThan(String value) {
            addCriterion("is_correct_answer <", value, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerLessThanOrEqualTo(String value) {
            addCriterion("is_correct_answer <=", value, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerLike(String value) {
            addCriterion("is_correct_answer like", value, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerNotLike(String value) {
            addCriterion("is_correct_answer not like", value, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerIn(List<String> values) {
            addCriterion("is_correct_answer in", values, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerNotIn(List<String> values) {
            addCriterion("is_correct_answer not in", values, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerBetween(String value1, String value2) {
            addCriterion("is_correct_answer between", value1, value2, "isCorrectAnswer");
            return (Criteria) this;
        }

        public Criteria andIsCorrectAnswerNotBetween(String value1, String value2) {
            addCriterion("is_correct_answer not between", value1, value2, "isCorrectAnswer");
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
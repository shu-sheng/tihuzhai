package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HiUserRecordingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HiUserRecordingExample() {
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

        public Criteria andRecordingTypeIsNull() {
            addCriterion("recording_type is null");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeIsNotNull() {
            addCriterion("recording_type is not null");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeEqualTo(String value) {
            addCriterion("recording_type =", value, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeNotEqualTo(String value) {
            addCriterion("recording_type <>", value, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeGreaterThan(String value) {
            addCriterion("recording_type >", value, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("recording_type >=", value, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeLessThan(String value) {
            addCriterion("recording_type <", value, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeLessThanOrEqualTo(String value) {
            addCriterion("recording_type <=", value, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeLike(String value) {
            addCriterion("recording_type like", value, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeNotLike(String value) {
            addCriterion("recording_type not like", value, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeIn(List<String> values) {
            addCriterion("recording_type in", values, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeNotIn(List<String> values) {
            addCriterion("recording_type not in", values, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeBetween(String value1, String value2) {
            addCriterion("recording_type between", value1, value2, "recordingType");
            return (Criteria) this;
        }

        public Criteria andRecordingTypeNotBetween(String value1, String value2) {
            addCriterion("recording_type not between", value1, value2, "recordingType");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Long value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Long value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Long value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Long value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Long value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Long> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Long> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Long value1, Long value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Long value1, Long value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdIsNull() {
            addCriterion("dialogue_id is null");
            return (Criteria) this;
        }

        public Criteria andDialogueIdIsNotNull() {
            addCriterion("dialogue_id is not null");
            return (Criteria) this;
        }

        public Criteria andDialogueIdEqualTo(Long value) {
            addCriterion("dialogue_id =", value, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdNotEqualTo(Long value) {
            addCriterion("dialogue_id <>", value, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdGreaterThan(Long value) {
            addCriterion("dialogue_id >", value, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dialogue_id >=", value, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdLessThan(Long value) {
            addCriterion("dialogue_id <", value, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdLessThanOrEqualTo(Long value) {
            addCriterion("dialogue_id <=", value, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdIn(List<Long> values) {
            addCriterion("dialogue_id in", values, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdNotIn(List<Long> values) {
            addCriterion("dialogue_id not in", values, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdBetween(Long value1, Long value2) {
            addCriterion("dialogue_id between", value1, value2, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andDialogueIdNotBetween(Long value1, Long value2) {
            addCriterion("dialogue_id not between", value1, value2, "dialogueId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdIsNull() {
            addCriterion("sentence_id is null");
            return (Criteria) this;
        }

        public Criteria andSentenceIdIsNotNull() {
            addCriterion("sentence_id is not null");
            return (Criteria) this;
        }

        public Criteria andSentenceIdEqualTo(Long value) {
            addCriterion("sentence_id =", value, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdNotEqualTo(Long value) {
            addCriterion("sentence_id <>", value, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdGreaterThan(Long value) {
            addCriterion("sentence_id >", value, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sentence_id >=", value, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdLessThan(Long value) {
            addCriterion("sentence_id <", value, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdLessThanOrEqualTo(Long value) {
            addCriterion("sentence_id <=", value, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdIn(List<Long> values) {
            addCriterion("sentence_id in", values, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdNotIn(List<Long> values) {
            addCriterion("sentence_id not in", values, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdBetween(Long value1, Long value2) {
            addCriterion("sentence_id between", value1, value2, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andSentenceIdNotBetween(Long value1, Long value2) {
            addCriterion("sentence_id not between", value1, value2, "sentenceId");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlIsNull() {
            addCriterion("my_recording_url is null");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlIsNotNull() {
            addCriterion("my_recording_url is not null");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlEqualTo(String value) {
            addCriterion("my_recording_url =", value, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlNotEqualTo(String value) {
            addCriterion("my_recording_url <>", value, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlGreaterThan(String value) {
            addCriterion("my_recording_url >", value, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlGreaterThanOrEqualTo(String value) {
            addCriterion("my_recording_url >=", value, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlLessThan(String value) {
            addCriterion("my_recording_url <", value, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlLessThanOrEqualTo(String value) {
            addCriterion("my_recording_url <=", value, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlLike(String value) {
            addCriterion("my_recording_url like", value, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlNotLike(String value) {
            addCriterion("my_recording_url not like", value, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlIn(List<String> values) {
            addCriterion("my_recording_url in", values, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlNotIn(List<String> values) {
            addCriterion("my_recording_url not in", values, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlBetween(String value1, String value2) {
            addCriterion("my_recording_url between", value1, value2, "myRecordingUrl");
            return (Criteria) this;
        }

        public Criteria andMyRecordingUrlNotBetween(String value1, String value2) {
            addCriterion("my_recording_url not between", value1, value2, "myRecordingUrl");
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
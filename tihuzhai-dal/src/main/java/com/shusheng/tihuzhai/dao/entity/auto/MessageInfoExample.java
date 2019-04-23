package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageInfoExample() {
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

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(Long value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(Long value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(Long value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(Long value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(Long value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(Long value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<Long> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<Long> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(Long value1, Long value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(Long value1, Long value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNull() {
            addCriterion("message_title is null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIsNotNull() {
            addCriterion("message_title is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTitleEqualTo(String value) {
            addCriterion("message_title =", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotEqualTo(String value) {
            addCriterion("message_title <>", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThan(String value) {
            addCriterion("message_title >", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleGreaterThanOrEqualTo(String value) {
            addCriterion("message_title >=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThan(String value) {
            addCriterion("message_title <", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLessThanOrEqualTo(String value) {
            addCriterion("message_title <=", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleLike(String value) {
            addCriterion("message_title like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotLike(String value) {
            addCriterion("message_title not like", value, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleIn(List<String> values) {
            addCriterion("message_title in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotIn(List<String> values) {
            addCriterion("message_title not in", values, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleBetween(String value1, String value2) {
            addCriterion("message_title between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTitleNotBetween(String value1, String value2) {
            addCriterion("message_title not between", value1, value2, "messageTitle");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(String value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(String value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(String value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(String value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(String value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLike(String value) {
            addCriterion("message_type like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotLike(String value) {
            addCriterion("message_type not like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<String> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<String> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(String value1, String value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(String value1, String value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIsNull() {
            addCriterion("message_status is null");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIsNotNull() {
            addCriterion("message_status is not null");
            return (Criteria) this;
        }

        public Criteria andMessageStatusEqualTo(String value) {
            addCriterion("message_status =", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotEqualTo(String value) {
            addCriterion("message_status <>", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusGreaterThan(String value) {
            addCriterion("message_status >", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusGreaterThanOrEqualTo(String value) {
            addCriterion("message_status >=", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLessThan(String value) {
            addCriterion("message_status <", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLessThanOrEqualTo(String value) {
            addCriterion("message_status <=", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusLike(String value) {
            addCriterion("message_status like", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotLike(String value) {
            addCriterion("message_status not like", value, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusIn(List<String> values) {
            addCriterion("message_status in", values, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotIn(List<String> values) {
            addCriterion("message_status not in", values, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusBetween(String value1, String value2) {
            addCriterion("message_status between", value1, value2, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageStatusNotBetween(String value1, String value2) {
            addCriterion("message_status not between", value1, value2, "messageStatus");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectIsNull() {
            addCriterion("message_subject is null");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectIsNotNull() {
            addCriterion("message_subject is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectEqualTo(String value) {
            addCriterion("message_subject =", value, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectNotEqualTo(String value) {
            addCriterion("message_subject <>", value, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectGreaterThan(String value) {
            addCriterion("message_subject >", value, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectGreaterThanOrEqualTo(String value) {
            addCriterion("message_subject >=", value, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectLessThan(String value) {
            addCriterion("message_subject <", value, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectLessThanOrEqualTo(String value) {
            addCriterion("message_subject <=", value, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectLike(String value) {
            addCriterion("message_subject like", value, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectNotLike(String value) {
            addCriterion("message_subject not like", value, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectIn(List<String> values) {
            addCriterion("message_subject in", values, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectNotIn(List<String> values) {
            addCriterion("message_subject not in", values, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectBetween(String value1, String value2) {
            addCriterion("message_subject between", value1, value2, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andMessageSubjectNotBetween(String value1, String value2) {
            addCriterion("message_subject not between", value1, value2, "messageSubject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectIsNull() {
            addCriterion("notification_object is null");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectIsNotNull() {
            addCriterion("notification_object is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectEqualTo(String value) {
            addCriterion("notification_object =", value, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectNotEqualTo(String value) {
            addCriterion("notification_object <>", value, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectGreaterThan(String value) {
            addCriterion("notification_object >", value, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectGreaterThanOrEqualTo(String value) {
            addCriterion("notification_object >=", value, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectLessThan(String value) {
            addCriterion("notification_object <", value, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectLessThanOrEqualTo(String value) {
            addCriterion("notification_object <=", value, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectLike(String value) {
            addCriterion("notification_object like", value, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectNotLike(String value) {
            addCriterion("notification_object not like", value, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectIn(List<String> values) {
            addCriterion("notification_object in", values, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectNotIn(List<String> values) {
            addCriterion("notification_object not in", values, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectBetween(String value1, String value2) {
            addCriterion("notification_object between", value1, value2, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andNotificationObjectNotBetween(String value1, String value2) {
            addCriterion("notification_object not between", value1, value2, "notificationObject");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNull() {
            addCriterion("link_url is null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIsNotNull() {
            addCriterion("link_url is not null");
            return (Criteria) this;
        }

        public Criteria andLinkUrlEqualTo(String value) {
            addCriterion("link_url =", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotEqualTo(String value) {
            addCriterion("link_url <>", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThan(String value) {
            addCriterion("link_url >", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("link_url >=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThan(String value) {
            addCriterion("link_url <", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("link_url <=", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlLike(String value) {
            addCriterion("link_url like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotLike(String value) {
            addCriterion("link_url not like", value, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlIn(List<String> values) {
            addCriterion("link_url in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotIn(List<String> values) {
            addCriterion("link_url not in", values, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlBetween(String value1, String value2) {
            addCriterion("link_url between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andLinkUrlNotBetween(String value1, String value2) {
            addCriterion("link_url not between", value1, value2, "linkUrl");
            return (Criteria) this;
        }

        public Criteria andViewTypeIsNull() {
            addCriterion("view_type is null");
            return (Criteria) this;
        }

        public Criteria andViewTypeIsNotNull() {
            addCriterion("view_type is not null");
            return (Criteria) this;
        }

        public Criteria andViewTypeEqualTo(String value) {
            addCriterion("view_type =", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotEqualTo(String value) {
            addCriterion("view_type <>", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThan(String value) {
            addCriterion("view_type >", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeGreaterThanOrEqualTo(String value) {
            addCriterion("view_type >=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThan(String value) {
            addCriterion("view_type <", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLessThanOrEqualTo(String value) {
            addCriterion("view_type <=", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeLike(String value) {
            addCriterion("view_type like", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotLike(String value) {
            addCriterion("view_type not like", value, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeIn(List<String> values) {
            addCriterion("view_type in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotIn(List<String> values) {
            addCriterion("view_type not in", values, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeBetween(String value1, String value2) {
            addCriterion("view_type between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andViewTypeNotBetween(String value1, String value2) {
            addCriterion("view_type not between", value1, value2, "viewType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeIsNull() {
            addCriterion("notification_type is null");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeIsNotNull() {
            addCriterion("notification_type is not null");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeEqualTo(String value) {
            addCriterion("notification_type =", value, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeNotEqualTo(String value) {
            addCriterion("notification_type <>", value, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeGreaterThan(String value) {
            addCriterion("notification_type >", value, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("notification_type >=", value, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeLessThan(String value) {
            addCriterion("notification_type <", value, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeLessThanOrEqualTo(String value) {
            addCriterion("notification_type <=", value, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeLike(String value) {
            addCriterion("notification_type like", value, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeNotLike(String value) {
            addCriterion("notification_type not like", value, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeIn(List<String> values) {
            addCriterion("notification_type in", values, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeNotIn(List<String> values) {
            addCriterion("notification_type not in", values, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeBetween(String value1, String value2) {
            addCriterion("notification_type between", value1, value2, "notificationType");
            return (Criteria) this;
        }

        public Criteria andNotificationTypeNotBetween(String value1, String value2) {
            addCriterion("notification_type not between", value1, value2, "notificationType");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateIsNull() {
            addCriterion("message_send_date is null");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateIsNotNull() {
            addCriterion("message_send_date is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateEqualTo(Date value) {
            addCriterion("message_send_date =", value, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateNotEqualTo(Date value) {
            addCriterion("message_send_date <>", value, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateGreaterThan(Date value) {
            addCriterion("message_send_date >", value, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateGreaterThanOrEqualTo(Date value) {
            addCriterion("message_send_date >=", value, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateLessThan(Date value) {
            addCriterion("message_send_date <", value, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateLessThanOrEqualTo(Date value) {
            addCriterion("message_send_date <=", value, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateIn(List<Date> values) {
            addCriterion("message_send_date in", values, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateNotIn(List<Date> values) {
            addCriterion("message_send_date not in", values, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateBetween(Date value1, Date value2) {
            addCriterion("message_send_date between", value1, value2, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSendDateNotBetween(Date value1, Date value2) {
            addCriterion("message_send_date not between", value1, value2, "messageSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateIsNull() {
            addCriterion("message_plan_send_date is null");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateIsNotNull() {
            addCriterion("message_plan_send_date is not null");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateEqualTo(Date value) {
            addCriterion("message_plan_send_date =", value, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateNotEqualTo(Date value) {
            addCriterion("message_plan_send_date <>", value, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateGreaterThan(Date value) {
            addCriterion("message_plan_send_date >", value, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateGreaterThanOrEqualTo(Date value) {
            addCriterion("message_plan_send_date >=", value, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateLessThan(Date value) {
            addCriterion("message_plan_send_date <", value, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateLessThanOrEqualTo(Date value) {
            addCriterion("message_plan_send_date <=", value, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateIn(List<Date> values) {
            addCriterion("message_plan_send_date in", values, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateNotIn(List<Date> values) {
            addCriterion("message_plan_send_date not in", values, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateBetween(Date value1, Date value2) {
            addCriterion("message_plan_send_date between", value1, value2, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessagePlanSendDateNotBetween(Date value1, Date value2) {
            addCriterion("message_plan_send_date not between", value1, value2, "messagePlanSendDate");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdIsNull() {
            addCriterion("message_sender_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdIsNotNull() {
            addCriterion("message_sender_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdEqualTo(Long value) {
            addCriterion("message_sender_id =", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdNotEqualTo(Long value) {
            addCriterion("message_sender_id <>", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdGreaterThan(Long value) {
            addCriterion("message_sender_id >", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("message_sender_id >=", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdLessThan(Long value) {
            addCriterion("message_sender_id <", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdLessThanOrEqualTo(Long value) {
            addCriterion("message_sender_id <=", value, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdIn(List<Long> values) {
            addCriterion("message_sender_id in", values, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdNotIn(List<Long> values) {
            addCriterion("message_sender_id not in", values, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdBetween(Long value1, Long value2) {
            addCriterion("message_sender_id between", value1, value2, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderIdNotBetween(Long value1, Long value2) {
            addCriterion("message_sender_id not between", value1, value2, "messageSenderId");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameIsNull() {
            addCriterion("message_sender_name is null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameIsNotNull() {
            addCriterion("message_sender_name is not null");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameEqualTo(String value) {
            addCriterion("message_sender_name =", value, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameNotEqualTo(String value) {
            addCriterion("message_sender_name <>", value, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameGreaterThan(String value) {
            addCriterion("message_sender_name >", value, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameGreaterThanOrEqualTo(String value) {
            addCriterion("message_sender_name >=", value, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameLessThan(String value) {
            addCriterion("message_sender_name <", value, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameLessThanOrEqualTo(String value) {
            addCriterion("message_sender_name <=", value, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameLike(String value) {
            addCriterion("message_sender_name like", value, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameNotLike(String value) {
            addCriterion("message_sender_name not like", value, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameIn(List<String> values) {
            addCriterion("message_sender_name in", values, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameNotIn(List<String> values) {
            addCriterion("message_sender_name not in", values, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameBetween(String value1, String value2) {
            addCriterion("message_sender_name between", value1, value2, "messageSenderName");
            return (Criteria) this;
        }

        public Criteria andMessageSenderNameNotBetween(String value1, String value2) {
            addCriterion("message_sender_name not between", value1, value2, "messageSenderName");
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
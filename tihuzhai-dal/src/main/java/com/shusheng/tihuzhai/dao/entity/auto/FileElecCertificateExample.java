package com.shusheng.tihuzhai.dao.entity.auto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FileElecCertificateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FileElecCertificateExample() {
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

        public Criteria andFileKeyIsNull() {
            addCriterion("file_key is null");
            return (Criteria) this;
        }

        public Criteria andFileKeyIsNotNull() {
            addCriterion("file_key is not null");
            return (Criteria) this;
        }

        public Criteria andFileKeyEqualTo(String value) {
            addCriterion("file_key =", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyNotEqualTo(String value) {
            addCriterion("file_key <>", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyGreaterThan(String value) {
            addCriterion("file_key >", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyGreaterThanOrEqualTo(String value) {
            addCriterion("file_key >=", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyLessThan(String value) {
            addCriterion("file_key <", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyLessThanOrEqualTo(String value) {
            addCriterion("file_key <=", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyLike(String value) {
            addCriterion("file_key like", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyNotLike(String value) {
            addCriterion("file_key not like", value, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyIn(List<String> values) {
            addCriterion("file_key in", values, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyNotIn(List<String> values) {
            addCriterion("file_key not in", values, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyBetween(String value1, String value2) {
            addCriterion("file_key between", value1, value2, "fileKey");
            return (Criteria) this;
        }

        public Criteria andFileKeyNotBetween(String value1, String value2) {
            addCriterion("file_key not between", value1, value2, "fileKey");
            return (Criteria) this;
        }

        public Criteria andPreservationIdIsNull() {
            addCriterion("preservation_id is null");
            return (Criteria) this;
        }

        public Criteria andPreservationIdIsNotNull() {
            addCriterion("preservation_id is not null");
            return (Criteria) this;
        }

        public Criteria andPreservationIdEqualTo(String value) {
            addCriterion("preservation_id =", value, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdNotEqualTo(String value) {
            addCriterion("preservation_id <>", value, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdGreaterThan(String value) {
            addCriterion("preservation_id >", value, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdGreaterThanOrEqualTo(String value) {
            addCriterion("preservation_id >=", value, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdLessThan(String value) {
            addCriterion("preservation_id <", value, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdLessThanOrEqualTo(String value) {
            addCriterion("preservation_id <=", value, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdLike(String value) {
            addCriterion("preservation_id like", value, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdNotLike(String value) {
            addCriterion("preservation_id not like", value, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdIn(List<String> values) {
            addCriterion("preservation_id in", values, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdNotIn(List<String> values) {
            addCriterion("preservation_id not in", values, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdBetween(String value1, String value2) {
            addCriterion("preservation_id between", value1, value2, "preservationId");
            return (Criteria) this;
        }

        public Criteria andPreservationIdNotBetween(String value1, String value2) {
            addCriterion("preservation_id not between", value1, value2, "preservationId");
            return (Criteria) this;
        }

        public Criteria andDochashIsNull() {
            addCriterion("docHash is null");
            return (Criteria) this;
        }

        public Criteria andDochashIsNotNull() {
            addCriterion("docHash is not null");
            return (Criteria) this;
        }

        public Criteria andDochashEqualTo(String value) {
            addCriterion("docHash =", value, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashNotEqualTo(String value) {
            addCriterion("docHash <>", value, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashGreaterThan(String value) {
            addCriterion("docHash >", value, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashGreaterThanOrEqualTo(String value) {
            addCriterion("docHash >=", value, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashLessThan(String value) {
            addCriterion("docHash <", value, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashLessThanOrEqualTo(String value) {
            addCriterion("docHash <=", value, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashLike(String value) {
            addCriterion("docHash like", value, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashNotLike(String value) {
            addCriterion("docHash not like", value, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashIn(List<String> values) {
            addCriterion("docHash in", values, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashNotIn(List<String> values) {
            addCriterion("docHash not in", values, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashBetween(String value1, String value2) {
            addCriterion("docHash between", value1, value2, "dochash");
            return (Criteria) this;
        }

        public Criteria andDochashNotBetween(String value1, String value2) {
            addCriterion("docHash not between", value1, value2, "dochash");
            return (Criteria) this;
        }

        public Criteria andLinkIsNull() {
            addCriterion("link is null");
            return (Criteria) this;
        }

        public Criteria andLinkIsNotNull() {
            addCriterion("link is not null");
            return (Criteria) this;
        }

        public Criteria andLinkEqualTo(String value) {
            addCriterion("link =", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotEqualTo(String value) {
            addCriterion("link <>", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThan(String value) {
            addCriterion("link >", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkGreaterThanOrEqualTo(String value) {
            addCriterion("link >=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThan(String value) {
            addCriterion("link <", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLessThanOrEqualTo(String value) {
            addCriterion("link <=", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkLike(String value) {
            addCriterion("link like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotLike(String value) {
            addCriterion("link not like", value, "link");
            return (Criteria) this;
        }

        public Criteria andLinkIn(List<String> values) {
            addCriterion("link in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotIn(List<String> values) {
            addCriterion("link not in", values, "link");
            return (Criteria) this;
        }

        public Criteria andLinkBetween(String value1, String value2) {
            addCriterion("link between", value1, value2, "link");
            return (Criteria) this;
        }

        public Criteria andLinkNotBetween(String value1, String value2) {
            addCriterion("link not between", value1, value2, "link");
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

        public Criteria andPreservationTimeIsNull() {
            addCriterion("preservation_time is null");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeIsNotNull() {
            addCriterion("preservation_time is not null");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeEqualTo(Date value) {
            addCriterion("preservation_time =", value, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeNotEqualTo(Date value) {
            addCriterion("preservation_time <>", value, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeGreaterThan(Date value) {
            addCriterion("preservation_time >", value, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("preservation_time >=", value, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeLessThan(Date value) {
            addCriterion("preservation_time <", value, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeLessThanOrEqualTo(Date value) {
            addCriterion("preservation_time <=", value, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeIn(List<Date> values) {
            addCriterion("preservation_time in", values, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeNotIn(List<Date> values) {
            addCriterion("preservation_time not in", values, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeBetween(Date value1, Date value2) {
            addCriterion("preservation_time between", value1, value2, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andPreservationTimeNotBetween(Date value1, Date value2) {
            addCriterion("preservation_time not between", value1, value2, "preservationTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeIsNull() {
            addCriterion("link_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeIsNotNull() {
            addCriterion("link_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeEqualTo(Date value) {
            addCriterion("link_expire_time =", value, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeNotEqualTo(Date value) {
            addCriterion("link_expire_time <>", value, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeGreaterThan(Date value) {
            addCriterion("link_expire_time >", value, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("link_expire_time >=", value, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeLessThan(Date value) {
            addCriterion("link_expire_time <", value, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeLessThanOrEqualTo(Date value) {
            addCriterion("link_expire_time <=", value, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeIn(List<Date> values) {
            addCriterion("link_expire_time in", values, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeNotIn(List<Date> values) {
            addCriterion("link_expire_time not in", values, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeBetween(Date value1, Date value2) {
            addCriterion("link_expire_time between", value1, value2, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLinkExpireTimeNotBetween(Date value1, Date value2) {
            addCriterion("link_expire_time not between", value1, value2, "linkExpireTime");
            return (Criteria) this;
        }

        public Criteria andLocalLinkIsNull() {
            addCriterion("local_link is null");
            return (Criteria) this;
        }

        public Criteria andLocalLinkIsNotNull() {
            addCriterion("local_link is not null");
            return (Criteria) this;
        }

        public Criteria andLocalLinkEqualTo(String value) {
            addCriterion("local_link =", value, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkNotEqualTo(String value) {
            addCriterion("local_link <>", value, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkGreaterThan(String value) {
            addCriterion("local_link >", value, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkGreaterThanOrEqualTo(String value) {
            addCriterion("local_link >=", value, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkLessThan(String value) {
            addCriterion("local_link <", value, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkLessThanOrEqualTo(String value) {
            addCriterion("local_link <=", value, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkLike(String value) {
            addCriterion("local_link like", value, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkNotLike(String value) {
            addCriterion("local_link not like", value, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkIn(List<String> values) {
            addCriterion("local_link in", values, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkNotIn(List<String> values) {
            addCriterion("local_link not in", values, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkBetween(String value1, String value2) {
            addCriterion("local_link between", value1, value2, "localLink");
            return (Criteria) this;
        }

        public Criteria andLocalLinkNotBetween(String value1, String value2) {
            addCriterion("local_link not between", value1, value2, "localLink");
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
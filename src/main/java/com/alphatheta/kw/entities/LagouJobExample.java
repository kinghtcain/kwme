package com.alphatheta.kw.entities;

import java.util.ArrayList;
import java.util.List;

public class LagouJobExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LagouJobExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNull() {
            addCriterion("job_id is null");
            return (Criteria) this;
        }

        public Criteria andJobIdIsNotNull() {
            addCriterion("job_id is not null");
            return (Criteria) this;
        }

        public Criteria andJobIdEqualTo(Integer value) {
            addCriterion("job_id =", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotEqualTo(Integer value) {
            addCriterion("job_id <>", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThan(Integer value) {
            addCriterion("job_id >", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("job_id >=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThan(Integer value) {
            addCriterion("job_id <", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdLessThanOrEqualTo(Integer value) {
            addCriterion("job_id <=", value, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdIn(List<Integer> values) {
            addCriterion("job_id in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotIn(List<Integer> values) {
            addCriterion("job_id not in", values, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdBetween(Integer value1, Integer value2) {
            addCriterion("job_id between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobIdNotBetween(Integer value1, Integer value2) {
            addCriterion("job_id not between", value1, value2, "jobId");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameIsNull() {
            addCriterion("job_offer_name is null");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameIsNotNull() {
            addCriterion("job_offer_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameEqualTo(String value) {
            addCriterion("job_offer_name =", value, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameNotEqualTo(String value) {
            addCriterion("job_offer_name <>", value, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameGreaterThan(String value) {
            addCriterion("job_offer_name >", value, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_offer_name >=", value, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameLessThan(String value) {
            addCriterion("job_offer_name <", value, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameLessThanOrEqualTo(String value) {
            addCriterion("job_offer_name <=", value, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameLike(String value) {
            addCriterion("job_offer_name like", value, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameNotLike(String value) {
            addCriterion("job_offer_name not like", value, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameIn(List<String> values) {
            addCriterion("job_offer_name in", values, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameNotIn(List<String> values) {
            addCriterion("job_offer_name not in", values, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameBetween(String value1, String value2) {
            addCriterion("job_offer_name between", value1, value2, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobOfferNameNotBetween(String value1, String value2) {
            addCriterion("job_offer_name not between", value1, value2, "jobOfferName");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNull() {
            addCriterion("job_name is null");
            return (Criteria) this;
        }

        public Criteria andJobNameIsNotNull() {
            addCriterion("job_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobNameEqualTo(String value) {
            addCriterion("job_name =", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotEqualTo(String value) {
            addCriterion("job_name <>", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThan(String value) {
            addCriterion("job_name >", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_name >=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThan(String value) {
            addCriterion("job_name <", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLessThanOrEqualTo(String value) {
            addCriterion("job_name <=", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameLike(String value) {
            addCriterion("job_name like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotLike(String value) {
            addCriterion("job_name not like", value, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameIn(List<String> values) {
            addCriterion("job_name in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotIn(List<String> values) {
            addCriterion("job_name not in", values, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameBetween(String value1, String value2) {
            addCriterion("job_name between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobNameNotBetween(String value1, String value2) {
            addCriterion("job_name not between", value1, value2, "jobName");
            return (Criteria) this;
        }

        public Criteria andJobRequestIsNull() {
            addCriterion("job_request is null");
            return (Criteria) this;
        }

        public Criteria andJobRequestIsNotNull() {
            addCriterion("job_request is not null");
            return (Criteria) this;
        }

        public Criteria andJobRequestEqualTo(String value) {
            addCriterion("job_request =", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestNotEqualTo(String value) {
            addCriterion("job_request <>", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestGreaterThan(String value) {
            addCriterion("job_request >", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestGreaterThanOrEqualTo(String value) {
            addCriterion("job_request >=", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestLessThan(String value) {
            addCriterion("job_request <", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestLessThanOrEqualTo(String value) {
            addCriterion("job_request <=", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestLike(String value) {
            addCriterion("job_request like", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestNotLike(String value) {
            addCriterion("job_request not like", value, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestIn(List<String> values) {
            addCriterion("job_request in", values, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestNotIn(List<String> values) {
            addCriterion("job_request not in", values, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestBetween(String value1, String value2) {
            addCriterion("job_request between", value1, value2, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobRequestNotBetween(String value1, String value2) {
            addCriterion("job_request not between", value1, value2, "jobRequest");
            return (Criteria) this;
        }

        public Criteria andJobPaymentIsNull() {
            addCriterion("job_payment is null");
            return (Criteria) this;
        }

        public Criteria andJobPaymentIsNotNull() {
            addCriterion("job_payment is not null");
            return (Criteria) this;
        }

        public Criteria andJobPaymentEqualTo(String value) {
            addCriterion("job_payment =", value, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentNotEqualTo(String value) {
            addCriterion("job_payment <>", value, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentGreaterThan(String value) {
            addCriterion("job_payment >", value, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("job_payment >=", value, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentLessThan(String value) {
            addCriterion("job_payment <", value, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentLessThanOrEqualTo(String value) {
            addCriterion("job_payment <=", value, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentLike(String value) {
            addCriterion("job_payment like", value, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentNotLike(String value) {
            addCriterion("job_payment not like", value, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentIn(List<String> values) {
            addCriterion("job_payment in", values, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentNotIn(List<String> values) {
            addCriterion("job_payment not in", values, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentBetween(String value1, String value2) {
            addCriterion("job_payment between", value1, value2, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPaymentNotBetween(String value1, String value2) {
            addCriterion("job_payment not between", value1, value2, "jobPayment");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeIsNull() {
            addCriterion("job_publish_time is null");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeIsNotNull() {
            addCriterion("job_publish_time is not null");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeEqualTo(String value) {
            addCriterion("job_publish_time =", value, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeNotEqualTo(String value) {
            addCriterion("job_publish_time <>", value, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeGreaterThan(String value) {
            addCriterion("job_publish_time >", value, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("job_publish_time >=", value, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeLessThan(String value) {
            addCriterion("job_publish_time <", value, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeLessThanOrEqualTo(String value) {
            addCriterion("job_publish_time <=", value, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeLike(String value) {
            addCriterion("job_publish_time like", value, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeNotLike(String value) {
            addCriterion("job_publish_time not like", value, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeIn(List<String> values) {
            addCriterion("job_publish_time in", values, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeNotIn(List<String> values) {
            addCriterion("job_publish_time not in", values, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeBetween(String value1, String value2) {
            addCriterion("job_publish_time between", value1, value2, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobPublishTimeNotBetween(String value1, String value2) {
            addCriterion("job_publish_time not between", value1, value2, "jobPublishTime");
            return (Criteria) this;
        }

        public Criteria andJobAddressIsNull() {
            addCriterion("job_address is null");
            return (Criteria) this;
        }

        public Criteria andJobAddressIsNotNull() {
            addCriterion("job_address is not null");
            return (Criteria) this;
        }

        public Criteria andJobAddressEqualTo(String value) {
            addCriterion("job_address =", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressNotEqualTo(String value) {
            addCriterion("job_address <>", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressGreaterThan(String value) {
            addCriterion("job_address >", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressGreaterThanOrEqualTo(String value) {
            addCriterion("job_address >=", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressLessThan(String value) {
            addCriterion("job_address <", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressLessThanOrEqualTo(String value) {
            addCriterion("job_address <=", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressLike(String value) {
            addCriterion("job_address like", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressNotLike(String value) {
            addCriterion("job_address not like", value, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressIn(List<String> values) {
            addCriterion("job_address in", values, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressNotIn(List<String> values) {
            addCriterion("job_address not in", values, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressBetween(String value1, String value2) {
            addCriterion("job_address between", value1, value2, "jobAddress");
            return (Criteria) this;
        }

        public Criteria andJobAddressNotBetween(String value1, String value2) {
            addCriterion("job_address not between", value1, value2, "jobAddress");
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
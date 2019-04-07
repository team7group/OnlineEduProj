package com.group7.edu.entity;

import java.util.ArrayList;
import java.util.List;

public class SysPaymentModeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysPaymentModeExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNull() {
            addCriterion("icon_url is null");
            return (Criteria) this;
        }

        public Criteria andIconUrlIsNotNull() {
            addCriterion("icon_url is not null");
            return (Criteria) this;
        }

        public Criteria andIconUrlEqualTo(String value) {
            addCriterion("icon_url =", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotEqualTo(String value) {
            addCriterion("icon_url <>", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThan(String value) {
            addCriterion("icon_url >", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlGreaterThanOrEqualTo(String value) {
            addCriterion("icon_url >=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThan(String value) {
            addCriterion("icon_url <", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLessThanOrEqualTo(String value) {
            addCriterion("icon_url <=", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlLike(String value) {
            addCriterion("icon_url like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotLike(String value) {
            addCriterion("icon_url not like", value, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlIn(List<String> values) {
            addCriterion("icon_url in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotIn(List<String> values) {
            addCriterion("icon_url not in", values, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlBetween(String value1, String value2) {
            addCriterion("icon_url between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andIconUrlNotBetween(String value1, String value2) {
            addCriterion("icon_url not between", value1, value2, "iconUrl");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAgentIsNull() {
            addCriterion("agent is null");
            return (Criteria) this;
        }

        public Criteria andAgentIsNotNull() {
            addCriterion("agent is not null");
            return (Criteria) this;
        }

        public Criteria andAgentEqualTo(String value) {
            addCriterion("agent =", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotEqualTo(String value) {
            addCriterion("agent <>", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThan(String value) {
            addCriterion("agent >", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentGreaterThanOrEqualTo(String value) {
            addCriterion("agent >=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThan(String value) {
            addCriterion("agent <", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLessThanOrEqualTo(String value) {
            addCriterion("agent <=", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentLike(String value) {
            addCriterion("agent like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotLike(String value) {
            addCriterion("agent not like", value, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentIn(List<String> values) {
            addCriterion("agent in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotIn(List<String> values) {
            addCriterion("agent not in", values, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentBetween(String value1, String value2) {
            addCriterion("agent between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAgentNotBetween(String value1, String value2) {
            addCriterion("agent not between", value1, value2, "agent");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNull() {
            addCriterion("account_number is null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIsNotNull() {
            addCriterion("account_number is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNumberEqualTo(String value) {
            addCriterion("account_number =", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotEqualTo(String value) {
            addCriterion("account_number <>", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThan(String value) {
            addCriterion("account_number >", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("account_number >=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThan(String value) {
            addCriterion("account_number <", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("account_number <=", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberLike(String value) {
            addCriterion("account_number like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotLike(String value) {
            addCriterion("account_number not like", value, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberIn(List<String> values) {
            addCriterion("account_number in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotIn(List<String> values) {
            addCriterion("account_number not in", values, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberBetween(String value1, String value2) {
            addCriterion("account_number between", value1, value2, "accountNumber");
            return (Criteria) this;
        }

        public Criteria andAccountNumberNotBetween(String value1, String value2) {
            addCriterion("account_number not between", value1, value2, "accountNumber");
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
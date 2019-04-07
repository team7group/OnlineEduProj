package com.group7.edu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GroupExample() {
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

        public Criteria andTimesIsNull() {
            addCriterion("times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Integer value) {
            addCriterion("times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Integer value) {
            addCriterion("times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Integer value) {
            addCriterion("times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Integer value) {
            addCriterion("times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Integer value) {
            addCriterion("times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Integer> values) {
            addCriterion("times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Integer> values) {
            addCriterion("times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Integer value1, Integer value2) {
            addCriterion("times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andClassTimeIsNull() {
            addCriterion("class_time is null");
            return (Criteria) this;
        }

        public Criteria andClassTimeIsNotNull() {
            addCriterion("class_time is not null");
            return (Criteria) this;
        }

        public Criteria andClassTimeEqualTo(Date value) {
            addCriterion("class_time =", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotEqualTo(Date value) {
            addCriterion("class_time <>", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeGreaterThan(Date value) {
            addCriterion("class_time >", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("class_time >=", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeLessThan(Date value) {
            addCriterion("class_time <", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeLessThanOrEqualTo(Date value) {
            addCriterion("class_time <=", value, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeIn(List<Date> values) {
            addCriterion("class_time in", values, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotIn(List<Date> values) {
            addCriterion("class_time not in", values, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeBetween(Date value1, Date value2) {
            addCriterion("class_time between", value1, value2, "classTime");
            return (Criteria) this;
        }

        public Criteria andClassTimeNotBetween(Date value1, Date value2) {
            addCriterion("class_time not between", value1, value2, "classTime");
            return (Criteria) this;
        }

        public Criteria andSyllabusIsNull() {
            addCriterion("syllabus is null");
            return (Criteria) this;
        }

        public Criteria andSyllabusIsNotNull() {
            addCriterion("syllabus is not null");
            return (Criteria) this;
        }

        public Criteria andSyllabusEqualTo(Integer value) {
            addCriterion("syllabus =", value, "syllabus");
            return (Criteria) this;
        }

        public Criteria andSyllabusNotEqualTo(Integer value) {
            addCriterion("syllabus <>", value, "syllabus");
            return (Criteria) this;
        }

        public Criteria andSyllabusGreaterThan(Integer value) {
            addCriterion("syllabus >", value, "syllabus");
            return (Criteria) this;
        }

        public Criteria andSyllabusGreaterThanOrEqualTo(Integer value) {
            addCriterion("syllabus >=", value, "syllabus");
            return (Criteria) this;
        }

        public Criteria andSyllabusLessThan(Integer value) {
            addCriterion("syllabus <", value, "syllabus");
            return (Criteria) this;
        }

        public Criteria andSyllabusLessThanOrEqualTo(Integer value) {
            addCriterion("syllabus <=", value, "syllabus");
            return (Criteria) this;
        }

        public Criteria andSyllabusIn(List<Integer> values) {
            addCriterion("syllabus in", values, "syllabus");
            return (Criteria) this;
        }

        public Criteria andSyllabusNotIn(List<Integer> values) {
            addCriterion("syllabus not in", values, "syllabus");
            return (Criteria) this;
        }

        public Criteria andSyllabusBetween(Integer value1, Integer value2) {
            addCriterion("syllabus between", value1, value2, "syllabus");
            return (Criteria) this;
        }

        public Criteria andSyllabusNotBetween(Integer value1, Integer value2) {
            addCriterion("syllabus not between", value1, value2, "syllabus");
            return (Criteria) this;
        }

        public Criteria andCoverUrlIsNull() {
            addCriterion("cover_url is null");
            return (Criteria) this;
        }

        public Criteria andCoverUrlIsNotNull() {
            addCriterion("cover_url is not null");
            return (Criteria) this;
        }

        public Criteria andCoverUrlEqualTo(String value) {
            addCriterion("cover_url =", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlNotEqualTo(String value) {
            addCriterion("cover_url <>", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlGreaterThan(String value) {
            addCriterion("cover_url >", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlGreaterThanOrEqualTo(String value) {
            addCriterion("cover_url >=", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlLessThan(String value) {
            addCriterion("cover_url <", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlLessThanOrEqualTo(String value) {
            addCriterion("cover_url <=", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlLike(String value) {
            addCriterion("cover_url like", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlNotLike(String value) {
            addCriterion("cover_url not like", value, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlIn(List<String> values) {
            addCriterion("cover_url in", values, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlNotIn(List<String> values) {
            addCriterion("cover_url not in", values, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlBetween(String value1, String value2) {
            addCriterion("cover_url between", value1, value2, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andCoverUrlNotBetween(String value1, String value2) {
            addCriterion("cover_url not between", value1, value2, "coverUrl");
            return (Criteria) this;
        }

        public Criteria andQqGroupIsNull() {
            addCriterion("qq_group is null");
            return (Criteria) this;
        }

        public Criteria andQqGroupIsNotNull() {
            addCriterion("qq_group is not null");
            return (Criteria) this;
        }

        public Criteria andQqGroupEqualTo(String value) {
            addCriterion("qq_group =", value, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupNotEqualTo(String value) {
            addCriterion("qq_group <>", value, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupGreaterThan(String value) {
            addCriterion("qq_group >", value, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupGreaterThanOrEqualTo(String value) {
            addCriterion("qq_group >=", value, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupLessThan(String value) {
            addCriterion("qq_group <", value, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupLessThanOrEqualTo(String value) {
            addCriterion("qq_group <=", value, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupLike(String value) {
            addCriterion("qq_group like", value, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupNotLike(String value) {
            addCriterion("qq_group not like", value, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupIn(List<String> values) {
            addCriterion("qq_group in", values, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupNotIn(List<String> values) {
            addCriterion("qq_group not in", values, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupBetween(String value1, String value2) {
            addCriterion("qq_group between", value1, value2, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andQqGroupNotBetween(String value1, String value2) {
            addCriterion("qq_group not between", value1, value2, "qqGroup");
            return (Criteria) this;
        }

        public Criteria andClassTextIsNull() {
            addCriterion("class_text is null");
            return (Criteria) this;
        }

        public Criteria andClassTextIsNotNull() {
            addCriterion("class_text is not null");
            return (Criteria) this;
        }

        public Criteria andClassTextEqualTo(String value) {
            addCriterion("class_text =", value, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextNotEqualTo(String value) {
            addCriterion("class_text <>", value, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextGreaterThan(String value) {
            addCriterion("class_text >", value, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextGreaterThanOrEqualTo(String value) {
            addCriterion("class_text >=", value, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextLessThan(String value) {
            addCriterion("class_text <", value, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextLessThanOrEqualTo(String value) {
            addCriterion("class_text <=", value, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextLike(String value) {
            addCriterion("class_text like", value, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextNotLike(String value) {
            addCriterion("class_text not like", value, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextIn(List<String> values) {
            addCriterion("class_text in", values, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextNotIn(List<String> values) {
            addCriterion("class_text not in", values, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextBetween(String value1, String value2) {
            addCriterion("class_text between", value1, value2, "classText");
            return (Criteria) this;
        }

        public Criteria andClassTextNotBetween(String value1, String value2) {
            addCriterion("class_text not between", value1, value2, "classText");
            return (Criteria) this;
        }

        public Criteria andTextTimeIsNull() {
            addCriterion("text_time is null");
            return (Criteria) this;
        }

        public Criteria andTextTimeIsNotNull() {
            addCriterion("text_time is not null");
            return (Criteria) this;
        }

        public Criteria andTextTimeEqualTo(Date value) {
            addCriterion("text_time =", value, "textTime");
            return (Criteria) this;
        }

        public Criteria andTextTimeNotEqualTo(Date value) {
            addCriterion("text_time <>", value, "textTime");
            return (Criteria) this;
        }

        public Criteria andTextTimeGreaterThan(Date value) {
            addCriterion("text_time >", value, "textTime");
            return (Criteria) this;
        }

        public Criteria andTextTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("text_time >=", value, "textTime");
            return (Criteria) this;
        }

        public Criteria andTextTimeLessThan(Date value) {
            addCriterion("text_time <", value, "textTime");
            return (Criteria) this;
        }

        public Criteria andTextTimeLessThanOrEqualTo(Date value) {
            addCriterion("text_time <=", value, "textTime");
            return (Criteria) this;
        }

        public Criteria andTextTimeIn(List<Date> values) {
            addCriterion("text_time in", values, "textTime");
            return (Criteria) this;
        }

        public Criteria andTextTimeNotIn(List<Date> values) {
            addCriterion("text_time not in", values, "textTime");
            return (Criteria) this;
        }

        public Criteria andTextTimeBetween(Date value1, Date value2) {
            addCriterion("text_time between", value1, value2, "textTime");
            return (Criteria) this;
        }

        public Criteria andTextTimeNotBetween(Date value1, Date value2) {
            addCriterion("text_time not between", value1, value2, "textTime");
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
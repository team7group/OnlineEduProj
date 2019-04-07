package com.group7.edu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SysVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysVideoExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
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

        public Criteria andCourseIsNull() {
            addCriterion("course is null");
            return (Criteria) this;
        }

        public Criteria andCourseIsNotNull() {
            addCriterion("course is not null");
            return (Criteria) this;
        }

        public Criteria andCourseEqualTo(Integer value) {
            addCriterion("course =", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotEqualTo(Integer value) {
            addCriterion("course <>", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThan(Integer value) {
            addCriterion("course >", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseGreaterThanOrEqualTo(Integer value) {
            addCriterion("course >=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThan(Integer value) {
            addCriterion("course <", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseLessThanOrEqualTo(Integer value) {
            addCriterion("course <=", value, "course");
            return (Criteria) this;
        }

        public Criteria andCourseIn(List<Integer> values) {
            addCriterion("course in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotIn(List<Integer> values) {
            addCriterion("course not in", values, "course");
            return (Criteria) this;
        }

        public Criteria andCourseBetween(Integer value1, Integer value2) {
            addCriterion("course between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCourseNotBetween(Integer value1, Integer value2) {
            addCriterion("course not between", value1, value2, "course");
            return (Criteria) this;
        }

        public Criteria andCapterIsNull() {
            addCriterion("capter is null");
            return (Criteria) this;
        }

        public Criteria andCapterIsNotNull() {
            addCriterion("capter is not null");
            return (Criteria) this;
        }

        public Criteria andCapterEqualTo(Integer value) {
            addCriterion("capter =", value, "capter");
            return (Criteria) this;
        }

        public Criteria andCapterNotEqualTo(Integer value) {
            addCriterion("capter <>", value, "capter");
            return (Criteria) this;
        }

        public Criteria andCapterGreaterThan(Integer value) {
            addCriterion("capter >", value, "capter");
            return (Criteria) this;
        }

        public Criteria andCapterGreaterThanOrEqualTo(Integer value) {
            addCriterion("capter >=", value, "capter");
            return (Criteria) this;
        }

        public Criteria andCapterLessThan(Integer value) {
            addCriterion("capter <", value, "capter");
            return (Criteria) this;
        }

        public Criteria andCapterLessThanOrEqualTo(Integer value) {
            addCriterion("capter <=", value, "capter");
            return (Criteria) this;
        }

        public Criteria andCapterIn(List<Integer> values) {
            addCriterion("capter in", values, "capter");
            return (Criteria) this;
        }

        public Criteria andCapterNotIn(List<Integer> values) {
            addCriterion("capter not in", values, "capter");
            return (Criteria) this;
        }

        public Criteria andCapterBetween(Integer value1, Integer value2) {
            addCriterion("capter between", value1, value2, "capter");
            return (Criteria) this;
        }

        public Criteria andCapterNotBetween(Integer value1, Integer value2) {
            addCriterion("capter not between", value1, value2, "capter");
            return (Criteria) this;
        }

        public Criteria andPartIsNull() {
            addCriterion("part is null");
            return (Criteria) this;
        }

        public Criteria andPartIsNotNull() {
            addCriterion("part is not null");
            return (Criteria) this;
        }

        public Criteria andPartEqualTo(Integer value) {
            addCriterion("part =", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartNotEqualTo(Integer value) {
            addCriterion("part <>", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartGreaterThan(Integer value) {
            addCriterion("part >", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartGreaterThanOrEqualTo(Integer value) {
            addCriterion("part >=", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartLessThan(Integer value) {
            addCriterion("part <", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartLessThanOrEqualTo(Integer value) {
            addCriterion("part <=", value, "part");
            return (Criteria) this;
        }

        public Criteria andPartIn(List<Integer> values) {
            addCriterion("part in", values, "part");
            return (Criteria) this;
        }

        public Criteria andPartNotIn(List<Integer> values) {
            addCriterion("part not in", values, "part");
            return (Criteria) this;
        }

        public Criteria andPartBetween(Integer value1, Integer value2) {
            addCriterion("part between", value1, value2, "part");
            return (Criteria) this;
        }

        public Criteria andPartNotBetween(Integer value1, Integer value2) {
            addCriterion("part not between", value1, value2, "part");
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

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Date value) {
            addCriterionForJDBCTime("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Date value) {
            addCriterionForJDBCTime("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Date value) {
            addCriterionForJDBCTime("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Date value) {
            addCriterionForJDBCTime("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Date> values) {
            addCriterionForJDBCTime("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Date> values) {
            addCriterionForJDBCTime("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNull() {
            addCriterion("file_url is null");
            return (Criteria) this;
        }

        public Criteria andFileUrlIsNotNull() {
            addCriterion("file_url is not null");
            return (Criteria) this;
        }

        public Criteria andFileUrlEqualTo(String value) {
            addCriterion("file_url =", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotEqualTo(String value) {
            addCriterion("file_url <>", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThan(String value) {
            addCriterion("file_url >", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlGreaterThanOrEqualTo(String value) {
            addCriterion("file_url >=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThan(String value) {
            addCriterion("file_url <", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLessThanOrEqualTo(String value) {
            addCriterion("file_url <=", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlLike(String value) {
            addCriterion("file_url like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotLike(String value) {
            addCriterion("file_url not like", value, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlIn(List<String> values) {
            addCriterion("file_url in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotIn(List<String> values) {
            addCriterion("file_url not in", values, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlBetween(String value1, String value2) {
            addCriterion("file_url between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andFileUrlNotBetween(String value1, String value2) {
            addCriterion("file_url not between", value1, value2, "fileUrl");
            return (Criteria) this;
        }

        public Criteria andSharingTimesIsNull() {
            addCriterion("sharing_times is null");
            return (Criteria) this;
        }

        public Criteria andSharingTimesIsNotNull() {
            addCriterion("sharing_times is not null");
            return (Criteria) this;
        }

        public Criteria andSharingTimesEqualTo(Integer value) {
            addCriterion("sharing_times =", value, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andSharingTimesNotEqualTo(Integer value) {
            addCriterion("sharing_times <>", value, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andSharingTimesGreaterThan(Integer value) {
            addCriterion("sharing_times >", value, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andSharingTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("sharing_times >=", value, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andSharingTimesLessThan(Integer value) {
            addCriterion("sharing_times <", value, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andSharingTimesLessThanOrEqualTo(Integer value) {
            addCriterion("sharing_times <=", value, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andSharingTimesIn(List<Integer> values) {
            addCriterion("sharing_times in", values, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andSharingTimesNotIn(List<Integer> values) {
            addCriterion("sharing_times not in", values, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andSharingTimesBetween(Integer value1, Integer value2) {
            addCriterion("sharing_times between", value1, value2, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andSharingTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("sharing_times not between", value1, value2, "sharingTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesIsNull() {
            addCriterion("like_times is null");
            return (Criteria) this;
        }

        public Criteria andLikeTimesIsNotNull() {
            addCriterion("like_times is not null");
            return (Criteria) this;
        }

        public Criteria andLikeTimesEqualTo(Integer value) {
            addCriterion("like_times =", value, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesNotEqualTo(Integer value) {
            addCriterion("like_times <>", value, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesGreaterThan(Integer value) {
            addCriterion("like_times >", value, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("like_times >=", value, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesLessThan(Integer value) {
            addCriterion("like_times <", value, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesLessThanOrEqualTo(Integer value) {
            addCriterion("like_times <=", value, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesIn(List<Integer> values) {
            addCriterion("like_times in", values, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesNotIn(List<Integer> values) {
            addCriterion("like_times not in", values, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesBetween(Integer value1, Integer value2) {
            addCriterion("like_times between", value1, value2, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andLikeTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("like_times not between", value1, value2, "likeTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesIsNull() {
            addCriterion("collection_times is null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesIsNotNull() {
            addCriterion("collection_times is not null");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesEqualTo(Integer value) {
            addCriterion("collection_times =", value, "collectionTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesNotEqualTo(Integer value) {
            addCriterion("collection_times <>", value, "collectionTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesGreaterThan(Integer value) {
            addCriterion("collection_times >", value, "collectionTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("collection_times >=", value, "collectionTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesLessThan(Integer value) {
            addCriterion("collection_times <", value, "collectionTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesLessThanOrEqualTo(Integer value) {
            addCriterion("collection_times <=", value, "collectionTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesIn(List<Integer> values) {
            addCriterion("collection_times in", values, "collectionTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesNotIn(List<Integer> values) {
            addCriterion("collection_times not in", values, "collectionTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesBetween(Integer value1, Integer value2) {
            addCriterion("collection_times between", value1, value2, "collectionTimes");
            return (Criteria) this;
        }

        public Criteria andCollectionTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("collection_times not between", value1, value2, "collectionTimes");
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
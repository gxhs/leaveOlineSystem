package com.ssm.entity;

import java.util.ArrayList;
import java.util.List;

public class MajorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MajorExample() {
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

        public Criteria andFacultyIsNull() {
            addCriterion("faculty is null");
            return (Criteria) this;
        }

        public Criteria andFacultyIsNotNull() {
            addCriterion("faculty is not null");
            return (Criteria) this;
        }

        public Criteria andFacultyEqualTo(String value) {
            addCriterion("faculty =", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotEqualTo(String value) {
            addCriterion("faculty <>", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyGreaterThan(String value) {
            addCriterion("faculty >", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyGreaterThanOrEqualTo(String value) {
            addCriterion("faculty >=", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyLessThan(String value) {
            addCriterion("faculty <", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyLessThanOrEqualTo(String value) {
            addCriterion("faculty <=", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyLike(String value) {
            addCriterion("faculty like", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotLike(String value) {
            addCriterion("faculty not like", value, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyIn(List<String> values) {
            addCriterion("faculty in", values, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotIn(List<String> values) {
            addCriterion("faculty not in", values, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyBetween(String value1, String value2) {
            addCriterion("faculty between", value1, value2, "faculty");
            return (Criteria) this;
        }

        public Criteria andFacultyNotBetween(String value1, String value2) {
            addCriterion("faculty not between", value1, value2, "faculty");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andAssistantIdIsNull() {
            addCriterion("assistant_id is null");
            return (Criteria) this;
        }

        public Criteria andAssistantIdIsNotNull() {
            addCriterion("assistant_id is not null");
            return (Criteria) this;
        }

        public Criteria andAssistantIdEqualTo(Integer value) {
            addCriterion("assistant_id =", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdNotEqualTo(Integer value) {
            addCriterion("assistant_id <>", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdGreaterThan(Integer value) {
            addCriterion("assistant_id >", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("assistant_id >=", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdLessThan(Integer value) {
            addCriterion("assistant_id <", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdLessThanOrEqualTo(Integer value) {
            addCriterion("assistant_id <=", value, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdIn(List<Integer> values) {
            addCriterion("assistant_id in", values, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdNotIn(List<Integer> values) {
            addCriterion("assistant_id not in", values, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdBetween(Integer value1, Integer value2) {
            addCriterion("assistant_id between", value1, value2, "assistantId");
            return (Criteria) this;
        }

        public Criteria andAssistantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("assistant_id not between", value1, value2, "assistantId");
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
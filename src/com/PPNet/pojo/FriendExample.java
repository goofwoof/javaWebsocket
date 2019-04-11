package com.PPNet.pojo;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class FriendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FriendExample() {
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

        public Criteria andIdfriendIsNull() {
            addCriterion("idfriend is null");
            return (Criteria) this;
        }

        public Criteria andIdfriendIsNotNull() {
            addCriterion("idfriend is not null");
            return (Criteria) this;
        }

        public Criteria andIdfriendEqualTo(Integer value) {
            addCriterion("idfriend =", value, "idfriend");
            return (Criteria) this;
        }

        public Criteria andIdfriendNotEqualTo(Integer value) {
            addCriterion("idfriend <>", value, "idfriend");
            return (Criteria) this;
        }

        public Criteria andIdfriendGreaterThan(Integer value) {
            addCriterion("idfriend >", value, "idfriend");
            return (Criteria) this;
        }

        public Criteria andIdfriendGreaterThanOrEqualTo(Integer value) {
            addCriterion("idfriend >=", value, "idfriend");
            return (Criteria) this;
        }

        public Criteria andIdfriendLessThan(Integer value) {
            addCriterion("idfriend <", value, "idfriend");
            return (Criteria) this;
        }

        public Criteria andIdfriendLessThanOrEqualTo(Integer value) {
            addCriterion("idfriend <=", value, "idfriend");
            return (Criteria) this;
        }

        public Criteria andIdfriendIn(List<Integer> values) {
            addCriterion("idfriend in", values, "idfriend");
            return (Criteria) this;
        }

        public Criteria andIdfriendNotIn(List<Integer> values) {
            addCriterion("idfriend not in", values, "idfriend");
            return (Criteria) this;
        }

        public Criteria andIdfriendBetween(Integer value1, Integer value2) {
            addCriterion("idfriend between", value1, value2, "idfriend");
            return (Criteria) this;
        }

        public Criteria andIdfriendNotBetween(Integer value1, Integer value2) {
            addCriterion("idfriend not between", value1, value2, "idfriend");
            return (Criteria) this;
        }

        public Criteria andHostuseridIsNull() {
            addCriterion("hostUserID is null");
            return (Criteria) this;
        }

        public Criteria andHostuseridIsNotNull() {
            addCriterion("hostUserID is not null");
            return (Criteria) this;
        }

        public Criteria andHostuseridEqualTo(String value) {
            addCriterion("hostUserID =", value, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridNotEqualTo(String value) {
            addCriterion("hostUserID <>", value, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridGreaterThan(String value) {
            addCriterion("hostUserID >", value, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridGreaterThanOrEqualTo(String value) {
            addCriterion("hostUserID >=", value, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridLessThan(String value) {
            addCriterion("hostUserID <", value, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridLessThanOrEqualTo(String value) {
            addCriterion("hostUserID <=", value, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridLike(String value) {
            addCriterion("hostUserID like", value, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridNotLike(String value) {
            addCriterion("hostUserID not like", value, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridIn(List<String> values) {
            addCriterion("hostUserID in", values, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridNotIn(List<String> values) {
            addCriterion("hostUserID not in", values, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridBetween(String value1, String value2) {
            addCriterion("hostUserID between", value1, value2, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andHostuseridNotBetween(String value1, String value2) {
            addCriterion("hostUserID not between", value1, value2, "hostuserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridIsNull() {
            addCriterion("friendUserID is null");
            return (Criteria) this;
        }

        public Criteria andFrienduseridIsNotNull() {
            addCriterion("friendUserID is not null");
            return (Criteria) this;
        }

        public Criteria andFrienduseridEqualTo(String value) {
            addCriterion("friendUserID =", value, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridNotEqualTo(String value) {
            addCriterion("friendUserID <>", value, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridGreaterThan(String value) {
            addCriterion("friendUserID >", value, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridGreaterThanOrEqualTo(String value) {
            addCriterion("friendUserID >=", value, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridLessThan(String value) {
            addCriterion("friendUserID <", value, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridLessThanOrEqualTo(String value) {
            addCriterion("friendUserID <=", value, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridLike(String value) {
            addCriterion("friendUserID like", value, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridNotLike(String value) {
            addCriterion("friendUserID not like", value, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridIn(List<String> values) {
            addCriterion("friendUserID in", values, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridNotIn(List<String> values) {
            addCriterion("friendUserID not in", values, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridBetween(String value1, String value2) {
            addCriterion("friendUserID between", value1, value2, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFrienduseridNotBetween(String value1, String value2) {
            addCriterion("friendUserID not between", value1, value2, "frienduserid");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
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
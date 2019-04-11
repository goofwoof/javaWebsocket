package com.PPNet.pojo;

import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

public class ChatroommessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChatroommessageExample() {
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

        public Criteria andIdchatroommessageIsNull() {
            addCriterion("idchatroomMessage is null");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageIsNotNull() {
            addCriterion("idchatroomMessage is not null");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageEqualTo(Integer value) {
            addCriterion("idchatroomMessage =", value, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageNotEqualTo(Integer value) {
            addCriterion("idchatroomMessage <>", value, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageGreaterThan(Integer value) {
            addCriterion("idchatroomMessage >", value, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageGreaterThanOrEqualTo(Integer value) {
            addCriterion("idchatroomMessage >=", value, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageLessThan(Integer value) {
            addCriterion("idchatroomMessage <", value, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageLessThanOrEqualTo(Integer value) {
            addCriterion("idchatroomMessage <=", value, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageIn(List<Integer> values) {
            addCriterion("idchatroomMessage in", values, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageNotIn(List<Integer> values) {
            addCriterion("idchatroomMessage not in", values, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageBetween(Integer value1, Integer value2) {
            addCriterion("idchatroomMessage between", value1, value2, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andIdchatroommessageNotBetween(Integer value1, Integer value2) {
            addCriterion("idchatroomMessage not between", value1, value2, "idchatroommessage");
            return (Criteria) this;
        }

        public Criteria andChatroomidIsNull() {
            addCriterion("chatRoomID is null");
            return (Criteria) this;
        }

        public Criteria andChatroomidIsNotNull() {
            addCriterion("chatRoomID is not null");
            return (Criteria) this;
        }

        public Criteria andChatroomidEqualTo(String value) {
            addCriterion("chatRoomID =", value, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidNotEqualTo(String value) {
            addCriterion("chatRoomID <>", value, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidGreaterThan(String value) {
            addCriterion("chatRoomID >", value, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidGreaterThanOrEqualTo(String value) {
            addCriterion("chatRoomID >=", value, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidLessThan(String value) {
            addCriterion("chatRoomID <", value, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidLessThanOrEqualTo(String value) {
            addCriterion("chatRoomID <=", value, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidLike(String value) {
            addCriterion("chatRoomID like", value, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidNotLike(String value) {
            addCriterion("chatRoomID not like", value, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidIn(List<String> values) {
            addCriterion("chatRoomID in", values, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidNotIn(List<String> values) {
            addCriterion("chatRoomID not in", values, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidBetween(String value1, String value2) {
            addCriterion("chatRoomID between", value1, value2, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andChatroomidNotBetween(String value1, String value2) {
            addCriterion("chatRoomID not between", value1, value2, "chatroomid");
            return (Criteria) this;
        }

        public Criteria andMessageIsNull() {
            addCriterion("message is null");
            return (Criteria) this;
        }

        public Criteria andMessageIsNotNull() {
            addCriterion("message is not null");
            return (Criteria) this;
        }

        public Criteria andMessageEqualTo(String value) {
            addCriterion("message =", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotEqualTo(String value) {
            addCriterion("message <>", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThan(String value) {
            addCriterion("message >", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageGreaterThanOrEqualTo(String value) {
            addCriterion("message >=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThan(String value) {
            addCriterion("message <", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLessThanOrEqualTo(String value) {
            addCriterion("message <=", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageLike(String value) {
            addCriterion("message like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotLike(String value) {
            addCriterion("message not like", value, "message");
            return (Criteria) this;
        }

        public Criteria andMessageIn(List<String> values) {
            addCriterion("message in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotIn(List<String> values) {
            addCriterion("message not in", values, "message");
            return (Criteria) this;
        }

        public Criteria andMessageBetween(String value1, String value2) {
            addCriterion("message between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andMessageNotBetween(String value1, String value2) {
            addCriterion("message not between", value1, value2, "message");
            return (Criteria) this;
        }

        public Criteria andFromIsNull() {
            addCriterion("from is null");
            return (Criteria) this;
        }

        public Criteria andFromIsNotNull() {
            addCriterion("from is not null");
            return (Criteria) this;
        }

        public Criteria andFromEqualTo(String value) {
            addCriterion("from =", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotEqualTo(String value) {
            addCriterion("from <>", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThan(String value) {
            addCriterion("from >", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromGreaterThanOrEqualTo(String value) {
            addCriterion("from >=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThan(String value) {
            addCriterion("from <", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLessThanOrEqualTo(String value) {
            addCriterion("from <=", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromLike(String value) {
            addCriterion("from like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotLike(String value) {
            addCriterion("from not like", value, "from");
            return (Criteria) this;
        }

        public Criteria andFromIn(List<String> values) {
            addCriterion("from in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotIn(List<String> values) {
            addCriterion("from not in", values, "from");
            return (Criteria) this;
        }

        public Criteria andFromBetween(String value1, String value2) {
            addCriterion("from between", value1, value2, "from");
            return (Criteria) this;
        }

        public Criteria andFromNotBetween(String value1, String value2) {
            addCriterion("from not between", value1, value2, "from");
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
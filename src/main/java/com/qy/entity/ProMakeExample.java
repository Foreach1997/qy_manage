package com.qy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProMakeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProMakeExample() {
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

        public Criteria andMakeIdIsNull() {
            addCriterion("make_id is null");
            return (Criteria) this;
        }

        public Criteria andMakeIdIsNotNull() {
            addCriterion("make_id is not null");
            return (Criteria) this;
        }

        public Criteria andMakeIdEqualTo(Integer value) {
            addCriterion("make_id =", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdNotEqualTo(Integer value) {
            addCriterion("make_id <>", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdGreaterThan(Integer value) {
            addCriterion("make_id >", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("make_id >=", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdLessThan(Integer value) {
            addCriterion("make_id <", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdLessThanOrEqualTo(Integer value) {
            addCriterion("make_id <=", value, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdIn(List<Integer> values) {
            addCriterion("make_id in", values, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdNotIn(List<Integer> values) {
            addCriterion("make_id not in", values, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdBetween(Integer value1, Integer value2) {
            addCriterion("make_id between", value1, value2, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("make_id not between", value1, value2, "makeId");
            return (Criteria) this;
        }

        public Criteria andMakeTypeIsNull() {
            addCriterion("make_type is null");
            return (Criteria) this;
        }

        public Criteria andMakeTypeIsNotNull() {
            addCriterion("make_type is not null");
            return (Criteria) this;
        }

        public Criteria andMakeTypeEqualTo(Integer value) {
            addCriterion("make_type =", value, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeTypeNotEqualTo(Integer value) {
            addCriterion("make_type <>", value, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeTypeGreaterThan(Integer value) {
            addCriterion("make_type >", value, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("make_type >=", value, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeTypeLessThan(Integer value) {
            addCriterion("make_type <", value, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("make_type <=", value, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeTypeIn(List<Integer> values) {
            addCriterion("make_type in", values, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeTypeNotIn(List<Integer> values) {
            addCriterion("make_type not in", values, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeTypeBetween(Integer value1, Integer value2) {
            addCriterion("make_type between", value1, value2, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("make_type not between", value1, value2, "makeType");
            return (Criteria) this;
        }

        public Criteria andMakeFileIsNull() {
            addCriterion("make_file is null");
            return (Criteria) this;
        }

        public Criteria andMakeFileIsNotNull() {
            addCriterion("make_file is not null");
            return (Criteria) this;
        }

        public Criteria andMakeFileEqualTo(String value) {
            addCriterion("make_file =", value, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileNotEqualTo(String value) {
            addCriterion("make_file <>", value, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileGreaterThan(String value) {
            addCriterion("make_file >", value, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileGreaterThanOrEqualTo(String value) {
            addCriterion("make_file >=", value, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileLessThan(String value) {
            addCriterion("make_file <", value, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileLessThanOrEqualTo(String value) {
            addCriterion("make_file <=", value, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileLike(String value) {
            addCriterion("make_file like", value, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileNotLike(String value) {
            addCriterion("make_file not like", value, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileIn(List<String> values) {
            addCriterion("make_file in", values, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileNotIn(List<String> values) {
            addCriterion("make_file not in", values, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileBetween(String value1, String value2) {
            addCriterion("make_file between", value1, value2, "makeFile");
            return (Criteria) this;
        }

        public Criteria andMakeFileNotBetween(String value1, String value2) {
            addCriterion("make_file not between", value1, value2, "makeFile");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNull() {
            addCriterion("pro_code is null");
            return (Criteria) this;
        }

        public Criteria andProCodeIsNotNull() {
            addCriterion("pro_code is not null");
            return (Criteria) this;
        }

        public Criteria andProCodeEqualTo(String value) {
            addCriterion("pro_code =", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotEqualTo(String value) {
            addCriterion("pro_code <>", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThan(String value) {
            addCriterion("pro_code >", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_code >=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThan(String value) {
            addCriterion("pro_code <", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLessThanOrEqualTo(String value) {
            addCriterion("pro_code <=", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeLike(String value) {
            addCriterion("pro_code like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotLike(String value) {
            addCriterion("pro_code not like", value, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeIn(List<String> values) {
            addCriterion("pro_code in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotIn(List<String> values) {
            addCriterion("pro_code not in", values, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeBetween(String value1, String value2) {
            addCriterion("pro_code between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andProCodeNotBetween(String value1, String value2) {
            addCriterion("pro_code not between", value1, value2, "proCode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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
package com.qy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TaskBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TaskBookExample() {
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

        public Criteria andTaskBookIdIsNull() {
            addCriterion("task_book_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdIsNotNull() {
            addCriterion("task_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdEqualTo(Integer value) {
            addCriterion("task_book_id =", value, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdNotEqualTo(Integer value) {
            addCriterion("task_book_id <>", value, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdGreaterThan(Integer value) {
            addCriterion("task_book_id >", value, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("task_book_id >=", value, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdLessThan(Integer value) {
            addCriterion("task_book_id <", value, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("task_book_id <=", value, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdIn(List<Integer> values) {
            addCriterion("task_book_id in", values, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdNotIn(List<Integer> values) {
            addCriterion("task_book_id not in", values, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdBetween(Integer value1, Integer value2) {
            addCriterion("task_book_id between", value1, value2, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andTaskBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("task_book_id not between", value1, value2, "taskBookId");
            return (Criteria) this;
        }

        public Criteria andProNameIsNull() {
            addCriterion("pro_name is null");
            return (Criteria) this;
        }

        public Criteria andProNameIsNotNull() {
            addCriterion("pro_name is not null");
            return (Criteria) this;
        }

        public Criteria andProNameEqualTo(String value) {
            addCriterion("pro_name =", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotEqualTo(String value) {
            addCriterion("pro_name <>", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThan(String value) {
            addCriterion("pro_name >", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameGreaterThanOrEqualTo(String value) {
            addCriterion("pro_name >=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThan(String value) {
            addCriterion("pro_name <", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLessThanOrEqualTo(String value) {
            addCriterion("pro_name <=", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameLike(String value) {
            addCriterion("pro_name like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotLike(String value) {
            addCriterion("pro_name not like", value, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameIn(List<String> values) {
            addCriterion("pro_name in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotIn(List<String> values) {
            addCriterion("pro_name not in", values, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameBetween(String value1, String value2) {
            addCriterion("pro_name between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProNameNotBetween(String value1, String value2) {
            addCriterion("pro_name not between", value1, value2, "proName");
            return (Criteria) this;
        }

        public Criteria andProTimeStartIsNull() {
            addCriterion("pro_time_start is null");
            return (Criteria) this;
        }

        public Criteria andProTimeStartIsNotNull() {
            addCriterion("pro_time_start is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeStartEqualTo(Date value) {
            addCriterion("pro_time_start =", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartNotEqualTo(Date value) {
            addCriterion("pro_time_start <>", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartGreaterThan(Date value) {
            addCriterion("pro_time_start >", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartGreaterThanOrEqualTo(Date value) {
            addCriterion("pro_time_start >=", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartLessThan(Date value) {
            addCriterion("pro_time_start <", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartLessThanOrEqualTo(Date value) {
            addCriterion("pro_time_start <=", value, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartIn(List<Date> values) {
            addCriterion("pro_time_start in", values, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartNotIn(List<Date> values) {
            addCriterion("pro_time_start not in", values, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartBetween(Date value1, Date value2) {
            addCriterion("pro_time_start between", value1, value2, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProTimeStartNotBetween(Date value1, Date value2) {
            addCriterion("pro_time_start not between", value1, value2, "proTimeStart");
            return (Criteria) this;
        }

        public Criteria andProMoneyIsNull() {
            addCriterion("pro_money is null");
            return (Criteria) this;
        }

        public Criteria andProMoneyIsNotNull() {
            addCriterion("pro_money is not null");
            return (Criteria) this;
        }

        public Criteria andProMoneyEqualTo(Float value) {
            addCriterion("pro_money =", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyNotEqualTo(Float value) {
            addCriterion("pro_money <>", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyGreaterThan(Float value) {
            addCriterion("pro_money >", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("pro_money >=", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyLessThan(Float value) {
            addCriterion("pro_money <", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyLessThanOrEqualTo(Float value) {
            addCriterion("pro_money <=", value, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyIn(List<Float> values) {
            addCriterion("pro_money in", values, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyNotIn(List<Float> values) {
            addCriterion("pro_money not in", values, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyBetween(Float value1, Float value2) {
            addCriterion("pro_money between", value1, value2, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProMoneyNotBetween(Float value1, Float value2) {
            addCriterion("pro_money not between", value1, value2, "proMoney");
            return (Criteria) this;
        }

        public Criteria andProTimeEndIsNull() {
            addCriterion("pro_time_end is null");
            return (Criteria) this;
        }

        public Criteria andProTimeEndIsNotNull() {
            addCriterion("pro_time_end is not null");
            return (Criteria) this;
        }

        public Criteria andProTimeEndEqualTo(Date value) {
            addCriterion("pro_time_end =", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndNotEqualTo(Date value) {
            addCriterion("pro_time_end <>", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndGreaterThan(Date value) {
            addCriterion("pro_time_end >", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndGreaterThanOrEqualTo(Date value) {
            addCriterion("pro_time_end >=", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndLessThan(Date value) {
            addCriterion("pro_time_end <", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndLessThanOrEqualTo(Date value) {
            addCriterion("pro_time_end <=", value, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndIn(List<Date> values) {
            addCriterion("pro_time_end in", values, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndNotIn(List<Date> values) {
            addCriterion("pro_time_end not in", values, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndBetween(Date value1, Date value2) {
            addCriterion("pro_time_end between", value1, value2, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andProTimeEndNotBetween(Date value1, Date value2) {
            addCriterion("pro_time_end not between", value1, value2, "proTimeEnd");
            return (Criteria) this;
        }

        public Criteria andTaskNoteIsNull() {
            addCriterion("task_note is null");
            return (Criteria) this;
        }

        public Criteria andTaskNoteIsNotNull() {
            addCriterion("task_note is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNoteEqualTo(String value) {
            addCriterion("task_note =", value, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteNotEqualTo(String value) {
            addCriterion("task_note <>", value, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteGreaterThan(String value) {
            addCriterion("task_note >", value, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteGreaterThanOrEqualTo(String value) {
            addCriterion("task_note >=", value, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteLessThan(String value) {
            addCriterion("task_note <", value, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteLessThanOrEqualTo(String value) {
            addCriterion("task_note <=", value, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteLike(String value) {
            addCriterion("task_note like", value, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteNotLike(String value) {
            addCriterion("task_note not like", value, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteIn(List<String> values) {
            addCriterion("task_note in", values, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteNotIn(List<String> values) {
            addCriterion("task_note not in", values, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteBetween(String value1, String value2) {
            addCriterion("task_note between", value1, value2, "taskNote");
            return (Criteria) this;
        }

        public Criteria andTaskNoteNotBetween(String value1, String value2) {
            addCriterion("task_note not between", value1, value2, "taskNote");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNull() {
            addCriterion("work_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkIdIsNotNull() {
            addCriterion("work_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkIdEqualTo(Integer value) {
            addCriterion("work_id =", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotEqualTo(Integer value) {
            addCriterion("work_id <>", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThan(Integer value) {
            addCriterion("work_id >", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_id >=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThan(Integer value) {
            addCriterion("work_id <", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_id <=", value, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdIn(List<Integer> values) {
            addCriterion("work_id in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotIn(List<Integer> values) {
            addCriterion("work_id not in", values, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdBetween(Integer value1, Integer value2) {
            addCriterion("work_id between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andWorkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_id not between", value1, value2, "workId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andReportBookIdIsNull() {
            addCriterion("report_book_id is null");
            return (Criteria) this;
        }

        public Criteria andReportBookIdIsNotNull() {
            addCriterion("report_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andReportBookIdEqualTo(Integer value) {
            addCriterion("report_book_id =", value, "reportBookId");
            return (Criteria) this;
        }

        public Criteria andReportBookIdNotEqualTo(Integer value) {
            addCriterion("report_book_id <>", value, "reportBookId");
            return (Criteria) this;
        }

        public Criteria andReportBookIdGreaterThan(Integer value) {
            addCriterion("report_book_id >", value, "reportBookId");
            return (Criteria) this;
        }

        public Criteria andReportBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("report_book_id >=", value, "reportBookId");
            return (Criteria) this;
        }

        public Criteria andReportBookIdLessThan(Integer value) {
            addCriterion("report_book_id <", value, "reportBookId");
            return (Criteria) this;
        }

        public Criteria andReportBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("report_book_id <=", value, "reportBookId");
            return (Criteria) this;
        }

        public Criteria andReportBookIdIn(List<Integer> values) {
            addCriterion("report_book_id in", values, "reportBookId");
            return (Criteria) this;
        }

        public Criteria andReportBookIdNotIn(List<Integer> values) {
            addCriterion("report_book_id not in", values, "reportBookId");
            return (Criteria) this;
        }

        public Criteria andReportBookIdBetween(Integer value1, Integer value2) {
            addCriterion("report_book_id between", value1, value2, "reportBookId");
            return (Criteria) this;
        }

        public Criteria andReportBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("report_book_id not between", value1, value2, "reportBookId");
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
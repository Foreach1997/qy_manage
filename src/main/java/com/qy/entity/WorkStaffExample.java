package com.qy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkStaffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkStaffExample() {
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

        public Criteria andWorkStaffIdIsNull() {
            addCriterion("work_staff_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdIsNotNull() {
            addCriterion("work_staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdEqualTo(Integer value) {
            addCriterion("work_staff_id =", value, "workStaffId");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdNotEqualTo(Integer value) {
            addCriterion("work_staff_id <>", value, "workStaffId");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdGreaterThan(Integer value) {
            addCriterion("work_staff_id >", value, "workStaffId");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_staff_id >=", value, "workStaffId");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdLessThan(Integer value) {
            addCriterion("work_staff_id <", value, "workStaffId");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_staff_id <=", value, "workStaffId");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdIn(List<Integer> values) {
            addCriterion("work_staff_id in", values, "workStaffId");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdNotIn(List<Integer> values) {
            addCriterion("work_staff_id not in", values, "workStaffId");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdBetween(Integer value1, Integer value2) {
            addCriterion("work_staff_id between", value1, value2, "workStaffId");
            return (Criteria) this;
        }

        public Criteria andWorkStaffIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_staff_id not between", value1, value2, "workStaffId");
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

        public Criteria andWorkLeadIdIsNull() {
            addCriterion("work_lead_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdIsNotNull() {
            addCriterion("work_lead_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdEqualTo(Integer value) {
            addCriterion("work_lead_id =", value, "workLeadId");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdNotEqualTo(Integer value) {
            addCriterion("work_lead_id <>", value, "workLeadId");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdGreaterThan(Integer value) {
            addCriterion("work_lead_id >", value, "workLeadId");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_lead_id >=", value, "workLeadId");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdLessThan(Integer value) {
            addCriterion("work_lead_id <", value, "workLeadId");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_lead_id <=", value, "workLeadId");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdIn(List<Integer> values) {
            addCriterion("work_lead_id in", values, "workLeadId");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdNotIn(List<Integer> values) {
            addCriterion("work_lead_id not in", values, "workLeadId");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdBetween(Integer value1, Integer value2) {
            addCriterion("work_lead_id between", value1, value2, "workLeadId");
            return (Criteria) this;
        }

        public Criteria andWorkLeadIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_lead_id not between", value1, value2, "workLeadId");
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

        public Criteria andCreateTiemIsNull() {
            addCriterion("create_tiem is null");
            return (Criteria) this;
        }

        public Criteria andCreateTiemIsNotNull() {
            addCriterion("create_tiem is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTiemEqualTo(Date value) {
            addCriterion("create_tiem =", value, "createTiem");
            return (Criteria) this;
        }

        public Criteria andCreateTiemNotEqualTo(Date value) {
            addCriterion("create_tiem <>", value, "createTiem");
            return (Criteria) this;
        }

        public Criteria andCreateTiemGreaterThan(Date value) {
            addCriterion("create_tiem >", value, "createTiem");
            return (Criteria) this;
        }

        public Criteria andCreateTiemGreaterThanOrEqualTo(Date value) {
            addCriterion("create_tiem >=", value, "createTiem");
            return (Criteria) this;
        }

        public Criteria andCreateTiemLessThan(Date value) {
            addCriterion("create_tiem <", value, "createTiem");
            return (Criteria) this;
        }

        public Criteria andCreateTiemLessThanOrEqualTo(Date value) {
            addCriterion("create_tiem <=", value, "createTiem");
            return (Criteria) this;
        }

        public Criteria andCreateTiemIn(List<Date> values) {
            addCriterion("create_tiem in", values, "createTiem");
            return (Criteria) this;
        }

        public Criteria andCreateTiemNotIn(List<Date> values) {
            addCriterion("create_tiem not in", values, "createTiem");
            return (Criteria) this;
        }

        public Criteria andCreateTiemBetween(Date value1, Date value2) {
            addCriterion("create_tiem between", value1, value2, "createTiem");
            return (Criteria) this;
        }

        public Criteria andCreateTiemNotBetween(Date value1, Date value2) {
            addCriterion("create_tiem not between", value1, value2, "createTiem");
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

        public Criteria andPlanMoneyIsNull() {
            addCriterion("plan_money is null");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyIsNotNull() {
            addCriterion("plan_money is not null");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyEqualTo(Float value) {
            addCriterion("plan_money =", value, "planMoney");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyNotEqualTo(Float value) {
            addCriterion("plan_money <>", value, "planMoney");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyGreaterThan(Float value) {
            addCriterion("plan_money >", value, "planMoney");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("plan_money >=", value, "planMoney");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyLessThan(Float value) {
            addCriterion("plan_money <", value, "planMoney");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyLessThanOrEqualTo(Float value) {
            addCriterion("plan_money <=", value, "planMoney");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyIn(List<Float> values) {
            addCriterion("plan_money in", values, "planMoney");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyNotIn(List<Float> values) {
            addCriterion("plan_money not in", values, "planMoney");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyBetween(Float value1, Float value2) {
            addCriterion("plan_money between", value1, value2, "planMoney");
            return (Criteria) this;
        }

        public Criteria andPlanMoneyNotBetween(Float value1, Float value2) {
            addCriterion("plan_money not between", value1, value2, "planMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIsNull() {
            addCriterion("real_money is null");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIsNotNull() {
            addCriterion("real_money is not null");
            return (Criteria) this;
        }

        public Criteria andRealMoneyEqualTo(Float value) {
            addCriterion("real_money =", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotEqualTo(Float value) {
            addCriterion("real_money <>", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyGreaterThan(Float value) {
            addCriterion("real_money >", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("real_money >=", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyLessThan(Float value) {
            addCriterion("real_money <", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyLessThanOrEqualTo(Float value) {
            addCriterion("real_money <=", value, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyIn(List<Float> values) {
            addCriterion("real_money in", values, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotIn(List<Float> values) {
            addCriterion("real_money not in", values, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyBetween(Float value1, Float value2) {
            addCriterion("real_money between", value1, value2, "realMoney");
            return (Criteria) this;
        }

        public Criteria andRealMoneyNotBetween(Float value1, Float value2) {
            addCriterion("real_money not between", value1, value2, "realMoney");
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

        public Criteria andReportNoteIsNull() {
            addCriterion("report_note is null");
            return (Criteria) this;
        }

        public Criteria andReportNoteIsNotNull() {
            addCriterion("report_note is not null");
            return (Criteria) this;
        }

        public Criteria andReportNoteEqualTo(String value) {
            addCriterion("report_note =", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteNotEqualTo(String value) {
            addCriterion("report_note <>", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteGreaterThan(String value) {
            addCriterion("report_note >", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteGreaterThanOrEqualTo(String value) {
            addCriterion("report_note >=", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteLessThan(String value) {
            addCriterion("report_note <", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteLessThanOrEqualTo(String value) {
            addCriterion("report_note <=", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteLike(String value) {
            addCriterion("report_note like", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteNotLike(String value) {
            addCriterion("report_note not like", value, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteIn(List<String> values) {
            addCriterion("report_note in", values, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteNotIn(List<String> values) {
            addCriterion("report_note not in", values, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteBetween(String value1, String value2) {
            addCriterion("report_note between", value1, value2, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReportNoteNotBetween(String value1, String value2) {
            addCriterion("report_note not between", value1, value2, "reportNote");
            return (Criteria) this;
        }

        public Criteria andReviewIsNull() {
            addCriterion("review is null");
            return (Criteria) this;
        }

        public Criteria andReviewIsNotNull() {
            addCriterion("review is not null");
            return (Criteria) this;
        }

        public Criteria andReviewEqualTo(String value) {
            addCriterion("review =", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotEqualTo(String value) {
            addCriterion("review <>", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThan(String value) {
            addCriterion("review >", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewGreaterThanOrEqualTo(String value) {
            addCriterion("review >=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThan(String value) {
            addCriterion("review <", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLessThanOrEqualTo(String value) {
            addCriterion("review <=", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewLike(String value) {
            addCriterion("review like", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotLike(String value) {
            addCriterion("review not like", value, "review");
            return (Criteria) this;
        }

        public Criteria andReviewIn(List<String> values) {
            addCriterion("review in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotIn(List<String> values) {
            addCriterion("review not in", values, "review");
            return (Criteria) this;
        }

        public Criteria andReviewBetween(String value1, String value2) {
            addCriterion("review between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andReviewNotBetween(String value1, String value2) {
            addCriterion("review not between", value1, value2, "review");
            return (Criteria) this;
        }

        public Criteria andSmallTaskIsNull() {
            addCriterion("small_task is null");
            return (Criteria) this;
        }

        public Criteria andSmallTaskIsNotNull() {
            addCriterion("small_task is not null");
            return (Criteria) this;
        }

        public Criteria andSmallTaskEqualTo(String value) {
            addCriterion("small_task =", value, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskNotEqualTo(String value) {
            addCriterion("small_task <>", value, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskGreaterThan(String value) {
            addCriterion("small_task >", value, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskGreaterThanOrEqualTo(String value) {
            addCriterion("small_task >=", value, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskLessThan(String value) {
            addCriterion("small_task <", value, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskLessThanOrEqualTo(String value) {
            addCriterion("small_task <=", value, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskLike(String value) {
            addCriterion("small_task like", value, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskNotLike(String value) {
            addCriterion("small_task not like", value, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskIn(List<String> values) {
            addCriterion("small_task in", values, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskNotIn(List<String> values) {
            addCriterion("small_task not in", values, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskBetween(String value1, String value2) {
            addCriterion("small_task between", value1, value2, "smallTask");
            return (Criteria) this;
        }

        public Criteria andSmallTaskNotBetween(String value1, String value2) {
            addCriterion("small_task not between", value1, value2, "smallTask");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNull() {
            addCriterion("dep_id is null");
            return (Criteria) this;
        }

        public Criteria andDepIdIsNotNull() {
            addCriterion("dep_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepIdEqualTo(Integer value) {
            addCriterion("dep_id =", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotEqualTo(Integer value) {
            addCriterion("dep_id <>", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThan(Integer value) {
            addCriterion("dep_id >", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dep_id >=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThan(Integer value) {
            addCriterion("dep_id <", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdLessThanOrEqualTo(Integer value) {
            addCriterion("dep_id <=", value, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdIn(List<Integer> values) {
            addCriterion("dep_id in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotIn(List<Integer> values) {
            addCriterion("dep_id not in", values, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdBetween(Integer value1, Integer value2) {
            addCriterion("dep_id between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andDepIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dep_id not between", value1, value2, "depId");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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
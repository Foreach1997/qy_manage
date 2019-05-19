package com.qy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PlanBookExample() {
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

        public Criteria andPlanBookIdIsNull() {
            addCriterion("plan_book_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdIsNotNull() {
            addCriterion("plan_book_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdEqualTo(Integer value) {
            addCriterion("plan_book_id =", value, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdNotEqualTo(Integer value) {
            addCriterion("plan_book_id <>", value, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdGreaterThan(Integer value) {
            addCriterion("plan_book_id >", value, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_book_id >=", value, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdLessThan(Integer value) {
            addCriterion("plan_book_id <", value, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdLessThanOrEqualTo(Integer value) {
            addCriterion("plan_book_id <=", value, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdIn(List<Integer> values) {
            addCriterion("plan_book_id in", values, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdNotIn(List<Integer> values) {
            addCriterion("plan_book_id not in", values, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdBetween(Integer value1, Integer value2) {
            addCriterion("plan_book_id between", value1, value2, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanBookIdNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_book_id not between", value1, value2, "planBookId");
            return (Criteria) this;
        }

        public Criteria andPlanTargetIsNull() {
            addCriterion("plan_target is null");
            return (Criteria) this;
        }

        public Criteria andPlanTargetIsNotNull() {
            addCriterion("plan_target is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTargetEqualTo(String value) {
            addCriterion("plan_target =", value, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetNotEqualTo(String value) {
            addCriterion("plan_target <>", value, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetGreaterThan(String value) {
            addCriterion("plan_target >", value, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetGreaterThanOrEqualTo(String value) {
            addCriterion("plan_target >=", value, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetLessThan(String value) {
            addCriterion("plan_target <", value, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetLessThanOrEqualTo(String value) {
            addCriterion("plan_target <=", value, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetLike(String value) {
            addCriterion("plan_target like", value, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetNotLike(String value) {
            addCriterion("plan_target not like", value, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetIn(List<String> values) {
            addCriterion("plan_target in", values, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetNotIn(List<String> values) {
            addCriterion("plan_target not in", values, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetBetween(String value1, String value2) {
            addCriterion("plan_target between", value1, value2, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanTargetNotBetween(String value1, String value2) {
            addCriterion("plan_target not between", value1, value2, "planTarget");
            return (Criteria) this;
        }

        public Criteria andPlanOrgIsNull() {
            addCriterion("plan_org is null");
            return (Criteria) this;
        }

        public Criteria andPlanOrgIsNotNull() {
            addCriterion("plan_org is not null");
            return (Criteria) this;
        }

        public Criteria andPlanOrgEqualTo(String value) {
            addCriterion("plan_org =", value, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgNotEqualTo(String value) {
            addCriterion("plan_org <>", value, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgGreaterThan(String value) {
            addCriterion("plan_org >", value, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgGreaterThanOrEqualTo(String value) {
            addCriterion("plan_org >=", value, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgLessThan(String value) {
            addCriterion("plan_org <", value, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgLessThanOrEqualTo(String value) {
            addCriterion("plan_org <=", value, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgLike(String value) {
            addCriterion("plan_org like", value, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgNotLike(String value) {
            addCriterion("plan_org not like", value, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgIn(List<String> values) {
            addCriterion("plan_org in", values, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgNotIn(List<String> values) {
            addCriterion("plan_org not in", values, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgBetween(String value1, String value2) {
            addCriterion("plan_org between", value1, value2, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanOrgNotBetween(String value1, String value2) {
            addCriterion("plan_org not between", value1, value2, "planOrg");
            return (Criteria) this;
        }

        public Criteria andPlanWorkIsNull() {
            addCriterion("plan_work is null");
            return (Criteria) this;
        }

        public Criteria andPlanWorkIsNotNull() {
            addCriterion("plan_work is not null");
            return (Criteria) this;
        }

        public Criteria andPlanWorkEqualTo(String value) {
            addCriterion("plan_work =", value, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkNotEqualTo(String value) {
            addCriterion("plan_work <>", value, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkGreaterThan(String value) {
            addCriterion("plan_work >", value, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkGreaterThanOrEqualTo(String value) {
            addCriterion("plan_work >=", value, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkLessThan(String value) {
            addCriterion("plan_work <", value, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkLessThanOrEqualTo(String value) {
            addCriterion("plan_work <=", value, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkLike(String value) {
            addCriterion("plan_work like", value, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkNotLike(String value) {
            addCriterion("plan_work not like", value, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkIn(List<String> values) {
            addCriterion("plan_work in", values, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkNotIn(List<String> values) {
            addCriterion("plan_work not in", values, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkBetween(String value1, String value2) {
            addCriterion("plan_work between", value1, value2, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanWorkNotBetween(String value1, String value2) {
            addCriterion("plan_work not between", value1, value2, "planWork");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostIsNull() {
            addCriterion("plan_milepost is null");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostIsNotNull() {
            addCriterion("plan_milepost is not null");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostEqualTo(String value) {
            addCriterion("plan_milepost =", value, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostNotEqualTo(String value) {
            addCriterion("plan_milepost <>", value, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostGreaterThan(String value) {
            addCriterion("plan_milepost >", value, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostGreaterThanOrEqualTo(String value) {
            addCriterion("plan_milepost >=", value, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostLessThan(String value) {
            addCriterion("plan_milepost <", value, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostLessThanOrEqualTo(String value) {
            addCriterion("plan_milepost <=", value, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostLike(String value) {
            addCriterion("plan_milepost like", value, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostNotLike(String value) {
            addCriterion("plan_milepost not like", value, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostIn(List<String> values) {
            addCriterion("plan_milepost in", values, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostNotIn(List<String> values) {
            addCriterion("plan_milepost not in", values, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostBetween(String value1, String value2) {
            addCriterion("plan_milepost between", value1, value2, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andPlanMilepostNotBetween(String value1, String value2) {
            addCriterion("plan_milepost not between", value1, value2, "planMilepost");
            return (Criteria) this;
        }

        public Criteria andGanttChartIsNull() {
            addCriterion("gantt_chart is null");
            return (Criteria) this;
        }

        public Criteria andGanttChartIsNotNull() {
            addCriterion("gantt_chart is not null");
            return (Criteria) this;
        }

        public Criteria andGanttChartEqualTo(String value) {
            addCriterion("gantt_chart =", value, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartNotEqualTo(String value) {
            addCriterion("gantt_chart <>", value, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartGreaterThan(String value) {
            addCriterion("gantt_chart >", value, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartGreaterThanOrEqualTo(String value) {
            addCriterion("gantt_chart >=", value, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartLessThan(String value) {
            addCriterion("gantt_chart <", value, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartLessThanOrEqualTo(String value) {
            addCriterion("gantt_chart <=", value, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartLike(String value) {
            addCriterion("gantt_chart like", value, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartNotLike(String value) {
            addCriterion("gantt_chart not like", value, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartIn(List<String> values) {
            addCriterion("gantt_chart in", values, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartNotIn(List<String> values) {
            addCriterion("gantt_chart not in", values, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartBetween(String value1, String value2) {
            addCriterion("gantt_chart between", value1, value2, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andGanttChartNotBetween(String value1, String value2) {
            addCriterion("gantt_chart not between", value1, value2, "ganttChart");
            return (Criteria) this;
        }

        public Criteria andPlanRelationIsNull() {
            addCriterion("plan_relation is null");
            return (Criteria) this;
        }

        public Criteria andPlanRelationIsNotNull() {
            addCriterion("plan_relation is not null");
            return (Criteria) this;
        }

        public Criteria andPlanRelationEqualTo(String value) {
            addCriterion("plan_relation =", value, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationNotEqualTo(String value) {
            addCriterion("plan_relation <>", value, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationGreaterThan(String value) {
            addCriterion("plan_relation >", value, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationGreaterThanOrEqualTo(String value) {
            addCriterion("plan_relation >=", value, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationLessThan(String value) {
            addCriterion("plan_relation <", value, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationLessThanOrEqualTo(String value) {
            addCriterion("plan_relation <=", value, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationLike(String value) {
            addCriterion("plan_relation like", value, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationNotLike(String value) {
            addCriterion("plan_relation not like", value, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationIn(List<String> values) {
            addCriterion("plan_relation in", values, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationNotIn(List<String> values) {
            addCriterion("plan_relation not in", values, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationBetween(String value1, String value2) {
            addCriterion("plan_relation between", value1, value2, "planRelation");
            return (Criteria) this;
        }

        public Criteria andPlanRelationNotBetween(String value1, String value2) {
            addCriterion("plan_relation not between", value1, value2, "planRelation");
            return (Criteria) this;
        }

        public Criteria andRiskIsNull() {
            addCriterion("risk is null");
            return (Criteria) this;
        }

        public Criteria andRiskIsNotNull() {
            addCriterion("risk is not null");
            return (Criteria) this;
        }

        public Criteria andRiskEqualTo(String value) {
            addCriterion("risk =", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotEqualTo(String value) {
            addCriterion("risk <>", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThan(String value) {
            addCriterion("risk >", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskGreaterThanOrEqualTo(String value) {
            addCriterion("risk >=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThan(String value) {
            addCriterion("risk <", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLessThanOrEqualTo(String value) {
            addCriterion("risk <=", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskLike(String value) {
            addCriterion("risk like", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotLike(String value) {
            addCriterion("risk not like", value, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskIn(List<String> values) {
            addCriterion("risk in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotIn(List<String> values) {
            addCriterion("risk not in", values, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskBetween(String value1, String value2) {
            addCriterion("risk between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andRiskNotBetween(String value1, String value2) {
            addCriterion("risk not between", value1, value2, "risk");
            return (Criteria) this;
        }

        public Criteria andMeasuresIsNull() {
            addCriterion("measures is null");
            return (Criteria) this;
        }

        public Criteria andMeasuresIsNotNull() {
            addCriterion("measures is not null");
            return (Criteria) this;
        }

        public Criteria andMeasuresEqualTo(String value) {
            addCriterion("measures =", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotEqualTo(String value) {
            addCriterion("measures <>", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresGreaterThan(String value) {
            addCriterion("measures >", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresGreaterThanOrEqualTo(String value) {
            addCriterion("measures >=", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresLessThan(String value) {
            addCriterion("measures <", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresLessThanOrEqualTo(String value) {
            addCriterion("measures <=", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresLike(String value) {
            addCriterion("measures like", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotLike(String value) {
            addCriterion("measures not like", value, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresIn(List<String> values) {
            addCriterion("measures in", values, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotIn(List<String> values) {
            addCriterion("measures not in", values, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresBetween(String value1, String value2) {
            addCriterion("measures between", value1, value2, "measures");
            return (Criteria) this;
        }

        public Criteria andMeasuresNotBetween(String value1, String value2) {
            addCriterion("measures not between", value1, value2, "measures");
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

        public Criteria andReportCodeIsNull() {
            addCriterion("report_code is null");
            return (Criteria) this;
        }

        public Criteria andReportCodeIsNotNull() {
            addCriterion("report_code is not null");
            return (Criteria) this;
        }

        public Criteria andReportCodeEqualTo(String value) {
            addCriterion("report_code =", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotEqualTo(String value) {
            addCriterion("report_code <>", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeGreaterThan(String value) {
            addCriterion("report_code >", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeGreaterThanOrEqualTo(String value) {
            addCriterion("report_code >=", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeLessThan(String value) {
            addCriterion("report_code <", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeLessThanOrEqualTo(String value) {
            addCriterion("report_code <=", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeLike(String value) {
            addCriterion("report_code like", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotLike(String value) {
            addCriterion("report_code not like", value, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeIn(List<String> values) {
            addCriterion("report_code in", values, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotIn(List<String> values) {
            addCriterion("report_code not in", values, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeBetween(String value1, String value2) {
            addCriterion("report_code between", value1, value2, "reportCode");
            return (Criteria) this;
        }

        public Criteria andReportCodeNotBetween(String value1, String value2) {
            addCriterion("report_code not between", value1, value2, "reportCode");
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

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
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
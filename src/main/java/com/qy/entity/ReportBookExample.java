package com.qy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportBookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ReportBookExample() {
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

        public Criteria andReportBookFileIsNull() {
            addCriterion("report_book_file is null");
            return (Criteria) this;
        }

        public Criteria andReportBookFileIsNotNull() {
            addCriterion("report_book_file is not null");
            return (Criteria) this;
        }

        public Criteria andReportBookFileEqualTo(String value) {
            addCriterion("report_book_file =", value, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileNotEqualTo(String value) {
            addCriterion("report_book_file <>", value, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileGreaterThan(String value) {
            addCriterion("report_book_file >", value, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileGreaterThanOrEqualTo(String value) {
            addCriterion("report_book_file >=", value, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileLessThan(String value) {
            addCriterion("report_book_file <", value, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileLessThanOrEqualTo(String value) {
            addCriterion("report_book_file <=", value, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileLike(String value) {
            addCriterion("report_book_file like", value, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileNotLike(String value) {
            addCriterion("report_book_file not like", value, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileIn(List<String> values) {
            addCriterion("report_book_file in", values, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileNotIn(List<String> values) {
            addCriterion("report_book_file not in", values, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileBetween(String value1, String value2) {
            addCriterion("report_book_file between", value1, value2, "reportBookFile");
            return (Criteria) this;
        }

        public Criteria andReportBookFileNotBetween(String value1, String value2) {
            addCriterion("report_book_file not between", value1, value2, "reportBookFile");
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

        public Criteria andProSourceIsNull() {
            addCriterion("pro_source is null");
            return (Criteria) this;
        }

        public Criteria andProSourceIsNotNull() {
            addCriterion("pro_source is not null");
            return (Criteria) this;
        }

        public Criteria andProSourceEqualTo(String value) {
            addCriterion("pro_source =", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceNotEqualTo(String value) {
            addCriterion("pro_source <>", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceGreaterThan(String value) {
            addCriterion("pro_source >", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceGreaterThanOrEqualTo(String value) {
            addCriterion("pro_source >=", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceLessThan(String value) {
            addCriterion("pro_source <", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceLessThanOrEqualTo(String value) {
            addCriterion("pro_source <=", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceLike(String value) {
            addCriterion("pro_source like", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceNotLike(String value) {
            addCriterion("pro_source not like", value, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceIn(List<String> values) {
            addCriterion("pro_source in", values, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceNotIn(List<String> values) {
            addCriterion("pro_source not in", values, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceBetween(String value1, String value2) {
            addCriterion("pro_source between", value1, value2, "proSource");
            return (Criteria) this;
        }

        public Criteria andProSourceNotBetween(String value1, String value2) {
            addCriterion("pro_source not between", value1, value2, "proSource");
            return (Criteria) this;
        }

        public Criteria andProBackgroundIsNull() {
            addCriterion("pro_background is null");
            return (Criteria) this;
        }

        public Criteria andProBackgroundIsNotNull() {
            addCriterion("pro_background is not null");
            return (Criteria) this;
        }

        public Criteria andProBackgroundEqualTo(String value) {
            addCriterion("pro_background =", value, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundNotEqualTo(String value) {
            addCriterion("pro_background <>", value, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundGreaterThan(String value) {
            addCriterion("pro_background >", value, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundGreaterThanOrEqualTo(String value) {
            addCriterion("pro_background >=", value, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundLessThan(String value) {
            addCriterion("pro_background <", value, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundLessThanOrEqualTo(String value) {
            addCriterion("pro_background <=", value, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundLike(String value) {
            addCriterion("pro_background like", value, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundNotLike(String value) {
            addCriterion("pro_background not like", value, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundIn(List<String> values) {
            addCriterion("pro_background in", values, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundNotIn(List<String> values) {
            addCriterion("pro_background not in", values, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundBetween(String value1, String value2) {
            addCriterion("pro_background between", value1, value2, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProBackgroundNotBetween(String value1, String value2) {
            addCriterion("pro_background not between", value1, value2, "proBackground");
            return (Criteria) this;
        }

        public Criteria andProDescribeIsNull() {
            addCriterion("pro_describe is null");
            return (Criteria) this;
        }

        public Criteria andProDescribeIsNotNull() {
            addCriterion("pro_describe is not null");
            return (Criteria) this;
        }

        public Criteria andProDescribeEqualTo(String value) {
            addCriterion("pro_describe =", value, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeNotEqualTo(String value) {
            addCriterion("pro_describe <>", value, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeGreaterThan(String value) {
            addCriterion("pro_describe >", value, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("pro_describe >=", value, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeLessThan(String value) {
            addCriterion("pro_describe <", value, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeLessThanOrEqualTo(String value) {
            addCriterion("pro_describe <=", value, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeLike(String value) {
            addCriterion("pro_describe like", value, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeNotLike(String value) {
            addCriterion("pro_describe not like", value, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeIn(List<String> values) {
            addCriterion("pro_describe in", values, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeNotIn(List<String> values) {
            addCriterion("pro_describe not in", values, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeBetween(String value1, String value2) {
            addCriterion("pro_describe between", value1, value2, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProDescribeNotBetween(String value1, String value2) {
            addCriterion("pro_describe not between", value1, value2, "proDescribe");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityIsNull() {
            addCriterion("pro_feasibility is null");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityIsNotNull() {
            addCriterion("pro_feasibility is not null");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityEqualTo(String value) {
            addCriterion("pro_feasibility =", value, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityNotEqualTo(String value) {
            addCriterion("pro_feasibility <>", value, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityGreaterThan(String value) {
            addCriterion("pro_feasibility >", value, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityGreaterThanOrEqualTo(String value) {
            addCriterion("pro_feasibility >=", value, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityLessThan(String value) {
            addCriterion("pro_feasibility <", value, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityLessThanOrEqualTo(String value) {
            addCriterion("pro_feasibility <=", value, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityLike(String value) {
            addCriterion("pro_feasibility like", value, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityNotLike(String value) {
            addCriterion("pro_feasibility not like", value, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityIn(List<String> values) {
            addCriterion("pro_feasibility in", values, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityNotIn(List<String> values) {
            addCriterion("pro_feasibility not in", values, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityBetween(String value1, String value2) {
            addCriterion("pro_feasibility between", value1, value2, "proFeasibility");
            return (Criteria) this;
        }

        public Criteria andProFeasibilityNotBetween(String value1, String value2) {
            addCriterion("pro_feasibility not between", value1, value2, "proFeasibility");
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

        public Criteria andProBenefitIsNull() {
            addCriterion("pro_benefit is null");
            return (Criteria) this;
        }

        public Criteria andProBenefitIsNotNull() {
            addCriterion("pro_benefit is not null");
            return (Criteria) this;
        }

        public Criteria andProBenefitEqualTo(String value) {
            addCriterion("pro_benefit =", value, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitNotEqualTo(String value) {
            addCriterion("pro_benefit <>", value, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitGreaterThan(String value) {
            addCriterion("pro_benefit >", value, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitGreaterThanOrEqualTo(String value) {
            addCriterion("pro_benefit >=", value, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitLessThan(String value) {
            addCriterion("pro_benefit <", value, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitLessThanOrEqualTo(String value) {
            addCriterion("pro_benefit <=", value, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitLike(String value) {
            addCriterion("pro_benefit like", value, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitNotLike(String value) {
            addCriterion("pro_benefit not like", value, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitIn(List<String> values) {
            addCriterion("pro_benefit in", values, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitNotIn(List<String> values) {
            addCriterion("pro_benefit not in", values, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitBetween(String value1, String value2) {
            addCriterion("pro_benefit between", value1, value2, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProBenefitNotBetween(String value1, String value2) {
            addCriterion("pro_benefit not between", value1, value2, "proBenefit");
            return (Criteria) this;
        }

        public Criteria andProRiskIsNull() {
            addCriterion("pro_risk is null");
            return (Criteria) this;
        }

        public Criteria andProRiskIsNotNull() {
            addCriterion("pro_risk is not null");
            return (Criteria) this;
        }

        public Criteria andProRiskEqualTo(String value) {
            addCriterion("pro_risk =", value, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskNotEqualTo(String value) {
            addCriterion("pro_risk <>", value, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskGreaterThan(String value) {
            addCriterion("pro_risk >", value, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskGreaterThanOrEqualTo(String value) {
            addCriterion("pro_risk >=", value, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskLessThan(String value) {
            addCriterion("pro_risk <", value, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskLessThanOrEqualTo(String value) {
            addCriterion("pro_risk <=", value, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskLike(String value) {
            addCriterion("pro_risk like", value, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskNotLike(String value) {
            addCriterion("pro_risk not like", value, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskIn(List<String> values) {
            addCriterion("pro_risk in", values, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskNotIn(List<String> values) {
            addCriterion("pro_risk not in", values, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskBetween(String value1, String value2) {
            addCriterion("pro_risk between", value1, value2, "proRisk");
            return (Criteria) this;
        }

        public Criteria andProRiskNotBetween(String value1, String value2) {
            addCriterion("pro_risk not between", value1, value2, "proRisk");
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
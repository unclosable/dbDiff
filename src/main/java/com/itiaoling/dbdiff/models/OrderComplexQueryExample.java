package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderComplexQueryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderComplexQueryExample() {
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

        public Criteria andWaybillnoIsNull() {
            addCriterion("WAYBILLNO is null");
            return (Criteria) this;
        }

        public Criteria andWaybillnoIsNotNull() {
            addCriterion("WAYBILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillnoEqualTo(BigDecimal value) {
            addCriterion("WAYBILLNO =", value, "waybillno");
            return (Criteria) this;
        }

        public Criteria andWaybillnoNotEqualTo(BigDecimal value) {
            addCriterion("WAYBILLNO <>", value, "waybillno");
            return (Criteria) this;
        }

        public Criteria andWaybillnoGreaterThan(BigDecimal value) {
            addCriterion("WAYBILLNO >", value, "waybillno");
            return (Criteria) this;
        }

        public Criteria andWaybillnoGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAYBILLNO >=", value, "waybillno");
            return (Criteria) this;
        }

        public Criteria andWaybillnoLessThan(BigDecimal value) {
            addCriterion("WAYBILLNO <", value, "waybillno");
            return (Criteria) this;
        }

        public Criteria andWaybillnoLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAYBILLNO <=", value, "waybillno");
            return (Criteria) this;
        }

        public Criteria andWaybillnoIn(List<BigDecimal> values) {
            addCriterion("WAYBILLNO in", values, "waybillno");
            return (Criteria) this;
        }

        public Criteria andWaybillnoNotIn(List<BigDecimal> values) {
            addCriterion("WAYBILLNO not in", values, "waybillno");
            return (Criteria) this;
        }

        public Criteria andWaybillnoBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAYBILLNO between", value1, value2, "waybillno");
            return (Criteria) this;
        }

        public Criteria andWaybillnoNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAYBILLNO not between", value1, value2, "waybillno");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeIsNull() {
            addCriterion("DISTRIBUTIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeIsNotNull() {
            addCriterion("DISTRIBUTIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeEqualTo(String value) {
            addCriterion("DISTRIBUTIONCODE =", value, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeNotEqualTo(String value) {
            addCriterion("DISTRIBUTIONCODE <>", value, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeGreaterThan(String value) {
            addCriterion("DISTRIBUTIONCODE >", value, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("DISTRIBUTIONCODE >=", value, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeLessThan(String value) {
            addCriterion("DISTRIBUTIONCODE <", value, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeLessThanOrEqualTo(String value) {
            addCriterion("DISTRIBUTIONCODE <=", value, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeLike(String value) {
            addCriterion("DISTRIBUTIONCODE like", value, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeNotLike(String value) {
            addCriterion("DISTRIBUTIONCODE not like", value, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeIn(List<String> values) {
            addCriterion("DISTRIBUTIONCODE in", values, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeNotIn(List<String> values) {
            addCriterion("DISTRIBUTIONCODE not in", values, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeBetween(String value1, String value2) {
            addCriterion("DISTRIBUTIONCODE between", value1, value2, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andDistributioncodeNotBetween(String value1, String value2) {
            addCriterion("DISTRIBUTIONCODE not between", value1, value2, "distributioncode");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andFormcodeIsNull() {
            addCriterion("FORMCODE is null");
            return (Criteria) this;
        }

        public Criteria andFormcodeIsNotNull() {
            addCriterion("FORMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFormcodeEqualTo(String value) {
            addCriterion("FORMCODE =", value, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeNotEqualTo(String value) {
            addCriterion("FORMCODE <>", value, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeGreaterThan(String value) {
            addCriterion("FORMCODE >", value, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FORMCODE >=", value, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeLessThan(String value) {
            addCriterion("FORMCODE <", value, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeLessThanOrEqualTo(String value) {
            addCriterion("FORMCODE <=", value, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeLike(String value) {
            addCriterion("FORMCODE like", value, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeNotLike(String value) {
            addCriterion("FORMCODE not like", value, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeIn(List<String> values) {
            addCriterion("FORMCODE in", values, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeNotIn(List<String> values) {
            addCriterion("FORMCODE not in", values, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeBetween(String value1, String value2) {
            addCriterion("FORMCODE between", value1, value2, "formcode");
            return (Criteria) this;
        }

        public Criteria andFormcodeNotBetween(String value1, String value2) {
            addCriterion("FORMCODE not between", value1, value2, "formcode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeIsNull() {
            addCriterion("DELIVERCODE is null");
            return (Criteria) this;
        }

        public Criteria andDelivercodeIsNotNull() {
            addCriterion("DELIVERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andDelivercodeEqualTo(String value) {
            addCriterion("DELIVERCODE =", value, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeNotEqualTo(String value) {
            addCriterion("DELIVERCODE <>", value, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeGreaterThan(String value) {
            addCriterion("DELIVERCODE >", value, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERCODE >=", value, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeLessThan(String value) {
            addCriterion("DELIVERCODE <", value, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeLessThanOrEqualTo(String value) {
            addCriterion("DELIVERCODE <=", value, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeLike(String value) {
            addCriterion("DELIVERCODE like", value, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeNotLike(String value) {
            addCriterion("DELIVERCODE not like", value, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeIn(List<String> values) {
            addCriterion("DELIVERCODE in", values, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeNotIn(List<String> values) {
            addCriterion("DELIVERCODE not in", values, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeBetween(String value1, String value2) {
            addCriterion("DELIVERCODE between", value1, value2, "delivercode");
            return (Criteria) this;
        }

        public Criteria andDelivercodeNotBetween(String value1, String value2) {
            addCriterion("DELIVERCODE not between", value1, value2, "delivercode");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridIsNull() {
            addCriterion("SORTINGCENTERID is null");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridIsNotNull() {
            addCriterion("SORTINGCENTERID is not null");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridEqualTo(BigDecimal value) {
            addCriterion("SORTINGCENTERID =", value, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridNotEqualTo(BigDecimal value) {
            addCriterion("SORTINGCENTERID <>", value, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridGreaterThan(BigDecimal value) {
            addCriterion("SORTINGCENTERID >", value, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SORTINGCENTERID >=", value, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridLessThan(BigDecimal value) {
            addCriterion("SORTINGCENTERID <", value, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SORTINGCENTERID <=", value, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridIn(List<BigDecimal> values) {
            addCriterion("SORTINGCENTERID in", values, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridNotIn(List<BigDecimal> values) {
            addCriterion("SORTINGCENTERID not in", values, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SORTINGCENTERID between", value1, value2, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andSortingcenteridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SORTINGCENTERID not between", value1, value2, "sortingcenterid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidIsNull() {
            addCriterion("CURDEPTID is null");
            return (Criteria) this;
        }

        public Criteria andCurdeptidIsNotNull() {
            addCriterion("CURDEPTID is not null");
            return (Criteria) this;
        }

        public Criteria andCurdeptidEqualTo(BigDecimal value) {
            addCriterion("CURDEPTID =", value, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidNotEqualTo(BigDecimal value) {
            addCriterion("CURDEPTID <>", value, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidGreaterThan(BigDecimal value) {
            addCriterion("CURDEPTID >", value, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURDEPTID >=", value, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidLessThan(BigDecimal value) {
            addCriterion("CURDEPTID <", value, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURDEPTID <=", value, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidIn(List<BigDecimal> values) {
            addCriterion("CURDEPTID in", values, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidNotIn(List<BigDecimal> values) {
            addCriterion("CURDEPTID not in", values, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURDEPTID between", value1, value2, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andCurdeptidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURDEPTID not between", value1, value2, "curdeptid");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(BigDecimal value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(BigDecimal value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(BigDecimal value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(BigDecimal value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<BigDecimal> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<BigDecimal> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andBackstatusIsNull() {
            addCriterion("BACKSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBackstatusIsNotNull() {
            addCriterion("BACKSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBackstatusEqualTo(BigDecimal value) {
            addCriterion("BACKSTATUS =", value, "backstatus");
            return (Criteria) this;
        }

        public Criteria andBackstatusNotEqualTo(BigDecimal value) {
            addCriterion("BACKSTATUS <>", value, "backstatus");
            return (Criteria) this;
        }

        public Criteria andBackstatusGreaterThan(BigDecimal value) {
            addCriterion("BACKSTATUS >", value, "backstatus");
            return (Criteria) this;
        }

        public Criteria andBackstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKSTATUS >=", value, "backstatus");
            return (Criteria) this;
        }

        public Criteria andBackstatusLessThan(BigDecimal value) {
            addCriterion("BACKSTATUS <", value, "backstatus");
            return (Criteria) this;
        }

        public Criteria andBackstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKSTATUS <=", value, "backstatus");
            return (Criteria) this;
        }

        public Criteria andBackstatusIn(List<BigDecimal> values) {
            addCriterion("BACKSTATUS in", values, "backstatus");
            return (Criteria) this;
        }

        public Criteria andBackstatusNotIn(List<BigDecimal> values) {
            addCriterion("BACKSTATUS not in", values, "backstatus");
            return (Criteria) this;
        }

        public Criteria andBackstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKSTATUS between", value1, value2, "backstatus");
            return (Criteria) this;
        }

        public Criteria andBackstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKSTATUS not between", value1, value2, "backstatus");
            return (Criteria) this;
        }

        public Criteria andReplacetypeIsNull() {
            addCriterion("REPLACETYPE is null");
            return (Criteria) this;
        }

        public Criteria andReplacetypeIsNotNull() {
            addCriterion("REPLACETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReplacetypeEqualTo(String value) {
            addCriterion("REPLACETYPE =", value, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeNotEqualTo(String value) {
            addCriterion("REPLACETYPE <>", value, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeGreaterThan(String value) {
            addCriterion("REPLACETYPE >", value, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeGreaterThanOrEqualTo(String value) {
            addCriterion("REPLACETYPE >=", value, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeLessThan(String value) {
            addCriterion("REPLACETYPE <", value, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeLessThanOrEqualTo(String value) {
            addCriterion("REPLACETYPE <=", value, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeLike(String value) {
            addCriterion("REPLACETYPE like", value, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeNotLike(String value) {
            addCriterion("REPLACETYPE not like", value, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeIn(List<String> values) {
            addCriterion("REPLACETYPE in", values, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeNotIn(List<String> values) {
            addCriterion("REPLACETYPE not in", values, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeBetween(String value1, String value2) {
            addCriterion("REPLACETYPE between", value1, value2, "replacetype");
            return (Criteria) this;
        }

        public Criteria andReplacetypeNotBetween(String value1, String value2) {
            addCriterion("REPLACETYPE not between", value1, value2, "replacetype");
            return (Criteria) this;
        }

        public Criteria andMarchartidIsNull() {
            addCriterion("MARCHARTID is null");
            return (Criteria) this;
        }

        public Criteria andMarchartidIsNotNull() {
            addCriterion("MARCHARTID is not null");
            return (Criteria) this;
        }

        public Criteria andMarchartidEqualTo(BigDecimal value) {
            addCriterion("MARCHARTID =", value, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMarchartidNotEqualTo(BigDecimal value) {
            addCriterion("MARCHARTID <>", value, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMarchartidGreaterThan(BigDecimal value) {
            addCriterion("MARCHARTID >", value, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMarchartidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARCHARTID >=", value, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMarchartidLessThan(BigDecimal value) {
            addCriterion("MARCHARTID <", value, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMarchartidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARCHARTID <=", value, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMarchartidIn(List<BigDecimal> values) {
            addCriterion("MARCHARTID in", values, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMarchartidNotIn(List<BigDecimal> values) {
            addCriterion("MARCHARTID not in", values, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMarchartidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARCHARTID between", value1, value2, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMarchartidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARCHARTID not between", value1, value2, "marchartid");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeIsNull() {
            addCriterion("MERCHANTHOUSECODE is null");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeIsNotNull() {
            addCriterion("MERCHANTHOUSECODE is not null");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeEqualTo(String value) {
            addCriterion("MERCHANTHOUSECODE =", value, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeNotEqualTo(String value) {
            addCriterion("MERCHANTHOUSECODE <>", value, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeGreaterThan(String value) {
            addCriterion("MERCHANTHOUSECODE >", value, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANTHOUSECODE >=", value, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeLessThan(String value) {
            addCriterion("MERCHANTHOUSECODE <", value, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeLessThanOrEqualTo(String value) {
            addCriterion("MERCHANTHOUSECODE <=", value, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeLike(String value) {
            addCriterion("MERCHANTHOUSECODE like", value, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeNotLike(String value) {
            addCriterion("MERCHANTHOUSECODE not like", value, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeIn(List<String> values) {
            addCriterion("MERCHANTHOUSECODE in", values, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeNotIn(List<String> values) {
            addCriterion("MERCHANTHOUSECODE not in", values, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeBetween(String value1, String value2) {
            addCriterion("MERCHANTHOUSECODE between", value1, value2, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andMerchanthousecodeNotBetween(String value1, String value2) {
            addCriterion("MERCHANTHOUSECODE not between", value1, value2, "merchanthousecode");
            return (Criteria) this;
        }

        public Criteria andToprovinceIsNull() {
            addCriterion("TOPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andToprovinceIsNotNull() {
            addCriterion("TOPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andToprovinceEqualTo(String value) {
            addCriterion("TOPROVINCE =", value, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceNotEqualTo(String value) {
            addCriterion("TOPROVINCE <>", value, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceGreaterThan(String value) {
            addCriterion("TOPROVINCE >", value, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("TOPROVINCE >=", value, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceLessThan(String value) {
            addCriterion("TOPROVINCE <", value, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceLessThanOrEqualTo(String value) {
            addCriterion("TOPROVINCE <=", value, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceLike(String value) {
            addCriterion("TOPROVINCE like", value, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceNotLike(String value) {
            addCriterion("TOPROVINCE not like", value, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceIn(List<String> values) {
            addCriterion("TOPROVINCE in", values, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceNotIn(List<String> values) {
            addCriterion("TOPROVINCE not in", values, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceBetween(String value1, String value2) {
            addCriterion("TOPROVINCE between", value1, value2, "toprovince");
            return (Criteria) this;
        }

        public Criteria andToprovinceNotBetween(String value1, String value2) {
            addCriterion("TOPROVINCE not between", value1, value2, "toprovince");
            return (Criteria) this;
        }

        public Criteria andTocityIsNull() {
            addCriterion("TOCITY is null");
            return (Criteria) this;
        }

        public Criteria andTocityIsNotNull() {
            addCriterion("TOCITY is not null");
            return (Criteria) this;
        }

        public Criteria andTocityEqualTo(String value) {
            addCriterion("TOCITY =", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotEqualTo(String value) {
            addCriterion("TOCITY <>", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityGreaterThan(String value) {
            addCriterion("TOCITY >", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityGreaterThanOrEqualTo(String value) {
            addCriterion("TOCITY >=", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityLessThan(String value) {
            addCriterion("TOCITY <", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityLessThanOrEqualTo(String value) {
            addCriterion("TOCITY <=", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityLike(String value) {
            addCriterion("TOCITY like", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotLike(String value) {
            addCriterion("TOCITY not like", value, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityIn(List<String> values) {
            addCriterion("TOCITY in", values, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotIn(List<String> values) {
            addCriterion("TOCITY not in", values, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityBetween(String value1, String value2) {
            addCriterion("TOCITY between", value1, value2, "tocity");
            return (Criteria) this;
        }

        public Criteria andTocityNotBetween(String value1, String value2) {
            addCriterion("TOCITY not between", value1, value2, "tocity");
            return (Criteria) this;
        }

        public Criteria andToareaIsNull() {
            addCriterion("TOAREA is null");
            return (Criteria) this;
        }

        public Criteria andToareaIsNotNull() {
            addCriterion("TOAREA is not null");
            return (Criteria) this;
        }

        public Criteria andToareaEqualTo(String value) {
            addCriterion("TOAREA =", value, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaNotEqualTo(String value) {
            addCriterion("TOAREA <>", value, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaGreaterThan(String value) {
            addCriterion("TOAREA >", value, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaGreaterThanOrEqualTo(String value) {
            addCriterion("TOAREA >=", value, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaLessThan(String value) {
            addCriterion("TOAREA <", value, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaLessThanOrEqualTo(String value) {
            addCriterion("TOAREA <=", value, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaLike(String value) {
            addCriterion("TOAREA like", value, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaNotLike(String value) {
            addCriterion("TOAREA not like", value, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaIn(List<String> values) {
            addCriterion("TOAREA in", values, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaNotIn(List<String> values) {
            addCriterion("TOAREA not in", values, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaBetween(String value1, String value2) {
            addCriterion("TOAREA between", value1, value2, "toarea");
            return (Criteria) this;
        }

        public Criteria andToareaNotBetween(String value1, String value2) {
            addCriterion("TOAREA not between", value1, value2, "toarea");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNull() {
            addCriterion("TOADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNotNull() {
            addCriterion("TOADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andToaddressEqualTo(String value) {
            addCriterion("TOADDRESS =", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotEqualTo(String value) {
            addCriterion("TOADDRESS <>", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThan(String value) {
            addCriterion("TOADDRESS >", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThanOrEqualTo(String value) {
            addCriterion("TOADDRESS >=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThan(String value) {
            addCriterion("TOADDRESS <", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThanOrEqualTo(String value) {
            addCriterion("TOADDRESS <=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLike(String value) {
            addCriterion("TOADDRESS like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotLike(String value) {
            addCriterion("TOADDRESS not like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIn(List<String> values) {
            addCriterion("TOADDRESS in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotIn(List<String> values) {
            addCriterion("TOADDRESS not in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressBetween(String value1, String value2) {
            addCriterion("TOADDRESS between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotBetween(String value1, String value2) {
            addCriterion("TOADDRESS not between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidIsNull() {
            addCriterion("EXPRESSCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidIsNotNull() {
            addCriterion("EXPRESSCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidEqualTo(BigDecimal value) {
            addCriterion("EXPRESSCOMPANYID =", value, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidNotEqualTo(BigDecimal value) {
            addCriterion("EXPRESSCOMPANYID <>", value, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidGreaterThan(BigDecimal value) {
            addCriterion("EXPRESSCOMPANYID >", value, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSCOMPANYID >=", value, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidLessThan(BigDecimal value) {
            addCriterion("EXPRESSCOMPANYID <", value, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSCOMPANYID <=", value, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidIn(List<BigDecimal> values) {
            addCriterion("EXPRESSCOMPANYID in", values, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidNotIn(List<BigDecimal> values) {
            addCriterion("EXPRESSCOMPANYID not in", values, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSCOMPANYID between", value1, value2, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andExpresscompanyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSCOMPANYID not between", value1, value2, "expresscompanyid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidIsNull() {
            addCriterion("DELIVERMANID is null");
            return (Criteria) this;
        }

        public Criteria andDelivermanidIsNotNull() {
            addCriterion("DELIVERMANID is not null");
            return (Criteria) this;
        }

        public Criteria andDelivermanidEqualTo(BigDecimal value) {
            addCriterion("DELIVERMANID =", value, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidNotEqualTo(BigDecimal value) {
            addCriterion("DELIVERMANID <>", value, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidGreaterThan(BigDecimal value) {
            addCriterion("DELIVERMANID >", value, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERMANID >=", value, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidLessThan(BigDecimal value) {
            addCriterion("DELIVERMANID <", value, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERMANID <=", value, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidIn(List<BigDecimal> values) {
            addCriterion("DELIVERMANID in", values, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidNotIn(List<BigDecimal> values) {
            addCriterion("DELIVERMANID not in", values, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERMANID between", value1, value2, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andDelivermanidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERMANID not between", value1, value2, "delivermanid");
            return (Criteria) this;
        }

        public Criteria andMerchantweightIsNull() {
            addCriterion("MERCHANTWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMerchantweightIsNotNull() {
            addCriterion("MERCHANTWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantweightEqualTo(BigDecimal value) {
            addCriterion("MERCHANTWEIGHT =", value, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andMerchantweightNotEqualTo(BigDecimal value) {
            addCriterion("MERCHANTWEIGHT <>", value, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andMerchantweightGreaterThan(BigDecimal value) {
            addCriterion("MERCHANTWEIGHT >", value, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andMerchantweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MERCHANTWEIGHT >=", value, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andMerchantweightLessThan(BigDecimal value) {
            addCriterion("MERCHANTWEIGHT <", value, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andMerchantweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MERCHANTWEIGHT <=", value, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andMerchantweightIn(List<BigDecimal> values) {
            addCriterion("MERCHANTWEIGHT in", values, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andMerchantweightNotIn(List<BigDecimal> values) {
            addCriterion("MERCHANTWEIGHT not in", values, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andMerchantweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERCHANTWEIGHT between", value1, value2, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andMerchantweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERCHANTWEIGHT not between", value1, value2, "merchantweight");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightIsNull() {
            addCriterion("FINANCIALWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFinancialweightIsNotNull() {
            addCriterion("FINANCIALWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFinancialweightEqualTo(BigDecimal value) {
            addCriterion("FINANCIALWEIGHT =", value, "financialweight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightNotEqualTo(BigDecimal value) {
            addCriterion("FINANCIALWEIGHT <>", value, "financialweight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightGreaterThan(BigDecimal value) {
            addCriterion("FINANCIALWEIGHT >", value, "financialweight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINANCIALWEIGHT >=", value, "financialweight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightLessThan(BigDecimal value) {
            addCriterion("FINANCIALWEIGHT <", value, "financialweight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINANCIALWEIGHT <=", value, "financialweight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightIn(List<BigDecimal> values) {
            addCriterion("FINANCIALWEIGHT in", values, "financialweight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightNotIn(List<BigDecimal> values) {
            addCriterion("FINANCIALWEIGHT not in", values, "financialweight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINANCIALWEIGHT between", value1, value2, "financialweight");
            return (Criteria) this;
        }

        public Criteria andFinancialweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINANCIALWEIGHT not between", value1, value2, "financialweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightIsNull() {
            addCriterion("VOLUMETRICWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightIsNotNull() {
            addCriterion("VOLUMETRICWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightEqualTo(BigDecimal value) {
            addCriterion("VOLUMETRICWEIGHT =", value, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightNotEqualTo(BigDecimal value) {
            addCriterion("VOLUMETRICWEIGHT <>", value, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightGreaterThan(BigDecimal value) {
            addCriterion("VOLUMETRICWEIGHT >", value, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUMETRICWEIGHT >=", value, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightLessThan(BigDecimal value) {
            addCriterion("VOLUMETRICWEIGHT <", value, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUMETRICWEIGHT <=", value, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightIn(List<BigDecimal> values) {
            addCriterion("VOLUMETRICWEIGHT in", values, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightNotIn(List<BigDecimal> values) {
            addCriterion("VOLUMETRICWEIGHT not in", values, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUMETRICWEIGHT between", value1, value2, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andVolumetricweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUMETRICWEIGHT not between", value1, value2, "volumetricweight");
            return (Criteria) this;
        }

        public Criteria andNeedfundIsNull() {
            addCriterion("NEEDFUND is null");
            return (Criteria) this;
        }

        public Criteria andNeedfundIsNotNull() {
            addCriterion("NEEDFUND is not null");
            return (Criteria) this;
        }

        public Criteria andNeedfundEqualTo(BigDecimal value) {
            addCriterion("NEEDFUND =", value, "needfund");
            return (Criteria) this;
        }

        public Criteria andNeedfundNotEqualTo(BigDecimal value) {
            addCriterion("NEEDFUND <>", value, "needfund");
            return (Criteria) this;
        }

        public Criteria andNeedfundGreaterThan(BigDecimal value) {
            addCriterion("NEEDFUND >", value, "needfund");
            return (Criteria) this;
        }

        public Criteria andNeedfundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEEDFUND >=", value, "needfund");
            return (Criteria) this;
        }

        public Criteria andNeedfundLessThan(BigDecimal value) {
            addCriterion("NEEDFUND <", value, "needfund");
            return (Criteria) this;
        }

        public Criteria andNeedfundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEEDFUND <=", value, "needfund");
            return (Criteria) this;
        }

        public Criteria andNeedfundIn(List<BigDecimal> values) {
            addCriterion("NEEDFUND in", values, "needfund");
            return (Criteria) this;
        }

        public Criteria andNeedfundNotIn(List<BigDecimal> values) {
            addCriterion("NEEDFUND not in", values, "needfund");
            return (Criteria) this;
        }

        public Criteria andNeedfundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEEDFUND between", value1, value2, "needfund");
            return (Criteria) this;
        }

        public Criteria andNeedfundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEEDFUND not between", value1, value2, "needfund");
            return (Criteria) this;
        }

        public Criteria andBackfundIsNull() {
            addCriterion("BACKFUND is null");
            return (Criteria) this;
        }

        public Criteria andBackfundIsNotNull() {
            addCriterion("BACKFUND is not null");
            return (Criteria) this;
        }

        public Criteria andBackfundEqualTo(BigDecimal value) {
            addCriterion("BACKFUND =", value, "backfund");
            return (Criteria) this;
        }

        public Criteria andBackfundNotEqualTo(BigDecimal value) {
            addCriterion("BACKFUND <>", value, "backfund");
            return (Criteria) this;
        }

        public Criteria andBackfundGreaterThan(BigDecimal value) {
            addCriterion("BACKFUND >", value, "backfund");
            return (Criteria) this;
        }

        public Criteria andBackfundGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKFUND >=", value, "backfund");
            return (Criteria) this;
        }

        public Criteria andBackfundLessThan(BigDecimal value) {
            addCriterion("BACKFUND <", value, "backfund");
            return (Criteria) this;
        }

        public Criteria andBackfundLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKFUND <=", value, "backfund");
            return (Criteria) this;
        }

        public Criteria andBackfundIn(List<BigDecimal> values) {
            addCriterion("BACKFUND in", values, "backfund");
            return (Criteria) this;
        }

        public Criteria andBackfundNotIn(List<BigDecimal> values) {
            addCriterion("BACKFUND not in", values, "backfund");
            return (Criteria) this;
        }

        public Criteria andBackfundBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKFUND between", value1, value2, "backfund");
            return (Criteria) this;
        }

        public Criteria andBackfundNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKFUND not between", value1, value2, "backfund");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceIsNull() {
            addCriterion("PROTECTEDPRICE is null");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceIsNotNull() {
            addCriterion("PROTECTEDPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDPRICE =", value, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceNotEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDPRICE <>", value, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceGreaterThan(BigDecimal value) {
            addCriterion("PROTECTEDPRICE >", value, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDPRICE >=", value, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceLessThan(BigDecimal value) {
            addCriterion("PROTECTEDPRICE <", value, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDPRICE <=", value, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDPRICE in", values, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceNotIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDPRICE not in", values, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDPRICE between", value1, value2, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andProtectedpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDPRICE not between", value1, value2, "protectedprice");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("REASON is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("REASON is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("REASON =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("REASON <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("REASON >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("REASON >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("REASON <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("REASON <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("REASON like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("REASON not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("REASON in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("REASON not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("REASON between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("REASON not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNull() {
            addCriterion("RECEIVEDATE is null");
            return (Criteria) this;
        }

        public Criteria andReceivedateIsNotNull() {
            addCriterion("RECEIVEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedateEqualTo(Date value) {
            addCriterion("RECEIVEDATE =", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotEqualTo(Date value) {
            addCriterion("RECEIVEDATE <>", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThan(Date value) {
            addCriterion("RECEIVEDATE >", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateGreaterThanOrEqualTo(Date value) {
            addCriterion("RECEIVEDATE >=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThan(Date value) {
            addCriterion("RECEIVEDATE <", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateLessThanOrEqualTo(Date value) {
            addCriterion("RECEIVEDATE <=", value, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateIn(List<Date> values) {
            addCriterion("RECEIVEDATE in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotIn(List<Date> values) {
            addCriterion("RECEIVEDATE not in", values, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateBetween(Date value1, Date value2) {
            addCriterion("RECEIVEDATE between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andReceivedateNotBetween(Date value1, Date value2) {
            addCriterion("RECEIVEDATE not between", value1, value2, "receivedate");
            return (Criteria) this;
        }

        public Criteria andAssigntimeIsNull() {
            addCriterion("ASSIGNTIME is null");
            return (Criteria) this;
        }

        public Criteria andAssigntimeIsNotNull() {
            addCriterion("ASSIGNTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAssigntimeEqualTo(Date value) {
            addCriterion("ASSIGNTIME =", value, "assigntime");
            return (Criteria) this;
        }

        public Criteria andAssigntimeNotEqualTo(Date value) {
            addCriterion("ASSIGNTIME <>", value, "assigntime");
            return (Criteria) this;
        }

        public Criteria andAssigntimeGreaterThan(Date value) {
            addCriterion("ASSIGNTIME >", value, "assigntime");
            return (Criteria) this;
        }

        public Criteria andAssigntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ASSIGNTIME >=", value, "assigntime");
            return (Criteria) this;
        }

        public Criteria andAssigntimeLessThan(Date value) {
            addCriterion("ASSIGNTIME <", value, "assigntime");
            return (Criteria) this;
        }

        public Criteria andAssigntimeLessThanOrEqualTo(Date value) {
            addCriterion("ASSIGNTIME <=", value, "assigntime");
            return (Criteria) this;
        }

        public Criteria andAssigntimeIn(List<Date> values) {
            addCriterion("ASSIGNTIME in", values, "assigntime");
            return (Criteria) this;
        }

        public Criteria andAssigntimeNotIn(List<Date> values) {
            addCriterion("ASSIGNTIME not in", values, "assigntime");
            return (Criteria) this;
        }

        public Criteria andAssigntimeBetween(Date value1, Date value2) {
            addCriterion("ASSIGNTIME between", value1, value2, "assigntime");
            return (Criteria) this;
        }

        public Criteria andAssigntimeNotBetween(Date value1, Date value2) {
            addCriterion("ASSIGNTIME not between", value1, value2, "assigntime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeIsNull() {
            addCriterion("LASTINBOUNDTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeIsNotNull() {
            addCriterion("LASTINBOUNDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeEqualTo(Date value) {
            addCriterion("LASTINBOUNDTIME =", value, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeNotEqualTo(Date value) {
            addCriterion("LASTINBOUNDTIME <>", value, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeGreaterThan(Date value) {
            addCriterion("LASTINBOUNDTIME >", value, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTINBOUNDTIME >=", value, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeLessThan(Date value) {
            addCriterion("LASTINBOUNDTIME <", value, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTINBOUNDTIME <=", value, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeIn(List<Date> values) {
            addCriterion("LASTINBOUNDTIME in", values, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeNotIn(List<Date> values) {
            addCriterion("LASTINBOUNDTIME not in", values, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeBetween(Date value1, Date value2) {
            addCriterion("LASTINBOUNDTIME between", value1, value2, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboundtimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTINBOUNDTIME not between", value1, value2, "lastinboundtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeIsNull() {
            addCriterion("LASTINBOXTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeIsNotNull() {
            addCriterion("LASTINBOXTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeEqualTo(Date value) {
            addCriterion("LASTINBOXTIME =", value, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeNotEqualTo(Date value) {
            addCriterion("LASTINBOXTIME <>", value, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeGreaterThan(Date value) {
            addCriterion("LASTINBOXTIME >", value, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTINBOXTIME >=", value, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeLessThan(Date value) {
            addCriterion("LASTINBOXTIME <", value, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTINBOXTIME <=", value, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeIn(List<Date> values) {
            addCriterion("LASTINBOXTIME in", values, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeNotIn(List<Date> values) {
            addCriterion("LASTINBOXTIME not in", values, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeBetween(Date value1, Date value2) {
            addCriterion("LASTINBOXTIME between", value1, value2, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastinboxtimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTINBOXTIME not between", value1, value2, "lastinboxtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeIsNull() {
            addCriterion("LASTOUTBOUNDTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeIsNotNull() {
            addCriterion("LASTOUTBOUNDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeEqualTo(Date value) {
            addCriterion("LASTOUTBOUNDTIME =", value, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeNotEqualTo(Date value) {
            addCriterion("LASTOUTBOUNDTIME <>", value, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeGreaterThan(Date value) {
            addCriterion("LASTOUTBOUNDTIME >", value, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTOUTBOUNDTIME >=", value, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeLessThan(Date value) {
            addCriterion("LASTOUTBOUNDTIME <", value, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTOUTBOUNDTIME <=", value, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeIn(List<Date> values) {
            addCriterion("LASTOUTBOUNDTIME in", values, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeNotIn(List<Date> values) {
            addCriterion("LASTOUTBOUNDTIME not in", values, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeBetween(Date value1, Date value2) {
            addCriterion("LASTOUTBOUNDTIME between", value1, value2, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andLastoutboundtimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTOUTBOUNDTIME not between", value1, value2, "lastoutboundtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeIsNull() {
            addCriterion("PICKUPINTOSTATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeIsNotNull() {
            addCriterion("PICKUPINTOSTATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeEqualTo(Date value) {
            addCriterion("PICKUPINTOSTATIONTIME =", value, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeNotEqualTo(Date value) {
            addCriterion("PICKUPINTOSTATIONTIME <>", value, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeGreaterThan(Date value) {
            addCriterion("PICKUPINTOSTATIONTIME >", value, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PICKUPINTOSTATIONTIME >=", value, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeLessThan(Date value) {
            addCriterion("PICKUPINTOSTATIONTIME <", value, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeLessThanOrEqualTo(Date value) {
            addCriterion("PICKUPINTOSTATIONTIME <=", value, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeIn(List<Date> values) {
            addCriterion("PICKUPINTOSTATIONTIME in", values, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeNotIn(List<Date> values) {
            addCriterion("PICKUPINTOSTATIONTIME not in", values, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeBetween(Date value1, Date value2) {
            addCriterion("PICKUPINTOSTATIONTIME between", value1, value2, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupintostationtimeNotBetween(Date value1, Date value2) {
            addCriterion("PICKUPINTOSTATIONTIME not between", value1, value2, "pickupintostationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeIsNull() {
            addCriterion("PICKUPOUTSTATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeIsNotNull() {
            addCriterion("PICKUPOUTSTATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeEqualTo(Date value) {
            addCriterion("PICKUPOUTSTATIONTIME =", value, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeNotEqualTo(Date value) {
            addCriterion("PICKUPOUTSTATIONTIME <>", value, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeGreaterThan(Date value) {
            addCriterion("PICKUPOUTSTATIONTIME >", value, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PICKUPOUTSTATIONTIME >=", value, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeLessThan(Date value) {
            addCriterion("PICKUPOUTSTATIONTIME <", value, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeLessThanOrEqualTo(Date value) {
            addCriterion("PICKUPOUTSTATIONTIME <=", value, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeIn(List<Date> values) {
            addCriterion("PICKUPOUTSTATIONTIME in", values, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeNotIn(List<Date> values) {
            addCriterion("PICKUPOUTSTATIONTIME not in", values, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeBetween(Date value1, Date value2) {
            addCriterion("PICKUPOUTSTATIONTIME between", value1, value2, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andPickupoutstationtimeNotBetween(Date value1, Date value2) {
            addCriterion("PICKUPOUTSTATIONTIME not between", value1, value2, "pickupoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeIsNull() {
            addCriterion("DELIVERYINTOSTATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeIsNotNull() {
            addCriterion("DELIVERYINTOSTATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeEqualTo(Date value) {
            addCriterion("DELIVERYINTOSTATIONTIME =", value, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeNotEqualTo(Date value) {
            addCriterion("DELIVERYINTOSTATIONTIME <>", value, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeGreaterThan(Date value) {
            addCriterion("DELIVERYINTOSTATIONTIME >", value, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERYINTOSTATIONTIME >=", value, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeLessThan(Date value) {
            addCriterion("DELIVERYINTOSTATIONTIME <", value, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERYINTOSTATIONTIME <=", value, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeIn(List<Date> values) {
            addCriterion("DELIVERYINTOSTATIONTIME in", values, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeNotIn(List<Date> values) {
            addCriterion("DELIVERYINTOSTATIONTIME not in", values, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeBetween(Date value1, Date value2) {
            addCriterion("DELIVERYINTOSTATIONTIME between", value1, value2, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryintostationtimeNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERYINTOSTATIONTIME not between", value1, value2, "deliveryintostationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeIsNull() {
            addCriterion("DELIVERYOUTSTATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeIsNotNull() {
            addCriterion("DELIVERYOUTSTATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeEqualTo(Date value) {
            addCriterion("DELIVERYOUTSTATIONTIME =", value, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeNotEqualTo(Date value) {
            addCriterion("DELIVERYOUTSTATIONTIME <>", value, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeGreaterThan(Date value) {
            addCriterion("DELIVERYOUTSTATIONTIME >", value, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERYOUTSTATIONTIME >=", value, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeLessThan(Date value) {
            addCriterion("DELIVERYOUTSTATIONTIME <", value, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERYOUTSTATIONTIME <=", value, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeIn(List<Date> values) {
            addCriterion("DELIVERYOUTSTATIONTIME in", values, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeNotIn(List<Date> values) {
            addCriterion("DELIVERYOUTSTATIONTIME not in", values, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeBetween(Date value1, Date value2) {
            addCriterion("DELIVERYOUTSTATIONTIME between", value1, value2, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryoutstationtimeNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERYOUTSTATIONTIME not between", value1, value2, "deliveryoutstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeIsNull() {
            addCriterion("DELIVERYBACKSTATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeIsNotNull() {
            addCriterion("DELIVERYBACKSTATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeEqualTo(Date value) {
            addCriterion("DELIVERYBACKSTATIONTIME =", value, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeNotEqualTo(Date value) {
            addCriterion("DELIVERYBACKSTATIONTIME <>", value, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeGreaterThan(Date value) {
            addCriterion("DELIVERYBACKSTATIONTIME >", value, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERYBACKSTATIONTIME >=", value, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeLessThan(Date value) {
            addCriterion("DELIVERYBACKSTATIONTIME <", value, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERYBACKSTATIONTIME <=", value, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeIn(List<Date> values) {
            addCriterion("DELIVERYBACKSTATIONTIME in", values, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeNotIn(List<Date> values) {
            addCriterion("DELIVERYBACKSTATIONTIME not in", values, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeBetween(Date value1, Date value2) {
            addCriterion("DELIVERYBACKSTATIONTIME between", value1, value2, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andDeliverybackstationtimeNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERYBACKSTATIONTIME not between", value1, value2, "deliverybackstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeIsNull() {
            addCriterion("REUTURNINSTATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeIsNotNull() {
            addCriterion("REUTURNINSTATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeEqualTo(Date value) {
            addCriterion("REUTURNINSTATIONTIME =", value, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeNotEqualTo(Date value) {
            addCriterion("REUTURNINSTATIONTIME <>", value, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeGreaterThan(Date value) {
            addCriterion("REUTURNINSTATIONTIME >", value, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REUTURNINSTATIONTIME >=", value, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeLessThan(Date value) {
            addCriterion("REUTURNINSTATIONTIME <", value, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeLessThanOrEqualTo(Date value) {
            addCriterion("REUTURNINSTATIONTIME <=", value, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeIn(List<Date> values) {
            addCriterion("REUTURNINSTATIONTIME in", values, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeNotIn(List<Date> values) {
            addCriterion("REUTURNINSTATIONTIME not in", values, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeBetween(Date value1, Date value2) {
            addCriterion("REUTURNINSTATIONTIME between", value1, value2, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninstationtimeNotBetween(Date value1, Date value2) {
            addCriterion("REUTURNINSTATIONTIME not between", value1, value2, "reuturninstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeIsNull() {
            addCriterion("REUTURNOUTSTATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeIsNotNull() {
            addCriterion("REUTURNOUTSTATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeEqualTo(Date value) {
            addCriterion("REUTURNOUTSTATIONTIME =", value, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeNotEqualTo(Date value) {
            addCriterion("REUTURNOUTSTATIONTIME <>", value, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeGreaterThan(Date value) {
            addCriterion("REUTURNOUTSTATIONTIME >", value, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REUTURNOUTSTATIONTIME >=", value, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeLessThan(Date value) {
            addCriterion("REUTURNOUTSTATIONTIME <", value, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeLessThanOrEqualTo(Date value) {
            addCriterion("REUTURNOUTSTATIONTIME <=", value, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeIn(List<Date> values) {
            addCriterion("REUTURNOUTSTATIONTIME in", values, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeNotIn(List<Date> values) {
            addCriterion("REUTURNOUTSTATIONTIME not in", values, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeBetween(Date value1, Date value2) {
            addCriterion("REUTURNOUTSTATIONTIME between", value1, value2, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutstationtimeNotBetween(Date value1, Date value2) {
            addCriterion("REUTURNOUTSTATIONTIME not between", value1, value2, "reuturnoutstationtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeIsNull() {
            addCriterion("REUTURNINBOUNDTIME is null");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeIsNotNull() {
            addCriterion("REUTURNINBOUNDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeEqualTo(Date value) {
            addCriterion("REUTURNINBOUNDTIME =", value, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeNotEqualTo(Date value) {
            addCriterion("REUTURNINBOUNDTIME <>", value, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeGreaterThan(Date value) {
            addCriterion("REUTURNINBOUNDTIME >", value, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REUTURNINBOUNDTIME >=", value, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeLessThan(Date value) {
            addCriterion("REUTURNINBOUNDTIME <", value, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeLessThanOrEqualTo(Date value) {
            addCriterion("REUTURNINBOUNDTIME <=", value, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeIn(List<Date> values) {
            addCriterion("REUTURNINBOUNDTIME in", values, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeNotIn(List<Date> values) {
            addCriterion("REUTURNINBOUNDTIME not in", values, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeBetween(Date value1, Date value2) {
            addCriterion("REUTURNINBOUNDTIME between", value1, value2, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturninboundtimeNotBetween(Date value1, Date value2) {
            addCriterion("REUTURNINBOUNDTIME not between", value1, value2, "reuturninboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeIsNull() {
            addCriterion("REUTURNOUTBOUNDTIME is null");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeIsNotNull() {
            addCriterion("REUTURNOUTBOUNDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeEqualTo(Date value) {
            addCriterion("REUTURNOUTBOUNDTIME =", value, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeNotEqualTo(Date value) {
            addCriterion("REUTURNOUTBOUNDTIME <>", value, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeGreaterThan(Date value) {
            addCriterion("REUTURNOUTBOUNDTIME >", value, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REUTURNOUTBOUNDTIME >=", value, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeLessThan(Date value) {
            addCriterion("REUTURNOUTBOUNDTIME <", value, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeLessThanOrEqualTo(Date value) {
            addCriterion("REUTURNOUTBOUNDTIME <=", value, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeIn(List<Date> values) {
            addCriterion("REUTURNOUTBOUNDTIME in", values, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeNotIn(List<Date> values) {
            addCriterion("REUTURNOUTBOUNDTIME not in", values, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeBetween(Date value1, Date value2) {
            addCriterion("REUTURNOUTBOUNDTIME between", value1, value2, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andReuturnoutboundtimeNotBetween(Date value1, Date value2) {
            addCriterion("REUTURNOUTBOUNDTIME not between", value1, value2, "reuturnoutboundtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeIsNull() {
            addCriterion("MERCHANTCONFIMTIME is null");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeIsNotNull() {
            addCriterion("MERCHANTCONFIMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeEqualTo(Date value) {
            addCriterion("MERCHANTCONFIMTIME =", value, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeNotEqualTo(Date value) {
            addCriterion("MERCHANTCONFIMTIME <>", value, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeGreaterThan(Date value) {
            addCriterion("MERCHANTCONFIMTIME >", value, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MERCHANTCONFIMTIME >=", value, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeLessThan(Date value) {
            addCriterion("MERCHANTCONFIMTIME <", value, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeLessThanOrEqualTo(Date value) {
            addCriterion("MERCHANTCONFIMTIME <=", value, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeIn(List<Date> values) {
            addCriterion("MERCHANTCONFIMTIME in", values, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeNotIn(List<Date> values) {
            addCriterion("MERCHANTCONFIMTIME not in", values, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeBetween(Date value1, Date value2) {
            addCriterion("MERCHANTCONFIMTIME between", value1, value2, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andMerchantconfimtimeNotBetween(Date value1, Date value2) {
            addCriterion("MERCHANTCONFIMTIME not between", value1, value2, "merchantconfimtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andPerformcodeIsNull() {
            addCriterion("PERFORMCODE is null");
            return (Criteria) this;
        }

        public Criteria andPerformcodeIsNotNull() {
            addCriterion("PERFORMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPerformcodeEqualTo(String value) {
            addCriterion("PERFORMCODE =", value, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeNotEqualTo(String value) {
            addCriterion("PERFORMCODE <>", value, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeGreaterThan(String value) {
            addCriterion("PERFORMCODE >", value, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PERFORMCODE >=", value, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeLessThan(String value) {
            addCriterion("PERFORMCODE <", value, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeLessThanOrEqualTo(String value) {
            addCriterion("PERFORMCODE <=", value, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeLike(String value) {
            addCriterion("PERFORMCODE like", value, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeNotLike(String value) {
            addCriterion("PERFORMCODE not like", value, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeIn(List<String> values) {
            addCriterion("PERFORMCODE in", values, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeNotIn(List<String> values) {
            addCriterion("PERFORMCODE not in", values, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeBetween(String value1, String value2) {
            addCriterion("PERFORMCODE between", value1, value2, "performcode");
            return (Criteria) this;
        }

        public Criteria andPerformcodeNotBetween(String value1, String value2) {
            addCriterion("PERFORMCODE not between", value1, value2, "performcode");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoIsNull() {
            addCriterion("EXPRESSWAYBILLNO is null");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoIsNotNull() {
            addCriterion("EXPRESSWAYBILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoEqualTo(String value) {
            addCriterion("EXPRESSWAYBILLNO =", value, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoNotEqualTo(String value) {
            addCriterion("EXPRESSWAYBILLNO <>", value, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoGreaterThan(String value) {
            addCriterion("EXPRESSWAYBILLNO >", value, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoGreaterThanOrEqualTo(String value) {
            addCriterion("EXPRESSWAYBILLNO >=", value, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoLessThan(String value) {
            addCriterion("EXPRESSWAYBILLNO <", value, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoLessThanOrEqualTo(String value) {
            addCriterion("EXPRESSWAYBILLNO <=", value, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoLike(String value) {
            addCriterion("EXPRESSWAYBILLNO like", value, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoNotLike(String value) {
            addCriterion("EXPRESSWAYBILLNO not like", value, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoIn(List<String> values) {
            addCriterion("EXPRESSWAYBILLNO in", values, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoNotIn(List<String> values) {
            addCriterion("EXPRESSWAYBILLNO not in", values, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoBetween(String value1, String value2) {
            addCriterion("EXPRESSWAYBILLNO between", value1, value2, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andExpresswaybillnoNotBetween(String value1, String value2) {
            addCriterion("EXPRESSWAYBILLNO not between", value1, value2, "expresswaybillno");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyIsNull() {
            addCriterion("GOODSPROPERTY is null");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyIsNotNull() {
            addCriterion("GOODSPROPERTY is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyEqualTo(String value) {
            addCriterion("GOODSPROPERTY =", value, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyNotEqualTo(String value) {
            addCriterion("GOODSPROPERTY <>", value, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyGreaterThan(String value) {
            addCriterion("GOODSPROPERTY >", value, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyGreaterThanOrEqualTo(String value) {
            addCriterion("GOODSPROPERTY >=", value, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyLessThan(String value) {
            addCriterion("GOODSPROPERTY <", value, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyLessThanOrEqualTo(String value) {
            addCriterion("GOODSPROPERTY <=", value, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyLike(String value) {
            addCriterion("GOODSPROPERTY like", value, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyNotLike(String value) {
            addCriterion("GOODSPROPERTY not like", value, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyIn(List<String> values) {
            addCriterion("GOODSPROPERTY in", values, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyNotIn(List<String> values) {
            addCriterion("GOODSPROPERTY not in", values, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyBetween(String value1, String value2) {
            addCriterion("GOODSPROPERTY between", value1, value2, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodspropertyNotBetween(String value1, String value2) {
            addCriterion("GOODSPROPERTY not between", value1, value2, "goodsproperty");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryIsNull() {
            addCriterion("GOODSCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryIsNotNull() {
            addCriterion("GOODSCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryEqualTo(String value) {
            addCriterion("GOODSCATEGORY =", value, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryNotEqualTo(String value) {
            addCriterion("GOODSCATEGORY <>", value, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryGreaterThan(String value) {
            addCriterion("GOODSCATEGORY >", value, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryGreaterThanOrEqualTo(String value) {
            addCriterion("GOODSCATEGORY >=", value, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryLessThan(String value) {
            addCriterion("GOODSCATEGORY <", value, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryLessThanOrEqualTo(String value) {
            addCriterion("GOODSCATEGORY <=", value, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryLike(String value) {
            addCriterion("GOODSCATEGORY like", value, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryNotLike(String value) {
            addCriterion("GOODSCATEGORY not like", value, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryIn(List<String> values) {
            addCriterion("GOODSCATEGORY in", values, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryNotIn(List<String> values) {
            addCriterion("GOODSCATEGORY not in", values, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryBetween(String value1, String value2) {
            addCriterion("GOODSCATEGORY between", value1, value2, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andGoodscategoryNotBetween(String value1, String value2) {
            addCriterion("GOODSCATEGORY not between", value1, value2, "goodscategory");
            return (Criteria) this;
        }

        public Criteria andFromprovinceIsNull() {
            addCriterion("FROMPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andFromprovinceIsNotNull() {
            addCriterion("FROMPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andFromprovinceEqualTo(String value) {
            addCriterion("FROMPROVINCE =", value, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceNotEqualTo(String value) {
            addCriterion("FROMPROVINCE <>", value, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceGreaterThan(String value) {
            addCriterion("FROMPROVINCE >", value, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("FROMPROVINCE >=", value, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceLessThan(String value) {
            addCriterion("FROMPROVINCE <", value, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceLessThanOrEqualTo(String value) {
            addCriterion("FROMPROVINCE <=", value, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceLike(String value) {
            addCriterion("FROMPROVINCE like", value, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceNotLike(String value) {
            addCriterion("FROMPROVINCE not like", value, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceIn(List<String> values) {
            addCriterion("FROMPROVINCE in", values, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceNotIn(List<String> values) {
            addCriterion("FROMPROVINCE not in", values, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceBetween(String value1, String value2) {
            addCriterion("FROMPROVINCE between", value1, value2, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromprovinceNotBetween(String value1, String value2) {
            addCriterion("FROMPROVINCE not between", value1, value2, "fromprovince");
            return (Criteria) this;
        }

        public Criteria andFromcityIsNull() {
            addCriterion("FROMCITY is null");
            return (Criteria) this;
        }

        public Criteria andFromcityIsNotNull() {
            addCriterion("FROMCITY is not null");
            return (Criteria) this;
        }

        public Criteria andFromcityEqualTo(String value) {
            addCriterion("FROMCITY =", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotEqualTo(String value) {
            addCriterion("FROMCITY <>", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityGreaterThan(String value) {
            addCriterion("FROMCITY >", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityGreaterThanOrEqualTo(String value) {
            addCriterion("FROMCITY >=", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityLessThan(String value) {
            addCriterion("FROMCITY <", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityLessThanOrEqualTo(String value) {
            addCriterion("FROMCITY <=", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityLike(String value) {
            addCriterion("FROMCITY like", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotLike(String value) {
            addCriterion("FROMCITY not like", value, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityIn(List<String> values) {
            addCriterion("FROMCITY in", values, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotIn(List<String> values) {
            addCriterion("FROMCITY not in", values, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityBetween(String value1, String value2) {
            addCriterion("FROMCITY between", value1, value2, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromcityNotBetween(String value1, String value2) {
            addCriterion("FROMCITY not between", value1, value2, "fromcity");
            return (Criteria) this;
        }

        public Criteria andFromareaIsNull() {
            addCriterion("FROMAREA is null");
            return (Criteria) this;
        }

        public Criteria andFromareaIsNotNull() {
            addCriterion("FROMAREA is not null");
            return (Criteria) this;
        }

        public Criteria andFromareaEqualTo(String value) {
            addCriterion("FROMAREA =", value, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaNotEqualTo(String value) {
            addCriterion("FROMAREA <>", value, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaGreaterThan(String value) {
            addCriterion("FROMAREA >", value, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaGreaterThanOrEqualTo(String value) {
            addCriterion("FROMAREA >=", value, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaLessThan(String value) {
            addCriterion("FROMAREA <", value, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaLessThanOrEqualTo(String value) {
            addCriterion("FROMAREA <=", value, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaLike(String value) {
            addCriterion("FROMAREA like", value, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaNotLike(String value) {
            addCriterion("FROMAREA not like", value, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaIn(List<String> values) {
            addCriterion("FROMAREA in", values, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaNotIn(List<String> values) {
            addCriterion("FROMAREA not in", values, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaBetween(String value1, String value2) {
            addCriterion("FROMAREA between", value1, value2, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromareaNotBetween(String value1, String value2) {
            addCriterion("FROMAREA not between", value1, value2, "fromarea");
            return (Criteria) this;
        }

        public Criteria andFromaddressIsNull() {
            addCriterion("FROMADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andFromaddressIsNotNull() {
            addCriterion("FROMADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andFromaddressEqualTo(String value) {
            addCriterion("FROMADDRESS =", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotEqualTo(String value) {
            addCriterion("FROMADDRESS <>", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThan(String value) {
            addCriterion("FROMADDRESS >", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThanOrEqualTo(String value) {
            addCriterion("FROMADDRESS >=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThan(String value) {
            addCriterion("FROMADDRESS <", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThanOrEqualTo(String value) {
            addCriterion("FROMADDRESS <=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLike(String value) {
            addCriterion("FROMADDRESS like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotLike(String value) {
            addCriterion("FROMADDRESS not like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressIn(List<String> values) {
            addCriterion("FROMADDRESS in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotIn(List<String> values) {
            addCriterion("FROMADDRESS not in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressBetween(String value1, String value2) {
            addCriterion("FROMADDRESS between", value1, value2, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotBetween(String value1, String value2) {
            addCriterion("FROMADDRESS not between", value1, value2, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeIsNull() {
            addCriterion("PICKUPDISTRIBUTIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeIsNotNull() {
            addCriterion("PICKUPDISTRIBUTIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeEqualTo(String value) {
            addCriterion("PICKUPDISTRIBUTIONCODE =", value, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeNotEqualTo(String value) {
            addCriterion("PICKUPDISTRIBUTIONCODE <>", value, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeGreaterThan(String value) {
            addCriterion("PICKUPDISTRIBUTIONCODE >", value, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("PICKUPDISTRIBUTIONCODE >=", value, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeLessThan(String value) {
            addCriterion("PICKUPDISTRIBUTIONCODE <", value, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeLessThanOrEqualTo(String value) {
            addCriterion("PICKUPDISTRIBUTIONCODE <=", value, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeLike(String value) {
            addCriterion("PICKUPDISTRIBUTIONCODE like", value, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeNotLike(String value) {
            addCriterion("PICKUPDISTRIBUTIONCODE not like", value, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeIn(List<String> values) {
            addCriterion("PICKUPDISTRIBUTIONCODE in", values, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeNotIn(List<String> values) {
            addCriterion("PICKUPDISTRIBUTIONCODE not in", values, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeBetween(String value1, String value2) {
            addCriterion("PICKUPDISTRIBUTIONCODE between", value1, value2, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupdistributioncodeNotBetween(String value1, String value2) {
            addCriterion("PICKUPDISTRIBUTIONCODE not between", value1, value2, "pickupdistributioncode");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidIsNull() {
            addCriterion("PICKUPEXPRESSCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidIsNotNull() {
            addCriterion("PICKUPEXPRESSCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidEqualTo(BigDecimal value) {
            addCriterion("PICKUPEXPRESSCOMPANYID =", value, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidNotEqualTo(BigDecimal value) {
            addCriterion("PICKUPEXPRESSCOMPANYID <>", value, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidGreaterThan(BigDecimal value) {
            addCriterion("PICKUPEXPRESSCOMPANYID >", value, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PICKUPEXPRESSCOMPANYID >=", value, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidLessThan(BigDecimal value) {
            addCriterion("PICKUPEXPRESSCOMPANYID <", value, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PICKUPEXPRESSCOMPANYID <=", value, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidIn(List<BigDecimal> values) {
            addCriterion("PICKUPEXPRESSCOMPANYID in", values, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidNotIn(List<BigDecimal> values) {
            addCriterion("PICKUPEXPRESSCOMPANYID not in", values, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICKUPEXPRESSCOMPANYID between", value1, value2, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupexpresscompanyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICKUPEXPRESSCOMPANYID not between", value1, value2, "pickupexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidIsNull() {
            addCriterion("PICKUPMANID is null");
            return (Criteria) this;
        }

        public Criteria andPickupmanidIsNotNull() {
            addCriterion("PICKUPMANID is not null");
            return (Criteria) this;
        }

        public Criteria andPickupmanidEqualTo(BigDecimal value) {
            addCriterion("PICKUPMANID =", value, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidNotEqualTo(BigDecimal value) {
            addCriterion("PICKUPMANID <>", value, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidGreaterThan(BigDecimal value) {
            addCriterion("PICKUPMANID >", value, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PICKUPMANID >=", value, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidLessThan(BigDecimal value) {
            addCriterion("PICKUPMANID <", value, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PICKUPMANID <=", value, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidIn(List<BigDecimal> values) {
            addCriterion("PICKUPMANID in", values, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidNotIn(List<BigDecimal> values) {
            addCriterion("PICKUPMANID not in", values, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICKUPMANID between", value1, value2, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andPickupmanidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PICKUPMANID not between", value1, value2, "pickupmanid");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeIsNull() {
            addCriterion("DELIVERYFEETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeIsNotNull() {
            addCriterion("DELIVERYFEETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeEqualTo(BigDecimal value) {
            addCriterion("DELIVERYFEETYPE =", value, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeNotEqualTo(BigDecimal value) {
            addCriterion("DELIVERYFEETYPE <>", value, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeGreaterThan(BigDecimal value) {
            addCriterion("DELIVERYFEETYPE >", value, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERYFEETYPE >=", value, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeLessThan(BigDecimal value) {
            addCriterion("DELIVERYFEETYPE <", value, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERYFEETYPE <=", value, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeIn(List<BigDecimal> values) {
            addCriterion("DELIVERYFEETYPE in", values, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeNotIn(List<BigDecimal> values) {
            addCriterion("DELIVERYFEETYPE not in", values, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERYFEETYPE between", value1, value2, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERYFEETYPE not between", value1, value2, "deliveryfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeIsNull() {
            addCriterion("DELIVERYFEE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeIsNotNull() {
            addCriterion("DELIVERYFEE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeEqualTo(BigDecimal value) {
            addCriterion("DELIVERYFEE =", value, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeNotEqualTo(BigDecimal value) {
            addCriterion("DELIVERYFEE <>", value, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeGreaterThan(BigDecimal value) {
            addCriterion("DELIVERYFEE >", value, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERYFEE >=", value, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeLessThan(BigDecimal value) {
            addCriterion("DELIVERYFEE <", value, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERYFEE <=", value, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeIn(List<BigDecimal> values) {
            addCriterion("DELIVERYFEE in", values, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeNotIn(List<BigDecimal> values) {
            addCriterion("DELIVERYFEE not in", values, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERYFEE between", value1, value2, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andDeliveryfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERYFEE not between", value1, value2, "deliveryfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeIsNull() {
            addCriterion("PROTECTFEE is null");
            return (Criteria) this;
        }

        public Criteria andProtectfeeIsNotNull() {
            addCriterion("PROTECTFEE is not null");
            return (Criteria) this;
        }

        public Criteria andProtectfeeEqualTo(BigDecimal value) {
            addCriterion("PROTECTFEE =", value, "protectfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeNotEqualTo(BigDecimal value) {
            addCriterion("PROTECTFEE <>", value, "protectfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeGreaterThan(BigDecimal value) {
            addCriterion("PROTECTFEE >", value, "protectfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTFEE >=", value, "protectfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeLessThan(BigDecimal value) {
            addCriterion("PROTECTFEE <", value, "protectfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTFEE <=", value, "protectfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeIn(List<BigDecimal> values) {
            addCriterion("PROTECTFEE in", values, "protectfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeNotIn(List<BigDecimal> values) {
            addCriterion("PROTECTFEE not in", values, "protectfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTFEE between", value1, value2, "protectfee");
            return (Criteria) this;
        }

        public Criteria andProtectfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTFEE not between", value1, value2, "protectfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceIsNull() {
            addCriterion("ADDITIONALSERVICE is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceIsNotNull() {
            addCriterion("ADDITIONALSERVICE is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceEqualTo(String value) {
            addCriterion("ADDITIONALSERVICE =", value, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceNotEqualTo(String value) {
            addCriterion("ADDITIONALSERVICE <>", value, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceGreaterThan(String value) {
            addCriterion("ADDITIONALSERVICE >", value, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceGreaterThanOrEqualTo(String value) {
            addCriterion("ADDITIONALSERVICE >=", value, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceLessThan(String value) {
            addCriterion("ADDITIONALSERVICE <", value, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceLessThanOrEqualTo(String value) {
            addCriterion("ADDITIONALSERVICE <=", value, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceLike(String value) {
            addCriterion("ADDITIONALSERVICE like", value, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceNotLike(String value) {
            addCriterion("ADDITIONALSERVICE not like", value, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceIn(List<String> values) {
            addCriterion("ADDITIONALSERVICE in", values, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceNotIn(List<String> values) {
            addCriterion("ADDITIONALSERVICE not in", values, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceBetween(String value1, String value2) {
            addCriterion("ADDITIONALSERVICE between", value1, value2, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalserviceNotBetween(String value1, String value2) {
            addCriterion("ADDITIONALSERVICE not between", value1, value2, "additionalservice");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeIsNull() {
            addCriterion("ADDITIONALFEE is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeIsNotNull() {
            addCriterion("ADDITIONALFEE is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeEqualTo(BigDecimal value) {
            addCriterion("ADDITIONALFEE =", value, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeNotEqualTo(BigDecimal value) {
            addCriterion("ADDITIONALFEE <>", value, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeGreaterThan(BigDecimal value) {
            addCriterion("ADDITIONALFEE >", value, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADDITIONALFEE >=", value, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeLessThan(BigDecimal value) {
            addCriterion("ADDITIONALFEE <", value, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADDITIONALFEE <=", value, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeIn(List<BigDecimal> values) {
            addCriterion("ADDITIONALFEE in", values, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeNotIn(List<BigDecimal> values) {
            addCriterion("ADDITIONALFEE not in", values, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADDITIONALFEE between", value1, value2, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andAdditionalfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADDITIONALFEE not between", value1, value2, "additionalfee");
            return (Criteria) this;
        }

        public Criteria andFactorageIsNull() {
            addCriterion("FACTORAGE is null");
            return (Criteria) this;
        }

        public Criteria andFactorageIsNotNull() {
            addCriterion("FACTORAGE is not null");
            return (Criteria) this;
        }

        public Criteria andFactorageEqualTo(BigDecimal value) {
            addCriterion("FACTORAGE =", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageNotEqualTo(BigDecimal value) {
            addCriterion("FACTORAGE <>", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageGreaterThan(BigDecimal value) {
            addCriterion("FACTORAGE >", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTORAGE >=", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageLessThan(BigDecimal value) {
            addCriterion("FACTORAGE <", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FACTORAGE <=", value, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageIn(List<BigDecimal> values) {
            addCriterion("FACTORAGE in", values, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageNotIn(List<BigDecimal> values) {
            addCriterion("FACTORAGE not in", values, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTORAGE between", value1, value2, "factorage");
            return (Criteria) this;
        }

        public Criteria andFactorageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FACTORAGE not between", value1, value2, "factorage");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIsNull() {
            addCriterion("TOTALFEE is null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIsNotNull() {
            addCriterion("TOTALFEE is not null");
            return (Criteria) this;
        }

        public Criteria andTotalfeeEqualTo(BigDecimal value) {
            addCriterion("TOTALFEE =", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotEqualTo(BigDecimal value) {
            addCriterion("TOTALFEE <>", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeGreaterThan(BigDecimal value) {
            addCriterion("TOTALFEE >", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALFEE >=", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeLessThan(BigDecimal value) {
            addCriterion("TOTALFEE <", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALFEE <=", value, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeIn(List<BigDecimal> values) {
            addCriterion("TOTALFEE in", values, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotIn(List<BigDecimal> values) {
            addCriterion("TOTALFEE not in", values, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALFEE between", value1, value2, "totalfee");
            return (Criteria) this;
        }

        public Criteria andTotalfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALFEE not between", value1, value2, "totalfee");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNull() {
            addCriterion("GOODSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIsNotNull() {
            addCriterion("GOODSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypeEqualTo(String value) {
            addCriterion("GOODSTYPE =", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotEqualTo(String value) {
            addCriterion("GOODSTYPE <>", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThan(String value) {
            addCriterion("GOODSTYPE >", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODSTYPE >=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThan(String value) {
            addCriterion("GOODSTYPE <", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLessThanOrEqualTo(String value) {
            addCriterion("GOODSTYPE <=", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeLike(String value) {
            addCriterion("GOODSTYPE like", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotLike(String value) {
            addCriterion("GOODSTYPE not like", value, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeIn(List<String> values) {
            addCriterion("GOODSTYPE in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotIn(List<String> values) {
            addCriterion("GOODSTYPE not in", values, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeBetween(String value1, String value2) {
            addCriterion("GOODSTYPE between", value1, value2, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodstypeNotBetween(String value1, String value2) {
            addCriterion("GOODSTYPE not between", value1, value2, "goodstype");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIsNull() {
            addCriterion("GOODSNUM is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIsNotNull() {
            addCriterion("GOODSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnumEqualTo(BigDecimal value) {
            addCriterion("GOODSNUM =", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotEqualTo(BigDecimal value) {
            addCriterion("GOODSNUM <>", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumGreaterThan(BigDecimal value) {
            addCriterion("GOODSNUM >", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSNUM >=", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumLessThan(BigDecimal value) {
            addCriterion("GOODSNUM <", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSNUM <=", value, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumIn(List<BigDecimal> values) {
            addCriterion("GOODSNUM in", values, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotIn(List<BigDecimal> values) {
            addCriterion("GOODSNUM not in", values, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSNUM between", value1, value2, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andGoodsnumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSNUM not between", value1, value2, "goodsnum");
            return (Criteria) this;
        }

        public Criteria andFetchordernoIsNull() {
            addCriterion("FETCHORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andFetchordernoIsNotNull() {
            addCriterion("FETCHORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andFetchordernoEqualTo(String value) {
            addCriterion("FETCHORDERNO =", value, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoNotEqualTo(String value) {
            addCriterion("FETCHORDERNO <>", value, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoGreaterThan(String value) {
            addCriterion("FETCHORDERNO >", value, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoGreaterThanOrEqualTo(String value) {
            addCriterion("FETCHORDERNO >=", value, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoLessThan(String value) {
            addCriterion("FETCHORDERNO <", value, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoLessThanOrEqualTo(String value) {
            addCriterion("FETCHORDERNO <=", value, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoLike(String value) {
            addCriterion("FETCHORDERNO like", value, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoNotLike(String value) {
            addCriterion("FETCHORDERNO not like", value, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoIn(List<String> values) {
            addCriterion("FETCHORDERNO in", values, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoNotIn(List<String> values) {
            addCriterion("FETCHORDERNO not in", values, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoBetween(String value1, String value2) {
            addCriterion("FETCHORDERNO between", value1, value2, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchordernoNotBetween(String value1, String value2) {
            addCriterion("FETCHORDERNO not between", value1, value2, "fetchorderno");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeIsNull() {
            addCriterion("FETCHCREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeIsNotNull() {
            addCriterion("FETCHCREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeEqualTo(Date value) {
            addCriterion("FETCHCREATETIME =", value, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeNotEqualTo(Date value) {
            addCriterion("FETCHCREATETIME <>", value, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeGreaterThan(Date value) {
            addCriterion("FETCHCREATETIME >", value, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FETCHCREATETIME >=", value, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeLessThan(Date value) {
            addCriterion("FETCHCREATETIME <", value, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("FETCHCREATETIME <=", value, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeIn(List<Date> values) {
            addCriterion("FETCHCREATETIME in", values, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeNotIn(List<Date> values) {
            addCriterion("FETCHCREATETIME not in", values, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeBetween(Date value1, Date value2) {
            addCriterion("FETCHCREATETIME between", value1, value2, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andFetchcreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("FETCHCREATETIME not between", value1, value2, "fetchcreatetime");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelIsNull() {
            addCriterion("CUSTOMERLEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelIsNotNull() {
            addCriterion("CUSTOMERLEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelEqualTo(String value) {
            addCriterion("CUSTOMERLEVEL =", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelNotEqualTo(String value) {
            addCriterion("CUSTOMERLEVEL <>", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelGreaterThan(String value) {
            addCriterion("CUSTOMERLEVEL >", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLEVEL >=", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelLessThan(String value) {
            addCriterion("CUSTOMERLEVEL <", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERLEVEL <=", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelLike(String value) {
            addCriterion("CUSTOMERLEVEL like", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelNotLike(String value) {
            addCriterion("CUSTOMERLEVEL not like", value, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelIn(List<String> values) {
            addCriterion("CUSTOMERLEVEL in", values, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelNotIn(List<String> values) {
            addCriterion("CUSTOMERLEVEL not in", values, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelBetween(String value1, String value2) {
            addCriterion("CUSTOMERLEVEL between", value1, value2, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andCustomerlevelNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERLEVEL not between", value1, value2, "customerlevel");
            return (Criteria) this;
        }

        public Criteria andOrdercommentIsNull() {
            addCriterion("ORDERCOMMENT is null");
            return (Criteria) this;
        }

        public Criteria andOrdercommentIsNotNull() {
            addCriterion("ORDERCOMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andOrdercommentEqualTo(String value) {
            addCriterion("ORDERCOMMENT =", value, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentNotEqualTo(String value) {
            addCriterion("ORDERCOMMENT <>", value, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentGreaterThan(String value) {
            addCriterion("ORDERCOMMENT >", value, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERCOMMENT >=", value, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentLessThan(String value) {
            addCriterion("ORDERCOMMENT <", value, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentLessThanOrEqualTo(String value) {
            addCriterion("ORDERCOMMENT <=", value, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentLike(String value) {
            addCriterion("ORDERCOMMENT like", value, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentNotLike(String value) {
            addCriterion("ORDERCOMMENT not like", value, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentIn(List<String> values) {
            addCriterion("ORDERCOMMENT in", values, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentNotIn(List<String> values) {
            addCriterion("ORDERCOMMENT not in", values, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentBetween(String value1, String value2) {
            addCriterion("ORDERCOMMENT between", value1, value2, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andOrdercommentNotBetween(String value1, String value2) {
            addCriterion("ORDERCOMMENT not between", value1, value2, "ordercomment");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNull() {
            addCriterion("CREATEBY is null");
            return (Criteria) this;
        }

        public Criteria andCreatebyIsNotNull() {
            addCriterion("CREATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebyEqualTo(BigDecimal value) {
            addCriterion("CREATEBY =", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotEqualTo(BigDecimal value) {
            addCriterion("CREATEBY <>", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThan(BigDecimal value) {
            addCriterion("CREATEBY >", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEBY >=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThan(BigDecimal value) {
            addCriterion("CREATEBY <", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATEBY <=", value, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyIn(List<BigDecimal> values) {
            addCriterion("CREATEBY in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotIn(List<BigDecimal> values) {
            addCriterion("CREATEBY not in", values, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEBY between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andCreatebyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATEBY not between", value1, value2, "createby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNull() {
            addCriterion("UPDATEBY is null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIsNotNull() {
            addCriterion("UPDATEBY is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatebyEqualTo(BigDecimal value) {
            addCriterion("UPDATEBY =", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotEqualTo(BigDecimal value) {
            addCriterion("UPDATEBY <>", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThan(BigDecimal value) {
            addCriterion("UPDATEBY >", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UPDATEBY >=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThan(BigDecimal value) {
            addCriterion("UPDATEBY <", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UPDATEBY <=", value, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyIn(List<BigDecimal> values) {
            addCriterion("UPDATEBY in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotIn(List<BigDecimal> values) {
            addCriterion("UPDATEBY not in", values, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPDATEBY between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andUpdatebyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UPDATEBY not between", value1, value2, "updateby");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNull() {
            addCriterion("ISDELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIsNotNull() {
            addCriterion("ISDELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeletedEqualTo(BigDecimal value) {
            addCriterion("ISDELETED =", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotEqualTo(BigDecimal value) {
            addCriterion("ISDELETED <>", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThan(BigDecimal value) {
            addCriterion("ISDELETED >", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISDELETED >=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThan(BigDecimal value) {
            addCriterion("ISDELETED <", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISDELETED <=", value, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedIn(List<BigDecimal> values) {
            addCriterion("ISDELETED in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotIn(List<BigDecimal> values) {
            addCriterion("ISDELETED not in", values, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISDELETED between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andIsdeletedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISDELETED not between", value1, value2, "isdeleted");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNull() {
            addCriterion("BUSINESSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIsNotNull() {
            addCriterion("BUSINESSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeEqualTo(BigDecimal value) {
            addCriterion("BUSINESSTYPE =", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotEqualTo(BigDecimal value) {
            addCriterion("BUSINESSTYPE <>", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThan(BigDecimal value) {
            addCriterion("BUSINESSTYPE >", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESSTYPE >=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThan(BigDecimal value) {
            addCriterion("BUSINESSTYPE <", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUSINESSTYPE <=", value, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeIn(List<BigDecimal> values) {
            addCriterion("BUSINESSTYPE in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotIn(List<BigDecimal> values) {
            addCriterion("BUSINESSTYPE not in", values, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESSTYPE between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andBusinesstypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUSINESSTYPE not between", value1, value2, "businesstype");
            return (Criteria) this;
        }

        public Criteria andAddresseeIsNull() {
            addCriterion("ADDRESSEE is null");
            return (Criteria) this;
        }

        public Criteria andAddresseeIsNotNull() {
            addCriterion("ADDRESSEE is not null");
            return (Criteria) this;
        }

        public Criteria andAddresseeEqualTo(String value) {
            addCriterion("ADDRESSEE =", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotEqualTo(String value) {
            addCriterion("ADDRESSEE <>", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeGreaterThan(String value) {
            addCriterion("ADDRESSEE >", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE >=", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLessThan(String value) {
            addCriterion("ADDRESSEE <", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLessThanOrEqualTo(String value) {
            addCriterion("ADDRESSEE <=", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeLike(String value) {
            addCriterion("ADDRESSEE like", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotLike(String value) {
            addCriterion("ADDRESSEE not like", value, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeIn(List<String> values) {
            addCriterion("ADDRESSEE in", values, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotIn(List<String> values) {
            addCriterion("ADDRESSEE not in", values, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeBetween(String value1, String value2) {
            addCriterion("ADDRESSEE between", value1, value2, "addressee");
            return (Criteria) this;
        }

        public Criteria andAddresseeNotBetween(String value1, String value2) {
            addCriterion("ADDRESSEE not between", value1, value2, "addressee");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("MOBILEPHONE =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("MOBILEPHONE <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("MOBILEPHONE >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("MOBILEPHONE <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("MOBILEPHONE like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("MOBILEPHONE not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("MOBILEPHONE in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("MOBILEPHONE not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andReceivetelIsNull() {
            addCriterion("RECEIVETEL is null");
            return (Criteria) this;
        }

        public Criteria andReceivetelIsNotNull() {
            addCriterion("RECEIVETEL is not null");
            return (Criteria) this;
        }

        public Criteria andReceivetelEqualTo(String value) {
            addCriterion("RECEIVETEL =", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelNotEqualTo(String value) {
            addCriterion("RECEIVETEL <>", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelGreaterThan(String value) {
            addCriterion("RECEIVETEL >", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVETEL >=", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelLessThan(String value) {
            addCriterion("RECEIVETEL <", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelLessThanOrEqualTo(String value) {
            addCriterion("RECEIVETEL <=", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelLike(String value) {
            addCriterion("RECEIVETEL like", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelNotLike(String value) {
            addCriterion("RECEIVETEL not like", value, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelIn(List<String> values) {
            addCriterion("RECEIVETEL in", values, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelNotIn(List<String> values) {
            addCriterion("RECEIVETEL not in", values, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelBetween(String value1, String value2) {
            addCriterion("RECEIVETEL between", value1, value2, "receivetel");
            return (Criteria) this;
        }

        public Criteria andReceivetelNotBetween(String value1, String value2) {
            addCriterion("RECEIVETEL not between", value1, value2, "receivetel");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeIsNull() {
            addCriterion("CURRENTDISTRIBUTIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeIsNotNull() {
            addCriterion("CURRENTDISTRIBUTIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeEqualTo(String value) {
            addCriterion("CURRENTDISTRIBUTIONCODE =", value, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeNotEqualTo(String value) {
            addCriterion("CURRENTDISTRIBUTIONCODE <>", value, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeGreaterThan(String value) {
            addCriterion("CURRENTDISTRIBUTIONCODE >", value, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENTDISTRIBUTIONCODE >=", value, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeLessThan(String value) {
            addCriterion("CURRENTDISTRIBUTIONCODE <", value, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeLessThanOrEqualTo(String value) {
            addCriterion("CURRENTDISTRIBUTIONCODE <=", value, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeLike(String value) {
            addCriterion("CURRENTDISTRIBUTIONCODE like", value, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeNotLike(String value) {
            addCriterion("CURRENTDISTRIBUTIONCODE not like", value, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeIn(List<String> values) {
            addCriterion("CURRENTDISTRIBUTIONCODE in", values, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeNotIn(List<String> values) {
            addCriterion("CURRENTDISTRIBUTIONCODE not in", values, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeBetween(String value1, String value2) {
            addCriterion("CURRENTDISTRIBUTIONCODE between", value1, value2, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andCurrentdistributioncodeNotBetween(String value1, String value2) {
            addCriterion("CURRENTDISTRIBUTIONCODE not between", value1, value2, "currentdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeIsNull() {
            addCriterion("FROMDISTRIBUTIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeIsNotNull() {
            addCriterion("FROMDISTRIBUTIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeEqualTo(String value) {
            addCriterion("FROMDISTRIBUTIONCODE =", value, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeNotEqualTo(String value) {
            addCriterion("FROMDISTRIBUTIONCODE <>", value, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeGreaterThan(String value) {
            addCriterion("FROMDISTRIBUTIONCODE >", value, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("FROMDISTRIBUTIONCODE >=", value, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeLessThan(String value) {
            addCriterion("FROMDISTRIBUTIONCODE <", value, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeLessThanOrEqualTo(String value) {
            addCriterion("FROMDISTRIBUTIONCODE <=", value, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeLike(String value) {
            addCriterion("FROMDISTRIBUTIONCODE like", value, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeNotLike(String value) {
            addCriterion("FROMDISTRIBUTIONCODE not like", value, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeIn(List<String> values) {
            addCriterion("FROMDISTRIBUTIONCODE in", values, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeNotIn(List<String> values) {
            addCriterion("FROMDISTRIBUTIONCODE not in", values, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeBetween(String value1, String value2) {
            addCriterion("FROMDISTRIBUTIONCODE between", value1, value2, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andFromdistributioncodeNotBetween(String value1, String value2) {
            addCriterion("FROMDISTRIBUTIONCODE not between", value1, value2, "fromdistributioncode");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNull() {
            addCriterion("SENDPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSendphoneIsNotNull() {
            addCriterion("SENDPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSendphoneEqualTo(String value) {
            addCriterion("SENDPHONE =", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotEqualTo(String value) {
            addCriterion("SENDPHONE <>", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThan(String value) {
            addCriterion("SENDPHONE >", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneGreaterThanOrEqualTo(String value) {
            addCriterion("SENDPHONE >=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThan(String value) {
            addCriterion("SENDPHONE <", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLessThanOrEqualTo(String value) {
            addCriterion("SENDPHONE <=", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneLike(String value) {
            addCriterion("SENDPHONE like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotLike(String value) {
            addCriterion("SENDPHONE not like", value, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneIn(List<String> values) {
            addCriterion("SENDPHONE in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotIn(List<String> values) {
            addCriterion("SENDPHONE not in", values, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneBetween(String value1, String value2) {
            addCriterion("SENDPHONE between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendphoneNotBetween(String value1, String value2) {
            addCriterion("SENDPHONE not between", value1, value2, "sendphone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneIsNull() {
            addCriterion("SENDTELEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneIsNotNull() {
            addCriterion("SENDTELEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneEqualTo(String value) {
            addCriterion("SENDTELEPHONE =", value, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneNotEqualTo(String value) {
            addCriterion("SENDTELEPHONE <>", value, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneGreaterThan(String value) {
            addCriterion("SENDTELEPHONE >", value, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("SENDTELEPHONE >=", value, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneLessThan(String value) {
            addCriterion("SENDTELEPHONE <", value, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneLessThanOrEqualTo(String value) {
            addCriterion("SENDTELEPHONE <=", value, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneLike(String value) {
            addCriterion("SENDTELEPHONE like", value, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneNotLike(String value) {
            addCriterion("SENDTELEPHONE not like", value, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneIn(List<String> values) {
            addCriterion("SENDTELEPHONE in", values, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneNotIn(List<String> values) {
            addCriterion("SENDTELEPHONE not in", values, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneBetween(String value1, String value2) {
            addCriterion("SENDTELEPHONE between", value1, value2, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendtelephoneNotBetween(String value1, String value2) {
            addCriterion("SENDTELEPHONE not between", value1, value2, "sendtelephone");
            return (Criteria) this;
        }

        public Criteria andSendnameIsNull() {
            addCriterion("SENDNAME is null");
            return (Criteria) this;
        }

        public Criteria andSendnameIsNotNull() {
            addCriterion("SENDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSendnameEqualTo(String value) {
            addCriterion("SENDNAME =", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotEqualTo(String value) {
            addCriterion("SENDNAME <>", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameGreaterThan(String value) {
            addCriterion("SENDNAME >", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameGreaterThanOrEqualTo(String value) {
            addCriterion("SENDNAME >=", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLessThan(String value) {
            addCriterion("SENDNAME <", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLessThanOrEqualTo(String value) {
            addCriterion("SENDNAME <=", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameLike(String value) {
            addCriterion("SENDNAME like", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotLike(String value) {
            addCriterion("SENDNAME not like", value, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameIn(List<String> values) {
            addCriterion("SENDNAME in", values, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotIn(List<String> values) {
            addCriterion("SENDNAME not in", values, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameBetween(String value1, String value2) {
            addCriterion("SENDNAME between", value1, value2, "sendname");
            return (Criteria) this;
        }

        public Criteria andSendnameNotBetween(String value1, String value2) {
            addCriterion("SENDNAME not between", value1, value2, "sendname");
            return (Criteria) this;
        }

        public Criteria andAccepttypeIsNull() {
            addCriterion("ACCEPTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andAccepttypeIsNotNull() {
            addCriterion("ACCEPTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAccepttypeEqualTo(String value) {
            addCriterion("ACCEPTTYPE =", value, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeNotEqualTo(String value) {
            addCriterion("ACCEPTTYPE <>", value, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeGreaterThan(String value) {
            addCriterion("ACCEPTTYPE >", value, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACCEPTTYPE >=", value, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeLessThan(String value) {
            addCriterion("ACCEPTTYPE <", value, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeLessThanOrEqualTo(String value) {
            addCriterion("ACCEPTTYPE <=", value, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeLike(String value) {
            addCriterion("ACCEPTTYPE like", value, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeNotLike(String value) {
            addCriterion("ACCEPTTYPE not like", value, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeIn(List<String> values) {
            addCriterion("ACCEPTTYPE in", values, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeNotIn(List<String> values) {
            addCriterion("ACCEPTTYPE not in", values, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeBetween(String value1, String value2) {
            addCriterion("ACCEPTTYPE between", value1, value2, "accepttype");
            return (Criteria) this;
        }

        public Criteria andAccepttypeNotBetween(String value1, String value2) {
            addCriterion("ACCEPTTYPE not between", value1, value2, "accepttype");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNull() {
            addCriterion("SIGNTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSigntypeIsNotNull() {
            addCriterion("SIGNTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSigntypeEqualTo(BigDecimal value) {
            addCriterion("SIGNTYPE =", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotEqualTo(BigDecimal value) {
            addCriterion("SIGNTYPE <>", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThan(BigDecimal value) {
            addCriterion("SIGNTYPE >", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNTYPE >=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThan(BigDecimal value) {
            addCriterion("SIGNTYPE <", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SIGNTYPE <=", value, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeIn(List<BigDecimal> values) {
            addCriterion("SIGNTYPE in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotIn(List<BigDecimal> values) {
            addCriterion("SIGNTYPE not in", values, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNTYPE between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigntypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SIGNTYPE not between", value1, value2, "signtype");
            return (Criteria) this;
        }

        public Criteria andSigncustomerIsNull() {
            addCriterion("SIGNCUSTOMER is null");
            return (Criteria) this;
        }

        public Criteria andSigncustomerIsNotNull() {
            addCriterion("SIGNCUSTOMER is not null");
            return (Criteria) this;
        }

        public Criteria andSigncustomerEqualTo(String value) {
            addCriterion("SIGNCUSTOMER =", value, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerNotEqualTo(String value) {
            addCriterion("SIGNCUSTOMER <>", value, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerGreaterThan(String value) {
            addCriterion("SIGNCUSTOMER >", value, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNCUSTOMER >=", value, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerLessThan(String value) {
            addCriterion("SIGNCUSTOMER <", value, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerLessThanOrEqualTo(String value) {
            addCriterion("SIGNCUSTOMER <=", value, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerLike(String value) {
            addCriterion("SIGNCUSTOMER like", value, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerNotLike(String value) {
            addCriterion("SIGNCUSTOMER not like", value, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerIn(List<String> values) {
            addCriterion("SIGNCUSTOMER in", values, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerNotIn(List<String> values) {
            addCriterion("SIGNCUSTOMER not in", values, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerBetween(String value1, String value2) {
            addCriterion("SIGNCUSTOMER between", value1, value2, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andSigncustomerNotBetween(String value1, String value2) {
            addCriterion("SIGNCUSTOMER not between", value1, value2, "signcustomer");
            return (Criteria) this;
        }

        public Criteria andAssignstatusIsNull() {
            addCriterion("ASSIGNSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAssignstatusIsNotNull() {
            addCriterion("ASSIGNSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAssignstatusEqualTo(BigDecimal value) {
            addCriterion("ASSIGNSTATUS =", value, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andAssignstatusNotEqualTo(BigDecimal value) {
            addCriterion("ASSIGNSTATUS <>", value, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andAssignstatusGreaterThan(BigDecimal value) {
            addCriterion("ASSIGNSTATUS >", value, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andAssignstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSIGNSTATUS >=", value, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andAssignstatusLessThan(BigDecimal value) {
            addCriterion("ASSIGNSTATUS <", value, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andAssignstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ASSIGNSTATUS <=", value, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andAssignstatusIn(List<BigDecimal> values) {
            addCriterion("ASSIGNSTATUS in", values, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andAssignstatusNotIn(List<BigDecimal> values) {
            addCriterion("ASSIGNSTATUS not in", values, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andAssignstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSIGNSTATUS between", value1, value2, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andAssignstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ASSIGNSTATUS not between", value1, value2, "assignstatus");
            return (Criteria) this;
        }

        public Criteria andReasonremarkIsNull() {
            addCriterion("REASONREMARK is null");
            return (Criteria) this;
        }

        public Criteria andReasonremarkIsNotNull() {
            addCriterion("REASONREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andReasonremarkEqualTo(String value) {
            addCriterion("REASONREMARK =", value, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkNotEqualTo(String value) {
            addCriterion("REASONREMARK <>", value, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkGreaterThan(String value) {
            addCriterion("REASONREMARK >", value, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkGreaterThanOrEqualTo(String value) {
            addCriterion("REASONREMARK >=", value, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkLessThan(String value) {
            addCriterion("REASONREMARK <", value, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkLessThanOrEqualTo(String value) {
            addCriterion("REASONREMARK <=", value, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkLike(String value) {
            addCriterion("REASONREMARK like", value, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkNotLike(String value) {
            addCriterion("REASONREMARK not like", value, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkIn(List<String> values) {
            addCriterion("REASONREMARK in", values, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkNotIn(List<String> values) {
            addCriterion("REASONREMARK not in", values, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkBetween(String value1, String value2) {
            addCriterion("REASONREMARK between", value1, value2, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasonremarkNotBetween(String value1, String value2) {
            addCriterion("REASONREMARK not between", value1, value2, "reasonremark");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionIsNull() {
            addCriterion("REASONDESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionIsNotNull() {
            addCriterion("REASONDESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionEqualTo(String value) {
            addCriterion("REASONDESCRIPTION =", value, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionNotEqualTo(String value) {
            addCriterion("REASONDESCRIPTION <>", value, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionGreaterThan(String value) {
            addCriterion("REASONDESCRIPTION >", value, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("REASONDESCRIPTION >=", value, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionLessThan(String value) {
            addCriterion("REASONDESCRIPTION <", value, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionLessThanOrEqualTo(String value) {
            addCriterion("REASONDESCRIPTION <=", value, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionLike(String value) {
            addCriterion("REASONDESCRIPTION like", value, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionNotLike(String value) {
            addCriterion("REASONDESCRIPTION not like", value, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionIn(List<String> values) {
            addCriterion("REASONDESCRIPTION in", values, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionNotIn(List<String> values) {
            addCriterion("REASONDESCRIPTION not in", values, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionBetween(String value1, String value2) {
            addCriterion("REASONDESCRIPTION between", value1, value2, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andReasondescriptionNotBetween(String value1, String value2) {
            addCriterion("REASONDESCRIPTION not between", value1, value2, "reasondescription");
            return (Criteria) this;
        }

        public Criteria andIssynuserIsNull() {
            addCriterion("ISSYNUSER is null");
            return (Criteria) this;
        }

        public Criteria andIssynuserIsNotNull() {
            addCriterion("ISSYNUSER is not null");
            return (Criteria) this;
        }

        public Criteria andIssynuserEqualTo(BigDecimal value) {
            addCriterion("ISSYNUSER =", value, "issynuser");
            return (Criteria) this;
        }

        public Criteria andIssynuserNotEqualTo(BigDecimal value) {
            addCriterion("ISSYNUSER <>", value, "issynuser");
            return (Criteria) this;
        }

        public Criteria andIssynuserGreaterThan(BigDecimal value) {
            addCriterion("ISSYNUSER >", value, "issynuser");
            return (Criteria) this;
        }

        public Criteria andIssynuserGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNUSER >=", value, "issynuser");
            return (Criteria) this;
        }

        public Criteria andIssynuserLessThan(BigDecimal value) {
            addCriterion("ISSYNUSER <", value, "issynuser");
            return (Criteria) this;
        }

        public Criteria andIssynuserLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNUSER <=", value, "issynuser");
            return (Criteria) this;
        }

        public Criteria andIssynuserIn(List<BigDecimal> values) {
            addCriterion("ISSYNUSER in", values, "issynuser");
            return (Criteria) this;
        }

        public Criteria andIssynuserNotIn(List<BigDecimal> values) {
            addCriterion("ISSYNUSER not in", values, "issynuser");
            return (Criteria) this;
        }

        public Criteria andIssynuserBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNUSER between", value1, value2, "issynuser");
            return (Criteria) this;
        }

        public Criteria andIssynuserNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNUSER not between", value1, value2, "issynuser");
            return (Criteria) this;
        }

        public Criteria andBoxcountIsNull() {
            addCriterion("BOXCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBoxcountIsNotNull() {
            addCriterion("BOXCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBoxcountEqualTo(BigDecimal value) {
            addCriterion("BOXCOUNT =", value, "boxcount");
            return (Criteria) this;
        }

        public Criteria andBoxcountNotEqualTo(BigDecimal value) {
            addCriterion("BOXCOUNT <>", value, "boxcount");
            return (Criteria) this;
        }

        public Criteria andBoxcountGreaterThan(BigDecimal value) {
            addCriterion("BOXCOUNT >", value, "boxcount");
            return (Criteria) this;
        }

        public Criteria andBoxcountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BOXCOUNT >=", value, "boxcount");
            return (Criteria) this;
        }

        public Criteria andBoxcountLessThan(BigDecimal value) {
            addCriterion("BOXCOUNT <", value, "boxcount");
            return (Criteria) this;
        }

        public Criteria andBoxcountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BOXCOUNT <=", value, "boxcount");
            return (Criteria) this;
        }

        public Criteria andBoxcountIn(List<BigDecimal> values) {
            addCriterion("BOXCOUNT in", values, "boxcount");
            return (Criteria) this;
        }

        public Criteria andBoxcountNotIn(List<BigDecimal> values) {
            addCriterion("BOXCOUNT not in", values, "boxcount");
            return (Criteria) this;
        }

        public Criteria andBoxcountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOXCOUNT between", value1, value2, "boxcount");
            return (Criteria) this;
        }

        public Criteria andBoxcountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BOXCOUNT not between", value1, value2, "boxcount");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeIsNull() {
            addCriterion("EXPRESSORDERPAYMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeIsNotNull() {
            addCriterion("EXPRESSORDERPAYMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeEqualTo(String value) {
            addCriterion("EXPRESSORDERPAYMENTTYPE =", value, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeNotEqualTo(String value) {
            addCriterion("EXPRESSORDERPAYMENTTYPE <>", value, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeGreaterThan(String value) {
            addCriterion("EXPRESSORDERPAYMENTTYPE >", value, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeGreaterThanOrEqualTo(String value) {
            addCriterion("EXPRESSORDERPAYMENTTYPE >=", value, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeLessThan(String value) {
            addCriterion("EXPRESSORDERPAYMENTTYPE <", value, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeLessThanOrEqualTo(String value) {
            addCriterion("EXPRESSORDERPAYMENTTYPE <=", value, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeLike(String value) {
            addCriterion("EXPRESSORDERPAYMENTTYPE like", value, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeNotLike(String value) {
            addCriterion("EXPRESSORDERPAYMENTTYPE not like", value, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeIn(List<String> values) {
            addCriterion("EXPRESSORDERPAYMENTTYPE in", values, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeNotIn(List<String> values) {
            addCriterion("EXPRESSORDERPAYMENTTYPE not in", values, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeBetween(String value1, String value2) {
            addCriterion("EXPRESSORDERPAYMENTTYPE between", value1, value2, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderpaymenttypeNotBetween(String value1, String value2) {
            addCriterion("EXPRESSORDERPAYMENTTYPE not between", value1, value2, "expressorderpaymenttype");
            return (Criteria) this;
        }

        public Criteria andQuerystatusIsNull() {
            addCriterion("QUERYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andQuerystatusIsNotNull() {
            addCriterion("QUERYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andQuerystatusEqualTo(BigDecimal value) {
            addCriterion("QUERYSTATUS =", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusNotEqualTo(BigDecimal value) {
            addCriterion("QUERYSTATUS <>", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusGreaterThan(BigDecimal value) {
            addCriterion("QUERYSTATUS >", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("QUERYSTATUS >=", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusLessThan(BigDecimal value) {
            addCriterion("QUERYSTATUS <", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("QUERYSTATUS <=", value, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusIn(List<BigDecimal> values) {
            addCriterion("QUERYSTATUS in", values, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusNotIn(List<BigDecimal> values) {
            addCriterion("QUERYSTATUS not in", values, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUERYSTATUS between", value1, value2, "querystatus");
            return (Criteria) this;
        }

        public Criteria andQuerystatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("QUERYSTATUS not between", value1, value2, "querystatus");
            return (Criteria) this;
        }

        public Criteria andSubtypeIsNull() {
            addCriterion("SUBTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSubtypeIsNotNull() {
            addCriterion("SUBTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSubtypeEqualTo(BigDecimal value) {
            addCriterion("SUBTYPE =", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotEqualTo(BigDecimal value) {
            addCriterion("SUBTYPE <>", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThan(BigDecimal value) {
            addCriterion("SUBTYPE >", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBTYPE >=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThan(BigDecimal value) {
            addCriterion("SUBTYPE <", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBTYPE <=", value, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeIn(List<BigDecimal> values) {
            addCriterion("SUBTYPE in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotIn(List<BigDecimal> values) {
            addCriterion("SUBTYPE not in", values, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBTYPE between", value1, value2, "subtype");
            return (Criteria) this;
        }

        public Criteria andSubtypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBTYPE not between", value1, value2, "subtype");
            return (Criteria) this;
        }

        public Criteria andPoscodeIsNull() {
            addCriterion("POSCODE is null");
            return (Criteria) this;
        }

        public Criteria andPoscodeIsNotNull() {
            addCriterion("POSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPoscodeEqualTo(String value) {
            addCriterion("POSCODE =", value, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeNotEqualTo(String value) {
            addCriterion("POSCODE <>", value, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeGreaterThan(String value) {
            addCriterion("POSCODE >", value, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeGreaterThanOrEqualTo(String value) {
            addCriterion("POSCODE >=", value, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeLessThan(String value) {
            addCriterion("POSCODE <", value, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeLessThanOrEqualTo(String value) {
            addCriterion("POSCODE <=", value, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeLike(String value) {
            addCriterion("POSCODE like", value, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeNotLike(String value) {
            addCriterion("POSCODE not like", value, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeIn(List<String> values) {
            addCriterion("POSCODE in", values, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeNotIn(List<String> values) {
            addCriterion("POSCODE not in", values, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeBetween(String value1, String value2) {
            addCriterion("POSCODE between", value1, value2, "poscode");
            return (Criteria) this;
        }

        public Criteria andPoscodeNotBetween(String value1, String value2) {
            addCriterion("POSCODE not between", value1, value2, "poscode");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeIsNull() {
            addCriterion("EXPRESSORDERACCOUNTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeIsNotNull() {
            addCriterion("EXPRESSORDERACCOUNTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeEqualTo(BigDecimal value) {
            addCriterion("EXPRESSORDERACCOUNTTYPE =", value, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeNotEqualTo(BigDecimal value) {
            addCriterion("EXPRESSORDERACCOUNTTYPE <>", value, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeGreaterThan(BigDecimal value) {
            addCriterion("EXPRESSORDERACCOUNTTYPE >", value, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSORDERACCOUNTTYPE >=", value, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeLessThan(BigDecimal value) {
            addCriterion("EXPRESSORDERACCOUNTTYPE <", value, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSORDERACCOUNTTYPE <=", value, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeIn(List<BigDecimal> values) {
            addCriterion("EXPRESSORDERACCOUNTTYPE in", values, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeNotIn(List<BigDecimal> values) {
            addCriterion("EXPRESSORDERACCOUNTTYPE not in", values, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSORDERACCOUNTTYPE between", value1, value2, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andExpressorderaccounttypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSORDERACCOUNTTYPE not between", value1, value2, "expressorderaccounttype");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeIsNull() {
            addCriterion("DISTRIBUTIONRECEIVEDTIME is null");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeIsNotNull() {
            addCriterion("DISTRIBUTIONRECEIVEDTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeEqualTo(Date value) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME =", value, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeNotEqualTo(Date value) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME <>", value, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeGreaterThan(Date value) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME >", value, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME >=", value, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeLessThan(Date value) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME <", value, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeLessThanOrEqualTo(Date value) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME <=", value, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeIn(List<Date> values) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME in", values, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeNotIn(List<Date> values) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME not in", values, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeBetween(Date value1, Date value2) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME between", value1, value2, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andDistributionreceivedtimeNotBetween(Date value1, Date value2) {
            addCriterion("DISTRIBUTIONRECEIVEDTIME not between", value1, value2, "distributionreceivedtime");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidIsNull() {
            addCriterion("REALMERCHANTID is null");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidIsNotNull() {
            addCriterion("REALMERCHANTID is not null");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidEqualTo(BigDecimal value) {
            addCriterion("REALMERCHANTID =", value, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidNotEqualTo(BigDecimal value) {
            addCriterion("REALMERCHANTID <>", value, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidGreaterThan(BigDecimal value) {
            addCriterion("REALMERCHANTID >", value, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REALMERCHANTID >=", value, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidLessThan(BigDecimal value) {
            addCriterion("REALMERCHANTID <", value, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REALMERCHANTID <=", value, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidIn(List<BigDecimal> values) {
            addCriterion("REALMERCHANTID in", values, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidNotIn(List<BigDecimal> values) {
            addCriterion("REALMERCHANTID not in", values, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALMERCHANTID between", value1, value2, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andRealmerchantidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REALMERCHANTID not between", value1, value2, "realmerchantid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridIsNull() {
            addCriterion("RETURNSORTINGCENTERID is null");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridIsNotNull() {
            addCriterion("RETURNSORTINGCENTERID is not null");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridEqualTo(BigDecimal value) {
            addCriterion("RETURNSORTINGCENTERID =", value, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridNotEqualTo(BigDecimal value) {
            addCriterion("RETURNSORTINGCENTERID <>", value, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridGreaterThan(BigDecimal value) {
            addCriterion("RETURNSORTINGCENTERID >", value, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNSORTINGCENTERID >=", value, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridLessThan(BigDecimal value) {
            addCriterion("RETURNSORTINGCENTERID <", value, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNSORTINGCENTERID <=", value, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridIn(List<BigDecimal> values) {
            addCriterion("RETURNSORTINGCENTERID in", values, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridNotIn(List<BigDecimal> values) {
            addCriterion("RETURNSORTINGCENTERID not in", values, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNSORTINGCENTERID between", value1, value2, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andReturnsortingcenteridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNSORTINGCENTERID not between", value1, value2, "returnsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andBoxnoIsNull() {
            addCriterion("BOXNO is null");
            return (Criteria) this;
        }

        public Criteria andBoxnoIsNotNull() {
            addCriterion("BOXNO is not null");
            return (Criteria) this;
        }

        public Criteria andBoxnoEqualTo(String value) {
            addCriterion("BOXNO =", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoNotEqualTo(String value) {
            addCriterion("BOXNO <>", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoGreaterThan(String value) {
            addCriterion("BOXNO >", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoGreaterThanOrEqualTo(String value) {
            addCriterion("BOXNO >=", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoLessThan(String value) {
            addCriterion("BOXNO <", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoLessThanOrEqualTo(String value) {
            addCriterion("BOXNO <=", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoLike(String value) {
            addCriterion("BOXNO like", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoNotLike(String value) {
            addCriterion("BOXNO not like", value, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoIn(List<String> values) {
            addCriterion("BOXNO in", values, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoNotIn(List<String> values) {
            addCriterion("BOXNO not in", values, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoBetween(String value1, String value2) {
            addCriterion("BOXNO between", value1, value2, "boxno");
            return (Criteria) this;
        }

        public Criteria andBoxnoNotBetween(String value1, String value2) {
            addCriterion("BOXNO not between", value1, value2, "boxno");
            return (Criteria) this;
        }

        public Criteria andMaincodeIsNull() {
            addCriterion("MAINCODE is null");
            return (Criteria) this;
        }

        public Criteria andMaincodeIsNotNull() {
            addCriterion("MAINCODE is not null");
            return (Criteria) this;
        }

        public Criteria andMaincodeEqualTo(String value) {
            addCriterion("MAINCODE =", value, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeNotEqualTo(String value) {
            addCriterion("MAINCODE <>", value, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeGreaterThan(String value) {
            addCriterion("MAINCODE >", value, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeGreaterThanOrEqualTo(String value) {
            addCriterion("MAINCODE >=", value, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeLessThan(String value) {
            addCriterion("MAINCODE <", value, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeLessThanOrEqualTo(String value) {
            addCriterion("MAINCODE <=", value, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeLike(String value) {
            addCriterion("MAINCODE like", value, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeNotLike(String value) {
            addCriterion("MAINCODE not like", value, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeIn(List<String> values) {
            addCriterion("MAINCODE in", values, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeNotIn(List<String> values) {
            addCriterion("MAINCODE not in", values, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeBetween(String value1, String value2) {
            addCriterion("MAINCODE between", value1, value2, "maincode");
            return (Criteria) this;
        }

        public Criteria andMaincodeNotBetween(String value1, String value2) {
            addCriterion("MAINCODE not between", value1, value2, "maincode");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNull() {
            addCriterion("DELIVERYDATE is null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIsNotNull() {
            addCriterion("DELIVERYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverydateEqualTo(Date value) {
            addCriterion("DELIVERYDATE =", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotEqualTo(Date value) {
            addCriterion("DELIVERYDATE <>", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThan(Date value) {
            addCriterion("DELIVERYDATE >", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERYDATE >=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThan(Date value) {
            addCriterion("DELIVERYDATE <", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERYDATE <=", value, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateIn(List<Date> values) {
            addCriterion("DELIVERYDATE in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotIn(List<Date> values) {
            addCriterion("DELIVERYDATE not in", values, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateBetween(Date value1, Date value2) {
            addCriterion("DELIVERYDATE between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andDeliverydateNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERYDATE not between", value1, value2, "deliverydate");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeIsNull() {
            addCriterion("PAYREASONCODE is null");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeIsNotNull() {
            addCriterion("PAYREASONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeEqualTo(String value) {
            addCriterion("PAYREASONCODE =", value, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeNotEqualTo(String value) {
            addCriterion("PAYREASONCODE <>", value, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeGreaterThan(String value) {
            addCriterion("PAYREASONCODE >", value, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYREASONCODE >=", value, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeLessThan(String value) {
            addCriterion("PAYREASONCODE <", value, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeLessThanOrEqualTo(String value) {
            addCriterion("PAYREASONCODE <=", value, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeLike(String value) {
            addCriterion("PAYREASONCODE like", value, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeNotLike(String value) {
            addCriterion("PAYREASONCODE not like", value, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeIn(List<String> values) {
            addCriterion("PAYREASONCODE in", values, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeNotIn(List<String> values) {
            addCriterion("PAYREASONCODE not in", values, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeBetween(String value1, String value2) {
            addCriterion("PAYREASONCODE between", value1, value2, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andPayreasoncodeNotBetween(String value1, String value2) {
            addCriterion("PAYREASONCODE not between", value1, value2, "payreasoncode");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridIsNull() {
            addCriterion("LASTSORTINGCENTERID is null");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridIsNotNull() {
            addCriterion("LASTSORTINGCENTERID is not null");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridEqualTo(BigDecimal value) {
            addCriterion("LASTSORTINGCENTERID =", value, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridNotEqualTo(BigDecimal value) {
            addCriterion("LASTSORTINGCENTERID <>", value, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridGreaterThan(BigDecimal value) {
            addCriterion("LASTSORTINGCENTERID >", value, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LASTSORTINGCENTERID >=", value, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridLessThan(BigDecimal value) {
            addCriterion("LASTSORTINGCENTERID <", value, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LASTSORTINGCENTERID <=", value, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridIn(List<BigDecimal> values) {
            addCriterion("LASTSORTINGCENTERID in", values, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridNotIn(List<BigDecimal> values) {
            addCriterion("LASTSORTINGCENTERID not in", values, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LASTSORTINGCENTERID between", value1, value2, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLastsortingcenteridNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LASTSORTINGCENTERID not between", value1, value2, "lastsortingcenterid");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeIsNull() {
            addCriterion("LOADINGTIME is null");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeIsNotNull() {
            addCriterion("LOADINGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeEqualTo(Date value) {
            addCriterion("LOADINGTIME =", value, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeNotEqualTo(Date value) {
            addCriterion("LOADINGTIME <>", value, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeGreaterThan(Date value) {
            addCriterion("LOADINGTIME >", value, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LOADINGTIME >=", value, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeLessThan(Date value) {
            addCriterion("LOADINGTIME <", value, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeLessThanOrEqualTo(Date value) {
            addCriterion("LOADINGTIME <=", value, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeIn(List<Date> values) {
            addCriterion("LOADINGTIME in", values, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeNotIn(List<Date> values) {
            addCriterion("LOADINGTIME not in", values, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeBetween(Date value1, Date value2) {
            addCriterion("LOADINGTIME between", value1, value2, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andLoadingtimeNotBetween(Date value1, Date value2) {
            addCriterion("LOADINGTIME not between", value1, value2, "loadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeIsNull() {
            addCriterion("UNLOADINGTIME is null");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeIsNotNull() {
            addCriterion("UNLOADINGTIME is not null");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeEqualTo(Date value) {
            addCriterion("UNLOADINGTIME =", value, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeNotEqualTo(Date value) {
            addCriterion("UNLOADINGTIME <>", value, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeGreaterThan(Date value) {
            addCriterion("UNLOADINGTIME >", value, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UNLOADINGTIME >=", value, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeLessThan(Date value) {
            addCriterion("UNLOADINGTIME <", value, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeLessThanOrEqualTo(Date value) {
            addCriterion("UNLOADINGTIME <=", value, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeIn(List<Date> values) {
            addCriterion("UNLOADINGTIME in", values, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeNotIn(List<Date> values) {
            addCriterion("UNLOADINGTIME not in", values, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeBetween(Date value1, Date value2) {
            addCriterion("UNLOADINGTIME between", value1, value2, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andUnloadingtimeNotBetween(Date value1, Date value2) {
            addCriterion("UNLOADINGTIME not between", value1, value2, "unloadingtime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeIsNull() {
            addCriterion("PICKUPGOODSTIME is null");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeIsNotNull() {
            addCriterion("PICKUPGOODSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeEqualTo(Date value) {
            addCriterion("PICKUPGOODSTIME =", value, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeNotEqualTo(Date value) {
            addCriterion("PICKUPGOODSTIME <>", value, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeGreaterThan(Date value) {
            addCriterion("PICKUPGOODSTIME >", value, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("PICKUPGOODSTIME >=", value, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeLessThan(Date value) {
            addCriterion("PICKUPGOODSTIME <", value, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeLessThanOrEqualTo(Date value) {
            addCriterion("PICKUPGOODSTIME <=", value, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeIn(List<Date> values) {
            addCriterion("PICKUPGOODSTIME in", values, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeNotIn(List<Date> values) {
            addCriterion("PICKUPGOODSTIME not in", values, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeBetween(Date value1, Date value2) {
            addCriterion("PICKUPGOODSTIME between", value1, value2, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andPickupgoodstimeNotBetween(Date value1, Date value2) {
            addCriterion("PICKUPGOODSTIME not between", value1, value2, "pickupgoodstime");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberIsNull() {
            addCriterion("BANKCARDNUMBER is null");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberIsNotNull() {
            addCriterion("BANKCARDNUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberEqualTo(String value) {
            addCriterion("BANKCARDNUMBER =", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotEqualTo(String value) {
            addCriterion("BANKCARDNUMBER <>", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberGreaterThan(String value) {
            addCriterion("BANKCARDNUMBER >", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCARDNUMBER >=", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberLessThan(String value) {
            addCriterion("BANKCARDNUMBER <", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberLessThanOrEqualTo(String value) {
            addCriterion("BANKCARDNUMBER <=", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberLike(String value) {
            addCriterion("BANKCARDNUMBER like", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotLike(String value) {
            addCriterion("BANKCARDNUMBER not like", value, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberIn(List<String> values) {
            addCriterion("BANKCARDNUMBER in", values, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotIn(List<String> values) {
            addCriterion("BANKCARDNUMBER not in", values, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberBetween(String value1, String value2) {
            addCriterion("BANKCARDNUMBER between", value1, value2, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnumberNotBetween(String value1, String value2) {
            addCriterion("BANKCARDNUMBER not between", value1, value2, "bankcardnumber");
            return (Criteria) this;
        }

        public Criteria andBankcardnameIsNull() {
            addCriterion("BANKCARDNAME is null");
            return (Criteria) this;
        }

        public Criteria andBankcardnameIsNotNull() {
            addCriterion("BANKCARDNAME is not null");
            return (Criteria) this;
        }

        public Criteria andBankcardnameEqualTo(String value) {
            addCriterion("BANKCARDNAME =", value, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameNotEqualTo(String value) {
            addCriterion("BANKCARDNAME <>", value, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameGreaterThan(String value) {
            addCriterion("BANKCARDNAME >", value, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCARDNAME >=", value, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameLessThan(String value) {
            addCriterion("BANKCARDNAME <", value, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameLessThanOrEqualTo(String value) {
            addCriterion("BANKCARDNAME <=", value, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameLike(String value) {
            addCriterion("BANKCARDNAME like", value, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameNotLike(String value) {
            addCriterion("BANKCARDNAME not like", value, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameIn(List<String> values) {
            addCriterion("BANKCARDNAME in", values, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameNotIn(List<String> values) {
            addCriterion("BANKCARDNAME not in", values, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameBetween(String value1, String value2) {
            addCriterion("BANKCARDNAME between", value1, value2, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andBankcardnameNotBetween(String value1, String value2) {
            addCriterion("BANKCARDNAME not between", value1, value2, "bankcardname");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("COUNTRY is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("COUNTRY is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("COUNTRY =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("COUNTRY <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("COUNTRY >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("COUNTRY >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("COUNTRY <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("COUNTRY <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("COUNTRY like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("COUNTRY not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("COUNTRY in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("COUNTRY not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("COUNTRY between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("COUNTRY not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentIsNull() {
            addCriterion("GOODSPAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentIsNotNull() {
            addCriterion("GOODSPAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentEqualTo(BigDecimal value) {
            addCriterion("GOODSPAYMENT =", value, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentNotEqualTo(BigDecimal value) {
            addCriterion("GOODSPAYMENT <>", value, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentGreaterThan(BigDecimal value) {
            addCriterion("GOODSPAYMENT >", value, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSPAYMENT >=", value, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentLessThan(BigDecimal value) {
            addCriterion("GOODSPAYMENT <", value, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODSPAYMENT <=", value, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentIn(List<BigDecimal> values) {
            addCriterion("GOODSPAYMENT in", values, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentNotIn(List<BigDecimal> values) {
            addCriterion("GOODSPAYMENT not in", values, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSPAYMENT between", value1, value2, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andGoodspaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODSPAYMENT not between", value1, value2, "goodspayment");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceIsNull() {
            addCriterion("ORDERREALSOURCE is null");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceIsNotNull() {
            addCriterion("ORDERREALSOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceEqualTo(String value) {
            addCriterion("ORDERREALSOURCE =", value, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceNotEqualTo(String value) {
            addCriterion("ORDERREALSOURCE <>", value, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceGreaterThan(String value) {
            addCriterion("ORDERREALSOURCE >", value, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceGreaterThanOrEqualTo(String value) {
            addCriterion("ORDERREALSOURCE >=", value, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceLessThan(String value) {
            addCriterion("ORDERREALSOURCE <", value, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceLessThanOrEqualTo(String value) {
            addCriterion("ORDERREALSOURCE <=", value, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceLike(String value) {
            addCriterion("ORDERREALSOURCE like", value, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceNotLike(String value) {
            addCriterion("ORDERREALSOURCE not like", value, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceIn(List<String> values) {
            addCriterion("ORDERREALSOURCE in", values, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceNotIn(List<String> values) {
            addCriterion("ORDERREALSOURCE not in", values, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceBetween(String value1, String value2) {
            addCriterion("ORDERREALSOURCE between", value1, value2, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andOrderrealsourceNotBetween(String value1, String value2) {
            addCriterion("ORDERREALSOURCE not between", value1, value2, "orderrealsource");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeIsNull() {
            addCriterion("REALBACKSTATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeIsNotNull() {
            addCriterion("REALBACKSTATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeEqualTo(Date value) {
            addCriterion("REALBACKSTATIONTIME =", value, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeNotEqualTo(Date value) {
            addCriterion("REALBACKSTATIONTIME <>", value, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeGreaterThan(Date value) {
            addCriterion("REALBACKSTATIONTIME >", value, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("REALBACKSTATIONTIME >=", value, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeLessThan(Date value) {
            addCriterion("REALBACKSTATIONTIME <", value, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeLessThanOrEqualTo(Date value) {
            addCriterion("REALBACKSTATIONTIME <=", value, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeIn(List<Date> values) {
            addCriterion("REALBACKSTATIONTIME in", values, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeNotIn(List<Date> values) {
            addCriterion("REALBACKSTATIONTIME not in", values, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeBetween(Date value1, Date value2) {
            addCriterion("REALBACKSTATIONTIME between", value1, value2, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andRealbackstationtimeNotBetween(Date value1, Date value2) {
            addCriterion("REALBACKSTATIONTIME not between", value1, value2, "realbackstationtime");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsIsNull() {
            addCriterion("ISSENDHUODONGSMS is null");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsIsNotNull() {
            addCriterion("ISSENDHUODONGSMS is not null");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsEqualTo(BigDecimal value) {
            addCriterion("ISSENDHUODONGSMS =", value, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsNotEqualTo(BigDecimal value) {
            addCriterion("ISSENDHUODONGSMS <>", value, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsGreaterThan(BigDecimal value) {
            addCriterion("ISSENDHUODONGSMS >", value, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSENDHUODONGSMS >=", value, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsLessThan(BigDecimal value) {
            addCriterion("ISSENDHUODONGSMS <", value, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSENDHUODONGSMS <=", value, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsIn(List<BigDecimal> values) {
            addCriterion("ISSENDHUODONGSMS in", values, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsNotIn(List<BigDecimal> values) {
            addCriterion("ISSENDHUODONGSMS not in", values, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSENDHUODONGSMS between", value1, value2, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andIssendhuodongsmsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSENDHUODONGSMS not between", value1, value2, "issendhuodongsms");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateIsNull() {
            addCriterion("SENDHUODONGSMSDATE is null");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateIsNotNull() {
            addCriterion("SENDHUODONGSMSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateEqualTo(Date value) {
            addCriterion("SENDHUODONGSMSDATE =", value, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateNotEqualTo(Date value) {
            addCriterion("SENDHUODONGSMSDATE <>", value, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateGreaterThan(Date value) {
            addCriterion("SENDHUODONGSMSDATE >", value, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateGreaterThanOrEqualTo(Date value) {
            addCriterion("SENDHUODONGSMSDATE >=", value, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateLessThan(Date value) {
            addCriterion("SENDHUODONGSMSDATE <", value, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateLessThanOrEqualTo(Date value) {
            addCriterion("SENDHUODONGSMSDATE <=", value, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateIn(List<Date> values) {
            addCriterion("SENDHUODONGSMSDATE in", values, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateNotIn(List<Date> values) {
            addCriterion("SENDHUODONGSMSDATE not in", values, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateBetween(Date value1, Date value2) {
            addCriterion("SENDHUODONGSMSDATE between", value1, value2, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andSendhuodongsmsdateNotBetween(Date value1, Date value2) {
            addCriterion("SENDHUODONGSMSDATE not between", value1, value2, "sendhuodongsmsdate");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlIsNull() {
            addCriterion("DIGITALSIGNATUREURL is null");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlIsNotNull() {
            addCriterion("DIGITALSIGNATUREURL is not null");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlEqualTo(String value) {
            addCriterion("DIGITALSIGNATUREURL =", value, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlNotEqualTo(String value) {
            addCriterion("DIGITALSIGNATUREURL <>", value, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlGreaterThan(String value) {
            addCriterion("DIGITALSIGNATUREURL >", value, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlGreaterThanOrEqualTo(String value) {
            addCriterion("DIGITALSIGNATUREURL >=", value, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlLessThan(String value) {
            addCriterion("DIGITALSIGNATUREURL <", value, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlLessThanOrEqualTo(String value) {
            addCriterion("DIGITALSIGNATUREURL <=", value, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlLike(String value) {
            addCriterion("DIGITALSIGNATUREURL like", value, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlNotLike(String value) {
            addCriterion("DIGITALSIGNATUREURL not like", value, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlIn(List<String> values) {
            addCriterion("DIGITALSIGNATUREURL in", values, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlNotIn(List<String> values) {
            addCriterion("DIGITALSIGNATUREURL not in", values, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlBetween(String value1, String value2) {
            addCriterion("DIGITALSIGNATUREURL between", value1, value2, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andDigitalsignatureurlNotBetween(String value1, String value2) {
            addCriterion("DIGITALSIGNATUREURL not between", value1, value2, "digitalsignatureurl");
            return (Criteria) this;
        }

        public Criteria andTotownshipIsNull() {
            addCriterion("TOTOWNSHIP is null");
            return (Criteria) this;
        }

        public Criteria andTotownshipIsNotNull() {
            addCriterion("TOTOWNSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andTotownshipEqualTo(String value) {
            addCriterion("TOTOWNSHIP =", value, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipNotEqualTo(String value) {
            addCriterion("TOTOWNSHIP <>", value, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipGreaterThan(String value) {
            addCriterion("TOTOWNSHIP >", value, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipGreaterThanOrEqualTo(String value) {
            addCriterion("TOTOWNSHIP >=", value, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipLessThan(String value) {
            addCriterion("TOTOWNSHIP <", value, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipLessThanOrEqualTo(String value) {
            addCriterion("TOTOWNSHIP <=", value, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipLike(String value) {
            addCriterion("TOTOWNSHIP like", value, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipNotLike(String value) {
            addCriterion("TOTOWNSHIP not like", value, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipIn(List<String> values) {
            addCriterion("TOTOWNSHIP in", values, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipNotIn(List<String> values) {
            addCriterion("TOTOWNSHIP not in", values, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipBetween(String value1, String value2) {
            addCriterion("TOTOWNSHIP between", value1, value2, "totownship");
            return (Criteria) this;
        }

        public Criteria andTotownshipNotBetween(String value1, String value2) {
            addCriterion("TOTOWNSHIP not between", value1, value2, "totownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipIsNull() {
            addCriterion("FROMTOWNSHIP is null");
            return (Criteria) this;
        }

        public Criteria andFromtownshipIsNotNull() {
            addCriterion("FROMTOWNSHIP is not null");
            return (Criteria) this;
        }

        public Criteria andFromtownshipEqualTo(String value) {
            addCriterion("FROMTOWNSHIP =", value, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipNotEqualTo(String value) {
            addCriterion("FROMTOWNSHIP <>", value, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipGreaterThan(String value) {
            addCriterion("FROMTOWNSHIP >", value, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipGreaterThanOrEqualTo(String value) {
            addCriterion("FROMTOWNSHIP >=", value, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipLessThan(String value) {
            addCriterion("FROMTOWNSHIP <", value, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipLessThanOrEqualTo(String value) {
            addCriterion("FROMTOWNSHIP <=", value, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipLike(String value) {
            addCriterion("FROMTOWNSHIP like", value, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipNotLike(String value) {
            addCriterion("FROMTOWNSHIP not like", value, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipIn(List<String> values) {
            addCriterion("FROMTOWNSHIP in", values, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipNotIn(List<String> values) {
            addCriterion("FROMTOWNSHIP not in", values, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipBetween(String value1, String value2) {
            addCriterion("FROMTOWNSHIP between", value1, value2, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFromtownshipNotBetween(String value1, String value2) {
            addCriterion("FROMTOWNSHIP not between", value1, value2, "fromtownship");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidIsNull() {
            addCriterion("FIRSTINSTORESTATIONID is null");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidIsNotNull() {
            addCriterion("FIRSTINSTORESTATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidEqualTo(BigDecimal value) {
            addCriterion("FIRSTINSTORESTATIONID =", value, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidNotEqualTo(BigDecimal value) {
            addCriterion("FIRSTINSTORESTATIONID <>", value, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidGreaterThan(BigDecimal value) {
            addCriterion("FIRSTINSTORESTATIONID >", value, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSTINSTORESTATIONID >=", value, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidLessThan(BigDecimal value) {
            addCriterion("FIRSTINSTORESTATIONID <", value, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSTINSTORESTATIONID <=", value, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidIn(List<BigDecimal> values) {
            addCriterion("FIRSTINSTORESTATIONID in", values, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidNotIn(List<BigDecimal> values) {
            addCriterion("FIRSTINSTORESTATIONID not in", values, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSTINSTORESTATIONID between", value1, value2, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstorestationidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSTINSTORESTATIONID not between", value1, value2, "firstinstorestationid");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeIsNull() {
            addCriterion("FIRSTINSTORETIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeIsNotNull() {
            addCriterion("FIRSTINSTORETIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeEqualTo(Date value) {
            addCriterion("FIRSTINSTORETIME =", value, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeNotEqualTo(Date value) {
            addCriterion("FIRSTINSTORETIME <>", value, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeGreaterThan(Date value) {
            addCriterion("FIRSTINSTORETIME >", value, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRSTINSTORETIME >=", value, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeLessThan(Date value) {
            addCriterion("FIRSTINSTORETIME <", value, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRSTINSTORETIME <=", value, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeIn(List<Date> values) {
            addCriterion("FIRSTINSTORETIME in", values, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeNotIn(List<Date> values) {
            addCriterion("FIRSTINSTORETIME not in", values, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeBetween(Date value1, Date value2) {
            addCriterion("FIRSTINSTORETIME between", value1, value2, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstinstoretimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRSTINSTORETIME not between", value1, value2, "firstinstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeIsNull() {
            addCriterion("FIRSTOUTSTORETIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeIsNotNull() {
            addCriterion("FIRSTOUTSTORETIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeEqualTo(Date value) {
            addCriterion("FIRSTOUTSTORETIME =", value, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeNotEqualTo(Date value) {
            addCriterion("FIRSTOUTSTORETIME <>", value, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeGreaterThan(Date value) {
            addCriterion("FIRSTOUTSTORETIME >", value, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRSTOUTSTORETIME >=", value, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeLessThan(Date value) {
            addCriterion("FIRSTOUTSTORETIME <", value, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRSTOUTSTORETIME <=", value, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeIn(List<Date> values) {
            addCriterion("FIRSTOUTSTORETIME in", values, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeNotIn(List<Date> values) {
            addCriterion("FIRSTOUTSTORETIME not in", values, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeBetween(Date value1, Date value2) {
            addCriterion("FIRSTOUTSTORETIME between", value1, value2, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andFirstoutstoretimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRSTOUTSTORETIME not between", value1, value2, "firstoutstoretime");
            return (Criteria) this;
        }

        public Criteria andSubabnormalIsNull() {
            addCriterion("SUBABNORMAL is null");
            return (Criteria) this;
        }

        public Criteria andSubabnormalIsNotNull() {
            addCriterion("SUBABNORMAL is not null");
            return (Criteria) this;
        }

        public Criteria andSubabnormalEqualTo(BigDecimal value) {
            addCriterion("SUBABNORMAL =", value, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andSubabnormalNotEqualTo(BigDecimal value) {
            addCriterion("SUBABNORMAL <>", value, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andSubabnormalGreaterThan(BigDecimal value) {
            addCriterion("SUBABNORMAL >", value, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andSubabnormalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBABNORMAL >=", value, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andSubabnormalLessThan(BigDecimal value) {
            addCriterion("SUBABNORMAL <", value, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andSubabnormalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBABNORMAL <=", value, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andSubabnormalIn(List<BigDecimal> values) {
            addCriterion("SUBABNORMAL in", values, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andSubabnormalNotIn(List<BigDecimal> values) {
            addCriterion("SUBABNORMAL not in", values, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andSubabnormalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBABNORMAL between", value1, value2, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andSubabnormalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBABNORMAL not between", value1, value2, "subabnormal");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeIsNull() {
            addCriterion("EXPRESSSERVICEFEE is null");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeIsNotNull() {
            addCriterion("EXPRESSSERVICEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeEqualTo(BigDecimal value) {
            addCriterion("EXPRESSSERVICEFEE =", value, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeNotEqualTo(BigDecimal value) {
            addCriterion("EXPRESSSERVICEFEE <>", value, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeGreaterThan(BigDecimal value) {
            addCriterion("EXPRESSSERVICEFEE >", value, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSSERVICEFEE >=", value, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeLessThan(BigDecimal value) {
            addCriterion("EXPRESSSERVICEFEE <", value, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSSERVICEFEE <=", value, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeIn(List<BigDecimal> values) {
            addCriterion("EXPRESSSERVICEFEE in", values, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeNotIn(List<BigDecimal> values) {
            addCriterion("EXPRESSSERVICEFEE not in", values, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSSERVICEFEE between", value1, value2, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressservicefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSSERVICEFEE not between", value1, value2, "expressservicefee");
            return (Criteria) this;
        }

        public Criteria andPickupcarIsNull() {
            addCriterion("PICKUPCAR is null");
            return (Criteria) this;
        }

        public Criteria andPickupcarIsNotNull() {
            addCriterion("PICKUPCAR is not null");
            return (Criteria) this;
        }

        public Criteria andPickupcarEqualTo(String value) {
            addCriterion("PICKUPCAR =", value, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarNotEqualTo(String value) {
            addCriterion("PICKUPCAR <>", value, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarGreaterThan(String value) {
            addCriterion("PICKUPCAR >", value, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarGreaterThanOrEqualTo(String value) {
            addCriterion("PICKUPCAR >=", value, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarLessThan(String value) {
            addCriterion("PICKUPCAR <", value, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarLessThanOrEqualTo(String value) {
            addCriterion("PICKUPCAR <=", value, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarLike(String value) {
            addCriterion("PICKUPCAR like", value, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarNotLike(String value) {
            addCriterion("PICKUPCAR not like", value, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarIn(List<String> values) {
            addCriterion("PICKUPCAR in", values, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarNotIn(List<String> values) {
            addCriterion("PICKUPCAR not in", values, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarBetween(String value1, String value2) {
            addCriterion("PICKUPCAR between", value1, value2, "pickupcar");
            return (Criteria) this;
        }

        public Criteria andPickupcarNotBetween(String value1, String value2) {
            addCriterion("PICKUPCAR not between", value1, value2, "pickupcar");
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
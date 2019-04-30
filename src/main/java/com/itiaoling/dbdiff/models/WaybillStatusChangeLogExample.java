package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WaybillStatusChangeLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WaybillStatusChangeLogExample() {
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

        public Criteria andWaybillstatuschangelogidIsNull() {
            addCriterion("WAYBILLSTATUSCHANGELOGID is null");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidIsNotNull() {
            addCriterion("WAYBILLSTATUSCHANGELOGID is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidEqualTo(BigDecimal value) {
            addCriterion("WAYBILLSTATUSCHANGELOGID =", value, "waybillstatuschangelogid");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidNotEqualTo(BigDecimal value) {
            addCriterion("WAYBILLSTATUSCHANGELOGID <>", value, "waybillstatuschangelogid");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidGreaterThan(BigDecimal value) {
            addCriterion("WAYBILLSTATUSCHANGELOGID >", value, "waybillstatuschangelogid");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAYBILLSTATUSCHANGELOGID >=", value, "waybillstatuschangelogid");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidLessThan(BigDecimal value) {
            addCriterion("WAYBILLSTATUSCHANGELOGID <", value, "waybillstatuschangelogid");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAYBILLSTATUSCHANGELOGID <=", value, "waybillstatuschangelogid");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidIn(List<BigDecimal> values) {
            addCriterion("WAYBILLSTATUSCHANGELOGID in", values, "waybillstatuschangelogid");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidNotIn(List<BigDecimal> values) {
            addCriterion("WAYBILLSTATUSCHANGELOGID not in", values, "waybillstatuschangelogid");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAYBILLSTATUSCHANGELOGID between", value1, value2, "waybillstatuschangelogid");
            return (Criteria) this;
        }

        public Criteria andWaybillstatuschangelogidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAYBILLSTATUSCHANGELOGID not between", value1, value2, "waybillstatuschangelogid");
            return (Criteria) this;
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

        public Criteria andCurnodeIsNull() {
            addCriterion("CURNODE is null");
            return (Criteria) this;
        }

        public Criteria andCurnodeIsNotNull() {
            addCriterion("CURNODE is not null");
            return (Criteria) this;
        }

        public Criteria andCurnodeEqualTo(BigDecimal value) {
            addCriterion("CURNODE =", value, "curnode");
            return (Criteria) this;
        }

        public Criteria andCurnodeNotEqualTo(BigDecimal value) {
            addCriterion("CURNODE <>", value, "curnode");
            return (Criteria) this;
        }

        public Criteria andCurnodeGreaterThan(BigDecimal value) {
            addCriterion("CURNODE >", value, "curnode");
            return (Criteria) this;
        }

        public Criteria andCurnodeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CURNODE >=", value, "curnode");
            return (Criteria) this;
        }

        public Criteria andCurnodeLessThan(BigDecimal value) {
            addCriterion("CURNODE <", value, "curnode");
            return (Criteria) this;
        }

        public Criteria andCurnodeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CURNODE <=", value, "curnode");
            return (Criteria) this;
        }

        public Criteria andCurnodeIn(List<BigDecimal> values) {
            addCriterion("CURNODE in", values, "curnode");
            return (Criteria) this;
        }

        public Criteria andCurnodeNotIn(List<BigDecimal> values) {
            addCriterion("CURNODE not in", values, "curnode");
            return (Criteria) this;
        }

        public Criteria andCurnodeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURNODE between", value1, value2, "curnode");
            return (Criteria) this;
        }

        public Criteria andCurnodeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CURNODE not between", value1, value2, "curnode");
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

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSubstatusIsNull() {
            addCriterion("SUBSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSubstatusIsNotNull() {
            addCriterion("SUBSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSubstatusEqualTo(BigDecimal value) {
            addCriterion("SUBSTATUS =", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusNotEqualTo(BigDecimal value) {
            addCriterion("SUBSTATUS <>", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusGreaterThan(BigDecimal value) {
            addCriterion("SUBSTATUS >", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBSTATUS >=", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusLessThan(BigDecimal value) {
            addCriterion("SUBSTATUS <", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBSTATUS <=", value, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusIn(List<BigDecimal> values) {
            addCriterion("SUBSTATUS in", values, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusNotIn(List<BigDecimal> values) {
            addCriterion("SUBSTATUS not in", values, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBSTATUS between", value1, value2, "substatus");
            return (Criteria) this;
        }

        public Criteria andSubstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBSTATUS not between", value1, value2, "substatus");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNull() {
            addCriterion("MERCHANTID is null");
            return (Criteria) this;
        }

        public Criteria andMerchantidIsNotNull() {
            addCriterion("MERCHANTID is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantidEqualTo(BigDecimal value) {
            addCriterion("MERCHANTID =", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotEqualTo(BigDecimal value) {
            addCriterion("MERCHANTID <>", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThan(BigDecimal value) {
            addCriterion("MERCHANTID >", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MERCHANTID >=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThan(BigDecimal value) {
            addCriterion("MERCHANTID <", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MERCHANTID <=", value, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidIn(List<BigDecimal> values) {
            addCriterion("MERCHANTID in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotIn(List<BigDecimal> values) {
            addCriterion("MERCHANTID not in", values, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERCHANTID between", value1, value2, "merchantid");
            return (Criteria) this;
        }

        public Criteria andMerchantidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MERCHANTID not between", value1, value2, "merchantid");
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

        public Criteria andDeliverstationidIsNull() {
            addCriterion("DELIVERSTATIONID is null");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidIsNotNull() {
            addCriterion("DELIVERSTATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidEqualTo(BigDecimal value) {
            addCriterion("DELIVERSTATIONID =", value, "deliverstationid");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidNotEqualTo(BigDecimal value) {
            addCriterion("DELIVERSTATIONID <>", value, "deliverstationid");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidGreaterThan(BigDecimal value) {
            addCriterion("DELIVERSTATIONID >", value, "deliverstationid");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERSTATIONID >=", value, "deliverstationid");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidLessThan(BigDecimal value) {
            addCriterion("DELIVERSTATIONID <", value, "deliverstationid");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERSTATIONID <=", value, "deliverstationid");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidIn(List<BigDecimal> values) {
            addCriterion("DELIVERSTATIONID in", values, "deliverstationid");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidNotIn(List<BigDecimal> values) {
            addCriterion("DELIVERSTATIONID not in", values, "deliverstationid");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERSTATIONID between", value1, value2, "deliverstationid");
            return (Criteria) this;
        }

        public Criteria andDeliverstationidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERSTATIONID not between", value1, value2, "deliverstationid");
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

        public Criteria andCreatestationIsNull() {
            addCriterion("CREATESTATION is null");
            return (Criteria) this;
        }

        public Criteria andCreatestationIsNotNull() {
            addCriterion("CREATESTATION is not null");
            return (Criteria) this;
        }

        public Criteria andCreatestationEqualTo(BigDecimal value) {
            addCriterion("CREATESTATION =", value, "createstation");
            return (Criteria) this;
        }

        public Criteria andCreatestationNotEqualTo(BigDecimal value) {
            addCriterion("CREATESTATION <>", value, "createstation");
            return (Criteria) this;
        }

        public Criteria andCreatestationGreaterThan(BigDecimal value) {
            addCriterion("CREATESTATION >", value, "createstation");
            return (Criteria) this;
        }

        public Criteria andCreatestationGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATESTATION >=", value, "createstation");
            return (Criteria) this;
        }

        public Criteria andCreatestationLessThan(BigDecimal value) {
            addCriterion("CREATESTATION <", value, "createstation");
            return (Criteria) this;
        }

        public Criteria andCreatestationLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CREATESTATION <=", value, "createstation");
            return (Criteria) this;
        }

        public Criteria andCreatestationIn(List<BigDecimal> values) {
            addCriterion("CREATESTATION in", values, "createstation");
            return (Criteria) this;
        }

        public Criteria andCreatestationNotIn(List<BigDecimal> values) {
            addCriterion("CREATESTATION not in", values, "createstation");
            return (Criteria) this;
        }

        public Criteria andCreatestationBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATESTATION between", value1, value2, "createstation");
            return (Criteria) this;
        }

        public Criteria andCreatestationNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CREATESTATION not between", value1, value2, "createstation");
            return (Criteria) this;
        }

        public Criteria andIssynIsNull() {
            addCriterion("ISSYN is null");
            return (Criteria) this;
        }

        public Criteria andIssynIsNotNull() {
            addCriterion("ISSYN is not null");
            return (Criteria) this;
        }

        public Criteria andIssynEqualTo(BigDecimal value) {
            addCriterion("ISSYN =", value, "issyn");
            return (Criteria) this;
        }

        public Criteria andIssynNotEqualTo(BigDecimal value) {
            addCriterion("ISSYN <>", value, "issyn");
            return (Criteria) this;
        }

        public Criteria andIssynGreaterThan(BigDecimal value) {
            addCriterion("ISSYN >", value, "issyn");
            return (Criteria) this;
        }

        public Criteria andIssynGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYN >=", value, "issyn");
            return (Criteria) this;
        }

        public Criteria andIssynLessThan(BigDecimal value) {
            addCriterion("ISSYN <", value, "issyn");
            return (Criteria) this;
        }

        public Criteria andIssynLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYN <=", value, "issyn");
            return (Criteria) this;
        }

        public Criteria andIssynIn(List<BigDecimal> values) {
            addCriterion("ISSYN in", values, "issyn");
            return (Criteria) this;
        }

        public Criteria andIssynNotIn(List<BigDecimal> values) {
            addCriterion("ISSYN not in", values, "issyn");
            return (Criteria) this;
        }

        public Criteria andIssynBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYN between", value1, value2, "issyn");
            return (Criteria) this;
        }

        public Criteria andIssynNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYN not between", value1, value2, "issyn");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIsNull() {
            addCriterion("CUSTOMERORDER is null");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIsNotNull() {
            addCriterion("CUSTOMERORDER is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerorderEqualTo(String value) {
            addCriterion("CUSTOMERORDER =", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderNotEqualTo(String value) {
            addCriterion("CUSTOMERORDER <>", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderGreaterThan(String value) {
            addCriterion("CUSTOMERORDER >", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMERORDER >=", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderLessThan(String value) {
            addCriterion("CUSTOMERORDER <", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMERORDER <=", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderLike(String value) {
            addCriterion("CUSTOMERORDER like", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderNotLike(String value) {
            addCriterion("CUSTOMERORDER not like", value, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderIn(List<String> values) {
            addCriterion("CUSTOMERORDER in", values, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderNotIn(List<String> values) {
            addCriterion("CUSTOMERORDER not in", values, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderBetween(String value1, String value2) {
            addCriterion("CUSTOMERORDER between", value1, value2, "customerorder");
            return (Criteria) this;
        }

        public Criteria andCustomerorderNotBetween(String value1, String value2) {
            addCriterion("CUSTOMERORDER not between", value1, value2, "customerorder");
            return (Criteria) this;
        }

        public Criteria andIsbisynIsNull() {
            addCriterion("ISBISYN is null");
            return (Criteria) this;
        }

        public Criteria andIsbisynIsNotNull() {
            addCriterion("ISBISYN is not null");
            return (Criteria) this;
        }

        public Criteria andIsbisynEqualTo(BigDecimal value) {
            addCriterion("ISBISYN =", value, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andIsbisynNotEqualTo(BigDecimal value) {
            addCriterion("ISBISYN <>", value, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andIsbisynGreaterThan(BigDecimal value) {
            addCriterion("ISBISYN >", value, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andIsbisynGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISBISYN >=", value, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andIsbisynLessThan(BigDecimal value) {
            addCriterion("ISBISYN <", value, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andIsbisynLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISBISYN <=", value, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andIsbisynIn(List<BigDecimal> values) {
            addCriterion("ISBISYN in", values, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andIsbisynNotIn(List<BigDecimal> values) {
            addCriterion("ISBISYN not in", values, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andIsbisynBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISBISYN between", value1, value2, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andIsbisynNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISBISYN not between", value1, value2, "isbisyn");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidIsNull() {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID is null");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidIsNotNull() {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID is not null");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidEqualTo(String value) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID =", value, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidNotEqualTo(String value) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID <>", value, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidGreaterThan(String value) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID >", value, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidGreaterThanOrEqualTo(String value) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID >=", value, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidLessThan(String value) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID <", value, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidLessThanOrEqualTo(String value) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID <=", value, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidLike(String value) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID like", value, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidNotLike(String value) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID not like", value, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidIn(List<String> values) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID in", values, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidNotIn(List<String> values) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID not in", values, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidBetween(String value1, String value2) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID between", value1, value2, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andLmsWaybillstatuschangelogkidNotBetween(String value1, String value2) {
            addCriterion("LMS_WAYBILLSTATUSCHANGELOGKID not between", value1, value2, "lmsWaybillstatuschangelogkid");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynIsNull() {
            addCriterion("ISM2SSYN is null");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynIsNotNull() {
            addCriterion("ISM2SSYN is not null");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynEqualTo(String value) {
            addCriterion("ISM2SSYN =", value, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynNotEqualTo(String value) {
            addCriterion("ISM2SSYN <>", value, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynGreaterThan(String value) {
            addCriterion("ISM2SSYN >", value, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynGreaterThanOrEqualTo(String value) {
            addCriterion("ISM2SSYN >=", value, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynLessThan(String value) {
            addCriterion("ISM2SSYN <", value, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynLessThanOrEqualTo(String value) {
            addCriterion("ISM2SSYN <=", value, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynLike(String value) {
            addCriterion("ISM2SSYN like", value, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynNotLike(String value) {
            addCriterion("ISM2SSYN not like", value, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynIn(List<String> values) {
            addCriterion("ISM2SSYN in", values, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynNotIn(List<String> values) {
            addCriterion("ISM2SSYN not in", values, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynBetween(String value1, String value2) {
            addCriterion("ISM2SSYN between", value1, value2, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andIsm2ssynNotBetween(String value1, String value2) {
            addCriterion("ISM2SSYN not between", value1, value2, "ism2ssyn");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIsNull() {
            addCriterion("OPERATETYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIsNotNull() {
            addCriterion("OPERATETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetypeEqualTo(BigDecimal value) {
            addCriterion("OPERATETYPE =", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotEqualTo(BigDecimal value) {
            addCriterion("OPERATETYPE <>", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeGreaterThan(BigDecimal value) {
            addCriterion("OPERATETYPE >", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATETYPE >=", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeLessThan(BigDecimal value) {
            addCriterion("OPERATETYPE <", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATETYPE <=", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIn(List<BigDecimal> values) {
            addCriterion("OPERATETYPE in", values, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotIn(List<BigDecimal> values) {
            addCriterion("OPERATETYPE not in", values, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATETYPE between", value1, value2, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATETYPE not between", value1, value2, "operatetype");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusIsNull() {
            addCriterion("TMSSYNCSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusIsNotNull() {
            addCriterion("TMSSYNCSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusEqualTo(BigDecimal value) {
            addCriterion("TMSSYNCSTATUS =", value, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusNotEqualTo(BigDecimal value) {
            addCriterion("TMSSYNCSTATUS <>", value, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusGreaterThan(BigDecimal value) {
            addCriterion("TMSSYNCSTATUS >", value, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TMSSYNCSTATUS >=", value, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusLessThan(BigDecimal value) {
            addCriterion("TMSSYNCSTATUS <", value, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TMSSYNCSTATUS <=", value, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusIn(List<BigDecimal> values) {
            addCriterion("TMSSYNCSTATUS in", values, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusNotIn(List<BigDecimal> values) {
            addCriterion("TMSSYNCSTATUS not in", values, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMSSYNCSTATUS between", value1, value2, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andTmssyncstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TMSSYNCSTATUS not between", value1, value2, "tmssyncstatus");
            return (Criteria) this;
        }

        public Criteria andIssynfmsIsNull() {
            addCriterion("ISSYNFMS is null");
            return (Criteria) this;
        }

        public Criteria andIssynfmsIsNotNull() {
            addCriterion("ISSYNFMS is not null");
            return (Criteria) this;
        }

        public Criteria andIssynfmsEqualTo(BigDecimal value) {
            addCriterion("ISSYNFMS =", value, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynfmsNotEqualTo(BigDecimal value) {
            addCriterion("ISSYNFMS <>", value, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynfmsGreaterThan(BigDecimal value) {
            addCriterion("ISSYNFMS >", value, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynfmsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNFMS >=", value, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynfmsLessThan(BigDecimal value) {
            addCriterion("ISSYNFMS <", value, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynfmsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNFMS <=", value, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynfmsIn(List<BigDecimal> values) {
            addCriterion("ISSYNFMS in", values, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynfmsNotIn(List<BigDecimal> values) {
            addCriterion("ISSYNFMS not in", values, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynfmsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNFMS between", value1, value2, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynfmsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNFMS not between", value1, value2, "issynfms");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyIsNull() {
            addCriterion("ISSYNEFFICIENCY is null");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyIsNotNull() {
            addCriterion("ISSYNEFFICIENCY is not null");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyEqualTo(BigDecimal value) {
            addCriterion("ISSYNEFFICIENCY =", value, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyNotEqualTo(BigDecimal value) {
            addCriterion("ISSYNEFFICIENCY <>", value, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyGreaterThan(BigDecimal value) {
            addCriterion("ISSYNEFFICIENCY >", value, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNEFFICIENCY >=", value, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyLessThan(BigDecimal value) {
            addCriterion("ISSYNEFFICIENCY <", value, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNEFFICIENCY <=", value, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyIn(List<BigDecimal> values) {
            addCriterion("ISSYNEFFICIENCY in", values, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyNotIn(List<BigDecimal> values) {
            addCriterion("ISSYNEFFICIENCY not in", values, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNEFFICIENCY between", value1, value2, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynefficiencyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNEFFICIENCY not between", value1, value2, "issynefficiency");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorIsNull() {
            addCriterion("ISSYNMONITOR is null");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorIsNotNull() {
            addCriterion("ISSYNMONITOR is not null");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorEqualTo(BigDecimal value) {
            addCriterion("ISSYNMONITOR =", value, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorNotEqualTo(BigDecimal value) {
            addCriterion("ISSYNMONITOR <>", value, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorGreaterThan(BigDecimal value) {
            addCriterion("ISSYNMONITOR >", value, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNMONITOR >=", value, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorLessThan(BigDecimal value) {
            addCriterion("ISSYNMONITOR <", value, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNMONITOR <=", value, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorIn(List<BigDecimal> values) {
            addCriterion("ISSYNMONITOR in", values, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorNotIn(List<BigDecimal> values) {
            addCriterion("ISSYNMONITOR not in", values, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNMONITOR between", value1, value2, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIssynmonitorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNMONITOR not between", value1, value2, "issynmonitor");
            return (Criteria) this;
        }

        public Criteria andIschangeIsNull() {
            addCriterion("ISCHANGE is null");
            return (Criteria) this;
        }

        public Criteria andIschangeIsNotNull() {
            addCriterion("ISCHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andIschangeEqualTo(BigDecimal value) {
            addCriterion("ISCHANGE =", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeNotEqualTo(BigDecimal value) {
            addCriterion("ISCHANGE <>", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeGreaterThan(BigDecimal value) {
            addCriterion("ISCHANGE >", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCHANGE >=", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeLessThan(BigDecimal value) {
            addCriterion("ISCHANGE <", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCHANGE <=", value, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeIn(List<BigDecimal> values) {
            addCriterion("ISCHANGE in", values, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeNotIn(List<BigDecimal> values) {
            addCriterion("ISCHANGE not in", values, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCHANGE between", value1, value2, "ischange");
            return (Criteria) this;
        }

        public Criteria andIschangeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCHANGE not between", value1, value2, "ischange");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeIsNull() {
            addCriterion("TODISTRIBUTIONCODE is null");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeIsNotNull() {
            addCriterion("TODISTRIBUTIONCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeEqualTo(String value) {
            addCriterion("TODISTRIBUTIONCODE =", value, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeNotEqualTo(String value) {
            addCriterion("TODISTRIBUTIONCODE <>", value, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeGreaterThan(String value) {
            addCriterion("TODISTRIBUTIONCODE >", value, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("TODISTRIBUTIONCODE >=", value, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeLessThan(String value) {
            addCriterion("TODISTRIBUTIONCODE <", value, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeLessThanOrEqualTo(String value) {
            addCriterion("TODISTRIBUTIONCODE <=", value, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeLike(String value) {
            addCriterion("TODISTRIBUTIONCODE like", value, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeNotLike(String value) {
            addCriterion("TODISTRIBUTIONCODE not like", value, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeIn(List<String> values) {
            addCriterion("TODISTRIBUTIONCODE in", values, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeNotIn(List<String> values) {
            addCriterion("TODISTRIBUTIONCODE not in", values, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeBetween(String value1, String value2) {
            addCriterion("TODISTRIBUTIONCODE between", value1, value2, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andTodistributioncodeNotBetween(String value1, String value2) {
            addCriterion("TODISTRIBUTIONCODE not between", value1, value2, "todistributioncode");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidIsNull() {
            addCriterion("TOEXPRESSCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidIsNotNull() {
            addCriterion("TOEXPRESSCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidEqualTo(BigDecimal value) {
            addCriterion("TOEXPRESSCOMPANYID =", value, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidNotEqualTo(BigDecimal value) {
            addCriterion("TOEXPRESSCOMPANYID <>", value, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidGreaterThan(BigDecimal value) {
            addCriterion("TOEXPRESSCOMPANYID >", value, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOEXPRESSCOMPANYID >=", value, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidLessThan(BigDecimal value) {
            addCriterion("TOEXPRESSCOMPANYID <", value, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOEXPRESSCOMPANYID <=", value, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidIn(List<BigDecimal> values) {
            addCriterion("TOEXPRESSCOMPANYID in", values, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidNotIn(List<BigDecimal> values) {
            addCriterion("TOEXPRESSCOMPANYID not in", values, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOEXPRESSCOMPANYID between", value1, value2, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andToexpresscompanyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOEXPRESSCOMPANYID not between", value1, value2, "toexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andOperationIsNull() {
            addCriterion("OPERATION is null");
            return (Criteria) this;
        }

        public Criteria andOperationIsNotNull() {
            addCriterion("OPERATION is not null");
            return (Criteria) this;
        }

        public Criteria andOperationEqualTo(String value) {
            addCriterion("OPERATION =", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotEqualTo(String value) {
            addCriterion("OPERATION <>", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThan(String value) {
            addCriterion("OPERATION >", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATION >=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThan(String value) {
            addCriterion("OPERATION <", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLessThanOrEqualTo(String value) {
            addCriterion("OPERATION <=", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationLike(String value) {
            addCriterion("OPERATION like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotLike(String value) {
            addCriterion("OPERATION not like", value, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationIn(List<String> values) {
            addCriterion("OPERATION in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotIn(List<String> values) {
            addCriterion("OPERATION not in", values, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationBetween(String value1, String value2) {
            addCriterion("OPERATION between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andOperationNotBetween(String value1, String value2) {
            addCriterion("OPERATION not between", value1, value2, "operation");
            return (Criteria) this;
        }

        public Criteria andIscloudsynIsNull() {
            addCriterion("ISCLOUDSYN is null");
            return (Criteria) this;
        }

        public Criteria andIscloudsynIsNotNull() {
            addCriterion("ISCLOUDSYN is not null");
            return (Criteria) this;
        }

        public Criteria andIscloudsynEqualTo(BigDecimal value) {
            addCriterion("ISCLOUDSYN =", value, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIscloudsynNotEqualTo(BigDecimal value) {
            addCriterion("ISCLOUDSYN <>", value, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIscloudsynGreaterThan(BigDecimal value) {
            addCriterion("ISCLOUDSYN >", value, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIscloudsynGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCLOUDSYN >=", value, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIscloudsynLessThan(BigDecimal value) {
            addCriterion("ISCLOUDSYN <", value, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIscloudsynLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCLOUDSYN <=", value, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIscloudsynIn(List<BigDecimal> values) {
            addCriterion("ISCLOUDSYN in", values, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIscloudsynNotIn(List<BigDecimal> values) {
            addCriterion("ISCLOUDSYN not in", values, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIscloudsynBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCLOUDSYN between", value1, value2, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIscloudsynNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCLOUDSYN not between", value1, value2, "iscloudsyn");
            return (Criteria) this;
        }

        public Criteria andIssynediIsNull() {
            addCriterion("ISSYNEDI is null");
            return (Criteria) this;
        }

        public Criteria andIssynediIsNotNull() {
            addCriterion("ISSYNEDI is not null");
            return (Criteria) this;
        }

        public Criteria andIssynediEqualTo(BigDecimal value) {
            addCriterion("ISSYNEDI =", value, "issynedi");
            return (Criteria) this;
        }

        public Criteria andIssynediNotEqualTo(BigDecimal value) {
            addCriterion("ISSYNEDI <>", value, "issynedi");
            return (Criteria) this;
        }

        public Criteria andIssynediGreaterThan(BigDecimal value) {
            addCriterion("ISSYNEDI >", value, "issynedi");
            return (Criteria) this;
        }

        public Criteria andIssynediGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNEDI >=", value, "issynedi");
            return (Criteria) this;
        }

        public Criteria andIssynediLessThan(BigDecimal value) {
            addCriterion("ISSYNEDI <", value, "issynedi");
            return (Criteria) this;
        }

        public Criteria andIssynediLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNEDI <=", value, "issynedi");
            return (Criteria) this;
        }

        public Criteria andIssynediIn(List<BigDecimal> values) {
            addCriterion("ISSYNEDI in", values, "issynedi");
            return (Criteria) this;
        }

        public Criteria andIssynediNotIn(List<BigDecimal> values) {
            addCriterion("ISSYNEDI not in", values, "issynedi");
            return (Criteria) this;
        }

        public Criteria andIssynediBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNEDI between", value1, value2, "issynedi");
            return (Criteria) this;
        }

        public Criteria andIssynediNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNEDI not between", value1, value2, "issynedi");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidIsNull() {
            addCriterion("WAYBILLDEALID is null");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidIsNotNull() {
            addCriterion("WAYBILLDEALID is not null");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidEqualTo(BigDecimal value) {
            addCriterion("WAYBILLDEALID =", value, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidNotEqualTo(BigDecimal value) {
            addCriterion("WAYBILLDEALID <>", value, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidGreaterThan(BigDecimal value) {
            addCriterion("WAYBILLDEALID >", value, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAYBILLDEALID >=", value, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidLessThan(BigDecimal value) {
            addCriterion("WAYBILLDEALID <", value, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAYBILLDEALID <=", value, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidIn(List<BigDecimal> values) {
            addCriterion("WAYBILLDEALID in", values, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidNotIn(List<BigDecimal> values) {
            addCriterion("WAYBILLDEALID not in", values, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAYBILLDEALID between", value1, value2, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andWaybilldealidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAYBILLDEALID not between", value1, value2, "waybilldealid");
            return (Criteria) this;
        }

        public Criteria andIssyndeductIsNull() {
            addCriterion("ISSYNDEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andIssyndeductIsNotNull() {
            addCriterion("ISSYNDEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andIssyndeductEqualTo(BigDecimal value) {
            addCriterion("ISSYNDEDUCT =", value, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssyndeductNotEqualTo(BigDecimal value) {
            addCriterion("ISSYNDEDUCT <>", value, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssyndeductGreaterThan(BigDecimal value) {
            addCriterion("ISSYNDEDUCT >", value, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssyndeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNDEDUCT >=", value, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssyndeductLessThan(BigDecimal value) {
            addCriterion("ISSYNDEDUCT <", value, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssyndeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNDEDUCT <=", value, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssyndeductIn(List<BigDecimal> values) {
            addCriterion("ISSYNDEDUCT in", values, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssyndeductNotIn(List<BigDecimal> values) {
            addCriterion("ISSYNDEDUCT not in", values, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssyndeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNDEDUCT between", value1, value2, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssyndeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNDEDUCT not between", value1, value2, "issyndeduct");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleIsNull() {
            addCriterion("ISSYNLIFECYCLE is null");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleIsNotNull() {
            addCriterion("ISSYNLIFECYCLE is not null");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleEqualTo(BigDecimal value) {
            addCriterion("ISSYNLIFECYCLE =", value, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleNotEqualTo(BigDecimal value) {
            addCriterion("ISSYNLIFECYCLE <>", value, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleGreaterThan(BigDecimal value) {
            addCriterion("ISSYNLIFECYCLE >", value, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNLIFECYCLE >=", value, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleLessThan(BigDecimal value) {
            addCriterion("ISSYNLIFECYCLE <", value, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNLIFECYCLE <=", value, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleIn(List<BigDecimal> values) {
            addCriterion("ISSYNLIFECYCLE in", values, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleNotIn(List<BigDecimal> values) {
            addCriterion("ISSYNLIFECYCLE not in", values, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNLIFECYCLE between", value1, value2, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynlifecycleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNLIFECYCLE not between", value1, value2, "issynlifecycle");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsIsNull() {
            addCriterion("ISSYNBRAVETROOPS is null");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsIsNotNull() {
            addCriterion("ISSYNBRAVETROOPS is not null");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsEqualTo(BigDecimal value) {
            addCriterion("ISSYNBRAVETROOPS =", value, "issynbravetroops");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsNotEqualTo(BigDecimal value) {
            addCriterion("ISSYNBRAVETROOPS <>", value, "issynbravetroops");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsGreaterThan(BigDecimal value) {
            addCriterion("ISSYNBRAVETROOPS >", value, "issynbravetroops");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNBRAVETROOPS >=", value, "issynbravetroops");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsLessThan(BigDecimal value) {
            addCriterion("ISSYNBRAVETROOPS <", value, "issynbravetroops");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNBRAVETROOPS <=", value, "issynbravetroops");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsIn(List<BigDecimal> values) {
            addCriterion("ISSYNBRAVETROOPS in", values, "issynbravetroops");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsNotIn(List<BigDecimal> values) {
            addCriterion("ISSYNBRAVETROOPS not in", values, "issynbravetroops");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNBRAVETROOPS between", value1, value2, "issynbravetroops");
            return (Criteria) this;
        }

        public Criteria andIssynbravetroopsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNBRAVETROOPS not between", value1, value2, "issynbravetroops");
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
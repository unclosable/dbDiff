package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomeBaseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IncomeBaseinfoExample() {
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

        public Criteria andIncomeidIsNull() {
            addCriterion("INCOMEID is null");
            return (Criteria) this;
        }

        public Criteria andIncomeidIsNotNull() {
            addCriterion("INCOMEID is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeidEqualTo(BigDecimal value) {
            addCriterion("INCOMEID =", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidNotEqualTo(BigDecimal value) {
            addCriterion("INCOMEID <>", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidGreaterThan(BigDecimal value) {
            addCriterion("INCOMEID >", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEID >=", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidLessThan(BigDecimal value) {
            addCriterion("INCOMEID <", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEID <=", value, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidIn(List<BigDecimal> values) {
            addCriterion("INCOMEID in", values, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidNotIn(List<BigDecimal> values) {
            addCriterion("INCOMEID not in", values, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEID between", value1, value2, "incomeid");
            return (Criteria) this;
        }

        public Criteria andIncomeidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEID not between", value1, value2, "incomeid");
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

        public Criteria andWaybilltypeIsNull() {
            addCriterion("WAYBILLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeIsNotNull() {
            addCriterion("WAYBILLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeEqualTo(String value) {
            addCriterion("WAYBILLTYPE =", value, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeNotEqualTo(String value) {
            addCriterion("WAYBILLTYPE <>", value, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeGreaterThan(String value) {
            addCriterion("WAYBILLTYPE >", value, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeGreaterThanOrEqualTo(String value) {
            addCriterion("WAYBILLTYPE >=", value, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeLessThan(String value) {
            addCriterion("WAYBILLTYPE <", value, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeLessThanOrEqualTo(String value) {
            addCriterion("WAYBILLTYPE <=", value, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeLike(String value) {
            addCriterion("WAYBILLTYPE like", value, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeNotLike(String value) {
            addCriterion("WAYBILLTYPE not like", value, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeIn(List<String> values) {
            addCriterion("WAYBILLTYPE in", values, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeNotIn(List<String> values) {
            addCriterion("WAYBILLTYPE not in", values, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeBetween(String value1, String value2) {
            addCriterion("WAYBILLTYPE between", value1, value2, "waybilltype");
            return (Criteria) this;
        }

        public Criteria andWaybilltypeNotBetween(String value1, String value2) {
            addCriterion("WAYBILLTYPE not between", value1, value2, "waybilltype");
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

        public Criteria andFinalexpresscompanyidIsNull() {
            addCriterion("FINALEXPRESSCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidIsNotNull() {
            addCriterion("FINALEXPRESSCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidEqualTo(BigDecimal value) {
            addCriterion("FINALEXPRESSCOMPANYID =", value, "finalexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidNotEqualTo(BigDecimal value) {
            addCriterion("FINALEXPRESSCOMPANYID <>", value, "finalexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidGreaterThan(BigDecimal value) {
            addCriterion("FINALEXPRESSCOMPANYID >", value, "finalexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FINALEXPRESSCOMPANYID >=", value, "finalexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidLessThan(BigDecimal value) {
            addCriterion("FINALEXPRESSCOMPANYID <", value, "finalexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FINALEXPRESSCOMPANYID <=", value, "finalexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidIn(List<BigDecimal> values) {
            addCriterion("FINALEXPRESSCOMPANYID in", values, "finalexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidNotIn(List<BigDecimal> values) {
            addCriterion("FINALEXPRESSCOMPANYID not in", values, "finalexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINALEXPRESSCOMPANYID between", value1, value2, "finalexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andFinalexpresscompanyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FINALEXPRESSCOMPANYID not between", value1, value2, "finalexpresscompanyid");
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

        public Criteria andTopcodcompanyidIsNull() {
            addCriterion("TOPCODCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidIsNotNull() {
            addCriterion("TOPCODCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidEqualTo(BigDecimal value) {
            addCriterion("TOPCODCOMPANYID =", value, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidNotEqualTo(BigDecimal value) {
            addCriterion("TOPCODCOMPANYID <>", value, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidGreaterThan(BigDecimal value) {
            addCriterion("TOPCODCOMPANYID >", value, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOPCODCOMPANYID >=", value, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidLessThan(BigDecimal value) {
            addCriterion("TOPCODCOMPANYID <", value, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOPCODCOMPANYID <=", value, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidIn(List<BigDecimal> values) {
            addCriterion("TOPCODCOMPANYID in", values, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidNotIn(List<BigDecimal> values) {
            addCriterion("TOPCODCOMPANYID not in", values, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOPCODCOMPANYID between", value1, value2, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andTopcodcompanyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOPCODCOMPANYID not between", value1, value2, "topcodcompanyid");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeIsNull() {
            addCriterion("RFDACCEPTTIME is null");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeIsNotNull() {
            addCriterion("RFDACCEPTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeEqualTo(Date value) {
            addCriterion("RFDACCEPTTIME =", value, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeNotEqualTo(Date value) {
            addCriterion("RFDACCEPTTIME <>", value, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeGreaterThan(Date value) {
            addCriterion("RFDACCEPTTIME >", value, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RFDACCEPTTIME >=", value, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeLessThan(Date value) {
            addCriterion("RFDACCEPTTIME <", value, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeLessThanOrEqualTo(Date value) {
            addCriterion("RFDACCEPTTIME <=", value, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeIn(List<Date> values) {
            addCriterion("RFDACCEPTTIME in", values, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeNotIn(List<Date> values) {
            addCriterion("RFDACCEPTTIME not in", values, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeBetween(Date value1, Date value2) {
            addCriterion("RFDACCEPTTIME between", value1, value2, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andRfdaccepttimeNotBetween(Date value1, Date value2) {
            addCriterion("RFDACCEPTTIME not between", value1, value2, "rfdaccepttime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeIsNull() {
            addCriterion("DELIVERTIME is null");
            return (Criteria) this;
        }

        public Criteria andDelivertimeIsNotNull() {
            addCriterion("DELIVERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDelivertimeEqualTo(Date value) {
            addCriterion("DELIVERTIME =", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeNotEqualTo(Date value) {
            addCriterion("DELIVERTIME <>", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeGreaterThan(Date value) {
            addCriterion("DELIVERTIME >", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERTIME >=", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeLessThan(Date value) {
            addCriterion("DELIVERTIME <", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERTIME <=", value, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeIn(List<Date> values) {
            addCriterion("DELIVERTIME in", values, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeNotIn(List<Date> values) {
            addCriterion("DELIVERTIME not in", values, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeBetween(Date value1, Date value2) {
            addCriterion("DELIVERTIME between", value1, value2, "delivertime");
            return (Criteria) this;
        }

        public Criteria andDelivertimeNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERTIME not between", value1, value2, "delivertime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNull() {
            addCriterion("RETURNTIME is null");
            return (Criteria) this;
        }

        public Criteria andReturntimeIsNotNull() {
            addCriterion("RETURNTIME is not null");
            return (Criteria) this;
        }

        public Criteria andReturntimeEqualTo(Date value) {
            addCriterion("RETURNTIME =", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotEqualTo(Date value) {
            addCriterion("RETURNTIME <>", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThan(Date value) {
            addCriterion("RETURNTIME >", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RETURNTIME >=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThan(Date value) {
            addCriterion("RETURNTIME <", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeLessThanOrEqualTo(Date value) {
            addCriterion("RETURNTIME <=", value, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeIn(List<Date> values) {
            addCriterion("RETURNTIME in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotIn(List<Date> values) {
            addCriterion("RETURNTIME not in", values, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeBetween(Date value1, Date value2) {
            addCriterion("RETURNTIME between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturntimeNotBetween(Date value1, Date value2) {
            addCriterion("RETURNTIME not between", value1, value2, "returntime");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidIsNull() {
            addCriterion("RETURNEXPRESSCOMPANYID is null");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidIsNotNull() {
            addCriterion("RETURNEXPRESSCOMPANYID is not null");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidEqualTo(BigDecimal value) {
            addCriterion("RETURNEXPRESSCOMPANYID =", value, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidNotEqualTo(BigDecimal value) {
            addCriterion("RETURNEXPRESSCOMPANYID <>", value, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidGreaterThan(BigDecimal value) {
            addCriterion("RETURNEXPRESSCOMPANYID >", value, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNEXPRESSCOMPANYID >=", value, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidLessThan(BigDecimal value) {
            addCriterion("RETURNEXPRESSCOMPANYID <", value, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURNEXPRESSCOMPANYID <=", value, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidIn(List<BigDecimal> values) {
            addCriterion("RETURNEXPRESSCOMPANYID in", values, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidNotIn(List<BigDecimal> values) {
            addCriterion("RETURNEXPRESSCOMPANYID not in", values, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNEXPRESSCOMPANYID between", value1, value2, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andReturnexpresscompanyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURNEXPRESSCOMPANYID not between", value1, value2, "returnexpresscompanyid");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeIsNull() {
            addCriterion("BACKSTATIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeIsNotNull() {
            addCriterion("BACKSTATIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeEqualTo(Date value) {
            addCriterion("BACKSTATIONTIME =", value, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeNotEqualTo(Date value) {
            addCriterion("BACKSTATIONTIME <>", value, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeGreaterThan(Date value) {
            addCriterion("BACKSTATIONTIME >", value, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BACKSTATIONTIME >=", value, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeLessThan(Date value) {
            addCriterion("BACKSTATIONTIME <", value, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeLessThanOrEqualTo(Date value) {
            addCriterion("BACKSTATIONTIME <=", value, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeIn(List<Date> values) {
            addCriterion("BACKSTATIONTIME in", values, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeNotIn(List<Date> values) {
            addCriterion("BACKSTATIONTIME not in", values, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeBetween(Date value1, Date value2) {
            addCriterion("BACKSTATIONTIME between", value1, value2, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationtimeNotBetween(Date value1, Date value2) {
            addCriterion("BACKSTATIONTIME not between", value1, value2, "backstationtime");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusIsNull() {
            addCriterion("BACKSTATIONSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusIsNotNull() {
            addCriterion("BACKSTATIONSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusEqualTo(String value) {
            addCriterion("BACKSTATIONSTATUS =", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusNotEqualTo(String value) {
            addCriterion("BACKSTATIONSTATUS <>", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusGreaterThan(String value) {
            addCriterion("BACKSTATIONSTATUS >", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusGreaterThanOrEqualTo(String value) {
            addCriterion("BACKSTATIONSTATUS >=", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusLessThan(String value) {
            addCriterion("BACKSTATIONSTATUS <", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusLessThanOrEqualTo(String value) {
            addCriterion("BACKSTATIONSTATUS <=", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusLike(String value) {
            addCriterion("BACKSTATIONSTATUS like", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusNotLike(String value) {
            addCriterion("BACKSTATIONSTATUS not like", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusIn(List<String> values) {
            addCriterion("BACKSTATIONSTATUS in", values, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusNotIn(List<String> values) {
            addCriterion("BACKSTATIONSTATUS not in", values, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusBetween(String value1, String value2) {
            addCriterion("BACKSTATIONSTATUS between", value1, value2, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusNotBetween(String value1, String value2) {
            addCriterion("BACKSTATIONSTATUS not between", value1, value2, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andProtectedamountIsNull() {
            addCriterion("PROTECTEDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andProtectedamountIsNotNull() {
            addCriterion("PROTECTEDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedamountEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDAMOUNT =", value, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andProtectedamountNotEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDAMOUNT <>", value, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andProtectedamountGreaterThan(BigDecimal value) {
            addCriterion("PROTECTEDAMOUNT >", value, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andProtectedamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDAMOUNT >=", value, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andProtectedamountLessThan(BigDecimal value) {
            addCriterion("PROTECTEDAMOUNT <", value, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andProtectedamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDAMOUNT <=", value, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andProtectedamountIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDAMOUNT in", values, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andProtectedamountNotIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDAMOUNT not in", values, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andProtectedamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDAMOUNT between", value1, value2, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andProtectedamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDAMOUNT not between", value1, value2, "protectedamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNull() {
            addCriterion("TOTALAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andTotalamountIsNotNull() {
            addCriterion("TOTALAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andTotalamountEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT =", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT <>", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThan(BigDecimal value) {
            addCriterion("TOTALAMOUNT >", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT >=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThan(BigDecimal value) {
            addCriterion("TOTALAMOUNT <", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTALAMOUNT <=", value, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountIn(List<BigDecimal> values) {
            addCriterion("TOTALAMOUNT in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotIn(List<BigDecimal> values) {
            addCriterion("TOTALAMOUNT not in", values, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALAMOUNT between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andTotalamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTALAMOUNT not between", value1, value2, "totalamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNull() {
            addCriterion("PAIDAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPaidamountIsNotNull() {
            addCriterion("PAIDAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPaidamountEqualTo(BigDecimal value) {
            addCriterion("PAIDAMOUNT =", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotEqualTo(BigDecimal value) {
            addCriterion("PAIDAMOUNT <>", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThan(BigDecimal value) {
            addCriterion("PAIDAMOUNT >", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAIDAMOUNT >=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThan(BigDecimal value) {
            addCriterion("PAIDAMOUNT <", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAIDAMOUNT <=", value, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountIn(List<BigDecimal> values) {
            addCriterion("PAIDAMOUNT in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotIn(List<BigDecimal> values) {
            addCriterion("PAIDAMOUNT not in", values, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAIDAMOUNT between", value1, value2, "paidamount");
            return (Criteria) this;
        }

        public Criteria andPaidamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAIDAMOUNT not between", value1, value2, "paidamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountIsNull() {
            addCriterion("NEEDPAYAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountIsNotNull() {
            addCriterion("NEEDPAYAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountEqualTo(BigDecimal value) {
            addCriterion("NEEDPAYAMOUNT =", value, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountNotEqualTo(BigDecimal value) {
            addCriterion("NEEDPAYAMOUNT <>", value, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountGreaterThan(BigDecimal value) {
            addCriterion("NEEDPAYAMOUNT >", value, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEEDPAYAMOUNT >=", value, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountLessThan(BigDecimal value) {
            addCriterion("NEEDPAYAMOUNT <", value, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEEDPAYAMOUNT <=", value, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountIn(List<BigDecimal> values) {
            addCriterion("NEEDPAYAMOUNT in", values, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountNotIn(List<BigDecimal> values) {
            addCriterion("NEEDPAYAMOUNT not in", values, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEEDPAYAMOUNT between", value1, value2, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andNeedpayamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEEDPAYAMOUNT not between", value1, value2, "needpayamount");
            return (Criteria) this;
        }

        public Criteria andBackamountIsNull() {
            addCriterion("BACKAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andBackamountIsNotNull() {
            addCriterion("BACKAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andBackamountEqualTo(BigDecimal value) {
            addCriterion("BACKAMOUNT =", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountNotEqualTo(BigDecimal value) {
            addCriterion("BACKAMOUNT <>", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountGreaterThan(BigDecimal value) {
            addCriterion("BACKAMOUNT >", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKAMOUNT >=", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountLessThan(BigDecimal value) {
            addCriterion("BACKAMOUNT <", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKAMOUNT <=", value, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountIn(List<BigDecimal> values) {
            addCriterion("BACKAMOUNT in", values, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountNotIn(List<BigDecimal> values) {
            addCriterion("BACKAMOUNT not in", values, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKAMOUNT between", value1, value2, "backamount");
            return (Criteria) this;
        }

        public Criteria andBackamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKAMOUNT not between", value1, value2, "backamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountIsNull() {
            addCriterion("NEEDBACKAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountIsNotNull() {
            addCriterion("NEEDBACKAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountEqualTo(BigDecimal value) {
            addCriterion("NEEDBACKAMOUNT =", value, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountNotEqualTo(BigDecimal value) {
            addCriterion("NEEDBACKAMOUNT <>", value, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountGreaterThan(BigDecimal value) {
            addCriterion("NEEDBACKAMOUNT >", value, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NEEDBACKAMOUNT >=", value, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountLessThan(BigDecimal value) {
            addCriterion("NEEDBACKAMOUNT <", value, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NEEDBACKAMOUNT <=", value, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountIn(List<BigDecimal> values) {
            addCriterion("NEEDBACKAMOUNT in", values, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountNotIn(List<BigDecimal> values) {
            addCriterion("NEEDBACKAMOUNT not in", values, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEEDBACKAMOUNT between", value1, value2, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andNeedbackamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NEEDBACKAMOUNT not between", value1, value2, "needbackamount");
            return (Criteria) this;
        }

        public Criteria andAccountweightIsNull() {
            addCriterion("ACCOUNTWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andAccountweightIsNotNull() {
            addCriterion("ACCOUNTWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountweightEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTWEIGHT =", value, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAccountweightNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTWEIGHT <>", value, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAccountweightGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTWEIGHT >", value, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAccountweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTWEIGHT >=", value, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAccountweightLessThan(BigDecimal value) {
            addCriterion("ACCOUNTWEIGHT <", value, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAccountweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTWEIGHT <=", value, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAccountweightIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTWEIGHT in", values, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAccountweightNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTWEIGHT not in", values, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAccountweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTWEIGHT between", value1, value2, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAccountweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTWEIGHT not between", value1, value2, "accountweight");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNull() {
            addCriterion("AREAID is null");
            return (Criteria) this;
        }

        public Criteria andAreaidIsNotNull() {
            addCriterion("AREAID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidEqualTo(String value) {
            addCriterion("AREAID =", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotEqualTo(String value) {
            addCriterion("AREAID <>", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThan(String value) {
            addCriterion("AREAID >", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidGreaterThanOrEqualTo(String value) {
            addCriterion("AREAID >=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThan(String value) {
            addCriterion("AREAID <", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLessThanOrEqualTo(String value) {
            addCriterion("AREAID <=", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidLike(String value) {
            addCriterion("AREAID like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotLike(String value) {
            addCriterion("AREAID not like", value, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidIn(List<String> values) {
            addCriterion("AREAID in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotIn(List<String> values) {
            addCriterion("AREAID not in", values, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidBetween(String value1, String value2) {
            addCriterion("AREAID between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andAreaidNotBetween(String value1, String value2) {
            addCriterion("AREAID not between", value1, value2, "areaid");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIsNull() {
            addCriterion("RECEIVEADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIsNotNull() {
            addCriterion("RECEIVEADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressEqualTo(String value) {
            addCriterion("RECEIVEADDRESS =", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotEqualTo(String value) {
            addCriterion("RECEIVEADDRESS <>", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressGreaterThan(String value) {
            addCriterion("RECEIVEADDRESS >", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEADDRESS >=", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLessThan(String value) {
            addCriterion("RECEIVEADDRESS <", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEADDRESS <=", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressLike(String value) {
            addCriterion("RECEIVEADDRESS like", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotLike(String value) {
            addCriterion("RECEIVEADDRESS not like", value, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressIn(List<String> values) {
            addCriterion("RECEIVEADDRESS in", values, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotIn(List<String> values) {
            addCriterion("RECEIVEADDRESS not in", values, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressBetween(String value1, String value2) {
            addCriterion("RECEIVEADDRESS between", value1, value2, "receiveaddress");
            return (Criteria) this;
        }

        public Criteria andReceiveaddressNotBetween(String value1, String value2) {
            addCriterion("RECEIVEADDRESS not between", value1, value2, "receiveaddress");
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

        public Criteria andInefficacystatusIsNull() {
            addCriterion("INEFFICACYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusIsNotNull() {
            addCriterion("INEFFICACYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusEqualTo(BigDecimal value) {
            addCriterion("INEFFICACYSTATUS =", value, "inefficacystatus");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusNotEqualTo(BigDecimal value) {
            addCriterion("INEFFICACYSTATUS <>", value, "inefficacystatus");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusGreaterThan(BigDecimal value) {
            addCriterion("INEFFICACYSTATUS >", value, "inefficacystatus");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INEFFICACYSTATUS >=", value, "inefficacystatus");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusLessThan(BigDecimal value) {
            addCriterion("INEFFICACYSTATUS <", value, "inefficacystatus");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INEFFICACYSTATUS <=", value, "inefficacystatus");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusIn(List<BigDecimal> values) {
            addCriterion("INEFFICACYSTATUS in", values, "inefficacystatus");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusNotIn(List<BigDecimal> values) {
            addCriterion("INEFFICACYSTATUS not in", values, "inefficacystatus");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INEFFICACYSTATUS between", value1, value2, "inefficacystatus");
            return (Criteria) this;
        }

        public Criteria andInefficacystatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INEFFICACYSTATUS not between", value1, value2, "inefficacystatus");
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

        public Criteria andReceivestationidIsNull() {
            addCriterion("RECEIVESTATIONID is null");
            return (Criteria) this;
        }

        public Criteria andReceivestationidIsNotNull() {
            addCriterion("RECEIVESTATIONID is not null");
            return (Criteria) this;
        }

        public Criteria andReceivestationidEqualTo(BigDecimal value) {
            addCriterion("RECEIVESTATIONID =", value, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivestationidNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVESTATIONID <>", value, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivestationidGreaterThan(BigDecimal value) {
            addCriterion("RECEIVESTATIONID >", value, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivestationidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVESTATIONID >=", value, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivestationidLessThan(BigDecimal value) {
            addCriterion("RECEIVESTATIONID <", value, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivestationidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVESTATIONID <=", value, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivestationidIn(List<BigDecimal> values) {
            addCriterion("RECEIVESTATIONID in", values, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivestationidNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVESTATIONID not in", values, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivestationidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVESTATIONID between", value1, value2, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivestationidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVESTATIONID not between", value1, value2, "receivestationid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidIsNull() {
            addCriterion("RECEIVEDELIVERMANID is null");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidIsNotNull() {
            addCriterion("RECEIVEDELIVERMANID is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidEqualTo(BigDecimal value) {
            addCriterion("RECEIVEDELIVERMANID =", value, "receivedelivermanid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVEDELIVERMANID <>", value, "receivedelivermanid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidGreaterThan(BigDecimal value) {
            addCriterion("RECEIVEDELIVERMANID >", value, "receivedelivermanid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEDELIVERMANID >=", value, "receivedelivermanid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidLessThan(BigDecimal value) {
            addCriterion("RECEIVEDELIVERMANID <", value, "receivedelivermanid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEDELIVERMANID <=", value, "receivedelivermanid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidIn(List<BigDecimal> values) {
            addCriterion("RECEIVEDELIVERMANID in", values, "receivedelivermanid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVEDELIVERMANID not in", values, "receivedelivermanid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEDELIVERMANID between", value1, value2, "receivedelivermanid");
            return (Criteria) this;
        }

        public Criteria andReceivedelivermanidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEDELIVERMANID not between", value1, value2, "receivedelivermanid");
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

        public Criteria andWaybillinfoweightIsNull() {
            addCriterion("WAYBILLINFOWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightIsNotNull() {
            addCriterion("WAYBILLINFOWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightEqualTo(BigDecimal value) {
            addCriterion("WAYBILLINFOWEIGHT =", value, "waybillinfoweight");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightNotEqualTo(BigDecimal value) {
            addCriterion("WAYBILLINFOWEIGHT <>", value, "waybillinfoweight");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightGreaterThan(BigDecimal value) {
            addCriterion("WAYBILLINFOWEIGHT >", value, "waybillinfoweight");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WAYBILLINFOWEIGHT >=", value, "waybillinfoweight");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightLessThan(BigDecimal value) {
            addCriterion("WAYBILLINFOWEIGHT <", value, "waybillinfoweight");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WAYBILLINFOWEIGHT <=", value, "waybillinfoweight");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightIn(List<BigDecimal> values) {
            addCriterion("WAYBILLINFOWEIGHT in", values, "waybillinfoweight");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightNotIn(List<BigDecimal> values) {
            addCriterion("WAYBILLINFOWEIGHT not in", values, "waybillinfoweight");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAYBILLINFOWEIGHT between", value1, value2, "waybillinfoweight");
            return (Criteria) this;
        }

        public Criteria andWaybillinfoweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WAYBILLINFOWEIGHT not between", value1, value2, "waybillinfoweight");
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

        public Criteria andOrigindepotnoIsNull() {
            addCriterion("ORIGINDEPOTNO is null");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoIsNotNull() {
            addCriterion("ORIGINDEPOTNO is not null");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoEqualTo(String value) {
            addCriterion("ORIGINDEPOTNO =", value, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoNotEqualTo(String value) {
            addCriterion("ORIGINDEPOTNO <>", value, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoGreaterThan(String value) {
            addCriterion("ORIGINDEPOTNO >", value, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGINDEPOTNO >=", value, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoLessThan(String value) {
            addCriterion("ORIGINDEPOTNO <", value, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoLessThanOrEqualTo(String value) {
            addCriterion("ORIGINDEPOTNO <=", value, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoLike(String value) {
            addCriterion("ORIGINDEPOTNO like", value, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoNotLike(String value) {
            addCriterion("ORIGINDEPOTNO not like", value, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoIn(List<String> values) {
            addCriterion("ORIGINDEPOTNO in", values, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoNotIn(List<String> values) {
            addCriterion("ORIGINDEPOTNO not in", values, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoBetween(String value1, String value2) {
            addCriterion("ORIGINDEPOTNO between", value1, value2, "origindepotno");
            return (Criteria) this;
        }

        public Criteria andOrigindepotnoNotBetween(String value1, String value2) {
            addCriterion("ORIGINDEPOTNO not between", value1, value2, "origindepotno");
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

        public Criteria andPeriodaccountcodeIsNull() {
            addCriterion("PERIODACCOUNTCODE is null");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeIsNotNull() {
            addCriterion("PERIODACCOUNTCODE is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeEqualTo(String value) {
            addCriterion("PERIODACCOUNTCODE =", value, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeNotEqualTo(String value) {
            addCriterion("PERIODACCOUNTCODE <>", value, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeGreaterThan(String value) {
            addCriterion("PERIODACCOUNTCODE >", value, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeGreaterThanOrEqualTo(String value) {
            addCriterion("PERIODACCOUNTCODE >=", value, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeLessThan(String value) {
            addCriterion("PERIODACCOUNTCODE <", value, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeLessThanOrEqualTo(String value) {
            addCriterion("PERIODACCOUNTCODE <=", value, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeLike(String value) {
            addCriterion("PERIODACCOUNTCODE like", value, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeNotLike(String value) {
            addCriterion("PERIODACCOUNTCODE not like", value, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeIn(List<String> values) {
            addCriterion("PERIODACCOUNTCODE in", values, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeNotIn(List<String> values) {
            addCriterion("PERIODACCOUNTCODE not in", values, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeBetween(String value1, String value2) {
            addCriterion("PERIODACCOUNTCODE between", value1, value2, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andPeriodaccountcodeNotBetween(String value1, String value2) {
            addCriterion("PERIODACCOUNTCODE not between", value1, value2, "periodaccountcode");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryIsNull() {
            addCriterion("WAYBILLCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryIsNotNull() {
            addCriterion("WAYBILLCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryEqualTo(String value) {
            addCriterion("WAYBILLCATEGORY =", value, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryNotEqualTo(String value) {
            addCriterion("WAYBILLCATEGORY <>", value, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryGreaterThan(String value) {
            addCriterion("WAYBILLCATEGORY >", value, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("WAYBILLCATEGORY >=", value, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryLessThan(String value) {
            addCriterion("WAYBILLCATEGORY <", value, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryLessThanOrEqualTo(String value) {
            addCriterion("WAYBILLCATEGORY <=", value, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryLike(String value) {
            addCriterion("WAYBILLCATEGORY like", value, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryNotLike(String value) {
            addCriterion("WAYBILLCATEGORY not like", value, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryIn(List<String> values) {
            addCriterion("WAYBILLCATEGORY in", values, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryNotIn(List<String> values) {
            addCriterion("WAYBILLCATEGORY not in", values, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryBetween(String value1, String value2) {
            addCriterion("WAYBILLCATEGORY between", value1, value2, "waybillcategory");
            return (Criteria) this;
        }

        public Criteria andWaybillcategoryNotBetween(String value1, String value2) {
            addCriterion("WAYBILLCATEGORY not between", value1, value2, "waybillcategory");
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

        public Criteria andIsmanualmodifyIsNull() {
            addCriterion("ISMANUALMODIFY is null");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyIsNotNull() {
            addCriterion("ISMANUALMODIFY is not null");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyEqualTo(BigDecimal value) {
            addCriterion("ISMANUALMODIFY =", value, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyNotEqualTo(BigDecimal value) {
            addCriterion("ISMANUALMODIFY <>", value, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyGreaterThan(BigDecimal value) {
            addCriterion("ISMANUALMODIFY >", value, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISMANUALMODIFY >=", value, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyLessThan(BigDecimal value) {
            addCriterion("ISMANUALMODIFY <", value, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISMANUALMODIFY <=", value, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyIn(List<BigDecimal> values) {
            addCriterion("ISMANUALMODIFY in", values, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyNotIn(List<BigDecimal> values) {
            addCriterion("ISMANUALMODIFY not in", values, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISMANUALMODIFY between", value1, value2, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andIsmanualmodifyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISMANUALMODIFY not between", value1, value2, "ismanualmodify");
            return (Criteria) this;
        }

        public Criteria andAccountordernoIsNull() {
            addCriterion("ACCOUNTORDERNO is null");
            return (Criteria) this;
        }

        public Criteria andAccountordernoIsNotNull() {
            addCriterion("ACCOUNTORDERNO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountordernoEqualTo(String value) {
            addCriterion("ACCOUNTORDERNO =", value, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoNotEqualTo(String value) {
            addCriterion("ACCOUNTORDERNO <>", value, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoGreaterThan(String value) {
            addCriterion("ACCOUNTORDERNO >", value, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTORDERNO >=", value, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoLessThan(String value) {
            addCriterion("ACCOUNTORDERNO <", value, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTORDERNO <=", value, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoLike(String value) {
            addCriterion("ACCOUNTORDERNO like", value, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoNotLike(String value) {
            addCriterion("ACCOUNTORDERNO not like", value, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoIn(List<String> values) {
            addCriterion("ACCOUNTORDERNO in", values, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoNotIn(List<String> values) {
            addCriterion("ACCOUNTORDERNO not in", values, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoBetween(String value1, String value2) {
            addCriterion("ACCOUNTORDERNO between", value1, value2, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andAccountordernoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTORDERNO not between", value1, value2, "accountorderno");
            return (Criteria) this;
        }

        public Criteria andPackagecountIsNull() {
            addCriterion("PACKAGECOUNT is null");
            return (Criteria) this;
        }

        public Criteria andPackagecountIsNotNull() {
            addCriterion("PACKAGECOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andPackagecountEqualTo(BigDecimal value) {
            addCriterion("PACKAGECOUNT =", value, "packagecount");
            return (Criteria) this;
        }

        public Criteria andPackagecountNotEqualTo(BigDecimal value) {
            addCriterion("PACKAGECOUNT <>", value, "packagecount");
            return (Criteria) this;
        }

        public Criteria andPackagecountGreaterThan(BigDecimal value) {
            addCriterion("PACKAGECOUNT >", value, "packagecount");
            return (Criteria) this;
        }

        public Criteria andPackagecountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGECOUNT >=", value, "packagecount");
            return (Criteria) this;
        }

        public Criteria andPackagecountLessThan(BigDecimal value) {
            addCriterion("PACKAGECOUNT <", value, "packagecount");
            return (Criteria) this;
        }

        public Criteria andPackagecountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PACKAGECOUNT <=", value, "packagecount");
            return (Criteria) this;
        }

        public Criteria andPackagecountIn(List<BigDecimal> values) {
            addCriterion("PACKAGECOUNT in", values, "packagecount");
            return (Criteria) this;
        }

        public Criteria andPackagecountNotIn(List<BigDecimal> values) {
            addCriterion("PACKAGECOUNT not in", values, "packagecount");
            return (Criteria) this;
        }

        public Criteria andPackagecountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGECOUNT between", value1, value2, "packagecount");
            return (Criteria) this;
        }

        public Criteria andPackagecountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PACKAGECOUNT not between", value1, value2, "packagecount");
            return (Criteria) this;
        }

        public Criteria andSendprovinceIsNull() {
            addCriterion("SENDPROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andSendprovinceIsNotNull() {
            addCriterion("SENDPROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andSendprovinceEqualTo(String value) {
            addCriterion("SENDPROVINCE =", value, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceNotEqualTo(String value) {
            addCriterion("SENDPROVINCE <>", value, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceGreaterThan(String value) {
            addCriterion("SENDPROVINCE >", value, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("SENDPROVINCE >=", value, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceLessThan(String value) {
            addCriterion("SENDPROVINCE <", value, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceLessThanOrEqualTo(String value) {
            addCriterion("SENDPROVINCE <=", value, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceLike(String value) {
            addCriterion("SENDPROVINCE like", value, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceNotLike(String value) {
            addCriterion("SENDPROVINCE not like", value, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceIn(List<String> values) {
            addCriterion("SENDPROVINCE in", values, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceNotIn(List<String> values) {
            addCriterion("SENDPROVINCE not in", values, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceBetween(String value1, String value2) {
            addCriterion("SENDPROVINCE between", value1, value2, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendprovinceNotBetween(String value1, String value2) {
            addCriterion("SENDPROVINCE not between", value1, value2, "sendprovince");
            return (Criteria) this;
        }

        public Criteria andSendcityIsNull() {
            addCriterion("SENDCITY is null");
            return (Criteria) this;
        }

        public Criteria andSendcityIsNotNull() {
            addCriterion("SENDCITY is not null");
            return (Criteria) this;
        }

        public Criteria andSendcityEqualTo(String value) {
            addCriterion("SENDCITY =", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotEqualTo(String value) {
            addCriterion("SENDCITY <>", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityGreaterThan(String value) {
            addCriterion("SENDCITY >", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityGreaterThanOrEqualTo(String value) {
            addCriterion("SENDCITY >=", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityLessThan(String value) {
            addCriterion("SENDCITY <", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityLessThanOrEqualTo(String value) {
            addCriterion("SENDCITY <=", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityLike(String value) {
            addCriterion("SENDCITY like", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotLike(String value) {
            addCriterion("SENDCITY not like", value, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityIn(List<String> values) {
            addCriterion("SENDCITY in", values, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotIn(List<String> values) {
            addCriterion("SENDCITY not in", values, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityBetween(String value1, String value2) {
            addCriterion("SENDCITY between", value1, value2, "sendcity");
            return (Criteria) this;
        }

        public Criteria andSendcityNotBetween(String value1, String value2) {
            addCriterion("SENDCITY not between", value1, value2, "sendcity");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("PROVINCE is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("PROVINCE is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(String value) {
            addCriterion("PROVINCE =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(String value) {
            addCriterion("PROVINCE <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(String value) {
            addCriterion("PROVINCE >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("PROVINCE >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(String value) {
            addCriterion("PROVINCE <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(String value) {
            addCriterion("PROVINCE <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLike(String value) {
            addCriterion("PROVINCE like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotLike(String value) {
            addCriterion("PROVINCE not like", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<String> values) {
            addCriterion("PROVINCE in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<String> values) {
            addCriterion("PROVINCE not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(String value1, String value2) {
            addCriterion("PROVINCE between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(String value1, String value2) {
            addCriterion("PROVINCE not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("CITY is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("CITY is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("CITY =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("CITY <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("CITY >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("CITY >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("CITY <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("CITY <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("CITY like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("CITY not like", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<String> values) {
            addCriterion("CITY in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<String> values) {
            addCriterion("CITY not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("CITY between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("CITY not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("AREA is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("AREA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("AREA =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("AREA <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("AREA >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("AREA >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("AREA <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("AREA <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("AREA like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("AREA not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("AREA in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("AREA not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("AREA between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("AREA not between", value1, value2, "area");
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

        public Criteria andPayeeIsNull() {
            addCriterion("PAYEE is null");
            return (Criteria) this;
        }

        public Criteria andPayeeIsNotNull() {
            addCriterion("PAYEE is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeEqualTo(String value) {
            addCriterion("PAYEE =", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotEqualTo(String value) {
            addCriterion("PAYEE <>", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThan(String value) {
            addCriterion("PAYEE >", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEE >=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThan(String value) {
            addCriterion("PAYEE <", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLessThanOrEqualTo(String value) {
            addCriterion("PAYEE <=", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeLike(String value) {
            addCriterion("PAYEE like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotLike(String value) {
            addCriterion("PAYEE not like", value, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeIn(List<String> values) {
            addCriterion("PAYEE in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotIn(List<String> values) {
            addCriterion("PAYEE not in", values, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeBetween(String value1, String value2) {
            addCriterion("PAYEE between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andPayeeNotBetween(String value1, String value2) {
            addCriterion("PAYEE not between", value1, value2, "payee");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorIsNull() {
            addCriterion("TRANSFEROPERATOR is null");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorIsNotNull() {
            addCriterion("TRANSFEROPERATOR is not null");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorEqualTo(BigDecimal value) {
            addCriterion("TRANSFEROPERATOR =", value, "transferoperator");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorNotEqualTo(BigDecimal value) {
            addCriterion("TRANSFEROPERATOR <>", value, "transferoperator");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorGreaterThan(BigDecimal value) {
            addCriterion("TRANSFEROPERATOR >", value, "transferoperator");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFEROPERATOR >=", value, "transferoperator");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorLessThan(BigDecimal value) {
            addCriterion("TRANSFEROPERATOR <", value, "transferoperator");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFEROPERATOR <=", value, "transferoperator");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorIn(List<BigDecimal> values) {
            addCriterion("TRANSFEROPERATOR in", values, "transferoperator");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorNotIn(List<BigDecimal> values) {
            addCriterion("TRANSFEROPERATOR not in", values, "transferoperator");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFEROPERATOR between", value1, value2, "transferoperator");
            return (Criteria) this;
        }

        public Criteria andTransferoperatorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFEROPERATOR not between", value1, value2, "transferoperator");
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

        public Criteria andActualtransfertimeIsNull() {
            addCriterion("ACTUALTRANSFERTIME is null");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeIsNotNull() {
            addCriterion("ACTUALTRANSFERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeEqualTo(Date value) {
            addCriterion("ACTUALTRANSFERTIME =", value, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeNotEqualTo(Date value) {
            addCriterion("ACTUALTRANSFERTIME <>", value, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeGreaterThan(Date value) {
            addCriterion("ACTUALTRANSFERTIME >", value, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACTUALTRANSFERTIME >=", value, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeLessThan(Date value) {
            addCriterion("ACTUALTRANSFERTIME <", value, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeLessThanOrEqualTo(Date value) {
            addCriterion("ACTUALTRANSFERTIME <=", value, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeIn(List<Date> values) {
            addCriterion("ACTUALTRANSFERTIME in", values, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeNotIn(List<Date> values) {
            addCriterion("ACTUALTRANSFERTIME not in", values, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeBetween(Date value1, Date value2) {
            addCriterion("ACTUALTRANSFERTIME between", value1, value2, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andActualtransfertimeNotBetween(Date value1, Date value2) {
            addCriterion("ACTUALTRANSFERTIME not between", value1, value2, "actualtransfertime");
            return (Criteria) this;
        }

        public Criteria andTransferstateIsNull() {
            addCriterion("TRANSFERSTATE is null");
            return (Criteria) this;
        }

        public Criteria andTransferstateIsNotNull() {
            addCriterion("TRANSFERSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransferstateEqualTo(BigDecimal value) {
            addCriterion("TRANSFERSTATE =", value, "transferstate");
            return (Criteria) this;
        }

        public Criteria andTransferstateNotEqualTo(BigDecimal value) {
            addCriterion("TRANSFERSTATE <>", value, "transferstate");
            return (Criteria) this;
        }

        public Criteria andTransferstateGreaterThan(BigDecimal value) {
            addCriterion("TRANSFERSTATE >", value, "transferstate");
            return (Criteria) this;
        }

        public Criteria andTransferstateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFERSTATE >=", value, "transferstate");
            return (Criteria) this;
        }

        public Criteria andTransferstateLessThan(BigDecimal value) {
            addCriterion("TRANSFERSTATE <", value, "transferstate");
            return (Criteria) this;
        }

        public Criteria andTransferstateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFERSTATE <=", value, "transferstate");
            return (Criteria) this;
        }

        public Criteria andTransferstateIn(List<BigDecimal> values) {
            addCriterion("TRANSFERSTATE in", values, "transferstate");
            return (Criteria) this;
        }

        public Criteria andTransferstateNotIn(List<BigDecimal> values) {
            addCriterion("TRANSFERSTATE not in", values, "transferstate");
            return (Criteria) this;
        }

        public Criteria andTransferstateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFERSTATE between", value1, value2, "transferstate");
            return (Criteria) this;
        }

        public Criteria andTransferstateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFERSTATE not between", value1, value2, "transferstate");
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
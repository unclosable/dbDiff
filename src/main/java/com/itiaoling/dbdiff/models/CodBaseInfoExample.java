package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CodBaseInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CodBaseInfoExample() {
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

        public Criteria andInfoidIsNull() {
            addCriterion("INFOID is null");
            return (Criteria) this;
        }

        public Criteria andInfoidIsNotNull() {
            addCriterion("INFOID is not null");
            return (Criteria) this;
        }

        public Criteria andInfoidEqualTo(BigDecimal value) {
            addCriterion("INFOID =", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotEqualTo(BigDecimal value) {
            addCriterion("INFOID <>", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThan(BigDecimal value) {
            addCriterion("INFOID >", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INFOID >=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThan(BigDecimal value) {
            addCriterion("INFOID <", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INFOID <=", value, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidIn(List<BigDecimal> values) {
            addCriterion("INFOID in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotIn(List<BigDecimal> values) {
            addCriterion("INFOID not in", values, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INFOID between", value1, value2, "infoid");
            return (Criteria) this;
        }

        public Criteria andInfoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INFOID not between", value1, value2, "infoid");
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

        public Criteria andMediumidIsNull() {
            addCriterion("MEDIUMID is null");
            return (Criteria) this;
        }

        public Criteria andMediumidIsNotNull() {
            addCriterion("MEDIUMID is not null");
            return (Criteria) this;
        }

        public Criteria andMediumidEqualTo(BigDecimal value) {
            addCriterion("MEDIUMID =", value, "mediumid");
            return (Criteria) this;
        }

        public Criteria andMediumidNotEqualTo(BigDecimal value) {
            addCriterion("MEDIUMID <>", value, "mediumid");
            return (Criteria) this;
        }

        public Criteria andMediumidGreaterThan(BigDecimal value) {
            addCriterion("MEDIUMID >", value, "mediumid");
            return (Criteria) this;
        }

        public Criteria andMediumidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MEDIUMID >=", value, "mediumid");
            return (Criteria) this;
        }

        public Criteria andMediumidLessThan(BigDecimal value) {
            addCriterion("MEDIUMID <", value, "mediumid");
            return (Criteria) this;
        }

        public Criteria andMediumidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MEDIUMID <=", value, "mediumid");
            return (Criteria) this;
        }

        public Criteria andMediumidIn(List<BigDecimal> values) {
            addCriterion("MEDIUMID in", values, "mediumid");
            return (Criteria) this;
        }

        public Criteria andMediumidNotIn(List<BigDecimal> values) {
            addCriterion("MEDIUMID not in", values, "mediumid");
            return (Criteria) this;
        }

        public Criteria andMediumidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MEDIUMID between", value1, value2, "mediumid");
            return (Criteria) this;
        }

        public Criteria andMediumidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MEDIUMID not between", value1, value2, "mediumid");
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

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(BigDecimal value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(BigDecimal value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(BigDecimal value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(BigDecimal value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<BigDecimal> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<BigDecimal> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
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

        public Criteria andWarehouseidIsNull() {
            addCriterion("WAREHOUSEID is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIsNotNull() {
            addCriterion("WAREHOUSEID is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseidEqualTo(String value) {
            addCriterion("WAREHOUSEID =", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotEqualTo(String value) {
            addCriterion("WAREHOUSEID <>", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThan(String value) {
            addCriterion("WAREHOUSEID >", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("WAREHOUSEID >=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThan(String value) {
            addCriterion("WAREHOUSEID <", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLessThanOrEqualTo(String value) {
            addCriterion("WAREHOUSEID <=", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidLike(String value) {
            addCriterion("WAREHOUSEID like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotLike(String value) {
            addCriterion("WAREHOUSEID not like", value, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidIn(List<String> values) {
            addCriterion("WAREHOUSEID in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotIn(List<String> values) {
            addCriterion("WAREHOUSEID not in", values, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidBetween(String value1, String value2) {
            addCriterion("WAREHOUSEID between", value1, value2, "warehouseid");
            return (Criteria) this;
        }

        public Criteria andWarehouseidNotBetween(String value1, String value2) {
            addCriterion("WAREHOUSEID not between", value1, value2, "warehouseid");
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

        public Criteria andRfdacceptdateIsNull() {
            addCriterion("RFDACCEPTDATE is null");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateIsNotNull() {
            addCriterion("RFDACCEPTDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateEqualTo(Date value) {
            addCriterion("RFDACCEPTDATE =", value, "rfdacceptdate");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateNotEqualTo(Date value) {
            addCriterion("RFDACCEPTDATE <>", value, "rfdacceptdate");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateGreaterThan(Date value) {
            addCriterion("RFDACCEPTDATE >", value, "rfdacceptdate");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateGreaterThanOrEqualTo(Date value) {
            addCriterion("RFDACCEPTDATE >=", value, "rfdacceptdate");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateLessThan(Date value) {
            addCriterion("RFDACCEPTDATE <", value, "rfdacceptdate");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateLessThanOrEqualTo(Date value) {
            addCriterion("RFDACCEPTDATE <=", value, "rfdacceptdate");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateIn(List<Date> values) {
            addCriterion("RFDACCEPTDATE in", values, "rfdacceptdate");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateNotIn(List<Date> values) {
            addCriterion("RFDACCEPTDATE not in", values, "rfdacceptdate");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateBetween(Date value1, Date value2) {
            addCriterion("RFDACCEPTDATE between", value1, value2, "rfdacceptdate");
            return (Criteria) this;
        }

        public Criteria andRfdacceptdateNotBetween(Date value1, Date value2) {
            addCriterion("RFDACCEPTDATE not between", value1, value2, "rfdacceptdate");
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

        public Criteria andDeliverdateIsNull() {
            addCriterion("DELIVERDATE is null");
            return (Criteria) this;
        }

        public Criteria andDeliverdateIsNotNull() {
            addCriterion("DELIVERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverdateEqualTo(Date value) {
            addCriterion("DELIVERDATE =", value, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andDeliverdateNotEqualTo(Date value) {
            addCriterion("DELIVERDATE <>", value, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andDeliverdateGreaterThan(Date value) {
            addCriterion("DELIVERDATE >", value, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andDeliverdateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERDATE >=", value, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andDeliverdateLessThan(Date value) {
            addCriterion("DELIVERDATE <", value, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andDeliverdateLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERDATE <=", value, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andDeliverdateIn(List<Date> values) {
            addCriterion("DELIVERDATE in", values, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andDeliverdateNotIn(List<Date> values) {
            addCriterion("DELIVERDATE not in", values, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andDeliverdateBetween(Date value1, Date value2) {
            addCriterion("DELIVERDATE between", value1, value2, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andDeliverdateNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERDATE not between", value1, value2, "deliverdate");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidIsNull() {
            addCriterion("RETURNWAREHOUSEID is null");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidIsNotNull() {
            addCriterion("RETURNWAREHOUSEID is not null");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidEqualTo(String value) {
            addCriterion("RETURNWAREHOUSEID =", value, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidNotEqualTo(String value) {
            addCriterion("RETURNWAREHOUSEID <>", value, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidGreaterThan(String value) {
            addCriterion("RETURNWAREHOUSEID >", value, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidGreaterThanOrEqualTo(String value) {
            addCriterion("RETURNWAREHOUSEID >=", value, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidLessThan(String value) {
            addCriterion("RETURNWAREHOUSEID <", value, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidLessThanOrEqualTo(String value) {
            addCriterion("RETURNWAREHOUSEID <=", value, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidLike(String value) {
            addCriterion("RETURNWAREHOUSEID like", value, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidNotLike(String value) {
            addCriterion("RETURNWAREHOUSEID not like", value, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidIn(List<String> values) {
            addCriterion("RETURNWAREHOUSEID in", values, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidNotIn(List<String> values) {
            addCriterion("RETURNWAREHOUSEID not in", values, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidBetween(String value1, String value2) {
            addCriterion("RETURNWAREHOUSEID between", value1, value2, "returnwarehouseid");
            return (Criteria) this;
        }

        public Criteria andReturnwarehouseidNotBetween(String value1, String value2) {
            addCriterion("RETURNWAREHOUSEID not between", value1, value2, "returnwarehouseid");
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

        public Criteria andAreatypeIsNull() {
            addCriterion("AREATYPE is null");
            return (Criteria) this;
        }

        public Criteria andAreatypeIsNotNull() {
            addCriterion("AREATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAreatypeEqualTo(BigDecimal value) {
            addCriterion("AREATYPE =", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeNotEqualTo(BigDecimal value) {
            addCriterion("AREATYPE <>", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeGreaterThan(BigDecimal value) {
            addCriterion("AREATYPE >", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AREATYPE >=", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeLessThan(BigDecimal value) {
            addCriterion("AREATYPE <", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AREATYPE <=", value, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeIn(List<BigDecimal> values) {
            addCriterion("AREATYPE in", values, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeNotIn(List<BigDecimal> values) {
            addCriterion("AREATYPE not in", values, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AREATYPE between", value1, value2, "areatype");
            return (Criteria) this;
        }

        public Criteria andAreatypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AREATYPE not between", value1, value2, "areatype");
            return (Criteria) this;
        }

        public Criteria andBoxsnoIsNull() {
            addCriterion("BOXSNO is null");
            return (Criteria) this;
        }

        public Criteria andBoxsnoIsNotNull() {
            addCriterion("BOXSNO is not null");
            return (Criteria) this;
        }

        public Criteria andBoxsnoEqualTo(String value) {
            addCriterion("BOXSNO =", value, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoNotEqualTo(String value) {
            addCriterion("BOXSNO <>", value, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoGreaterThan(String value) {
            addCriterion("BOXSNO >", value, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoGreaterThanOrEqualTo(String value) {
            addCriterion("BOXSNO >=", value, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoLessThan(String value) {
            addCriterion("BOXSNO <", value, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoLessThanOrEqualTo(String value) {
            addCriterion("BOXSNO <=", value, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoLike(String value) {
            addCriterion("BOXSNO like", value, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoNotLike(String value) {
            addCriterion("BOXSNO not like", value, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoIn(List<String> values) {
            addCriterion("BOXSNO in", values, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoNotIn(List<String> values) {
            addCriterion("BOXSNO not in", values, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoBetween(String value1, String value2) {
            addCriterion("BOXSNO between", value1, value2, "boxsno");
            return (Criteria) this;
        }

        public Criteria andBoxsnoNotBetween(String value1, String value2) {
            addCriterion("BOXSNO not between", value1, value2, "boxsno");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
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

        public Criteria andReturndateIsNull() {
            addCriterion("RETURNDATE is null");
            return (Criteria) this;
        }

        public Criteria andReturndateIsNotNull() {
            addCriterion("RETURNDATE is not null");
            return (Criteria) this;
        }

        public Criteria andReturndateEqualTo(Date value) {
            addCriterion("RETURNDATE =", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotEqualTo(Date value) {
            addCriterion("RETURNDATE <>", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateGreaterThan(Date value) {
            addCriterion("RETURNDATE >", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateGreaterThanOrEqualTo(Date value) {
            addCriterion("RETURNDATE >=", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateLessThan(Date value) {
            addCriterion("RETURNDATE <", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateLessThanOrEqualTo(Date value) {
            addCriterion("RETURNDATE <=", value, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateIn(List<Date> values) {
            addCriterion("RETURNDATE in", values, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotIn(List<Date> values) {
            addCriterion("RETURNDATE not in", values, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateBetween(Date value1, Date value2) {
            addCriterion("RETURNDATE between", value1, value2, "returndate");
            return (Criteria) this;
        }

        public Criteria andReturndateNotBetween(Date value1, Date value2) {
            addCriterion("RETURNDATE not between", value1, value2, "returndate");
            return (Criteria) this;
        }

        public Criteria andIsfareIsNull() {
            addCriterion("ISFARE is null");
            return (Criteria) this;
        }

        public Criteria andIsfareIsNotNull() {
            addCriterion("ISFARE is not null");
            return (Criteria) this;
        }

        public Criteria andIsfareEqualTo(BigDecimal value) {
            addCriterion("ISFARE =", value, "isfare");
            return (Criteria) this;
        }

        public Criteria andIsfareNotEqualTo(BigDecimal value) {
            addCriterion("ISFARE <>", value, "isfare");
            return (Criteria) this;
        }

        public Criteria andIsfareGreaterThan(BigDecimal value) {
            addCriterion("ISFARE >", value, "isfare");
            return (Criteria) this;
        }

        public Criteria andIsfareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISFARE >=", value, "isfare");
            return (Criteria) this;
        }

        public Criteria andIsfareLessThan(BigDecimal value) {
            addCriterion("ISFARE <", value, "isfare");
            return (Criteria) this;
        }

        public Criteria andIsfareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISFARE <=", value, "isfare");
            return (Criteria) this;
        }

        public Criteria andIsfareIn(List<BigDecimal> values) {
            addCriterion("ISFARE in", values, "isfare");
            return (Criteria) this;
        }

        public Criteria andIsfareNotIn(List<BigDecimal> values) {
            addCriterion("ISFARE not in", values, "isfare");
            return (Criteria) this;
        }

        public Criteria andIsfareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISFARE between", value1, value2, "isfare");
            return (Criteria) this;
        }

        public Criteria andIsfareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISFARE not between", value1, value2, "isfare");
            return (Criteria) this;
        }

        public Criteria andFareIsNull() {
            addCriterion("FARE is null");
            return (Criteria) this;
        }

        public Criteria andFareIsNotNull() {
            addCriterion("FARE is not null");
            return (Criteria) this;
        }

        public Criteria andFareEqualTo(BigDecimal value) {
            addCriterion("FARE =", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotEqualTo(BigDecimal value) {
            addCriterion("FARE <>", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThan(BigDecimal value) {
            addCriterion("FARE >", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FARE >=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThan(BigDecimal value) {
            addCriterion("FARE <", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FARE <=", value, "fare");
            return (Criteria) this;
        }

        public Criteria andFareIn(List<BigDecimal> values) {
            addCriterion("FARE in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotIn(List<BigDecimal> values) {
            addCriterion("FARE not in", values, "fare");
            return (Criteria) this;
        }

        public Criteria andFareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FARE between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andFareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FARE not between", value1, value2, "fare");
            return (Criteria) this;
        }

        public Criteria andFareformulaIsNull() {
            addCriterion("FAREFORMULA is null");
            return (Criteria) this;
        }

        public Criteria andFareformulaIsNotNull() {
            addCriterion("FAREFORMULA is not null");
            return (Criteria) this;
        }

        public Criteria andFareformulaEqualTo(String value) {
            addCriterion("FAREFORMULA =", value, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaNotEqualTo(String value) {
            addCriterion("FAREFORMULA <>", value, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaGreaterThan(String value) {
            addCriterion("FAREFORMULA >", value, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaGreaterThanOrEqualTo(String value) {
            addCriterion("FAREFORMULA >=", value, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaLessThan(String value) {
            addCriterion("FAREFORMULA <", value, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaLessThanOrEqualTo(String value) {
            addCriterion("FAREFORMULA <=", value, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaLike(String value) {
            addCriterion("FAREFORMULA like", value, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaNotLike(String value) {
            addCriterion("FAREFORMULA not like", value, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaIn(List<String> values) {
            addCriterion("FAREFORMULA in", values, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaNotIn(List<String> values) {
            addCriterion("FAREFORMULA not in", values, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaBetween(String value1, String value2) {
            addCriterion("FAREFORMULA between", value1, value2, "fareformula");
            return (Criteria) this;
        }

        public Criteria andFareformulaNotBetween(String value1, String value2) {
            addCriterion("FAREFORMULA not between", value1, value2, "fareformula");
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

        public Criteria andComefromIsNull() {
            addCriterion("COMEFROM is null");
            return (Criteria) this;
        }

        public Criteria andComefromIsNotNull() {
            addCriterion("COMEFROM is not null");
            return (Criteria) this;
        }

        public Criteria andComefromEqualTo(BigDecimal value) {
            addCriterion("COMEFROM =", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromNotEqualTo(BigDecimal value) {
            addCriterion("COMEFROM <>", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromGreaterThan(BigDecimal value) {
            addCriterion("COMEFROM >", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COMEFROM >=", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromLessThan(BigDecimal value) {
            addCriterion("COMEFROM <", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COMEFROM <=", value, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromIn(List<BigDecimal> values) {
            addCriterion("COMEFROM in", values, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromNotIn(List<BigDecimal> values) {
            addCriterion("COMEFROM not in", values, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMEFROM between", value1, value2, "comefrom");
            return (Criteria) this;
        }

        public Criteria andComefromNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COMEFROM not between", value1, value2, "comefrom");
            return (Criteria) this;
        }

        public Criteria andIscodIsNull() {
            addCriterion("ISCOD is null");
            return (Criteria) this;
        }

        public Criteria andIscodIsNotNull() {
            addCriterion("ISCOD is not null");
            return (Criteria) this;
        }

        public Criteria andIscodEqualTo(BigDecimal value) {
            addCriterion("ISCOD =", value, "iscod");
            return (Criteria) this;
        }

        public Criteria andIscodNotEqualTo(BigDecimal value) {
            addCriterion("ISCOD <>", value, "iscod");
            return (Criteria) this;
        }

        public Criteria andIscodGreaterThan(BigDecimal value) {
            addCriterion("ISCOD >", value, "iscod");
            return (Criteria) this;
        }

        public Criteria andIscodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCOD >=", value, "iscod");
            return (Criteria) this;
        }

        public Criteria andIscodLessThan(BigDecimal value) {
            addCriterion("ISCOD <", value, "iscod");
            return (Criteria) this;
        }

        public Criteria andIscodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCOD <=", value, "iscod");
            return (Criteria) this;
        }

        public Criteria andIscodIn(List<BigDecimal> values) {
            addCriterion("ISCOD in", values, "iscod");
            return (Criteria) this;
        }

        public Criteria andIscodNotIn(List<BigDecimal> values) {
            addCriterion("ISCOD not in", values, "iscod");
            return (Criteria) this;
        }

        public Criteria andIscodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCOD between", value1, value2, "iscod");
            return (Criteria) this;
        }

        public Criteria andIscodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCOD not between", value1, value2, "iscod");
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

        public Criteria andIslastIsNull() {
            addCriterion("ISLAST is null");
            return (Criteria) this;
        }

        public Criteria andIslastIsNotNull() {
            addCriterion("ISLAST is not null");
            return (Criteria) this;
        }

        public Criteria andIslastEqualTo(BigDecimal value) {
            addCriterion("ISLAST =", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastNotEqualTo(BigDecimal value) {
            addCriterion("ISLAST <>", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastGreaterThan(BigDecimal value) {
            addCriterion("ISLAST >", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISLAST >=", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastLessThan(BigDecimal value) {
            addCriterion("ISLAST <", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISLAST <=", value, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastIn(List<BigDecimal> values) {
            addCriterion("ISLAST in", values, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastNotIn(List<BigDecimal> values) {
            addCriterion("ISLAST not in", values, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISLAST between", value1, value2, "islast");
            return (Criteria) this;
        }

        public Criteria andIslastNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISLAST not between", value1, value2, "islast");
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

        public Criteria andFareforjavaIsNull() {
            addCriterion("FAREFORJAVA is null");
            return (Criteria) this;
        }

        public Criteria andFareforjavaIsNotNull() {
            addCriterion("FAREFORJAVA is not null");
            return (Criteria) this;
        }

        public Criteria andFareforjavaEqualTo(BigDecimal value) {
            addCriterion("FAREFORJAVA =", value, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareforjavaNotEqualTo(BigDecimal value) {
            addCriterion("FAREFORJAVA <>", value, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareforjavaGreaterThan(BigDecimal value) {
            addCriterion("FAREFORJAVA >", value, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareforjavaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAREFORJAVA >=", value, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareforjavaLessThan(BigDecimal value) {
            addCriterion("FAREFORJAVA <", value, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareforjavaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAREFORJAVA <=", value, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareforjavaIn(List<BigDecimal> values) {
            addCriterion("FAREFORJAVA in", values, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareforjavaNotIn(List<BigDecimal> values) {
            addCriterion("FAREFORJAVA not in", values, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareforjavaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAREFORJAVA between", value1, value2, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareforjavaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAREFORJAVA not between", value1, value2, "fareforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaIsNull() {
            addCriterion("FAREFORMULAIDFORJAVA is null");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaIsNotNull() {
            addCriterion("FAREFORMULAIDFORJAVA is not null");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaEqualTo(BigDecimal value) {
            addCriterion("FAREFORMULAIDFORJAVA =", value, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaNotEqualTo(BigDecimal value) {
            addCriterion("FAREFORMULAIDFORJAVA <>", value, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaGreaterThan(BigDecimal value) {
            addCriterion("FAREFORMULAIDFORJAVA >", value, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FAREFORMULAIDFORJAVA >=", value, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaLessThan(BigDecimal value) {
            addCriterion("FAREFORMULAIDFORJAVA <", value, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FAREFORMULAIDFORJAVA <=", value, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaIn(List<BigDecimal> values) {
            addCriterion("FAREFORMULAIDFORJAVA in", values, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaNotIn(List<BigDecimal> values) {
            addCriterion("FAREFORMULAIDFORJAVA not in", values, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAREFORMULAIDFORJAVA between", value1, value2, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andFareformulaidforjavaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FAREFORMULAIDFORJAVA not between", value1, value2, "fareformulaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaIsNull() {
            addCriterion("AREAIDFORJAVA is null");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaIsNotNull() {
            addCriterion("AREAIDFORJAVA is not null");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaEqualTo(BigDecimal value) {
            addCriterion("AREAIDFORJAVA =", value, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaNotEqualTo(BigDecimal value) {
            addCriterion("AREAIDFORJAVA <>", value, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaGreaterThan(BigDecimal value) {
            addCriterion("AREAIDFORJAVA >", value, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AREAIDFORJAVA >=", value, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaLessThan(BigDecimal value) {
            addCriterion("AREAIDFORJAVA <", value, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AREAIDFORJAVA <=", value, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaIn(List<BigDecimal> values) {
            addCriterion("AREAIDFORJAVA in", values, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaNotIn(List<BigDecimal> values) {
            addCriterion("AREAIDFORJAVA not in", values, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AREAIDFORJAVA between", value1, value2, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andAreaidforjavaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AREAIDFORJAVA not between", value1, value2, "areaidforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaIsNull() {
            addCriterion("ISSYNFAREFORJAVA is null");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaIsNotNull() {
            addCriterion("ISSYNFAREFORJAVA is not null");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaEqualTo(BigDecimal value) {
            addCriterion("ISSYNFAREFORJAVA =", value, "issynfareforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaNotEqualTo(BigDecimal value) {
            addCriterion("ISSYNFAREFORJAVA <>", value, "issynfareforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaGreaterThan(BigDecimal value) {
            addCriterion("ISSYNFAREFORJAVA >", value, "issynfareforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNFAREFORJAVA >=", value, "issynfareforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaLessThan(BigDecimal value) {
            addCriterion("ISSYNFAREFORJAVA <", value, "issynfareforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISSYNFAREFORJAVA <=", value, "issynfareforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaIn(List<BigDecimal> values) {
            addCriterion("ISSYNFAREFORJAVA in", values, "issynfareforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaNotIn(List<BigDecimal> values) {
            addCriterion("ISSYNFAREFORJAVA not in", values, "issynfareforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNFAREFORJAVA between", value1, value2, "issynfareforjava");
            return (Criteria) this;
        }

        public Criteria andIssynfareforjavaNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISSYNFAREFORJAVA not between", value1, value2, "issynfareforjava");
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

        public Criteria andBackstationstatusEqualTo(BigDecimal value) {
            addCriterion("BACKSTATIONSTATUS =", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusNotEqualTo(BigDecimal value) {
            addCriterion("BACKSTATIONSTATUS <>", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusGreaterThan(BigDecimal value) {
            addCriterion("BACKSTATIONSTATUS >", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKSTATIONSTATUS >=", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusLessThan(BigDecimal value) {
            addCriterion("BACKSTATIONSTATUS <", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACKSTATIONSTATUS <=", value, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusIn(List<BigDecimal> values) {
            addCriterion("BACKSTATIONSTATUS in", values, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusNotIn(List<BigDecimal> values) {
            addCriterion("BACKSTATIONSTATUS not in", values, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKSTATIONSTATUS between", value1, value2, "backstationstatus");
            return (Criteria) this;
        }

        public Criteria andBackstationstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACKSTATIONSTATUS not between", value1, value2, "backstationstatus");
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

        public Criteria andReceivebyIsNull() {
            addCriterion("RECEIVEBY is null");
            return (Criteria) this;
        }

        public Criteria andReceivebyIsNotNull() {
            addCriterion("RECEIVEBY is not null");
            return (Criteria) this;
        }

        public Criteria andReceivebyEqualTo(String value) {
            addCriterion("RECEIVEBY =", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyNotEqualTo(String value) {
            addCriterion("RECEIVEBY <>", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyGreaterThan(String value) {
            addCriterion("RECEIVEBY >", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVEBY >=", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyLessThan(String value) {
            addCriterion("RECEIVEBY <", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyLessThanOrEqualTo(String value) {
            addCriterion("RECEIVEBY <=", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyLike(String value) {
            addCriterion("RECEIVEBY like", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyNotLike(String value) {
            addCriterion("RECEIVEBY not like", value, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyIn(List<String> values) {
            addCriterion("RECEIVEBY in", values, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyNotIn(List<String> values) {
            addCriterion("RECEIVEBY not in", values, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyBetween(String value1, String value2) {
            addCriterion("RECEIVEBY between", value1, value2, "receiveby");
            return (Criteria) this;
        }

        public Criteria andReceivebyNotBetween(String value1, String value2) {
            addCriterion("RECEIVEBY not between", value1, value2, "receiveby");
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

        public Criteria andMsgforjavaIsNull() {
            addCriterion("MSGFORJAVA is null");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaIsNotNull() {
            addCriterion("MSGFORJAVA is not null");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaEqualTo(String value) {
            addCriterion("MSGFORJAVA =", value, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaNotEqualTo(String value) {
            addCriterion("MSGFORJAVA <>", value, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaGreaterThan(String value) {
            addCriterion("MSGFORJAVA >", value, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaGreaterThanOrEqualTo(String value) {
            addCriterion("MSGFORJAVA >=", value, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaLessThan(String value) {
            addCriterion("MSGFORJAVA <", value, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaLessThanOrEqualTo(String value) {
            addCriterion("MSGFORJAVA <=", value, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaLike(String value) {
            addCriterion("MSGFORJAVA like", value, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaNotLike(String value) {
            addCriterion("MSGFORJAVA not like", value, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaIn(List<String> values) {
            addCriterion("MSGFORJAVA in", values, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaNotIn(List<String> values) {
            addCriterion("MSGFORJAVA not in", values, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaBetween(String value1, String value2) {
            addCriterion("MSGFORJAVA between", value1, value2, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMsgforjavaNotBetween(String value1, String value2) {
            addCriterion("MSGFORJAVA not between", value1, value2, "msgforjava");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryIsNull() {
            addCriterion("MERCHANTCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryIsNotNull() {
            addCriterion("MERCHANTCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryEqualTo(String value) {
            addCriterion("MERCHANTCATEGORY =", value, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryNotEqualTo(String value) {
            addCriterion("MERCHANTCATEGORY <>", value, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryGreaterThan(String value) {
            addCriterion("MERCHANTCATEGORY >", value, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryGreaterThanOrEqualTo(String value) {
            addCriterion("MERCHANTCATEGORY >=", value, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryLessThan(String value) {
            addCriterion("MERCHANTCATEGORY <", value, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryLessThanOrEqualTo(String value) {
            addCriterion("MERCHANTCATEGORY <=", value, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryLike(String value) {
            addCriterion("MERCHANTCATEGORY like", value, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryNotLike(String value) {
            addCriterion("MERCHANTCATEGORY not like", value, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryIn(List<String> values) {
            addCriterion("MERCHANTCATEGORY in", values, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryNotIn(List<String> values) {
            addCriterion("MERCHANTCATEGORY not in", values, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryBetween(String value1, String value2) {
            addCriterion("MERCHANTCATEGORY between", value1, value2, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andMerchantcategoryNotBetween(String value1, String value2) {
            addCriterion("MERCHANTCATEGORY not between", value1, value2, "merchantcategory");
            return (Criteria) this;
        }

        public Criteria andCodpoundageIsNull() {
            addCriterion("CODPOUNDAGE is null");
            return (Criteria) this;
        }

        public Criteria andCodpoundageIsNotNull() {
            addCriterion("CODPOUNDAGE is not null");
            return (Criteria) this;
        }

        public Criteria andCodpoundageEqualTo(BigDecimal value) {
            addCriterion("CODPOUNDAGE =", value, "codpoundage");
            return (Criteria) this;
        }

        public Criteria andCodpoundageNotEqualTo(BigDecimal value) {
            addCriterion("CODPOUNDAGE <>", value, "codpoundage");
            return (Criteria) this;
        }

        public Criteria andCodpoundageGreaterThan(BigDecimal value) {
            addCriterion("CODPOUNDAGE >", value, "codpoundage");
            return (Criteria) this;
        }

        public Criteria andCodpoundageGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CODPOUNDAGE >=", value, "codpoundage");
            return (Criteria) this;
        }

        public Criteria andCodpoundageLessThan(BigDecimal value) {
            addCriterion("CODPOUNDAGE <", value, "codpoundage");
            return (Criteria) this;
        }

        public Criteria andCodpoundageLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CODPOUNDAGE <=", value, "codpoundage");
            return (Criteria) this;
        }

        public Criteria andCodpoundageIn(List<BigDecimal> values) {
            addCriterion("CODPOUNDAGE in", values, "codpoundage");
            return (Criteria) this;
        }

        public Criteria andCodpoundageNotIn(List<BigDecimal> values) {
            addCriterion("CODPOUNDAGE not in", values, "codpoundage");
            return (Criteria) this;
        }

        public Criteria andCodpoundageBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CODPOUNDAGE between", value1, value2, "codpoundage");
            return (Criteria) this;
        }

        public Criteria andCodpoundageNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CODPOUNDAGE not between", value1, value2, "codpoundage");
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
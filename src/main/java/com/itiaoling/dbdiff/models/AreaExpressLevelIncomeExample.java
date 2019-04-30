package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AreaExpressLevelIncomeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AreaExpressLevelIncomeExample() {
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

        public Criteria andAutoidIsNull() {
            addCriterion("AUTOID is null");
            return (Criteria) this;
        }

        public Criteria andAutoidIsNotNull() {
            addCriterion("AUTOID is not null");
            return (Criteria) this;
        }

        public Criteria andAutoidEqualTo(BigDecimal value) {
            addCriterion("AUTOID =", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidNotEqualTo(BigDecimal value) {
            addCriterion("AUTOID <>", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidGreaterThan(BigDecimal value) {
            addCriterion("AUTOID >", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTOID >=", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidLessThan(BigDecimal value) {
            addCriterion("AUTOID <", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUTOID <=", value, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidIn(List<BigDecimal> values) {
            addCriterion("AUTOID in", values, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidNotIn(List<BigDecimal> values) {
            addCriterion("AUTOID not in", values, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTOID between", value1, value2, "autoid");
            return (Criteria) this;
        }

        public Criteria andAutoidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUTOID not between", value1, value2, "autoid");
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

        public Criteria andIsenableIsNull() {
            addCriterion("ISENABLE is null");
            return (Criteria) this;
        }

        public Criteria andIsenableIsNotNull() {
            addCriterion("ISENABLE is not null");
            return (Criteria) this;
        }

        public Criteria andIsenableEqualTo(BigDecimal value) {
            addCriterion("ISENABLE =", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotEqualTo(BigDecimal value) {
            addCriterion("ISENABLE <>", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThan(BigDecimal value) {
            addCriterion("ISENABLE >", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISENABLE >=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThan(BigDecimal value) {
            addCriterion("ISENABLE <", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISENABLE <=", value, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableIn(List<BigDecimal> values) {
            addCriterion("ISENABLE in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotIn(List<BigDecimal> values) {
            addCriterion("ISENABLE not in", values, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISENABLE between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andIsenableNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISENABLE not between", value1, value2, "isenable");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeIsNull() {
            addCriterion("EFFECTAREATYPE is null");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeIsNotNull() {
            addCriterion("EFFECTAREATYPE is not null");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeEqualTo(BigDecimal value) {
            addCriterion("EFFECTAREATYPE =", value, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeNotEqualTo(BigDecimal value) {
            addCriterion("EFFECTAREATYPE <>", value, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeGreaterThan(BigDecimal value) {
            addCriterion("EFFECTAREATYPE >", value, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EFFECTAREATYPE >=", value, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeLessThan(BigDecimal value) {
            addCriterion("EFFECTAREATYPE <", value, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EFFECTAREATYPE <=", value, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeIn(List<BigDecimal> values) {
            addCriterion("EFFECTAREATYPE in", values, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeNotIn(List<BigDecimal> values) {
            addCriterion("EFFECTAREATYPE not in", values, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EFFECTAREATYPE between", value1, value2, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andEffectareatypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EFFECTAREATYPE not between", value1, value2, "effectareatype");
            return (Criteria) this;
        }

        public Criteria andDodateIsNull() {
            addCriterion("DODATE is null");
            return (Criteria) this;
        }

        public Criteria andDodateIsNotNull() {
            addCriterion("DODATE is not null");
            return (Criteria) this;
        }

        public Criteria andDodateEqualTo(Date value) {
            addCriterion("DODATE =", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateNotEqualTo(Date value) {
            addCriterion("DODATE <>", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateGreaterThan(Date value) {
            addCriterion("DODATE >", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateGreaterThanOrEqualTo(Date value) {
            addCriterion("DODATE >=", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateLessThan(Date value) {
            addCriterion("DODATE <", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateLessThanOrEqualTo(Date value) {
            addCriterion("DODATE <=", value, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateIn(List<Date> values) {
            addCriterion("DODATE in", values, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateNotIn(List<Date> values) {
            addCriterion("DODATE not in", values, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateBetween(Date value1, Date value2) {
            addCriterion("DODATE between", value1, value2, "dodate");
            return (Criteria) this;
        }

        public Criteria andDodateNotBetween(Date value1, Date value2) {
            addCriterion("DODATE not between", value1, value2, "dodate");
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

        public Criteria andAuditstatusIsNull() {
            addCriterion("AUDITSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIsNotNull() {
            addCriterion("AUDITSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAuditstatusEqualTo(BigDecimal value) {
            addCriterion("AUDITSTATUS =", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotEqualTo(BigDecimal value) {
            addCriterion("AUDITSTATUS <>", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThan(BigDecimal value) {
            addCriterion("AUDITSTATUS >", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDITSTATUS >=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThan(BigDecimal value) {
            addCriterion("AUDITSTATUS <", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDITSTATUS <=", value, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusIn(List<BigDecimal> values) {
            addCriterion("AUDITSTATUS in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotIn(List<BigDecimal> values) {
            addCriterion("AUDITSTATUS not in", values, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDITSTATUS between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditstatusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDITSTATUS not between", value1, value2, "auditstatus");
            return (Criteria) this;
        }

        public Criteria andAuditbyIsNull() {
            addCriterion("AUDITBY is null");
            return (Criteria) this;
        }

        public Criteria andAuditbyIsNotNull() {
            addCriterion("AUDITBY is not null");
            return (Criteria) this;
        }

        public Criteria andAuditbyEqualTo(BigDecimal value) {
            addCriterion("AUDITBY =", value, "auditby");
            return (Criteria) this;
        }

        public Criteria andAuditbyNotEqualTo(BigDecimal value) {
            addCriterion("AUDITBY <>", value, "auditby");
            return (Criteria) this;
        }

        public Criteria andAuditbyGreaterThan(BigDecimal value) {
            addCriterion("AUDITBY >", value, "auditby");
            return (Criteria) this;
        }

        public Criteria andAuditbyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDITBY >=", value, "auditby");
            return (Criteria) this;
        }

        public Criteria andAuditbyLessThan(BigDecimal value) {
            addCriterion("AUDITBY <", value, "auditby");
            return (Criteria) this;
        }

        public Criteria andAuditbyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDITBY <=", value, "auditby");
            return (Criteria) this;
        }

        public Criteria andAuditbyIn(List<BigDecimal> values) {
            addCriterion("AUDITBY in", values, "auditby");
            return (Criteria) this;
        }

        public Criteria andAuditbyNotIn(List<BigDecimal> values) {
            addCriterion("AUDITBY not in", values, "auditby");
            return (Criteria) this;
        }

        public Criteria andAuditbyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDITBY between", value1, value2, "auditby");
            return (Criteria) this;
        }

        public Criteria andAuditbyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDITBY not between", value1, value2, "auditby");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNull() {
            addCriterion("AUDITTIME is null");
            return (Criteria) this;
        }

        public Criteria andAudittimeIsNotNull() {
            addCriterion("AUDITTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAudittimeEqualTo(Date value) {
            addCriterion("AUDITTIME =", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotEqualTo(Date value) {
            addCriterion("AUDITTIME <>", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThan(Date value) {
            addCriterion("AUDITTIME >", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeGreaterThanOrEqualTo(Date value) {
            addCriterion("AUDITTIME >=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThan(Date value) {
            addCriterion("AUDITTIME <", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeLessThanOrEqualTo(Date value) {
            addCriterion("AUDITTIME <=", value, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeIn(List<Date> values) {
            addCriterion("AUDITTIME in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotIn(List<Date> values) {
            addCriterion("AUDITTIME not in", values, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeBetween(Date value1, Date value2) {
            addCriterion("AUDITTIME between", value1, value2, "audittime");
            return (Criteria) this;
        }

        public Criteria andAudittimeNotBetween(Date value1, Date value2) {
            addCriterion("AUDITTIME not between", value1, value2, "audittime");
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

        public Criteria andGoodscategorycodeIsNull() {
            addCriterion("GOODSCATEGORYCODE is null");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeIsNotNull() {
            addCriterion("GOODSCATEGORYCODE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeEqualTo(String value) {
            addCriterion("GOODSCATEGORYCODE =", value, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeNotEqualTo(String value) {
            addCriterion("GOODSCATEGORYCODE <>", value, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeGreaterThan(String value) {
            addCriterion("GOODSCATEGORYCODE >", value, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODSCATEGORYCODE >=", value, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeLessThan(String value) {
            addCriterion("GOODSCATEGORYCODE <", value, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeLessThanOrEqualTo(String value) {
            addCriterion("GOODSCATEGORYCODE <=", value, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeLike(String value) {
            addCriterion("GOODSCATEGORYCODE like", value, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeNotLike(String value) {
            addCriterion("GOODSCATEGORYCODE not like", value, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeIn(List<String> values) {
            addCriterion("GOODSCATEGORYCODE in", values, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeNotIn(List<String> values) {
            addCriterion("GOODSCATEGORYCODE not in", values, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeBetween(String value1, String value2) {
            addCriterion("GOODSCATEGORYCODE between", value1, value2, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andGoodscategorycodeNotBetween(String value1, String value2) {
            addCriterion("GOODSCATEGORYCODE not between", value1, value2, "goodscategorycode");
            return (Criteria) this;
        }

        public Criteria andIsexpressIsNull() {
            addCriterion("ISEXPRESS is null");
            return (Criteria) this;
        }

        public Criteria andIsexpressIsNotNull() {
            addCriterion("ISEXPRESS is not null");
            return (Criteria) this;
        }

        public Criteria andIsexpressEqualTo(BigDecimal value) {
            addCriterion("ISEXPRESS =", value, "isexpress");
            return (Criteria) this;
        }

        public Criteria andIsexpressNotEqualTo(BigDecimal value) {
            addCriterion("ISEXPRESS <>", value, "isexpress");
            return (Criteria) this;
        }

        public Criteria andIsexpressGreaterThan(BigDecimal value) {
            addCriterion("ISEXPRESS >", value, "isexpress");
            return (Criteria) this;
        }

        public Criteria andIsexpressGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISEXPRESS >=", value, "isexpress");
            return (Criteria) this;
        }

        public Criteria andIsexpressLessThan(BigDecimal value) {
            addCriterion("ISEXPRESS <", value, "isexpress");
            return (Criteria) this;
        }

        public Criteria andIsexpressLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISEXPRESS <=", value, "isexpress");
            return (Criteria) this;
        }

        public Criteria andIsexpressIn(List<BigDecimal> values) {
            addCriterion("ISEXPRESS in", values, "isexpress");
            return (Criteria) this;
        }

        public Criteria andIsexpressNotIn(List<BigDecimal> values) {
            addCriterion("ISEXPRESS not in", values, "isexpress");
            return (Criteria) this;
        }

        public Criteria andIsexpressBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISEXPRESS between", value1, value2, "isexpress");
            return (Criteria) this;
        }

        public Criteria andIsexpressNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISEXPRESS not between", value1, value2, "isexpress");
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
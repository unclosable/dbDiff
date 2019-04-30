package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MerchantDeliverFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerchantDeliverFeeExample() {
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

        public Criteria andFeeidIsNull() {
            addCriterion("FEEID is null");
            return (Criteria) this;
        }

        public Criteria andFeeidIsNotNull() {
            addCriterion("FEEID is not null");
            return (Criteria) this;
        }

        public Criteria andFeeidEqualTo(BigDecimal value) {
            addCriterion("FEEID =", value, "feeid");
            return (Criteria) this;
        }

        public Criteria andFeeidNotEqualTo(BigDecimal value) {
            addCriterion("FEEID <>", value, "feeid");
            return (Criteria) this;
        }

        public Criteria andFeeidGreaterThan(BigDecimal value) {
            addCriterion("FEEID >", value, "feeid");
            return (Criteria) this;
        }

        public Criteria andFeeidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEID >=", value, "feeid");
            return (Criteria) this;
        }

        public Criteria andFeeidLessThan(BigDecimal value) {
            addCriterion("FEEID <", value, "feeid");
            return (Criteria) this;
        }

        public Criteria andFeeidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEID <=", value, "feeid");
            return (Criteria) this;
        }

        public Criteria andFeeidIn(List<BigDecimal> values) {
            addCriterion("FEEID in", values, "feeid");
            return (Criteria) this;
        }

        public Criteria andFeeidNotIn(List<BigDecimal> values) {
            addCriterion("FEEID not in", values, "feeid");
            return (Criteria) this;
        }

        public Criteria andFeeidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEID between", value1, value2, "feeid");
            return (Criteria) this;
        }

        public Criteria andFeeidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEID not between", value1, value2, "feeid");
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

        public Criteria andPaymenttypeIsNull() {
            addCriterion("PAYMENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIsNotNull() {
            addCriterion("PAYMENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeEqualTo(BigDecimal value) {
            addCriterion("PAYMENTTYPE =", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENTTYPE <>", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThan(BigDecimal value) {
            addCriterion("PAYMENTTYPE >", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENTTYPE >=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThan(BigDecimal value) {
            addCriterion("PAYMENTTYPE <", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENTTYPE <=", value, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeIn(List<BigDecimal> values) {
            addCriterion("PAYMENTTYPE in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENTTYPE not in", values, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENTTYPE between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymenttypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENTTYPE not between", value1, value2, "paymenttype");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodIsNull() {
            addCriterion("PAYMENTPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodIsNotNull() {
            addCriterion("PAYMENTPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodEqualTo(BigDecimal value) {
            addCriterion("PAYMENTPERIOD =", value, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodNotEqualTo(BigDecimal value) {
            addCriterion("PAYMENTPERIOD <>", value, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodGreaterThan(BigDecimal value) {
            addCriterion("PAYMENTPERIOD >", value, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENTPERIOD >=", value, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodLessThan(BigDecimal value) {
            addCriterion("PAYMENTPERIOD <", value, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAYMENTPERIOD <=", value, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodIn(List<BigDecimal> values) {
            addCriterion("PAYMENTPERIOD in", values, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodNotIn(List<BigDecimal> values) {
            addCriterion("PAYMENTPERIOD not in", values, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENTPERIOD between", value1, value2, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andPaymentperiodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAYMENTPERIOD not between", value1, value2, "paymentperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeIsNull() {
            addCriterion("DELIVERFEETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeIsNotNull() {
            addCriterion("DELIVERFEETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeEqualTo(BigDecimal value) {
            addCriterion("DELIVERFEETYPE =", value, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeNotEqualTo(BigDecimal value) {
            addCriterion("DELIVERFEETYPE <>", value, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeGreaterThan(BigDecimal value) {
            addCriterion("DELIVERFEETYPE >", value, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERFEETYPE >=", value, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeLessThan(BigDecimal value) {
            addCriterion("DELIVERFEETYPE <", value, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERFEETYPE <=", value, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeIn(List<BigDecimal> values) {
            addCriterion("DELIVERFEETYPE in", values, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeNotIn(List<BigDecimal> values) {
            addCriterion("DELIVERFEETYPE not in", values, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERFEETYPE between", value1, value2, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERFEETYPE not between", value1, value2, "deliverfeetype");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodIsNull() {
            addCriterion("DELIVERFEEPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodIsNotNull() {
            addCriterion("DELIVERFEEPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodEqualTo(BigDecimal value) {
            addCriterion("DELIVERFEEPERIOD =", value, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodNotEqualTo(BigDecimal value) {
            addCriterion("DELIVERFEEPERIOD <>", value, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodGreaterThan(BigDecimal value) {
            addCriterion("DELIVERFEEPERIOD >", value, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERFEEPERIOD >=", value, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodLessThan(BigDecimal value) {
            addCriterion("DELIVERFEEPERIOD <", value, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERFEEPERIOD <=", value, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodIn(List<BigDecimal> values) {
            addCriterion("DELIVERFEEPERIOD in", values, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodNotIn(List<BigDecimal> values) {
            addCriterion("DELIVERFEEPERIOD not in", values, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERFEEPERIOD between", value1, value2, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperiodNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERFEEPERIOD not between", value1, value2, "deliverfeeperiod");
            return (Criteria) this;
        }

        public Criteria andFeefactorsIsNull() {
            addCriterion("FEEFACTORS is null");
            return (Criteria) this;
        }

        public Criteria andFeefactorsIsNotNull() {
            addCriterion("FEEFACTORS is not null");
            return (Criteria) this;
        }

        public Criteria andFeefactorsEqualTo(String value) {
            addCriterion("FEEFACTORS =", value, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsNotEqualTo(String value) {
            addCriterion("FEEFACTORS <>", value, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsGreaterThan(String value) {
            addCriterion("FEEFACTORS >", value, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsGreaterThanOrEqualTo(String value) {
            addCriterion("FEEFACTORS >=", value, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsLessThan(String value) {
            addCriterion("FEEFACTORS <", value, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsLessThanOrEqualTo(String value) {
            addCriterion("FEEFACTORS <=", value, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsLike(String value) {
            addCriterion("FEEFACTORS like", value, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsNotLike(String value) {
            addCriterion("FEEFACTORS not like", value, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsIn(List<String> values) {
            addCriterion("FEEFACTORS in", values, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsNotIn(List<String> values) {
            addCriterion("FEEFACTORS not in", values, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsBetween(String value1, String value2) {
            addCriterion("FEEFACTORS between", value1, value2, "feefactors");
            return (Criteria) this;
        }

        public Criteria andFeefactorsNotBetween(String value1, String value2) {
            addCriterion("FEEFACTORS not between", value1, value2, "feefactors");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeIsNull() {
            addCriterion("ISUNIFORMEDFEE is null");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeIsNotNull() {
            addCriterion("ISUNIFORMEDFEE is not null");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeEqualTo(BigDecimal value) {
            addCriterion("ISUNIFORMEDFEE =", value, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeNotEqualTo(BigDecimal value) {
            addCriterion("ISUNIFORMEDFEE <>", value, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeGreaterThan(BigDecimal value) {
            addCriterion("ISUNIFORMEDFEE >", value, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISUNIFORMEDFEE >=", value, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeLessThan(BigDecimal value) {
            addCriterion("ISUNIFORMEDFEE <", value, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISUNIFORMEDFEE <=", value, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeIn(List<BigDecimal> values) {
            addCriterion("ISUNIFORMEDFEE in", values, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeNotIn(List<BigDecimal> values) {
            addCriterion("ISUNIFORMEDFEE not in", values, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISUNIFORMEDFEE between", value1, value2, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andIsuniformedfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISUNIFORMEDFEE not between", value1, value2, "isuniformedfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeIsNull() {
            addCriterion("BASICDELIVERFEE is null");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeIsNotNull() {
            addCriterion("BASICDELIVERFEE is not null");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeEqualTo(BigDecimal value) {
            addCriterion("BASICDELIVERFEE =", value, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeNotEqualTo(BigDecimal value) {
            addCriterion("BASICDELIVERFEE <>", value, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeGreaterThan(BigDecimal value) {
            addCriterion("BASICDELIVERFEE >", value, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASICDELIVERFEE >=", value, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeLessThan(BigDecimal value) {
            addCriterion("BASICDELIVERFEE <", value, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASICDELIVERFEE <=", value, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeIn(List<BigDecimal> values) {
            addCriterion("BASICDELIVERFEE in", values, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeNotIn(List<BigDecimal> values) {
            addCriterion("BASICDELIVERFEE not in", values, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASICDELIVERFEE between", value1, value2, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andBasicdeliverfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASICDELIVERFEE not between", value1, value2, "basicdeliverfee");
            return (Criteria) this;
        }

        public Criteria andFormulaidIsNull() {
            addCriterion("FORMULAID is null");
            return (Criteria) this;
        }

        public Criteria andFormulaidIsNotNull() {
            addCriterion("FORMULAID is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaidEqualTo(BigDecimal value) {
            addCriterion("FORMULAID =", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidNotEqualTo(BigDecimal value) {
            addCriterion("FORMULAID <>", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidGreaterThan(BigDecimal value) {
            addCriterion("FORMULAID >", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMULAID >=", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidLessThan(BigDecimal value) {
            addCriterion("FORMULAID <", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORMULAID <=", value, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidIn(List<BigDecimal> values) {
            addCriterion("FORMULAID in", values, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidNotIn(List<BigDecimal> values) {
            addCriterion("FORMULAID not in", values, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMULAID between", value1, value2, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORMULAID not between", value1, value2, "formulaid");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersIsNull() {
            addCriterion("FORMULAPARAMTERS is null");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersIsNotNull() {
            addCriterion("FORMULAPARAMTERS is not null");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersEqualTo(String value) {
            addCriterion("FORMULAPARAMTERS =", value, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersNotEqualTo(String value) {
            addCriterion("FORMULAPARAMTERS <>", value, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersGreaterThan(String value) {
            addCriterion("FORMULAPARAMTERS >", value, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersGreaterThanOrEqualTo(String value) {
            addCriterion("FORMULAPARAMTERS >=", value, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersLessThan(String value) {
            addCriterion("FORMULAPARAMTERS <", value, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersLessThanOrEqualTo(String value) {
            addCriterion("FORMULAPARAMTERS <=", value, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersLike(String value) {
            addCriterion("FORMULAPARAMTERS like", value, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersNotLike(String value) {
            addCriterion("FORMULAPARAMTERS not like", value, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersIn(List<String> values) {
            addCriterion("FORMULAPARAMTERS in", values, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersNotIn(List<String> values) {
            addCriterion("FORMULAPARAMTERS not in", values, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersBetween(String value1, String value2) {
            addCriterion("FORMULAPARAMTERS between", value1, value2, "formulaparamters");
            return (Criteria) this;
        }

        public Criteria andFormulaparamtersNotBetween(String value1, String value2) {
            addCriterion("FORMULAPARAMTERS not between", value1, value2, "formulaparamters");
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

        public Criteria andUpdatecodeIsNull() {
            addCriterion("UPDATECODE is null");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeIsNotNull() {
            addCriterion("UPDATECODE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeEqualTo(String value) {
            addCriterion("UPDATECODE =", value, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeNotEqualTo(String value) {
            addCriterion("UPDATECODE <>", value, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeGreaterThan(String value) {
            addCriterion("UPDATECODE >", value, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATECODE >=", value, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeLessThan(String value) {
            addCriterion("UPDATECODE <", value, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeLessThanOrEqualTo(String value) {
            addCriterion("UPDATECODE <=", value, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeLike(String value) {
            addCriterion("UPDATECODE like", value, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeNotLike(String value) {
            addCriterion("UPDATECODE not like", value, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeIn(List<String> values) {
            addCriterion("UPDATECODE in", values, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeNotIn(List<String> values) {
            addCriterion("UPDATECODE not in", values, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeBetween(String value1, String value2) {
            addCriterion("UPDATECODE between", value1, value2, "updatecode");
            return (Criteria) this;
        }

        public Criteria andUpdatecodeNotBetween(String value1, String value2) {
            addCriterion("UPDATECODE not between", value1, value2, "updatecode");
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

        public Criteria andAuditcodeIsNull() {
            addCriterion("AUDITCODE is null");
            return (Criteria) this;
        }

        public Criteria andAuditcodeIsNotNull() {
            addCriterion("AUDITCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAuditcodeEqualTo(String value) {
            addCriterion("AUDITCODE =", value, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeNotEqualTo(String value) {
            addCriterion("AUDITCODE <>", value, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeGreaterThan(String value) {
            addCriterion("AUDITCODE >", value, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeGreaterThanOrEqualTo(String value) {
            addCriterion("AUDITCODE >=", value, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeLessThan(String value) {
            addCriterion("AUDITCODE <", value, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeLessThanOrEqualTo(String value) {
            addCriterion("AUDITCODE <=", value, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeLike(String value) {
            addCriterion("AUDITCODE like", value, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeNotLike(String value) {
            addCriterion("AUDITCODE not like", value, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeIn(List<String> values) {
            addCriterion("AUDITCODE in", values, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeNotIn(List<String> values) {
            addCriterion("AUDITCODE not in", values, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeBetween(String value1, String value2) {
            addCriterion("AUDITCODE between", value1, value2, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditcodeNotBetween(String value1, String value2) {
            addCriterion("AUDITCODE not between", value1, value2, "auditcode");
            return (Criteria) this;
        }

        public Criteria andAuditresultIsNull() {
            addCriterion("AUDITRESULT is null");
            return (Criteria) this;
        }

        public Criteria andAuditresultIsNotNull() {
            addCriterion("AUDITRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAuditresultEqualTo(BigDecimal value) {
            addCriterion("AUDITRESULT =", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotEqualTo(BigDecimal value) {
            addCriterion("AUDITRESULT <>", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultGreaterThan(BigDecimal value) {
            addCriterion("AUDITRESULT >", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDITRESULT >=", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultLessThan(BigDecimal value) {
            addCriterion("AUDITRESULT <", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUDITRESULT <=", value, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultIn(List<BigDecimal> values) {
            addCriterion("AUDITRESULT in", values, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotIn(List<BigDecimal> values) {
            addCriterion("AUDITRESULT not in", values, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDITRESULT between", value1, value2, "auditresult");
            return (Criteria) this;
        }

        public Criteria andAuditresultNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUDITRESULT not between", value1, value2, "auditresult");
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

        public Criteria andRefusefeerateIsNull() {
            addCriterion("REFUSEFEERATE is null");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateIsNotNull() {
            addCriterion("REFUSEFEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateEqualTo(BigDecimal value) {
            addCriterion("REFUSEFEERATE =", value, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateNotEqualTo(BigDecimal value) {
            addCriterion("REFUSEFEERATE <>", value, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateGreaterThan(BigDecimal value) {
            addCriterion("REFUSEFEERATE >", value, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUSEFEERATE >=", value, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateLessThan(BigDecimal value) {
            addCriterion("REFUSEFEERATE <", value, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUSEFEERATE <=", value, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateIn(List<BigDecimal> values) {
            addCriterion("REFUSEFEERATE in", values, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateNotIn(List<BigDecimal> values) {
            addCriterion("REFUSEFEERATE not in", values, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUSEFEERATE between", value1, value2, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andRefusefeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUSEFEERATE not between", value1, value2, "refusefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateIsNull() {
            addCriterion("RECEIVEFEERATE is null");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateIsNotNull() {
            addCriterion("RECEIVEFEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEERATE =", value, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEERATE <>", value, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateGreaterThan(BigDecimal value) {
            addCriterion("RECEIVEFEERATE >", value, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEERATE >=", value, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateLessThan(BigDecimal value) {
            addCriterion("RECEIVEFEERATE <", value, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEERATE <=", value, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateIn(List<BigDecimal> values) {
            addCriterion("RECEIVEFEERATE in", values, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVEFEERATE not in", values, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEFEERATE between", value1, value2, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andReceivefeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEFEERATE not between", value1, value2, "receivefeerate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateIsNull() {
            addCriterion("PAYMENTPERIODDATE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateIsNotNull() {
            addCriterion("PAYMENTPERIODDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateEqualTo(Date value) {
            addCriterion("PAYMENTPERIODDATE =", value, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateNotEqualTo(Date value) {
            addCriterion("PAYMENTPERIODDATE <>", value, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateGreaterThan(Date value) {
            addCriterion("PAYMENTPERIODDATE >", value, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateGreaterThanOrEqualTo(Date value) {
            addCriterion("PAYMENTPERIODDATE >=", value, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateLessThan(Date value) {
            addCriterion("PAYMENTPERIODDATE <", value, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateLessThanOrEqualTo(Date value) {
            addCriterion("PAYMENTPERIODDATE <=", value, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateIn(List<Date> values) {
            addCriterion("PAYMENTPERIODDATE in", values, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateNotIn(List<Date> values) {
            addCriterion("PAYMENTPERIODDATE not in", values, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateBetween(Date value1, Date value2) {
            addCriterion("PAYMENTPERIODDATE between", value1, value2, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andPaymentperioddateNotBetween(Date value1, Date value2) {
            addCriterion("PAYMENTPERIODDATE not between", value1, value2, "paymentperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateIsNull() {
            addCriterion("DELIVERFEEPERIODDATE is null");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateIsNotNull() {
            addCriterion("DELIVERFEEPERIODDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateEqualTo(Date value) {
            addCriterion("DELIVERFEEPERIODDATE =", value, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateNotEqualTo(Date value) {
            addCriterion("DELIVERFEEPERIODDATE <>", value, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateGreaterThan(Date value) {
            addCriterion("DELIVERFEEPERIODDATE >", value, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateGreaterThanOrEqualTo(Date value) {
            addCriterion("DELIVERFEEPERIODDATE >=", value, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateLessThan(Date value) {
            addCriterion("DELIVERFEEPERIODDATE <", value, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateLessThanOrEqualTo(Date value) {
            addCriterion("DELIVERFEEPERIODDATE <=", value, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateIn(List<Date> values) {
            addCriterion("DELIVERFEEPERIODDATE in", values, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateNotIn(List<Date> values) {
            addCriterion("DELIVERFEEPERIODDATE not in", values, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateBetween(Date value1, Date value2) {
            addCriterion("DELIVERFEEPERIODDATE between", value1, value2, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andDeliverfeeperioddateNotBetween(Date value1, Date value2) {
            addCriterion("DELIVERFEEPERIODDATE not between", value1, value2, "deliverfeeperioddate");
            return (Criteria) this;
        }

        public Criteria andFirstweightIsNull() {
            addCriterion("FIRSTWEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andFirstweightIsNotNull() {
            addCriterion("FIRSTWEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andFirstweightEqualTo(BigDecimal value) {
            addCriterion("FIRSTWEIGHT =", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightNotEqualTo(BigDecimal value) {
            addCriterion("FIRSTWEIGHT <>", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightGreaterThan(BigDecimal value) {
            addCriterion("FIRSTWEIGHT >", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSTWEIGHT >=", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightLessThan(BigDecimal value) {
            addCriterion("FIRSTWEIGHT <", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSTWEIGHT <=", value, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightIn(List<BigDecimal> values) {
            addCriterion("FIRSTWEIGHT in", values, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightNotIn(List<BigDecimal> values) {
            addCriterion("FIRSTWEIGHT not in", values, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSTWEIGHT between", value1, value2, "firstweight");
            return (Criteria) this;
        }

        public Criteria andFirstweightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSTWEIGHT not between", value1, value2, "firstweight");
            return (Criteria) this;
        }

        public Criteria andStatpramerIsNull() {
            addCriterion("STATPRAMER is null");
            return (Criteria) this;
        }

        public Criteria andStatpramerIsNotNull() {
            addCriterion("STATPRAMER is not null");
            return (Criteria) this;
        }

        public Criteria andStatpramerEqualTo(BigDecimal value) {
            addCriterion("STATPRAMER =", value, "statpramer");
            return (Criteria) this;
        }

        public Criteria andStatpramerNotEqualTo(BigDecimal value) {
            addCriterion("STATPRAMER <>", value, "statpramer");
            return (Criteria) this;
        }

        public Criteria andStatpramerGreaterThan(BigDecimal value) {
            addCriterion("STATPRAMER >", value, "statpramer");
            return (Criteria) this;
        }

        public Criteria andStatpramerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STATPRAMER >=", value, "statpramer");
            return (Criteria) this;
        }

        public Criteria andStatpramerLessThan(BigDecimal value) {
            addCriterion("STATPRAMER <", value, "statpramer");
            return (Criteria) this;
        }

        public Criteria andStatpramerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STATPRAMER <=", value, "statpramer");
            return (Criteria) this;
        }

        public Criteria andStatpramerIn(List<BigDecimal> values) {
            addCriterion("STATPRAMER in", values, "statpramer");
            return (Criteria) this;
        }

        public Criteria andStatpramerNotIn(List<BigDecimal> values) {
            addCriterion("STATPRAMER not in", values, "statpramer");
            return (Criteria) this;
        }

        public Criteria andStatpramerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATPRAMER between", value1, value2, "statpramer");
            return (Criteria) this;
        }

        public Criteria andStatpramerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STATPRAMER not between", value1, value2, "statpramer");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceIsNull() {
            addCriterion("ADDWEIGHTPRICE is null");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceIsNotNull() {
            addCriterion("ADDWEIGHTPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceEqualTo(BigDecimal value) {
            addCriterion("ADDWEIGHTPRICE =", value, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceNotEqualTo(BigDecimal value) {
            addCriterion("ADDWEIGHTPRICE <>", value, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceGreaterThan(BigDecimal value) {
            addCriterion("ADDWEIGHTPRICE >", value, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADDWEIGHTPRICE >=", value, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceLessThan(BigDecimal value) {
            addCriterion("ADDWEIGHTPRICE <", value, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADDWEIGHTPRICE <=", value, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceIn(List<BigDecimal> values) {
            addCriterion("ADDWEIGHTPRICE in", values, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceNotIn(List<BigDecimal> values) {
            addCriterion("ADDWEIGHTPRICE not in", values, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADDWEIGHTPRICE between", value1, value2, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andAddweightpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADDWEIGHTPRICE not between", value1, value2, "addweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceIsNull() {
            addCriterion("FIRSTWEIGHTPRICE is null");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceIsNotNull() {
            addCriterion("FIRSTWEIGHTPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceEqualTo(BigDecimal value) {
            addCriterion("FIRSTWEIGHTPRICE =", value, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceNotEqualTo(BigDecimal value) {
            addCriterion("FIRSTWEIGHTPRICE <>", value, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceGreaterThan(BigDecimal value) {
            addCriterion("FIRSTWEIGHTPRICE >", value, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSTWEIGHTPRICE >=", value, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceLessThan(BigDecimal value) {
            addCriterion("FIRSTWEIGHTPRICE <", value, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSTWEIGHTPRICE <=", value, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceIn(List<BigDecimal> values) {
            addCriterion("FIRSTWEIGHTPRICE in", values, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceNotIn(List<BigDecimal> values) {
            addCriterion("FIRSTWEIGHTPRICE not in", values, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSTWEIGHTPRICE between", value1, value2, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andFirstweightpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSTWEIGHTPRICE not between", value1, value2, "firstweightprice");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerIsNull() {
            addCriterion("VOLUMEPARMER is null");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerIsNotNull() {
            addCriterion("VOLUMEPARMER is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerEqualTo(BigDecimal value) {
            addCriterion("VOLUMEPARMER =", value, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerNotEqualTo(BigDecimal value) {
            addCriterion("VOLUMEPARMER <>", value, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerGreaterThan(BigDecimal value) {
            addCriterion("VOLUMEPARMER >", value, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUMEPARMER >=", value, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerLessThan(BigDecimal value) {
            addCriterion("VOLUMEPARMER <", value, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUMEPARMER <=", value, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerIn(List<BigDecimal> values) {
            addCriterion("VOLUMEPARMER in", values, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerNotIn(List<BigDecimal> values) {
            addCriterion("VOLUMEPARMER not in", values, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUMEPARMER between", value1, value2, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andVolumeparmerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUMEPARMER not between", value1, value2, "volumeparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerIsNull() {
            addCriterion("PROTECTEDPARMER is null");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerIsNotNull() {
            addCriterion("PROTECTEDPARMER is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDPARMER =", value, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerNotEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDPARMER <>", value, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerGreaterThan(BigDecimal value) {
            addCriterion("PROTECTEDPARMER >", value, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDPARMER >=", value, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerLessThan(BigDecimal value) {
            addCriterion("PROTECTEDPARMER <", value, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDPARMER <=", value, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDPARMER in", values, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerNotIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDPARMER not in", values, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDPARMER between", value1, value2, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andProtectedparmerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDPARMER not between", value1, value2, "protectedparmer");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeIsNull() {
            addCriterion("VISITRETURNSFEE is null");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeIsNotNull() {
            addCriterion("VISITRETURNSFEE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeEqualTo(BigDecimal value) {
            addCriterion("VISITRETURNSFEE =", value, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeNotEqualTo(BigDecimal value) {
            addCriterion("VISITRETURNSFEE <>", value, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeGreaterThan(BigDecimal value) {
            addCriterion("VISITRETURNSFEE >", value, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VISITRETURNSFEE >=", value, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeLessThan(BigDecimal value) {
            addCriterion("VISITRETURNSFEE <", value, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VISITRETURNSFEE <=", value, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeIn(List<BigDecimal> values) {
            addCriterion("VISITRETURNSFEE in", values, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeNotIn(List<BigDecimal> values) {
            addCriterion("VISITRETURNSFEE not in", values, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VISITRETURNSFEE between", value1, value2, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VISITRETURNSFEE not between", value1, value2, "visitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeIsNull() {
            addCriterion("VISITCHANGEFEE is null");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeIsNotNull() {
            addCriterion("VISITCHANGEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeEqualTo(BigDecimal value) {
            addCriterion("VISITCHANGEFEE =", value, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeNotEqualTo(BigDecimal value) {
            addCriterion("VISITCHANGEFEE <>", value, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeGreaterThan(BigDecimal value) {
            addCriterion("VISITCHANGEFEE >", value, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VISITCHANGEFEE >=", value, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeLessThan(BigDecimal value) {
            addCriterion("VISITCHANGEFEE <", value, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VISITCHANGEFEE <=", value, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeIn(List<BigDecimal> values) {
            addCriterion("VISITCHANGEFEE in", values, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeNotIn(List<BigDecimal> values) {
            addCriterion("VISITCHANGEFEE not in", values, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VISITCHANGEFEE between", value1, value2, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andVisitchangefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VISITCHANGEFEE not between", value1, value2, "visitchangefee");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateIsNull() {
            addCriterion("RECEIVEPOSFEERATE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateIsNotNull() {
            addCriterion("RECEIVEPOSFEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateEqualTo(BigDecimal value) {
            addCriterion("RECEIVEPOSFEERATE =", value, "receiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVEPOSFEERATE <>", value, "receiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateGreaterThan(BigDecimal value) {
            addCriterion("RECEIVEPOSFEERATE >", value, "receiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEPOSFEERATE >=", value, "receiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateLessThan(BigDecimal value) {
            addCriterion("RECEIVEPOSFEERATE <", value, "receiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEPOSFEERATE <=", value, "receiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateIn(List<BigDecimal> values) {
            addCriterion("RECEIVEPOSFEERATE in", values, "receiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVEPOSFEERATE not in", values, "receiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEPOSFEERATE between", value1, value2, "receiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEPOSFEERATE not between", value1, value2, "receiveposfeerate");
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

        public Criteria andVisitreturnsvfeeIsNull() {
            addCriterion("VISITRETURNSVFEE is null");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeIsNotNull() {
            addCriterion("VISITRETURNSVFEE is not null");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeEqualTo(BigDecimal value) {
            addCriterion("VISITRETURNSVFEE =", value, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeNotEqualTo(BigDecimal value) {
            addCriterion("VISITRETURNSVFEE <>", value, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeGreaterThan(BigDecimal value) {
            addCriterion("VISITRETURNSVFEE >", value, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VISITRETURNSVFEE >=", value, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeLessThan(BigDecimal value) {
            addCriterion("VISITRETURNSVFEE <", value, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VISITRETURNSVFEE <=", value, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeIn(List<BigDecimal> values) {
            addCriterion("VISITRETURNSVFEE in", values, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeNotIn(List<BigDecimal> values) {
            addCriterion("VISITRETURNSVFEE not in", values, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VISITRETURNSVFEE between", value1, value2, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andVisitreturnsvfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VISITRETURNSVFEE not between", value1, value2, "visitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeIsNull() {
            addCriterion("CASHSERVICEFEE is null");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeIsNotNull() {
            addCriterion("CASHSERVICEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeEqualTo(BigDecimal value) {
            addCriterion("CASHSERVICEFEE =", value, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeNotEqualTo(BigDecimal value) {
            addCriterion("CASHSERVICEFEE <>", value, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeGreaterThan(BigDecimal value) {
            addCriterion("CASHSERVICEFEE >", value, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHSERVICEFEE >=", value, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeLessThan(BigDecimal value) {
            addCriterion("CASHSERVICEFEE <", value, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHSERVICEFEE <=", value, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeIn(List<BigDecimal> values) {
            addCriterion("CASHSERVICEFEE in", values, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeNotIn(List<BigDecimal> values) {
            addCriterion("CASHSERVICEFEE not in", values, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHSERVICEFEE between", value1, value2, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andCashservicefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHSERVICEFEE not between", value1, value2, "cashservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeIsNull() {
            addCriterion("POSSERVICEFEE is null");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeIsNotNull() {
            addCriterion("POSSERVICEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeEqualTo(BigDecimal value) {
            addCriterion("POSSERVICEFEE =", value, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeNotEqualTo(BigDecimal value) {
            addCriterion("POSSERVICEFEE <>", value, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeGreaterThan(BigDecimal value) {
            addCriterion("POSSERVICEFEE >", value, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POSSERVICEFEE >=", value, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeLessThan(BigDecimal value) {
            addCriterion("POSSERVICEFEE <", value, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POSSERVICEFEE <=", value, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeIn(List<BigDecimal> values) {
            addCriterion("POSSERVICEFEE in", values, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeNotIn(List<BigDecimal> values) {
            addCriterion("POSSERVICEFEE not in", values, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSSERVICEFEE between", value1, value2, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andPosservicefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSSERVICEFEE not between", value1, value2, "posservicefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeIsNull() {
            addCriterion("RECEIVEFEETYPE is null");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeIsNotNull() {
            addCriterion("RECEIVEFEETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEETYPE =", value, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEETYPE <>", value, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeGreaterThan(BigDecimal value) {
            addCriterion("RECEIVEFEETYPE >", value, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEETYPE >=", value, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeLessThan(BigDecimal value) {
            addCriterion("RECEIVEFEETYPE <", value, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEETYPE <=", value, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeIn(List<BigDecimal> values) {
            addCriterion("RECEIVEFEETYPE in", values, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVEFEETYPE not in", values, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEFEETYPE between", value1, value2, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceivefeetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEFEETYPE not between", value1, value2, "receivefeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeIsNull() {
            addCriterion("RECEIVEPOSFEETYPE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeIsNotNull() {
            addCriterion("RECEIVEPOSFEETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeEqualTo(BigDecimal value) {
            addCriterion("RECEIVEPOSFEETYPE =", value, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVEPOSFEETYPE <>", value, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeGreaterThan(BigDecimal value) {
            addCriterion("RECEIVEPOSFEETYPE >", value, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEPOSFEETYPE >=", value, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeLessThan(BigDecimal value) {
            addCriterion("RECEIVEPOSFEETYPE <", value, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEPOSFEETYPE <=", value, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeIn(List<BigDecimal> values) {
            addCriterion("RECEIVEPOSFEETYPE in", values, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVEPOSFEETYPE not in", values, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEPOSFEETYPE between", value1, value2, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andReceiveposfeetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEPOSFEETYPE not between", value1, value2, "receiveposfeetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeIsNull() {
            addCriterion("CASHSERVICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeIsNotNull() {
            addCriterion("CASHSERVICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeEqualTo(BigDecimal value) {
            addCriterion("CASHSERVICETYPE =", value, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeNotEqualTo(BigDecimal value) {
            addCriterion("CASHSERVICETYPE <>", value, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeGreaterThan(BigDecimal value) {
            addCriterion("CASHSERVICETYPE >", value, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHSERVICETYPE >=", value, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeLessThan(BigDecimal value) {
            addCriterion("CASHSERVICETYPE <", value, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHSERVICETYPE <=", value, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeIn(List<BigDecimal> values) {
            addCriterion("CASHSERVICETYPE in", values, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeNotIn(List<BigDecimal> values) {
            addCriterion("CASHSERVICETYPE not in", values, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHSERVICETYPE between", value1, value2, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andCashservicetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHSERVICETYPE not between", value1, value2, "cashservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeIsNull() {
            addCriterion("POSSERVICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeIsNotNull() {
            addCriterion("POSSERVICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeEqualTo(BigDecimal value) {
            addCriterion("POSSERVICETYPE =", value, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeNotEqualTo(BigDecimal value) {
            addCriterion("POSSERVICETYPE <>", value, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeGreaterThan(BigDecimal value) {
            addCriterion("POSSERVICETYPE >", value, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POSSERVICETYPE >=", value, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeLessThan(BigDecimal value) {
            addCriterion("POSSERVICETYPE <", value, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POSSERVICETYPE <=", value, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeIn(List<BigDecimal> values) {
            addCriterion("POSSERVICETYPE in", values, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeNotIn(List<BigDecimal> values) {
            addCriterion("POSSERVICETYPE not in", values, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSSERVICETYPE between", value1, value2, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andPosservicetypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSSERVICETYPE not between", value1, value2, "posservicetype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeIsNull() {
            addCriterion("WEIGHTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andWeighttypeIsNotNull() {
            addCriterion("WEIGHTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWeighttypeEqualTo(BigDecimal value) {
            addCriterion("WEIGHTTYPE =", value, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHTTYPE <>", value, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeGreaterThan(BigDecimal value) {
            addCriterion("WEIGHTTYPE >", value, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHTTYPE >=", value, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeLessThan(BigDecimal value) {
            addCriterion("WEIGHTTYPE <", value, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHTTYPE <=", value, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeIn(List<BigDecimal> values) {
            addCriterion("WEIGHTTYPE in", values, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHTTYPE not in", values, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHTTYPE between", value1, value2, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeighttypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHTTYPE not between", value1, value2, "weighttype");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleIsNull() {
            addCriterion("WEIGHTVALUERULE is null");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleIsNotNull() {
            addCriterion("WEIGHTVALUERULE is not null");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleEqualTo(BigDecimal value) {
            addCriterion("WEIGHTVALUERULE =", value, "weightvaluerule");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHTVALUERULE <>", value, "weightvaluerule");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleGreaterThan(BigDecimal value) {
            addCriterion("WEIGHTVALUERULE >", value, "weightvaluerule");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHTVALUERULE >=", value, "weightvaluerule");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleLessThan(BigDecimal value) {
            addCriterion("WEIGHTVALUERULE <", value, "weightvaluerule");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHTVALUERULE <=", value, "weightvaluerule");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleIn(List<BigDecimal> values) {
            addCriterion("WEIGHTVALUERULE in", values, "weightvaluerule");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHTVALUERULE not in", values, "weightvaluerule");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHTVALUERULE between", value1, value2, "weightvaluerule");
            return (Criteria) this;
        }

        public Criteria andWeightvalueruleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHTVALUERULE not between", value1, value2, "weightvaluerule");
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

        public Criteria andExtraprotectedIsNull() {
            addCriterion("EXTRAPROTECTED is null");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedIsNotNull() {
            addCriterion("EXTRAPROTECTED is not null");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedEqualTo(BigDecimal value) {
            addCriterion("EXTRAPROTECTED =", value, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedNotEqualTo(BigDecimal value) {
            addCriterion("EXTRAPROTECTED <>", value, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedGreaterThan(BigDecimal value) {
            addCriterion("EXTRAPROTECTED >", value, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAPROTECTED >=", value, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedLessThan(BigDecimal value) {
            addCriterion("EXTRAPROTECTED <", value, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAPROTECTED <=", value, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedIn(List<BigDecimal> values) {
            addCriterion("EXTRAPROTECTED in", values, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedNotIn(List<BigDecimal> values) {
            addCriterion("EXTRAPROTECTED not in", values, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAPROTECTED between", value1, value2, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtraprotectedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAPROTECTED not between", value1, value2, "extraprotected");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateIsNull() {
            addCriterion("EXTRAREFUSEFEERATE is null");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateIsNotNull() {
            addCriterion("EXTRAREFUSEFEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateEqualTo(BigDecimal value) {
            addCriterion("EXTRAREFUSEFEERATE =", value, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateNotEqualTo(BigDecimal value) {
            addCriterion("EXTRAREFUSEFEERATE <>", value, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateGreaterThan(BigDecimal value) {
            addCriterion("EXTRAREFUSEFEERATE >", value, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAREFUSEFEERATE >=", value, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateLessThan(BigDecimal value) {
            addCriterion("EXTRAREFUSEFEERATE <", value, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAREFUSEFEERATE <=", value, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateIn(List<BigDecimal> values) {
            addCriterion("EXTRAREFUSEFEERATE in", values, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateNotIn(List<BigDecimal> values) {
            addCriterion("EXTRAREFUSEFEERATE not in", values, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAREFUSEFEERATE between", value1, value2, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrarefusefeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAREFUSEFEERATE not between", value1, value2, "extrarefusefeerate");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeIsNull() {
            addCriterion("EXTRAVISITRETURNSFEE is null");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeIsNotNull() {
            addCriterion("EXTRAVISITRETURNSFEE is not null");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSFEE =", value, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeNotEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSFEE <>", value, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeGreaterThan(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSFEE >", value, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSFEE >=", value, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeLessThan(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSFEE <", value, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSFEE <=", value, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeIn(List<BigDecimal> values) {
            addCriterion("EXTRAVISITRETURNSFEE in", values, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeNotIn(List<BigDecimal> values) {
            addCriterion("EXTRAVISITRETURNSFEE not in", values, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAVISITRETURNSFEE between", value1, value2, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAVISITRETURNSFEE not between", value1, value2, "extravisitreturnsfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeIsNull() {
            addCriterion("EXTRAVISITCHANGEFEE is null");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeIsNotNull() {
            addCriterion("EXTRAVISITCHANGEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITCHANGEFEE =", value, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeNotEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITCHANGEFEE <>", value, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeGreaterThan(BigDecimal value) {
            addCriterion("EXTRAVISITCHANGEFEE >", value, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITCHANGEFEE >=", value, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeLessThan(BigDecimal value) {
            addCriterion("EXTRAVISITCHANGEFEE <", value, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITCHANGEFEE <=", value, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeIn(List<BigDecimal> values) {
            addCriterion("EXTRAVISITCHANGEFEE in", values, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeNotIn(List<BigDecimal> values) {
            addCriterion("EXTRAVISITCHANGEFEE not in", values, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAVISITCHANGEFEE between", value1, value2, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitchangefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAVISITCHANGEFEE not between", value1, value2, "extravisitchangefee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeIsNull() {
            addCriterion("EXTRAVISITRETURNSVFEE is null");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeIsNotNull() {
            addCriterion("EXTRAVISITRETURNSVFEE is not null");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSVFEE =", value, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeNotEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSVFEE <>", value, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeGreaterThan(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSVFEE >", value, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSVFEE >=", value, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeLessThan(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSVFEE <", value, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAVISITRETURNSVFEE <=", value, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeIn(List<BigDecimal> values) {
            addCriterion("EXTRAVISITRETURNSVFEE in", values, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeNotIn(List<BigDecimal> values) {
            addCriterion("EXTRAVISITRETURNSVFEE not in", values, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAVISITRETURNSVFEE between", value1, value2, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtravisitreturnsvfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAVISITRETURNSVFEE not between", value1, value2, "extravisitreturnsvfee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeIsNull() {
            addCriterion("EXTRACASHSERVICEFEE is null");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeIsNotNull() {
            addCriterion("EXTRACASHSERVICEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeEqualTo(BigDecimal value) {
            addCriterion("EXTRACASHSERVICEFEE =", value, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeNotEqualTo(BigDecimal value) {
            addCriterion("EXTRACASHSERVICEFEE <>", value, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeGreaterThan(BigDecimal value) {
            addCriterion("EXTRACASHSERVICEFEE >", value, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRACASHSERVICEFEE >=", value, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeLessThan(BigDecimal value) {
            addCriterion("EXTRACASHSERVICEFEE <", value, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRACASHSERVICEFEE <=", value, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeIn(List<BigDecimal> values) {
            addCriterion("EXTRACASHSERVICEFEE in", values, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeNotIn(List<BigDecimal> values) {
            addCriterion("EXTRACASHSERVICEFEE not in", values, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRACASHSERVICEFEE between", value1, value2, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtracashservicefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRACASHSERVICEFEE not between", value1, value2, "extracashservicefee");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateIsNull() {
            addCriterion("EXTRARECEIVEFEERATE is null");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateIsNotNull() {
            addCriterion("EXTRARECEIVEFEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateEqualTo(BigDecimal value) {
            addCriterion("EXTRARECEIVEFEERATE =", value, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateNotEqualTo(BigDecimal value) {
            addCriterion("EXTRARECEIVEFEERATE <>", value, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateGreaterThan(BigDecimal value) {
            addCriterion("EXTRARECEIVEFEERATE >", value, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRARECEIVEFEERATE >=", value, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateLessThan(BigDecimal value) {
            addCriterion("EXTRARECEIVEFEERATE <", value, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRARECEIVEFEERATE <=", value, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateIn(List<BigDecimal> values) {
            addCriterion("EXTRARECEIVEFEERATE in", values, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateNotIn(List<BigDecimal> values) {
            addCriterion("EXTRARECEIVEFEERATE not in", values, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRARECEIVEFEERATE between", value1, value2, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceivefeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRARECEIVEFEERATE not between", value1, value2, "extrareceivefeerate");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeIsNull() {
            addCriterion("EXTRAPOSSERVICEFEE is null");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeIsNotNull() {
            addCriterion("EXTRAPOSSERVICEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeEqualTo(BigDecimal value) {
            addCriterion("EXTRAPOSSERVICEFEE =", value, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeNotEqualTo(BigDecimal value) {
            addCriterion("EXTRAPOSSERVICEFEE <>", value, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeGreaterThan(BigDecimal value) {
            addCriterion("EXTRAPOSSERVICEFEE >", value, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAPOSSERVICEFEE >=", value, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeLessThan(BigDecimal value) {
            addCriterion("EXTRAPOSSERVICEFEE <", value, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRAPOSSERVICEFEE <=", value, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeIn(List<BigDecimal> values) {
            addCriterion("EXTRAPOSSERVICEFEE in", values, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeNotIn(List<BigDecimal> values) {
            addCriterion("EXTRAPOSSERVICEFEE not in", values, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAPOSSERVICEFEE between", value1, value2, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtraposservicefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRAPOSSERVICEFEE not between", value1, value2, "extraposservicefee");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateIsNull() {
            addCriterion("EXTRARECEIVEPOSFEERATE is null");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateIsNotNull() {
            addCriterion("EXTRARECEIVEPOSFEERATE is not null");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateEqualTo(BigDecimal value) {
            addCriterion("EXTRARECEIVEPOSFEERATE =", value, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateNotEqualTo(BigDecimal value) {
            addCriterion("EXTRARECEIVEPOSFEERATE <>", value, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateGreaterThan(BigDecimal value) {
            addCriterion("EXTRARECEIVEPOSFEERATE >", value, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRARECEIVEPOSFEERATE >=", value, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateLessThan(BigDecimal value) {
            addCriterion("EXTRARECEIVEPOSFEERATE <", value, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXTRARECEIVEPOSFEERATE <=", value, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateIn(List<BigDecimal> values) {
            addCriterion("EXTRARECEIVEPOSFEERATE in", values, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateNotIn(List<BigDecimal> values) {
            addCriterion("EXTRARECEIVEPOSFEERATE not in", values, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRARECEIVEPOSFEERATE between", value1, value2, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andExtrareceiveposfeerateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXTRARECEIVEPOSFEERATE not between", value1, value2, "extrareceiveposfeerate");
            return (Criteria) this;
        }

        public Criteria andIscategoryIsNull() {
            addCriterion("ISCATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andIscategoryIsNotNull() {
            addCriterion("ISCATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andIscategoryEqualTo(BigDecimal value) {
            addCriterion("ISCATEGORY =", value, "iscategory");
            return (Criteria) this;
        }

        public Criteria andIscategoryNotEqualTo(BigDecimal value) {
            addCriterion("ISCATEGORY <>", value, "iscategory");
            return (Criteria) this;
        }

        public Criteria andIscategoryGreaterThan(BigDecimal value) {
            addCriterion("ISCATEGORY >", value, "iscategory");
            return (Criteria) this;
        }

        public Criteria andIscategoryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCATEGORY >=", value, "iscategory");
            return (Criteria) this;
        }

        public Criteria andIscategoryLessThan(BigDecimal value) {
            addCriterion("ISCATEGORY <", value, "iscategory");
            return (Criteria) this;
        }

        public Criteria andIscategoryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISCATEGORY <=", value, "iscategory");
            return (Criteria) this;
        }

        public Criteria andIscategoryIn(List<BigDecimal> values) {
            addCriterion("ISCATEGORY in", values, "iscategory");
            return (Criteria) this;
        }

        public Criteria andIscategoryNotIn(List<BigDecimal> values) {
            addCriterion("ISCATEGORY not in", values, "iscategory");
            return (Criteria) this;
        }

        public Criteria andIscategoryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCATEGORY between", value1, value2, "iscategory");
            return (Criteria) this;
        }

        public Criteria andIscategoryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISCATEGORY not between", value1, value2, "iscategory");
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
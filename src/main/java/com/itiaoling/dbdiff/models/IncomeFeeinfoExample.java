package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IncomeFeeinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IncomeFeeinfoExample() {
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

        public Criteria andIncomefeeidIsNull() {
            addCriterion("INCOMEFEEID is null");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidIsNotNull() {
            addCriterion("INCOMEFEEID is not null");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidEqualTo(BigDecimal value) {
            addCriterion("INCOMEFEEID =", value, "incomefeeid");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidNotEqualTo(BigDecimal value) {
            addCriterion("INCOMEFEEID <>", value, "incomefeeid");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidGreaterThan(BigDecimal value) {
            addCriterion("INCOMEFEEID >", value, "incomefeeid");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEFEEID >=", value, "incomefeeid");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidLessThan(BigDecimal value) {
            addCriterion("INCOMEFEEID <", value, "incomefeeid");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INCOMEFEEID <=", value, "incomefeeid");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidIn(List<BigDecimal> values) {
            addCriterion("INCOMEFEEID in", values, "incomefeeid");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidNotIn(List<BigDecimal> values) {
            addCriterion("INCOMEFEEID not in", values, "incomefeeid");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEFEEID between", value1, value2, "incomefeeid");
            return (Criteria) this;
        }

        public Criteria andIncomefeeidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INCOMEFEEID not between", value1, value2, "incomefeeid");
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

        public Criteria andIsaccountIsNull() {
            addCriterion("ISACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIsaccountIsNotNull() {
            addCriterion("ISACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIsaccountEqualTo(BigDecimal value) {
            addCriterion("ISACCOUNT =", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountNotEqualTo(BigDecimal value) {
            addCriterion("ISACCOUNT <>", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountGreaterThan(BigDecimal value) {
            addCriterion("ISACCOUNT >", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISACCOUNT >=", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountLessThan(BigDecimal value) {
            addCriterion("ISACCOUNT <", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISACCOUNT <=", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountIn(List<BigDecimal> values) {
            addCriterion("ISACCOUNT in", values, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountNotIn(List<BigDecimal> values) {
            addCriterion("ISACCOUNT not in", values, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISACCOUNT between", value1, value2, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISACCOUNT not between", value1, value2, "isaccount");
            return (Criteria) this;
        }

        public Criteria andAccountstandardIsNull() {
            addCriterion("ACCOUNTSTANDARD is null");
            return (Criteria) this;
        }

        public Criteria andAccountstandardIsNotNull() {
            addCriterion("ACCOUNTSTANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andAccountstandardEqualTo(String value) {
            addCriterion("ACCOUNTSTANDARD =", value, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardNotEqualTo(String value) {
            addCriterion("ACCOUNTSTANDARD <>", value, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardGreaterThan(String value) {
            addCriterion("ACCOUNTSTANDARD >", value, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSTANDARD >=", value, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardLessThan(String value) {
            addCriterion("ACCOUNTSTANDARD <", value, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNTSTANDARD <=", value, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardLike(String value) {
            addCriterion("ACCOUNTSTANDARD like", value, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardNotLike(String value) {
            addCriterion("ACCOUNTSTANDARD not like", value, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardIn(List<String> values) {
            addCriterion("ACCOUNTSTANDARD in", values, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardNotIn(List<String> values) {
            addCriterion("ACCOUNTSTANDARD not in", values, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardBetween(String value1, String value2) {
            addCriterion("ACCOUNTSTANDARD between", value1, value2, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountstandardNotBetween(String value1, String value2) {
            addCriterion("ACCOUNTSTANDARD not between", value1, value2, "accountstandard");
            return (Criteria) this;
        }

        public Criteria andAccountfareIsNull() {
            addCriterion("ACCOUNTFARE is null");
            return (Criteria) this;
        }

        public Criteria andAccountfareIsNotNull() {
            addCriterion("ACCOUNTFARE is not null");
            return (Criteria) this;
        }

        public Criteria andAccountfareEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTFARE =", value, "accountfare");
            return (Criteria) this;
        }

        public Criteria andAccountfareNotEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTFARE <>", value, "accountfare");
            return (Criteria) this;
        }

        public Criteria andAccountfareGreaterThan(BigDecimal value) {
            addCriterion("ACCOUNTFARE >", value, "accountfare");
            return (Criteria) this;
        }

        public Criteria andAccountfareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTFARE >=", value, "accountfare");
            return (Criteria) this;
        }

        public Criteria andAccountfareLessThan(BigDecimal value) {
            addCriterion("ACCOUNTFARE <", value, "accountfare");
            return (Criteria) this;
        }

        public Criteria andAccountfareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACCOUNTFARE <=", value, "accountfare");
            return (Criteria) this;
        }

        public Criteria andAccountfareIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTFARE in", values, "accountfare");
            return (Criteria) this;
        }

        public Criteria andAccountfareNotIn(List<BigDecimal> values) {
            addCriterion("ACCOUNTFARE not in", values, "accountfare");
            return (Criteria) this;
        }

        public Criteria andAccountfareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTFARE between", value1, value2, "accountfare");
            return (Criteria) this;
        }

        public Criteria andAccountfareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACCOUNTFARE not between", value1, value2, "accountfare");
            return (Criteria) this;
        }

        public Criteria andIsprotectedIsNull() {
            addCriterion("ISPROTECTED is null");
            return (Criteria) this;
        }

        public Criteria andIsprotectedIsNotNull() {
            addCriterion("ISPROTECTED is not null");
            return (Criteria) this;
        }

        public Criteria andIsprotectedEqualTo(BigDecimal value) {
            addCriterion("ISPROTECTED =", value, "isprotected");
            return (Criteria) this;
        }

        public Criteria andIsprotectedNotEqualTo(BigDecimal value) {
            addCriterion("ISPROTECTED <>", value, "isprotected");
            return (Criteria) this;
        }

        public Criteria andIsprotectedGreaterThan(BigDecimal value) {
            addCriterion("ISPROTECTED >", value, "isprotected");
            return (Criteria) this;
        }

        public Criteria andIsprotectedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISPROTECTED >=", value, "isprotected");
            return (Criteria) this;
        }

        public Criteria andIsprotectedLessThan(BigDecimal value) {
            addCriterion("ISPROTECTED <", value, "isprotected");
            return (Criteria) this;
        }

        public Criteria andIsprotectedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISPROTECTED <=", value, "isprotected");
            return (Criteria) this;
        }

        public Criteria andIsprotectedIn(List<BigDecimal> values) {
            addCriterion("ISPROTECTED in", values, "isprotected");
            return (Criteria) this;
        }

        public Criteria andIsprotectedNotIn(List<BigDecimal> values) {
            addCriterion("ISPROTECTED not in", values, "isprotected");
            return (Criteria) this;
        }

        public Criteria andIsprotectedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISPROTECTED between", value1, value2, "isprotected");
            return (Criteria) this;
        }

        public Criteria andIsprotectedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISPROTECTED not between", value1, value2, "isprotected");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardIsNull() {
            addCriterion("PROTECTEDSTANDARD is null");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardIsNotNull() {
            addCriterion("PROTECTEDSTANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDSTANDARD =", value, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardNotEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDSTANDARD <>", value, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardGreaterThan(BigDecimal value) {
            addCriterion("PROTECTEDSTANDARD >", value, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDSTANDARD >=", value, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardLessThan(BigDecimal value) {
            addCriterion("PROTECTEDSTANDARD <", value, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDSTANDARD <=", value, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDSTANDARD in", values, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardNotIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDSTANDARD not in", values, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDSTANDARD between", value1, value2, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedstandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDSTANDARD not between", value1, value2, "protectedstandard");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeIsNull() {
            addCriterion("PROTECTEDFEE is null");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeIsNotNull() {
            addCriterion("PROTECTEDFEE is not null");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDFEE =", value, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeNotEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDFEE <>", value, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeGreaterThan(BigDecimal value) {
            addCriterion("PROTECTEDFEE >", value, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDFEE >=", value, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeLessThan(BigDecimal value) {
            addCriterion("PROTECTEDFEE <", value, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROTECTEDFEE <=", value, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDFEE in", values, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeNotIn(List<BigDecimal> values) {
            addCriterion("PROTECTEDFEE not in", values, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDFEE between", value1, value2, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andProtectedfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROTECTEDFEE not between", value1, value2, "protectedfee");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNull() {
            addCriterion("ISRECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNotNull() {
            addCriterion("ISRECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveEqualTo(BigDecimal value) {
            addCriterion("ISRECEIVE =", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotEqualTo(BigDecimal value) {
            addCriterion("ISRECEIVE <>", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThan(BigDecimal value) {
            addCriterion("ISRECEIVE >", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISRECEIVE >=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThan(BigDecimal value) {
            addCriterion("ISRECEIVE <", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISRECEIVE <=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIn(List<BigDecimal> values) {
            addCriterion("ISRECEIVE in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotIn(List<BigDecimal> values) {
            addCriterion("ISRECEIVE not in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISRECEIVE between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISRECEIVE not between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andReceivestandardIsNull() {
            addCriterion("RECEIVESTANDARD is null");
            return (Criteria) this;
        }

        public Criteria andReceivestandardIsNotNull() {
            addCriterion("RECEIVESTANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andReceivestandardEqualTo(BigDecimal value) {
            addCriterion("RECEIVESTANDARD =", value, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivestandardNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVESTANDARD <>", value, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivestandardGreaterThan(BigDecimal value) {
            addCriterion("RECEIVESTANDARD >", value, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivestandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVESTANDARD >=", value, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivestandardLessThan(BigDecimal value) {
            addCriterion("RECEIVESTANDARD <", value, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivestandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVESTANDARD <=", value, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivestandardIn(List<BigDecimal> values) {
            addCriterion("RECEIVESTANDARD in", values, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivestandardNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVESTANDARD not in", values, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivestandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVESTANDARD between", value1, value2, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivestandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVESTANDARD not between", value1, value2, "receivestandard");
            return (Criteria) this;
        }

        public Criteria andReceivefeeIsNull() {
            addCriterion("RECEIVEFEE is null");
            return (Criteria) this;
        }

        public Criteria andReceivefeeIsNotNull() {
            addCriterion("RECEIVEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andReceivefeeEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEE =", value, "receivefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeeNotEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEE <>", value, "receivefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeeGreaterThan(BigDecimal value) {
            addCriterion("RECEIVEFEE >", value, "receivefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEE >=", value, "receivefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeeLessThan(BigDecimal value) {
            addCriterion("RECEIVEFEE <", value, "receivefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RECEIVEFEE <=", value, "receivefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeeIn(List<BigDecimal> values) {
            addCriterion("RECEIVEFEE in", values, "receivefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeeNotIn(List<BigDecimal> values) {
            addCriterion("RECEIVEFEE not in", values, "receivefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEFEE between", value1, value2, "receivefee");
            return (Criteria) this;
        }

        public Criteria andReceivefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RECEIVEFEE not between", value1, value2, "receivefee");
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

        public Criteria andTransferpaytypeIsNull() {
            addCriterion("TRANSFERPAYTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeIsNotNull() {
            addCriterion("TRANSFERPAYTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeEqualTo(BigDecimal value) {
            addCriterion("TRANSFERPAYTYPE =", value, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeNotEqualTo(BigDecimal value) {
            addCriterion("TRANSFERPAYTYPE <>", value, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeGreaterThan(BigDecimal value) {
            addCriterion("TRANSFERPAYTYPE >", value, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFERPAYTYPE >=", value, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeLessThan(BigDecimal value) {
            addCriterion("TRANSFERPAYTYPE <", value, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSFERPAYTYPE <=", value, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeIn(List<BigDecimal> values) {
            addCriterion("TRANSFERPAYTYPE in", values, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeNotIn(List<BigDecimal> values) {
            addCriterion("TRANSFERPAYTYPE not in", values, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFERPAYTYPE between", value1, value2, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andTransferpaytypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSFERPAYTYPE not between", value1, value2, "transferpaytype");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountIsNull() {
            addCriterion("DEPUTIZEAMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountIsNotNull() {
            addCriterion("DEPUTIZEAMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountEqualTo(BigDecimal value) {
            addCriterion("DEPUTIZEAMOUNT =", value, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountNotEqualTo(BigDecimal value) {
            addCriterion("DEPUTIZEAMOUNT <>", value, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountGreaterThan(BigDecimal value) {
            addCriterion("DEPUTIZEAMOUNT >", value, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPUTIZEAMOUNT >=", value, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountLessThan(BigDecimal value) {
            addCriterion("DEPUTIZEAMOUNT <", value, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DEPUTIZEAMOUNT <=", value, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountIn(List<BigDecimal> values) {
            addCriterion("DEPUTIZEAMOUNT in", values, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountNotIn(List<BigDecimal> values) {
            addCriterion("DEPUTIZEAMOUNT not in", values, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPUTIZEAMOUNT between", value1, value2, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andDeputizeamountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DEPUTIZEAMOUNT not between", value1, value2, "deputizeamount");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardIsNull() {
            addCriterion("POSRECEIVESTANDARD is null");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardIsNotNull() {
            addCriterion("POSRECEIVESTANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESTANDARD =", value, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardNotEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESTANDARD <>", value, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardGreaterThan(BigDecimal value) {
            addCriterion("POSRECEIVESTANDARD >", value, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESTANDARD >=", value, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardLessThan(BigDecimal value) {
            addCriterion("POSRECEIVESTANDARD <", value, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESTANDARD <=", value, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardIn(List<BigDecimal> values) {
            addCriterion("POSRECEIVESTANDARD in", values, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardNotIn(List<BigDecimal> values) {
            addCriterion("POSRECEIVESTANDARD not in", values, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSRECEIVESTANDARD between", value1, value2, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivestandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSRECEIVESTANDARD not between", value1, value2, "posreceivestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeIsNull() {
            addCriterion("POSRECEIVEFEE is null");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeIsNotNull() {
            addCriterion("POSRECEIVEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVEFEE =", value, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeNotEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVEFEE <>", value, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeGreaterThan(BigDecimal value) {
            addCriterion("POSRECEIVEFEE >", value, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVEFEE >=", value, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeLessThan(BigDecimal value) {
            addCriterion("POSRECEIVEFEE <", value, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVEFEE <=", value, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeIn(List<BigDecimal> values) {
            addCriterion("POSRECEIVEFEE in", values, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeNotIn(List<BigDecimal> values) {
            addCriterion("POSRECEIVEFEE not in", values, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSRECEIVEFEE between", value1, value2, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andPosreceivefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSRECEIVEFEE not between", value1, value2, "posreceivefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardIsNull() {
            addCriterion("CASHRECEIVESERVICESTANDARD is null");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardIsNotNull() {
            addCriterion("CASHRECEIVESERVICESTANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardEqualTo(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICESTANDARD =", value, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardNotEqualTo(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICESTANDARD <>", value, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardGreaterThan(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICESTANDARD >", value, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICESTANDARD >=", value, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardLessThan(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICESTANDARD <", value, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICESTANDARD <=", value, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardIn(List<BigDecimal> values) {
            addCriterion("CASHRECEIVESERVICESTANDARD in", values, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardNotIn(List<BigDecimal> values) {
            addCriterion("CASHRECEIVESERVICESTANDARD not in", values, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHRECEIVESERVICESTANDARD between", value1, value2, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicestandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHRECEIVESERVICESTANDARD not between", value1, value2, "cashreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeIsNull() {
            addCriterion("CASHRECEIVESERVICEFEE is null");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeIsNotNull() {
            addCriterion("CASHRECEIVESERVICEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeEqualTo(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICEFEE =", value, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeNotEqualTo(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICEFEE <>", value, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeGreaterThan(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICEFEE >", value, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICEFEE >=", value, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeLessThan(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICEFEE <", value, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CASHRECEIVESERVICEFEE <=", value, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeIn(List<BigDecimal> values) {
            addCriterion("CASHRECEIVESERVICEFEE in", values, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeNotIn(List<BigDecimal> values) {
            addCriterion("CASHRECEIVESERVICEFEE not in", values, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHRECEIVESERVICEFEE between", value1, value2, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andCashreceiveservicefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CASHRECEIVESERVICEFEE not between", value1, value2, "cashreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardIsNull() {
            addCriterion("POSRECEIVESERVICESTANDARD is null");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardIsNotNull() {
            addCriterion("POSRECEIVESERVICESTANDARD is not null");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESERVICESTANDARD =", value, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardNotEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESERVICESTANDARD <>", value, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardGreaterThan(BigDecimal value) {
            addCriterion("POSRECEIVESERVICESTANDARD >", value, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESERVICESTANDARD >=", value, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardLessThan(BigDecimal value) {
            addCriterion("POSRECEIVESERVICESTANDARD <", value, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESERVICESTANDARD <=", value, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardIn(List<BigDecimal> values) {
            addCriterion("POSRECEIVESERVICESTANDARD in", values, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardNotIn(List<BigDecimal> values) {
            addCriterion("POSRECEIVESERVICESTANDARD not in", values, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSRECEIVESERVICESTANDARD between", value1, value2, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicestandardNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSRECEIVESERVICESTANDARD not between", value1, value2, "posreceiveservicestandard");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeIsNull() {
            addCriterion("POSRECEIVESERVICEFEE is null");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeIsNotNull() {
            addCriterion("POSRECEIVESERVICEFEE is not null");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESERVICEFEE =", value, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeNotEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESERVICEFEE <>", value, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeGreaterThan(BigDecimal value) {
            addCriterion("POSRECEIVESERVICEFEE >", value, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESERVICEFEE >=", value, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeLessThan(BigDecimal value) {
            addCriterion("POSRECEIVESERVICEFEE <", value, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POSRECEIVESERVICEFEE <=", value, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeIn(List<BigDecimal> values) {
            addCriterion("POSRECEIVESERVICEFEE in", values, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeNotIn(List<BigDecimal> values) {
            addCriterion("POSRECEIVESERVICEFEE not in", values, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSRECEIVESERVICEFEE between", value1, value2, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andPosreceiveservicefeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POSRECEIVESERVICEFEE not between", value1, value2, "posreceiveservicefee");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductIsNull() {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductIsNotNull() {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductEqualTo(BigDecimal value) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT =", value, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductNotEqualTo(BigDecimal value) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT <>", value, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductGreaterThan(BigDecimal value) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT >", value, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT >=", value, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductLessThan(BigDecimal value) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT <", value, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT <=", value, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductIn(List<BigDecimal> values) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT in", values, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductNotIn(List<BigDecimal> values) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT not in", values, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT between", value1, value2, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressreceivebasicdeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSRECEIVEBASICDEDUCT not between", value1, value2, "expressreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductIsNull() {
            addCriterion("EXPRESSSENDBASICDEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductIsNotNull() {
            addCriterion("EXPRESSSENDBASICDEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductEqualTo(BigDecimal value) {
            addCriterion("EXPRESSSENDBASICDEDUCT =", value, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductNotEqualTo(BigDecimal value) {
            addCriterion("EXPRESSSENDBASICDEDUCT <>", value, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductGreaterThan(BigDecimal value) {
            addCriterion("EXPRESSSENDBASICDEDUCT >", value, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSSENDBASICDEDUCT >=", value, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductLessThan(BigDecimal value) {
            addCriterion("EXPRESSSENDBASICDEDUCT <", value, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSSENDBASICDEDUCT <=", value, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductIn(List<BigDecimal> values) {
            addCriterion("EXPRESSSENDBASICDEDUCT in", values, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductNotIn(List<BigDecimal> values) {
            addCriterion("EXPRESSSENDBASICDEDUCT not in", values, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSSENDBASICDEDUCT between", value1, value2, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpresssendbasicdeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSSENDBASICDEDUCT not between", value1, value2, "expresssendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductIsNull() {
            addCriterion("EXPRESSAREADEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductIsNotNull() {
            addCriterion("EXPRESSAREADEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductEqualTo(BigDecimal value) {
            addCriterion("EXPRESSAREADEDUCT =", value, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductNotEqualTo(BigDecimal value) {
            addCriterion("EXPRESSAREADEDUCT <>", value, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductGreaterThan(BigDecimal value) {
            addCriterion("EXPRESSAREADEDUCT >", value, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSAREADEDUCT >=", value, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductLessThan(BigDecimal value) {
            addCriterion("EXPRESSAREADEDUCT <", value, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSAREADEDUCT <=", value, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductIn(List<BigDecimal> values) {
            addCriterion("EXPRESSAREADEDUCT in", values, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductNotIn(List<BigDecimal> values) {
            addCriterion("EXPRESSAREADEDUCT not in", values, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSAREADEDUCT between", value1, value2, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressareadeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSAREADEDUCT not between", value1, value2, "expressareadeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductIsNull() {
            addCriterion("EXPRESSWEIGHTDEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductIsNotNull() {
            addCriterion("EXPRESSWEIGHTDEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductEqualTo(BigDecimal value) {
            addCriterion("EXPRESSWEIGHTDEDUCT =", value, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductNotEqualTo(BigDecimal value) {
            addCriterion("EXPRESSWEIGHTDEDUCT <>", value, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductGreaterThan(BigDecimal value) {
            addCriterion("EXPRESSWEIGHTDEDUCT >", value, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSWEIGHTDEDUCT >=", value, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductLessThan(BigDecimal value) {
            addCriterion("EXPRESSWEIGHTDEDUCT <", value, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXPRESSWEIGHTDEDUCT <=", value, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductIn(List<BigDecimal> values) {
            addCriterion("EXPRESSWEIGHTDEDUCT in", values, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductNotIn(List<BigDecimal> values) {
            addCriterion("EXPRESSWEIGHTDEDUCT not in", values, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSWEIGHTDEDUCT between", value1, value2, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andExpressweightdeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXPRESSWEIGHTDEDUCT not between", value1, value2, "expressweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductIsNull() {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductIsNotNull() {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductEqualTo(BigDecimal value) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT =", value, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductNotEqualTo(BigDecimal value) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT <>", value, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductGreaterThan(BigDecimal value) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT >", value, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT >=", value, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductLessThan(BigDecimal value) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT <", value, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT <=", value, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductIn(List<BigDecimal> values) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT in", values, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductNotIn(List<BigDecimal> values) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT not in", values, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT between", value1, value2, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramreceivebasicdeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRAMRECEIVEBASICDEDUCT not between", value1, value2, "programreceivebasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductIsNull() {
            addCriterion("PROGRAMSENDBASICDEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductIsNotNull() {
            addCriterion("PROGRAMSENDBASICDEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductEqualTo(BigDecimal value) {
            addCriterion("PROGRAMSENDBASICDEDUCT =", value, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductNotEqualTo(BigDecimal value) {
            addCriterion("PROGRAMSENDBASICDEDUCT <>", value, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductGreaterThan(BigDecimal value) {
            addCriterion("PROGRAMSENDBASICDEDUCT >", value, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRAMSENDBASICDEDUCT >=", value, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductLessThan(BigDecimal value) {
            addCriterion("PROGRAMSENDBASICDEDUCT <", value, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRAMSENDBASICDEDUCT <=", value, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductIn(List<BigDecimal> values) {
            addCriterion("PROGRAMSENDBASICDEDUCT in", values, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductNotIn(List<BigDecimal> values) {
            addCriterion("PROGRAMSENDBASICDEDUCT not in", values, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRAMSENDBASICDEDUCT between", value1, value2, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramsendbasicdeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRAMSENDBASICDEDUCT not between", value1, value2, "programsendbasicdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductIsNull() {
            addCriterion("PROGRAMAREADEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductIsNotNull() {
            addCriterion("PROGRAMAREADEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductEqualTo(BigDecimal value) {
            addCriterion("PROGRAMAREADEDUCT =", value, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductNotEqualTo(BigDecimal value) {
            addCriterion("PROGRAMAREADEDUCT <>", value, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductGreaterThan(BigDecimal value) {
            addCriterion("PROGRAMAREADEDUCT >", value, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRAMAREADEDUCT >=", value, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductLessThan(BigDecimal value) {
            addCriterion("PROGRAMAREADEDUCT <", value, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRAMAREADEDUCT <=", value, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductIn(List<BigDecimal> values) {
            addCriterion("PROGRAMAREADEDUCT in", values, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductNotIn(List<BigDecimal> values) {
            addCriterion("PROGRAMAREADEDUCT not in", values, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRAMAREADEDUCT between", value1, value2, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramareadeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRAMAREADEDUCT not between", value1, value2, "programareadeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductIsNull() {
            addCriterion("PROGRAMWEIGHTDEDUCT is null");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductIsNotNull() {
            addCriterion("PROGRAMWEIGHTDEDUCT is not null");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductEqualTo(BigDecimal value) {
            addCriterion("PROGRAMWEIGHTDEDUCT =", value, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductNotEqualTo(BigDecimal value) {
            addCriterion("PROGRAMWEIGHTDEDUCT <>", value, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductGreaterThan(BigDecimal value) {
            addCriterion("PROGRAMWEIGHTDEDUCT >", value, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRAMWEIGHTDEDUCT >=", value, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductLessThan(BigDecimal value) {
            addCriterion("PROGRAMWEIGHTDEDUCT <", value, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROGRAMWEIGHTDEDUCT <=", value, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductIn(List<BigDecimal> values) {
            addCriterion("PROGRAMWEIGHTDEDUCT in", values, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductNotIn(List<BigDecimal> values) {
            addCriterion("PROGRAMWEIGHTDEDUCT not in", values, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRAMWEIGHTDEDUCT between", value1, value2, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andProgramweightdeductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROGRAMWEIGHTDEDUCT not between", value1, value2, "programweightdeduct");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountIsNull() {
            addCriterion("ISDEDUCTACOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountIsNotNull() {
            addCriterion("ISDEDUCTACOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountEqualTo(BigDecimal value) {
            addCriterion("ISDEDUCTACOUNT =", value, "isdeductacount");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountNotEqualTo(BigDecimal value) {
            addCriterion("ISDEDUCTACOUNT <>", value, "isdeductacount");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountGreaterThan(BigDecimal value) {
            addCriterion("ISDEDUCTACOUNT >", value, "isdeductacount");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISDEDUCTACOUNT >=", value, "isdeductacount");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountLessThan(BigDecimal value) {
            addCriterion("ISDEDUCTACOUNT <", value, "isdeductacount");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISDEDUCTACOUNT <=", value, "isdeductacount");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountIn(List<BigDecimal> values) {
            addCriterion("ISDEDUCTACOUNT in", values, "isdeductacount");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountNotIn(List<BigDecimal> values) {
            addCriterion("ISDEDUCTACOUNT not in", values, "isdeductacount");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISDEDUCTACOUNT between", value1, value2, "isdeductacount");
            return (Criteria) this;
        }

        public Criteria andIsdeductacountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISDEDUCTACOUNT not between", value1, value2, "isdeductacount");
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

        public Criteria andIspreaccountIsNull() {
            addCriterion("ISPREACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIspreaccountIsNotNull() {
            addCriterion("ISPREACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIspreaccountEqualTo(BigDecimal value) {
            addCriterion("ISPREACCOUNT =", value, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andIspreaccountNotEqualTo(BigDecimal value) {
            addCriterion("ISPREACCOUNT <>", value, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andIspreaccountGreaterThan(BigDecimal value) {
            addCriterion("ISPREACCOUNT >", value, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andIspreaccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ISPREACCOUNT >=", value, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andIspreaccountLessThan(BigDecimal value) {
            addCriterion("ISPREACCOUNT <", value, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andIspreaccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ISPREACCOUNT <=", value, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andIspreaccountIn(List<BigDecimal> values) {
            addCriterion("ISPREACCOUNT in", values, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andIspreaccountNotIn(List<BigDecimal> values) {
            addCriterion("ISPREACCOUNT not in", values, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andIspreaccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISPREACCOUNT between", value1, value2, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andIspreaccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ISPREACCOUNT not between", value1, value2, "ispreaccount");
            return (Criteria) this;
        }

        public Criteria andPreupdateIsNull() {
            addCriterion("PREUPDATE is null");
            return (Criteria) this;
        }

        public Criteria andPreupdateIsNotNull() {
            addCriterion("PREUPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPreupdateEqualTo(Date value) {
            addCriterion("PREUPDATE =", value, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreupdateNotEqualTo(Date value) {
            addCriterion("PREUPDATE <>", value, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreupdateGreaterThan(Date value) {
            addCriterion("PREUPDATE >", value, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreupdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PREUPDATE >=", value, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreupdateLessThan(Date value) {
            addCriterion("PREUPDATE <", value, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreupdateLessThanOrEqualTo(Date value) {
            addCriterion("PREUPDATE <=", value, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreupdateIn(List<Date> values) {
            addCriterion("PREUPDATE in", values, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreupdateNotIn(List<Date> values) {
            addCriterion("PREUPDATE not in", values, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreupdateBetween(Date value1, Date value2) {
            addCriterion("PREUPDATE between", value1, value2, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreupdateNotBetween(Date value1, Date value2) {
            addCriterion("PREUPDATE not between", value1, value2, "preupdate");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareIsNull() {
            addCriterion("PREACCOUNTFARE is null");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareIsNotNull() {
            addCriterion("PREACCOUNTFARE is not null");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareEqualTo(BigDecimal value) {
            addCriterion("PREACCOUNTFARE =", value, "preaccountfare");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareNotEqualTo(BigDecimal value) {
            addCriterion("PREACCOUNTFARE <>", value, "preaccountfare");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareGreaterThan(BigDecimal value) {
            addCriterion("PREACCOUNTFARE >", value, "preaccountfare");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PREACCOUNTFARE >=", value, "preaccountfare");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareLessThan(BigDecimal value) {
            addCriterion("PREACCOUNTFARE <", value, "preaccountfare");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PREACCOUNTFARE <=", value, "preaccountfare");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareIn(List<BigDecimal> values) {
            addCriterion("PREACCOUNTFARE in", values, "preaccountfare");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareNotIn(List<BigDecimal> values) {
            addCriterion("PREACCOUNTFARE not in", values, "preaccountfare");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREACCOUNTFARE between", value1, value2, "preaccountfare");
            return (Criteria) this;
        }

        public Criteria andPreaccountfareNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREACCOUNTFARE not between", value1, value2, "preaccountfare");
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
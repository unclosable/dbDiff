package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.Date;

public class MerchantDeliverFee {
    private BigDecimal feeid;

    private BigDecimal merchantid;

    private BigDecimal paymenttype;

    private BigDecimal paymentperiod;

    private BigDecimal deliverfeetype;

    private BigDecimal deliverfeeperiod;

    private String feefactors;

    private BigDecimal isuniformedfee;

    private BigDecimal basicdeliverfee;

    private BigDecimal formulaid;

    private String formulaparamters;

    private BigDecimal updateby;

    private Date updatetime;

    private String updatecode;

    private BigDecimal auditby;

    private Date audittime;

    private String auditcode;

    private BigDecimal auditresult;

    private String status;

    private BigDecimal refusefeerate;

    private BigDecimal receivefeerate;

    private Date paymentperioddate;

    private Date deliverfeeperioddate;

    private BigDecimal firstweight;

    private BigDecimal statpramer;

    private BigDecimal addweightprice;

    private BigDecimal firstweightprice;

    private BigDecimal volumeparmer;

    private BigDecimal protectedparmer;

    private BigDecimal visitreturnsfee;

    private BigDecimal visitchangefee;

    private BigDecimal receiveposfeerate;

    private BigDecimal createby;

    private Date createtime;

    private BigDecimal visitreturnsvfee;

    private BigDecimal cashservicefee;

    private BigDecimal posservicefee;

    private BigDecimal receivefeetype;

    private BigDecimal receiveposfeetype;

    private BigDecimal cashservicetype;

    private BigDecimal posservicetype;

    private BigDecimal weighttype;

    private BigDecimal weightvaluerule;

    private String distributioncode;

    private BigDecimal ischange;

    private BigDecimal extraprotected;

    private BigDecimal extrarefusefeerate;

    private BigDecimal extravisitreturnsfee;

    private BigDecimal extravisitchangefee;

    private BigDecimal extravisitreturnsvfee;

    private BigDecimal extracashservicefee;

    private BigDecimal extrareceivefeerate;

    private BigDecimal extraposservicefee;

    private BigDecimal extrareceiveposfeerate;

    private BigDecimal iscategory;

    public BigDecimal getFeeid() {
        return feeid;
    }

    public void setFeeid(BigDecimal feeid) {
        this.feeid = feeid;
    }

    public BigDecimal getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(BigDecimal merchantid) {
        this.merchantid = merchantid;
    }

    public BigDecimal getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(BigDecimal paymenttype) {
        this.paymenttype = paymenttype;
    }

    public BigDecimal getPaymentperiod() {
        return paymentperiod;
    }

    public void setPaymentperiod(BigDecimal paymentperiod) {
        this.paymentperiod = paymentperiod;
    }

    public BigDecimal getDeliverfeetype() {
        return deliverfeetype;
    }

    public void setDeliverfeetype(BigDecimal deliverfeetype) {
        this.deliverfeetype = deliverfeetype;
    }

    public BigDecimal getDeliverfeeperiod() {
        return deliverfeeperiod;
    }

    public void setDeliverfeeperiod(BigDecimal deliverfeeperiod) {
        this.deliverfeeperiod = deliverfeeperiod;
    }

    public String getFeefactors() {
        return feefactors;
    }

    public void setFeefactors(String feefactors) {
        this.feefactors = feefactors == null ? null : feefactors.trim();
    }

    public BigDecimal getIsuniformedfee() {
        return isuniformedfee;
    }

    public void setIsuniformedfee(BigDecimal isuniformedfee) {
        this.isuniformedfee = isuniformedfee;
    }

    public BigDecimal getBasicdeliverfee() {
        return basicdeliverfee;
    }

    public void setBasicdeliverfee(BigDecimal basicdeliverfee) {
        this.basicdeliverfee = basicdeliverfee;
    }

    public BigDecimal getFormulaid() {
        return formulaid;
    }

    public void setFormulaid(BigDecimal formulaid) {
        this.formulaid = formulaid;
    }

    public String getFormulaparamters() {
        return formulaparamters;
    }

    public void setFormulaparamters(String formulaparamters) {
        this.formulaparamters = formulaparamters == null ? null : formulaparamters.trim();
    }

    public BigDecimal getUpdateby() {
        return updateby;
    }

    public void setUpdateby(BigDecimal updateby) {
        this.updateby = updateby;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdatecode() {
        return updatecode;
    }

    public void setUpdatecode(String updatecode) {
        this.updatecode = updatecode == null ? null : updatecode.trim();
    }

    public BigDecimal getAuditby() {
        return auditby;
    }

    public void setAuditby(BigDecimal auditby) {
        this.auditby = auditby;
    }

    public Date getAudittime() {
        return audittime;
    }

    public void setAudittime(Date audittime) {
        this.audittime = audittime;
    }

    public String getAuditcode() {
        return auditcode;
    }

    public void setAuditcode(String auditcode) {
        this.auditcode = auditcode == null ? null : auditcode.trim();
    }

    public BigDecimal getAuditresult() {
        return auditresult;
    }

    public void setAuditresult(BigDecimal auditresult) {
        this.auditresult = auditresult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public BigDecimal getRefusefeerate() {
        return refusefeerate;
    }

    public void setRefusefeerate(BigDecimal refusefeerate) {
        this.refusefeerate = refusefeerate;
    }

    public BigDecimal getReceivefeerate() {
        return receivefeerate;
    }

    public void setReceivefeerate(BigDecimal receivefeerate) {
        this.receivefeerate = receivefeerate;
    }

    public Date getPaymentperioddate() {
        return paymentperioddate;
    }

    public void setPaymentperioddate(Date paymentperioddate) {
        this.paymentperioddate = paymentperioddate;
    }

    public Date getDeliverfeeperioddate() {
        return deliverfeeperioddate;
    }

    public void setDeliverfeeperioddate(Date deliverfeeperioddate) {
        this.deliverfeeperioddate = deliverfeeperioddate;
    }

    public BigDecimal getFirstweight() {
        return firstweight;
    }

    public void setFirstweight(BigDecimal firstweight) {
        this.firstweight = firstweight;
    }

    public BigDecimal getStatpramer() {
        return statpramer;
    }

    public void setStatpramer(BigDecimal statpramer) {
        this.statpramer = statpramer;
    }

    public BigDecimal getAddweightprice() {
        return addweightprice;
    }

    public void setAddweightprice(BigDecimal addweightprice) {
        this.addweightprice = addweightprice;
    }

    public BigDecimal getFirstweightprice() {
        return firstweightprice;
    }

    public void setFirstweightprice(BigDecimal firstweightprice) {
        this.firstweightprice = firstweightprice;
    }

    public BigDecimal getVolumeparmer() {
        return volumeparmer;
    }

    public void setVolumeparmer(BigDecimal volumeparmer) {
        this.volumeparmer = volumeparmer;
    }

    public BigDecimal getProtectedparmer() {
        return protectedparmer;
    }

    public void setProtectedparmer(BigDecimal protectedparmer) {
        this.protectedparmer = protectedparmer;
    }

    public BigDecimal getVisitreturnsfee() {
        return visitreturnsfee;
    }

    public void setVisitreturnsfee(BigDecimal visitreturnsfee) {
        this.visitreturnsfee = visitreturnsfee;
    }

    public BigDecimal getVisitchangefee() {
        return visitchangefee;
    }

    public void setVisitchangefee(BigDecimal visitchangefee) {
        this.visitchangefee = visitchangefee;
    }

    public BigDecimal getReceiveposfeerate() {
        return receiveposfeerate;
    }

    public void setReceiveposfeerate(BigDecimal receiveposfeerate) {
        this.receiveposfeerate = receiveposfeerate;
    }

    public BigDecimal getCreateby() {
        return createby;
    }

    public void setCreateby(BigDecimal createby) {
        this.createby = createby;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getVisitreturnsvfee() {
        return visitreturnsvfee;
    }

    public void setVisitreturnsvfee(BigDecimal visitreturnsvfee) {
        this.visitreturnsvfee = visitreturnsvfee;
    }

    public BigDecimal getCashservicefee() {
        return cashservicefee;
    }

    public void setCashservicefee(BigDecimal cashservicefee) {
        this.cashservicefee = cashservicefee;
    }

    public BigDecimal getPosservicefee() {
        return posservicefee;
    }

    public void setPosservicefee(BigDecimal posservicefee) {
        this.posservicefee = posservicefee;
    }

    public BigDecimal getReceivefeetype() {
        return receivefeetype;
    }

    public void setReceivefeetype(BigDecimal receivefeetype) {
        this.receivefeetype = receivefeetype;
    }

    public BigDecimal getReceiveposfeetype() {
        return receiveposfeetype;
    }

    public void setReceiveposfeetype(BigDecimal receiveposfeetype) {
        this.receiveposfeetype = receiveposfeetype;
    }

    public BigDecimal getCashservicetype() {
        return cashservicetype;
    }

    public void setCashservicetype(BigDecimal cashservicetype) {
        this.cashservicetype = cashservicetype;
    }

    public BigDecimal getPosservicetype() {
        return posservicetype;
    }

    public void setPosservicetype(BigDecimal posservicetype) {
        this.posservicetype = posservicetype;
    }

    public BigDecimal getWeighttype() {
        return weighttype;
    }

    public void setWeighttype(BigDecimal weighttype) {
        this.weighttype = weighttype;
    }

    public BigDecimal getWeightvaluerule() {
        return weightvaluerule;
    }

    public void setWeightvaluerule(BigDecimal weightvaluerule) {
        this.weightvaluerule = weightvaluerule;
    }

    public String getDistributioncode() {
        return distributioncode;
    }

    public void setDistributioncode(String distributioncode) {
        this.distributioncode = distributioncode == null ? null : distributioncode.trim();
    }

    public BigDecimal getIschange() {
        return ischange;
    }

    public void setIschange(BigDecimal ischange) {
        this.ischange = ischange;
    }

    public BigDecimal getExtraprotected() {
        return extraprotected;
    }

    public void setExtraprotected(BigDecimal extraprotected) {
        this.extraprotected = extraprotected;
    }

    public BigDecimal getExtrarefusefeerate() {
        return extrarefusefeerate;
    }

    public void setExtrarefusefeerate(BigDecimal extrarefusefeerate) {
        this.extrarefusefeerate = extrarefusefeerate;
    }

    public BigDecimal getExtravisitreturnsfee() {
        return extravisitreturnsfee;
    }

    public void setExtravisitreturnsfee(BigDecimal extravisitreturnsfee) {
        this.extravisitreturnsfee = extravisitreturnsfee;
    }

    public BigDecimal getExtravisitchangefee() {
        return extravisitchangefee;
    }

    public void setExtravisitchangefee(BigDecimal extravisitchangefee) {
        this.extravisitchangefee = extravisitchangefee;
    }

    public BigDecimal getExtravisitreturnsvfee() {
        return extravisitreturnsvfee;
    }

    public void setExtravisitreturnsvfee(BigDecimal extravisitreturnsvfee) {
        this.extravisitreturnsvfee = extravisitreturnsvfee;
    }

    public BigDecimal getExtracashservicefee() {
        return extracashservicefee;
    }

    public void setExtracashservicefee(BigDecimal extracashservicefee) {
        this.extracashservicefee = extracashservicefee;
    }

    public BigDecimal getExtrareceivefeerate() {
        return extrareceivefeerate;
    }

    public void setExtrareceivefeerate(BigDecimal extrareceivefeerate) {
        this.extrareceivefeerate = extrareceivefeerate;
    }

    public BigDecimal getExtraposservicefee() {
        return extraposservicefee;
    }

    public void setExtraposservicefee(BigDecimal extraposservicefee) {
        this.extraposservicefee = extraposservicefee;
    }

    public BigDecimal getExtrareceiveposfeerate() {
        return extrareceiveposfeerate;
    }

    public void setExtrareceiveposfeerate(BigDecimal extrareceiveposfeerate) {
        this.extrareceiveposfeerate = extrareceiveposfeerate;
    }

    public BigDecimal getIscategory() {
        return iscategory;
    }

    public void setIscategory(BigDecimal iscategory) {
        this.iscategory = iscategory;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        MerchantDeliverFee other = (MerchantDeliverFee) that;
        return (this.getFeeid() == null ? other.getFeeid() == null : this.getFeeid().equals(other.getFeeid()))
            && (this.getMerchantid() == null ? other.getMerchantid() == null : this.getMerchantid().equals(other.getMerchantid()))
            && (this.getPaymenttype() == null ? other.getPaymenttype() == null : this.getPaymenttype().equals(other.getPaymenttype()))
            && (this.getPaymentperiod() == null ? other.getPaymentperiod() == null : this.getPaymentperiod().equals(other.getPaymentperiod()))
            && (this.getDeliverfeetype() == null ? other.getDeliverfeetype() == null : this.getDeliverfeetype().equals(other.getDeliverfeetype()))
            && (this.getDeliverfeeperiod() == null ? other.getDeliverfeeperiod() == null : this.getDeliverfeeperiod().equals(other.getDeliverfeeperiod()))
            && (this.getFeefactors() == null ? other.getFeefactors() == null : this.getFeefactors().equals(other.getFeefactors()))
            && (this.getIsuniformedfee() == null ? other.getIsuniformedfee() == null : this.getIsuniformedfee().equals(other.getIsuniformedfee()))
            && (this.getBasicdeliverfee() == null ? other.getBasicdeliverfee() == null : this.getBasicdeliverfee().equals(other.getBasicdeliverfee()))
            && (this.getFormulaid() == null ? other.getFormulaid() == null : this.getFormulaid().equals(other.getFormulaid()))
            && (this.getFormulaparamters() == null ? other.getFormulaparamters() == null : this.getFormulaparamters().equals(other.getFormulaparamters()))
            && (this.getUpdateby() == null ? other.getUpdateby() == null : this.getUpdateby().equals(other.getUpdateby()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getUpdatecode() == null ? other.getUpdatecode() == null : this.getUpdatecode().equals(other.getUpdatecode()))
            && (this.getAuditby() == null ? other.getAuditby() == null : this.getAuditby().equals(other.getAuditby()))
            && (this.getAudittime() == null ? other.getAudittime() == null : this.getAudittime().equals(other.getAudittime()))
            && (this.getAuditcode() == null ? other.getAuditcode() == null : this.getAuditcode().equals(other.getAuditcode()))
            && (this.getAuditresult() == null ? other.getAuditresult() == null : this.getAuditresult().equals(other.getAuditresult()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRefusefeerate() == null ? other.getRefusefeerate() == null : this.getRefusefeerate().equals(other.getRefusefeerate()))
            && (this.getReceivefeerate() == null ? other.getReceivefeerate() == null : this.getReceivefeerate().equals(other.getReceivefeerate()))
            && (this.getPaymentperioddate() == null ? other.getPaymentperioddate() == null : this.getPaymentperioddate().equals(other.getPaymentperioddate()))
            && (this.getDeliverfeeperioddate() == null ? other.getDeliverfeeperioddate() == null : this.getDeliverfeeperioddate().equals(other.getDeliverfeeperioddate()))
            && (this.getFirstweight() == null ? other.getFirstweight() == null : this.getFirstweight().equals(other.getFirstweight()))
            && (this.getStatpramer() == null ? other.getStatpramer() == null : this.getStatpramer().equals(other.getStatpramer()))
            && (this.getAddweightprice() == null ? other.getAddweightprice() == null : this.getAddweightprice().equals(other.getAddweightprice()))
            && (this.getFirstweightprice() == null ? other.getFirstweightprice() == null : this.getFirstweightprice().equals(other.getFirstweightprice()))
            && (this.getVolumeparmer() == null ? other.getVolumeparmer() == null : this.getVolumeparmer().equals(other.getVolumeparmer()))
            && (this.getProtectedparmer() == null ? other.getProtectedparmer() == null : this.getProtectedparmer().equals(other.getProtectedparmer()))
            && (this.getVisitreturnsfee() == null ? other.getVisitreturnsfee() == null : this.getVisitreturnsfee().equals(other.getVisitreturnsfee()))
            && (this.getVisitchangefee() == null ? other.getVisitchangefee() == null : this.getVisitchangefee().equals(other.getVisitchangefee()))
            && (this.getReceiveposfeerate() == null ? other.getReceiveposfeerate() == null : this.getReceiveposfeerate().equals(other.getReceiveposfeerate()))
            && (this.getCreateby() == null ? other.getCreateby() == null : this.getCreateby().equals(other.getCreateby()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getVisitreturnsvfee() == null ? other.getVisitreturnsvfee() == null : this.getVisitreturnsvfee().equals(other.getVisitreturnsvfee()))
            && (this.getCashservicefee() == null ? other.getCashservicefee() == null : this.getCashservicefee().equals(other.getCashservicefee()))
            && (this.getPosservicefee() == null ? other.getPosservicefee() == null : this.getPosservicefee().equals(other.getPosservicefee()))
            && (this.getReceivefeetype() == null ? other.getReceivefeetype() == null : this.getReceivefeetype().equals(other.getReceivefeetype()))
            && (this.getReceiveposfeetype() == null ? other.getReceiveposfeetype() == null : this.getReceiveposfeetype().equals(other.getReceiveposfeetype()))
            && (this.getCashservicetype() == null ? other.getCashservicetype() == null : this.getCashservicetype().equals(other.getCashservicetype()))
            && (this.getPosservicetype() == null ? other.getPosservicetype() == null : this.getPosservicetype().equals(other.getPosservicetype()))
            && (this.getWeighttype() == null ? other.getWeighttype() == null : this.getWeighttype().equals(other.getWeighttype()))
            && (this.getWeightvaluerule() == null ? other.getWeightvaluerule() == null : this.getWeightvaluerule().equals(other.getWeightvaluerule()))
            && (this.getDistributioncode() == null ? other.getDistributioncode() == null : this.getDistributioncode().equals(other.getDistributioncode()))
            && (this.getIschange() == null ? other.getIschange() == null : this.getIschange().equals(other.getIschange()))
            && (this.getExtraprotected() == null ? other.getExtraprotected() == null : this.getExtraprotected().equals(other.getExtraprotected()))
            && (this.getExtrarefusefeerate() == null ? other.getExtrarefusefeerate() == null : this.getExtrarefusefeerate().equals(other.getExtrarefusefeerate()))
            && (this.getExtravisitreturnsfee() == null ? other.getExtravisitreturnsfee() == null : this.getExtravisitreturnsfee().equals(other.getExtravisitreturnsfee()))
            && (this.getExtravisitchangefee() == null ? other.getExtravisitchangefee() == null : this.getExtravisitchangefee().equals(other.getExtravisitchangefee()))
            && (this.getExtravisitreturnsvfee() == null ? other.getExtravisitreturnsvfee() == null : this.getExtravisitreturnsvfee().equals(other.getExtravisitreturnsvfee()))
            && (this.getExtracashservicefee() == null ? other.getExtracashservicefee() == null : this.getExtracashservicefee().equals(other.getExtracashservicefee()))
            && (this.getExtrareceivefeerate() == null ? other.getExtrareceivefeerate() == null : this.getExtrareceivefeerate().equals(other.getExtrareceivefeerate()))
            && (this.getExtraposservicefee() == null ? other.getExtraposservicefee() == null : this.getExtraposservicefee().equals(other.getExtraposservicefee()))
            && (this.getExtrareceiveposfeerate() == null ? other.getExtrareceiveposfeerate() == null : this.getExtrareceiveposfeerate().equals(other.getExtrareceiveposfeerate()))
            && (this.getIscategory() == null ? other.getIscategory() == null : this.getIscategory().equals(other.getIscategory()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFeeid() == null) ? 0 : getFeeid().hashCode());
        result = prime * result + ((getMerchantid() == null) ? 0 : getMerchantid().hashCode());
        result = prime * result + ((getPaymenttype() == null) ? 0 : getPaymenttype().hashCode());
        result = prime * result + ((getPaymentperiod() == null) ? 0 : getPaymentperiod().hashCode());
        result = prime * result + ((getDeliverfeetype() == null) ? 0 : getDeliverfeetype().hashCode());
        result = prime * result + ((getDeliverfeeperiod() == null) ? 0 : getDeliverfeeperiod().hashCode());
        result = prime * result + ((getFeefactors() == null) ? 0 : getFeefactors().hashCode());
        result = prime * result + ((getIsuniformedfee() == null) ? 0 : getIsuniformedfee().hashCode());
        result = prime * result + ((getBasicdeliverfee() == null) ? 0 : getBasicdeliverfee().hashCode());
        result = prime * result + ((getFormulaid() == null) ? 0 : getFormulaid().hashCode());
        result = prime * result + ((getFormulaparamters() == null) ? 0 : getFormulaparamters().hashCode());
        result = prime * result + ((getUpdateby() == null) ? 0 : getUpdateby().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getUpdatecode() == null) ? 0 : getUpdatecode().hashCode());
        result = prime * result + ((getAuditby() == null) ? 0 : getAuditby().hashCode());
        result = prime * result + ((getAudittime() == null) ? 0 : getAudittime().hashCode());
        result = prime * result + ((getAuditcode() == null) ? 0 : getAuditcode().hashCode());
        result = prime * result + ((getAuditresult() == null) ? 0 : getAuditresult().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRefusefeerate() == null) ? 0 : getRefusefeerate().hashCode());
        result = prime * result + ((getReceivefeerate() == null) ? 0 : getReceivefeerate().hashCode());
        result = prime * result + ((getPaymentperioddate() == null) ? 0 : getPaymentperioddate().hashCode());
        result = prime * result + ((getDeliverfeeperioddate() == null) ? 0 : getDeliverfeeperioddate().hashCode());
        result = prime * result + ((getFirstweight() == null) ? 0 : getFirstweight().hashCode());
        result = prime * result + ((getStatpramer() == null) ? 0 : getStatpramer().hashCode());
        result = prime * result + ((getAddweightprice() == null) ? 0 : getAddweightprice().hashCode());
        result = prime * result + ((getFirstweightprice() == null) ? 0 : getFirstweightprice().hashCode());
        result = prime * result + ((getVolumeparmer() == null) ? 0 : getVolumeparmer().hashCode());
        result = prime * result + ((getProtectedparmer() == null) ? 0 : getProtectedparmer().hashCode());
        result = prime * result + ((getVisitreturnsfee() == null) ? 0 : getVisitreturnsfee().hashCode());
        result = prime * result + ((getVisitchangefee() == null) ? 0 : getVisitchangefee().hashCode());
        result = prime * result + ((getReceiveposfeerate() == null) ? 0 : getReceiveposfeerate().hashCode());
        result = prime * result + ((getCreateby() == null) ? 0 : getCreateby().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getVisitreturnsvfee() == null) ? 0 : getVisitreturnsvfee().hashCode());
        result = prime * result + ((getCashservicefee() == null) ? 0 : getCashservicefee().hashCode());
        result = prime * result + ((getPosservicefee() == null) ? 0 : getPosservicefee().hashCode());
        result = prime * result + ((getReceivefeetype() == null) ? 0 : getReceivefeetype().hashCode());
        result = prime * result + ((getReceiveposfeetype() == null) ? 0 : getReceiveposfeetype().hashCode());
        result = prime * result + ((getCashservicetype() == null) ? 0 : getCashservicetype().hashCode());
        result = prime * result + ((getPosservicetype() == null) ? 0 : getPosservicetype().hashCode());
        result = prime * result + ((getWeighttype() == null) ? 0 : getWeighttype().hashCode());
        result = prime * result + ((getWeightvaluerule() == null) ? 0 : getWeightvaluerule().hashCode());
        result = prime * result + ((getDistributioncode() == null) ? 0 : getDistributioncode().hashCode());
        result = prime * result + ((getIschange() == null) ? 0 : getIschange().hashCode());
        result = prime * result + ((getExtraprotected() == null) ? 0 : getExtraprotected().hashCode());
        result = prime * result + ((getExtrarefusefeerate() == null) ? 0 : getExtrarefusefeerate().hashCode());
        result = prime * result + ((getExtravisitreturnsfee() == null) ? 0 : getExtravisitreturnsfee().hashCode());
        result = prime * result + ((getExtravisitchangefee() == null) ? 0 : getExtravisitchangefee().hashCode());
        result = prime * result + ((getExtravisitreturnsvfee() == null) ? 0 : getExtravisitreturnsvfee().hashCode());
        result = prime * result + ((getExtracashservicefee() == null) ? 0 : getExtracashservicefee().hashCode());
        result = prime * result + ((getExtrareceivefeerate() == null) ? 0 : getExtrareceivefeerate().hashCode());
        result = prime * result + ((getExtraposservicefee() == null) ? 0 : getExtraposservicefee().hashCode());
        result = prime * result + ((getExtrareceiveposfeerate() == null) ? 0 : getExtrareceiveposfeerate().hashCode());
        result = prime * result + ((getIscategory() == null) ? 0 : getIscategory().hashCode());
        return result;
    }
}
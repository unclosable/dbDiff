package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.Date;

public class AreaExpressLevelIncome {
    private BigDecimal autoid;

    private String areaid;

    private BigDecimal merchantid;

    private String warehouseid;

    private BigDecimal areatype;

    private BigDecimal isenable;

    private BigDecimal effectareatype;

    private Date dodate;

    private BigDecimal createby;

    private Date createtime;

    private BigDecimal updateby;

    private Date updatetime;

    private BigDecimal auditstatus;

    private BigDecimal auditby;

    private Date audittime;

    private BigDecimal expresscompanyid;

    private String distributioncode;

    private BigDecimal ischange;

    private String goodscategorycode;

    private BigDecimal isexpress;

    public BigDecimal getAutoid() {
        return autoid;
    }

    public void setAutoid(BigDecimal autoid) {
        this.autoid = autoid;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public BigDecimal getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(BigDecimal merchantid) {
        this.merchantid = merchantid;
    }

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid == null ? null : warehouseid.trim();
    }

    public BigDecimal getAreatype() {
        return areatype;
    }

    public void setAreatype(BigDecimal areatype) {
        this.areatype = areatype;
    }

    public BigDecimal getIsenable() {
        return isenable;
    }

    public void setIsenable(BigDecimal isenable) {
        this.isenable = isenable;
    }

    public BigDecimal getEffectareatype() {
        return effectareatype;
    }

    public void setEffectareatype(BigDecimal effectareatype) {
        this.effectareatype = effectareatype;
    }

    public Date getDodate() {
        return dodate;
    }

    public void setDodate(Date dodate) {
        this.dodate = dodate;
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

    public BigDecimal getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(BigDecimal auditstatus) {
        this.auditstatus = auditstatus;
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

    public BigDecimal getExpresscompanyid() {
        return expresscompanyid;
    }

    public void setExpresscompanyid(BigDecimal expresscompanyid) {
        this.expresscompanyid = expresscompanyid;
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

    public String getGoodscategorycode() {
        return goodscategorycode;
    }

    public void setGoodscategorycode(String goodscategorycode) {
        this.goodscategorycode = goodscategorycode == null ? null : goodscategorycode.trim();
    }

    public BigDecimal getIsexpress() {
        return isexpress;
    }

    public void setIsexpress(BigDecimal isexpress) {
        this.isexpress = isexpress;
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
        AreaExpressLevelIncome other = (AreaExpressLevelIncome) that;
        return (this.getAutoid() == null ? other.getAutoid() == null : this.getAutoid().equals(other.getAutoid()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getMerchantid() == null ? other.getMerchantid() == null : this.getMerchantid().equals(other.getMerchantid()))
            && (this.getWarehouseid() == null ? other.getWarehouseid() == null : this.getWarehouseid().equals(other.getWarehouseid()))
            && (this.getAreatype() == null ? other.getAreatype() == null : this.getAreatype().equals(other.getAreatype()))
            && (this.getIsenable() == null ? other.getIsenable() == null : this.getIsenable().equals(other.getIsenable()))
            && (this.getEffectareatype() == null ? other.getEffectareatype() == null : this.getEffectareatype().equals(other.getEffectareatype()))
            && (this.getDodate() == null ? other.getDodate() == null : this.getDodate().equals(other.getDodate()))
            && (this.getCreateby() == null ? other.getCreateby() == null : this.getCreateby().equals(other.getCreateby()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getUpdateby() == null ? other.getUpdateby() == null : this.getUpdateby().equals(other.getUpdateby()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getAuditstatus() == null ? other.getAuditstatus() == null : this.getAuditstatus().equals(other.getAuditstatus()))
            && (this.getAuditby() == null ? other.getAuditby() == null : this.getAuditby().equals(other.getAuditby()))
            && (this.getAudittime() == null ? other.getAudittime() == null : this.getAudittime().equals(other.getAudittime()))
            && (this.getExpresscompanyid() == null ? other.getExpresscompanyid() == null : this.getExpresscompanyid().equals(other.getExpresscompanyid()))
            && (this.getDistributioncode() == null ? other.getDistributioncode() == null : this.getDistributioncode().equals(other.getDistributioncode()))
            && (this.getIschange() == null ? other.getIschange() == null : this.getIschange().equals(other.getIschange()))
            && (this.getGoodscategorycode() == null ? other.getGoodscategorycode() == null : this.getGoodscategorycode().equals(other.getGoodscategorycode()))
            && (this.getIsexpress() == null ? other.getIsexpress() == null : this.getIsexpress().equals(other.getIsexpress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAutoid() == null) ? 0 : getAutoid().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getMerchantid() == null) ? 0 : getMerchantid().hashCode());
        result = prime * result + ((getWarehouseid() == null) ? 0 : getWarehouseid().hashCode());
        result = prime * result + ((getAreatype() == null) ? 0 : getAreatype().hashCode());
        result = prime * result + ((getIsenable() == null) ? 0 : getIsenable().hashCode());
        result = prime * result + ((getEffectareatype() == null) ? 0 : getEffectareatype().hashCode());
        result = prime * result + ((getDodate() == null) ? 0 : getDodate().hashCode());
        result = prime * result + ((getCreateby() == null) ? 0 : getCreateby().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getUpdateby() == null) ? 0 : getUpdateby().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getAuditstatus() == null) ? 0 : getAuditstatus().hashCode());
        result = prime * result + ((getAuditby() == null) ? 0 : getAuditby().hashCode());
        result = prime * result + ((getAudittime() == null) ? 0 : getAudittime().hashCode());
        result = prime * result + ((getExpresscompanyid() == null) ? 0 : getExpresscompanyid().hashCode());
        result = prime * result + ((getDistributioncode() == null) ? 0 : getDistributioncode().hashCode());
        result = prime * result + ((getIschange() == null) ? 0 : getIschange().hashCode());
        result = prime * result + ((getGoodscategorycode() == null) ? 0 : getGoodscategorycode().hashCode());
        result = prime * result + ((getIsexpress() == null) ? 0 : getIsexpress().hashCode());
        return result;
    }
}
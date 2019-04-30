package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.Date;

public class IncomeBaseinfo {
    private BigDecimal incomeid;

    private Date createtime;

    private BigDecimal waybillno;

    private String waybilltype;

    private BigDecimal merchantid;

    private BigDecimal expresscompanyid;

    private BigDecimal finalexpresscompanyid;

    private BigDecimal deliverstationid;

    private BigDecimal topcodcompanyid;

    private Date rfdaccepttime;

    private Date delivertime;

    private Date returntime;

    private BigDecimal returnexpresscompanyid;

    private Date backstationtime;

    private String backstationstatus;

    private BigDecimal protectedamount;

    private BigDecimal totalamount;

    private BigDecimal paidamount;

    private BigDecimal needpayamount;

    private BigDecimal backamount;

    private BigDecimal needbackamount;

    private BigDecimal accountweight;

    private String areaid;

    private String receiveaddress;

    private BigDecimal signtype;

    private BigDecimal inefficacystatus;

    private Date updatetime;

    private BigDecimal receivestationid;

    private BigDecimal receivedelivermanid;

    private String distributioncode;

    private String currentdistributioncode;

    private BigDecimal waybillinfoweight;

    private BigDecimal substatus;

    private String accepttype;

    private String customerorder;

    private String origindepotno;

    private BigDecimal ischange;

    private String periodaccountcode;

    private String waybillcategory;

    private String delivercode;

    private BigDecimal isdeleted;

    private BigDecimal ismanualmodify;

    private String accountorderno;

    private BigDecimal packagecount;

    private String sendprovince;

    private String sendcity;

    private String province;

    private String city;

    private String area;

    private String country;

    private String payee;

    private BigDecimal transferoperator;

    private String bankcardnumber;

    private String bankcardname;

    private Date actualtransfertime;

    private BigDecimal transferstate;

    public BigDecimal getIncomeid() {
        return incomeid;
    }

    public void setIncomeid(BigDecimal incomeid) {
        this.incomeid = incomeid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getWaybillno() {
        return waybillno;
    }

    public void setWaybillno(BigDecimal waybillno) {
        this.waybillno = waybillno;
    }

    public String getWaybilltype() {
        return waybilltype;
    }

    public void setWaybilltype(String waybilltype) {
        this.waybilltype = waybilltype == null ? null : waybilltype.trim();
    }

    public BigDecimal getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(BigDecimal merchantid) {
        this.merchantid = merchantid;
    }

    public BigDecimal getExpresscompanyid() {
        return expresscompanyid;
    }

    public void setExpresscompanyid(BigDecimal expresscompanyid) {
        this.expresscompanyid = expresscompanyid;
    }

    public BigDecimal getFinalexpresscompanyid() {
        return finalexpresscompanyid;
    }

    public void setFinalexpresscompanyid(BigDecimal finalexpresscompanyid) {
        this.finalexpresscompanyid = finalexpresscompanyid;
    }

    public BigDecimal getDeliverstationid() {
        return deliverstationid;
    }

    public void setDeliverstationid(BigDecimal deliverstationid) {
        this.deliverstationid = deliverstationid;
    }

    public BigDecimal getTopcodcompanyid() {
        return topcodcompanyid;
    }

    public void setTopcodcompanyid(BigDecimal topcodcompanyid) {
        this.topcodcompanyid = topcodcompanyid;
    }

    public Date getRfdaccepttime() {
        return rfdaccepttime;
    }

    public void setRfdaccepttime(Date rfdaccepttime) {
        this.rfdaccepttime = rfdaccepttime;
    }

    public Date getDelivertime() {
        return delivertime;
    }

    public void setDelivertime(Date delivertime) {
        this.delivertime = delivertime;
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    public BigDecimal getReturnexpresscompanyid() {
        return returnexpresscompanyid;
    }

    public void setReturnexpresscompanyid(BigDecimal returnexpresscompanyid) {
        this.returnexpresscompanyid = returnexpresscompanyid;
    }

    public Date getBackstationtime() {
        return backstationtime;
    }

    public void setBackstationtime(Date backstationtime) {
        this.backstationtime = backstationtime;
    }

    public String getBackstationstatus() {
        return backstationstatus;
    }

    public void setBackstationstatus(String backstationstatus) {
        this.backstationstatus = backstationstatus == null ? null : backstationstatus.trim();
    }

    public BigDecimal getProtectedamount() {
        return protectedamount;
    }

    public void setProtectedamount(BigDecimal protectedamount) {
        this.protectedamount = protectedamount;
    }

    public BigDecimal getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(BigDecimal totalamount) {
        this.totalamount = totalamount;
    }

    public BigDecimal getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(BigDecimal paidamount) {
        this.paidamount = paidamount;
    }

    public BigDecimal getNeedpayamount() {
        return needpayamount;
    }

    public void setNeedpayamount(BigDecimal needpayamount) {
        this.needpayamount = needpayamount;
    }

    public BigDecimal getBackamount() {
        return backamount;
    }

    public void setBackamount(BigDecimal backamount) {
        this.backamount = backamount;
    }

    public BigDecimal getNeedbackamount() {
        return needbackamount;
    }

    public void setNeedbackamount(BigDecimal needbackamount) {
        this.needbackamount = needbackamount;
    }

    public BigDecimal getAccountweight() {
        return accountweight;
    }

    public void setAccountweight(BigDecimal accountweight) {
        this.accountweight = accountweight;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getReceiveaddress() {
        return receiveaddress;
    }

    public void setReceiveaddress(String receiveaddress) {
        this.receiveaddress = receiveaddress == null ? null : receiveaddress.trim();
    }

    public BigDecimal getSigntype() {
        return signtype;
    }

    public void setSigntype(BigDecimal signtype) {
        this.signtype = signtype;
    }

    public BigDecimal getInefficacystatus() {
        return inefficacystatus;
    }

    public void setInefficacystatus(BigDecimal inefficacystatus) {
        this.inefficacystatus = inefficacystatus;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public BigDecimal getReceivestationid() {
        return receivestationid;
    }

    public void setReceivestationid(BigDecimal receivestationid) {
        this.receivestationid = receivestationid;
    }

    public BigDecimal getReceivedelivermanid() {
        return receivedelivermanid;
    }

    public void setReceivedelivermanid(BigDecimal receivedelivermanid) {
        this.receivedelivermanid = receivedelivermanid;
    }

    public String getDistributioncode() {
        return distributioncode;
    }

    public void setDistributioncode(String distributioncode) {
        this.distributioncode = distributioncode == null ? null : distributioncode.trim();
    }

    public String getCurrentdistributioncode() {
        return currentdistributioncode;
    }

    public void setCurrentdistributioncode(String currentdistributioncode) {
        this.currentdistributioncode = currentdistributioncode == null ? null : currentdistributioncode.trim();
    }

    public BigDecimal getWaybillinfoweight() {
        return waybillinfoweight;
    }

    public void setWaybillinfoweight(BigDecimal waybillinfoweight) {
        this.waybillinfoweight = waybillinfoweight;
    }

    public BigDecimal getSubstatus() {
        return substatus;
    }

    public void setSubstatus(BigDecimal substatus) {
        this.substatus = substatus;
    }

    public String getAccepttype() {
        return accepttype;
    }

    public void setAccepttype(String accepttype) {
        this.accepttype = accepttype == null ? null : accepttype.trim();
    }

    public String getCustomerorder() {
        return customerorder;
    }

    public void setCustomerorder(String customerorder) {
        this.customerorder = customerorder == null ? null : customerorder.trim();
    }

    public String getOrigindepotno() {
        return origindepotno;
    }

    public void setOrigindepotno(String origindepotno) {
        this.origindepotno = origindepotno == null ? null : origindepotno.trim();
    }

    public BigDecimal getIschange() {
        return ischange;
    }

    public void setIschange(BigDecimal ischange) {
        this.ischange = ischange;
    }

    public String getPeriodaccountcode() {
        return periodaccountcode;
    }

    public void setPeriodaccountcode(String periodaccountcode) {
        this.periodaccountcode = periodaccountcode == null ? null : periodaccountcode.trim();
    }

    public String getWaybillcategory() {
        return waybillcategory;
    }

    public void setWaybillcategory(String waybillcategory) {
        this.waybillcategory = waybillcategory == null ? null : waybillcategory.trim();
    }

    public String getDelivercode() {
        return delivercode;
    }

    public void setDelivercode(String delivercode) {
        this.delivercode = delivercode == null ? null : delivercode.trim();
    }

    public BigDecimal getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(BigDecimal isdeleted) {
        this.isdeleted = isdeleted;
    }

    public BigDecimal getIsmanualmodify() {
        return ismanualmodify;
    }

    public void setIsmanualmodify(BigDecimal ismanualmodify) {
        this.ismanualmodify = ismanualmodify;
    }

    public String getAccountorderno() {
        return accountorderno;
    }

    public void setAccountorderno(String accountorderno) {
        this.accountorderno = accountorderno == null ? null : accountorderno.trim();
    }

    public BigDecimal getPackagecount() {
        return packagecount;
    }

    public void setPackagecount(BigDecimal packagecount) {
        this.packagecount = packagecount;
    }

    public String getSendprovince() {
        return sendprovince;
    }

    public void setSendprovince(String sendprovince) {
        this.sendprovince = sendprovince == null ? null : sendprovince.trim();
    }

    public String getSendcity() {
        return sendcity;
    }

    public void setSendcity(String sendcity) {
        this.sendcity = sendcity == null ? null : sendcity.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
    }

    public BigDecimal getTransferoperator() {
        return transferoperator;
    }

    public void setTransferoperator(BigDecimal transferoperator) {
        this.transferoperator = transferoperator;
    }

    public String getBankcardnumber() {
        return bankcardnumber;
    }

    public void setBankcardnumber(String bankcardnumber) {
        this.bankcardnumber = bankcardnumber == null ? null : bankcardnumber.trim();
    }

    public String getBankcardname() {
        return bankcardname;
    }

    public void setBankcardname(String bankcardname) {
        this.bankcardname = bankcardname == null ? null : bankcardname.trim();
    }

    public Date getActualtransfertime() {
        return actualtransfertime;
    }

    public void setActualtransfertime(Date actualtransfertime) {
        this.actualtransfertime = actualtransfertime;
    }

    public BigDecimal getTransferstate() {
        return transferstate;
    }

    public void setTransferstate(BigDecimal transferstate) {
        this.transferstate = transferstate;
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
        IncomeBaseinfo other = (IncomeBaseinfo) that;
        return (this.getIncomeid() == null ? other.getIncomeid() == null : this.getIncomeid().equals(other.getIncomeid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getWaybillno() == null ? other.getWaybillno() == null : this.getWaybillno().equals(other.getWaybillno()))
            && (this.getWaybilltype() == null ? other.getWaybilltype() == null : this.getWaybilltype().equals(other.getWaybilltype()))
            && (this.getMerchantid() == null ? other.getMerchantid() == null : this.getMerchantid().equals(other.getMerchantid()))
            && (this.getExpresscompanyid() == null ? other.getExpresscompanyid() == null : this.getExpresscompanyid().equals(other.getExpresscompanyid()))
            && (this.getFinalexpresscompanyid() == null ? other.getFinalexpresscompanyid() == null : this.getFinalexpresscompanyid().equals(other.getFinalexpresscompanyid()))
            && (this.getDeliverstationid() == null ? other.getDeliverstationid() == null : this.getDeliverstationid().equals(other.getDeliverstationid()))
            && (this.getTopcodcompanyid() == null ? other.getTopcodcompanyid() == null : this.getTopcodcompanyid().equals(other.getTopcodcompanyid()))
            && (this.getRfdaccepttime() == null ? other.getRfdaccepttime() == null : this.getRfdaccepttime().equals(other.getRfdaccepttime()))
            && (this.getDelivertime() == null ? other.getDelivertime() == null : this.getDelivertime().equals(other.getDelivertime()))
            && (this.getReturntime() == null ? other.getReturntime() == null : this.getReturntime().equals(other.getReturntime()))
            && (this.getReturnexpresscompanyid() == null ? other.getReturnexpresscompanyid() == null : this.getReturnexpresscompanyid().equals(other.getReturnexpresscompanyid()))
            && (this.getBackstationtime() == null ? other.getBackstationtime() == null : this.getBackstationtime().equals(other.getBackstationtime()))
            && (this.getBackstationstatus() == null ? other.getBackstationstatus() == null : this.getBackstationstatus().equals(other.getBackstationstatus()))
            && (this.getProtectedamount() == null ? other.getProtectedamount() == null : this.getProtectedamount().equals(other.getProtectedamount()))
            && (this.getTotalamount() == null ? other.getTotalamount() == null : this.getTotalamount().equals(other.getTotalamount()))
            && (this.getPaidamount() == null ? other.getPaidamount() == null : this.getPaidamount().equals(other.getPaidamount()))
            && (this.getNeedpayamount() == null ? other.getNeedpayamount() == null : this.getNeedpayamount().equals(other.getNeedpayamount()))
            && (this.getBackamount() == null ? other.getBackamount() == null : this.getBackamount().equals(other.getBackamount()))
            && (this.getNeedbackamount() == null ? other.getNeedbackamount() == null : this.getNeedbackamount().equals(other.getNeedbackamount()))
            && (this.getAccountweight() == null ? other.getAccountweight() == null : this.getAccountweight().equals(other.getAccountweight()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getReceiveaddress() == null ? other.getReceiveaddress() == null : this.getReceiveaddress().equals(other.getReceiveaddress()))
            && (this.getSigntype() == null ? other.getSigntype() == null : this.getSigntype().equals(other.getSigntype()))
            && (this.getInefficacystatus() == null ? other.getInefficacystatus() == null : this.getInefficacystatus().equals(other.getInefficacystatus()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getReceivestationid() == null ? other.getReceivestationid() == null : this.getReceivestationid().equals(other.getReceivestationid()))
            && (this.getReceivedelivermanid() == null ? other.getReceivedelivermanid() == null : this.getReceivedelivermanid().equals(other.getReceivedelivermanid()))
            && (this.getDistributioncode() == null ? other.getDistributioncode() == null : this.getDistributioncode().equals(other.getDistributioncode()))
            && (this.getCurrentdistributioncode() == null ? other.getCurrentdistributioncode() == null : this.getCurrentdistributioncode().equals(other.getCurrentdistributioncode()))
            && (this.getWaybillinfoweight() == null ? other.getWaybillinfoweight() == null : this.getWaybillinfoweight().equals(other.getWaybillinfoweight()))
            && (this.getSubstatus() == null ? other.getSubstatus() == null : this.getSubstatus().equals(other.getSubstatus()))
            && (this.getAccepttype() == null ? other.getAccepttype() == null : this.getAccepttype().equals(other.getAccepttype()))
            && (this.getCustomerorder() == null ? other.getCustomerorder() == null : this.getCustomerorder().equals(other.getCustomerorder()))
            && (this.getOrigindepotno() == null ? other.getOrigindepotno() == null : this.getOrigindepotno().equals(other.getOrigindepotno()))
            && (this.getIschange() == null ? other.getIschange() == null : this.getIschange().equals(other.getIschange()))
            && (this.getPeriodaccountcode() == null ? other.getPeriodaccountcode() == null : this.getPeriodaccountcode().equals(other.getPeriodaccountcode()))
            && (this.getWaybillcategory() == null ? other.getWaybillcategory() == null : this.getWaybillcategory().equals(other.getWaybillcategory()))
            && (this.getDelivercode() == null ? other.getDelivercode() == null : this.getDelivercode().equals(other.getDelivercode()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getIsmanualmodify() == null ? other.getIsmanualmodify() == null : this.getIsmanualmodify().equals(other.getIsmanualmodify()))
            && (this.getAccountorderno() == null ? other.getAccountorderno() == null : this.getAccountorderno().equals(other.getAccountorderno()))
            && (this.getPackagecount() == null ? other.getPackagecount() == null : this.getPackagecount().equals(other.getPackagecount()))
            && (this.getSendprovince() == null ? other.getSendprovince() == null : this.getSendprovince().equals(other.getSendprovince()))
            && (this.getSendcity() == null ? other.getSendcity() == null : this.getSendcity().equals(other.getSendcity()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getPayee() == null ? other.getPayee() == null : this.getPayee().equals(other.getPayee()))
            && (this.getTransferoperator() == null ? other.getTransferoperator() == null : this.getTransferoperator().equals(other.getTransferoperator()))
            && (this.getBankcardnumber() == null ? other.getBankcardnumber() == null : this.getBankcardnumber().equals(other.getBankcardnumber()))
            && (this.getBankcardname() == null ? other.getBankcardname() == null : this.getBankcardname().equals(other.getBankcardname()))
            && (this.getActualtransfertime() == null ? other.getActualtransfertime() == null : this.getActualtransfertime().equals(other.getActualtransfertime()))
            && (this.getTransferstate() == null ? other.getTransferstate() == null : this.getTransferstate().equals(other.getTransferstate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getIncomeid() == null) ? 0 : getIncomeid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getWaybillno() == null) ? 0 : getWaybillno().hashCode());
        result = prime * result + ((getWaybilltype() == null) ? 0 : getWaybilltype().hashCode());
        result = prime * result + ((getMerchantid() == null) ? 0 : getMerchantid().hashCode());
        result = prime * result + ((getExpresscompanyid() == null) ? 0 : getExpresscompanyid().hashCode());
        result = prime * result + ((getFinalexpresscompanyid() == null) ? 0 : getFinalexpresscompanyid().hashCode());
        result = prime * result + ((getDeliverstationid() == null) ? 0 : getDeliverstationid().hashCode());
        result = prime * result + ((getTopcodcompanyid() == null) ? 0 : getTopcodcompanyid().hashCode());
        result = prime * result + ((getRfdaccepttime() == null) ? 0 : getRfdaccepttime().hashCode());
        result = prime * result + ((getDelivertime() == null) ? 0 : getDelivertime().hashCode());
        result = prime * result + ((getReturntime() == null) ? 0 : getReturntime().hashCode());
        result = prime * result + ((getReturnexpresscompanyid() == null) ? 0 : getReturnexpresscompanyid().hashCode());
        result = prime * result + ((getBackstationtime() == null) ? 0 : getBackstationtime().hashCode());
        result = prime * result + ((getBackstationstatus() == null) ? 0 : getBackstationstatus().hashCode());
        result = prime * result + ((getProtectedamount() == null) ? 0 : getProtectedamount().hashCode());
        result = prime * result + ((getTotalamount() == null) ? 0 : getTotalamount().hashCode());
        result = prime * result + ((getPaidamount() == null) ? 0 : getPaidamount().hashCode());
        result = prime * result + ((getNeedpayamount() == null) ? 0 : getNeedpayamount().hashCode());
        result = prime * result + ((getBackamount() == null) ? 0 : getBackamount().hashCode());
        result = prime * result + ((getNeedbackamount() == null) ? 0 : getNeedbackamount().hashCode());
        result = prime * result + ((getAccountweight() == null) ? 0 : getAccountweight().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getReceiveaddress() == null) ? 0 : getReceiveaddress().hashCode());
        result = prime * result + ((getSigntype() == null) ? 0 : getSigntype().hashCode());
        result = prime * result + ((getInefficacystatus() == null) ? 0 : getInefficacystatus().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getReceivestationid() == null) ? 0 : getReceivestationid().hashCode());
        result = prime * result + ((getReceivedelivermanid() == null) ? 0 : getReceivedelivermanid().hashCode());
        result = prime * result + ((getDistributioncode() == null) ? 0 : getDistributioncode().hashCode());
        result = prime * result + ((getCurrentdistributioncode() == null) ? 0 : getCurrentdistributioncode().hashCode());
        result = prime * result + ((getWaybillinfoweight() == null) ? 0 : getWaybillinfoweight().hashCode());
        result = prime * result + ((getSubstatus() == null) ? 0 : getSubstatus().hashCode());
        result = prime * result + ((getAccepttype() == null) ? 0 : getAccepttype().hashCode());
        result = prime * result + ((getCustomerorder() == null) ? 0 : getCustomerorder().hashCode());
        result = prime * result + ((getOrigindepotno() == null) ? 0 : getOrigindepotno().hashCode());
        result = prime * result + ((getIschange() == null) ? 0 : getIschange().hashCode());
        result = prime * result + ((getPeriodaccountcode() == null) ? 0 : getPeriodaccountcode().hashCode());
        result = prime * result + ((getWaybillcategory() == null) ? 0 : getWaybillcategory().hashCode());
        result = prime * result + ((getDelivercode() == null) ? 0 : getDelivercode().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getIsmanualmodify() == null) ? 0 : getIsmanualmodify().hashCode());
        result = prime * result + ((getAccountorderno() == null) ? 0 : getAccountorderno().hashCode());
        result = prime * result + ((getPackagecount() == null) ? 0 : getPackagecount().hashCode());
        result = prime * result + ((getSendprovince() == null) ? 0 : getSendprovince().hashCode());
        result = prime * result + ((getSendcity() == null) ? 0 : getSendcity().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getPayee() == null) ? 0 : getPayee().hashCode());
        result = prime * result + ((getTransferoperator() == null) ? 0 : getTransferoperator().hashCode());
        result = prime * result + ((getBankcardnumber() == null) ? 0 : getBankcardnumber().hashCode());
        result = prime * result + ((getBankcardname() == null) ? 0 : getBankcardname().hashCode());
        result = prime * result + ((getActualtransfertime() == null) ? 0 : getActualtransfertime().hashCode());
        result = prime * result + ((getTransferstate() == null) ? 0 : getTransferstate().hashCode());
        return result;
    }
}
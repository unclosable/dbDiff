package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.Date;

public class CodBaseInfo {
    private BigDecimal infoid;

    private Date createtime;

    private BigDecimal mediumid;

    private BigDecimal waybillno;

    private BigDecimal merchantid;

    private String waybilltype;

    private BigDecimal flag;

    private BigDecimal deliverstationid;

    private BigDecimal topcodcompanyid;

    private String warehouseid;

    private BigDecimal expresscompanyid;

    private Date rfdaccepttime;

    private Date rfdacceptdate;

    private BigDecimal finalexpresscompanyid;

    private Date delivertime;

    private Date deliverdate;

    private String returnwarehouseid;

    private BigDecimal returnexpresscompanyid;

    private BigDecimal totalamount;

    private BigDecimal paidamount;

    private BigDecimal needpayamount;

    private BigDecimal backamount;

    private BigDecimal needbackamount;

    private BigDecimal accountweight;

    private String areaid;

    private BigDecimal areatype;

    private String boxsno;

    private String address;

    private Date updatetime;

    private BigDecimal isdeleted;

    private Date returntime;

    private Date returndate;

    private BigDecimal isfare;

    private BigDecimal fare;

    private String fareformula;

    private BigDecimal operatetype;

    private BigDecimal protectedprice;

    private String distributioncode;

    private String currentdistributioncode;

    private BigDecimal ischange;

    private BigDecimal comefrom;

    private BigDecimal iscod;

    private String accountorderno;

    private BigDecimal islast;

    private String sendprovince;

    private String sendcity;

    private String province;

    private String city;

    private String area;

    private String country;

    private BigDecimal fareforjava;

    private BigDecimal fareformulaidforjava;

    private BigDecimal areaidforjava;

    private BigDecimal issynfareforjava;

    private BigDecimal backstationstatus;

    private Date backstationtime;

    private String receiveby;

    private String customerorder;

    private String waybillcategory;

    private BigDecimal packagecount;

    private BigDecimal merchantweight;

    private BigDecimal waybillinfoweight;

    private String msgforjava;

    private String merchantcategory;

    private BigDecimal codpoundage;

    public BigDecimal getInfoid() {
        return infoid;
    }

    public void setInfoid(BigDecimal infoid) {
        this.infoid = infoid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public BigDecimal getMediumid() {
        return mediumid;
    }

    public void setMediumid(BigDecimal mediumid) {
        this.mediumid = mediumid;
    }

    public BigDecimal getWaybillno() {
        return waybillno;
    }

    public void setWaybillno(BigDecimal waybillno) {
        this.waybillno = waybillno;
    }

    public BigDecimal getMerchantid() {
        return merchantid;
    }

    public void setMerchantid(BigDecimal merchantid) {
        this.merchantid = merchantid;
    }

    public String getWaybilltype() {
        return waybilltype;
    }

    public void setWaybilltype(String waybilltype) {
        this.waybilltype = waybilltype == null ? null : waybilltype.trim();
    }

    public BigDecimal getFlag() {
        return flag;
    }

    public void setFlag(BigDecimal flag) {
        this.flag = flag;
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

    public String getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(String warehouseid) {
        this.warehouseid = warehouseid == null ? null : warehouseid.trim();
    }

    public BigDecimal getExpresscompanyid() {
        return expresscompanyid;
    }

    public void setExpresscompanyid(BigDecimal expresscompanyid) {
        this.expresscompanyid = expresscompanyid;
    }

    public Date getRfdaccepttime() {
        return rfdaccepttime;
    }

    public void setRfdaccepttime(Date rfdaccepttime) {
        this.rfdaccepttime = rfdaccepttime;
    }

    public Date getRfdacceptdate() {
        return rfdacceptdate;
    }

    public void setRfdacceptdate(Date rfdacceptdate) {
        this.rfdacceptdate = rfdacceptdate;
    }

    public BigDecimal getFinalexpresscompanyid() {
        return finalexpresscompanyid;
    }

    public void setFinalexpresscompanyid(BigDecimal finalexpresscompanyid) {
        this.finalexpresscompanyid = finalexpresscompanyid;
    }

    public Date getDelivertime() {
        return delivertime;
    }

    public void setDelivertime(Date delivertime) {
        this.delivertime = delivertime;
    }

    public Date getDeliverdate() {
        return deliverdate;
    }

    public void setDeliverdate(Date deliverdate) {
        this.deliverdate = deliverdate;
    }

    public String getReturnwarehouseid() {
        return returnwarehouseid;
    }

    public void setReturnwarehouseid(String returnwarehouseid) {
        this.returnwarehouseid = returnwarehouseid == null ? null : returnwarehouseid.trim();
    }

    public BigDecimal getReturnexpresscompanyid() {
        return returnexpresscompanyid;
    }

    public void setReturnexpresscompanyid(BigDecimal returnexpresscompanyid) {
        this.returnexpresscompanyid = returnexpresscompanyid;
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

    public BigDecimal getAreatype() {
        return areatype;
    }

    public void setAreatype(BigDecimal areatype) {
        this.areatype = areatype;
    }

    public String getBoxsno() {
        return boxsno;
    }

    public void setBoxsno(String boxsno) {
        this.boxsno = boxsno == null ? null : boxsno.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public BigDecimal getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(BigDecimal isdeleted) {
        this.isdeleted = isdeleted;
    }

    public Date getReturntime() {
        return returntime;
    }

    public void setReturntime(Date returntime) {
        this.returntime = returntime;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public BigDecimal getIsfare() {
        return isfare;
    }

    public void setIsfare(BigDecimal isfare) {
        this.isfare = isfare;
    }

    public BigDecimal getFare() {
        return fare;
    }

    public void setFare(BigDecimal fare) {
        this.fare = fare;
    }

    public String getFareformula() {
        return fareformula;
    }

    public void setFareformula(String fareformula) {
        this.fareformula = fareformula == null ? null : fareformula.trim();
    }

    public BigDecimal getOperatetype() {
        return operatetype;
    }

    public void setOperatetype(BigDecimal operatetype) {
        this.operatetype = operatetype;
    }

    public BigDecimal getProtectedprice() {
        return protectedprice;
    }

    public void setProtectedprice(BigDecimal protectedprice) {
        this.protectedprice = protectedprice;
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

    public BigDecimal getIschange() {
        return ischange;
    }

    public void setIschange(BigDecimal ischange) {
        this.ischange = ischange;
    }

    public BigDecimal getComefrom() {
        return comefrom;
    }

    public void setComefrom(BigDecimal comefrom) {
        this.comefrom = comefrom;
    }

    public BigDecimal getIscod() {
        return iscod;
    }

    public void setIscod(BigDecimal iscod) {
        this.iscod = iscod;
    }

    public String getAccountorderno() {
        return accountorderno;
    }

    public void setAccountorderno(String accountorderno) {
        this.accountorderno = accountorderno == null ? null : accountorderno.trim();
    }

    public BigDecimal getIslast() {
        return islast;
    }

    public void setIslast(BigDecimal islast) {
        this.islast = islast;
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

    public BigDecimal getFareforjava() {
        return fareforjava;
    }

    public void setFareforjava(BigDecimal fareforjava) {
        this.fareforjava = fareforjava;
    }

    public BigDecimal getFareformulaidforjava() {
        return fareformulaidforjava;
    }

    public void setFareformulaidforjava(BigDecimal fareformulaidforjava) {
        this.fareformulaidforjava = fareformulaidforjava;
    }

    public BigDecimal getAreaidforjava() {
        return areaidforjava;
    }

    public void setAreaidforjava(BigDecimal areaidforjava) {
        this.areaidforjava = areaidforjava;
    }

    public BigDecimal getIssynfareforjava() {
        return issynfareforjava;
    }

    public void setIssynfareforjava(BigDecimal issynfareforjava) {
        this.issynfareforjava = issynfareforjava;
    }

    public BigDecimal getBackstationstatus() {
        return backstationstatus;
    }

    public void setBackstationstatus(BigDecimal backstationstatus) {
        this.backstationstatus = backstationstatus;
    }

    public Date getBackstationtime() {
        return backstationtime;
    }

    public void setBackstationtime(Date backstationtime) {
        this.backstationtime = backstationtime;
    }

    public String getReceiveby() {
        return receiveby;
    }

    public void setReceiveby(String receiveby) {
        this.receiveby = receiveby == null ? null : receiveby.trim();
    }

    public String getCustomerorder() {
        return customerorder;
    }

    public void setCustomerorder(String customerorder) {
        this.customerorder = customerorder == null ? null : customerorder.trim();
    }

    public String getWaybillcategory() {
        return waybillcategory;
    }

    public void setWaybillcategory(String waybillcategory) {
        this.waybillcategory = waybillcategory == null ? null : waybillcategory.trim();
    }

    public BigDecimal getPackagecount() {
        return packagecount;
    }

    public void setPackagecount(BigDecimal packagecount) {
        this.packagecount = packagecount;
    }

    public BigDecimal getMerchantweight() {
        return merchantweight;
    }

    public void setMerchantweight(BigDecimal merchantweight) {
        this.merchantweight = merchantweight;
    }

    public BigDecimal getWaybillinfoweight() {
        return waybillinfoweight;
    }

    public void setWaybillinfoweight(BigDecimal waybillinfoweight) {
        this.waybillinfoweight = waybillinfoweight;
    }

    public String getMsgforjava() {
        return msgforjava;
    }

    public void setMsgforjava(String msgforjava) {
        this.msgforjava = msgforjava == null ? null : msgforjava.trim();
    }

    public String getMerchantcategory() {
        return merchantcategory;
    }

    public void setMerchantcategory(String merchantcategory) {
        this.merchantcategory = merchantcategory == null ? null : merchantcategory.trim();
    }

    public BigDecimal getCodpoundage() {
        return codpoundage;
    }

    public void setCodpoundage(BigDecimal codpoundage) {
        this.codpoundage = codpoundage;
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
        CodBaseInfo other = (CodBaseInfo) that;
        return (this.getInfoid() == null ? other.getInfoid() == null : this.getInfoid().equals(other.getInfoid()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getMediumid() == null ? other.getMediumid() == null : this.getMediumid().equals(other.getMediumid()))
            && (this.getWaybillno() == null ? other.getWaybillno() == null : this.getWaybillno().equals(other.getWaybillno()))
            && (this.getMerchantid() == null ? other.getMerchantid() == null : this.getMerchantid().equals(other.getMerchantid()))
            && (this.getWaybilltype() == null ? other.getWaybilltype() == null : this.getWaybilltype().equals(other.getWaybilltype()))
            && (this.getFlag() == null ? other.getFlag() == null : this.getFlag().equals(other.getFlag()))
            && (this.getDeliverstationid() == null ? other.getDeliverstationid() == null : this.getDeliverstationid().equals(other.getDeliverstationid()))
            && (this.getTopcodcompanyid() == null ? other.getTopcodcompanyid() == null : this.getTopcodcompanyid().equals(other.getTopcodcompanyid()))
            && (this.getWarehouseid() == null ? other.getWarehouseid() == null : this.getWarehouseid().equals(other.getWarehouseid()))
            && (this.getExpresscompanyid() == null ? other.getExpresscompanyid() == null : this.getExpresscompanyid().equals(other.getExpresscompanyid()))
            && (this.getRfdaccepttime() == null ? other.getRfdaccepttime() == null : this.getRfdaccepttime().equals(other.getRfdaccepttime()))
            && (this.getRfdacceptdate() == null ? other.getRfdacceptdate() == null : this.getRfdacceptdate().equals(other.getRfdacceptdate()))
            && (this.getFinalexpresscompanyid() == null ? other.getFinalexpresscompanyid() == null : this.getFinalexpresscompanyid().equals(other.getFinalexpresscompanyid()))
            && (this.getDelivertime() == null ? other.getDelivertime() == null : this.getDelivertime().equals(other.getDelivertime()))
            && (this.getDeliverdate() == null ? other.getDeliverdate() == null : this.getDeliverdate().equals(other.getDeliverdate()))
            && (this.getReturnwarehouseid() == null ? other.getReturnwarehouseid() == null : this.getReturnwarehouseid().equals(other.getReturnwarehouseid()))
            && (this.getReturnexpresscompanyid() == null ? other.getReturnexpresscompanyid() == null : this.getReturnexpresscompanyid().equals(other.getReturnexpresscompanyid()))
            && (this.getTotalamount() == null ? other.getTotalamount() == null : this.getTotalamount().equals(other.getTotalamount()))
            && (this.getPaidamount() == null ? other.getPaidamount() == null : this.getPaidamount().equals(other.getPaidamount()))
            && (this.getNeedpayamount() == null ? other.getNeedpayamount() == null : this.getNeedpayamount().equals(other.getNeedpayamount()))
            && (this.getBackamount() == null ? other.getBackamount() == null : this.getBackamount().equals(other.getBackamount()))
            && (this.getNeedbackamount() == null ? other.getNeedbackamount() == null : this.getNeedbackamount().equals(other.getNeedbackamount()))
            && (this.getAccountweight() == null ? other.getAccountweight() == null : this.getAccountweight().equals(other.getAccountweight()))
            && (this.getAreaid() == null ? other.getAreaid() == null : this.getAreaid().equals(other.getAreaid()))
            && (this.getAreatype() == null ? other.getAreatype() == null : this.getAreatype().equals(other.getAreatype()))
            && (this.getBoxsno() == null ? other.getBoxsno() == null : this.getBoxsno().equals(other.getBoxsno()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getReturntime() == null ? other.getReturntime() == null : this.getReturntime().equals(other.getReturntime()))
            && (this.getReturndate() == null ? other.getReturndate() == null : this.getReturndate().equals(other.getReturndate()))
            && (this.getIsfare() == null ? other.getIsfare() == null : this.getIsfare().equals(other.getIsfare()))
            && (this.getFare() == null ? other.getFare() == null : this.getFare().equals(other.getFare()))
            && (this.getFareformula() == null ? other.getFareformula() == null : this.getFareformula().equals(other.getFareformula()))
            && (this.getOperatetype() == null ? other.getOperatetype() == null : this.getOperatetype().equals(other.getOperatetype()))
            && (this.getProtectedprice() == null ? other.getProtectedprice() == null : this.getProtectedprice().equals(other.getProtectedprice()))
            && (this.getDistributioncode() == null ? other.getDistributioncode() == null : this.getDistributioncode().equals(other.getDistributioncode()))
            && (this.getCurrentdistributioncode() == null ? other.getCurrentdistributioncode() == null : this.getCurrentdistributioncode().equals(other.getCurrentdistributioncode()))
            && (this.getIschange() == null ? other.getIschange() == null : this.getIschange().equals(other.getIschange()))
            && (this.getComefrom() == null ? other.getComefrom() == null : this.getComefrom().equals(other.getComefrom()))
            && (this.getIscod() == null ? other.getIscod() == null : this.getIscod().equals(other.getIscod()))
            && (this.getAccountorderno() == null ? other.getAccountorderno() == null : this.getAccountorderno().equals(other.getAccountorderno()))
            && (this.getIslast() == null ? other.getIslast() == null : this.getIslast().equals(other.getIslast()))
            && (this.getSendprovince() == null ? other.getSendprovince() == null : this.getSendprovince().equals(other.getSendprovince()))
            && (this.getSendcity() == null ? other.getSendcity() == null : this.getSendcity().equals(other.getSendcity()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getArea() == null ? other.getArea() == null : this.getArea().equals(other.getArea()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getFareforjava() == null ? other.getFareforjava() == null : this.getFareforjava().equals(other.getFareforjava()))
            && (this.getFareformulaidforjava() == null ? other.getFareformulaidforjava() == null : this.getFareformulaidforjava().equals(other.getFareformulaidforjava()))
            && (this.getAreaidforjava() == null ? other.getAreaidforjava() == null : this.getAreaidforjava().equals(other.getAreaidforjava()))
            && (this.getIssynfareforjava() == null ? other.getIssynfareforjava() == null : this.getIssynfareforjava().equals(other.getIssynfareforjava()))
            && (this.getBackstationstatus() == null ? other.getBackstationstatus() == null : this.getBackstationstatus().equals(other.getBackstationstatus()))
            && (this.getBackstationtime() == null ? other.getBackstationtime() == null : this.getBackstationtime().equals(other.getBackstationtime()))
            && (this.getReceiveby() == null ? other.getReceiveby() == null : this.getReceiveby().equals(other.getReceiveby()))
            && (this.getCustomerorder() == null ? other.getCustomerorder() == null : this.getCustomerorder().equals(other.getCustomerorder()))
            && (this.getWaybillcategory() == null ? other.getWaybillcategory() == null : this.getWaybillcategory().equals(other.getWaybillcategory()))
            && (this.getPackagecount() == null ? other.getPackagecount() == null : this.getPackagecount().equals(other.getPackagecount()))
            && (this.getMerchantweight() == null ? other.getMerchantweight() == null : this.getMerchantweight().equals(other.getMerchantweight()))
            && (this.getWaybillinfoweight() == null ? other.getWaybillinfoweight() == null : this.getWaybillinfoweight().equals(other.getWaybillinfoweight()))
            && (this.getMsgforjava() == null ? other.getMsgforjava() == null : this.getMsgforjava().equals(other.getMsgforjava()))
            && (this.getMerchantcategory() == null ? other.getMerchantcategory() == null : this.getMerchantcategory().equals(other.getMerchantcategory()))
            && (this.getCodpoundage() == null ? other.getCodpoundage() == null : this.getCodpoundage().equals(other.getCodpoundage()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getInfoid() == null) ? 0 : getInfoid().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getMediumid() == null) ? 0 : getMediumid().hashCode());
        result = prime * result + ((getWaybillno() == null) ? 0 : getWaybillno().hashCode());
        result = prime * result + ((getMerchantid() == null) ? 0 : getMerchantid().hashCode());
        result = prime * result + ((getWaybilltype() == null) ? 0 : getWaybilltype().hashCode());
        result = prime * result + ((getFlag() == null) ? 0 : getFlag().hashCode());
        result = prime * result + ((getDeliverstationid() == null) ? 0 : getDeliverstationid().hashCode());
        result = prime * result + ((getTopcodcompanyid() == null) ? 0 : getTopcodcompanyid().hashCode());
        result = prime * result + ((getWarehouseid() == null) ? 0 : getWarehouseid().hashCode());
        result = prime * result + ((getExpresscompanyid() == null) ? 0 : getExpresscompanyid().hashCode());
        result = prime * result + ((getRfdaccepttime() == null) ? 0 : getRfdaccepttime().hashCode());
        result = prime * result + ((getRfdacceptdate() == null) ? 0 : getRfdacceptdate().hashCode());
        result = prime * result + ((getFinalexpresscompanyid() == null) ? 0 : getFinalexpresscompanyid().hashCode());
        result = prime * result + ((getDelivertime() == null) ? 0 : getDelivertime().hashCode());
        result = prime * result + ((getDeliverdate() == null) ? 0 : getDeliverdate().hashCode());
        result = prime * result + ((getReturnwarehouseid() == null) ? 0 : getReturnwarehouseid().hashCode());
        result = prime * result + ((getReturnexpresscompanyid() == null) ? 0 : getReturnexpresscompanyid().hashCode());
        result = prime * result + ((getTotalamount() == null) ? 0 : getTotalamount().hashCode());
        result = prime * result + ((getPaidamount() == null) ? 0 : getPaidamount().hashCode());
        result = prime * result + ((getNeedpayamount() == null) ? 0 : getNeedpayamount().hashCode());
        result = prime * result + ((getBackamount() == null) ? 0 : getBackamount().hashCode());
        result = prime * result + ((getNeedbackamount() == null) ? 0 : getNeedbackamount().hashCode());
        result = prime * result + ((getAccountweight() == null) ? 0 : getAccountweight().hashCode());
        result = prime * result + ((getAreaid() == null) ? 0 : getAreaid().hashCode());
        result = prime * result + ((getAreatype() == null) ? 0 : getAreatype().hashCode());
        result = prime * result + ((getBoxsno() == null) ? 0 : getBoxsno().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getReturntime() == null) ? 0 : getReturntime().hashCode());
        result = prime * result + ((getReturndate() == null) ? 0 : getReturndate().hashCode());
        result = prime * result + ((getIsfare() == null) ? 0 : getIsfare().hashCode());
        result = prime * result + ((getFare() == null) ? 0 : getFare().hashCode());
        result = prime * result + ((getFareformula() == null) ? 0 : getFareformula().hashCode());
        result = prime * result + ((getOperatetype() == null) ? 0 : getOperatetype().hashCode());
        result = prime * result + ((getProtectedprice() == null) ? 0 : getProtectedprice().hashCode());
        result = prime * result + ((getDistributioncode() == null) ? 0 : getDistributioncode().hashCode());
        result = prime * result + ((getCurrentdistributioncode() == null) ? 0 : getCurrentdistributioncode().hashCode());
        result = prime * result + ((getIschange() == null) ? 0 : getIschange().hashCode());
        result = prime * result + ((getComefrom() == null) ? 0 : getComefrom().hashCode());
        result = prime * result + ((getIscod() == null) ? 0 : getIscod().hashCode());
        result = prime * result + ((getAccountorderno() == null) ? 0 : getAccountorderno().hashCode());
        result = prime * result + ((getIslast() == null) ? 0 : getIslast().hashCode());
        result = prime * result + ((getSendprovince() == null) ? 0 : getSendprovince().hashCode());
        result = prime * result + ((getSendcity() == null) ? 0 : getSendcity().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getArea() == null) ? 0 : getArea().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getFareforjava() == null) ? 0 : getFareforjava().hashCode());
        result = prime * result + ((getFareformulaidforjava() == null) ? 0 : getFareformulaidforjava().hashCode());
        result = prime * result + ((getAreaidforjava() == null) ? 0 : getAreaidforjava().hashCode());
        result = prime * result + ((getIssynfareforjava() == null) ? 0 : getIssynfareforjava().hashCode());
        result = prime * result + ((getBackstationstatus() == null) ? 0 : getBackstationstatus().hashCode());
        result = prime * result + ((getBackstationtime() == null) ? 0 : getBackstationtime().hashCode());
        result = prime * result + ((getReceiveby() == null) ? 0 : getReceiveby().hashCode());
        result = prime * result + ((getCustomerorder() == null) ? 0 : getCustomerorder().hashCode());
        result = prime * result + ((getWaybillcategory() == null) ? 0 : getWaybillcategory().hashCode());
        result = prime * result + ((getPackagecount() == null) ? 0 : getPackagecount().hashCode());
        result = prime * result + ((getMerchantweight() == null) ? 0 : getMerchantweight().hashCode());
        result = prime * result + ((getWaybillinfoweight() == null) ? 0 : getWaybillinfoweight().hashCode());
        result = prime * result + ((getMsgforjava() == null) ? 0 : getMsgforjava().hashCode());
        result = prime * result + ((getMerchantcategory() == null) ? 0 : getMerchantcategory().hashCode());
        result = prime * result + ((getCodpoundage() == null) ? 0 : getCodpoundage().hashCode());
        return result;
    }
}
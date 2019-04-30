package com.itiaoling.dbdiff.models;

import java.math.BigDecimal;
import java.util.Date;

public class OrderComplexQuery {
    private BigDecimal waybillno;

    private String distributioncode;

    private Date createtime;

    private String formcode;

    private String delivercode;

    private BigDecimal sortingcenterid;

    private BigDecimal curdeptid;

    private BigDecimal status;

    private BigDecimal backstatus;

    private String replacetype;

    private BigDecimal marchartid;

    private String merchanthousecode;

    private String toprovince;

    private String tocity;

    private String toarea;

    private String toaddress;

    private BigDecimal expresscompanyid;

    private BigDecimal delivermanid;

    private BigDecimal merchantweight;

    private BigDecimal weight;

    private BigDecimal financialweight;

    private BigDecimal volumetricweight;

    private BigDecimal needfund;

    private BigDecimal backfund;

    private BigDecimal protectedprice;

    private String reason;

    private Date receivedate;

    private Date assigntime;

    private Date lastinboundtime;

    private Date lastinboxtime;

    private Date lastoutboundtime;

    private Date pickupintostationtime;

    private Date pickupoutstationtime;

    private Date deliveryintostationtime;

    private Date deliveryoutstationtime;

    private Date deliverybackstationtime;

    private Date reuturninstationtime;

    private Date reuturnoutstationtime;

    private Date reuturninboundtime;

    private Date reuturnoutboundtime;

    private Date merchantconfimtime;

    private Date updatetime;

    private String performcode;

    private String expresswaybillno;

    private String goodsproperty;

    private String goodscategory;

    private String fromprovince;

    private String fromcity;

    private String fromarea;

    private String fromaddress;

    private String pickupdistributioncode;

    private BigDecimal pickupexpresscompanyid;

    private BigDecimal pickupmanid;

    private BigDecimal deliveryfeetype;

    private BigDecimal deliveryfee;

    private BigDecimal protectfee;

    private String additionalservice;

    private BigDecimal additionalfee;

    private BigDecimal factorage;

    private BigDecimal totalfee;

    private String goodstype;

    private BigDecimal goodsnum;

    private String fetchorderno;

    private Date fetchcreatetime;

    private String customerlevel;

    private String ordercomment;

    private BigDecimal createby;

    private BigDecimal updateby;

    private BigDecimal isdeleted;

    private BigDecimal businesstype;

    private String addressee;

    private String mobilephone;

    private String username;

    private String email;

    private String receivetel;

    private String currentdistributioncode;

    private String fromdistributioncode;

    private String sendphone;

    private String sendtelephone;

    private String sendname;

    private String accepttype;

    private BigDecimal signtype;

    private String signcustomer;

    private BigDecimal assignstatus;

    private String reasonremark;

    private String reasondescription;

    private BigDecimal issynuser;

    private BigDecimal boxcount;

    private String expressorderpaymenttype;

    private BigDecimal querystatus;

    private BigDecimal subtype;

    private String poscode;

    private BigDecimal expressorderaccounttype;

    private Date distributionreceivedtime;

    private BigDecimal realmerchantid;

    private BigDecimal returnsortingcenterid;

    private String boxno;

    private String maincode;

    private Date deliverydate;

    private String payreasoncode;

    private BigDecimal lastsortingcenterid;

    private Date loadingtime;

    private Date unloadingtime;

    private Date pickupgoodstime;

    private String bankcardnumber;

    private String bankcardname;

    private String country;

    private BigDecimal goodspayment;

    private String orderrealsource;

    private Date realbackstationtime;

    private BigDecimal issendhuodongsms;

    private Date sendhuodongsmsdate;

    private String digitalsignatureurl;

    private String totownship;

    private String fromtownship;

    private BigDecimal firstinstorestationid;

    private Date firstinstoretime;

    private Date firstoutstoretime;

    private BigDecimal subabnormal;

    private BigDecimal expressservicefee;

    private String pickupcar;

    public BigDecimal getWaybillno() {
        return waybillno;
    }

    public void setWaybillno(BigDecimal waybillno) {
        this.waybillno = waybillno;
    }

    public String getDistributioncode() {
        return distributioncode;
    }

    public void setDistributioncode(String distributioncode) {
        this.distributioncode = distributioncode == null ? null : distributioncode.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getFormcode() {
        return formcode;
    }

    public void setFormcode(String formcode) {
        this.formcode = formcode == null ? null : formcode.trim();
    }

    public String getDelivercode() {
        return delivercode;
    }

    public void setDelivercode(String delivercode) {
        this.delivercode = delivercode == null ? null : delivercode.trim();
    }

    public BigDecimal getSortingcenterid() {
        return sortingcenterid;
    }

    public void setSortingcenterid(BigDecimal sortingcenterid) {
        this.sortingcenterid = sortingcenterid;
    }

    public BigDecimal getCurdeptid() {
        return curdeptid;
    }

    public void setCurdeptid(BigDecimal curdeptid) {
        this.curdeptid = curdeptid;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public BigDecimal getBackstatus() {
        return backstatus;
    }

    public void setBackstatus(BigDecimal backstatus) {
        this.backstatus = backstatus;
    }

    public String getReplacetype() {
        return replacetype;
    }

    public void setReplacetype(String replacetype) {
        this.replacetype = replacetype == null ? null : replacetype.trim();
    }

    public BigDecimal getMarchartid() {
        return marchartid;
    }

    public void setMarchartid(BigDecimal marchartid) {
        this.marchartid = marchartid;
    }

    public String getMerchanthousecode() {
        return merchanthousecode;
    }

    public void setMerchanthousecode(String merchanthousecode) {
        this.merchanthousecode = merchanthousecode == null ? null : merchanthousecode.trim();
    }

    public String getToprovince() {
        return toprovince;
    }

    public void setToprovince(String toprovince) {
        this.toprovince = toprovince == null ? null : toprovince.trim();
    }

    public String getTocity() {
        return tocity;
    }

    public void setTocity(String tocity) {
        this.tocity = tocity == null ? null : tocity.trim();
    }

    public String getToarea() {
        return toarea;
    }

    public void setToarea(String toarea) {
        this.toarea = toarea == null ? null : toarea.trim();
    }

    public String getToaddress() {
        return toaddress;
    }

    public void setToaddress(String toaddress) {
        this.toaddress = toaddress == null ? null : toaddress.trim();
    }

    public BigDecimal getExpresscompanyid() {
        return expresscompanyid;
    }

    public void setExpresscompanyid(BigDecimal expresscompanyid) {
        this.expresscompanyid = expresscompanyid;
    }

    public BigDecimal getDelivermanid() {
        return delivermanid;
    }

    public void setDelivermanid(BigDecimal delivermanid) {
        this.delivermanid = delivermanid;
    }

    public BigDecimal getMerchantweight() {
        return merchantweight;
    }

    public void setMerchantweight(BigDecimal merchantweight) {
        this.merchantweight = merchantweight;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getFinancialweight() {
        return financialweight;
    }

    public void setFinancialweight(BigDecimal financialweight) {
        this.financialweight = financialweight;
    }

    public BigDecimal getVolumetricweight() {
        return volumetricweight;
    }

    public void setVolumetricweight(BigDecimal volumetricweight) {
        this.volumetricweight = volumetricweight;
    }

    public BigDecimal getNeedfund() {
        return needfund;
    }

    public void setNeedfund(BigDecimal needfund) {
        this.needfund = needfund;
    }

    public BigDecimal getBackfund() {
        return backfund;
    }

    public void setBackfund(BigDecimal backfund) {
        this.backfund = backfund;
    }

    public BigDecimal getProtectedprice() {
        return protectedprice;
    }

    public void setProtectedprice(BigDecimal protectedprice) {
        this.protectedprice = protectedprice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getReceivedate() {
        return receivedate;
    }

    public void setReceivedate(Date receivedate) {
        this.receivedate = receivedate;
    }

    public Date getAssigntime() {
        return assigntime;
    }

    public void setAssigntime(Date assigntime) {
        this.assigntime = assigntime;
    }

    public Date getLastinboundtime() {
        return lastinboundtime;
    }

    public void setLastinboundtime(Date lastinboundtime) {
        this.lastinboundtime = lastinboundtime;
    }

    public Date getLastinboxtime() {
        return lastinboxtime;
    }

    public void setLastinboxtime(Date lastinboxtime) {
        this.lastinboxtime = lastinboxtime;
    }

    public Date getLastoutboundtime() {
        return lastoutboundtime;
    }

    public void setLastoutboundtime(Date lastoutboundtime) {
        this.lastoutboundtime = lastoutboundtime;
    }

    public Date getPickupintostationtime() {
        return pickupintostationtime;
    }

    public void setPickupintostationtime(Date pickupintostationtime) {
        this.pickupintostationtime = pickupintostationtime;
    }

    public Date getPickupoutstationtime() {
        return pickupoutstationtime;
    }

    public void setPickupoutstationtime(Date pickupoutstationtime) {
        this.pickupoutstationtime = pickupoutstationtime;
    }

    public Date getDeliveryintostationtime() {
        return deliveryintostationtime;
    }

    public void setDeliveryintostationtime(Date deliveryintostationtime) {
        this.deliveryintostationtime = deliveryintostationtime;
    }

    public Date getDeliveryoutstationtime() {
        return deliveryoutstationtime;
    }

    public void setDeliveryoutstationtime(Date deliveryoutstationtime) {
        this.deliveryoutstationtime = deliveryoutstationtime;
    }

    public Date getDeliverybackstationtime() {
        return deliverybackstationtime;
    }

    public void setDeliverybackstationtime(Date deliverybackstationtime) {
        this.deliverybackstationtime = deliverybackstationtime;
    }

    public Date getReuturninstationtime() {
        return reuturninstationtime;
    }

    public void setReuturninstationtime(Date reuturninstationtime) {
        this.reuturninstationtime = reuturninstationtime;
    }

    public Date getReuturnoutstationtime() {
        return reuturnoutstationtime;
    }

    public void setReuturnoutstationtime(Date reuturnoutstationtime) {
        this.reuturnoutstationtime = reuturnoutstationtime;
    }

    public Date getReuturninboundtime() {
        return reuturninboundtime;
    }

    public void setReuturninboundtime(Date reuturninboundtime) {
        this.reuturninboundtime = reuturninboundtime;
    }

    public Date getReuturnoutboundtime() {
        return reuturnoutboundtime;
    }

    public void setReuturnoutboundtime(Date reuturnoutboundtime) {
        this.reuturnoutboundtime = reuturnoutboundtime;
    }

    public Date getMerchantconfimtime() {
        return merchantconfimtime;
    }

    public void setMerchantconfimtime(Date merchantconfimtime) {
        this.merchantconfimtime = merchantconfimtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getPerformcode() {
        return performcode;
    }

    public void setPerformcode(String performcode) {
        this.performcode = performcode == null ? null : performcode.trim();
    }

    public String getExpresswaybillno() {
        return expresswaybillno;
    }

    public void setExpresswaybillno(String expresswaybillno) {
        this.expresswaybillno = expresswaybillno == null ? null : expresswaybillno.trim();
    }

    public String getGoodsproperty() {
        return goodsproperty;
    }

    public void setGoodsproperty(String goodsproperty) {
        this.goodsproperty = goodsproperty == null ? null : goodsproperty.trim();
    }

    public String getGoodscategory() {
        return goodscategory;
    }

    public void setGoodscategory(String goodscategory) {
        this.goodscategory = goodscategory == null ? null : goodscategory.trim();
    }

    public String getFromprovince() {
        return fromprovince;
    }

    public void setFromprovince(String fromprovince) {
        this.fromprovince = fromprovince == null ? null : fromprovince.trim();
    }

    public String getFromcity() {
        return fromcity;
    }

    public void setFromcity(String fromcity) {
        this.fromcity = fromcity == null ? null : fromcity.trim();
    }

    public String getFromarea() {
        return fromarea;
    }

    public void setFromarea(String fromarea) {
        this.fromarea = fromarea == null ? null : fromarea.trim();
    }

    public String getFromaddress() {
        return fromaddress;
    }

    public void setFromaddress(String fromaddress) {
        this.fromaddress = fromaddress == null ? null : fromaddress.trim();
    }

    public String getPickupdistributioncode() {
        return pickupdistributioncode;
    }

    public void setPickupdistributioncode(String pickupdistributioncode) {
        this.pickupdistributioncode = pickupdistributioncode == null ? null : pickupdistributioncode.trim();
    }

    public BigDecimal getPickupexpresscompanyid() {
        return pickupexpresscompanyid;
    }

    public void setPickupexpresscompanyid(BigDecimal pickupexpresscompanyid) {
        this.pickupexpresscompanyid = pickupexpresscompanyid;
    }

    public BigDecimal getPickupmanid() {
        return pickupmanid;
    }

    public void setPickupmanid(BigDecimal pickupmanid) {
        this.pickupmanid = pickupmanid;
    }

    public BigDecimal getDeliveryfeetype() {
        return deliveryfeetype;
    }

    public void setDeliveryfeetype(BigDecimal deliveryfeetype) {
        this.deliveryfeetype = deliveryfeetype;
    }

    public BigDecimal getDeliveryfee() {
        return deliveryfee;
    }

    public void setDeliveryfee(BigDecimal deliveryfee) {
        this.deliveryfee = deliveryfee;
    }

    public BigDecimal getProtectfee() {
        return protectfee;
    }

    public void setProtectfee(BigDecimal protectfee) {
        this.protectfee = protectfee;
    }

    public String getAdditionalservice() {
        return additionalservice;
    }

    public void setAdditionalservice(String additionalservice) {
        this.additionalservice = additionalservice == null ? null : additionalservice.trim();
    }

    public BigDecimal getAdditionalfee() {
        return additionalfee;
    }

    public void setAdditionalfee(BigDecimal additionalfee) {
        this.additionalfee = additionalfee;
    }

    public BigDecimal getFactorage() {
        return factorage;
    }

    public void setFactorage(BigDecimal factorage) {
        this.factorage = factorage;
    }

    public BigDecimal getTotalfee() {
        return totalfee;
    }

    public void setTotalfee(BigDecimal totalfee) {
        this.totalfee = totalfee;
    }

    public String getGoodstype() {
        return goodstype;
    }

    public void setGoodstype(String goodstype) {
        this.goodstype = goodstype == null ? null : goodstype.trim();
    }

    public BigDecimal getGoodsnum() {
        return goodsnum;
    }

    public void setGoodsnum(BigDecimal goodsnum) {
        this.goodsnum = goodsnum;
    }

    public String getFetchorderno() {
        return fetchorderno;
    }

    public void setFetchorderno(String fetchorderno) {
        this.fetchorderno = fetchorderno == null ? null : fetchorderno.trim();
    }

    public Date getFetchcreatetime() {
        return fetchcreatetime;
    }

    public void setFetchcreatetime(Date fetchcreatetime) {
        this.fetchcreatetime = fetchcreatetime;
    }

    public String getCustomerlevel() {
        return customerlevel;
    }

    public void setCustomerlevel(String customerlevel) {
        this.customerlevel = customerlevel == null ? null : customerlevel.trim();
    }

    public String getOrdercomment() {
        return ordercomment;
    }

    public void setOrdercomment(String ordercomment) {
        this.ordercomment = ordercomment == null ? null : ordercomment.trim();
    }

    public BigDecimal getCreateby() {
        return createby;
    }

    public void setCreateby(BigDecimal createby) {
        this.createby = createby;
    }

    public BigDecimal getUpdateby() {
        return updateby;
    }

    public void setUpdateby(BigDecimal updateby) {
        this.updateby = updateby;
    }

    public BigDecimal getIsdeleted() {
        return isdeleted;
    }

    public void setIsdeleted(BigDecimal isdeleted) {
        this.isdeleted = isdeleted;
    }

    public BigDecimal getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(BigDecimal businesstype) {
        this.businesstype = businesstype;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee == null ? null : addressee.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getReceivetel() {
        return receivetel;
    }

    public void setReceivetel(String receivetel) {
        this.receivetel = receivetel == null ? null : receivetel.trim();
    }

    public String getCurrentdistributioncode() {
        return currentdistributioncode;
    }

    public void setCurrentdistributioncode(String currentdistributioncode) {
        this.currentdistributioncode = currentdistributioncode == null ? null : currentdistributioncode.trim();
    }

    public String getFromdistributioncode() {
        return fromdistributioncode;
    }

    public void setFromdistributioncode(String fromdistributioncode) {
        this.fromdistributioncode = fromdistributioncode == null ? null : fromdistributioncode.trim();
    }

    public String getSendphone() {
        return sendphone;
    }

    public void setSendphone(String sendphone) {
        this.sendphone = sendphone == null ? null : sendphone.trim();
    }

    public String getSendtelephone() {
        return sendtelephone;
    }

    public void setSendtelephone(String sendtelephone) {
        this.sendtelephone = sendtelephone == null ? null : sendtelephone.trim();
    }

    public String getSendname() {
        return sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname == null ? null : sendname.trim();
    }

    public String getAccepttype() {
        return accepttype;
    }

    public void setAccepttype(String accepttype) {
        this.accepttype = accepttype == null ? null : accepttype.trim();
    }

    public BigDecimal getSigntype() {
        return signtype;
    }

    public void setSigntype(BigDecimal signtype) {
        this.signtype = signtype;
    }

    public String getSigncustomer() {
        return signcustomer;
    }

    public void setSigncustomer(String signcustomer) {
        this.signcustomer = signcustomer == null ? null : signcustomer.trim();
    }

    public BigDecimal getAssignstatus() {
        return assignstatus;
    }

    public void setAssignstatus(BigDecimal assignstatus) {
        this.assignstatus = assignstatus;
    }

    public String getReasonremark() {
        return reasonremark;
    }

    public void setReasonremark(String reasonremark) {
        this.reasonremark = reasonremark == null ? null : reasonremark.trim();
    }

    public String getReasondescription() {
        return reasondescription;
    }

    public void setReasondescription(String reasondescription) {
        this.reasondescription = reasondescription == null ? null : reasondescription.trim();
    }

    public BigDecimal getIssynuser() {
        return issynuser;
    }

    public void setIssynuser(BigDecimal issynuser) {
        this.issynuser = issynuser;
    }

    public BigDecimal getBoxcount() {
        return boxcount;
    }

    public void setBoxcount(BigDecimal boxcount) {
        this.boxcount = boxcount;
    }

    public String getExpressorderpaymenttype() {
        return expressorderpaymenttype;
    }

    public void setExpressorderpaymenttype(String expressorderpaymenttype) {
        this.expressorderpaymenttype = expressorderpaymenttype == null ? null : expressorderpaymenttype.trim();
    }

    public BigDecimal getQuerystatus() {
        return querystatus;
    }

    public void setQuerystatus(BigDecimal querystatus) {
        this.querystatus = querystatus;
    }

    public BigDecimal getSubtype() {
        return subtype;
    }

    public void setSubtype(BigDecimal subtype) {
        this.subtype = subtype;
    }

    public String getPoscode() {
        return poscode;
    }

    public void setPoscode(String poscode) {
        this.poscode = poscode == null ? null : poscode.trim();
    }

    public BigDecimal getExpressorderaccounttype() {
        return expressorderaccounttype;
    }

    public void setExpressorderaccounttype(BigDecimal expressorderaccounttype) {
        this.expressorderaccounttype = expressorderaccounttype;
    }

    public Date getDistributionreceivedtime() {
        return distributionreceivedtime;
    }

    public void setDistributionreceivedtime(Date distributionreceivedtime) {
        this.distributionreceivedtime = distributionreceivedtime;
    }

    public BigDecimal getRealmerchantid() {
        return realmerchantid;
    }

    public void setRealmerchantid(BigDecimal realmerchantid) {
        this.realmerchantid = realmerchantid;
    }

    public BigDecimal getReturnsortingcenterid() {
        return returnsortingcenterid;
    }

    public void setReturnsortingcenterid(BigDecimal returnsortingcenterid) {
        this.returnsortingcenterid = returnsortingcenterid;
    }

    public String getBoxno() {
        return boxno;
    }

    public void setBoxno(String boxno) {
        this.boxno = boxno == null ? null : boxno.trim();
    }

    public String getMaincode() {
        return maincode;
    }

    public void setMaincode(String maincode) {
        this.maincode = maincode == null ? null : maincode.trim();
    }

    public Date getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(Date deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getPayreasoncode() {
        return payreasoncode;
    }

    public void setPayreasoncode(String payreasoncode) {
        this.payreasoncode = payreasoncode == null ? null : payreasoncode.trim();
    }

    public BigDecimal getLastsortingcenterid() {
        return lastsortingcenterid;
    }

    public void setLastsortingcenterid(BigDecimal lastsortingcenterid) {
        this.lastsortingcenterid = lastsortingcenterid;
    }

    public Date getLoadingtime() {
        return loadingtime;
    }

    public void setLoadingtime(Date loadingtime) {
        this.loadingtime = loadingtime;
    }

    public Date getUnloadingtime() {
        return unloadingtime;
    }

    public void setUnloadingtime(Date unloadingtime) {
        this.unloadingtime = unloadingtime;
    }

    public Date getPickupgoodstime() {
        return pickupgoodstime;
    }

    public void setPickupgoodstime(Date pickupgoodstime) {
        this.pickupgoodstime = pickupgoodstime;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public BigDecimal getGoodspayment() {
        return goodspayment;
    }

    public void setGoodspayment(BigDecimal goodspayment) {
        this.goodspayment = goodspayment;
    }

    public String getOrderrealsource() {
        return orderrealsource;
    }

    public void setOrderrealsource(String orderrealsource) {
        this.orderrealsource = orderrealsource == null ? null : orderrealsource.trim();
    }

    public Date getRealbackstationtime() {
        return realbackstationtime;
    }

    public void setRealbackstationtime(Date realbackstationtime) {
        this.realbackstationtime = realbackstationtime;
    }

    public BigDecimal getIssendhuodongsms() {
        return issendhuodongsms;
    }

    public void setIssendhuodongsms(BigDecimal issendhuodongsms) {
        this.issendhuodongsms = issendhuodongsms;
    }

    public Date getSendhuodongsmsdate() {
        return sendhuodongsmsdate;
    }

    public void setSendhuodongsmsdate(Date sendhuodongsmsdate) {
        this.sendhuodongsmsdate = sendhuodongsmsdate;
    }

    public String getDigitalsignatureurl() {
        return digitalsignatureurl;
    }

    public void setDigitalsignatureurl(String digitalsignatureurl) {
        this.digitalsignatureurl = digitalsignatureurl == null ? null : digitalsignatureurl.trim();
    }

    public String getTotownship() {
        return totownship;
    }

    public void setTotownship(String totownship) {
        this.totownship = totownship == null ? null : totownship.trim();
    }

    public String getFromtownship() {
        return fromtownship;
    }

    public void setFromtownship(String fromtownship) {
        this.fromtownship = fromtownship == null ? null : fromtownship.trim();
    }

    public BigDecimal getFirstinstorestationid() {
        return firstinstorestationid;
    }

    public void setFirstinstorestationid(BigDecimal firstinstorestationid) {
        this.firstinstorestationid = firstinstorestationid;
    }

    public Date getFirstinstoretime() {
        return firstinstoretime;
    }

    public void setFirstinstoretime(Date firstinstoretime) {
        this.firstinstoretime = firstinstoretime;
    }

    public Date getFirstoutstoretime() {
        return firstoutstoretime;
    }

    public void setFirstoutstoretime(Date firstoutstoretime) {
        this.firstoutstoretime = firstoutstoretime;
    }

    public BigDecimal getSubabnormal() {
        return subabnormal;
    }

    public void setSubabnormal(BigDecimal subabnormal) {
        this.subabnormal = subabnormal;
    }

    public BigDecimal getExpressservicefee() {
        return expressservicefee;
    }

    public void setExpressservicefee(BigDecimal expressservicefee) {
        this.expressservicefee = expressservicefee;
    }

    public String getPickupcar() {
        return pickupcar;
    }

    public void setPickupcar(String pickupcar) {
        this.pickupcar = pickupcar == null ? null : pickupcar.trim();
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
        OrderComplexQuery other = (OrderComplexQuery) that;
        return (this.getWaybillno() == null ? other.getWaybillno() == null : this.getWaybillno().equals(other.getWaybillno()))
            && (this.getDistributioncode() == null ? other.getDistributioncode() == null : this.getDistributioncode().equals(other.getDistributioncode()))
            && (this.getCreatetime() == null ? other.getCreatetime() == null : this.getCreatetime().equals(other.getCreatetime()))
            && (this.getFormcode() == null ? other.getFormcode() == null : this.getFormcode().equals(other.getFormcode()))
            && (this.getDelivercode() == null ? other.getDelivercode() == null : this.getDelivercode().equals(other.getDelivercode()))
            && (this.getSortingcenterid() == null ? other.getSortingcenterid() == null : this.getSortingcenterid().equals(other.getSortingcenterid()))
            && (this.getCurdeptid() == null ? other.getCurdeptid() == null : this.getCurdeptid().equals(other.getCurdeptid()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getBackstatus() == null ? other.getBackstatus() == null : this.getBackstatus().equals(other.getBackstatus()))
            && (this.getReplacetype() == null ? other.getReplacetype() == null : this.getReplacetype().equals(other.getReplacetype()))
            && (this.getMarchartid() == null ? other.getMarchartid() == null : this.getMarchartid().equals(other.getMarchartid()))
            && (this.getMerchanthousecode() == null ? other.getMerchanthousecode() == null : this.getMerchanthousecode().equals(other.getMerchanthousecode()))
            && (this.getToprovince() == null ? other.getToprovince() == null : this.getToprovince().equals(other.getToprovince()))
            && (this.getTocity() == null ? other.getTocity() == null : this.getTocity().equals(other.getTocity()))
            && (this.getToarea() == null ? other.getToarea() == null : this.getToarea().equals(other.getToarea()))
            && (this.getToaddress() == null ? other.getToaddress() == null : this.getToaddress().equals(other.getToaddress()))
            && (this.getExpresscompanyid() == null ? other.getExpresscompanyid() == null : this.getExpresscompanyid().equals(other.getExpresscompanyid()))
            && (this.getDelivermanid() == null ? other.getDelivermanid() == null : this.getDelivermanid().equals(other.getDelivermanid()))
            && (this.getMerchantweight() == null ? other.getMerchantweight() == null : this.getMerchantweight().equals(other.getMerchantweight()))
            && (this.getWeight() == null ? other.getWeight() == null : this.getWeight().equals(other.getWeight()))
            && (this.getFinancialweight() == null ? other.getFinancialweight() == null : this.getFinancialweight().equals(other.getFinancialweight()))
            && (this.getVolumetricweight() == null ? other.getVolumetricweight() == null : this.getVolumetricweight().equals(other.getVolumetricweight()))
            && (this.getNeedfund() == null ? other.getNeedfund() == null : this.getNeedfund().equals(other.getNeedfund()))
            && (this.getBackfund() == null ? other.getBackfund() == null : this.getBackfund().equals(other.getBackfund()))
            && (this.getProtectedprice() == null ? other.getProtectedprice() == null : this.getProtectedprice().equals(other.getProtectedprice()))
            && (this.getReason() == null ? other.getReason() == null : this.getReason().equals(other.getReason()))
            && (this.getReceivedate() == null ? other.getReceivedate() == null : this.getReceivedate().equals(other.getReceivedate()))
            && (this.getAssigntime() == null ? other.getAssigntime() == null : this.getAssigntime().equals(other.getAssigntime()))
            && (this.getLastinboundtime() == null ? other.getLastinboundtime() == null : this.getLastinboundtime().equals(other.getLastinboundtime()))
            && (this.getLastinboxtime() == null ? other.getLastinboxtime() == null : this.getLastinboxtime().equals(other.getLastinboxtime()))
            && (this.getLastoutboundtime() == null ? other.getLastoutboundtime() == null : this.getLastoutboundtime().equals(other.getLastoutboundtime()))
            && (this.getPickupintostationtime() == null ? other.getPickupintostationtime() == null : this.getPickupintostationtime().equals(other.getPickupintostationtime()))
            && (this.getPickupoutstationtime() == null ? other.getPickupoutstationtime() == null : this.getPickupoutstationtime().equals(other.getPickupoutstationtime()))
            && (this.getDeliveryintostationtime() == null ? other.getDeliveryintostationtime() == null : this.getDeliveryintostationtime().equals(other.getDeliveryintostationtime()))
            && (this.getDeliveryoutstationtime() == null ? other.getDeliveryoutstationtime() == null : this.getDeliveryoutstationtime().equals(other.getDeliveryoutstationtime()))
            && (this.getDeliverybackstationtime() == null ? other.getDeliverybackstationtime() == null : this.getDeliverybackstationtime().equals(other.getDeliverybackstationtime()))
            && (this.getReuturninstationtime() == null ? other.getReuturninstationtime() == null : this.getReuturninstationtime().equals(other.getReuturninstationtime()))
            && (this.getReuturnoutstationtime() == null ? other.getReuturnoutstationtime() == null : this.getReuturnoutstationtime().equals(other.getReuturnoutstationtime()))
            && (this.getReuturninboundtime() == null ? other.getReuturninboundtime() == null : this.getReuturninboundtime().equals(other.getReuturninboundtime()))
            && (this.getReuturnoutboundtime() == null ? other.getReuturnoutboundtime() == null : this.getReuturnoutboundtime().equals(other.getReuturnoutboundtime()))
            && (this.getMerchantconfimtime() == null ? other.getMerchantconfimtime() == null : this.getMerchantconfimtime().equals(other.getMerchantconfimtime()))
            && (this.getUpdatetime() == null ? other.getUpdatetime() == null : this.getUpdatetime().equals(other.getUpdatetime()))
            && (this.getPerformcode() == null ? other.getPerformcode() == null : this.getPerformcode().equals(other.getPerformcode()))
            && (this.getExpresswaybillno() == null ? other.getExpresswaybillno() == null : this.getExpresswaybillno().equals(other.getExpresswaybillno()))
            && (this.getGoodsproperty() == null ? other.getGoodsproperty() == null : this.getGoodsproperty().equals(other.getGoodsproperty()))
            && (this.getGoodscategory() == null ? other.getGoodscategory() == null : this.getGoodscategory().equals(other.getGoodscategory()))
            && (this.getFromprovince() == null ? other.getFromprovince() == null : this.getFromprovince().equals(other.getFromprovince()))
            && (this.getFromcity() == null ? other.getFromcity() == null : this.getFromcity().equals(other.getFromcity()))
            && (this.getFromarea() == null ? other.getFromarea() == null : this.getFromarea().equals(other.getFromarea()))
            && (this.getFromaddress() == null ? other.getFromaddress() == null : this.getFromaddress().equals(other.getFromaddress()))
            && (this.getPickupdistributioncode() == null ? other.getPickupdistributioncode() == null : this.getPickupdistributioncode().equals(other.getPickupdistributioncode()))
            && (this.getPickupexpresscompanyid() == null ? other.getPickupexpresscompanyid() == null : this.getPickupexpresscompanyid().equals(other.getPickupexpresscompanyid()))
            && (this.getPickupmanid() == null ? other.getPickupmanid() == null : this.getPickupmanid().equals(other.getPickupmanid()))
            && (this.getDeliveryfeetype() == null ? other.getDeliveryfeetype() == null : this.getDeliveryfeetype().equals(other.getDeliveryfeetype()))
            && (this.getDeliveryfee() == null ? other.getDeliveryfee() == null : this.getDeliveryfee().equals(other.getDeliveryfee()))
            && (this.getProtectfee() == null ? other.getProtectfee() == null : this.getProtectfee().equals(other.getProtectfee()))
            && (this.getAdditionalservice() == null ? other.getAdditionalservice() == null : this.getAdditionalservice().equals(other.getAdditionalservice()))
            && (this.getAdditionalfee() == null ? other.getAdditionalfee() == null : this.getAdditionalfee().equals(other.getAdditionalfee()))
            && (this.getFactorage() == null ? other.getFactorage() == null : this.getFactorage().equals(other.getFactorage()))
            && (this.getTotalfee() == null ? other.getTotalfee() == null : this.getTotalfee().equals(other.getTotalfee()))
            && (this.getGoodstype() == null ? other.getGoodstype() == null : this.getGoodstype().equals(other.getGoodstype()))
            && (this.getGoodsnum() == null ? other.getGoodsnum() == null : this.getGoodsnum().equals(other.getGoodsnum()))
            && (this.getFetchorderno() == null ? other.getFetchorderno() == null : this.getFetchorderno().equals(other.getFetchorderno()))
            && (this.getFetchcreatetime() == null ? other.getFetchcreatetime() == null : this.getFetchcreatetime().equals(other.getFetchcreatetime()))
            && (this.getCustomerlevel() == null ? other.getCustomerlevel() == null : this.getCustomerlevel().equals(other.getCustomerlevel()))
            && (this.getOrdercomment() == null ? other.getOrdercomment() == null : this.getOrdercomment().equals(other.getOrdercomment()))
            && (this.getCreateby() == null ? other.getCreateby() == null : this.getCreateby().equals(other.getCreateby()))
            && (this.getUpdateby() == null ? other.getUpdateby() == null : this.getUpdateby().equals(other.getUpdateby()))
            && (this.getIsdeleted() == null ? other.getIsdeleted() == null : this.getIsdeleted().equals(other.getIsdeleted()))
            && (this.getBusinesstype() == null ? other.getBusinesstype() == null : this.getBusinesstype().equals(other.getBusinesstype()))
            && (this.getAddressee() == null ? other.getAddressee() == null : this.getAddressee().equals(other.getAddressee()))
            && (this.getMobilephone() == null ? other.getMobilephone() == null : this.getMobilephone().equals(other.getMobilephone()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getReceivetel() == null ? other.getReceivetel() == null : this.getReceivetel().equals(other.getReceivetel()))
            && (this.getCurrentdistributioncode() == null ? other.getCurrentdistributioncode() == null : this.getCurrentdistributioncode().equals(other.getCurrentdistributioncode()))
            && (this.getFromdistributioncode() == null ? other.getFromdistributioncode() == null : this.getFromdistributioncode().equals(other.getFromdistributioncode()))
            && (this.getSendphone() == null ? other.getSendphone() == null : this.getSendphone().equals(other.getSendphone()))
            && (this.getSendtelephone() == null ? other.getSendtelephone() == null : this.getSendtelephone().equals(other.getSendtelephone()))
            && (this.getSendname() == null ? other.getSendname() == null : this.getSendname().equals(other.getSendname()))
            && (this.getAccepttype() == null ? other.getAccepttype() == null : this.getAccepttype().equals(other.getAccepttype()))
            && (this.getSigntype() == null ? other.getSigntype() == null : this.getSigntype().equals(other.getSigntype()))
            && (this.getSigncustomer() == null ? other.getSigncustomer() == null : this.getSigncustomer().equals(other.getSigncustomer()))
            && (this.getAssignstatus() == null ? other.getAssignstatus() == null : this.getAssignstatus().equals(other.getAssignstatus()))
            && (this.getReasonremark() == null ? other.getReasonremark() == null : this.getReasonremark().equals(other.getReasonremark()))
            && (this.getReasondescription() == null ? other.getReasondescription() == null : this.getReasondescription().equals(other.getReasondescription()))
            && (this.getIssynuser() == null ? other.getIssynuser() == null : this.getIssynuser().equals(other.getIssynuser()))
            && (this.getBoxcount() == null ? other.getBoxcount() == null : this.getBoxcount().equals(other.getBoxcount()))
            && (this.getExpressorderpaymenttype() == null ? other.getExpressorderpaymenttype() == null : this.getExpressorderpaymenttype().equals(other.getExpressorderpaymenttype()))
            && (this.getQuerystatus() == null ? other.getQuerystatus() == null : this.getQuerystatus().equals(other.getQuerystatus()))
            && (this.getSubtype() == null ? other.getSubtype() == null : this.getSubtype().equals(other.getSubtype()))
            && (this.getPoscode() == null ? other.getPoscode() == null : this.getPoscode().equals(other.getPoscode()))
            && (this.getExpressorderaccounttype() == null ? other.getExpressorderaccounttype() == null : this.getExpressorderaccounttype().equals(other.getExpressorderaccounttype()))
            && (this.getDistributionreceivedtime() == null ? other.getDistributionreceivedtime() == null : this.getDistributionreceivedtime().equals(other.getDistributionreceivedtime()))
            && (this.getRealmerchantid() == null ? other.getRealmerchantid() == null : this.getRealmerchantid().equals(other.getRealmerchantid()))
            && (this.getReturnsortingcenterid() == null ? other.getReturnsortingcenterid() == null : this.getReturnsortingcenterid().equals(other.getReturnsortingcenterid()))
            && (this.getBoxno() == null ? other.getBoxno() == null : this.getBoxno().equals(other.getBoxno()))
            && (this.getMaincode() == null ? other.getMaincode() == null : this.getMaincode().equals(other.getMaincode()))
            && (this.getDeliverydate() == null ? other.getDeliverydate() == null : this.getDeliverydate().equals(other.getDeliverydate()))
            && (this.getPayreasoncode() == null ? other.getPayreasoncode() == null : this.getPayreasoncode().equals(other.getPayreasoncode()))
            && (this.getLastsortingcenterid() == null ? other.getLastsortingcenterid() == null : this.getLastsortingcenterid().equals(other.getLastsortingcenterid()))
            && (this.getLoadingtime() == null ? other.getLoadingtime() == null : this.getLoadingtime().equals(other.getLoadingtime()))
            && (this.getUnloadingtime() == null ? other.getUnloadingtime() == null : this.getUnloadingtime().equals(other.getUnloadingtime()))
            && (this.getPickupgoodstime() == null ? other.getPickupgoodstime() == null : this.getPickupgoodstime().equals(other.getPickupgoodstime()))
            && (this.getBankcardnumber() == null ? other.getBankcardnumber() == null : this.getBankcardnumber().equals(other.getBankcardnumber()))
            && (this.getBankcardname() == null ? other.getBankcardname() == null : this.getBankcardname().equals(other.getBankcardname()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getGoodspayment() == null ? other.getGoodspayment() == null : this.getGoodspayment().equals(other.getGoodspayment()))
            && (this.getOrderrealsource() == null ? other.getOrderrealsource() == null : this.getOrderrealsource().equals(other.getOrderrealsource()))
            && (this.getRealbackstationtime() == null ? other.getRealbackstationtime() == null : this.getRealbackstationtime().equals(other.getRealbackstationtime()))
            && (this.getIssendhuodongsms() == null ? other.getIssendhuodongsms() == null : this.getIssendhuodongsms().equals(other.getIssendhuodongsms()))
            && (this.getSendhuodongsmsdate() == null ? other.getSendhuodongsmsdate() == null : this.getSendhuodongsmsdate().equals(other.getSendhuodongsmsdate()))
            && (this.getDigitalsignatureurl() == null ? other.getDigitalsignatureurl() == null : this.getDigitalsignatureurl().equals(other.getDigitalsignatureurl()))
            && (this.getTotownship() == null ? other.getTotownship() == null : this.getTotownship().equals(other.getTotownship()))
            && (this.getFromtownship() == null ? other.getFromtownship() == null : this.getFromtownship().equals(other.getFromtownship()))
            && (this.getFirstinstorestationid() == null ? other.getFirstinstorestationid() == null : this.getFirstinstorestationid().equals(other.getFirstinstorestationid()))
            && (this.getFirstinstoretime() == null ? other.getFirstinstoretime() == null : this.getFirstinstoretime().equals(other.getFirstinstoretime()))
            && (this.getFirstoutstoretime() == null ? other.getFirstoutstoretime() == null : this.getFirstoutstoretime().equals(other.getFirstoutstoretime()))
            && (this.getSubabnormal() == null ? other.getSubabnormal() == null : this.getSubabnormal().equals(other.getSubabnormal()))
            && (this.getExpressservicefee() == null ? other.getExpressservicefee() == null : this.getExpressservicefee().equals(other.getExpressservicefee()))
            && (this.getPickupcar() == null ? other.getPickupcar() == null : this.getPickupcar().equals(other.getPickupcar()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getWaybillno() == null) ? 0 : getWaybillno().hashCode());
        result = prime * result + ((getDistributioncode() == null) ? 0 : getDistributioncode().hashCode());
        result = prime * result + ((getCreatetime() == null) ? 0 : getCreatetime().hashCode());
        result = prime * result + ((getFormcode() == null) ? 0 : getFormcode().hashCode());
        result = prime * result + ((getDelivercode() == null) ? 0 : getDelivercode().hashCode());
        result = prime * result + ((getSortingcenterid() == null) ? 0 : getSortingcenterid().hashCode());
        result = prime * result + ((getCurdeptid() == null) ? 0 : getCurdeptid().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getBackstatus() == null) ? 0 : getBackstatus().hashCode());
        result = prime * result + ((getReplacetype() == null) ? 0 : getReplacetype().hashCode());
        result = prime * result + ((getMarchartid() == null) ? 0 : getMarchartid().hashCode());
        result = prime * result + ((getMerchanthousecode() == null) ? 0 : getMerchanthousecode().hashCode());
        result = prime * result + ((getToprovince() == null) ? 0 : getToprovince().hashCode());
        result = prime * result + ((getTocity() == null) ? 0 : getTocity().hashCode());
        result = prime * result + ((getToarea() == null) ? 0 : getToarea().hashCode());
        result = prime * result + ((getToaddress() == null) ? 0 : getToaddress().hashCode());
        result = prime * result + ((getExpresscompanyid() == null) ? 0 : getExpresscompanyid().hashCode());
        result = prime * result + ((getDelivermanid() == null) ? 0 : getDelivermanid().hashCode());
        result = prime * result + ((getMerchantweight() == null) ? 0 : getMerchantweight().hashCode());
        result = prime * result + ((getWeight() == null) ? 0 : getWeight().hashCode());
        result = prime * result + ((getFinancialweight() == null) ? 0 : getFinancialweight().hashCode());
        result = prime * result + ((getVolumetricweight() == null) ? 0 : getVolumetricweight().hashCode());
        result = prime * result + ((getNeedfund() == null) ? 0 : getNeedfund().hashCode());
        result = prime * result + ((getBackfund() == null) ? 0 : getBackfund().hashCode());
        result = prime * result + ((getProtectedprice() == null) ? 0 : getProtectedprice().hashCode());
        result = prime * result + ((getReason() == null) ? 0 : getReason().hashCode());
        result = prime * result + ((getReceivedate() == null) ? 0 : getReceivedate().hashCode());
        result = prime * result + ((getAssigntime() == null) ? 0 : getAssigntime().hashCode());
        result = prime * result + ((getLastinboundtime() == null) ? 0 : getLastinboundtime().hashCode());
        result = prime * result + ((getLastinboxtime() == null) ? 0 : getLastinboxtime().hashCode());
        result = prime * result + ((getLastoutboundtime() == null) ? 0 : getLastoutboundtime().hashCode());
        result = prime * result + ((getPickupintostationtime() == null) ? 0 : getPickupintostationtime().hashCode());
        result = prime * result + ((getPickupoutstationtime() == null) ? 0 : getPickupoutstationtime().hashCode());
        result = prime * result + ((getDeliveryintostationtime() == null) ? 0 : getDeliveryintostationtime().hashCode());
        result = prime * result + ((getDeliveryoutstationtime() == null) ? 0 : getDeliveryoutstationtime().hashCode());
        result = prime * result + ((getDeliverybackstationtime() == null) ? 0 : getDeliverybackstationtime().hashCode());
        result = prime * result + ((getReuturninstationtime() == null) ? 0 : getReuturninstationtime().hashCode());
        result = prime * result + ((getReuturnoutstationtime() == null) ? 0 : getReuturnoutstationtime().hashCode());
        result = prime * result + ((getReuturninboundtime() == null) ? 0 : getReuturninboundtime().hashCode());
        result = prime * result + ((getReuturnoutboundtime() == null) ? 0 : getReuturnoutboundtime().hashCode());
        result = prime * result + ((getMerchantconfimtime() == null) ? 0 : getMerchantconfimtime().hashCode());
        result = prime * result + ((getUpdatetime() == null) ? 0 : getUpdatetime().hashCode());
        result = prime * result + ((getPerformcode() == null) ? 0 : getPerformcode().hashCode());
        result = prime * result + ((getExpresswaybillno() == null) ? 0 : getExpresswaybillno().hashCode());
        result = prime * result + ((getGoodsproperty() == null) ? 0 : getGoodsproperty().hashCode());
        result = prime * result + ((getGoodscategory() == null) ? 0 : getGoodscategory().hashCode());
        result = prime * result + ((getFromprovince() == null) ? 0 : getFromprovince().hashCode());
        result = prime * result + ((getFromcity() == null) ? 0 : getFromcity().hashCode());
        result = prime * result + ((getFromarea() == null) ? 0 : getFromarea().hashCode());
        result = prime * result + ((getFromaddress() == null) ? 0 : getFromaddress().hashCode());
        result = prime * result + ((getPickupdistributioncode() == null) ? 0 : getPickupdistributioncode().hashCode());
        result = prime * result + ((getPickupexpresscompanyid() == null) ? 0 : getPickupexpresscompanyid().hashCode());
        result = prime * result + ((getPickupmanid() == null) ? 0 : getPickupmanid().hashCode());
        result = prime * result + ((getDeliveryfeetype() == null) ? 0 : getDeliveryfeetype().hashCode());
        result = prime * result + ((getDeliveryfee() == null) ? 0 : getDeliveryfee().hashCode());
        result = prime * result + ((getProtectfee() == null) ? 0 : getProtectfee().hashCode());
        result = prime * result + ((getAdditionalservice() == null) ? 0 : getAdditionalservice().hashCode());
        result = prime * result + ((getAdditionalfee() == null) ? 0 : getAdditionalfee().hashCode());
        result = prime * result + ((getFactorage() == null) ? 0 : getFactorage().hashCode());
        result = prime * result + ((getTotalfee() == null) ? 0 : getTotalfee().hashCode());
        result = prime * result + ((getGoodstype() == null) ? 0 : getGoodstype().hashCode());
        result = prime * result + ((getGoodsnum() == null) ? 0 : getGoodsnum().hashCode());
        result = prime * result + ((getFetchorderno() == null) ? 0 : getFetchorderno().hashCode());
        result = prime * result + ((getFetchcreatetime() == null) ? 0 : getFetchcreatetime().hashCode());
        result = prime * result + ((getCustomerlevel() == null) ? 0 : getCustomerlevel().hashCode());
        result = prime * result + ((getOrdercomment() == null) ? 0 : getOrdercomment().hashCode());
        result = prime * result + ((getCreateby() == null) ? 0 : getCreateby().hashCode());
        result = prime * result + ((getUpdateby() == null) ? 0 : getUpdateby().hashCode());
        result = prime * result + ((getIsdeleted() == null) ? 0 : getIsdeleted().hashCode());
        result = prime * result + ((getBusinesstype() == null) ? 0 : getBusinesstype().hashCode());
        result = prime * result + ((getAddressee() == null) ? 0 : getAddressee().hashCode());
        result = prime * result + ((getMobilephone() == null) ? 0 : getMobilephone().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getReceivetel() == null) ? 0 : getReceivetel().hashCode());
        result = prime * result + ((getCurrentdistributioncode() == null) ? 0 : getCurrentdistributioncode().hashCode());
        result = prime * result + ((getFromdistributioncode() == null) ? 0 : getFromdistributioncode().hashCode());
        result = prime * result + ((getSendphone() == null) ? 0 : getSendphone().hashCode());
        result = prime * result + ((getSendtelephone() == null) ? 0 : getSendtelephone().hashCode());
        result = prime * result + ((getSendname() == null) ? 0 : getSendname().hashCode());
        result = prime * result + ((getAccepttype() == null) ? 0 : getAccepttype().hashCode());
        result = prime * result + ((getSigntype() == null) ? 0 : getSigntype().hashCode());
        result = prime * result + ((getSigncustomer() == null) ? 0 : getSigncustomer().hashCode());
        result = prime * result + ((getAssignstatus() == null) ? 0 : getAssignstatus().hashCode());
        result = prime * result + ((getReasonremark() == null) ? 0 : getReasonremark().hashCode());
        result = prime * result + ((getReasondescription() == null) ? 0 : getReasondescription().hashCode());
        result = prime * result + ((getIssynuser() == null) ? 0 : getIssynuser().hashCode());
        result = prime * result + ((getBoxcount() == null) ? 0 : getBoxcount().hashCode());
        result = prime * result + ((getExpressorderpaymenttype() == null) ? 0 : getExpressorderpaymenttype().hashCode());
        result = prime * result + ((getQuerystatus() == null) ? 0 : getQuerystatus().hashCode());
        result = prime * result + ((getSubtype() == null) ? 0 : getSubtype().hashCode());
        result = prime * result + ((getPoscode() == null) ? 0 : getPoscode().hashCode());
        result = prime * result + ((getExpressorderaccounttype() == null) ? 0 : getExpressorderaccounttype().hashCode());
        result = prime * result + ((getDistributionreceivedtime() == null) ? 0 : getDistributionreceivedtime().hashCode());
        result = prime * result + ((getRealmerchantid() == null) ? 0 : getRealmerchantid().hashCode());
        result = prime * result + ((getReturnsortingcenterid() == null) ? 0 : getReturnsortingcenterid().hashCode());
        result = prime * result + ((getBoxno() == null) ? 0 : getBoxno().hashCode());
        result = prime * result + ((getMaincode() == null) ? 0 : getMaincode().hashCode());
        result = prime * result + ((getDeliverydate() == null) ? 0 : getDeliverydate().hashCode());
        result = prime * result + ((getPayreasoncode() == null) ? 0 : getPayreasoncode().hashCode());
        result = prime * result + ((getLastsortingcenterid() == null) ? 0 : getLastsortingcenterid().hashCode());
        result = prime * result + ((getLoadingtime() == null) ? 0 : getLoadingtime().hashCode());
        result = prime * result + ((getUnloadingtime() == null) ? 0 : getUnloadingtime().hashCode());
        result = prime * result + ((getPickupgoodstime() == null) ? 0 : getPickupgoodstime().hashCode());
        result = prime * result + ((getBankcardnumber() == null) ? 0 : getBankcardnumber().hashCode());
        result = prime * result + ((getBankcardname() == null) ? 0 : getBankcardname().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getGoodspayment() == null) ? 0 : getGoodspayment().hashCode());
        result = prime * result + ((getOrderrealsource() == null) ? 0 : getOrderrealsource().hashCode());
        result = prime * result + ((getRealbackstationtime() == null) ? 0 : getRealbackstationtime().hashCode());
        result = prime * result + ((getIssendhuodongsms() == null) ? 0 : getIssendhuodongsms().hashCode());
        result = prime * result + ((getSendhuodongsmsdate() == null) ? 0 : getSendhuodongsmsdate().hashCode());
        result = prime * result + ((getDigitalsignatureurl() == null) ? 0 : getDigitalsignatureurl().hashCode());
        result = prime * result + ((getTotownship() == null) ? 0 : getTotownship().hashCode());
        result = prime * result + ((getFromtownship() == null) ? 0 : getFromtownship().hashCode());
        result = prime * result + ((getFirstinstorestationid() == null) ? 0 : getFirstinstorestationid().hashCode());
        result = prime * result + ((getFirstinstoretime() == null) ? 0 : getFirstinstoretime().hashCode());
        result = prime * result + ((getFirstoutstoretime() == null) ? 0 : getFirstoutstoretime().hashCode());
        result = prime * result + ((getSubabnormal() == null) ? 0 : getSubabnormal().hashCode());
        result = prime * result + ((getExpressservicefee() == null) ? 0 : getExpressservicefee().hashCode());
        result = prime * result + ((getPickupcar() == null) ? 0 : getPickupcar().hashCode());
        return result;
    }
}
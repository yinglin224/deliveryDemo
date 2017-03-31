package com.sean.delivery.kernel.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DS_UM_COMPANY_DEF")
public class Department {
    @Id
    @Column(name = "COMPANYCODE")
    private String companycode;

    @Column(name = "COMPANYCNAME")
    private String companycname;

    @Column(name = "COMPANYTNAME")
    private String companytname;

    @Column(name = "COMPANYENAME")
    private String companyename;

    @Column(name = "ADDRESSCNAME")
    private String addresscname;

    @Column(name = "ADDRESSTNAME")
    private String addresstname;

    @Column(name = "ADDRESSENAME")
    private String addressename;

    @Column(name = "INSURERCNAME")
    private String insurercname;

    @Column(name = "INSURERTNAME")
    private String insurertname;

    @Column(name = "INSURERENAME")
    private String insurerename;

    @Column(name = "UPPERCOMPANYCODE")
    private String uppercompanycode;

    @Column(name = "COMATTRIBUTE")
    private String comattribute;

    @Column(name = "COMTYPE")
    private String comtype;

    @Column(name = "CENTERIND")
    private String centerind;

    @Column(name = "COMLEVEL")
    private String comlevel;

    @Column(name = "POSTCODE")
    private String postcode;

    @Column(name = "PHONENUMBER")
    private String phonenumber;

    @Column(name = "FAXNUMBER")
    private String faxnumber;

    @Column(name = "MANAGER")
    private String manager;

    @Column(name = "WEBADDRESS")
    private String webaddress;

    @Column(name = "SERVICEPHONE")
    private String servicephone;

    @Column(name = "REPORTPHONE")
    private String reportphone;

    @Column(name = "CREATORCODE")
    private String creatorcode;

    @Column(name = "CREATETIME")
    private Date createtime;

    @Column(name = "UPDATERCODE")
    private String updatercode;

    @Column(name = "UPDATETIME")
    private Date updatetime;

    @Column(name = "VALIDIND")
    private String validind;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "FLAG")
    private String flag;

    @Column(name = "SHORTCNAME")
    private String shortcname;

    @Column(name = "SHORTTNAME")
    private String shorttname;

    @Column(name = "SHORTENAME")
    private String shortename;

    @Column(name = "TAXNUMBER")
    private String taxnumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PRINTPOLICYCOMCODE")
    private String printpolicycomcode;

    @Column(name = "PRINTINVOICECOMCODE")
    private String printinvoicecomcode;

    @Column(name = "CHANNEL_CODE")
    private String channelCode;

    @Column(name = "RUNSTATUS")
    private String runstatus;

    @Column(name = "BUSINESSREPLYDATE")
    private Date businessreplydate;

    @Column(name = "BPERMITCOMCODE")
    private String bpermitcomcode;

    @Column(name = "BUSINESSLICENSE")
    private String businesslicense;

    @Column(name = "BPERMITSTARTDATE")
    private Date bpermitstartdate;

    @Column(name = "BPERMITENDDATE")
    private Date bpermitenddate;

    @Column(name = "BLICENSESTARTDATE")
    private Date blicensestartdate;

    @Column(name = "BLICENSEENDDATE")
    private Date blicenseenddate;

    @Column(name = "PROVINCECODE")
    private String provincecode;

    @Column(name = "CITYCODE")
    private String citycode;

    @Column(name = "COUNTRYCODE")
    private String countrycode;

    /**
     * @return COMPANYCODE
     */
    public String getCompanycode() {
        return companycode;
    }

    /**
     * @param companycode
     */
    public void setCompanycode(String companycode) {
        this.companycode = companycode;
    }

    /**
     * @return COMPANYCNAME
     */
    public String getCompanycname() {
        return companycname;
    }

    /**
     * @param companycname
     */
    public void setCompanycname(String companycname) {
        this.companycname = companycname;
    }

    /**
     * @return COMPANYTNAME
     */
    public String getCompanytname() {
        return companytname;
    }

    /**
     * @param companytname
     */
    public void setCompanytname(String companytname) {
        this.companytname = companytname;
    }

    /**
     * @return COMPANYENAME
     */
    public String getCompanyename() {
        return companyename;
    }

    /**
     * @param companyename
     */
    public void setCompanyename(String companyename) {
        this.companyename = companyename;
    }

    /**
     * @return ADDRESSCNAME
     */
    public String getAddresscname() {
        return addresscname;
    }

    /**
     * @param addresscname
     */
    public void setAddresscname(String addresscname) {
        this.addresscname = addresscname;
    }

    /**
     * @return ADDRESSTNAME
     */
    public String getAddresstname() {
        return addresstname;
    }

    /**
     * @param addresstname
     */
    public void setAddresstname(String addresstname) {
        this.addresstname = addresstname;
    }

    /**
     * @return ADDRESSENAME
     */
    public String getAddressename() {
        return addressename;
    }

    /**
     * @param addressename
     */
    public void setAddressename(String addressename) {
        this.addressename = addressename;
    }

    /**
     * @return INSURERCNAME
     */
    public String getInsurercname() {
        return insurercname;
    }

    /**
     * @param insurercname
     */
    public void setInsurercname(String insurercname) {
        this.insurercname = insurercname;
    }

    /**
     * @return INSURERTNAME
     */
    public String getInsurertname() {
        return insurertname;
    }

    /**
     * @param insurertname
     */
    public void setInsurertname(String insurertname) {
        this.insurertname = insurertname;
    }

    /**
     * @return INSURERENAME
     */
    public String getInsurerename() {
        return insurerename;
    }

    /**
     * @param insurerename
     */
    public void setInsurerename(String insurerename) {
        this.insurerename = insurerename;
    }

    /**
     * @return UPPERCOMPANYCODE
     */
    public String getUppercompanycode() {
        return uppercompanycode;
    }

    /**
     * @param uppercompanycode
     */
    public void setUppercompanycode(String uppercompanycode) {
        this.uppercompanycode = uppercompanycode;
    }

    /**
     * @return COMATTRIBUTE
     */
    public String getComattribute() {
        return comattribute;
    }

    /**
     * @param comattribute
     */
    public void setComattribute(String comattribute) {
        this.comattribute = comattribute;
    }

    /**
     * @return COMTYPE
     */
    public String getComtype() {
        return comtype;
    }

    /**
     * @param comtype
     */
    public void setComtype(String comtype) {
        this.comtype = comtype;
    }

    /**
     * @return CENTERIND
     */
    public String getCenterind() {
        return centerind;
    }

    /**
     * @param centerind
     */
    public void setCenterind(String centerind) {
        this.centerind = centerind;
    }

    /**
     * @return COMLEVEL
     */
    public String getComlevel() {
        return comlevel;
    }

    /**
     * @param comlevel
     */
    public void setComlevel(String comlevel) {
        this.comlevel = comlevel;
    }

    /**
     * @return POSTCODE
     */
    public String getPostcode() {
        return postcode;
    }

    /**
     * @param postcode
     */
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    /**
     * @return PHONENUMBER
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * @param phonenumber
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    /**
     * @return FAXNUMBER
     */
    public String getFaxnumber() {
        return faxnumber;
    }

    /**
     * @param faxnumber
     */
    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }

    /**
     * @return MANAGER
     */
    public String getManager() {
        return manager;
    }

    /**
     * @param manager
     */
    public void setManager(String manager) {
        this.manager = manager;
    }

    /**
     * @return WEBADDRESS
     */
    public String getWebaddress() {
        return webaddress;
    }

    /**
     * @param webaddress
     */
    public void setWebaddress(String webaddress) {
        this.webaddress = webaddress;
    }

    /**
     * @return SERVICEPHONE
     */
    public String getServicephone() {
        return servicephone;
    }

    /**
     * @param servicephone
     */
    public void setServicephone(String servicephone) {
        this.servicephone = servicephone;
    }

    /**
     * @return REPORTPHONE
     */
    public String getReportphone() {
        return reportphone;
    }

    /**
     * @param reportphone
     */
    public void setReportphone(String reportphone) {
        this.reportphone = reportphone;
    }

    /**
     * @return CREATORCODE
     */
    public String getCreatorcode() {
        return creatorcode;
    }

    /**
     * @param creatorcode
     */
    public void setCreatorcode(String creatorcode) {
        this.creatorcode = creatorcode;
    }

    /**
     * @return CREATETIME
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * @return UPDATERCODE
     */
    public String getUpdatercode() {
        return updatercode;
    }

    /**
     * @param updatercode
     */
    public void setUpdatercode(String updatercode) {
        this.updatercode = updatercode;
    }

    /**
     * @return UPDATETIME
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * @param updatetime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * @return VALIDIND
     */
    public String getValidind() {
        return validind;
    }

    /**
     * @param validind
     */
    public void setValidind(String validind) {
        this.validind = validind;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return FLAG
     */
    public String getFlag() {
        return flag;
    }

    /**
     * @param flag
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * @return SHORTCNAME
     */
    public String getShortcname() {
        return shortcname;
    }

    /**
     * @param shortcname
     */
    public void setShortcname(String shortcname) {
        this.shortcname = shortcname;
    }

    /**
     * @return SHORTTNAME
     */
    public String getShorttname() {
        return shorttname;
    }

    /**
     * @param shorttname
     */
    public void setShorttname(String shorttname) {
        this.shorttname = shorttname;
    }

    /**
     * @return SHORTENAME
     */
    public String getShortename() {
        return shortename;
    }

    /**
     * @param shortename
     */
    public void setShortename(String shortename) {
        this.shortename = shortename;
    }

    /**
     * @return TAXNUMBER
     */
    public String getTaxnumber() {
        return taxnumber;
    }

    /**
     * @param taxnumber
     */
    public void setTaxnumber(String taxnumber) {
        this.taxnumber = taxnumber;
    }

    /**
     * @return EMAIL
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return PRINTPOLICYCOMCODE
     */
    public String getPrintpolicycomcode() {
        return printpolicycomcode;
    }

    /**
     * @param printpolicycomcode
     */
    public void setPrintpolicycomcode(String printpolicycomcode) {
        this.printpolicycomcode = printpolicycomcode;
    }

    /**
     * @return PRINTINVOICECOMCODE
     */
    public String getPrintinvoicecomcode() {
        return printinvoicecomcode;
    }

    /**
     * @param printinvoicecomcode
     */
    public void setPrintinvoicecomcode(String printinvoicecomcode) {
        this.printinvoicecomcode = printinvoicecomcode;
    }

    /**
     * @return CHANNEL_CODE
     */
    public String getChannelCode() {
        return channelCode;
    }

    /**
     * @param channelCode
     */
    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    /**
     * @return RUNSTATUS
     */
    public String getRunstatus() {
        return runstatus;
    }

    /**
     * @param runstatus
     */
    public void setRunstatus(String runstatus) {
        this.runstatus = runstatus;
    }

    /**
     * @return BUSINESSREPLYDATE
     */
    public Date getBusinessreplydate() {
        return businessreplydate;
    }

    /**
     * @param businessreplydate
     */
    public void setBusinessreplydate(Date businessreplydate) {
        this.businessreplydate = businessreplydate;
    }

    /**
     * @return BPERMITCOMCODE
     */
    public String getBpermitcomcode() {
        return bpermitcomcode;
    }

    /**
     * @param bpermitcomcode
     */
    public void setBpermitcomcode(String bpermitcomcode) {
        this.bpermitcomcode = bpermitcomcode;
    }

    /**
     * @return BUSINESSLICENSE
     */
    public String getBusinesslicense() {
        return businesslicense;
    }

    /**
     * @param businesslicense
     */
    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense;
    }

    /**
     * @return BPERMITSTARTDATE
     */
    public Date getBpermitstartdate() {
        return bpermitstartdate;
    }

    /**
     * @param bpermitstartdate
     */
    public void setBpermitstartdate(Date bpermitstartdate) {
        this.bpermitstartdate = bpermitstartdate;
    }

    /**
     * @return BPERMITENDDATE
     */
    public Date getBpermitenddate() {
        return bpermitenddate;
    }

    /**
     * @param bpermitenddate
     */
    public void setBpermitenddate(Date bpermitenddate) {
        this.bpermitenddate = bpermitenddate;
    }

    /**
     * @return BLICENSESTARTDATE
     */
    public Date getBlicensestartdate() {
        return blicensestartdate;
    }

    /**
     * @param blicensestartdate
     */
    public void setBlicensestartdate(Date blicensestartdate) {
        this.blicensestartdate = blicensestartdate;
    }

    /**
     * @return BLICENSEENDDATE
     */
    public Date getBlicenseenddate() {
        return blicenseenddate;
    }

    /**
     * @param blicenseenddate
     */
    public void setBlicenseenddate(Date blicenseenddate) {
        this.blicenseenddate = blicenseenddate;
    }

    /**
     * @return PROVINCECODE
     */
    public String getProvincecode() {
        return provincecode;
    }

    /**
     * @param provincecode
     */
    public void setProvincecode(String provincecode) {
        this.provincecode = provincecode;
    }

    /**
     * @return CITYCODE
     */
    public String getCitycode() {
        return citycode;
    }

    /**
     * @param citycode
     */
    public void setCitycode(String citycode) {
        this.citycode = citycode;
    }

    /**
     * @return COUNTRYCODE
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * @param countrycode
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
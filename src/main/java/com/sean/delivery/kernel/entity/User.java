package com.sean.delivery.kernel.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DS_UM_USER_DEF")
public class User {
    @Id
    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "USER_CODE")
    private String userCode;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "EMPLOYEE_ID")
    private String employeeId;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "USER_TYPE")
    private String userType;

    @Column(name = "USER_AD_ID")
    private String userAdId;

    @Column(name = "PWD_EXPIRE_DATE")
    private Date pwdExpireDate;

    @Column(name = "LOGON_FAILED_TIMES")
    private Long logonFailedTimes;

    @Column(name = "LOGON_STATUS")
    private String logonStatus;

    @Column(name = "HR_NO")
    private String hrNo;

    @Column(name = "CARD_NUMBER")
    private String cardNumber;

    @Column(name = "ENTRY_TIME")
    private Date entryTime;

    @Column(name = "MOBILE_PHONE_NUMBER")
    private String mobilePhoneNumber;

    @Column(name = "IP_ADDRESS")
    private String ipAddress;

    @Column(name = "MAC_ADDRESS")
    private String macAddress;

    @Column(name = "CREATED_BY")
    private String createdBy;

    @Column(name = "DATE_CREATED")
    private Date dateCreated;

    @Column(name = "UPDATE_BY")
    private String updateBy;

    @Column(name = "DATE_UPDATED")
    private Date dateUpdated;

    @Column(name = "VALID_FLAG")
    private String validFlag;

    @Column(name = "OLD_EMPLOYEE_ID")
    private Long oldEmployeeId;

    @Column(name = "COUNTERTYPE")
    private String countertype;

    @Column(name = "COMPANY_CODE")
    private String companyCode;

    /**
     * @return USER_ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return USER_CODE
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * @param userCode
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return EMPLOYEE_ID
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * @param employeeId
     */
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return USER_TYPE
     */
    public String getUserType() {
        return userType;
    }

    /**
     * @param userType
     */
    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return USER_AD_ID
     */
    public String getUserAdId() {
        return userAdId;
    }

    /**
     * @param userAdId
     */
    public void setUserAdId(String userAdId) {
        this.userAdId = userAdId;
    }

    /**
     * @return PWD_EXPIRE_DATE
     */
    public Date getPwdExpireDate() {
        return pwdExpireDate;
    }

    /**
     * @param pwdExpireDate
     */
    public void setPwdExpireDate(Date pwdExpireDate) {
        this.pwdExpireDate = pwdExpireDate;
    }

    /**
     * @return LOGON_FAILED_TIMES
     */
    public Long getLogonFailedTimes() {
        return logonFailedTimes;
    }

    /**
     * @param logonFailedTimes
     */
    public void setLogonFailedTimes(Long logonFailedTimes) {
        this.logonFailedTimes = logonFailedTimes;
    }

    /**
     * @return LOGON_STATUS
     */
    public String getLogonStatus() {
        return logonStatus;
    }

    /**
     * @param logonStatus
     */
    public void setLogonStatus(String logonStatus) {
        this.logonStatus = logonStatus;
    }

    /**
     * @return HR_NO
     */
    public String getHrNo() {
        return hrNo;
    }

    /**
     * @param hrNo
     */
    public void setHrNo(String hrNo) {
        this.hrNo = hrNo;
    }

    /**
     * @return CARD_NUMBER
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * @return ENTRY_TIME
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * @return MOBILE_PHONE_NUMBER
     */
    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * @param mobilePhoneNumber
     */
    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    /**
     * @return IP_ADDRESS
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * @param ipAddress
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * @return MAC_ADDRESS
     */
    public String getMacAddress() {
        return macAddress;
    }

    /**
     * @param macAddress
     */
    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    /**
     * @return CREATED_BY
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * @param createdBy
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * @return DATE_CREATED
     */
    public Date getDateCreated() {
        return dateCreated;
    }

    /**
     * @param dateCreated
     */
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    /**
     * @return UPDATE_BY
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * @return DATE_UPDATED
     */
    public Date getDateUpdated() {
        return dateUpdated;
    }

    /**
     * @param dateUpdated
     */
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    /**
     * @return VALID_FLAG
     */
    public String getValidFlag() {
        return validFlag;
    }

    /**
     * @param validFlag
     */
    public void setValidFlag(String validFlag) {
        this.validFlag = validFlag;
    }

    /**
     * @return OLD_EMPLOYEE_ID
     */
    public Long getOldEmployeeId() {
        return oldEmployeeId;
    }

    /**
     * @param oldEmployeeId
     */
    public void setOldEmployeeId(Long oldEmployeeId) {
        this.oldEmployeeId = oldEmployeeId;
    }

    /**
     * @return COUNTERTYPE
     */
    public String getCountertype() {
        return countertype;
    }

    /**
     * @param countertype
     */
    public void setCountertype(String countertype) {
        this.countertype = countertype;
    }

    /**
     * @return COMPANY_CODE
     */
    public String getCompanyCode() {
        return companyCode;
    }

    /**
     * @param companyCode
     */
    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
}
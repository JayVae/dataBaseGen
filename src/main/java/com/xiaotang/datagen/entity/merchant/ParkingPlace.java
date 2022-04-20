package com.xiaotang.datagen.entity.merchant;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class ParkingPlace implements Serializable {
    private String parkingplaceid;

    private String orduserid;

    private String parkinglotid;

    private Date regtime;
	/**
	 * 0 未使用 1已使用 2被外来车辆占用
	 */
    private String usestate;

    private String positionofmap;

    private String parkingplaceno;

    private BigDecimal punishment;

    private String parkingPlacePicture;

    private String housingUnit;

    private Integer versions;

    private Long pricingMode;

    private BigDecimal capPrice;

    private Double capBurningTime;

    private BigDecimal unitPrice;

    private Long sizePrice;

    private Long timeLength;

    private BigDecimal startPrice;

    private Integer delectState;
    /**
     * 0普通车位 1物业车位
     */
    private Integer propertySign;
	
    public ParkingPlace() {
    }

    public ParkingPlace(String parkingplaceid, String orduserid, String parkinglotid, Date regtime, String usestate, String positionofmap, String parkingplaceno, BigDecimal punishment, String parkingPlacePicture, String housingUnit, Integer versions, Long pricingMode, BigDecimal capPrice, Double capBurningTime, BigDecimal unitPrice, Long sizePrice, Long timeLength, BigDecimal startPrice, Integer delectState, Integer propertySign) {
        this.parkingplaceid = parkingplaceid;
        this.orduserid = orduserid;
        this.parkinglotid = parkinglotid;
        this.regtime = regtime;
        this.usestate = usestate;
        this.positionofmap = positionofmap;
        this.parkingplaceno = parkingplaceno;
        this.punishment = punishment;
        this.parkingPlacePicture = parkingPlacePicture;
        this.housingUnit = housingUnit;
        this.versions = versions;
        this.pricingMode = pricingMode;
        this.capPrice = capPrice;
        this.capBurningTime = capBurningTime;
        this.unitPrice = unitPrice;
        this.sizePrice = sizePrice;
        this.timeLength = timeLength;
        this.startPrice = startPrice;
        this.delectState = delectState;
        this.propertySign = propertySign;
    }

    public String getParkingplaceid() {
        return parkingplaceid;
    }

    public void setParkingplaceid(String parkingplaceid) {
        this.parkingplaceid = parkingplaceid;
    }

    public String getOrduserid() {
        return orduserid;
    }

    public void setOrduserid(String orduserid) {
        this.orduserid = orduserid;
    }

    public String getParkinglotid() {
        return parkinglotid;
    }

    public void setParkinglotid(String parkinglotid) {
        this.parkinglotid = parkinglotid;
    }

    public Date getRegtime() {
        return regtime;
    }

    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    public String getUsestate() {
        return usestate;
    }

    public void setUsestate(String usestate) {
        this.usestate = usestate;
    }

    public String getPositionofmap() {
        return positionofmap;
    }

    public void setPositionofmap(String positionofmap) {
        this.positionofmap = positionofmap;
    }

    public String getParkingplaceno() {
        return parkingplaceno;
    }

    public void setParkingplaceno(String parkingplaceno) {
        this.parkingplaceno = parkingplaceno;
    }

    public BigDecimal getPunishment() {
        return punishment;
    }

    public void setPunishment(BigDecimal punishment) {
        this.punishment = punishment;
    }

    public String getParkingPlacePicture() {
        return parkingPlacePicture;
    }

    public void setParkingPlacePicture(String parkingPlacePicture) {
        this.parkingPlacePicture = parkingPlacePicture;
    }

    public String getHousingUnit() {
        return housingUnit;
    }

    public void setHousingUnit(String housingUnit) {
        this.housingUnit = housingUnit;
    }

    public Integer getVersions() {
        return versions;
    }

    public void setVersions(Integer versions) {
        this.versions = versions;
    }

    public Long getPricingMode() {
        return pricingMode;
    }

    public void setPricingMode(Long pricingMode) {
        this.pricingMode = pricingMode;
    }

    public BigDecimal getCapPrice() {
        return capPrice;
    }

    public void setCapPrice(BigDecimal capPrice) {
        this.capPrice = capPrice;
    }

    public Double getCapBurningTime() {
        return capBurningTime;
    }

    public void setCapBurningTime(Double capBurningTime) {
        this.capBurningTime = capBurningTime;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getSizePrice() {
        return sizePrice;
    }

    public void setSizePrice(Long sizePrice) {
        this.sizePrice = sizePrice;
    }

    public Long getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(Long timeLength) {
        this.timeLength = timeLength;
    }

    public BigDecimal getStartPrice() {
        return startPrice;
    }

    public void setStartPrice(BigDecimal startPrice) {
        this.startPrice = startPrice;
    }

    public Integer getDelectState() {
        return delectState;
    }

    public void setDelectState(Integer delectState) {
        this.delectState = delectState;
    }

    public Integer getPropertySign() {
        return propertySign;
    }

    public void setPropertySign(Integer propertySign) {
        this.propertySign = propertySign;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingPlace that = (ParkingPlace) o;
        return Objects.equals(parkingplaceid, that.parkingplaceid) &&
                Objects.equals(orduserid, that.orduserid) &&
                Objects.equals(parkinglotid, that.parkinglotid) &&
                Objects.equals(regtime, that.regtime) &&
                Objects.equals(usestate, that.usestate) &&
                Objects.equals(positionofmap, that.positionofmap) &&
                Objects.equals(parkingplaceno, that.parkingplaceno) &&
                Objects.equals(punishment, that.punishment) &&
                Objects.equals(parkingPlacePicture, that.parkingPlacePicture) &&
                Objects.equals(housingUnit, that.housingUnit) &&
                Objects.equals(versions, that.versions) &&
                Objects.equals(pricingMode, that.pricingMode) &&
                Objects.equals(capPrice, that.capPrice) &&
                Objects.equals(capBurningTime, that.capBurningTime) &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(sizePrice, that.sizePrice) &&
                Objects.equals(timeLength, that.timeLength) &&
                Objects.equals(startPrice, that.startPrice) &&
                Objects.equals(delectState, that.delectState) &&
                Objects.equals(propertySign, that.propertySign);
    }

    @Override
    public int hashCode() {

        return Objects.hash(parkingplaceid, orduserid, parkinglotid, regtime, usestate, positionofmap, parkingplaceno, punishment, parkingPlacePicture, housingUnit, versions, pricingMode, capPrice, capBurningTime, unitPrice, sizePrice, timeLength, startPrice, delectState, propertySign);
    }

    @Override
    public String toString() {
        return "ParkingPlace{" +
                "parkingplaceid='" + parkingplaceid + '\'' +
                ", orduserid='" + orduserid + '\'' +
                ", parkinglotid='" + parkinglotid + '\'' +
                ", regtime=" + regtime +
                ", usestate='" + usestate + '\'' +
                ", positionofmap='" + positionofmap + '\'' +
                ", parkingplaceno='" + parkingplaceno + '\'' +
                ", punishment=" + punishment +
                ", parkingPlacePicture='" + parkingPlacePicture + '\'' +
                ", housingUnit='" + housingUnit + '\'' +
                ", versions=" + versions +
                ", pricingMode=" + pricingMode +
                ", capPrice=" + capPrice +
                ", capBurningTime=" + capBurningTime +
                ", unitPrice=" + unitPrice +
                ", sizePrice=" + sizePrice +
                ", timeLength=" + timeLength +
                ", startPrice=" + startPrice +
                ", delectState=" + delectState +
                ", propertySign=" + propertySign +
                '}';
    }
}
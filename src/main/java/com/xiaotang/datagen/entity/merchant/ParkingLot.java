package com.xiaotang.datagen.entity.merchant;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class ParkingLot implements Serializable {

    private String parkinglotid;

    private String housingEstateId;

    private String parkinglotname;

    private String parkinglotaddress;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private Integer parkingplacenum;

    private Integer freeparkingplacenum;

    private String note;

    private String state;

    private Long pricingMode;

    private BigDecimal punishment;

    private BigDecimal capPrice;

    private Double capBurningTime;

    private BigDecimal unitPrice;

    private Long sizePrice;

    private Long timeLength;

    private BigDecimal startPrice;

    private Integer delectState;

    public ParkingLot() {
    }

    public ParkingLot(String parkinglotid, String housingEstateId, String parkinglotname, String parkinglotaddress, BigDecimal longitude, BigDecimal latitude, Integer parkingplacenum, Integer freeparkingplacenum, String note, String state, Long pricingMode, BigDecimal punishment, BigDecimal capPrice, Double capBurningTime, BigDecimal unitPrice, Long sizePrice, Long timeLength, BigDecimal startPrice) {
        this.parkinglotid = parkinglotid;
        this.housingEstateId = housingEstateId;
        this.parkinglotname = parkinglotname;
        this.parkinglotaddress = parkinglotaddress;
        this.longitude = longitude;
        this.latitude = latitude;
        this.parkingplacenum = parkingplacenum;
        this.freeparkingplacenum = freeparkingplacenum;
        this.note = note;
        this.state = state;
        this.pricingMode = pricingMode;
        this.punishment = punishment;
        this.capPrice = capPrice;
        this.capBurningTime = capBurningTime;
        this.unitPrice = unitPrice;
        this.sizePrice = sizePrice;
        this.timeLength = timeLength;
        this.startPrice = startPrice;
    }

    public String getParkinglotid() {
        return parkinglotid;
    }

    public void setParkinglotid(String parkinglotid) {
        this.parkinglotid = parkinglotid;
    }

    public String getHousingEstateId() {
        return housingEstateId;
    }

    public void setHousingEstateId(String housingEstateId) {
        this.housingEstateId = housingEstateId;
    }

    public String getParkinglotname() {
        return parkinglotname;
    }

    public void setParkinglotname(String parkinglotname) {
        this.parkinglotname = parkinglotname;
    }

    public String getParkinglotaddress() {
        return parkinglotaddress;
    }

    public void setParkinglotaddress(String parkinglotaddress) {
        this.parkinglotaddress = parkinglotaddress;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public Integer getParkingplacenum() {
        return parkingplacenum;
    }

    public void setParkingplacenum(Integer parkingplacenum) {
        this.parkingplacenum = parkingplacenum;
    }

    public Integer getFreeparkingplacenum() {
        return freeparkingplacenum;
    }

    public void setFreeparkingplacenum(Integer freeparkingplacenum) {
        this.freeparkingplacenum = freeparkingplacenum;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getPricingMode() {
        return pricingMode;
    }

    public void setPricingMode(Long pricingMode) {
        this.pricingMode = pricingMode;
    }

    public BigDecimal getPunishment() {
        return punishment;
    }

    public void setPunishment(BigDecimal punishment) {
        this.punishment = punishment;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingLot that = (ParkingLot) o;
        return Objects.equals(parkinglotid, that.parkinglotid) &&
                Objects.equals(housingEstateId, that.housingEstateId) &&
                Objects.equals(parkinglotname, that.parkinglotname) &&
                Objects.equals(parkinglotaddress, that.parkinglotaddress) &&
                Objects.equals(longitude, that.longitude) &&
                Objects.equals(latitude, that.latitude) &&
                Objects.equals(parkingplacenum, that.parkingplacenum) &&
                Objects.equals(freeparkingplacenum, that.freeparkingplacenum) &&
                Objects.equals(note, that.note) &&
                Objects.equals(state, that.state) &&
                Objects.equals(pricingMode, that.pricingMode) &&
                Objects.equals(punishment, that.punishment) &&
                Objects.equals(capPrice, that.capPrice) &&
                Objects.equals(capBurningTime, that.capBurningTime) &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(sizePrice, that.sizePrice) &&
                Objects.equals(timeLength, that.timeLength) &&
                Objects.equals(startPrice, that.startPrice);
    }

    @Override
    public int hashCode() {

        return Objects.hash(parkinglotid, housingEstateId, parkinglotname, parkinglotaddress, longitude, latitude, parkingplacenum, freeparkingplacenum, note, state, pricingMode, punishment, capPrice, capBurningTime, unitPrice, sizePrice, timeLength, startPrice);
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "parkinglotid='" + parkinglotid + '\'' +
                ", housingEstateId='" + housingEstateId + '\'' +
                ", parkinglotname='" + parkinglotname + '\'' +
                ", parkinglotaddress='" + parkinglotaddress + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                ", parkingplacenum=" + parkingplacenum +
                ", freeparkingplacenum=" + freeparkingplacenum +
                ", note='" + note + '\'' +
                ", state='" + state + '\'' +
                ", pricingMode=" + pricingMode +
                ", punishment=" + punishment +
                ", capPrice=" + capPrice +
                ", capBurningTime=" + capBurningTime +
                ", unitPrice=" + unitPrice +
                ", sizePrice=" + sizePrice +
                ", timeLength=" + timeLength +
                ", startPrice=" + startPrice +
                '}';
    }
}
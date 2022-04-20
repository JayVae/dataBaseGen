package com.xiaotang.datagen.entity.merchant;

import java.util.Date;
import java.util.Objects;

public class ParkingplaceFreetime {//车位空闲时间
    private String parkingplacefreetimeid;

    private String parkingplaceid;

    private String orduserid;

    private Date freetimebucketbegin;

    private Date freetimebucketend;

    private String ruletype;

    private Double unitprice;

    private Float unittimelong;

    private Double startprice;

    private Float starttimelong;

    private Double punishunitprice;

    private Float punishunittimelong;

    private String punishtype;

    private String usestate;

    private String isappointment;

    private String isvalid;

    public String getParkingplacefreetimeid() {
        return parkingplacefreetimeid;
    }

    public void setParkingplacefreetimeid(String parkingplacefreetimeid) {
        this.parkingplacefreetimeid = parkingplacefreetimeid == null ? null : parkingplacefreetimeid.trim();
    }

    public String getParkingplaceid() {
        return parkingplaceid;
    }

    public void setParkingplaceid(String parkingplaceid) {
        this.parkingplaceid = parkingplaceid == null ? null : parkingplaceid.trim();
    }

    public String getOrduserid() {
        return orduserid;
    }

    public void setOrduserid(String orduserid) {
        this.orduserid = orduserid == null ? null : orduserid.trim();
    }

    public Date getFreetimebucketbegin() {
        return freetimebucketbegin;
    }

    public void setFreetimebucketbegin(Date freetimebucketbegin) {
        this.freetimebucketbegin = freetimebucketbegin;
    }

    public Date getFreetimebucketend() {
        return freetimebucketend;
    }

    public void setFreetimebucketend(Date freetimebucketend) {
        this.freetimebucketend = freetimebucketend;
    }

    public String getRuletype() {
        return ruletype;
    }

    public void setRuletype(String ruletype) {
        this.ruletype = ruletype == null ? null : ruletype.trim();
    }

    public Double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(Double unitprice) {
        this.unitprice = unitprice;
    }

    public Float getUnittimelong() {
        return unittimelong;
    }

    public void setUnittimelong(Float unittimelong) {
        this.unittimelong = unittimelong;
    }

    public Double getStartprice() {
        return startprice;
    }

    public void setStartprice(Double startprice) {
        this.startprice = startprice;
    }

    public Float getStarttimelong() {
        return starttimelong;
    }

    public void setStarttimelong(Float starttimelong) {
        this.starttimelong = starttimelong;
    }

    public Double getPunishunitprice() {
        return punishunitprice;
    }

    public void setPunishunitprice(Double punishunitprice) {
        this.punishunitprice = punishunitprice;
    }

    public Float getPunishunittimelong() {
        return punishunittimelong;
    }

    public void setPunishunittimelong(Float punishunittimelong) {
        this.punishunittimelong = punishunittimelong;
    }

    public String getPunishtype() {
        return punishtype;
    }

    public void setPunishtype(String punishtype) {
        this.punishtype = punishtype == null ? null : punishtype.trim();
    }

    public String getUsestate() {
        return usestate;
    }

    public void setUsestate(String usestate) {
        this.usestate = usestate == null ? null : usestate.trim();
    }

    public String getIsappointment() {
        return isappointment;
    }

    public void setIsappointment(String isappointment) {
        this.isappointment = isappointment == null ? null : isappointment.trim();
    }

    public String getIsvalid() {
        return isvalid;
    }

    public void setIsvalid(String isvalid) {
        this.isvalid = isvalid == null ? null : isvalid.trim();
    }

    public ParkingplaceFreetime() {
    }

    public ParkingplaceFreetime(String parkingplacefreetimeid, String parkingplaceid, String orduserid, Date freetimebucketbegin, Date freetimebucketend, String ruletype, Double unitprice, Float unittimelong, Double startprice, Float starttimelong, Double punishunitprice, Float punishunittimelong, String punishtype, String usestate, String isappointment, String isvalid) {
        this.parkingplacefreetimeid = parkingplacefreetimeid;
        this.parkingplaceid = parkingplaceid;
        this.orduserid = orduserid;
        this.freetimebucketbegin = freetimebucketbegin;
        this.freetimebucketend = freetimebucketend;
        this.ruletype = ruletype;
        this.unitprice = unitprice;
        this.unittimelong = unittimelong;
        this.startprice = startprice;
        this.starttimelong = starttimelong;
        this.punishunitprice = punishunitprice;
        this.punishunittimelong = punishunittimelong;
        this.punishtype = punishtype;
        this.usestate = usestate;
        this.isappointment = isappointment;
        this.isvalid = isvalid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingplaceFreetime that = (ParkingplaceFreetime) o;
        return Objects.equals(parkingplacefreetimeid, that.parkingplacefreetimeid) &&
                Objects.equals(parkingplaceid, that.parkingplaceid) &&
                Objects.equals(orduserid, that.orduserid) &&
                Objects.equals(freetimebucketbegin, that.freetimebucketbegin) &&
                Objects.equals(freetimebucketend, that.freetimebucketend) &&
                Objects.equals(ruletype, that.ruletype) &&
                Objects.equals(unitprice, that.unitprice) &&
                Objects.equals(unittimelong, that.unittimelong) &&
                Objects.equals(startprice, that.startprice) &&
                Objects.equals(starttimelong, that.starttimelong) &&
                Objects.equals(punishunitprice, that.punishunitprice) &&
                Objects.equals(punishunittimelong, that.punishunittimelong) &&
                Objects.equals(punishtype, that.punishtype) &&
                Objects.equals(usestate, that.usestate) &&
                Objects.equals(isappointment, that.isappointment) &&
                Objects.equals(isvalid, that.isvalid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(parkingplacefreetimeid, parkingplaceid, orduserid, freetimebucketbegin, freetimebucketend, ruletype, unitprice, unittimelong, startprice, starttimelong, punishunitprice, punishunittimelong, punishtype, usestate, isappointment, isvalid);
    }

    @Override
    public String toString() {
        return "ParkingplaceFreetime{" +
                "parkingplacefreetimeid='" + parkingplacefreetimeid + '\'' +
                ", parkingplaceid='" + parkingplaceid + '\'' +
                ", orduserid='" + orduserid + '\'' +
                ", freetimebucketbegin=" + freetimebucketbegin +
                ", freetimebucketend=" + freetimebucketend +
                ", ruletype='" + ruletype + '\'' +
                ", unitprice=" + unitprice +
                ", unittimelong=" + unittimelong +
                ", startprice=" + startprice +
                ", starttimelong=" + starttimelong +
                ", punishunitprice=" + punishunitprice +
                ", punishunittimelong=" + punishunittimelong +
                ", punishtype='" + punishtype + '\'' +
                ", usestate='" + usestate + '\'' +
                ", isappointment='" + isappointment + '\'' +
                ", isvalid='" + isvalid + '\'' +
                '}';
    }
}
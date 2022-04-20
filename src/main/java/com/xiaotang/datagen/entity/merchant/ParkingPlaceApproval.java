package com.xiaotang.datagen.entity.merchant;

import java.util.Date;
import java.util.Objects;

public class ParkingPlaceApproval {
    private String parkingplaceapprovalid;

    private String parkingplaceid;

    private String orduserid;

    private String propertyuserid;

    private String sysuserid;
    /**
     * 0 未审核 1审核通过  2审核不通过
     */
    private String approvalstate;

    private String reason;

    private Date applytime;

    private Date approvaltime;

    private String note;

    public String getParkingplaceapprovalid() {
        return parkingplaceapprovalid;
    }

    public void setParkingplaceapprovalid(String parkingplaceapprovalid) {
        this.parkingplaceapprovalid = parkingplaceapprovalid == null ? null : parkingplaceapprovalid.trim();
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

    public String getPropertyuserid() {
        return propertyuserid;
    }

    public void setPropertyuserid(String propertyuserid) {
        this.propertyuserid = propertyuserid == null ? null : propertyuserid.trim();
    }

    public String getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(String sysuserid) {
        this.sysuserid = sysuserid == null ? null : sysuserid.trim();
    }

    public String getApprovalstate() {
        return approvalstate;
    }

    public void setApprovalstate(String approvalstate) {
        this.approvalstate = approvalstate == null ? null : approvalstate.trim();
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getApplytime() {
        return applytime;
    }

    public void setApplytime(Date applytime) {
        this.applytime = applytime;
    }

    public Date getApprovaltime() {
        return approvaltime;
    }

    public void setApprovaltime(Date approvaltime) {
        this.approvaltime = approvaltime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public ParkingPlaceApproval() {
    }

    public ParkingPlaceApproval(String parkingplaceapprovalid, String parkingplaceid, String orduserid, String propertyuserid, String sysuserid, String approvalstate, String reason, Date applytime, Date approvaltime, String note) {
        this.parkingplaceapprovalid = parkingplaceapprovalid;
        this.parkingplaceid = parkingplaceid;
        this.orduserid = orduserid;
        this.propertyuserid = propertyuserid;
        this.sysuserid = sysuserid;
        this.approvalstate = approvalstate;
        this.reason = reason;
        this.applytime = applytime;
        this.approvaltime = approvaltime;
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParkingPlaceApproval that = (ParkingPlaceApproval) o;
        return Objects.equals(parkingplaceapprovalid, that.parkingplaceapprovalid) &&
                Objects.equals(parkingplaceid, that.parkingplaceid) &&
                Objects.equals(orduserid, that.orduserid) &&
                Objects.equals(propertyuserid, that.propertyuserid) &&
                Objects.equals(sysuserid, that.sysuserid) &&
                Objects.equals(approvalstate, that.approvalstate) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(applytime, that.applytime) &&
                Objects.equals(approvaltime, that.approvaltime) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {

        return Objects.hash(parkingplaceapprovalid, parkingplaceid, orduserid, propertyuserid, sysuserid, approvalstate, reason, applytime, approvaltime, note);
    }

    @Override
    public String toString() {
        return "ParkingPlaceApproval{" +
                "parkingplaceapprovalid='" + parkingplaceapprovalid + '\'' +
                ", parkingplaceid='" + parkingplaceid + '\'' +
                ", orduserid='" + orduserid + '\'' +
                ", propertyuserid='" + propertyuserid + '\'' +
                ", sysuserid='" + sysuserid + '\'' +
                ", approvalstate='" + approvalstate + '\'' +
                ", reason='" + reason + '\'' +
                ", applytime=" + applytime +
                ", approvaltime=" + approvaltime +
                ", note='" + note + '\'' +
                '}';
    }
}
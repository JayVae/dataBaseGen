package com.xiaotang.datagen.entity.merchant;

import java.io.Serializable;
import java.util.Objects;

public class PropertyCompany implements Serializable {
    private String propertycompanyid;

    private String propertyUserID;

    private String pcompanyname;

    private String commerlicens;

    private String legalname;

    private String phone;

    private String address;

    private String note;

    private Integer delectState;

    public String getPropertycompanyid() {
        return propertycompanyid;
    }

    public void setPropertycompanyid(String propertycompanyid) {
        this.propertycompanyid = propertycompanyid == null ? null : propertycompanyid.trim();
    }

    public String getPcompanyname() {
        return pcompanyname;
    }

    public void setPcompanyname(String pcompanyname) {
        this.pcompanyname = pcompanyname == null ? null : pcompanyname.trim();
    }

    public String getCommerlicens() {
        return commerlicens;
    }

    public void setCommerlicens(String commerlicens) {
        this.commerlicens = commerlicens == null ? null : commerlicens.trim();
    }

    public String getLegalname() {
        return legalname;
    }

    public void setLegalname(String legalname) {
        this.legalname = legalname == null ? null : legalname.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getDelectState() {
        return delectState;
    }

    public void setDelectState(Integer delectState) {
        this.delectState = delectState;
    }

    public PropertyCompany() {
    }

    public PropertyCompany(String propertycompanyid, String pcompanyname, String commerlicens, String legalname, String phone, String address, String note) {
        this.propertycompanyid = propertycompanyid;
        this.pcompanyname = pcompanyname;
        this.commerlicens = commerlicens;
        this.legalname = legalname;
        this.phone = phone;
        this.address = address;
        this.note = note;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyCompany that = (PropertyCompany) o;
        return Objects.equals(propertycompanyid, that.propertycompanyid) &&
                Objects.equals(pcompanyname, that.pcompanyname) &&
                Objects.equals(commerlicens, that.commerlicens) &&
                Objects.equals(legalname, that.legalname) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(note, that.note);
    }

    @Override
    public int hashCode() {

        return Objects.hash(propertycompanyid, pcompanyname, commerlicens, legalname, phone, address, note);
    }

    @Override
    public String toString() {
        return "PropertyCompany{" +
                "propertycompanyid='" + propertycompanyid + '\'' +
                ", pcompanyname='" + pcompanyname + '\'' +
                ", commerlicens='" + commerlicens + '\'' +
                ", legalname='" + legalname + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    public PropertyCompany(String propertycompanyid, String propertyUserID, String pcompanyname, String commerlicens, String legalname, String phone, String address, String note) {
        this.propertycompanyid = propertycompanyid;
        this.propertyUserID = propertyUserID;
        this.pcompanyname = pcompanyname;
        this.commerlicens = commerlicens;
        this.legalname = legalname;
        this.phone = phone;
        this.address = address;
        this.note = note;
    }

    public String getPropertyUserID() {
        return propertyUserID;
    }

    public void setPropertyUserID(String propertyUserID) {
        this.propertyUserID = propertyUserID;
    }
}
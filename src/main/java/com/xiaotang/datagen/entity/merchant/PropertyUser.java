package com.xiaotang.datagen.entity.merchant;

import java.io.Serializable;
import java.util.Objects;

public class PropertyUser implements Serializable {
    private String propertyuserid;

    private String accountId;

    private String propertyusername;

    private String phone;

    private String address;

    private String note;

    private String state;

    private Integer delectState;

    public String getPropertyuserid() {
        return propertyuserid;
    }

    public void setPropertyuserid(String propertyuserid) {
        this.propertyuserid = propertyuserid == null ? null : propertyuserid.trim();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    public String getPropertyusername() {
        return propertyusername;
    }

    public void setPropertyusername(String propertyusername) {
        this.propertyusername = propertyusername == null ? null : propertyusername.trim();
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getDelectState() {
        return delectState;
    }

    public void setDelectState(Integer delectState) {
        this.delectState = delectState;
    }

    public PropertyUser() {
    }

    public PropertyUser(String propertyuserid, String accountId, String propertyusername, String phone, String address, String note, String state) {
        this.propertyuserid = propertyuserid;
        this.accountId = accountId;
        this.propertyusername = propertyusername;
        this.phone = phone;
        this.address = address;
        this.note = note;
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PropertyUser that = (PropertyUser) o;
        return Objects.equals(propertyuserid, that.propertyuserid) &&
                Objects.equals(accountId, that.accountId) &&
                Objects.equals(propertyusername, that.propertyusername) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(address, that.address) &&
                Objects.equals(note, that.note) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {

        return Objects.hash(propertyuserid, accountId, propertyusername, phone, address, note, state);
    }

    @Override
    public String toString() {
        return "PropertyUser{" +
                "propertyuserid='" + propertyuserid + '\'' +
                ", accountId='" + accountId + '\'' +
                ", propertyusername='" + propertyusername + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", note='" + note + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
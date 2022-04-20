package com.xiaotang.datagen.entity.user;

import java.util.Date;

public class UserCar {
    private String usercarid;

    private String orduserid;

    private String carnumber;

    private String cartype;

    private String carmodels;

    private String licensepic;

    private Date registerdate;

    private String state;

    private String vehicleidentificationcode;

    private String owner;

    private String usecharacter;

    private String address;

    private Integer delectState;


    public String getUsercarid() {
        return usercarid;
    }

    public void setUsercarid(String usercarid) {
        this.usercarid = usercarid == null ? null : usercarid.trim();
    }

    public Object getOrduserid() {
        return orduserid;
    }

    public void setOrduserid(String orduserid) {
        this.orduserid = orduserid;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber == null ? null : carnumber.trim();
    }

    public String getCartype() {
        return cartype;
    }

    public void setCartype(String cartype) {
        this.cartype = cartype == null ? null : cartype.trim();
    }

    public String getCarmodels() {
        return carmodels;
    }

    public void setCarmodels(String carmodels) {
        this.carmodels = carmodels == null ? null : carmodels.trim();
    }

    public String getLicensepic() {
        return licensepic;
    }

    public void setLicensepic(String licensepic) {
        this.licensepic = licensepic == null ? null : licensepic.trim();
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getVehicleidentificationcode() {
        return vehicleidentificationcode;
    }

    public void setVehicleidentificationcode(String vehicleidentificationcode) {
        this.vehicleidentificationcode = vehicleidentificationcode == null ? null : vehicleidentificationcode.trim();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner == null ? null : owner.trim();
    }

    public String getUsecharacter() {
        return usecharacter;
    }

    public void setUsecharacter(String usecharacter) {
        this.usecharacter = usecharacter == null ? null : usecharacter.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Integer getDelectState() {
        return delectState;
    }

    public void setDelectState(Integer delectState) {
        this.delectState = delectState;
    }
}
package com.xiaotang.datagen.entity.merchant;

import java.util.Date;

public class ParkingSlots {
    private String parkingSlotsId;

    private String housingEstateName;

    private String carNum;

    private String carOwnerName;

    private String carOwnerPhone;

    private Date entranceTime;

    private Date leaveTime;

    public String getParkingSlotsId() {
        return parkingSlotsId;
    }

    public void setParkingSlotsId(String parkingSlotsId) {
        this.parkingSlotsId = parkingSlotsId == null ? null : parkingSlotsId.trim();
    }

    public String getHousingEstateName() {
        return housingEstateName;
    }

    public void setHousingEstateName(String housingEstateName) {
        this.housingEstateName = housingEstateName == null ? null : housingEstateName.trim();
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public String getCarOwnerName() {
        return carOwnerName;
    }

    public void setCarOwnerName(String carOwnerName) {
        this.carOwnerName = carOwnerName == null ? null : carOwnerName.trim();
    }

    public String getCarOwnerPhone() {
        return carOwnerPhone;
    }

    public void setCarOwnerPhone(String carOwnerPhone) {
        this.carOwnerPhone = carOwnerPhone == null ? null : carOwnerPhone.trim();
    }

    public Date getEntranceTime() {
        return entranceTime;
    }

    public void setEntranceTime(Date entranceTime) {
        this.entranceTime = entranceTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }
}
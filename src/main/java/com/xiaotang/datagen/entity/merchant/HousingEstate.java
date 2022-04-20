package com.xiaotang.datagen.entity.merchant;

import java.math.BigDecimal;

public class HousingEstate {
    /**
     * 楼盘Id
     */
    private String housingEstateId;

    private String propertycompanyid;

    private String housingEstateName;

    private BigDecimal longitude;

    private BigDecimal latitude;

    private String housingEstateNickName;

    private String sysuserId;

    private Integer delectState;

    private String address;

    public String getHousingEstateId() {
        return housingEstateId;
    }

    public void setHousingEstateId(String housingEstateId) {
        this.housingEstateId = housingEstateId == null ? null : housingEstateId.trim();
    }

    public String getPropertycompanyid() {
        return propertycompanyid;
    }

    public void setPropertycompanyid(String propertycompanyid) {
        this.propertycompanyid = propertycompanyid == null ? null : propertycompanyid.trim();
    }

    public String getHousingEstateName() {
        return housingEstateName;
    }

    public void setHousingEstateName(String housingEstateName) {
        this.housingEstateName = housingEstateName == null ? null : housingEstateName.trim();
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

    public String getHousingEstateNickName() {
        return housingEstateNickName;
    }

    public void setHousingEstateNickName(String housingEstateNickName) {
        this.housingEstateNickName = housingEstateNickName == null ? null : housingEstateNickName.trim();
    }
    public String getSysuserId() {
        return sysuserId;
    }

    public void setSysuserId(String sysuserId) {
        this.sysuserId = sysuserId == null ? null : sysuserId.trim();
    }

    public Integer getDelectState() {
        return delectState;
    }

    public void setDelectState(Integer delectState) {
        this.delectState = delectState;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

	@Override
	public String toString() {
		return "HousingEstate [housingEstateId=" + housingEstateId + ", propertycompanyid=" + propertycompanyid
				+ ", housingEstateName=" + housingEstateName + ", longitude=" + longitude + ", latitude=" + latitude
				+ ", housingEstateNickName=" + housingEstateNickName + ", sysuserId=" + sysuserId + ", delectState="
				+ delectState + ", address=" + address + "]";
	}
    
    
}
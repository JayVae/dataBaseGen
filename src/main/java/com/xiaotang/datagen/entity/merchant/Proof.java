package com.xiaotang.datagen.entity.merchant;



import java.util.Date;

public class Proof {
    private String proofId;

    private String parkinglotid;

    private String carNum;

    private String orduserid;

    private String parkingplaceno;


    private Date proofTime;

    private String proofNotes;
    /**
     * 0未审核 1审核通过 2审核不通过
     */
    private Integer proofState;

    private String proofPhoto;

    private String relevanceProofId;

    private Integer proofType;

    private String byOrduserid;

    private String poId;

    public String getProofId() {
        return proofId;
    }

    public void setProofId(String proofId) {
        this.proofId = proofId == null ? null : proofId.trim();
    }

    public String getParkinglotid() {
        return parkinglotid;
    }

    public void setParkinglotid(String parkinglotid) {
        this.parkinglotid = parkinglotid == null ? null : parkinglotid.trim();
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public String getOrduserid() {
        return orduserid;
    }

    public void setOrduserid(String orduserid) {
        this.orduserid = orduserid == null ? null : orduserid.trim();
    }

    public String getParkingplaceno() {
        return parkingplaceno;
    }

    public void setParkingplaceno(String parkingplaceno) {
        this.parkingplaceno = parkingplaceno == null ? null : parkingplaceno.trim();
    }

    public Date getProofTime() {
        return proofTime;
    }

    public void setProofTime(Date proofTime) {
        this.proofTime = proofTime;
    }

    public String getProofNotes() {
        return proofNotes;
    }

    public void setProofNotes(String proofNotes) {
        this.proofNotes = proofNotes == null ? null : proofNotes.trim();
    }

    public Integer getProofState() {
        return proofState;
    }

    public void setProofState(Integer proofState) {
        this.proofState = proofState;
    }

    public String getProofPhoto() {
        return proofPhoto;
    }

    public void setProofPhoto(String proofPhoto) {
        this.proofPhoto = proofPhoto == null ? null : proofPhoto.trim();
    }

    public String getRelevanceProofId() {
        return relevanceProofId;
    }

    public void setRelevanceProofId(String relevanceProofId) {
        this.relevanceProofId = relevanceProofId == null ? null : relevanceProofId.trim();
    }

    public Integer getProofType() {
        return proofType;
    }

    public void setProofType(Integer proofType) {
        this.proofType = proofType;
    }

    public String getByOrduserid() {
        return byOrduserid;
    }

    public void setByOrduserid(String byOrduserid) {
        this.byOrduserid = byOrduserid == null ? null : byOrduserid.trim();
    }

    public String getPoId() {
        return poId;
    }

    public void setPoId(String poId) {
        this.poId = poId == null ? null : poId.trim();
    }

	@Override
	public String toString() {
		return "Proof [proofId=" + proofId + ", parkinglotid=" + parkinglotid + ", carNum=" + carNum + ", orduserid="
				+ orduserid + ", parkingplaceno=" + parkingplaceno + ", proofTime=" + proofTime + ", proofNotes="
				+ proofNotes + ", proofState=" + proofState + ", proofPhoto=" + proofPhoto + ", relevanceProofId="
				+ relevanceProofId + ", proofType=" + proofType + ", byOrduserid=" + byOrduserid + ", poId=" + poId
				+ "]";
	}
    
    
}
package com.xiaotang.datagen.entity.sys;

import java.io.Serializable;

public class ScoreRecord implements Serializable {
    private String scoreRecordId;

    private String scoreRecordObjectId;

    private Integer scoreRecordType;

    private Integer scoreRecordNum;

    private Integer scorePeopleNum;

    private static final long serialVersionUID = 1L;

    public String getScoreRecordId() {
        return scoreRecordId;
    }

    public void setScoreRecordId(String scoreRecordId) {
        this.scoreRecordId = scoreRecordId == null ? null : scoreRecordId.trim();
    }

    public String getScoreRecordObjectId() {
        return scoreRecordObjectId;
    }

    public void setScoreRecordObjectId(String scoreRecordObjectId) {
        this.scoreRecordObjectId = scoreRecordObjectId == null ? null : scoreRecordObjectId.trim();
    }

    public Integer getScoreRecordType() {
        return scoreRecordType;
    }

    public void setScoreRecordType(Integer scoreRecordType) {
        this.scoreRecordType = scoreRecordType;
    }

    public Integer getScoreRecordNum() {
        return scoreRecordNum;
    }

    public void setScoreRecordNum(Integer scoreRecordNum) {
        this.scoreRecordNum = scoreRecordNum;
    }

    public Integer getScorePeopleNum() {
        return scorePeopleNum;
    }

    public void setScorePeopleNum(Integer scorePeopleNum) {
        this.scorePeopleNum = scorePeopleNum;
    }
}
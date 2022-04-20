package com.xiaotang.datagen.entity.sys;

public class QuestionAnswering {
    private String questionAnsweringId;
    /**
     * 0已回复  1未回复
     */
    private Integer questionAnsweringType;

    private String questionAnsweringValue;

    private String questionAnsweringExplain;

    private String questionAnsweringNote;

    private String openId;

    public String getQuestionAnsweringId() {
        return questionAnsweringId;
    }

    public void setQuestionAnsweringId(String questionAnsweringId) {
        this.questionAnsweringId = questionAnsweringId == null ? null : questionAnsweringId.trim();
    }

    public Integer getQuestionAnsweringType() {
        return questionAnsweringType;
    }

    public void setQuestionAnsweringType(Integer questionAnsweringType) {
        this.questionAnsweringType = questionAnsweringType;
    }

    public String getQuestionAnsweringValue() {
        return questionAnsweringValue;
    }

    public void setQuestionAnsweringValue(String questionAnsweringValue) {
        this.questionAnsweringValue = questionAnsweringValue == null ? null : questionAnsweringValue.trim();
    }

    public String getQuestionAnsweringExplain() {
        return questionAnsweringExplain;
    }

    public void setQuestionAnsweringExplain(String questionAnsweringExplain) {
        this.questionAnsweringExplain = questionAnsweringExplain == null ? null : questionAnsweringExplain.trim();
    }

    public String getQuestionAnsweringNote() {
        return questionAnsweringNote;
    }

    public void setQuestionAnsweringNote(String questionAnsweringNote) {
        this.questionAnsweringNote = questionAnsweringNote == null ? null : questionAnsweringNote.trim();
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId == null ? null : openId.trim();
    }
}
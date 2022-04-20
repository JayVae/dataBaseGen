package com.xiaotang.datagen.entity.sys;

import java.io.Serializable;
import java.util.Date;

public class ChattingRecords implements Serializable {
    private String chattingRecordsId;

    private String chattingRecordsContent;
    /**
     * 0客服  1用户
     */
    private Integer chattingRecordsType;

    private String chattingSendAccountId;

    private String chattingReceiveAccountId;

    private String chattingRecordsNotes;

    private Date chattingCreateTime;

    private static final long serialVersionUID = 1L;

    public String getChattingRecordsId() {
        return chattingRecordsId;
    }

    public void setChattingRecordsId(String chattingRecordsId) {
        this.chattingRecordsId = chattingRecordsId == null ? null : chattingRecordsId.trim();
    }

    public String getChattingRecordsContent() {
        return chattingRecordsContent;
    }

    public void setChattingRecordsContent(String chattingRecordsContent) {
        this.chattingRecordsContent = chattingRecordsContent == null ? null : chattingRecordsContent.trim();
    }

    public Integer getChattingRecordsType() {
        return chattingRecordsType;
    }

    public void setChattingRecordsType(Integer chattingRecordsType) {
        this.chattingRecordsType = chattingRecordsType;
    }

    public String getChattingSendAccountId() {
        return chattingSendAccountId;
    }

    public void setChattingSendAccountId(String chattingSendAccountId) {
        this.chattingSendAccountId = chattingSendAccountId == null ? null : chattingSendAccountId.trim();
    }

    public String getChattingReceiveAccountId() {
        return chattingReceiveAccountId;
    }

    public void setChattingReceiveAccountId(String chattingReceiveAccountId) {
        this.chattingReceiveAccountId = chattingReceiveAccountId == null ? null : chattingReceiveAccountId.trim();
    }

    public String getChattingRecordsNotes() {
        return chattingRecordsNotes;
    }

    public void setChattingRecordsNotes(String chattingRecordsNotes) {
        this.chattingRecordsNotes = chattingRecordsNotes == null ? null : chattingRecordsNotes.trim();
    }

    public Date getChattingCreateTime() {
        return chattingCreateTime;
    }

    public void setChattingCreateTime(Date chattingCreateTime) {
        this.chattingCreateTime = chattingCreateTime;
    }
}
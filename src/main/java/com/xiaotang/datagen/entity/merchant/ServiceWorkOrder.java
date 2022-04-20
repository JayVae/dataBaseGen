package com.xiaotang.datagen.entity.merchant;



import java.io.Serializable;
import java.util.Date;

public class ServiceWorkOrder implements Serializable {
    private String serviceWorkOrderId;

    private String sysuserid;
    /**
     * 电话客服 0 在线客服1
     */
    private Integer workOrderType;


    private Date workOrderCreateTime;

    private String workOrderContent;


    private Date workOrderOperationTime;
    /**
     * 0待解决 1已解决 2已关闭 3指派
     */
    private Integer workOrderState;

    private String workOrderResult;

    private String workOrderNotes;

    private static final long serialVersionUID = 1L;

    public String getServiceWorkOrderId() {
        return serviceWorkOrderId;
    }

    public void setServiceWorkOrderId(String serviceWorkOrderId) {
        this.serviceWorkOrderId = serviceWorkOrderId == null ? null : serviceWorkOrderId.trim();
    }

    public String getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(String sysuserid) {
        this.sysuserid = sysuserid == null ? null : sysuserid.trim();
    }

    public Integer getWorkOrderType() {
        return workOrderType;
    }

    public void setWorkOrderType(Integer workOrderType) {
        this.workOrderType = workOrderType;
    }

    public Date getWorkOrderCreateTime() {
        return workOrderCreateTime;
    }

    public void setWorkOrderCreateTime(Date workOrderCreateTime) {
        this.workOrderCreateTime = workOrderCreateTime;
    }

    public String getWorkOrderContent() {
        return workOrderContent;
    }

    public void setWorkOrderContent(String workOrderContent) {
        this.workOrderContent = workOrderContent == null ? null : workOrderContent.trim();
    }

    public Date getWorkOrderOperationTime() {
        return workOrderOperationTime;
    }

    public void setWorkOrderOperationTime(Date workOrderOperationTime) {
        this.workOrderOperationTime = workOrderOperationTime;
    }

    public Integer getWorkOrderState() {
        return workOrderState;
    }

    public void setWorkOrderState(Integer workOrderState) {
        this.workOrderState = workOrderState;
    }

    public String getWorkOrderResult() {
        return workOrderResult;
    }

    public void setWorkOrderResult(String workOrderResult) {
        this.workOrderResult = workOrderResult == null ? null : workOrderResult.trim();
    }

    public String getWorkOrderNotes() {
        return workOrderNotes;
    }

    public void setWorkOrderNotes(String workOrderNotes) {
        this.workOrderNotes = workOrderNotes == null ? null : workOrderNotes.trim();
    }
}
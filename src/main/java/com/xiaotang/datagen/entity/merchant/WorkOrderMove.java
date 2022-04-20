package com.xiaotang.datagen.entity.merchant;



import java.io.Serializable;
import java.util.Date;

public class WorkOrderMove implements Serializable {
    private String serviceWorkOrderMoveId;

    private String serviceWorkOrderId;

    private String sysuserid;
    /**
     * 0待解决 1已解决 2已关闭 3指派
     */
    private Integer workOrderState;


    private Date workOrderMoveTime;

    private String workOrderExplain;

    private static final long serialVersionUID = 1L;

    public String getServiceWorkOrderMoveId() {
        return serviceWorkOrderMoveId;
    }

    public void setServiceWorkOrderMoveId(String serviceWorkOrderMoveId) {
        this.serviceWorkOrderMoveId = serviceWorkOrderMoveId == null ? null : serviceWorkOrderMoveId.trim();
    }

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

    public Integer getWorkOrderState() {
        return workOrderState;
    }

    public void setWorkOrderState(Integer workOrderState) {
        this.workOrderState = workOrderState;
    }

    public Date getWorkOrderMoveTime() {
        return workOrderMoveTime;
    }

    public void setWorkOrderMoveTime(Date workOrderMoveTime) {
        this.workOrderMoveTime = workOrderMoveTime;
    }

    public String getWorkOrderExplain() {
        return workOrderExplain;
    }

    public void setWorkOrderExplain(String workOrderExplain) {
        this.workOrderExplain = workOrderExplain == null ? null : workOrderExplain.trim();
    }
}
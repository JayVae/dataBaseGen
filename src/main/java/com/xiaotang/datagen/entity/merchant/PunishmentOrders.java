package com.xiaotang.datagen.entity.merchant;

import java.math.BigDecimal;
import java.util.Date;

public class PunishmentOrders {
    private String punishmentOrdersId;

    private String punishmentOrdersNum;

    private Date createTime;

    private String orduserid;

    private String nodes;
    /**
     * 0未支付 1已支付
     */
    private Integer punishmentState;

    private BigDecimal punishmentPrice;
    /**
     * 0占用物业车位 1举证
     */
    private Integer punishmentType;

    private String relevanceId;

    public String getPunishmentOrdersId() {
        return punishmentOrdersId;
    }

    public void setPunishmentOrdersId(String punishmentOrdersId) {
        this.punishmentOrdersId = punishmentOrdersId == null ? null : punishmentOrdersId.trim();
    }

    public String getPunishmentOrdersNum() {
        return punishmentOrdersNum;
    }

    public void setPunishmentOrdersNum(String punishmentOrdersNum) {
        this.punishmentOrdersNum = punishmentOrdersNum == null ? null : punishmentOrdersNum.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getOrduserid() {
        return orduserid;
    }

    public void setOrduserid(String orduserid) {
        this.orduserid = orduserid == null ? null : orduserid.trim();
    }

    public String getNodes() {
        return nodes;
    }

    public void setNodes(String nodes) {
        this.nodes = nodes == null ? null : nodes.trim();
    }

    public Integer getPunishmentState() {
        return punishmentState;
    }

    public void setPunishmentState(Integer punishmentState) {
        this.punishmentState = punishmentState;
    }

    public BigDecimal getPunishmentPrice() {
        return punishmentPrice;
    }

    public void setPunishmentPrice(BigDecimal punishmentPrice) {
        this.punishmentPrice = punishmentPrice;
    }

    public Integer getPunishmentType() {
        return punishmentType;
    }

    public void setPunishmentType(Integer punishmentType) {
        this.punishmentType = punishmentType;
    }

    public String getRelevanceId() {
        return relevanceId;
    }

    public void setRelevanceId(String relevanceId) {
        this.relevanceId = relevanceId == null ? null : relevanceId.trim();
    }
}
package com.xiaotang.datagen.entity.sys;

public class SystemParameter {
    private String systemParameterId;

    private Integer systemParameterType;

    private Double systemParameterValue;

    private String systemParameterExplain;

    public String getSystemParameterId() {
        return systemParameterId;
    }

    public void setSystemParameterId(String systemParameterId) {
        this.systemParameterId = systemParameterId == null ? null : systemParameterId.trim();
    }

    public Integer getSystemParameterType() {
        return systemParameterType;
    }

    public void setSystemParameterType(Integer systemParameterType) {
        this.systemParameterType = systemParameterType;
    }

    public Double getSystemParameterValue() {
        return systemParameterValue;
    }

    public void setSystemParameterValue(Double systemParameterValue) {
        this.systemParameterValue = systemParameterValue;
    }

    public String getSystemParameterExplain() {
        return systemParameterExplain;
    }

    public void setSystemParameterExplain(String systemParameterExplain) {
        this.systemParameterExplain = systemParameterExplain == null ? null : systemParameterExplain.trim();
    }
}
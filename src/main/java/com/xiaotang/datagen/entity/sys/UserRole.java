package com.xiaotang.datagen.entity.sys;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;

@Table
public class UserRole {
    @Column
    private String userRoleId;
    @Column
    private Integer parentType;
    @Column
    private Integer sonType;
    @Column
    private String sonName;

    public String getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(String userRoleId) {
        this.userRoleId = userRoleId == null ? null : userRoleId.trim();
    }

    public Integer getParentType() {
        return parentType;
    }

    public void setParentType(Integer parentType) {
        this.parentType = parentType;
    }

    public Integer getSonType() {
        return sonType;
    }

    public void setSonType(Integer sonType) {
        this.sonType = sonType;
    }

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }
}
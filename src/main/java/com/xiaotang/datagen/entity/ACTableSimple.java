package com.xiaotang.datagen.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.*;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author JS
 * @version 1.0
 * @date 2022/4/20 17:23
 * @description //TODO
 */
@Table(comment = "actable简单配置")
public class ACTableSimple {

    @IsKey
    @IsAutoIncrement
    private Long id;

    @Column
    @Index
    @IsNotNull
    private String name;

    @Column
    private Date createTime;

    @Column(defaultValue = "false")
    private Boolean isTrue;

    @Column
    private Integer age;

    @Column
    private BigDecimal price;

    @Column
    @Unique
    private String identitycard;

}

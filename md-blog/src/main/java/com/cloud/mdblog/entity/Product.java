package com.cloud.mdblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.11
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Product implements Serializable {

    //字段名首字母大写也是没问题的，字段的排序可能会不一样
    @TableId(value = "p_id", type = IdType.INPUT)
    private Integer pId;

    private String pName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date pTime;

    private Integer pCategory;

    private String pColor;
}

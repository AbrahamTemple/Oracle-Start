package com.cloud.mdblog.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.12
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
@Data
public class ProductDto implements Serializable {

    //字段名首字母大写也是没问题的，字段的排序可能会不一样
    private String pName;

    private String cName;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date pTime;

    private String pColor;
}

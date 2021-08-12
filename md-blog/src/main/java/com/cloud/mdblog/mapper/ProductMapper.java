package com.cloud.mdblog.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.mdblog.entity.Product;
import com.cloud.mdblog.entity.ProductDto;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.12
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public interface ProductMapper extends BaseMapper<Product> {

    @Select("select p.*,c.c_name from product p\n" +
            "       left join category c on p.p_category = c.c_id\n" +
            "       where c.c_id = #{type}")
    List<ProductDto> CategoryOfProduct(@Param("type") Integer type);
}

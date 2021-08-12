package com.cloud.mdblog.dao;

import com.cloud.mdblog.entity.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.11
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */

@Slf4j
@Repository
public class ProductDao {

    @Resource
    private JdbcTemplate jdbcTemplate;

    public List<ProductDto> findByType(int type) {
        String querySQL = "select p.*,c.c_name from product p\n" +
                "       left join category c on p.p_category = c.c_id\n" +
                "       where c.c_id = ?";
        //将数据的每一行对应字段封装成Product对象
        RowMapper<ProductDto> rowMapper = new BeanPropertyRowMapper<>(ProductDto.class);
        return jdbcTemplate.query(querySQL, new Object[] { type }, rowMapper);
    }
}

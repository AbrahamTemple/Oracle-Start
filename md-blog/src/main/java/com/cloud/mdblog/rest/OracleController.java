package com.cloud.mdblog.rest;

import com.cloud.mdblog.dao.ProductDao;
import com.cloud.mdblog.entity.Product;
import com.cloud.mdblog.entity.ProductDto;
import com.cloud.mdblog.service.IProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.11
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
@RestController
public class OracleController {

    @Resource
    private ProductDao dao;

    @Resource
    private IProductService service;

    // 基于jdbc的左连接查询
    @RequestMapping("/jget/{id}")
    public List<ProductDto> jdbcGet(@PathVariable(name = "id") Integer id){
        return dao.findByType(id);
    }

    // 基于mybatis-plus的左连接查询
    @RequestMapping("/mpget/{id}")
    public List<ProductDto> mybatisPlusGet(@PathVariable(name = "id") Integer id){
        return service.getDrinkByType(id);
    }


}

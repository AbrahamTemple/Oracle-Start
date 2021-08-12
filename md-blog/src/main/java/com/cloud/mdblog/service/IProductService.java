package com.cloud.mdblog.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.mdblog.entity.Product;
import com.cloud.mdblog.entity.ProductDto;

import java.util.List;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.12
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
public interface IProductService extends IService<Product> {
    List<ProductDto> getDrinkByType(Integer type);
    List<Product> getAll();
}

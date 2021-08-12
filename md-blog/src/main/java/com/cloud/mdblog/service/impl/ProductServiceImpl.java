package com.cloud.mdblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cloud.mdblog.entity.Product;
import com.cloud.mdblog.entity.ProductDto;
import com.cloud.mdblog.mapper.ProductMapper;
import com.cloud.mdblog.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @version 6.1.8
 * @author: Abraham Vong
 * @date: 2021.8.12
 * @GitHub https://github.com/AbrahamTemple/
 * @description:
 */
@Slf4j
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

    @Override
    public List<ProductDto> getDrinkByType(Integer type) {
        return super.baseMapper.CategoryOfProduct(type);
    }

    @Override
    public List<Product> getAll() {
        return super.list();
    }
}

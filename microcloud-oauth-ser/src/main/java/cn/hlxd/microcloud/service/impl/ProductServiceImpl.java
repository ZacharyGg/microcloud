package cn.hlxd.microcloud.service.impl;

import cn.hlxd.microcloud.entity.Order;
import cn.hlxd.microcloud.entity.Product;
import cn.hlxd.microcloud.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-28-15:21
 * @Description：
 **/

@Service
public class ProductServiceImpl implements ProductService{
    @Override
    public Product getProduct() {
        Product product = new Product();
        product.setProductId("222222");
        product.setProductName("my product");
        return product;
    }
}

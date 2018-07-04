package cn.hlxd.microcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-28-15:42
 * @Description：
 **/

@RestController
public class ProductController {
    private final String PRODUCT_GET_URL="http://localhost:8008/product/list";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value="/client/product/get")
    public String getProduct(){
        return this.restTemplate.getForObject(PRODUCT_GET_URL,String.class);
    }
}

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
 * @Date： 2018-06-28-15:31
 * @Description：
 **/


@RestController
public class OrderController {
    public static final String ORDER_GET_URL="http://localhost:8008/order/list";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/client/order/get")
    public String getOrder(){
       return  this.restTemplate.getForObject(ORDER_GET_URL,String.class);
    }

}

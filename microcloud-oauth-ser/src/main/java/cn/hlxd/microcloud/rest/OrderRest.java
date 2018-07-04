package cn.hlxd.microcloud.rest;

import cn.hlxd.microcloud.service.OrderService;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-28-14:43
 * @Description：
 **/

@RestController
public class OrderRest {

    @Resource
    public OrderService orderService;


    @RequestMapping(value = "/order/list",method = RequestMethod.GET)
    public Object getOrder(){
        return this.orderService.getOrder();
    }
}

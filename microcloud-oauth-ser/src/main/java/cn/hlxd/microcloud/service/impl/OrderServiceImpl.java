package cn.hlxd.microcloud.service.impl;

import cn.hlxd.microcloud.entity.Order;
import cn.hlxd.microcloud.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-28-14:42
 * @Description：
 **/


@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public Order getOrder() {
        Order order = new Order();
        order.setOrderId("11111");
        order.setOrderName("my order");
        return order;
    }
}

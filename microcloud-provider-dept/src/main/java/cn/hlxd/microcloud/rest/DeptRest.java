package cn.hlxd.microcloud.rest;

import cn.hlxd.microcloud.service.IDeptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-07-13:33
 * @Description：
 **/


@RestController
public class DeptRest {

    @Resource
    private IDeptService deptService;

    @RequestMapping(value = "/dept/list",method = RequestMethod.GET)
    public Object list(){
        return this.deptService.list();
    }
}

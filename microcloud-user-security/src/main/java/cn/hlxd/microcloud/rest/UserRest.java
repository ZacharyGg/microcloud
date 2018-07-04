package cn.hlxd.microcloud.rest;

import cn.hlxd.microcloud.service.Impl.MyUserDetailService;
import org.springframework.web.bind.annotation.PathVariable;
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
 * @Date： 2018-06-07-15:21
 * @Description：
 **/


@RestController
public class UserRest {

    @Resource
    private MyUserDetailService myUserDetailService;

//    @RequestMapping(value = "user/{username}",method = RequestMethod.GET)
//    public Object user(@PathVariable("username") String user){
//       return this.myUserDetailService.loadUserByUsername(user);
//    }
//    @RequestMapping(value = "/user/user",method = RequestMethod.GET)
//    public Object getUser(){
//        Object ob =this.myUserDetailService.loadUserByUsername("admin");
//        System.out.println(ob);
//        return ob;
//    }
}

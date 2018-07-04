package cn.hlxd.microcloud.controller;

import cn.hlxd.microcloud.DAO.SysUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-29-11:00
 * @Description：
 **/

@Controller
public class UserController {

    @Autowired
    public SysUserDAO sysUserDAO;


    @GetMapping("/user")
    public Principal user(Principal user){
        return user;
    }


    @RequestMapping(value="/user/get", method = RequestMethod.GET)
    public Object getUser(){
        return  sysUserDAO.findByUsername("admin");
    }
}

package cn.hlxd.microcloud.controller;

import cn.hlxd.microcloud.model.SysUser;

import org.springframework.web.bind.annotation.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-07-02-11:41
 * @Description：
 **/
@RestController
@RequestMapping("/")
public class TextController {

    @PostMapping(value = "/log")
    public String  saveCuringEvidence(@RequestBody  SysUser user){

        System.out.println("---------------------user:"+user.getUsername());

        return user.getUsername();
    }

    @GetMapping(value = "/user")
    public String  getUser(){
        return "woshishshshshsh";
    }
}

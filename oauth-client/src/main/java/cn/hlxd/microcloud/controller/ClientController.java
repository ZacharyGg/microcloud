package cn.hlxd.microcloud.controller;

import cn.hlxd.microcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2RestOperations;
import org.springframework.web.bind.annotation.*;;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-07-02-16:20
 * @Description：
 **/

@RestController
public class ClientController {
    @Autowired
    private OAuth2RestOperations oauthRestTemplate;


    @PostMapping(value = "/login")
    public String  saveCuringEvidence(@RequestBody User user ){

        System.out.println("---------------------Client"+user.getUsername());
        oauthRestTemplate.postForEntity("http://127.0.0.1:8001/log",user,String.class);

        return user.getUsername();
    }


    @GetMapping(value = "/otherPage")
    public String  otherPage(){

        System.out.println("---------------------otherPage");
//        oauthRestTemplate.postForEntity("http://192.168.1.100:9595/log",user,String.class);
        return "00000";
    }

}

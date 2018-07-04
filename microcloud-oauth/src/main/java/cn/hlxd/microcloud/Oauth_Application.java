package cn.hlxd.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-29-18:39
 * @Description：
 **/

@SpringBootApplication
@EnableEurekaClient
@RestController
@EnableResourceServer
public class Oauth_Application {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Oauth_Application.class,args);
    }
    @RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }
}
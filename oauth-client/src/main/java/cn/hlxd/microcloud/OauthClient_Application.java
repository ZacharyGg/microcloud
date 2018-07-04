package cn.hlxd.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-07-02-16:12
 * @Description：
 **/

@SpringBootApplication
@EnableOAuth2Client
public class OauthClient_Application {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(OauthClient_Application.class, args);
    }
}
package cn.hlxd.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-28-15:39
 * @Description：
 **/

@SpringBootApplication
@EnableOAuth2Sso
public class oauthClient_Application {
    public static void main(String[] args)throws Exception{
        SpringApplication.run(oauthClient_Application.class,args);
    }
}

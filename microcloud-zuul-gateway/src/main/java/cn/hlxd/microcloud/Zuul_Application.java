package cn.hlxd.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-29-17:45
 * @Description：
 **/

@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Sso
public class Zuul_Application {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Zuul_Application.class,args);
    }
}

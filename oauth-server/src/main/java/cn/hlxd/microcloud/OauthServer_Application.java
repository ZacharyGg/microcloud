package cn.hlxd.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-07-02-11:24
 * @Description：
 **/

@SpringBootApplication
public class OauthServer_Application {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(OauthServer_Application.class,args);
    }
}

package cn.hlxd.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-29-10:53
 * @Description：
 **/

@SpringBootApplication
@EnableDiscoveryClient
public class Authorization_Application {
    public static void main(String[] args) throws Exception{
        SpringApplication.run(Authorization_Application.class,args);
    }
}

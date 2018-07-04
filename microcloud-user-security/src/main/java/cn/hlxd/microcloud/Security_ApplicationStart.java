package cn.hlxd.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-07-15:28
 * @Description：
 **/

@SpringBootApplication
@EnableEurekaClient
public class Security_ApplicationStart {
    public static void main (String[] args) throws Exception{
        SpringApplication.run(Security_ApplicationStart.class,args);
    }
}

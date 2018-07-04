package cn.hlxd.microcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-06-19:28
 * @Description：
 **/

@SpringBootApplication
@EnableEurekaClient
public class StartSpringCloudApplication {
    public static void main(String[] args)throws Exception{
        SpringApplication.run(StartSpringCloudApplication.class,args);
    }
}

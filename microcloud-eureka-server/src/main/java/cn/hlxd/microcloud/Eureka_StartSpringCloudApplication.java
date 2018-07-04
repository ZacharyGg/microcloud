package cn.hlxd.microcloud;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-06-16:57
 * @Description：
 **/
@SpringBootApplication
@EnableEurekaServer
public class Eureka_StartSpringCloudApplication {
    public static void main(String[] args){
        SpringApplication.run(Eureka_StartSpringCloudApplication.class,args);
    }
}

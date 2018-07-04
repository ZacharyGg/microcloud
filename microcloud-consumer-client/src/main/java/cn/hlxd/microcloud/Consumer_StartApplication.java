package cn.hlxd.microcloud;

import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-07-14:39
 * @Description：
 **/

@SpringBootApplication
public class Consumer_StartApplication {
    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(Consumer_StartApplication.class,args);
    }
}

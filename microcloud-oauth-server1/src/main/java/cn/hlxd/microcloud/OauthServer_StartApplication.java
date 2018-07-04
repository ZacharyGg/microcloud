package cn.hlxd.microcloud;

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
public class OauthServer_StartApplication {
    public static void main( String[] args ) throws Exception
    {
        SpringApplication.run(OauthServer_StartApplication.class,args);
    }
}

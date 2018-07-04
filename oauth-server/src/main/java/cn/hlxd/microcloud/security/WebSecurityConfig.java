package cn.hlxd.microcloud.security;

import cn.hlxd.microcloud.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-07-02-11:44
 * @Description：
 **/

@Configuration
public class WebSecurityConfig extends GlobalAuthenticationConfigurerAdapter {

    private final SysUserService userService;

    @Autowired
    public WebSecurityConfig(SysUserService userService) {
        this.userService = userService;
    }

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService);
    }
}

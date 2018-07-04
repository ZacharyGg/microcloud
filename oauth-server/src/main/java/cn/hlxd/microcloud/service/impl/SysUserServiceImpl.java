package cn.hlxd.microcloud.service.impl;

import cn.hlxd.microcloud.dto.CustomUserDetails;
import cn.hlxd.microcloud.model.SysUser;
import cn.hlxd.microcloud.service.SysUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-07-02-11:31
 * @Description：
 **/

@Service
public class SysUserServiceImpl implements SysUserService{
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("===================获取到token已进入自定义验证："+username);
        // 可以进行数据库请求，这里进行模拟
        SysUser user = new SysUser();
        user.setUsername("123123123");
        user.setPassword("312312312123");

        if (user == null) {
            System.out.println("==================="+username);
            throw new UsernameNotFoundException("Could not find the user '" + username + "'");
        }

        return new CustomUserDetails(user, true, true, true, true, null);
    }
}

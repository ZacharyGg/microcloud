package cn.hlxd.microcloud.service.Impl;

import cn.hlxd.microcloud.dao.IUserDAO;
import cn.hlxd.microcloud.dao.Impl.Permission;
import cn.hlxd.microcloud.dao.Impl.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-07-15:16
 * @Description：
 **/


@SuppressWarnings("serial")
@Configuration
public class MyUserDetailService implements UserDetailsService {

    private Logger logger = Logger.getLogger(MyUserDetailService.class);

    @Autowired
    public IUserDAO userDAO;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 根据用户名查询用户信息


        User user = userDAO.findByUsername(username);

        if (user != null) {
            // 根据用户名查询当前用户的所有权限
            List<Permission> permList = userDAO.findPermissionByUsername(username);
            //存放所有用户权限
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            for (Permission perm : permList) {
                GrantedAuthority authority = new SimpleGrantedAuthority(perm.getPermTag());
                authorities.add(authority);
            }
            user.setAuthorities(authorities);
            System.out.println(authorities.toString());
            //把所有权限赋予用户
            logger.info("当前用户：" + user);
        }
        return user;
    }
}

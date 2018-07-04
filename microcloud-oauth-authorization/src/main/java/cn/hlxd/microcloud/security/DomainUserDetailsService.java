package cn.hlxd.microcloud.security;

import cn.hlxd.microcloud.dao.SysUserDAO;
import cn.hlxd.microcloud.domian.SysPermission;
import cn.hlxd.microcloud.domian.SysUser;


import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-29-11:08
 * @Description：
 **/



public class DomainUserDetailsService implements UserDetailsService{

    private Logger logger = Logger.getLogger(DomainUserDetailsService.class);
    @Autowired
    public SysUserDAO userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException, InternalAuthenticationServiceException {

        // 根据用户名查询用户信息
        SysUser user = userMapper.findByUsername(username);


        if (user != null) {
            // 根据用户名查询当前用户的所有权限
            List<SysPermission> permList = userMapper.findPermissionByUsername(username);
            //存放所有用户权限
            List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
            for (SysPermission perm : permList) {
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

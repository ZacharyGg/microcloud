package cn.hlxd.microcloud.dao;

import cn.hlxd.microcloud.domian.SysPermission;
import cn.hlxd.microcloud.domian.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：1.0
 * @Date： 2018-06-29-13:09
 * @Description：
 **/


@Mapper
public interface SysUserDAO {

//    public Optional<SysUser> findOneWithRolesByUsername(String username);

    /**
     * 查询当前用户对象
     */
    public SysUser findByUsername(String username);
    /**
     * 查询当前用户拥有的权限
     */
    public List<SysPermission> findPermissionByUsername(String username);

    /**
     * 修改密码
     */
    public void updatePassword(SysUser user);
}

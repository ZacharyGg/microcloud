package cn.hlxd.microcloud.dao;

import cn.hlxd.microcloud.dao.Impl.Permission;
import cn.hlxd.microcloud.dao.Impl.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-07-15:00
 * @Description：
 **/

@Mapper
public interface IUserDAO {
    /**
     * 查询当前用户对象
     */
    public User findByUsername(String username);
    /**
     * 查询当前用户拥有的权限
     */
    public List<Permission> findPermissionByUsername(String username);
}

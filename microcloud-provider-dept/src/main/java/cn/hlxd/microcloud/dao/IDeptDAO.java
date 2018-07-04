package cn.hlxd.microcloud.dao;

import cn.hlxd.microcloud.domain.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-06-19:55
 * @Description：
 **/


@Mapper
public interface IDeptDAO {
    public boolean doCreate(Dept vo);
    public Dept findById(Long id);
    public List<Dept> findAll();
}


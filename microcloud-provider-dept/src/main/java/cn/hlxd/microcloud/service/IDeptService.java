package cn.hlxd.microcloud.service;

import cn.hlxd.microcloud.domain.Dept;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-06-20:37
 * @Description：
 **/


public interface IDeptService {
    public Dept get(long  id);
    public boolean add(Dept dept);
    public List<Dept> list ();
}

package cn.hlxd.microcloud.service.Impl;

import cn.hlxd.microcloud.dao.IDeptDAO;
import cn.hlxd.microcloud.domain.Dept;
import cn.hlxd.microcloud.service.IDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：V1.0
 * @Date： 2018-06-06-20:39
 * @Description：
 **/
@Service
public class DeptServiceImpl implements IDeptService{
    @Resource
    private IDeptDAO deptDAO;


    @Override
    public Dept get(long id) {
        return this.deptDAO.findById(id);
    }

    @Override
    public boolean add(Dept dept) {
        return this.deptDAO.doCreate(dept);
    }

    @Override
    public List<Dept> list() { return this.deptDAO.findAll();
    }
}

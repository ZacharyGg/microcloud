package cn.hlxd;

import cn.hlxd.microcloud.StartSpringCloudApplication;
import cn.hlxd.microcloud.dao.IDeptDAO;
import cn.hlxd.microcloud.service.IDeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;


/**
 * Created with IntelliJ IDEA.
 *
 * @Program：{microcloud}
 * @Author：Zachary
 * @Version：v1.0
 * @Date： 2018-06-06-20:08
 * @Description：
 **/


@SpringBootTest(classes = StartSpringCloudApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class DaoTest{

    @Resource
    private IDeptDAO iDeptDAO;

    @Resource
    private IDeptService iDeptService;
    @Test
    public void testList(){
        System.out.println(this.iDeptDAO.findAll());
    }
    @Test
    public void  test(){
        System.out.println(this.iDeptService.list());
    }

}

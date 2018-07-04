package cn.hlxd.microcloud;

import cn.hlxd.microcloud.dao.IUserDAO;
import cn.hlxd.microcloud.dao.Impl.User;
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
 * @Version：V1.0
 * @Date： 2018-06-07-15:33
 * @Description：
 **/


@SpringBootTest(classes = Security_ApplicationStart.class)
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)

public class UserMapperTest {

    @Resource
    private IUserDAO userDAO;

    @Test
    public void testFindUser(){
        User user = userDAO.findByUsername("admin");
        System.out.println(user);
    }

}


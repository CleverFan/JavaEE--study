package cn.edu.zjut.app;

import cn.edu.zjut.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试
 *
 * @author chengfan
 * @create 2016-12-06 下午10:47
 */
public class SpringEnvTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

//        ICustomerDAO userDao = ((ICustomerDAO)ctx.getBean("userDAO"));
//        userDao.save();

        IUserService userService = (IUserService) ctx.getBean("userService");
        userService.register();



    }
}

package cn.edu.zjut.service;

import cn.edu.zjut.dao.ICustomerDAO;

/**
 * userService的实现类
 *
 * @author chengfan
 * @create 2016-12-06 下午11:08
 */
public class UserService implements IUserService{
    private ICustomerDAO customerDAO = null;

    public UserService(){
        System.out.println("create UserService.");
    }
    public void setCustomerDAO(ICustomerDAO customerDAO) {
        System.out.println("--setCustomerDAO--");
        this.customerDAO = customerDAO;
    }
    @Override
    public void register() {
        System.out.println("execute --register()-- method.");
        customerDAO.save();
    }
}

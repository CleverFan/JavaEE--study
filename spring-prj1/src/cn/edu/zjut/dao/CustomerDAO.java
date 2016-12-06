package cn.edu.zjut.dao;

/**
 * 操作数据库
 *
 * @author chengfan
 * @create 2016-12-06 下午10:44
 */
public class CustomerDAO implements ICustomerDAO {
    public CustomerDAO() {
        System.out.println("create CustomerDao");
    }

    @Override
    public void save() {
        System.out.println("execute --save()--method");
    }
}

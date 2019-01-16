package com.itheima;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.junit.Assert.*;

/**
 * @author wuliqiang@itcast.cn
 * @date 2019/1/16
 */

public class CustomerTest {

    @Test
    public void test(){
        //1.创建工厂了
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");

        //2.操作类创建
        EntityManager manager = factory.createEntityManager();

        //3.开启事务
        EntityTransaction tx = manager.getTransaction();
        tx.begin();

        //4.进行操作
        Customer customer = new Customer();
        customer.setCustName("合肥黑马");
        manager.persist(customer);
        //5.提交事务
        tx.commit();
        //6.释放资源
        manager.close();
        factory.close();
    }
}
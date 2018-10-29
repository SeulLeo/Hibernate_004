package com.yiibai;

import org.hibernate.*;
import org.hibernate.cfg.*;


public class UserDao {

    public static int save(User u) {
        int i = 0;

        Configuration cfg=new Configuration().configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();// 从会话工厂获取一个session
        Transaction t = session.beginTransaction();
        i = (Integer) session.save(u);
        t.commit();
        session.close();

        System.out.println(u.getName());
        return i;
    }
}
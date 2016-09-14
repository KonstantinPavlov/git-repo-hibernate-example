package com.KonstPavlov;

import com.KonstPavlov.entity.User;
import com.KonstPavlov.persistence.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by Konstantin on 13.09.2016.
 *
 *
 *
 */
public class EnterPoint {

    public static void main(String[] args) {
        System.out.println("Maven + Hibernate + MySQL");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        User user= new User("Konstantin","Pavlov");
        session.save(user);
        session.getTransaction().commit();
        //закрываем сессию
        session.close();
        // закрываем соединение с БД
        HibernateUtil.shutdown();
    }
}

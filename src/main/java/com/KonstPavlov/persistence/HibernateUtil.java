package com.KonstPavlov.persistence;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Created by Konstantin on 13.09.2016.
 *
 *
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static ServiceRegistry serviceRegistry;

    private static SessionFactory buildSessionFactory()
    {
        try {
            // Создает сессию с hibernate.cfg.xml
            Configuration configuration = new Configuration();
            configuration.configure();

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            return configuration.buildSessionFactory(serviceRegistry);
        }
       catch (Throwable ex)
       {
           System.err.println("Initial Session factory failed. "+ ex );
           throw new ExceptionInInitializerError(ex);
       }
    }

    public  static SessionFactory getSessionFactory()
    {
        return sessionFactory;
    }
    public static void shutdown()
    {
        // Чистит кеш и закрывает соединение с БД
        getSessionFactory().close();
    }


}

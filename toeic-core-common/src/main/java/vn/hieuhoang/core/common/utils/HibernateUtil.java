package vn.hieuhoang.core.common.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Created by Hieu Hoang on 12/08/2018.
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try{
            return new Configuration().configure().buildSessionFactory();
        }
        catch (Throwable e){
            System.out.println("Initial session factory fail");
            System.out.println(e.toString());
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SessionFactory getSessionFactory(){

        return sessionFactory;
    }
}

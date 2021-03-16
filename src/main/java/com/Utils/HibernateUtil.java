package com.Utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil
{
    private static SessionFactory sessionFactory = null;
    static
    {
        try
        {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        }
        catch(Throwable th){
            System.err.println("Enitial SessionFactory creation failed"+th);
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
package com.Dao;

import com.Models.CandidatEntity;
import com.Utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.bytecode.buildtime.Logger;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.io.Console;
import java.util.List;

public class DaoSqlServeur implements DaoInterface{
    static Session sessionObj;
    static SessionFactory sessionFactoryObj;

    // This Method Is Used To Create The Hibernate's SessionFactory Object
    private static SessionFactory buildSessionFactory() {
        // Creating Configuration Instance & Passing Hibernate Configuration File
        Configuration configObj = new Configuration();
        configObj.configure("hibernate.cfg.xml");

        // Since Hibernate Version 4.x, ServiceRegistry Is Being Used
        ServiceRegistry serviceRegistryObj = new StandardServiceRegistryBuilder().applySettings(configObj.getProperties()).build();

        // Creating Hibernate SessionFactory Instance
        sessionFactoryObj = configObj.buildSessionFactory(serviceRegistryObj);
        return sessionFactoryObj;
    }
    @Override
    public CandidatEntity addCandidat(CandidatEntity candidatEntity) {
        try {
            Session session = sessionFactoryObj.openSession();
            //getting transaction object from session object
            session.beginTransaction();

            session.save(candidatEntity);
            System.out.println("Inserted Successfully");
            session.getTransaction().commit();
            session.close();
            sessionFactoryObj.close();
            return candidatEntity;
        }catch (Exception ex){
            System.out.printf(ex.getMessage());
            return null;
        }
    }

    @Override
    public CandidatEntity updateCandidat(CandidatEntity candidatEntity) {
        return null;
    }

    @Override
    public boolean deleteCandidat(int id) {
        return false;
    }

    @Override
    public CandidatEntity getCandidat(int id) {
        return null;
    }

    @Override
    public List<CandidatEntity> getCandidats() {
        return null;
    }
}

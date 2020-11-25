package com.jacob.part1;

import com.jacob.part1.model.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveData {
    public static void main(String[] args) {
        Alien jacob = new Alien();
        jacob.setAid(103);
        jacob.setAname("XiAn");
        jacob.setColor("Green");
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(jacob);
        transaction.commit();
    }
}

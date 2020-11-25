package com.jacob.part1;

import com.jacob.part1.model.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        //fetch data from DBMS
        Alien jacob =session.get(Alien.class, 103);
        transaction.commit();
        System.out.println(jacob);
    }
}

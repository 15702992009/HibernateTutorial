package com.jacob.part1;

import com.jacob.part1.model.Alien2;
import com.jacob.part1.model.AlienName;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveData2 {
    public static void main(String[] args) {
        AlienName alienName=new AlienName();
        alienName.setFname("wang");
        alienName.setLname("jiabo");
        alienName.setMname("JIA");
        Alien2 jacob = new Alien2();
        jacob.setAid(100);
        jacob.setColor("Blue");
        jacob.setAname(alienName);


        jacob.setColor("Green");
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien2.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.save(jacob);
        transaction.commit();
        System.out.println(jacob);
    }
}

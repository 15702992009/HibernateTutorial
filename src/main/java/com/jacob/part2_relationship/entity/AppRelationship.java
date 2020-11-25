package com.jacob.part2_relationship.entity;

import com.jacob.part2_relationship.entity.Laptop;
import com.jacob.part2_relationship.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AppRelationship {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");

        Student student = new Student();
        student.setName("Jacob");
        student.setRollno(1);
        student.setMarks(50);


        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(laptop);
        session.save(student);

        session.getTransaction().commit();


    }
}

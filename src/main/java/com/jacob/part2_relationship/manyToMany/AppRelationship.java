package com.jacob.part2_relationship.manyToMany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AppRelationship {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");

        Student s = new Student();
        s.setName("Jacob");
        s.setRollno(1);
        s.setMarks(50);
        s.getLaptops().add(laptop);

        laptop.getStudents().add(s);

        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(laptop);
        session.save(s);

        session.getTransaction().commit();

    }
}

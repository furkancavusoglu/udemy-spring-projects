package org.example.demo;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        try (factory) {
            Session session = factory.getCurrentSession();
            Student student = new Student("ad1", "soyad", "mail@mail.com");
            Student student2 = new Student("ad2", "soyad2", "mail@mail.com");
            Student student3 = new Student("ad3", "soyad3", "mail@mail.com");
            session.beginTransaction();
            session.save(student);
            session.save(student2);
            session.save(student3);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

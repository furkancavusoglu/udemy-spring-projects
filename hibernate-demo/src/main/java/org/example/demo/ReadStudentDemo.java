package org.example.demo;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        try (factory) {
            Session session = factory.getCurrentSession();
            Student createStudent = new Student("Furkan", "Cavusoglu", "cfurkannn@gmail.com");
            session.beginTransaction();
            session.save(createStudent);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            Student readStudent = session.get(Student.class, createStudent.getId());
            session.getTransaction().commit();
            System.out.println(readStudent);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

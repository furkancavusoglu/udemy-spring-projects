package org.example.demo;

import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        try (factory) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Student> studentList = session
                    .createQuery("from Student s", Student.class)
                    .getResultList();
            studentList.forEach(System.out::println);

            System.out.println("----------------------------");

            studentList = session
                    .createQuery("from Student s where s.firstName = 'Furkan'", Student.class)
                    .getResultList();
            studentList.forEach(System.out::println);

            System.out.println("----------------------------");

            studentList = session
                    .createQuery("from Student s where s.email like '%@mail.com'", Student.class)
                    .getResultList();
            studentList.forEach(System.out::println);
            System.out.println("----------------------------");

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

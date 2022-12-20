package org.example.demo;

import org.example.entity.Instructor;
import org.example.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OnetoOneBiDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try (factory; session) {
            int id = 4;
            session.beginTransaction();

            InstructorDetail detail = session.get(InstructorDetail.class, id);
            System.out.println(detail);
            System.out.println(detail.getInstructor());
            //remove the bidirectional link
            detail.getInstructor().setInstructorDetail(null);
            session.delete(detail);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


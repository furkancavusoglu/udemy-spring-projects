package org.example.demo;

import org.example.entity.Instructor;
import org.example.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToOneUniDemo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();
        Session session = factory.getCurrentSession();

        try (factory) {
            Instructor instructor = new Instructor("Furkan", "C", "cfurkannn@gmail.com");
            InstructorDetail detail = new InstructorDetail("noyoutubechannel", "reading");
            instructor.setInstructorDetail(detail);
            int id = 1;

            session.beginTransaction();

            session.save(instructor);
//            Instructor persistPojo = session.get(Instructor.class, id);
//            System.out.println(persistPojo);
//            session.delete(persistPojo);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

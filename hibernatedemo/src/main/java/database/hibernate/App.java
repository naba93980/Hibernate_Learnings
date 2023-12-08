package database.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setFirstName("papai");
        u1.setLastName("modak");
        u1.setEmail("papai@gmail.com");

        SessionFactory sf1 = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        Session s1 = sf1.openSession();
        s1.beginTransaction();
        s1.persist(u1);
        s1.getTransaction().commit();
        s1.close();
    }
}

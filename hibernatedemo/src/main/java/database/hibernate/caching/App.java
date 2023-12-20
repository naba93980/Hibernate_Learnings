package database.hibernate.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        SessionFactory sf1 = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        Session s1 = sf1.openSession();

        s1.beginTransaction();
        User s = s1.get(User.class, "naba@gmail.com");
        System.out.println(s);
        s1.getTransaction().commit();
        // level 1 caching in same session
        s1.beginTransaction();
        User s2 = s1.get(User.class, "naba@gmail.com");
        System.out.println(s2);
        s1.getTransaction().commit();
        s1.close();

        Session s3 = sf1.openSession();
         s3.beginTransaction();
        User s4 = s3.get(User.class, "naba@gmail.com");
        System.out.println(s4);
        s3.getTransaction().commit();
        s3.close();
    }
}

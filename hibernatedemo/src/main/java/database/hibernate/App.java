package database.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setFirstName("naba");
        u1.setLastName("modak");
        u1.setEmail("naba@gmail.com");
        u1.setBoyosh(23);
        u1.setBodyCnt(0);

        SessionFactory sf1 = new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory();
        Session s1 = sf1.openSession();
        s1.beginTransaction();
        s1.persist(u1);
        User u = s1.get(User.class, "papai@gmail.com");
        System.out.println(u);
        s1.getTransaction().commit();
        s1.close();
    }
}

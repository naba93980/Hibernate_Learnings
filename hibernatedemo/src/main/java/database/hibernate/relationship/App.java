package database.hibernate.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRoll(1);
        s1.setName("akash");

        Laptop l1 = new Laptop();
        l1.setId(101);
        l1.setName("Asus");
        l1.setStudent(s1);

        Laptop l2 = new Laptop();
        l2.setId(102);
        l2.setName("Dell");
        l2.setStudent(s1);

        Laptop l3 = new Laptop();
        l3.setId(103);
        l3.setName("HP");
        l3.setStudent(s1);

        s1.getLaptop().add(l1);
        s1.getLaptop().add(l2);
        s1.getLaptop().add(l3);

        SessionFactory sf1 = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class).buildSessionFactory();
        Session sesssion1 = sf1.openSession();
        sesssion1.beginTransaction();
        sesssion1.persist(s1);
        sesssion1.persist(l1);
        sesssion1.persist(l2);
        sesssion1.persist(l3);

        Student stud1 = sesssion1.get(Student.class, 1);
        System.out.println(stud1);
        sesssion1.getTransaction().commit();
        sesssion1.close();
    }
}

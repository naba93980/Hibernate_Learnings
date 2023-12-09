package database.hibernate.relationship;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
    
    @Id
    private int roll;
    private String name;

    @OneToMany(mappedBy = "student", fetch = FetchType.EAGER) // if u give this paameter mappedBy = "student" then 3rd table student_laptop will not get created
    private List<Laptop> laptop;

    public Student(){
        this.laptop=new ArrayList<Laptop>();
    }

    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Laptop> getLaptop() {
        return laptop;
    }
    public void setLaptop(List<Laptop> laptop) {
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", laptop=" + laptop + "]";
    }

    
}

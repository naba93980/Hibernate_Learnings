package database.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

// User represents a table and is called an entity

@Entity
@Table(name = "User_Table")
public class User {

    @Id
    private String email;
    private String firstName;
    private String lastName;
    private Address address;

    @Column(name = "Age")
    private int boyosh;

    @Transient
    private int bodyCnt;

    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBoyosh() {
        return boyosh;
    }

    public void setBoyosh(int boyosh) {
        this.boyosh = boyosh;
    }

    public int getBodyCnt() {
        return bodyCnt;
    }

    public void setBodyCnt(int bodyCnt) {
        this.bodyCnt = bodyCnt;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "User [email=" + email + ", firstName=" + firstName + ", lastName=" + lastName + ", boyosh=" + boyosh
                + ", bodyCnt=" + bodyCnt + "]";
    }
}

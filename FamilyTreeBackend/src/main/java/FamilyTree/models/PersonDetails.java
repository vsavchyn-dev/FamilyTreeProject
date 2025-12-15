package FamilyTree.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.Date;

@Entity
public class PersonDetails {

    // --- Class Variables --- //
    @OneToMany
    @Column(unique = true, nullable = false)
    Integer Pid;

    String firstName;
    String lastName;
    Integer age;
    Date birthday;
    boolean alive;


    // --- Default Constructor --- //
    PersonDetails(){}

    // --- Overloaded Constructor --- //
    PersonDetails(Integer pid, String firstName, String lastName, int age,Date birthday, boolean alive){
        this.Pid = pid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.alive = alive;
    }

    // --- Getters --- //
    public String getFirstName() {
        return firstName;
    }

    public Integer getPid(){
        return this.Pid;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public boolean isAlive() {
        return alive;
    }


    // --- Setters --- //
    public void setPid(Integer pid) {
        this.Pid = pid;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}

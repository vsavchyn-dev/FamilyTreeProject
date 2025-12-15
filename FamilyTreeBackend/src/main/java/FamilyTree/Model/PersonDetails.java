package FamilyTree.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "person_details")
public class PersonDetails {

    // --- Class Variables --- //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private Integer age;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    private boolean alive;


    // --- Default Constructor --- //
    public PersonDetails(){}

    // --- Overloaded Constructor --- //
    public PersonDetails(String firstName, String lastName, int age, Date birthday, boolean alive) {
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

    public Long getId(){
        return this.id;
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
    public void setId(Long id) {
        this.id = id;
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

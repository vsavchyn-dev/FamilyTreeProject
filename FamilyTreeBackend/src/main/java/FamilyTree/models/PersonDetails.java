package FamilyTree.models;

import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class PersonDetails {

    // --- Class Variables --- //
    Integer Pid;
    String Fname;
    String Lname;
    Integer age;
    Date birthday;
    boolean alive;


    // --- Default Constructor --- //
    PersonDetails(){
        this.Pid = 0;
        this.Fname = "";
        this.Lname = "";
        this.age = 0;
        this.birthday = null;
        this.alive = false;
    }

    // --- Overloaded Constructor --- //
    PersonDetails(Integer pid, String fname, String lname, int age,Date birthday, boolean alive){
        this.Pid = pid;
        this.Fname = fname;
        this.Lname = lname;
        this.age = age;
        this.birthday = birthday;
        this.alive = alive;
    }

    // --- Getters --- //
    public String getFname() {
        return Fname;
    }

    public Integer getPid(){
        return this.Pid;
    }

    public String getLname() {
        return Lname;
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

    public void setLname(String lname) {
        Lname = lname;
    }

    public void setFname(String fname) {
        Fname = fname;
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

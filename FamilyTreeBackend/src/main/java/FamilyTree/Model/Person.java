package FamilyTree.Model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id", referencedColumnName = "id")
    private PersonDetails details;

    @ManyToMany(cascade = CascadeType.MERGE)
    private List<Person> childrenArray = new ArrayList<>();

    private String name;

    public Person() {};

    public Person(PersonDetails personDetails, ArrayList<Person> childrenArray) {
        this.details = personDetails;
        this.childrenArray = childrenArray;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Person> getChildrenArray() {
        return childrenArray;
    }

    public void setChildrenArray(ArrayList<Person> childrenArray) {
        this.childrenArray = childrenArray;
    }

    public PersonDetails getDetails() {
        return details;
    }

    public void setDetails(PersonDetails details) {
        this.details = details;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.childrenArray);
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + this.id.toString() + ", childrenArray=[" + this.childrenArray + "]," + "}";
    }

}

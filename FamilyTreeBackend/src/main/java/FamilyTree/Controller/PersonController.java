package FamilyTree.Controller;

import java.util.ArrayList;
import java.util.List;

import FamilyTree.Model.Person;
import FamilyTree.Repositories.PersonRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    private final PersonRepository repository;

    PersonController(PersonRepository repository) {
        this.repository = repository;
    }

    // --- GET Methods --- ///
    //All Persons
    @GetMapping("/persons")
    List<Person> all() {
        return repository.findAll();
    }

    // Single Person
    @GetMapping("/person/{id}")
    Person one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new Error(id + ": not found"));
    }


    ///  --- POST Methods --- ///
    //New
    @PostMapping("/person")
    Person newPerson(@RequestBody Person newPerson) {
        return repository.save(newPerson);
    }

    //To Replace
    @PutMapping("/person/{id}")
    Person replacePerson(@RequestBody Person newPerson, @PathVariable Long id) {
        return repository.findById(id)
                .map(person -> {
                    person.setId(newPerson.getId());
                    person.setChildrenArray((ArrayList<Person>) newPerson.getChildrenArray());
                    person.setDetails(newPerson.getDetails());
                    return repository.save(person);
                })
                .orElseGet(() -> {
                    return repository.save(newPerson);
                });
    }

    // --- DELETE METHOD --- ///
    @DeleteMapping("/person/{id}")
    void deletePerson(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
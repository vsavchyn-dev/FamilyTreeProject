package FamilyTree.Database;

//import FamilyTree.Repositories.PersonRepository;
import FamilyTree.Model.Person;
import FamilyTree.Model.PersonDetails;
import FamilyTree.Repositories.PersonDetailsRepository;
import FamilyTree.Repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

@Configuration
class DatabaseLoader {

    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);
    // will implement it once I am able to pull after the merge

    @Bean
    CommandLineRunner initDatabase(PersonRepository personRepository, PersonDetailsRepository personDetailsRepository) {
        var childDetails = new PersonDetails("Garry", "Miaw", 11, new Date(2000, 5, 1), true);
        var child = new Person(childDetails, new ArrayList<>());

        var p1Details = new PersonDetails("Larry", "Miaw", 45, new Date(1990, 1, 17), true);
        var p1 = new Person(p1Details, new ArrayList<Person>(Arrays.asList(child)));

        var p2Details =  new PersonDetails("Marry", "Miaw", 30, new Date(1990, 3, 19), true);
        var p2 = new Person(p2Details, new ArrayList<Person>(Arrays.asList(child)));

        return args -> {
            log.info("Preloading " + personRepository.save(child));
            log.info("Preloading " + personRepository.save(p1));
            log.info("Preloading " + personRepository.save(p2));
        };
    }
}
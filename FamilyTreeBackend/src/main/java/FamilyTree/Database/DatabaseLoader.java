package FamilyTree.Database;

//import FamilyTree.Repositories.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class DatabaseLoader {

    private static final Logger log = LoggerFactory.getLogger(DatabaseLoader.class);
    // will implement it once I am able to pull after the merge

//    @Bean
//    CommandLineRunner initDatabase(PersonRepository repository) {
//        return args -> {
//            log.info("Preloading " + repository.save(new Person("Bilbo Baggins", "burglar")));
//            log.info("Preloading " + repository.save(new Person("Frodo Baggins", "thief")));
//        };
//    }
}
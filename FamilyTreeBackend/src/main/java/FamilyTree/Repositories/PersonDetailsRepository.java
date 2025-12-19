package FamilyTree.Repositories;


import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDetailsRepository extends JpaRepository<FamilyTree.Model.PersonDetails, Long> {
}

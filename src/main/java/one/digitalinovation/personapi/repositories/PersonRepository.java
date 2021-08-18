package one.digitalinovation.personapi.repositories;

import one.digitalinovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

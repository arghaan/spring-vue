package site.syrius.springvue.backend.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import site.syrius.springvue.backend.jpa.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}

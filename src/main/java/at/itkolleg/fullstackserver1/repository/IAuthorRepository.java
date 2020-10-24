package at.itkolleg.fullstackserver1.repository;

import at.itkolleg.fullstackserver1.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepository extends JpaRepository<Author, Integer> {

}

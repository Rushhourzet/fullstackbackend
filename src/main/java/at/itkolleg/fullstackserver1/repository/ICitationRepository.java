package at.itkolleg.fullstackserver1.repository;

import at.itkolleg.fullstackserver1.model.Citation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICitationRepository extends JpaRepository<Citation, Long> {

}

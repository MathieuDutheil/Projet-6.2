package escalade.mathieudutheil.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.SiteDeGrimpe;

@Repository
public interface SiteDeGrimpeRepository extends CrudRepository<SiteDeGrimpe, Integer> {
}
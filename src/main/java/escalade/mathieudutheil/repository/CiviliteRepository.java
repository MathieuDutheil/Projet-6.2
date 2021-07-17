package escalade.mathieudutheil.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.Civilite;

@Repository
public interface CiviliteRepository extends CrudRepository<Civilite, Integer> {
}
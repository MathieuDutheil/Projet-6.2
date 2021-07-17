package escalade.mathieudutheil.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.Voie;

@Repository
public interface VoieRepository extends CrudRepository<Voie, Integer> {
}
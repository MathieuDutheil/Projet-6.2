package escalade.mathieudutheil.repository;


import escalade.mathieudutheil.model.Secteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.Secteur;

@Repository
public interface SecteurRepository extends CrudRepository<Secteur, Integer> {
}
package escalade.mathieudutheil.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.Grimpeur;

@Repository
public interface GrimpeurRepository extends CrudRepository<Grimpeur, Integer> {
}
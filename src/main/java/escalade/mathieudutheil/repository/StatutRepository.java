package escalade.mathieudutheil.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.Statut;

@Repository
public interface StatutRepository extends CrudRepository<Statut, Integer> {
}
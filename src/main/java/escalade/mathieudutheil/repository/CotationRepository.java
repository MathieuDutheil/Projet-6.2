package escalade.mathieudutheil.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.Cotation;

@Repository
public interface CotationRepository extends CrudRepository<Cotation, Integer> {
}
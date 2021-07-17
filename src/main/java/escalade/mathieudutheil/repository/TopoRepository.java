package escalade.mathieudutheil.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.Topo;

@Repository
public interface TopoRepository extends CrudRepository<Topo, Integer> {
}
package escalade.mathieudutheil.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.Commentaire;

@Repository
public interface CommentaireRepository extends CrudRepository<Commentaire, Integer> {
}
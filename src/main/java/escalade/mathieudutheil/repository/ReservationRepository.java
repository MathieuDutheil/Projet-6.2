package escalade.mathieudutheil.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import escalade.mathieudutheil.model.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Integer> {
}
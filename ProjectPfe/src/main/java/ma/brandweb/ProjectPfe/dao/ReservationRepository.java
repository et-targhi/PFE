package ma.brandweb.ProjectPfe.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.ProjectPfe.bean.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

	public List<Reservation> findByDateReservation(Date dateReservation);

	public List<Reservation> findByStatus(String status);

	public List<Reservation> findByNbrPersonnes(int nbrPersonnes);

	public List<Reservation> findByActiviteReference(String reference);

	public int deleteByReference(String reference);
}

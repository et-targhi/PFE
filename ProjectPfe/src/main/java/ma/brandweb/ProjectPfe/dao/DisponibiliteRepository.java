package ma.brandweb.ProjectPfe.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.ProjectPfe.bean.Disponibilite;

@Repository
public interface DisponibiliteRepository extends JpaRepository<Disponibilite, Long> {

	public List<Disponibilite> findByDateReservation(Date dateReservation);

	public List<Disponibilite> findByActiviteReference(String reference);

	public Disponibilite findByActiviteReferenceAndDateReservation(String reference, Date dateReservation);

	public int deleteByReference(String reference);
}

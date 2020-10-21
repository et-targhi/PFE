package ma.brandweb.ProjectPfe.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.brandweb.ProjectPfe.bean.Disponibilite;
import ma.brandweb.ProjectPfe.bean.Reservation;
import ma.brandweb.ProjectPfe.dao.ReservationRepository;

@Service
public class ReservationService {
	@Autowired
	private ReservationRepository reservationRepository;

	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}

	@Autowired
	private DisponibiliteService disponibiliteService;

	public int save(Reservation reservation) {
		Disponibilite disponibilite = disponibiliteService.findByActiviteReferenceAndDateReservation(
				reservation.getActivite().getReference(), reservation.getDateReservation());
		if (disponibilite != null) {
			if (disponibilite.getPlacesRestant() >= reservation.getNbrPersonnes()) {
				disponibilite.setPlacesRestant(disponibilite.getPlacesRestant() - reservation.getNbrPersonnes());
				disponibiliteService.save(disponibilite);
				reservation.setStatus("Reserver");
				reservationRepository.save(reservation);
				return 1;
			} else {
				return -1;
			}
		} else {
			if (reservation.getActivite().getPlacesDisponible() >= reservation.getNbrPersonnes()) {
				reservationRepository.save(reservation);
				disponibilite = new Disponibilite();

				disponibilite.setActivite(reservation.getActivite());
				disponibilite.setDateReservation(reservation.getDateReservation());
				disponibilite.setPlacesRestant(
						reservation.getActivite().getPlacesDisponible() - reservation.getNbrPersonnes());
				disponibiliteService.save(disponibilite);
				return 2;
			} else {
				return -2;
			}

		}

	}

	public List<Reservation> findByDateReservation(Date dateReservation) {
		return reservationRepository.findByDateReservation(dateReservation);
	}

	public List<Reservation> findByStatus(String status) {
		return reservationRepository.findByStatus(status);
	}

	public List<Reservation> findByNbrPersonnes(int nbrPersonnes) {
		return reservationRepository.findByNbrPersonnes(nbrPersonnes);
	}

	public List<Reservation> findByActiviteReference(String reference) {
		return reservationRepository.findByActiviteReference(reference);
	}

	@Transactional
	public int deleteByReference(String reference) {
		return reservationRepository.deleteByReference(reference);
	}

}

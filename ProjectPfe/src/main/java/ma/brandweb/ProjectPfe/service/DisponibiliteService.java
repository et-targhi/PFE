package ma.brandweb.ProjectPfe.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.brandweb.ProjectPfe.bean.Disponibilite;
import ma.brandweb.ProjectPfe.dao.DisponibiliteRepository;

@Service
public class DisponibiliteService {
	@Autowired
	private DisponibiliteRepository disponibiliteRepository;

	public Disponibilite findByActiviteReferenceAndDateReservation(String reference, Date dateReservation) {
		return disponibiliteRepository.findByActiviteReferenceAndDateReservation(reference, dateReservation);
	}

	public List<Disponibilite> findByDateReservation(Date dateReservation) {
		return disponibiliteRepository.findByDateReservation(dateReservation);
	}

	public List<Disponibilite> findByActiviteReference(String reference) {
		return disponibiliteRepository.findByActiviteReference(reference);
	}

	public void save(Disponibilite disponibilite) {
		disponibiliteRepository.save(disponibilite);
	}

	public List<Disponibilite> findAll() {
		return disponibiliteRepository.findAll();
	}

	public int deleteByRefirence(String reference) {
		return disponibiliteRepository.deleteByReference(reference);
	}
}

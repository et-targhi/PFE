package ma.brandweb.ProjectPfe.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.brandweb.ProjectPfe.bean.Activite;
import ma.brandweb.ProjectPfe.dao.ActiviteRepository;

@Service
public class ActiviteService {
	@Autowired
	private ActiviteRepository activiteRepository;

	@Autowired
	private ImageService imageService;

	public Activite findByReference(String reference) {
		return activiteRepository.findByReference(reference);
	}

	public Activite findByNom(String nom) {
		return activiteRepository.findByNom(nom);
	}

	public List<Activite> findByPlacesDisponible(int placesDisponible) {
		return activiteRepository.findByPlacesDisponible(placesDisponible);
	}

	public List<Activite> findAll() {
		return activiteRepository.findAll();
	}

	public void save(Activite activite) {
		Activite currentActivite = activiteRepository.save(activite);
		this.imageService.saveAll(currentActivite, activite.getImages());

	}

	@Transactional
	public int deleteByReference(String reference) {
		return activiteRepository.deleteByReference(reference);
	}

}

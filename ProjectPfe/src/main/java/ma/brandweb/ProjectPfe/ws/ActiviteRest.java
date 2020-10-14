package ma.brandweb.ProjectPfe.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.brandweb.ProjectPfe.bean.Activite;
import ma.brandweb.ProjectPfe.service.ActiviteService;

@RestController
@RequestMapping("api/activite")
@CrossOrigin(origins = "http://localhost:4200")
public class ActiviteRest {
	@Autowired
	private ActiviteService activiteService;

	@GetMapping("/reference/{reference}")
	public Activite findByReference(@PathVariable String reference) {
		return activiteService.findByReference(reference);
	}

	@GetMapping("/nom/{nom}")
	public Activite findByNom(@PathVariable String nom) {
		return activiteService.findByNom(nom);
	}

	@GetMapping("/placesdisponible/{placesdisponible}")
	public List<Activite> findByPlacesDisponible(@PathVariable int placesDisponible) {
		return activiteService.findByPlacesDisponible(placesDisponible);
	}

	@GetMapping("/")
	public List<Activite> findAll() {
		return activiteService.findAll();
	}

	@PostMapping("/")
	public void save(@RequestBody Activite activite) {
		activiteService.save(activite);
	}

	@DeleteMapping("/reference/{reference}")
	public int deleteByReference(@PathVariable String reference) {
		return activiteService.deleteByReference(reference);
	}

}

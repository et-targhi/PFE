package ma.brandweb.ProjectPfe.ws;

import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.brandweb.ProjectPfe.bean.Disponibilite;
import ma.brandweb.ProjectPfe.service.DisponibiliteService;

@RestController
@RequestMapping("api/disponibilite")
@CrossOrigin(origins = "http://localhost:4200")
public class DisponibiliteRest {
	private DisponibiliteService disponibiliteService;

	@GetMapping("/activite/reference/{reference}/dateReservation/{dateReservation}")
	public Disponibilite findByActiviteReferenceAndDateReservation(@PathVariable String reference,
			@PathVariable Date dateReservation) {
		return disponibiliteService.findByActiviteReferenceAndDateReservation(reference, dateReservation);
	}

	@GetMapping("/datereservation/{datereservation}")
	public List<Disponibilite> findByDateReservation(@PathVariable Date dateReservation) {
		return disponibiliteService.findByDateReservation(dateReservation);
	}

	@GetMapping("/activite/reference/{reference}")
	public List<Disponibilite> findByActiviteReference(@PathVariable String reference) {
		return disponibiliteService.findByActiviteReference(reference);
	}

	@PostMapping("/")
	public void save(@RequestBody Disponibilite disponibilite) {
		disponibiliteService.save(disponibilite);
	}

	@GetMapping("/")
	public List<Disponibilite> findAll() {
		return disponibiliteService.findAll();
	}

	@DeleteMapping("/reference/{reference}")
	public int deleteByRefirence(@PathVariable String reference) {
		return disponibiliteService.deleteByRefirence(reference);
	}
}

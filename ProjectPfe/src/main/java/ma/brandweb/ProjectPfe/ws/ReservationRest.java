package ma.brandweb.ProjectPfe.ws;

import java.util.Date;
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

import ma.brandweb.ProjectPfe.bean.Reservation;
import ma.brandweb.ProjectPfe.service.ReservationService;

@RestController
@RequestMapping("api/reservation")
@CrossOrigin(origins = "http://localhost:4200")

public class ReservationRest {
	@Autowired
	private ReservationService reservationService;

	@PostMapping("/")
	public int save(@RequestBody Reservation reservation) {
		return reservationService.save(reservation);
	}

	@GetMapping("/datereservation/{datereservation}")
	public List<Reservation> findByDateReservation(@PathVariable Date dateReservation) {
		return reservationService.findByDateReservation(dateReservation);
	}

	@GetMapping("/status/{status}")
	public List<Reservation> findByStatus(@PathVariable String status) {
		return reservationService.findByStatus(status);
	}

	@GetMapping("/nbrpersonnes/{nbrpersonnes}")
	public List<Reservation> findByNbrPersonnes(@PathVariable int nbrpersonnes) {
		return reservationService.findByNbrPersonnes(nbrpersonnes);
	}

	@GetMapping("/activite/reference/{reference}")
	public List<Reservation> findByActiviteReference(@PathVariable String reference) {
		return reservationService.findByActiviteReference(reference);
	}

	@DeleteMapping("/reference/{reference}")
	public int deleteByReference(@PathVariable String reference) {
		return reservationService.deleteByReference(reference);
	}

	@GetMapping("/")
	public List<Reservation> findAll() {
		return reservationService.findAll();
	}
}

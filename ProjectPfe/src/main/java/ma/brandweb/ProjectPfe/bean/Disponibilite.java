package ma.brandweb.ProjectPfe.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Disponibilite {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	private Date dateReservation;
	private int placesRestant;
	@ManyToOne
	private Activite activite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getPlacesRestant() {
		return placesRestant;
	}

	public void setPlacesRestant(int placesRestant) {
		this.placesRestant = placesRestant;
	}

	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public Disponibilite(Long id, Date dateReservation, int placesRestant, Activite activite) {
		super();
		this.id = id;
		this.dateReservation = dateReservation;
		this.placesRestant = placesRestant;
		this.activite = activite;
	}

	public Disponibilite() {
		super();
		// TODO Auto-generated constructor stub
	}

}

package ma.brandweb.ProjectPfe.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Activite {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	private String nom;
	private double prixBase;
	private double prixVente;
	private String desciption;
	private String details;
	private String conditions;
	private String promotion;
	private double prixPromotion;
	private int placesDisponible;

	@OneToMany(mappedBy = "activite")
	private List<Reservation> reservations;
	@OneToMany(mappedBy = "activite")
	private List<Image> images;

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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrixBase() {
		return prixBase;
	}

	public void setPrixBase(double prixBase) {
		this.prixBase = prixBase;
	}

	public double getPrixVente() {
		return prixVente;
	}

	public void setPrixVente(double prixVente) {
		this.prixVente = prixVente;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getConditions() {
		return conditions;
	}

	public void setConditions(String conditions) {
		this.conditions = conditions;
	}

	public String getPromotion() {
		return promotion;
	}

	public void setPromotion(String promotion) {
		this.promotion = promotion;
	}

	public double getPrixPromotion() {
		return prixPromotion;
	}

	public void setPrixPromotion(double prixPromotion) {
		this.prixPromotion = prixPromotion;
	}

	public int getPlacesDisponible() {
		return placesDisponible;
	}

	public void setPlacesDisponible(int placesDisponible) {
		this.placesDisponible = placesDisponible;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Activite(Long id, String reference, String nom, double prixBase, double prixVente, String desciption,
			String details, String conditions, String promotion, double prixPromotion, int placesDisponible,
			List<Reservation> reservations, List<Image> images) {
		super();
		this.id = id;
		this.reference = reference;
		this.nom = nom;
		this.prixBase = prixBase;
		this.prixVente = prixVente;
		this.desciption = desciption;
		this.details = details;
		this.conditions = conditions;
		this.promotion = promotion;
		this.prixPromotion = prixPromotion;
		this.placesDisponible = placesDisponible;
		this.reservations = reservations;
		this.images = images;
	}

	public Activite() {
		super();
		// TODO Auto-generated constructor stub
	}
}

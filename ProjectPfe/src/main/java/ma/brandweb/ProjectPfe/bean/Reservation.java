package ma.brandweb.ProjectPfe.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	private String nomClient;
	private String prenomClient;
	private String telephone;
	private String email;
	private Date dateReservation;
	private int nbrPersonnes;
	private String status;
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

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public String getPrenomClient() {
		return prenomClient;
	}

	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbrPersonnes() {
		return nbrPersonnes;
	}

	public void setNbrPersonnes(int nbrPersonnes) {
		this.nbrPersonnes = nbrPersonnes;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public Reservation(Long id, String nomClient, String prenomClient, String telephone, String email,
			Date dateReservation, int nbrPersonnes, String status, Activite activite) {
		super();
		this.id = id;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.telephone = telephone;
		this.email = email;
		this.dateReservation = dateReservation;
		this.nbrPersonnes = nbrPersonnes;
		this.status = status;
		this.activite = activite;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

}

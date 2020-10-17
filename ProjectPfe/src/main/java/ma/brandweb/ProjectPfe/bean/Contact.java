package ma.brandweb.ProjectPfe.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String reference;
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	private String nom;
	private String email;
	private String message;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Long id, String reference, String nom, String email, String message) {
		super();
		this.id = id;
		this.reference = reference;
		this.nom = nom;
		this.email = email;
		this.message = message;
	}

	
	
}

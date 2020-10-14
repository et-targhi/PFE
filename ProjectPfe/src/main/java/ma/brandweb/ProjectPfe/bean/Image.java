package ma.brandweb.ProjectPfe.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String libelle;

	@ManyToOne
	private Activite activite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Activite getActivite() {
		return activite;
	}

	public void setActivite(Activite activite) {
		this.activite = activite;
	}

	public Image(Long id, String libelle, Activite activite) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.activite = activite;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

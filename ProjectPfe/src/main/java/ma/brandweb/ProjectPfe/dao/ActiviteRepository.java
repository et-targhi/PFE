package ma.brandweb.ProjectPfe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.ProjectPfe.bean.Activite;

@Repository
public interface ActiviteRepository extends JpaRepository<Activite, Long> {

	public Activite findByReference(String reference);

	public Activite findByNom(String nom);

	public List<Activite> findByPlacesDisponible(int placesDisponible);

	public int deleteByReference(String reference);
}

package ma.brandweb.ProjectPfe.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.ProjectPfe.bean.Activite;
import ma.brandweb.ProjectPfe.bean.Image;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long>{

	public Image findByLibelle(String libelle);

	public List<Image> findByActivite(Activite activite);

}

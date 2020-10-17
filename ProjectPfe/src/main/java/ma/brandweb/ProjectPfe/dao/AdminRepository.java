package ma.brandweb.ProjectPfe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.ProjectPfe.bean.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	public Admin findByNom(String nom);
}

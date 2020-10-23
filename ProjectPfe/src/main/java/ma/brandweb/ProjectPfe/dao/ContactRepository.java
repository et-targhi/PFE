package ma.brandweb.ProjectPfe.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.brandweb.ProjectPfe.bean.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

	public Contact findByReference(String reference);

	public int deleteByReference(String reference);
}

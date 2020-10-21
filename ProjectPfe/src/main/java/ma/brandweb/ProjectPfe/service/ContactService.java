package ma.brandweb.ProjectPfe.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.brandweb.ProjectPfe.bean.Contact;
import ma.brandweb.ProjectPfe.dao.ContactRepository;

@Service
public class ContactService {
	private ContactRepository contactRepository;

	public void deleteAll() {
		contactRepository.deleteAll();
	}

	public Contact findByReference(String reference) {
		return contactRepository.findByReference(reference);
	}

	public int deleteByReference(String reference) {
		return contactRepository.deleteByReference(reference);
	}

	public List<Contact> findAll() {
		return contactRepository.findAll();
	}

	public void save(Contact contact) {
		contactRepository.save(contact);
	}
}

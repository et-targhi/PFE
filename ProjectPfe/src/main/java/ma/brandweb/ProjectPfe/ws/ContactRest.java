package ma.brandweb.ProjectPfe.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.brandweb.ProjectPfe.bean.Contact;
import ma.brandweb.ProjectPfe.service.ContactService;

@RestController
@RequestMapping("api/contact")
@CrossOrigin(origins = "http://localhost:4200")

public class ContactRest {
	@Autowired
	private ContactService contactService;

	@GetMapping("/reference/{reference}")
	public Contact findByReference(@PathVariable String reference) {
		return contactService.findByReference(reference);
	}

	@DeleteMapping("/reference/{reference}")
	public int deleteByReference(@PathVariable String reference) {
		return contactService.deleteByReference(reference);
	}

	@GetMapping("/")
	public List<Contact> findAll() {
		return contactService.findAll();
	}

	@PostMapping("/")
	public void save(@RequestBody Contact contact) {
		contactService.save(contact);
	}
}

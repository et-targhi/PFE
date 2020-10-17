package ma.brandweb.ProjectPfe.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ma.brandweb.ProjectPfe.bean.Admin;
import ma.brandweb.ProjectPfe.service.AdminService;

@RestController
@RequestMapping("api/admin")
@CrossOrigin(origins = "http://localhost:4200")
public class AdminRest {
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/nom/{nom}")
	public Admin findByNom(String nom) {
		return adminService.findByNom(nom);
	}

	@PostMapping("/")
	public void save(@RequestBody Admin admin) {
		adminService.save(admin);
	}

	@GetMapping("/")
	public List<Admin> findAll() {
		return adminService.findAll();
	}

}

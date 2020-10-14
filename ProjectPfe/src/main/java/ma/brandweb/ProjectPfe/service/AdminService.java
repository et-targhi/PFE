package ma.brandweb.ProjectPfe.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.brandweb.ProjectPfe.bean.Admin;
import ma.brandweb.ProjectPfe.dao.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository adminRepository;

	public void save(Admin admin) {
		adminRepository.save(admin);
	}

	public List<Admin> findAll() {
		return adminRepository.findAll();
	}
}

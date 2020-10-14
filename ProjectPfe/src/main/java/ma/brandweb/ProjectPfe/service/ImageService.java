package ma.brandweb.ProjectPfe.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.brandweb.ProjectPfe.bean.Activite;
import ma.brandweb.ProjectPfe.bean.Image;
import ma.brandweb.ProjectPfe.dao.ImageRepository;

@Service
public class ImageService {
	@Autowired
	private ImageRepository imageRepository;

	public List<Image> findByActivite(Activite activite) {
		return imageRepository.findByActivite(activite);
	}

	public List<Image> findAll() {
		return imageRepository.findAll();
	}

	public List<Image> saveAll(Activite activite, List<Image> images) {
		List<Image> savedActiviteImages = new ArrayList<>();
		images.forEach(image -> {
			image.setActivite(activite);
			savedActiviteImages.add(this.imageRepository.save(image));
		});
		return imageRepository.saveAll(savedActiviteImages);
	}
}

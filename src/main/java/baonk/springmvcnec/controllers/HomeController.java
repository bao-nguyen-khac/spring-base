package baonk.springmvcnec.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import baonk.springmvcnec.dao.UserDAO;
import baonk.springmvcnec.entities.UserEntity;

@Controller
public class HomeController {
	
	@Autowired
	private UserDAO userDAO;
	
	@GetMapping("/")
	public String showForm() {
		return "form";
	}
	
	@PostMapping(value = "/create-user",
			consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE
			)
	public String createUser(UserEntity userEntity) {
		userDAO.createUser(userEntity);
		return "form";
	}
}

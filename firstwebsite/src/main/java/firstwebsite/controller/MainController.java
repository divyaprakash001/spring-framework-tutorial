package firstwebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import firstwebsite.dao.UserDao;
import firstwebsite.model.User;

@Controller
public class MainController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/")
	public String home() {
		return "index";
	}

	@RequestMapping(path = "/registrationForm")
	public String show_form() {
		return "form";
	}

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String handleRegisterForm(@ModelAttribute("user") User user, Model model) {
		System.out.println(user);
		userDao.createUser(user);
		model.addAttribute("user", user);
		return "success";
	}
	
	@RequestMapping(path = "/showusers")
	public String showUsers(Model m) {
		List<User> users = userDao.getAllUsers();
		m.addAttribute("users",users);
		return "data";
	}
	
	@RequestMapping(path = "/modify")
	public String modifyUser() {
		return "modify";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") int id) {
		userDao.deleteUser(id);
		return "deleted";
	}

}

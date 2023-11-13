package springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.User;
import springMVC.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learn Code With Durgesh");
		m.addAttribute("desc", "Home for programmer");
		System.out.println("Adding common data to model");
	}

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String showForm(Model m) {
		System.out.println("showing contact form");
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);
		
		if (!user.getEmail().endsWith("@gmail.com")) {
			model.addAttribute("errormsg","wrong email id");
			return "redirect:/contact";
		}

		int userId = this.userService.saveUser(user);
		
		model.addAttribute("msg","Congratulations! You have successfully registred with the id " + userId);

		return "success";
	}

}

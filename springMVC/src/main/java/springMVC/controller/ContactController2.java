package springMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springMVC.model.User;

//@Controller
public class ContactController2 {

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "Learn Code With Durgesh");
		m.addAttribute("desc", "Home for programmer");
		System.out.println("Adding common data to model");
	}

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String showForm(Model m) {

//		m.addAttribute("Header","Learn Code With Durgesh");
//		m.addAttribute("desc","Home for programmer");
		System.out.println("showing contact form");
		return "contact";
	}

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam(name = "username", required = true) String userName,
//			@RequestParam(name = "email", required = true) String userEmail,
//			@RequestParam(name = "password", required = true) String userPassword, Model model) {
//
//		System.out.println("username :: " + userName);
//		System.out.println("userEmail :: " + userEmail);
//		System.out.println("userPassword :: " + userPassword);
//
////		process the data
//
////		setting data to view
//		model.addAttribute("name", userName);
//		model.addAttribute("email", userEmail);
//		model.addAttribute("password", userPassword);
//
//		return "success";
//	}

//	@RequestMapping(path = "/processform", method = RequestMethod.POST)
//	public String handleForm(@RequestParam(name = "username", required = true) String userName,
//			@RequestParam(name = "email", required = true) String userEmail,
//			@RequestParam(name = "password", required = true) String userPassword, Model model) {
//
//		User user = new User();
//		user.setUsername(userName);
//		user.setEmail(userEmail);
//		user.setPassword(userPassword);
//		System.out.println(user);
//
////		process the data
//
////		setting data to view
//		model.addAttribute("user", user);
//
//		return "success";
//	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {

		System.out.println(user);

//		done @requestParam work
//		done User mapping
//		addAttribute to model  ie;  model.addAttribute("user", user);
//		
//		model.addAttribute("Header","Learn Code With Durgesh");
//		model.addAttribute("desc","Home for programmer");
		System.out.println("processing the form");

		return "success";
	}

}

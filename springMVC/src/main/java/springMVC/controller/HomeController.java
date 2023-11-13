package springMVC.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/first")
public class HomeController {

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("this is home url");

		model.addAttribute("name", "Ankit Kumar"); // to add data dynamically to view page
		model.addAttribute("id", 1421);

		List<String> friends = new ArrayList<String>();
		friends.add("sipu");
		friends.add("ritesh");
		friends.add("mithilesh");

		model.addAttribute("f", friends);

		return "index";
	}

	@RequestMapping(path = "/about", method = RequestMethod.GET)
	public String about() {
		System.out.println("about url is running");
		return "about";
	}

	@RequestMapping(path = "/service", method = RequestMethod.GET)
	public String service() {
		System.out.println("this is service url");
		return "service";
	}

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String contact() {
		System.out.println("this is contact url");
		return "contact";
	}

	@RequestMapping(path = "/help", method = RequestMethod.GET)
	public ModelAndView help() {
		System.out.println("This is help url");
//		creating model and view object
		ModelAndView modelAndView = new ModelAndView();
//		setting the data
		modelAndView.addObject("name", "Uttam Sukla");
		modelAndView.addObject("rollnumber", 12345);

		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		now.toString();

//		marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(45);
		list.add(34);
		list.add(82);
		list.add(68);
		list.add(99);

		modelAndView.addObject("marks", list);

//		setting the view name
		modelAndView.setViewName("helpp");

		return modelAndView;
	}

}

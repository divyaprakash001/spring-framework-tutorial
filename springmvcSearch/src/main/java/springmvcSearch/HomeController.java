package springmvcSearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(path = "/homme")
	public String homme() {
		return "homme";
	}

//	handling the request
	@RequestMapping(path = "/welcome")
	public String welcome(@RequestParam("user") String name, Model m) {
		System.out.println(name);
		m.addAttribute("name", name);
		return "welcome";
	}

}

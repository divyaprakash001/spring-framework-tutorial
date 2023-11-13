package springMVC.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ReController {

//	well-known method to redirect mechanism
	
	@RequestMapping(path = "/one")
	public String one(Model model) {
		System.out.println("this is one handler [one]");

		model.addAttribute("msg", "this is one");

		return "redirect:/two";
	}

	@RequestMapping(path = "/two")
	public String two(Model model) {
		System.out.println("this is two handler [two]");

		return "redirect";
	}

//	another method of redirect mechanism
	
	@RequestMapping(path = "/three")
	public RedirectView three() {
		System.out.println("this is three handler [three]");
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("https://templatemo.com/tag/one-page");
		return redirectView;
	}

	@RequestMapping(path = "/four")
	public String four() {
		System.out.println("this is four handler [four]");

		return "contact";
	}
	
//	other method to redirect mechanism
	
	@RequestMapping(path = "/five")
	public String five(HttpServletResponse response) throws IOException {
		System.out.println("this is five handler [five]");
		response.sendRedirect("six");
		return "contact";
	}
	
	@RequestMapping(path = "/six")
	public String six()  {
		System.out.println("this is six handler [six]");
		return "contact";
	}

}

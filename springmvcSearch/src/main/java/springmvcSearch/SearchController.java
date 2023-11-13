package springmvcSearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/user/{userId}/{username}")
	public String getUserDetail(@PathVariable("userId") int userId, @PathVariable("username") String name) {
		System.out.println(userId);
		System.out.println(name);
		Integer.parseInt(name);
		return "home";
	}

	
	
	@RequestMapping(path = "/home")
	public String home() {

		System.out.println("going to home view");
		
		String str = null;
		System.out.println(str.length());
		
		return "home";
	}

	@RequestMapping(path = "/search", method = RequestMethod.GET)
	public RedirectView search(@RequestParam("querybox") String query) {
		RedirectView redirectView = new RedirectView();

		if (query.isBlank()) {
			redirectView.setUrl("home");
			return redirectView;
		}

		String url = "https://www.google.com/search?q=" + query;

		redirectView.setUrl(url);
		return redirectView;
	}
/*
//	handling exception in springMVC

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value =  NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg","NullPointerException has occured.");
		return "null_page";
	}
	
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumber(Model m) {
		m.addAttribute("msg","NumberFormatException has occured.");
		return "numberEx_page";
	}
	
	@ExceptionHandler(value =  Exception.class)
	public String genericExceptionHandler() {
		return "genericEx_page";
	}
	*/
	

}

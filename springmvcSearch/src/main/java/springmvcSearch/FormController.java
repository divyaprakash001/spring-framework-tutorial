package springmvcSearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping(path = "/form",method = RequestMethod.GET)
	public String showFrom() {
		return "complexForm";
	}
	
	@RequestMapping(path = "/handleform", method = RequestMethod.POST)
	public String handleform(@ModelAttribute("student") Student student,BindingResult result) {
		
		if(result.hasErrors()) {
			return "complexForm";
		}
		
		System.out.println(student);
		return "success";
	}
	
}

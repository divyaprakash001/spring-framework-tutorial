package springmvcSearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
//	handling exception in springMVC

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value =  NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg","NullPointerException has occured.");
		return "maintainance_page";
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
}

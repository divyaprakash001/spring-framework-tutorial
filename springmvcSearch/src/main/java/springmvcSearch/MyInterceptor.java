package springmvcSearch;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		
		System.out.println("this is prehandle method");
		
		String name = request.getParameter("user");
		if (name.startsWith("d") || name.startsWith("D")) {
			response.setContentType("text/html");
			PrintWriter pw= response.getWriter();
			pw.println("<h1>invalid name! name should not start with d or D</h1>");
			return false;
		}
		
			
		
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("this is postHandle");
		super.postHandle(request, response, handler, modelAndView);
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("this i s after completion method");
		super.afterCompletion(request, response, handler, ex);
	}
	
	
	
}

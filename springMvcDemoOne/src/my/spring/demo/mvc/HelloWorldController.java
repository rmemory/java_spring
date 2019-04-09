package my.spring.demo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	// Controller method to show HTML form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	// Controller method to process HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld-response";
	}
	
	@RequestMapping("/processFormV2")
	public String makeUpperCase(HttpServletRequest request, Model model) {
		// read request from form
		String theName = request.getParameter("studentName");
		
		// convert to upper case
		theName = theName.toUpperCase();
		
		// add message to model
		model.addAttribute("message", "Welcome " + theName);
		
		// return view jsp
		return "helloworld-response";
	}
	
	@RequestMapping("/processFormV3")
	public String makeUpperCase(
			@RequestParam("studentName")
			String theName, 
			Model model) {
		// convert to upper case
		theName = theName.toUpperCase();
		
		// add message to model
		model.addAttribute("message", "Welcome!! " + theName);
		
		// return view jsp
		return "helloworld-response";
	}
	
}

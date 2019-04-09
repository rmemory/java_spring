package student.pack;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model studentModel) {
		
		// create new student object
		Student theStudent = new Student();
		
		// Add student object to the model
		studentModel.addAttribute("student", theStudent);
		
	    // add the country options to the model 
		studentModel.addAttribute("theCountryOptions", countryOptions); 
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	// Form action in JSP specifies modelAttribute="student"
	public String processForm(@ModelAttribute("student")Student theStudent) {
		return "student-confirmation";
	}
}

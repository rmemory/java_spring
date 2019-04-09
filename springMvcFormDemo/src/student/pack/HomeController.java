package student.pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // extends from @Component
public class HomeController {
	@RequestMapping("/")
	public String showRootPage() {
		return "home-page"; // WEB-INF/view/home-page.jsp 
	}
}

package my.spring.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // extends from @Component
public class HomeController {
	@RequestMapping("/")
	public String showRootPage() {
		return "main-menu"; // WEB-INF/view/main-menu.jsp 
	}
}

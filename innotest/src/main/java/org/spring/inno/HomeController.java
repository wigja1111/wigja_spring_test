package org.spring.inno;


import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
//	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
//	
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home(Locale locale, Model model) {
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
//		
//		return "index";
//	}
//	
	
	@RequestMapping("/")
	public String getMain() {
		System.out.println("000000");
		
		return "boardList"; // View 이름 리턴
	}
	
}

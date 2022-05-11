package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class HelloWorld {
	
	@RequestMapping(method = RequestMethod.GET)
	 public ModelAndView sayHello()
	 {
		 return new ModelAndView("index","hellomsg","Welcome to Spring MVC");
	 }
	

}

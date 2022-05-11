package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping(value="/")

public class HelloWorld {
	@RequestMapping(method=RequestMethod.GET)
	
	public ModelAndView hello()
	{
		return new ModelAndView("index","helloworldmsg","Welcome to Spring");
	}

}

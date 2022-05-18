package wiprofsd.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wiprofsd.webdev.serviceimpl.ContactCountService;

@RestController
@RequestMapping("/countService")
public class ContactCountController {
	
	@Autowired
	ContactCountService countService;
	
	@GetMapping("/countContacts")
	public long countContacts()
	{
		return countService.countContacts();
	}

}

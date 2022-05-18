package wiprofsd.webdev.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import wiprofsd.webdev.model.Contact;

@RestController
public class ContactController {
	@CrossOrigin("http://localhost:4200")
	@GetMapping("/getContacts")
	public Contact getContacts()
	{
		Contact contact=new Contact();
		contact.setId(1);
		contact.setName("John");
		contact.setEmail("john@gmail.com");
		contact.setAddress("Bengaluru");
		return contact;
	}

}

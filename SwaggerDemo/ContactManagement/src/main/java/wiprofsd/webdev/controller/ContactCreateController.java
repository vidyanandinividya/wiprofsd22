package wiprofsd.webdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wiprofsd.webdev.entity.Contact;
import wiprofsd.webdev.serviceimpl.ContactCreateService;

@RestController
@RequestMapping("/createService")
public class ContactCreateController {
	@Autowired
	ContactCreateService createService;
	@PostMapping("/addContact")
	public String addContact(Contact contact)
	{
		return createService.addContact(contact);
	}
	@PostMapping("/addAllContacts")
	public String addAllContacts(List<Contact> contacts)
	{
		return createService.addAllContacts(contacts);
	}

}

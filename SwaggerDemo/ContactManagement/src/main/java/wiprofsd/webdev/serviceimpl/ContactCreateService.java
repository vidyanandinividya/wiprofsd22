package wiprofsd.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wiprofsd.webdev.entity.Contact;
import wiprofsd.webdev.repository.ContactRepository;

@Service
public class ContactCreateService {
	
	@Autowired
	ContactRepository createRepository;
	
	public String addContact(Contact contact)
	{
		createRepository.save(contact);
		createRepository.flush();
		return "Contact Record saved";
	}
	public String addAllContacts(List<Contact> contacts)
	{
		createRepository.saveAll(contacts);
		createRepository.flush();
		return "All Contact Record saved";
	}
	public Contact addContactswithSaveAndFlush(Contact contact)
	{
		return createRepository.saveAndFlush(contact);
		
		
	}
	

}

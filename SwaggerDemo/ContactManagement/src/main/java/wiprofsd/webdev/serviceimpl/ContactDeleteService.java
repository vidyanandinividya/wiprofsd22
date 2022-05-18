package wiprofsd.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wiprofsd.webdev.entity.Contact;
import wiprofsd.webdev.repository.ContactRepository;

@Service
public class ContactDeleteService {
	
	@Autowired
	ContactRepository deleteRepository;
	public String deleteSingleContact(Contact contact)
	{
		deleteRepository.delete(contact);
		return "Deleted Contact"+contact;
	}
	public String pruneTable()
	{
		deleteRepository.deleteAll();
		return "All contacts deleted";
	}
	public String deleteAllCustomContact(List<Contact> contacts)
	{
		deleteRepository.deleteAll(contacts);
		return "Delete All Custome Contacts";
	}
	public String DeleteAllContactsInBatch()
	{
		deleteRepository.deleteAllInBatch();
		return "Delete All in Batch completed";
	}

}

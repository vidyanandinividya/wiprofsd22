package wiprofsd.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import wiprofsd.webdev.entity.Contact;
import wiprofsd.webdev.repository.ContactRepository;

@Service
public class ContactReadService {
	
	@Autowired
	ContactRepository readRepository;
	
	public List<Contact> getAllContacts()
	{
		return readRepository.findAll();
	}
	public List<Contact> getNoAddressContacts()
	{
		Contact contactwithNoAddress=new Contact();
		contactwithNoAddress.setAddress("");
		ExampleMatcher matcher=ExampleMatcher.matching().withMatcher("address",
				ExampleMatcher.GenericPropertyMatchers.exact()).withIgnorePaths("id","name","email");
		Example<Contact> example=Example.of(contactwithNoAddress,matcher);
		return readRepository.findAll(example);
	}

}

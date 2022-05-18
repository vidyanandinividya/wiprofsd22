package wiprofsd.webdev.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
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
	public Page<Contact> getContactPaged()
	{
		Pageable records=PageRequest.of(0, 4);
		return readRepository.findAll(records);
	}
	public Page<Contact> getContactCustomPaged(int pageNumber,int numberofrecordsinapage)
	{
		Pageable records=PageRequest.of(pageNumber,numberofrecordsinapage);
		return readRepository.findAll(records);
	}
	public List<Contact> getSortedContacts()
	{
		return readRepository.findAll(Sort.by(Direction.DESC,"name"));
	}
	public List<Contact> getCustomSortedContactsById(Direction direction)
	{
		return readRepository.findAll(Sort.by(direction,"id"));
	}

}

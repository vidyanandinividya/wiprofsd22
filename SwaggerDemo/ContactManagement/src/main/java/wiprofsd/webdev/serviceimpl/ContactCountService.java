package wiprofsd.webdev.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wiprofsd.webdev.repository.ContactRepository;

@Service
public class ContactCountService {
	
	@Autowired
	ContactRepository countRepository;
	
	public long countContacts()
	{
		return countRepository.count();
	}

}

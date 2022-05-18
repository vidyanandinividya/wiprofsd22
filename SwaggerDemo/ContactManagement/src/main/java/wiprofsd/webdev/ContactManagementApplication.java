package wiprofsd.webdev;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort.Direction;

import lombok.extern.slf4j.Slf4j;
import wiprofsd.webdev.entity.Contact;
import wiprofsd.webdev.serviceimpl.ContactCountService;
import wiprofsd.webdev.serviceimpl.ContactCreateService;
import wiprofsd.webdev.serviceimpl.ContactDeleteService;
import wiprofsd.webdev.serviceimpl.ContactReadService;

@SpringBootApplication
@Slf4j
public class ContactManagementApplication implements CommandLineRunner{
	
	@Autowired
	ContactReadService readData;
	
	@Autowired
	ContactCreateService createContact;
	
	@Autowired
	ContactCountService countContact;
	
	@Autowired
	ContactDeleteService deleteContact;

	public static void main(String[] args)  {
		SpringApplication.run(ContactManagementApplication.class, args);
		System.out.println("Contact Manager Spring Boot Application");
		log.info("information from main class");
		
	}

	@Override
	public void run(String... args) throws Exception {
		//readContactServiceImpl();
		//createContactServiceImpl();
		log.info("Count the number of contacts->{}",countContact.countContacts());
		//deleteContactServiceImpl();
		
	}

	private void deleteContactServiceImpl() {
		log.info("Deleted single contact->{}",deleteContact.deleteSingleContact(Contact.builder().id(1).build()));
		log.info("Truncate Contact Table->{}",deleteContact.pruneTable());
		List<Contact> contacts=new ArrayList<>();
		contacts.add(Contact.builder().
						id(9).name("bruno").email("bruno@gmail.com").address("Delhi").build());
		contacts.add(Contact.builder().
				id(10).name("cielo").email("cielo@gmail.com").address("Mumbai").build());
		log.info("delete All Contacts->{}",deleteContact.deleteAllCustomContact(contacts));
		log.info("Delete All Contacts in Batch->{}",deleteContact.DeleteAllContactsInBatch());
	}

	private void createContactServiceImpl() {
		log.info("Insert a Single Contact->{}",
				createContact.addContact(Contact.builder().
						id(8).name("hans").email("hans@gmail.com").address("Delhi").build()));
		List<Contact> contacts=new ArrayList<>();
		contacts.add(Contact.builder().
						id(9).name("bruno").email("bruno@gmail.com").address("Delhi").build());
		contacts.add(Contact.builder().
				id(10).name("cielo").email("cielo@gmail.com").address("Mumbai").build());
		log.info("Add All Contacts->{}",createContact.addAllContacts(contacts));
		log.info("Insert Contact using Save and Flush->{}",
				createContact.addContactswithSaveAndFlush(Contact.builder().
						id(11).name("maria").email("maria@gmail.com").address("AP").build()));
	}

	private void readContactServiceImpl() {
		log.info("All Contacts->{}",readData.getAllContacts());
		log.info("All Contacts with no address->{}",readData.getNoAddressContacts());
		log.info("Fetch Contacts in Page Format->{}",
				readData.getContactPaged().get().collect(Collectors.toList()));
		log.info("Fetch Contacts in Custom Page Format->{}",
				readData.getContactCustomPaged(0, 3).get().collect(Collectors.toList()));
		log.info("Fetch Contacts with last added order->{}",
				readData.getSortedContacts());
		log.info("Fetch Contacts with Custom sorted by Id->{}",
				readData.getCustomSortedContactsById(Direction.DESC));
	}
	

}

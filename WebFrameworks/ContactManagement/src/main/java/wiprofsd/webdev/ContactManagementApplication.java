package wiprofsd.webdev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import wiprofsd.webdev.serviceimpl.ContactReadService;

@SpringBootApplication
@Slf4j
public class ContactManagementApplication implements CommandLineRunner{
	
	@Autowired
	ContactReadService readData;

	public static void main(String[] args)  {
		SpringApplication.run(ContactManagementApplication.class, args);
		System.out.println("Contact Manager Spring Boot Application");
		log.info("information from main class");
		
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("All Contacts->{}",readData.getAllContacts());
		log.info("All Contacts with no address->{}",readData.getNoAddressContacts());
		
	}
	

}

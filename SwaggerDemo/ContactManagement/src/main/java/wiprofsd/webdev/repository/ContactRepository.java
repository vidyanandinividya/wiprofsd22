package wiprofsd.webdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import wiprofsd.webdev.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Long>{

}

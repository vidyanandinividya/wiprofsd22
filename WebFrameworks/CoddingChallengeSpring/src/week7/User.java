package week7;

import java.util.Arrays;
import java.util.List;


public class User {

	private int uid;
	private String uname;
	private Contact []contacts;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Contact[] getContacts() {
		return contacts;
	}
	public void setContacts(Contact[] contacts) {
		this.contacts = contacts;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + "]";
	}
	// business logic
		public void contactDetails() {

			System.out.println("\nContact Details......");
			for (Contact contact : contacts) {
				System.out.println(contact.getState());
			}
		}
	
	
	
	
}

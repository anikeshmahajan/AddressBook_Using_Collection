package addressBookManager;

import java.util.List;

public interface IAddressbookService {

	boolean addContact(Contact contact);

	boolean editContact(String contactName,Contact contact, String first_Name1, String last_Name1, String address1, String city1, String pincode1, String phoneNo1, String email1);

	boolean deleteContact(String contactName1);

	List<Contact> showData();


	
	
}

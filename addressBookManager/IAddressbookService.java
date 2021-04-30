package addressBookManager;

import java.util.List;
import java.util.Scanner;

public interface IAddressbookService {

	boolean addContact(Contact contact);

	boolean editContact(String contactName,Scanner scanner);

	boolean deleteContact(String contactName1);

	List<Contact> showData();




}

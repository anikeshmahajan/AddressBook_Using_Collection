package addressBookManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public  class AdressService implements IAddressbookService {
	public List<Contact> list ;


	public AdressService() {
		list = new ArrayList<Contact>();

	}

	@Override
	public boolean addContact(Contact contact) {

		list.add(contact);

		return false;
	}


	public boolean deleteContact(String contactName1) {
		for (int i = 0; i < list.size(); i++) {
			if(contactName1.equalsIgnoreCase(list.get(i).first_Name));
			list.remove(i);
			return true;
		}

		return false;
	}



	@Override
	public  List<Contact> showData() {

		return list;


	}
	public boolean editContact(String contactName,Scanner scanner) {
		for (int i = 0; i < list.size(); i++) {


			if(list.get(i).first_Name.equalsIgnoreCase(contactName))

			{
				System.out.println("Enter the FirstName");
				String first_Name = scanner.next();

				System.out.println("Enter the LastName");
				String last_Name = scanner.next();

				System.out.println("Enter the Address");
				String address = scanner.next();

				System.out.println("Enter the City");
				String city = scanner.next();

				System.out.println("Enter the PinCode");
				String pincode = scanner.next();

				System.out.println("Enter the PhoneNo");
				String phoneNo = scanner.next();

				System.out.println("Enter the Email");
				String email = scanner.next();
				list.get(i).setFirst_Name(first_Name);
				list.get(i).setLast_Name(last_Name);
				list.get(i).setCity(city);
				list.get(i).setAddress(address);
				list.get(i).setPhoneNo(phoneNo);
				list.get(i).setPincode(pincode);
				System.out.println("Updated list" + list.get(i));
			}
		
		}






		return true;

	}



}

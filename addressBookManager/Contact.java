package addressBookManager;

public class Contact {
	public String first_Name,  last_Name,  address,  city,  pincode,  phoneNo;
	public String email;

	public Contact(String first_Name, String last_Name, String address, String city, String pincode, String phoneNo,
			String email) {

		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.address = address;
		this.city = city;
		this.pincode = pincode;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [first_Name=" + first_Name + ", last_Name=" + last_Name + ", address=" + address + ", city="
				+ city + ", pincode=" + pincode + ", phoneNo=" + phoneNo + ", email=" + email + "]";
	}



}

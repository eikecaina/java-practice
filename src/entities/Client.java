package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client{

	private String name;
	private long phoneNumber;
	private String email;
	private Date birthDate;
	private Address address;
	private Order order;
	

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client(String name, long phoneNumber2, String email, Date birthDate, Address address, Order order) {
		this.name = name;
		this.phoneNumber = phoneNumber2;
		this.email = email;
		this.birthDate = birthDate;
		this.address = address;
		this.order = order;
		
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Client = "+ name + "\n" + "PhoneNumber = " + 
				phoneNumber + "\n" + "Email = " + 
				email + "\n" + "BirthDate = " + 
				sdf.format(birthDate) + "\n" + address + "\n" +
				order;
				
	}
	
	
}

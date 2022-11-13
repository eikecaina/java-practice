package entities;

public class Address {

	private String street, contry, city, state;
	

	public Address(String street, String contry, String city, String state) {
		this.street = street;
		this.contry = contry;
		this.city = city;
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getContry() {
		return contry;
	}

	public void setContry(String contry) {
		this.contry = contry;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address" + "\n" + "Street: " + street + 
				"\n" + "Contry: " + contry + 
				"\n" + "City: " + city + 
				"\n" + "State: " + state;
	}
	
	
}

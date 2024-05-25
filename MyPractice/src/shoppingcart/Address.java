package shoppingcart;

public class Address {
	private String addressline1;
	private String state;
	private String city;
	private String zipcode;
	
	
	public Address(String addressline1, String state, String city, String zipcode) {
		super();
		this.addressline1 = addressline1;
		this.state = state;
		this.city = city;
		this.zipcode = zipcode;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	

}

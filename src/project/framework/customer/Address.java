package project.framework.customer;

public class Address {
	public String street;
	public String city;
	public String zipCode;
	public String state;
	public Address(String street, String city, String zipCode, String state) {
		super();
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}
	
        public String toString(){
            return street+","+city+","+zipCode+","+state;
        }
	
}

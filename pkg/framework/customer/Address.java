package pkg.framework.customer;

public class Address implements IAddress {

	private String street;

	private String city;

	private String state;

	private int zip;

    Address(String street, String city, String state, String zip) {
       this.street=street;
       this.city=city;
       this.state=state;
       this.zip=Integer.parseInt(zip);
    }

	public String toString() {
            String output=String.format("Street=%s\nCity=%s,State=%s,Zip=%d",street, city, state, zip);
		return output;
	}

}

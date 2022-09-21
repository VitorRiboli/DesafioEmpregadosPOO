package entities;

public class Address {
	
	private String email;
	private String phone;

	public Address(String email, String phone) {
		super();
		this.email = email;
		this.phone = phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String name) {
		this.email = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}

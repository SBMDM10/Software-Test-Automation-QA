package CS_320;

public class Contact {

	private final String contactId;
	private String firstName;
	private String lastName;
	private String contactPhone;
	private String contactAddress;
	
	public Contact(String contactId, String firstName, String lastName, String contactPhone, String contactAddress) {
		checkContactId(contactId);
		checkFirstName(firstName);
		checkLastName(lastName);
		checkContactPhone(contactPhone);
		checkContactAddress(contactAddress);
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactPhone = contactPhone;
		this.contactAddress = contactAddress;
	}
	
	public String getContactId() {
		return contactId;
	}
	
	
	public void setFirstName(String firstName) {
		checkFirstName(firstName);
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public void setLastName(String lastName) {
		checkLastName(lastName);
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
	public void setContactPhone(String contactPhone) {
		checkContactPhone(contactPhone);
		this.contactPhone = contactPhone;
	}

	public String getContactPhone() {
		return contactPhone;
	}
	
	
	public void setContactAddress(String contactAddress) {
		checkContactAddress(contactAddress);
		this.contactAddress = contactAddress;
	}
	
	public String getContactAddress() {
		return contactAddress;
	}
	public void checkContactId(String contactId) {
		if (contactId == null || contactId.length() > 10) {
			throw new IllegalArgumentException("Contact Id must be less than 11 characters and not null");
		}
	}
	public void checkFirstName(String firstName) {
		if (firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("First Name must be less than 11 characters and not null");
		}
	}
	public void checkLastName(String lastName) {
		if (lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Last Name must be less than 11 characters and not null");
		}
	}
	public void checkContactPhone(String contactPhone) {
		if (contactPhone == null || contactPhone.length() != 10) {
			throw new IllegalArgumentException("Contact Phone must be exactly 10 characters and not null");
		}
	}
	public void checkContactAddress(String contactAddress) {
		if (contactAddress == null || contactAddress.length() > 30) {
			throw new IllegalArgumentException("Contact Address must be less than 31 characters and not null");
		}
	}
}

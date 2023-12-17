package CS_320;

import CS_320.Contact;
import java.util.List;
import java.util.ArrayList;

public class ContactService {
	private final List<Contact> contactList;
	
	public ContactService() {
		this.contactList = new ArrayList<>();
	}
	
	public List<Contact> getContacts() {
		return contactList;
	}
	
	public Contact getContactById(String contactId) {
		for(Contact contact : contactList) {
			if(contact.getContactId().equals(contactId)) {
				return contact;
			}
		}
		return null;
	}
	
	public void addContact(Contact contact) {
		String contactId = contact.getContactId();
		if(getContactById(contactId) != null) {
			throw new IllegalArgumentException("That Contact ID  already exists.");
		}
		contactList.add(contact);
	}
	
	public void deleteContact(String contactId) {
		Contact tempContact = getContactById(contactId);
		if(tempContact != null) {
			contactList.remove(tempContact);
		}
	}
	
	public void updateContactAttributes(String contactId, String field, String value) {
		Contact tempContact = getContactById(contactId);
		if(tempContact != null) {
			switch(field.toLowerCase()) {
			case "firstname":
				tempContact.setFirstName(value);
				break;
			case "lastname":
				tempContact.setLastName(value);
				break;
			case "contactphone":
				tempContact.setContactPhone(value);
				break;
			case "contactaddress":
				tempContact.setContactAddress(value);;
				break;
			default:
				throw new IllegalArgumentException("Invalid Attribute for update: " + field);
			}
		}
	}
}

		

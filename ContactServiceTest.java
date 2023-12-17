package CS_320;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	void testContactServiceAddsContacts() {
		
		ContactService testContactService = new ContactService();
		
		Contact contact1 = new Contact("1", "Michael", "Moore", "6156025291", "107 Culotta Drive");
		Contact contact2 = new Contact("2", "Chelsea", "Moore", "8505440409", "107 Culotta Drive");
		
		testContactService.addContact(contact1);
		testContactService.addContact(contact2);
		
		assertEquals(2, testContactService.getContacts().size());
	}
	@Test
	void testContactIServiceForDuplicateId() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			ContactService testContactService = new ContactService();
        			
        			Contact contact1 = new Contact("1", "Michael", "Moore", "6156025291", "107 Culotta Drive");
        			Contact contact3 = new Contact("1", "Chelsea", "Moore", "8505440409", "107 Culotta Drive");
        			
        			testContactService.addContact(contact1);
        			testContactService.addContact(contact3);
        		});
        assertEquals("That Contact ID  already exists.", exception.getMessage());
    }
	@Test
	void testContactServiceDeletesContacts() {
		
		ContactService testContactService = new ContactService();
		
		Contact contact1 = new Contact("1", "Michael", "Moore", "6156025291", "107 Culotta Drive");
		Contact contact2 = new Contact("2", "Chelsea", "Moore", "8505440409", "107 Culotta Drive");
		
		testContactService.addContact(contact1);
		testContactService.addContact(contact2);
		
		testContactService.deleteContact("2");
		assertNull(testContactService.getContactById("2"));
	}
	@Test
	void testContactServiceUpdatesContactFirstName() {
		
		ContactService testContactService = new ContactService();
		
		Contact contact1 = new Contact("1", "Michael", "Moore", "6156025291", "107 Culotta Drive");
		testContactService.addContact(contact1);
		testContactService.updateContactAttributes("1", "firstname", "Chelsea");
		
		assertEquals("Chelsea", testContactService.getContactById("1").getFirstName());
	}
	@Test
	void testContactServiceUpdatesContactLastName() {
		
		ContactService testContactService = new ContactService();
		
		Contact contact1 = new Contact("1", "Michael", "Moore", "6156025291", "107 Culotta Drive");
		testContactService.addContact(contact1);
		testContactService.updateContactAttributes("1", "lastname", "Hutchison");

		assertEquals("Hutchison", testContactService.getContactById("1").getLastName());
	}
	@Test
	void testContactServiceUpdatesContactPhone() {
		
		ContactService testContactService = new ContactService();
		
		Contact contact1 = new Contact("1", "Michael", "Moore", "6156025291", "107 Culotta Drive");
		testContactService.addContact(contact1);
		testContactService.updateContactAttributes("1", "contactphone", "8505440409");

		assertEquals("8505440409", testContactService.getContactById("1").getContactPhone());
	}
	@Test
	void testContactServiceUpdatesContactAddress() {
		
		ContactService testContactService = new ContactService();
		
		Contact contact1 = new Contact("1", "Michael", "Moore", "6156025291", "107 Culotta Drive");
		testContactService.addContact(contact1);
		testContactService.updateContactAttributes("1", "contactaddress", "714 Delaware Ave");

		assertEquals("714 Delaware Ave", testContactService.getContactById("1").getContactAddress());
	}
}

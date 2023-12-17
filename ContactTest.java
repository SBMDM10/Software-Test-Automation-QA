package CS_320;

import static org.junit.jupiter.api.Assertions.*;
import CS_320.Contact;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testContactClass() {
		
		Contact contact1 = new Contact("1", "Michael", "Moore", "6156025291", "107 Culotta Drive");
			assertTrue(contact1.getContactId().equals("1"));
			assertTrue(contact1.getFirstName().equals("Michael"));
			assertTrue(contact1.getLastName().equals("Moore"));
			assertTrue(contact1.getContactPhone().equals("6156025291"));
			assertTrue(contact1.getContactAddress().equals("107 Culotta Drive"));
	}
	@Test
	void testSetterMethods() {
		Contact contact1 = new Contact("1", "First", "Last", "1234567890", "123 Fake Address");
		contact1.setFirstName("Michael");
		contact1.setLastName("Moore");
		contact1.setContactPhone("6156025291");
		contact1.setContactAddress("107 Culotta Drive");
			assertTrue(contact1.getFirstName().equals("Michael"));
			assertTrue(contact1.getLastName().equals("Moore"));
			assertTrue(contact1.getContactPhone().equals("6156025291"));
			assertTrue(contact1.getContactAddress().equals("107 Culotta Drive"));
	}
	@Test
	void testContactIdForNull() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact2 = new Contact(null, "Michael", "Moore", "6156025291", "107 Culotta Drive");
        		});
        assertEquals("Contact Id must be less than 11 characters and not null", exception.getMessage());
    }
	@Test
	void testContactIdForLength() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact3 = new Contact("12345678901", "Michael", "Moore", "6156025291", "107 Culotta Drive");
        		});
        assertEquals("Contact Id must be less than 11 characters and not null", exception.getMessage());
    }
	@Test
	void testFirstNameForNull() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact4 = new Contact("1", null, "Moore", "6156025291", "107 Culotta Drive");
        		});
        assertEquals("First Name must be less than 11 characters and not null", exception.getMessage());
    }
	@Test
	void testFirstNameForLength() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact5 = new Contact("1", "MichaelMooreRocks", "Moore", "6156025291", "107 Culotta Drive");
        		});
        assertEquals("First Name must be less than 11 characters and not null", exception.getMessage());
    }
	@Test
	void testLastNameForNull() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact6 = new Contact("1", "Michael", null, "6156025291", "107 Culotta Drive");
        		});
        assertEquals("Last Name must be less than 11 characters and not null", exception.getMessage());
    }
	@Test
	void testLastNameForLength() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact7 = new Contact("1", "Michael", "MooreMichaelStillRocks", "6156025291", "107 Culotta Drive");
        		});
        assertEquals("Last Name must be less than 11 characters and not null", exception.getMessage());
    }
	@Test
	void testContactPhoneForNull() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact8 = new Contact("1", "Michael", "Moore", null, "107 Culotta Drive");
        		});
        assertEquals("Contact Phone must be exactly 10 characters and not null", exception.getMessage());
    }
	@Test
	void testContactPhoneForLength() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact9 = new Contact("1", "Michael", "Moore", "615605291", "107 Culotta Drive");
        		});
        assertEquals("Contact Phone must be exactly 10 characters and not null", exception.getMessage());
    }
	@Test
	void testContactAddressForNull() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact10 = new Contact("1", "Michael", "Moore", "6156025291", null);
        		});
        assertEquals("Contact Address must be less than 31 characters and not null", exception.getMessage());
    }
	@Test
	void testContactAddressForLength() {
		
        Throwable exception = assertThrows(IllegalArgumentException.class, 
        		()-> {
        			Contact contact11 = new Contact("1", "Michael", "Moore", "6156025291", "This is not a reall address ut actually words to get to 31 characters or more");
        		});
        assertEquals("Contact Address must be less than 31 characters and not null", exception.getMessage());
    }
}

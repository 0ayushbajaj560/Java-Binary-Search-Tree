package binarySearchTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import junit.framework.TestCase;

public class ContactTest extends TestCase {

	Contact contact1 = new Contact();
	Contact contact2 = new Contact();
	
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testDefaultConstructor() {
		contact1 = new Contact();
		assertEquals(null, contact1.getFirstName());
	}
	
	public void testParameterizedConstructor() {
		contact1 = new Contact("Anish","Manikonda",7037982951L);
		assertEquals("Anish", contact1.getFirstName());
	}
	
	public void testSetters() {
		contact1 = new Contact("Test","Test2",0L);
		contact1.setFirstName("Anish");
		contact1.setLastName("Manikonda");
		contact1.setPhoneNumber(7037982951L);
		assertEquals("Anish", contact1.getFirstName());
	}
	
	public void testCompareTo() {
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact("Anish","Manikonda",7037982951L));
		contacts.add(new Contact("Anish","Manikonda",7037982951L));
		contacts.add(new Contact("Anish","Surname",7037982951L));
		contacts.add(new Contact("FirstName","Manikonda",7037982951L));
		contacts.add(new Contact("Anish","Manikonda",8037982951L));
		Collections.sort(contacts);
		assertEquals(7037982951L, contacts.get(0).getPhoneNumber());
	}

}

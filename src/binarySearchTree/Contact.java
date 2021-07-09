package binarySearchTree;

public class Contact implements Comparable<Contact>{

	private String firstName;
	private String lastName;
	private long phoneNumber;

	public Contact() {
		firstName = lastName = null;
		phoneNumber = 0L;
	}

	public Contact(String firstName, String lastName, long phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public int compareTo(Contact contact) {
		if(lastName.compareTo(contact.getLastName())==0)
			if(firstName.compareTo(contact.getFirstName())==0)
				if(phoneNumber>contact.getPhoneNumber())
					return 1;
				else {
					return -1;
				}
			else {
				return firstName.compareTo(contact.getFirstName());
			}
		return lastName.compareTo(contact.getLastName());
	}

}

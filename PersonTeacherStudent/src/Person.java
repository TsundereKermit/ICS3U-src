/**
 * Describe one person. Each person will have a first name, a last name
 * and an address.
 * @author Ms Cianci
 * @since  Friday, October 30, 2009
 */
public class Person implements Comparable<Person>
{
	private String firstName, lastName, address;	
	private Date birthday;
	
	public Person()
	{
		this("", "", "");
// Or:
//		firstName = "";
//		lastName = "";
//		address = "";		
	}
	
	public Person(String first, String last)
	{
		this(first, last, "");
// Or:
//		firstName = first;
//		lastName = last;
//		address = "";
	}
	
	public Person(String first, String last, String a)
	{
		this(first, last, a, 1, 1, 1900);
	}

	public Person(String first, String last, String a, int y, int m, int d)
	{
		firstName = first;
		lastName = last;
		address = a;
		birthday = new Date(y, m, d);
	}
	
	public Date getBirthday()
	{
		return birthday;
	}
	
	/**
	 * Accessor method to get this person's first name.
	 * @return this person's first name
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Accessor method to get this person's last name.
	 * @return this person's last name
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	/**
	 * Accessor method to get this person's address
	 * @return this person's address
	 */
	public String getAddress()
	{
		return address;
	}
	
	/**
	 * Accessor method to get this person's age
	 * @param d Date used to determine age
	 * @return an int containing the person's
	 * age as of the given Date d.
	 */
	public int getAge(Date d)
	{
		int age = 0;
		int birthdayMonth = birthday.getMonth();
		int dateMonth = d.getMonth();
		
		if (birthdayMonth < dateMonth)
			age = d.getYear() - birthday.getYear();
		
		else if (birthdayMonth > dateMonth)
			age = d.getYear() - birthday.getYear() - 1;
		
		else     // that is...   birthdayMonth == dateMonth
			if (birthday.getDay() <= d.getDay())
				age = d.getYear() - birthday.getYear();
			else
				age = d.getYear() - birthday.getYear() - 1;
			
		return(age);
	}
	
	
	/**
	 * Mutator method to set this person's first name
	 * @param n string used to set the first name
	 */
	public void setFirstName(String n)
	{
		firstName = n;
	}
	
	/**
	 * Mutator method to set this person's last name
	 * @param n string used to set the last name 
	 */
	public void setLastName(String n)
	{
		lastName = n;
	}
	
	/**
	 * Mutator method to set this person's address
	 * @param a string used to set the address
	 */
	public void setAddress(String a)
	{
		address = a;
	}
	
	/**
	 * Returns a string representation of this Person and its actual first
	 * name, last name and address. 
	 * @return a string representation of this Person
	 */
	public String toString()
	{
		return "Person: firstName = " + firstName
		+ ", lastName = " + lastName 
		+ ", address = " + address
		+ "birthday = " + birthday;
	}
	
	/**
	 * Compares this Person to the specified object. The result is true if
	 * the argument (p) has the same first name and last name as this object
	 * @param p the object to compare this Person to
	 * @return true if the Person objects are equal; false otherwise
	 */
	public boolean equals(Person p)
	{
		return firstName.equalsIgnoreCase(p.firstName) && lastName.equalsIgnoreCase(p.lastName);
	}
        
        public int compareTo (Person other) {
            int compare = getLastName().compareTo(other.getLastName());  

            if (compare < 0) 
                return -1;
            else if (compare > 0)
                return 1; 
            else {  
                int compare2 = getFirstName().compareTo(other.getFirstName());

                if (compare2 < 0) 
                    return -1;
                else if (compare2 < 0)
                    return 1;
                else
                    return 0;
            }
        }
}
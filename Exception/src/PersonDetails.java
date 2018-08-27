class Person
{
	String firstName;
	String lastName;
	char gender;
	
public Person() {
	firstName ="";
	lastName ="";
	gender='M';
	}
	
	public Person(String firstName, String lastName, char gender) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
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
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
}
class ApplicationException extends Exception
{
	public ApplicationException() {
		
	}
	
	public String toString() {
		return "Age invalid"
				+ "";
		
	}
}


public class PersonDetails {
	static void check(Person person) throws ApplicationException
	{
		if (person.getFirstName() =="" || person.getLastName() =="") 
		 throw new ApplicationException();
	     
		
	}
	
	public static void main(String args[])
	
	{
		Person person=new Person();
		person.setFirstName("");
		
		try {
			check(person);
		} catch (ApplicationException e) {
			System.out.println(e);
		}
		finally {
			
		}
	}
}
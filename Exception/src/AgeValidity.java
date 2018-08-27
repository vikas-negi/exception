class Account{
	long AccNum;
	double balance;
	Person AccHolder;
	public long getAccNum() {
		return AccNum;
	}
	public void setAccNum(long accNum) {
		AccNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return AccHolder;
	}
	public void setAccHolder(Person accHolder) {
		AccHolder = accHolder;
	}
	public Account(long accNum, double balance, Person accHolder) {
		super();
		AccNum = accNum;
		this.balance = balance;
		AccHolder = accHolder;
	}
	public Account() {
		
	}
	
}

class Perso
{
	String Name;
	Float Age;
	public Perso() {
		
	}
	public Perso(String name, Float age) {
		super();
		Name = name;
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Float getAge() {
		return Age;
	}
	public void setAge(Float age) {
		Age = age;
	}
	
}

class ApplicationException extends Exception
{
	public ApplicationException() {
		
	}
	
	private int detail;
    ApplicationException(int a) {
        detail = a;
     }
    public String toString()      {
        return "ApplicationException["+detail+"]";
     }
		
	}

public class AgeValidity {
	static void check(Perso person) throws ApplicationException
	{
		if (person.getAge() < 15 ) 
		 throw new ApplicationException();
	     
		
	}

	public static void main(String args[]) {
		Perso person= new Perso();
		person.setAge((float) 13);
		try {
			check(person);
		}catch(ApplicationException e) {
			System.out.println(e);
		}
		finally {
			
		}
		
				
		
	}
}

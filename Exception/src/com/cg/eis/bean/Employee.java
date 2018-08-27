package com.cg.eis.bean;
import com.cg.eis.exception.EmployeeException;
class Emp{
	int empid;
	String name;
	float salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public Emp(int empid, String name, float salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public Emp() {

	}
	
}

public class Employee {
	static void check(Emp emp1) throws EmployeeException
	{
		if (emp1.getSalary()< 3000 ) 
		 throw new EmployeeException(emp1.getSalary());
	     
		
	}
	public static void main(String args[]) {
		Emp emp1 = new Emp();
		emp1.setSalary(1500);
		try {
			check(emp1);
		}catch(EmployeeException e) {
			System.out.println("Exception Occurred:" +e.toString());
		}
		finally {
			
		}
				
	}
	

}

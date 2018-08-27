package com.cg.eis.exception;

public class EmployeeException extends Exception {
	float sal;
	public EmployeeException(float f)
	{
	sal=f;
	}
	public String toString()      {
        return "Salary is less than 3000";
     }
	

}

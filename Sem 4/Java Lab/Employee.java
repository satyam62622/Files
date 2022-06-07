/*
Problem Statement:
-> Write a java program to accept and print the employee details during runtime. The details will include employee id, name, dept_ Id. The program should raise an exception if user inputs incomplete or incorrect data. The entered value should meet the following conditions:

(i) First Letter of employee name should be in capital letter.
(ii) Employee id should be between 2001 and 5001
(iii) Department id should be an integer between 1 and 5.

If the above conditions are not met then the application should raise specific exception else should complete normal execution.

Dated: June.07.2022 (Tuesday)
By: Satyam Kumar
GitHub: github.com/satyam62622
*/

import java.util.Scanner;
class Details{
	String name;
	int eId,dId;
	Details(String name,int eId,int dId){
		this.name=name;
		this.eId=eId;
		this.dId=dId;
	}
	void display(){
		try {
		if(!(name.charAt(0)>='A' && name.charAt(0)<='Z'))
			throw new Exception("Input valid name. First Letter of employee name should be in capital letter.");
			System.out.println("Name: "+name);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
			if(eId < 2001 || eId > 5001)
				throw new Exception("Employee id should be between 2001 and 5001");
			System.out.println("Employee id: "+eId);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try {
			if(dId>5 || dId <1)
				throw new Exception("Department Id should be an Integer between 1 and 5");
			System.out.println("Department id: "+ dId);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}



public class Employee {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	int eId,dId;
	System.out.println("Please input Name of Employee: ");
	name=sc.nextLine();
	System.out.println("Input Employee Id: ");
	eId=sc.nextInt();
	System.out.println("Input Department Id: ");
	dId=sc.nextInt();
	Details emp = new Details(name,eId,dId);
	emp.display();
	sc.close();
}
}

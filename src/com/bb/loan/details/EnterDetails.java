package com.bb.loan.details;

import java.util.Scanner; 

class Details {
	String name;	
	int age;
	String address;
	String tol;
	float ammount;
	int tenure;
	
}
public class EnterDetails extends Details{
	public void getData(){
	Scanner scan=new Scanner(System.in);
System.out.println("Enter Details  :");
System.out.println("Name	:");
name=scan.next();
System.out.println("Age     :");
age=scan.nextInt();
System.out.println("Address");
address=scan.next();
System.out.println("Type Of Loan H. for Home: C for Car");
tol=scan.next();
System.out.println("Enter Ammount For Loan(in Lacs.)");
ammount=scan.nextInt();	
System.out.println("");
scan.close();
}
	public void show(){
		System.out.println("Your Details Are");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		System.out.println("Type Of loan"+tol);
		int x=5;
		Scanner scan=new Scanner(System.in);
		while(x==5)
		{if("H".equals(tol))
			{System.out.println("Tenure is 6 years");
			x=6;}
		else
			if("s".equals(tol))
			{System.out.println("Tenure is 7 years");
		x=6;}
		else {System.out.println("Wrong Type Of Loan Input Enter Again");
			  tol=scan.next();}		
		}
		
		
		scan.close();
	}
	}


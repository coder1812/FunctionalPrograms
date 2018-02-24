package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;
public class LeapYear {
	
 
	public static void main(String[] args) {
		int year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the year");
		year=scanner.nextInt();
		Utility utility=new Utility();
		if(year>=1000 && year<10000)
	    utility.leapYear(year);
		else
		System.out.println("Year should be of 4 digits");
        scanner.close();
	}

}

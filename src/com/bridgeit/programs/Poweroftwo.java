package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Poweroftwo {

	public static void main(String args[]){
	
		int range;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range");
		range = Integer.parseInt(args[0]);
		Utility utility=new Utility();
		utility.power(range);
		scanner.close();
		
	}
}

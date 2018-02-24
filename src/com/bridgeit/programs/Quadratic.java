package com.bridgeit.programs;


import java.util.Scanner;
import com.bridgeit.utility.Utility;


public class Quadratic {
     
public static void main(String args[]) {
		
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter a:");
		a=scanner.nextInt();
		System.out.print("Enter b:");
		b=scanner.nextInt();
		System.out.print("Enter c:");
		c=scanner.nextInt();
		Utility utility=new Utility();
	    utility.quadratic(a,b,c);
	    scanner.close();
}
	
	
}

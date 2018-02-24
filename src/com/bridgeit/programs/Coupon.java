package com.bridgeit.programs;


import java.util.Scanner;
import com.bridgeit.utility.Utility;


public class Coupon {

public static void main(String args[]) {
		
		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("How many random numbers do you need to generate distinct coupon number?");
		number=scanner.nextInt();
		Utility utility=new Utility();
	    utility.coupon(number);
	    scanner.close();

}


	
}

package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;
 
public class FlipCoin {

	public static void main(String args[]) {
		int range;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the range");
		range=scanner.nextInt();
		Utility utility=new Utility();
	    utility.flipcoin(range);
	    scanner.close();
	}
}

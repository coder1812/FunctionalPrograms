package com.bridgeit.programs;


import java.util.Scanner;
import com.bridgeit.utility.Utility;
 
public class Gambler {
	public static void main(String args[]) {
		
		
		int stake,goal,trials;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the $Stake");
		stake=scanner.nextInt();
		System.out.println("Enter the goal");
		goal=scanner.nextInt();
		System.out.println("Enter the trials");
		trials=scanner.nextInt();
		Utility utility=new Utility();
	    utility.gambler(stake,goal,trials);
	    scanner.close();
		}
}

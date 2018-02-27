package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class TwoDArrays {
  public static void main(String args[]) {
	  int choice;
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("Enter the choice");
	  System.out.println("1-Integer\n2-Double\n3-Boolean");
	  choice=scanner.nextInt();
	  Utility.twoDArrays(choice);
	  scanner.close();
  }
}

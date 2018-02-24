package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class ReplaceString {
public static void main(String args[]) {
	String string;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter string");
	string=scanner.nextLine();
	Utility utility=new Utility();
	if(string.length()<3)
	System.out.print("Enter string of length 3 or more");
	else
	System.out.println("" +utility.replaceString(string));
}
}
package com.bridgeit.programs;

import java.util.Scanner;
import com.bridgeit.utility.Utility;

public class Distance {

public static void main(String args[]) {
		
		int xcoordinate,ycoordinate;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the x and y coordinate");
		xcoordinate=scanner.nextInt();
		ycoordinate=scanner.nextInt();
		Utility utility=new Utility();
	    utility.eucledianDistance(xcoordinate,ycoordinate);
	    scanner.close();
}
}

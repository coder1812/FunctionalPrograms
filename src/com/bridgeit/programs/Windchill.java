package com.bridgeit.programs;


import java.util.Scanner;
import com.bridgeit.utility.Utility;


public class Windchill {

public static void main(String args[]) {
		
		double temperature,velocity;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the temperature and velocity");
		temperature = Double.parseDouble(args[0]);
		velocity = Double.parseDouble(args[0]);
		Utility utility=new Utility();
	    utility.windChill(temperature,velocity);
	    scanner.close();
}	
	
	



}
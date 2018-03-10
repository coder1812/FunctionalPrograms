

/******************************************************************************
 *  Purpose: Find the roots of the equation a*x*x + b*x + c..
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;
import com.bridgeit.utility.Utility;


public class Quadratic {
     
public static void main(String args[]) {
		
		int a,b,c;
		Utility utility=new Utility();
		System.out.println("Given quadratic equation:ax^2 + bx + c");
        System.out.print("Enter a:");
		a=utility.inputInteger();
		System.out.print("Enter b:");
		b=utility.inputInteger();
		System.out.print("Enter c:");
		c=utility.inputInteger();
	
	    utility.quadratic(a,b,c);
	    
}
	
	
}

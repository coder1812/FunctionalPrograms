

/******************************************************************************
 *  Purpose: Prints a table of the powers of 2 till range entered by user .
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Poweroftwo {

	public static void main(String args[]){
	
		int range;
		System.out.println("Enter the range");
		range = Integer.parseInt(args[0]);
		Utility utility=new Utility();
		utility.power(range);
		
	}
}


/******************************************************************************
 *  Purpose: Determines total random number generated to have all distinct numbers.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/


package com.bridgeit.programs;
import com.bridgeit.utility.Utility;


public class Coupon {

public static void main(String args[]) {
		
		int number;
		System.out.println("How many random numbers do you need to generate distinct coupon number?");
		Utility utility=new Utility();
		number=utility.inputInteger();
		utility.coupon(number);
	    

}


	
}

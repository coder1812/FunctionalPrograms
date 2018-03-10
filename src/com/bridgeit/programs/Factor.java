
/******************************************************************************
 *  Purpose: Computes the prime factorization of entered number using brute force.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Factor {
	public static void main(String args[]) {

		int range;

		Utility utility = new Utility();

		System.out.println("Enter the range");
		range = utility.inputInteger();
		utility.factor(range);

	}
}
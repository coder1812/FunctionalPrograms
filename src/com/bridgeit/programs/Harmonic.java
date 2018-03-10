
/******************************************************************************
 *  Purpose: Prints Harmonic Series.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Harmonic {
	public static void main(String args[]) {

		int range;
		Utility utility = new Utility();
		System.out.println("Enter the range");
		range = utility.inputInteger();
		utility.harmonicSeries(range);
	}
}

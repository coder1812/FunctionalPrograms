
/******************************************************************************
 *  Purpose: Determines triplets and nontriplets in user entered array.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Triplets {
	public static void main(String args[]) {

		int length, i;
		Utility utility = new Utility();
		System.out.println("Enter the length of an array");
		length = utility.inputInteger();
		System.out.println("Enter the elements in array");
		int array[] = new int[length];
		for (i = 0; i < length; i++)
			array[i] = utility.inputInteger();

		utility.tripletsinarrays(array, length);

	}
}
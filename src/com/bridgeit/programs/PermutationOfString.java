
/******************************************************************************
 *  Purpose: Prints permutation of entered string.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;


public class PermutationOfString {

	public static void main(String args[]) {
		String string;
		int length;
		Utility utility = new Utility();
		System.out.println("Enter the string");
		string = utility.inputString();
		length = string.length();
		utility.permutation(string, 0, length - 1);

	}
}

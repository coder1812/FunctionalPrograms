
/******************************************************************************
 *  Purpose:  Prints 2 Dimensional Array.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class TwoDArrays {
	public static void main(String args[]) {
		int rows;
		Utility utility = new Utility();
		int columns;
		System.out.print("Enter the rows\n");
		rows = utility.inputInteger();
		System.out.println("Enter the columns\n");
		columns = utility.inputInteger();

		utility.twodarray(rows, columns);
	}

}

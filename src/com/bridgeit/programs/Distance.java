
/******************************************************************************
 *  Purpose: Prints the Euclidean distance from the point (x, y) to the origin (0, 0) .
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Distance {

	public static void main(String args[]) {

		int xcoordinate, ycoordinate;
		Utility utility = new Utility();
		System.out.println("Enter the x and y coordinate");
		xcoordinate = utility.inputInteger();
		ycoordinate = utility.inputInteger();
		utility.eucledianDistance(xcoordinate, ycoordinate);

	}
}

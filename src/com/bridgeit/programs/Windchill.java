
/******************************************************************************
 *  Purpose:  Prints the temperature .
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Windchill {

	public static void main(String args[]) {

		double temperature, velocity;
		Utility utility = new Utility();
		System.out.println("Enter the temperature and velocity");
		temperature = Double.parseDouble(args[0]);
		velocity = Double.parseDouble(args[0]);
		utility.windChill(temperature, velocity);

	}

}
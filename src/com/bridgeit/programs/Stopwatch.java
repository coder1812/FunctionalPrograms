
/******************************************************************************
 *  Purpose: Program for measuring the time that elapses between the start and end clicks.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;

import com.bridgeit.utility.*;

public class Stopwatch {

	public static void main(String[] args) {
		int mcount = 0;
		Utility utility = new Utility();
		System.out.println("start time : " + utility.startMeth());
		for (int i = 0; i <= 1000000; i++) {
			mcount++;
			System.out.println(mcount);
		}
		System.out.println("end time : " + utility.endMeth());
		System.out.println("elapes time : " + utility.getelapes());

	}

}

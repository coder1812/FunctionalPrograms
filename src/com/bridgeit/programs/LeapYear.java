
/******************************************************************************
 *  Purpose: Determines entered year is Leapyear or not.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/


package com.bridgeit.programs;
import com.bridgeit.utility.Utility;
public class LeapYear {
	
 
	public static void main(String[] args) {
		int year;
		Utility utility=new Utility();
		System.out.println("Enter the year");
		year=utility.inputInteger();
		if(year>=1000 && year<10000)
	    utility.leapYear(year);
		else
		System.out.println("Year should be of 4 digits");
        	}

}

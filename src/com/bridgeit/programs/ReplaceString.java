
/******************************************************************************
 *  Purpose: Take User Name as Input and  Print the String with User Name .
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class ReplaceString {
	public static void main(String args[]) {
		String string;
		Utility utility=new Utility();
		System.out.println("enter string");
		string=utility.inputString();
		
		if(string.length()<3)
			System.out.print("Enter string of length 3 or more");
		else
		System.out.println("" +utility.replaceString(string));
}
}
/******************************************************************************
 *  Purpose: Gambler game.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
package com.bridgeit.programs; 
import com.bridgeit.utility.Utility;

public class Gambler {
	public static void main(String args[]) {
		
		
		int stake,goal,trials;
		Utility utility=new Utility();
		System.out.println("Enter the $Stake");
		stake=utility.inputInteger();
		System.out.println("Enter the goal");
		goal=utility.inputInteger();
		System.out.println("Enter the trials");
		trials=utility.inputInteger();
		utility.gambler(stake,goal,trials);
	    
		}
}

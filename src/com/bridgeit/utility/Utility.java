/******************************************************************************
 *  Purpose: Class containing logical functions.
 *
 *  @author  Rohini
 *  @version 1.0
 *  @since   06-03-2018
 *
 ******************************************************************************/

package com.bridgeit.utility;


import java.util.LinkedHashSet;
import com.bridgeit.programs.Stopwatch;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import java.util.*;
import java.io.PrintWriter;  


public class Utility {
	

	Scanner scanner;
	public Utility() {
		scanner =new Scanner(System.in); 
	}
	
	/**
	 * Function to scan user entered String
	 * @return scanned value
	 */
	public String inputString()
	{
		try {
			return scanner.next();
		}catch(Exception e) {
			System.out.println(e);
		}
		return "";
	}
	/**
	 * Function to scan user entered double value
	 * @return scanned value
	 */
	public double inputDouble()
	{
		try {
			return scanner.nextDouble();
		}catch(Exception e) {
			System.out.println(e);
		}
		return 1;
	}
	/**
	 * Function to scan user entered integer value
	 * @return scanned value
	 */
	public int inputInteger()
	{
		try {
			return scanner.nextInt();
		}catch(Exception e) {
			System.out.println(e);
		}
	return 1;
	}
	/**
	 * Function to scan user entered boolean value
	 * @return scanned value
	 */
	public boolean inputBoolean()
	{
		try {
			return scanner.nextBoolean();
		}catch(Exception e) {
			System.out.println(e);
		}
	return true;
	}
	/**
	 * Function that Prints the answer for entered year is Leap year or not.
	 * @param year is leapyear or not
	 */
	public void leapYear(int year) {
		
		
		boolean leap=false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
           else
                leap = true;
        }
        else
            leap = false;

        
	if(leap==true)
	 System.out.println("Leap Year");
	else
	 System.out.println("Not a Leap Year");
	}
	
	/**
	 *  Replace user entered string to string "Hello username How are you?" 
	 * @param string accepted from user to be replaced
	 * @return replaced string
	 */
	public String replaceString(String string)
	{
		String string1="Hello username How are you?" ;
		System.out.println(string1);
		System.out.println("Replaced string - ");
		string1=string1.replace("username", string);
		return string1;
	}

	/**
	 * Prints the sum of harmonic series
	 * @param range till the sum is to be printed
	 */
	public void harmonicSeries(int range) {
	
	int i;
	float msum=0;
	for(i=1;i<=range;i++)
	{
		msum=msum+(float)1/i;
	}
	System.out.println("Series sum is " +msum);

}
	
	/**
	 *  Function that Prints the  Power of 2
	 * @param rangectill the power is to b found
	 */
	public void power(int range) {
		
		int i,mresult=0;
		if(range>0 && range<31)
		{	for(i=1;i<=range;i++)
		   {
			mresult=(int) Math.pow(2,i);
		   System.out.println("2 ^ "+i+" = " +mresult);
	    	}
		}
		else
		{
		System.out.println("Please enter between 0 to 31"); 
		}

	}
		
	/**
	 * Function that Prints the percentage of head and tail after coin is flipped
	 * @param range number of times the coin is flipped
	 */
	public void flipcoin(int range) {
		
		  int i,mhead=0,mtail=0;
		 for (i=0;i<range;i++)
		 { 
			 if(Math.random()<0.5)
             		 
				 mhead++;
			 else
				 mtail++;
		 }
		
		 double count=(double)mhead*100/range;
	     double count1=(double)mtail*100/range;

		 System.out.println("head is" +count +"%");
		 System.out.println("tail is" +count1 +"%");
	} 
	  /**
	   * Function that Prints the Prime Factors of entered number
	   * @param range entered number
	   */
	public void factor(int range) {
		  int i;
		  for (i = 2; i <= range; i++) {
			  
	            while (range % i == 0) {
	                System.out.print(i + "\n");
	                range = range / i;
	            }
	        }
	 
	        if (range < 1)
	        	System.out.println(range);
	    }
		  
	  /**
	   * Prints percentage of wins and loss in Gambler Game
	   * @param strake initial amount user have
	   * @param goal to be achieved
	   * @param trials to be played
	 */
	public void gambler(int strake,int goal,int trials) {
		
		  int mbets=0,mwins=0,j,mloss=0;
		  for(j=0; j < trials; j++) 
		  {
	           int cash = strake;
	            while (cash > 0 && cash < goal)
	            {
	                mbets++;
	                if (Math.random() < 0.5)
	                	cash++;     
	                else                  
	                	cash--; 
	              }
	            if (cash == goal)
	            {
	            	mwins++;   
	            }
	            mloss=trials-mwins;
	           }
		 
		  System.out.println("Number of wins "+mwins);
		  System.out.println("Number of loss "+mloss);
	     
	      
	      int won=((mwins*100)/trials);
	      int los=((mloss*100)/trials);
	      
	      System.out.println("Won percentage-"+won + "%" +" Loss percentage-" +los+ "%");
	  }
	  
	  /**
	   *Prints Eucledian distance
	   * @param xcoordinate
	   * @param ycoordinate
	   */
	public void eucledianDistance(int xcoordinate,int ycoordinate) {
		  double distance;
		  
		  distance=Math.sqrt((Math.pow(xcoordinate, 2)+Math.pow(ycoordinate, 2)));
		  
		  System.out.println("Distance is" +distance);
	  }
	  
	  
	  /**
	   * Prints the Temperature
	   * @param temperature accepted from user
	   * @param velocity accepted from user
	 */
	public void windChill(double temperature,double velocity) {
	  
		  
	  double result;
	  
	  if(temperature>50)
	  {  System.out.println("Invalid entry");}
	  else  if(velocity<3 && velocity>150)
	  { System.out.println("Invalid entry");}	
	  else
	  { 
       result=((35.74+(0.6215*temperature)+(0.427*temperature-35.75)) * Math.pow(velocity,0.16));
	   System.out.println("Temperature is" +result);
	  } 
        
	 }
	  
	  /**
	   *Functions that Generates the number of distinct coupons and prints the count for random values generated by system 
	   * @param number of coupons to be generated
	 */
	
	public void coupon(int number)
	  { 
		int mcount=0;
		int array[]=new int[number];
	    for(int i=0;i<number;i++) {
	    	array[i]=(int)((Math.random()*number)+1);
	    	mcount++;
	    	for(int j=0;j<i;j++) {
	    		if(array[i]==array[j]) {
	    			i--;
	    			break;
	    		}
	    	}
	    }
	    for(int i=0;i<number;i++)
	    System.out.println(array[i]);
	   
	    System.out.println("Count is" +mcount);
	  }
	
		/**
		 * Prints the roots of Quadratic equation
		 * @param a			 
		 * @param b
		 * @param c
		 */
		public void quadratic(int a,int b,int c)
		{
		    double delta,root1,root2;
		    delta = ((b*b) - (4*a*c));
		    if(delta>0)
		    {    
		    	 System.out.println("Roots are real and are unequal");
		    	 root1 = (-b + Math.sqrt(delta))/(2*a);
				 root2 = (-b - Math.sqrt(delta))/(2*a);
		    	 System.out.println("Root1" +root1);
		    	 System.out.println(" Root2" +root2);
		    }
		    else if(delta==0)
		    {
		    	 root1 = (-b + Math.sqrt(delta))/(2*a);
		    	 System.out.println("Roots are distinct and are equal" +root1);
		    }
		    else {
		    	 
		    	System.out.println(" Roots are imaginary");
		    }
 
		}
		
		/**
		 *  Prints the formation of Triplets and NonTriplets in array.
		 * @param array acceprted from user 
		 * @param length of array
		 */
		public void tripletsinarrays(int array[],int length) {
		
			int i,j,k,mtriplets=0,result,mnontriplets=0;			
			for(i=0;i<length-2;i++)
			for(j=i+1;j<length-1;j++)
			for(k=j+1;k<length;k++)
			{
				result=array[i]+array[j]+array[k];
				if(result==0)
				{
				System.out.println("Triplets are  " +array[i]+" " + array[j] + " " +array[k]);
				mtriplets++;
				}
				else {
					System.out.println("Triplets are " +array[i] + array[j] +array[k]);
				mnontriplets++;}
			}
			System.out.println("Number of triplets is " +mtriplets);
			System.out.println("Number of non triplets is " +mnontriplets);
	
		}
		
		/**
		 * Function to print the elements of TwoDArray
		 * @param choice taken from user
		 */
		public void twodarray(int m,int n)
		{
			Scanner scanner=new Scanner(System.in);
			PrintWriter printwriter=new PrintWriter(System.out);
			
			
			Integer arrayInt[][] = new Integer[m][n];
			Double arraydouble[][] = new Double[m][n];
			Boolean arrayboolen[][] = new Boolean[m][n];

			printwriter.write("Enter your choice :");
			printwriter.write("1.Integer array\n");

			printwriter.write("2.Double array\n");

			printwriter.write("3.Boolean array\n");
			printwriter.flush();
			int choice = scanner.nextInt();
		
			switch (choice) {
			case 1:
				printwriter.write("Integer array is\n");
				printwriter.flush();

				printwriter.write("Enter the elements\n");
				printwriter.flush();

				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						arrayInt[i][j] = scanner.nextInt();

					}
				}
				printArray(arrayInt, m, n);
				break;
			case 2:
				printwriter.write("Double array is\n");
				printwriter.flush();

				printwriter.write("Enter the elements\n");
				printwriter.flush();

				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						arraydouble[i][j] = scanner.nextDouble();

					}
				}
				printArray(arraydouble, m, n);
				break;
			case 3:
				printwriter.write("boolean array is\n");
				printwriter.flush();

				printwriter.write("Enter the elements\n");
				printwriter.flush();

				for (int i = 0; i < m; i++) {
					for (int j = 0; j < n; j++) {
						arrayboolen[i][j] = scanner.nextBoolean();

					}
				}
				printArray(arrayboolen, m, n);
				break;

			default:
				printwriter.println("Invalid choice");
				printwriter.flush();
				printwriter.close();
			}
		}

		/**
		 * Static function to print array
		 * @param array to be printed
		 * @param rows in array
		 * @param columns in array
		 */
		public static <T> void printArray(T[][] array, int rows, int columns) {

			PrintWriter printwriter = new PrintWriter(System.out);
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					printwriter.print(array[i][j] + " ");
					printwriter.flush();
				}
	}
		}
	


		
		/**
		 * Function to print the Permutation of String
		 * @param string accepted from user whose permutation is to be found
		 * @param start initial element of string
		 * @param end last element of string
		 */
		public  void permutation(String string,int start,int end) {
			if(start==end)
			{
				System.out.println(string);
			}
			else
			{
				 for(int k=start;k<=end;k++)
	                {
	                    string=stringSwap(string,start,k);
	                    permutation(string,start+1,end);
	                    string=stringSwap(string,start,k);
	                }
	         }
	            
		}

        /**
         * Function that Return the swapped String
         * @param string to be swapped
         * @param first echaracter of string
         * @param end character of string
         * @return Swaped String
         */
        public static String stringSwap(String string,int first,int end)
        	
        
        {
            char chararray[]=string.toCharArray();
            char temp;
            temp=chararray[first];
            chararray[first]=chararray[end];
            chararray[end]=temp;
            
            return String.valueOf(chararray);
		}
 
       
        /**
         * Returns the swapped String
         */
            
            long mstart=0;
            long mend=0;
            boolean running=false;
            
            public long startMeth()
            {
                this.mstart=System.currentTimeMillis();
                this.running=true;
                return mstart;
            }
            
            public long endMeth()
            {
                this.mend=System.currentTimeMillis();
                this.running=false;
                return mend;
            }
            
            public long getelapes()
            {
                long elapes=0;
                if(running==true)
                {
                elapes=(System.currentTimeMillis()-mstart);
                }
                else
                {
                elapes=(mend-mstart);
                }
                return elapes;
                
            
            
           

        }
            
       

}
		
		

























	
	

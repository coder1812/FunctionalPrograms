package com.bridgeit.utility;


import java.util.LinkedHashSet;
import com.bridgeit.programs.Stopwatch;
import java.util.*;
import java.io.PrintWriter;  


public class Utility {
	
	/**
	 * @param year
	 * Leap year
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
	 * @param string
	 * @return
	 * Replace string
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
	 * @param range
	 * Sum of harmonic series
	 */
	public void harmonicSeries(int range) {
	
	int i;
	float sum=0;
	for(i=1;i<=range;i++)
	{
		sum=sum+(float)1/i;
	}
	System.out.println("Series sum is " +sum);

}
	
	/**
	 * @param range
	 *  Power of 2
	 */
	public void power(int range) {
		
		int i,result=0;
		if(range>0 && range<31)
		{	for(i=1;i<=range;i++)
		   {
			result=(int) Math.pow(2,i);
		   System.out.println("2 ^ "+i+" = " +result);
	    	}
		}
		else
		{
		System.out.println("Please enter between 0 to 31"); 
		}

	}
		
	/**
	 * @param range
	 * Flipcoin
	 */
	public void flipcoin(int range) {
		
		  int i,head=0,tail=0;
		 for (i=0;i<range;i++)
		 { 
			 if(Math.random()<0.5)
             		 
				 head++;
			 else
				 tail++;
		 }
		
		 double count=(double)head*100/range;
	     double count1=(double)tail*100/range;

		 System.out.println("head is" +count +"%");
		 System.out.println("tail is" +count1 +"%");
	} 
	  /**
	 * @param range
	 * Factors
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
	 * @param strake
	 * @param goal
	 * @param trials
	 * Gambler game
	 */
	public void gambler(int strake,int goal,int trials) {
		
		  int bets=0,wins=0,j,loss=0;
		  for(j=0; j < trials; j++) 
		  {
	           int cash = strake;
	            while (cash > 0 && cash < goal)
	            {
	                bets++;
	                if (Math.random() < 0.5)
	                	cash++;     
	                else                  
	                	cash--; 
	              }
	            if (cash == goal)
	            {
	            	wins++;   
	            }
	            loss=trials-wins;
	           }
		 
		  System.out.println("Number of wins "+wins);
		  System.out.println("Number of loss "+loss);
	     
	      
	      int won=((wins*100)/trials);
	      int los=((loss*100)/trials);
	      
	      System.out.println("Won percentage-"+won + "%" +" Loss percentage-" +los+ "%");
	  }
	  
	  /**
	 * @param xcoordinate
	 * @param ycoordinate
	 * Calculating distance
	 */
	public void eucledianDistance(int xcoordinate,int ycoordinate) {
		  double distance;
		  
		  distance=Math.sqrt((Math.pow(xcoordinate, 2)+Math.pow(ycoordinate, 2)));
		  
		  System.out.println("Distance is" +distance);
	  }
	  
	  
	  /**
	 * @param temperature
	 * @param velocity
	 * Temperature
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
	 * @param number
	 * Number of coupons
	 */
	public void coupon(int number) 
	  {   
		int count=0,i,value;
		LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		Random random=new Random();
		for(i=0;i<number;i++)
		{
			value=random.nextInt(number);
			count++;
			lh.add(new Integer(value));
			
		}
		
		
		System.out.println(count);
	  }
		/**
		 * @param a			 
		 * @param b
		 * @param c
		 * Quadratic equation
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
		 * @param array
		 * @param length
		 * Triplets.
		 */
		public void tripletsinarrays(int array[],int length) {
		
			int i,j,k,triplets=0,result,nontriplets=0;			
			for(i=0;i<length-2;i++)
			for(j=i+1;j<length-1;j++)
			for(k=j+1;k<length;k++)
			{
				result=array[i]+array[j]+array[k];
				if(result==0)
				{
				System.out.println("Triplets are  " +array[i]+" " + array[j] + " " +array[k]);
				triplets++;
				}
				else {
					System.out.println("Triplets are " +array[i] + array[j] +array[k]);
				nontriplets++;}
			}
			System.out.println("Number of triplets is " +triplets);
			System.out.println("Number of non triplets is " +nontriplets);
	
		}
		
		/**
		 * @param choice
		 * TwoDArray
		 */
		public static void twoDArrays(int choice) {
			Scanner scanner=new Scanner(System.in);
			switch(choice) {
			case 1 :int rows,columns,i,j;
				    System.out.println("Enter the number of rows and columns");
					rows=scanner.nextInt();
					columns=scanner.nextInt();
					int [][] integerarray=new int[rows][columns];  
					System.out.println("Enter the elements in array");
					for(i=0;i<rows;i++)
					{
						for(j=0;j<columns;j++)
						{
							integerarray[i][j]=scanner.nextInt();
						}
					}
					for(i=0;i<rows;i++)
					{
						for(j=0;j<columns;j++) 
						{
					 
					  PrintWriter writer = new PrintWriter(System.out);    
				      writer.write(String.valueOf(integerarray[i][j])+"\n");        
				      writer.flush(); 
						}
				     }
					 break;
			case 2 : double row,column,x,y;
					 System.out.println("Enter the number of rows and columns");
					 row=scanner.nextDouble();
					 column=scanner.nextDouble();
					 double [][] doublearray=new double[(int)row][(int)column];  
					 System.out.println("Enter the elements in array");
					 for(x=0;x<row;x++)
					 {
						 for(y=0;y<column;y++)
						 {
							 doublearray[(int)x][(int)y]=scanner.nextDouble();
						 }
					 }
					 for(x=0;x<row;x++)
					 {
						 for(y=0;y<column;y++) 
						 {
			 
							 PrintWriter writer = new PrintWriter(System.out);    
							 writer.write(String.valueOf(doublearray[(int)x][(int)y])+"\n");        
							 writer.flush(); 
						 }
					 }
					 break;
			case 3 : double roww,columnn,a,b;
					 System.out.println("Enter the number of rows and columns");
					 roww=scanner.nextDouble();
					 columnn=scanner.nextDouble();
					 boolean [][] booleanarray=new boolean[(int)roww][(int)columnn];  
					 System.out.println("Enter the elements in array");
					 for(a=0;a<roww;a++)
					 {
						 for(b=0;b<columnn;b++)
						 {
							 booleanarray[(int)a][(int)b]=scanner.nextBoolean();
						 }
					 }
					 for(a=0;a<roww;a++)
					 {
						 for(b=0;b<columnn;b++) 
						 {
	 
							 PrintWriter writer = new PrintWriter(System.out);    
							 writer.write(String.valueOf(booleanarray[(int)a][(int)b])+"\n");        
							 writer.flush(); 
						 }
					 }
					 break;
			default :System.out.println("Invalid choice");		 
					 break;
			}
			scanner.close();
		}
		/**
		 * @param string
		 * @param start
		 * @param end
		 * Permutation of String
		 */
		public static void permutation(String string,int start,int end) {
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
         * @param string
         * @param first
         * @param end
         * @return Swaped String
         * String Swap
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
 
       
      
            
            long start=0;
            long end=0;
            boolean running=false;
            
            public long startMeth()
            {
                this.start=System.currentTimeMillis();
                this.running=true;
                return start;
            }
            
            public long endMeth()
            {
                this.end=System.currentTimeMillis();
                this.running=false;
                return end;
            }
            
            public long getelapes()
            {
                long elapes=0;
                if(running==true)
                {
                elapes=(System.currentTimeMillis()-start);
                }
                else
                {
                elapes=(end-start);
                }
                return elapes;
                
            
            
           

        }
            
            
       }

       

		
		
		

























	
	

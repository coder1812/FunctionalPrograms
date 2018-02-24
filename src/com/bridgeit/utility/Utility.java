package com.bridgeit.utility;


import java.util.LinkedHashSet;

import com.bridgeit.programs.Stopwatch;

import java.util.*; 


public class Utility {
	
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


	if(leap)
	 System.out.println("Leap Year");
	else
	 System.out.println("Not a Leap Year");
	}
	
	public String replaceString(String string)
	{
		String string1="Hello username How are you?" ;
		string1=string1.replace("username", string);
		return string1;
	}

	public void harmonicSeries(int range) {
	
	int i;
	float sum=0;
	for(i=1;i<=range;i++)
	{
		sum=sum+(float)1/i;
	}
	System.out.println("Series sum is " +sum);

}
	
	public void power(int range) {
		
		int i,result=0,k;
		if(range>0 && range<31)
		   result=(int) Math.pow(2,range);
		 else
			 System.out.println("Please enter between 0 to 31"); 
		
		for(i=1;i<result;i++)
		{
			k=(int) Math.pow(i,2);
			System.out.println(i+" ^ 2 "  +k);
		}
	}
		
	public void flipcoin(int range) {
		
		  int i,head=0,tail=0;
		 for (i=0;i<=range;i++)
		 { 
			 if(Math.random()<0.5)
             		 
				 head++;
			 else
				 tail++;
		 }
		
		 int count=((head*100)/range);
	     int count1=((tail*100)/range);

		 System.out.println("head is" +count +"%");
		 System.out.println("tail is" +count1 +"%");
	} 
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
		 
		  System.out.println(wins);
	      System.out.println(loss);
	      System.out.println(bets);
	      
	      int won=((wins*100)/trials);
	      int los=((loss*100)/trials);
	      
	      System.out.println(won + "%" +los+ "%");
	  }
	  
	  public void eucledianDistance(int xcoordinate,int ycoordinate) {
		  double distance;
		  
		  distance=Math.sqrt((Math.pow(xcoordinate, 2)+Math.pow(ycoordinate, 2)));
		  
		  System.out.println("Distance is" +distance);
	  }
	  
	  
	  public void windChill(double temperature,double velocity) {
	  
		  
	  double result;
	  
	  if(temperature>50)
	  {  System.out.println("Invalid entry");}
	  else  if(velocity<3 && velocity>150)
	  { System.out.println("Invalid entry");}	
	  else
	  { 
       result=((35.74+(0.6215*temperature)+(0.427*temperature-3575)) * Math.pow(velocity,0.16));
	   System.out.println("Temperature is" +result);
	  } 
        
	 }
	  
	  public void coupon(int number) 
	  {   
		
		int set,i;
		String string;
		LinkedHashSet link=new LinkedHashSet(); 
        Random random=new Random();
        for(i=1;i<number;i++)
        {	
        set=random.nextInt(10000);
        link.add(new Integer(set));
        }
        System.out.println(link +"coupons");
	  }
	 
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
		
		public void tripletsinarrays(int array[],int length) {
		
			int i,j,k,triplets=0,result,nontriplets=0;			
			for(i=0;i<length;i++)
			for(j=i+1;j<length-2;j++)
			for(k=j+1;k<length-1;k++)
			{
				result=array[i]+array[j]+array[k];
				if(result==0)
				{
				System.out.println("Triplets are " +array[i] + array[j] +array[k]);
				triplets++;
				}
				else
				nontriplets++;
			}
			System.out.println("Number of triplets is " +triplets);
			System.out.println("Number of non triplets is " +nontriplets);
	
		}

}
		

		
		
		

























	
	

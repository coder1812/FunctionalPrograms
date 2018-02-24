package com.bridgeit.programs;


import java.util.Scanner;
import com.bridgeit.utility.Utility;

		
	public class Stopwatch {
	       
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
	    



  

		
	    public static void main(String[] args) {
	 
	    	 Stopwatch s=new Stopwatch();
		        System.out.println("start time : "+s.startMeth());
		        System.out.println("end time : "+s.endMeth());
		        System.out.println("elapes time : "+s.getelapes());
	}

	}

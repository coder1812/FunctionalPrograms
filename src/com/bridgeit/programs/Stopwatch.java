package com.bridgeit.programs;

import java.util.*;
import com.bridgeit.utility.*;
  public class Stopwatch {

    public static void main(String[] args) 
    {
        int count=0;
       Utility utility=new Utility();
        System.out.println("start time : "+utility.startMeth());
        for(int i=0;i<=1000000;i++) {
        	count++;
        	System.out.println(count);
        }
        System.out.println("end time : "+utility.endMeth());
        System.out.println("elapes time : "+utility.getelapes());
        
        
        
        
    }

}

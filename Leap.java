package com.guvi;

import java.util.Scanner;

public class Leap {
	public static void main(String[] args) {

    	int year;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter any Year:");
    	year = sc.nextInt();
    	sc.close();
    	boolean isLeap = false;

        if(year % 4 == 0)
        {
        	 isLeap = true;
        }
        if ( year % 400 == 0)
            isLeap = true;
     
        else 
            {
                isLeap = false;
            }
                
        

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}

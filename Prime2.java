package com.guvi;

import java.util.Scanner;

public class Prime2 {
	    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a>1)
	       while (a < b) {
	            boolean flag = false;

	            for(int i = 2; i <= a/2; i++) {
	                if(a % i == 0) {
	                    flag = true;
	                    break;
	                }
	            }

	            if (!flag)
	                System.out.print(a + " ");

	            ++a;
	       }}
}
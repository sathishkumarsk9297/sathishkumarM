package com.guvi;

import java.util.Scanner;

public class Largest {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int s=sc.nextInt();
	int a[]=new int[s];
	for (int i=0;i<a.length;i++) {
		a[i]=sc.nextInt();
	}
	int m=0;
		for (int i=0;i<a.length;i++) {	
			if(m<a[i]) {
				m=a[i];
			}
		
		}
		System.out.println("Largest Number : "+m);
	}
}


package com.guvi;

import java.util.Scanner;

public class Pnz {

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
int a=sc.nextInt();
	if(a==0)
		System.out.println("Zero");
	else if(a<0)
		System.out.println("Negative");
	else 
		System.out.println("Postive");
}
}

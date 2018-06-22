package com.guvi;

import java.util.Scanner;

public class Eo {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int a=sc.nextInt();
	if(a%2==0)
		System.out.println("Even");
	else
		System.out.println("Odd");
}
}

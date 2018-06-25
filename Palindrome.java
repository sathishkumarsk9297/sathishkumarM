package com.guvipro;

import java.util.Scanner;

public class Palindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=a;
	int r,sum=0;
	for(int i=0;a>0;i++) {
		r=a%10;
        a=a/10;
        sum=(sum*10)+r;
       
	}
	if(b==sum)
	System.out.println("Palindrome");
	else {
		System.out.println("Not a Palindrome");
	}
}
}

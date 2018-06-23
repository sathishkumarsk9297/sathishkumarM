package com.guvi;

import java.util.Scanner;

public class Kintergers {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Input :");
		int n=in.nextInt();
		int s=in.nextInt();
		int sum=0;
		int a[]=new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<s;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Output :");
		System.out.println(sum);		
	}
}

package com.guvipro;

import java.util.Scanner;

public class FindOdd {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int start=sc.nextInt();
	int s=sc.nextInt();
	
	for(int i=start+1;i<s;i++) {
		if(i%2!=0) {
			System.out.println(i);
		}
	}
	
}
}

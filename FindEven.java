package com.guvi;

import java.util.Scanner;

public class FindEven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int Start=sc.nextInt();
	int s=sc.nextInt();
	for(int i=Start;i<s;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
}
}

package com.guvi;

import java.util.Scanner;

public class Vc {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Word");
	char s=sc.next().charAt(0);
	if ((s=='A' || s=='E'||s=='I'||s=='O'||s=='U'||s=='a'||s=='e'||s=='i'||s=='o'||s=='u'))
		System.out.println("Vowels");
	
	else if((s>='a'&&s<='z')||(s>='A'&&s<='Z'))
		System.out.println("Constant");
	else
		System.out.println("Invaild");
	}
}


package com.guvi;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Word");
		char s=sc.next().charAt(0);
		 if((s>='a'&&s<='z')||(s>='A'&&s<='Z'))
				System.out.println("Alphabet");
			else
				System.out.println("Not Alphabet");
			}
		}


package guvi;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=1;
		int number= sc.nextInt();
		for(int i=1;i<=number;i++) {
			count=count * i;

		}
		System.out.println(fact);
		
	}
}

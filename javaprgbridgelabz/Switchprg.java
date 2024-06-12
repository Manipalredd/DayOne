package javaprgbridgelabz;

import java.util.Scanner;

public class Switchprg {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int n=scan.nextInt();
	switch(n) {
	case 0 :
		System.out.println("the number is"+n);
		break;
	case 1:
		System.out.println("the number is"+n);
		break;
		default:
			System.out.println("the user number should be 2 not 0 or 1");
		
	}

	}

}

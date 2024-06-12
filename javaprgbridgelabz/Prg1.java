package javaprgbridgelabz;

import java.util.Scanner;

public class Prg1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=scan.nextInt();
		if(n%3==0 && n%5==0)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
				
	}

}

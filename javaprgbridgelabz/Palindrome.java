package javaprgbridgelabz;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
	int sum=0;
	int r;
	int temp;
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number: ");
		int n=scan.nextInt();
		temp=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
			
			if (temp==sum)
			{
				System.out.println("it is palindrome");
				
			}
			else
			{
				System.out.println("it is not a palindrome");
			}

	}

}

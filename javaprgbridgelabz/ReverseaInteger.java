package javaprgbridgelabz;

import java.util.Scanner;

public class ReverseaInteger {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int reverse=0;
	while(num!=0)
	{
		int remainder=num%10;
		reverse=reverse*10+remainder;
		num=num/10;
	}
			System.out.println("the reversing of the numbers are"+ reverse);
	}

}

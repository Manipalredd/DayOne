package javaprgbridgelabz;

import java.util.Scanner;

public class Dowhile {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int i=scan.nextInt();
	System.out.println("prints the even numbers untill 10 ");
	do {
		System.out.println(i);
		i=i+2;
		
	}
	while(i<=10);
	}

}

package javaprgbridgelabz;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		for(i=1;i<=n;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
		}
		
	}

}

package javaprgbridgelabz;

public class Findevenandodd {

	public static void main(String[] args) {
		int []ar= {10,11,13,15,16,18};
		System.out.println("the even numbers present in the arrays are: ");
		for(int i=0;i<ar.length;i++)
		{
			if (ar[i]%2==0)
			{
				System.out.println(ar[i]);
			}
		}
			System.out.println("the odd numbers present in the arrays are: ");
			for(int i=0;i<ar.length;i++)
			{
			if (ar[i]%2!=0)
			{
			  System.out.println(ar[i]);
			}
					
		}
		
	}
	

}

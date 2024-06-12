package javaprgbridgelabz;

public class Countevennumbersinarray {

	public static void main(String[] args) {
	 int[]ar= {10,11,13,14,16,18};
	 int count=0;
	 for (int i=0;i<ar.length;i++)
	 {
		 if (ar[i]%2==0)
		 {
			 count++;
		 }
	 }
	 System.out.println(count);
	 

	}

}

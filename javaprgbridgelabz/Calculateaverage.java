package javaprgbridgelabz;

public class Calculateaverage {

	public static void main(String[] args) {
		int[]ar= {10,11,13,14,16,18};
		int sum=0;
		int count=0;

		 for (int i=0;i<ar.length;i++)
		 {
			 if (i%2==0)
			 {
				sum+=ar[i];
				count++;
			 }
		 }
		 int avg=sum/count;	 
		 System.out.println(avg);

	}

}

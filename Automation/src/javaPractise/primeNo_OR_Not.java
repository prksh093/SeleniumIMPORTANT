package javaPractise;
import java.util.Scanner;
public class primeNo_OR_Not {

	public static void main(String[] args) {
		System.out.println("enter the number");
		Scanner sc=new Scanner ( System.in);
		int n=sc.nextInt();
		
		for(int i=1;i<n/2;i++)
		{
			int count=0;
			if(n%i==0) 
			{
				count=1;
				}
				if(count==0)
				{
					System.out.println("not a prime");
				}
				else 
				{
					System.out.println("is a prime");
				}
			}
		}

}
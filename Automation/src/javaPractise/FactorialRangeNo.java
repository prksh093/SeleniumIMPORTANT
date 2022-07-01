package javaPractise;
import java.util.Scanner;
public class FactorialRangeNo {

	static int fact (int n) {

		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println("enter the value");
		Scanner sc= new Scanner(System.in);
		int j=sc.nextInt();
		for(int i=1;i<=j;i++) {
			System.out.println(i+"--------->"+fact(i));
		}
	}
}



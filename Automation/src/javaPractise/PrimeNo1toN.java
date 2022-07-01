package javaPractise;
import java.util.Scanner;
public class PrimeNo1toN {

	public static void main(String[] args) {
System.out.println("enter the values");
Scanner sc= new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<n;i++) {
	boolean isPrime=true;
	for(int j=2;j<i;j++) {
		if(i%j==0) {
			isPrime=false;
			break;
		}
	}
	if(isPrime)
		System.out.println(i+" ");
}
	}

}

package javaPractise;

public class FirstMax_Without_BubbleSort {

	public static void main(String[] args) {
		int a[]= {50,80,72,65,54};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if (a[i]>max){
				max=a[i];
			}
		}
		System.out.println(max);
	}
}



//                         first minimum
/*class First_Minimum{
	public static void main(String[] args) {
		int a[]= {50,80,72,65,54};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}*/
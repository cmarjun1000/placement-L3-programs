package arjunsucks;
import java.util.*;
public class perfectno {
	static int[] factors(int n) {
		int[] arr=new int[100];
		int k=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				arr[k++]=i;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[100];
		ar=factors(n);
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		if(sum==n)
			System.out.println("yes, its a perfect number");
		else
			System.out.println("No, its not a perfect number");
	}

}
